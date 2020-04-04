package com.williamsirsal.bottomnavigationview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageUrls.add("https://www.nps.gov/grca/planyourvisit/images/hav-falls8368-275x_2.jpg");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-w/10/f8/b5/71/more-modern-buildings.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-w/0d/eb/27/ae/photo4jpg.jpg");
        mNames.add("Sendai");

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-m/1280/01/25/22/c8/the-dart-valley-near.jpg");
        mNames.add("Queenstown");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_home_fragment);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), mNames, mImageUrls);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
