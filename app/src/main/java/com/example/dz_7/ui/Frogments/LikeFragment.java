package com.example.dz_7.ui.Frogments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz_7.R;
import com.example.dz_7.model.Postor;
import com.example.dz_7.ui.adapter.ActivityAdapter;

import java.util.ArrayList;


public class LikeFragment extends Fragment {

    private ActivityAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Postor> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_like, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        adapter = new ActivityAdapter();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        adapter.setList(createList());
    }

    private ArrayList<Postor> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(new Postor(R.drawable.builder, "@kamkom like your post", R.drawable.builder));
        }
        return list;
    }
}