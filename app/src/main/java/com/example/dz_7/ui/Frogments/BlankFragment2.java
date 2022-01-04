package com.example.dz_7.ui.Frogments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dz_7.R;
import com.example.dz_7.databinding.FragmentBlank2Binding;
import com.example.dz_7.ui.adapter.AdapterJust;

import java.util.ArrayList;

public class BlankFragment2 extends Fragment {

    private FragmentBlank2Binding binding;
    private final ArrayList<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlank2Binding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        AdapterJust adapterJust = new AdapterJust();
        binding.recycler12.setAdapter(adapterJust);
        adapterJust.setList(createList());

    }

    private ArrayList<Integer> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(R.drawable.builder);
        }
        return list;
    }
}