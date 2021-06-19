package com.example.recycleview;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public  Adapter (List<ModelClass>userList)
    {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
         int img= userList.get(position).getImageview1();
         String name = userList.get(position).getTextview1();
         String line = userList.get(position).getDivider();
         holder.setData(img,name,line);


    }

    @Override
    public int getItemCount() {
        return  userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageview1;
        private TextView textview1;
        private  TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview1 = itemView.findViewById(R.id.imageview1);
            textview1 = itemView.findViewById(R.id.textview1);
            divider = itemView.findViewById(R.id.divider);

        }

        public void setData(int img, String name, String line) {
            imageview1.setImageResource(img);
            textview1.setText(name);
            divider.setText(line);
        }
    }
}
