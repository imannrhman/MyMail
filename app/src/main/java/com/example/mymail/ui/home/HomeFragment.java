package com.example.mymail.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymail.Email;
import com.example.mymail.EmailAdapter;
import com.example.mymail.EmailData;
import com.example.mymail.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvEmail;
    private ArrayList<Email> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvEmail = view.findViewById(R.id.rv_email);
        rvEmail.setHasFixedSize(true);
        Log.d("sdssds",String.valueOf(list.size()));
        list.addAll(EmailData.getListEmail());

        showRecyclerList();

    }

    private void showRecyclerList() {
        EmailAdapter emailAdapter = new EmailAdapter(list);
        rvEmail.setAdapter(emailAdapter);
        rvEmail.setLayoutManager(new LinearLayoutManager(getContext()));


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}