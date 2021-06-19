package com.example.litereasy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.litereasy.R;
import com.example.litereasy.databinding.ActivitySearchbookonclickBinding;

public class searchbookonclick extends AppCompatActivity {
ActivitySearchbookonclickBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySearchbookonclickBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       /* binding.booknameid.setText(getIntent().getStringExtra("bookname"));
        binding.bookauthoridd.setText(getIntent().getStringExtra("bookauthor"));
        binding.booksubjectidd.setText(getIntent().getStringExtra("booksubject"));
        binding.bookidd.setText(getIntent().getStringExtra("bookid"));
        binding.bookquantityidd.setText(getIntent().getStringExtra("bookquantity"));
        binding.bookdescriptionidd.setText(getIntent().getStringExtra("bookdescription"));
        String imagee=getIntent().getStringExtra("bookimage");
        Glide.with(getApplicationContext()).load(imagee).into(binding.bookimagesource);*/

    }
}