package com.example.hw53mth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {
    private ArrayList<String> data;
    private ThirdAdapter adapter;
    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycle_view);
        adapter = new ThirdAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
        data.add("+996555789054");
    }
}