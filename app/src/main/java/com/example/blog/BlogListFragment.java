package com.example.blog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blog.adapter.BlogListAdapter;
import com.example.blog.databinding.FragmentBlogListBinding;


public class BlogListFragment extends Fragment {

    private FragmentBlogListBinding binding;
    private BlogListAdapter adapter;

    public BlogListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlogListBinding.inflate(inflater, container, false);
        initRecyclerView();
        return binding.getRoot();
    }



    private void initRecyclerView() {

        adapter = new BlogListAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        binding.blogListRecyclerView.setAdapter(adapter);
        binding.blogListRecyclerView.setLayoutManager(linearLayoutManager);
        binding.blogListRecyclerView.hasFixedSize();
        binding.blogListRecyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });
    }

    private void requestList() {

    }


}