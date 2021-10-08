package com.example.android1_5rmk.ui.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1_5rmk.R;
import com.example.android1_5rmk.databinding.ActivityMainBinding;
import com.example.android1_5rmk.ui.Fragments.FirstFragment.FirstFragment;
import com.example.android1_5rmk.ui.Fragments.SecondFragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initFragment();
    }

    private void initFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.first_fragment,new FirstFragment()).commit();
    }
}