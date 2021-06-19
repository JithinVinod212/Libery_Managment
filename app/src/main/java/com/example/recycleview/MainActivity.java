package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iniData();
        initRecyclerView();


    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void iniData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.ace,"HI Luffy","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.doom,"HI Zombies","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.ace,"HI Luffy","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.doom,"HI Luffy","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.ace,"HI Luffy","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.doom,"HI Luffy","________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.doom,"HI ,Iam gone to extermanitey","_____________________________________________________"));
        userList.add(new ModelClass(R.drawable.ace,"HI Luffy","________________________________________________________________________"));
    }
}