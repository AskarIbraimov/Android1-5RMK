package com.example.android1_5rmk.ui.Fragments.Fiveth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android1_5rmk.R;
import com.example.android1_5rmk.databinding.FragmentFirstBinding;
import com.example.android1_5rmk.databinding.FragmentFivethBinding;

public class FivethFragment extends Fragment {

    private FragmentFivethBinding binding;
    private String string;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFivethBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.btn5.setOnClickListener(v -> {

            if (getArguments() !=null){
                string = getArguments().getString("fragment4");

                Toast.makeText(requireContext(), string, Toast.LENGTH_SHORT).show();
            }
                binding.etResult.setText(string);

            });
    }
}

