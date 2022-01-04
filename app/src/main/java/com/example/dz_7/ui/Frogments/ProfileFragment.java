package com.example.dz_7.ui.Frogments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dz_7.R;
import com.example.dz_7.databinding.FragmentProfileBinding;
import com.example.dz_7.ui.adapter.AdapterViewPager;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    private final int[] icon = {R.drawable.ic_grid, R.drawable.ic_baseline_account};
    private AdapterViewPager adapter;
    private ArrayList<Fragment> list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewPager();
        initTab();
    }

    private void initViewPager() {
        adapter = new AdapterViewPager(this);
        list.add(new BlankFragment1());
        list.add(new BlankFragment2());
        adapter.setList(list);
        binding.viewPager.setAdapter(adapter);
    }

    private void initTab() {
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position) -> {
            tab.setIcon(icon[position]);
        }).attach();
    }
}