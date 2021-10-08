package com.example.android1_5rmk.ui.Fragments.ThirdFragment;

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
import com.example.android1_5rmk.databinding.FragmentThirdBinding;
import com.example.android1_5rmk.ui.Fragments.FourthFragment.FourthFragment;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    private String getData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() !=null){
           getData = getArguments().getString("fragment2");

//            Toast.makeText(requireContext(), getData, Toast.LENGTH_SHORT).show();


        }

        binding.btn3.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("fragment3", getData);
            FourthFragment fourthFragment = new FourthFragment();
            fourthFragment.setArguments(bundle);
            getFragmentManager().beginTransaction().replace(R.id.first_fragment, fourthFragment).commit();
        });

        }

}