package com.example.android1_5rmk.ui.Fragments.FirstFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android1_5rmk.R;
import com.example.android1_5rmk.databinding.FragmentFirstBinding;
import com.example.android1_5rmk.ui.Fragments.SecondFragment.SecondFragment;


public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btn1.setOnClickListener(view1 -> {
            if (!binding.etText.getText().toString().equals("")) {
                Bundle bundle = new Bundle();
                bundle.putString("fragment1", binding.etText.getText().toString());
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
//            new SecondFragment().setArguments(bundle);
//            getChildFragmentManager().beginTransaction().replace(R.id.first_fragment, new SecondFragment().setArguments(bundle)).commit();
                getFragmentManager().beginTransaction().replace(R.id.first_fragment, secondFragment).commit();
            } else {
                Toast.makeText(requireContext(), "enter field!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}