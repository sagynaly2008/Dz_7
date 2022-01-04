package com.example.dz_7.ui.Frogments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dz_7.R;
import com.example.dz_7.databinding.FragmentHomeBinding;
import com.example.dz_7.model.Postor;
import com.example.dz_7.ui.adapter.PostAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private final ArrayList<Postor> list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
        initView();
        createList();
    }

    private ArrayList<Postor> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(new Postor(R.drawable.builder, "NEW HELLO"));
            list.add(new Postor(R.drawable.builder, "NEW HELLO"));
            list.add(new Postor(R.drawable.builder, "NEW HELLO"));
            list.add(new Postor(R.drawable.builder, "NEW HELLO"));
            list.add(new Postor(R.drawable.builder, "NEW HELLO"));
        }
        return list;
    }

    private void initView() {
        PostAdapter adapter = new PostAdapter();
        binding.recycler.setAdapter(adapter);
        adapter.setList(createList());
    }
}