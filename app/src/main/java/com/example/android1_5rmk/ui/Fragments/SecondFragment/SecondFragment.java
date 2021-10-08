package com.example.android1_5rmk.ui.Fragments.SecondFragment;

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
import com.example.android1_5rmk.databinding.FragmentSecondBinding;
import com.example.android1_5rmk.ui.Fragments.ThirdFragment.ThirdFragment;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private String getData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            getData = getArguments().getString("fragment1");

//            Toast.makeText(requireContext(), getData, Toast.LENGTH_SHORT).show();
        }

        binding.btn2.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString("fragment2", getData);
            ThirdFragment thirdFragment = new ThirdFragment();
            thirdFragment.setArguments(bundle);
//            getChildFragmentManager().beginTransaction().replace(R.id.first_fragment, thirdFragment).commit();
            getFragmentManager().beginTransaction().replace(R.id.first_fragment,thirdFragment).commit();
        });
    }
}