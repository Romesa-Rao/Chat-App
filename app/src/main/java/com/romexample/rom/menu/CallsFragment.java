package com.romexample.rom.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.romexample.rom.R;
import com.romexample.rom.adapter.CallListAdapter;
import com.romexample.rom.adapter.ChatListAdapter;
import com.romexample.rom.model.CallList;
import com.romexample.rom.model.Chatlist;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
**/
public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_calls, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<CallList> lists = new ArrayList<>();
        //recyclerView.setAdapter(new CallListAdapter(lists,getContext()));
        return view;
    }
}
