package com.example.darazonlineapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.darazonlineapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    EditText etPhone,etSMS;
    Button btnSend,btnLogin;


    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the bottom_nav_menu for this fragment
        View view= inflater.inflate(R.layout.fragment_account, container, false);

        etPhone=view.findViewById(R.id.etPhone);
        etSMS=view.findViewById(R.id.etSMS);
        btnSend=view.findViewById(R.id.btnSend);
        btnLogin=view.findViewById(R.id.btnLogin);

        return view;
    }

}
