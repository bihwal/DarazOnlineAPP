package com.example.darazonlineapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darazonlineapp.R;

import java.util.ArrayList;

import com.example.darazonlineapp.models.ProductsAdapter;
import com.example.darazonlineapp.models.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    View view;
    private RecyclerView recyclerView;
    public List<Products> productsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the bottom_nav_menu for this fragment
       // return inflater.inflate(R.bottom_nav_menu.fragment_cart, container, false);

        view = inflater.inflate(R.layout.fragment_home, container, false);

        productsList=new ArrayList<>();
        //productsList.add(new Products("Ram","5000",R.drawable.ram));
        //productsList.add(new Products("Speaker","5000",R.drawable.ram));
        //productsList.add(new Products("Speaker","5000",R.drawable.ram));
        //productsList.add(new Products("Speaker","5000",R.drawable.ram));

        recyclerView=view.findViewById(R.id.recyclerView);

        ProductsAdapter productsAdapter=new ProductsAdapter(getContext(),productsList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(productsAdapter);

        return view;

    }

}
