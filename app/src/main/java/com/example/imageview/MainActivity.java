package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.imageview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBunny.setOnClickListener(v -> binding.imgAnimal.setImageResource(R.drawable.bunny));
        binding.btnCat.setOnClickListener(v -> binding.imgAnimal.setImageResource(R.drawable.cat));
        binding.btnDog.setOnClickListener(v -> binding.imgAnimal.setImageResource(R.drawable.dog));
    }
}