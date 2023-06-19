package com.example.acara18_fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragment extends Fragment {

    View view;
    Button firstButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        //get the refgerence of button
        firstButton = view.findViewById(R.id.secondButton);
        //perform setOnclick on secondButton
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ///display a message by using a toast
                Toast.makeText(getActivity(), "Second fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}