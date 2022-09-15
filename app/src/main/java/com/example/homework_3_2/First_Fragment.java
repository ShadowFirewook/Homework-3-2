package com.example.homework_3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class First_Fragment extends Fragment {

    public Button buttonBig;
    public Button buttonSmall;
    public TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    Button buttonBig = view.findViewById(R.id.buttonBig);
    Button buttonSmall = view.findViewById(R.id.buttonSmall);
    TextView textView = view.findViewById(R.id.text);

    buttonBig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int digit = 1;
            int digit2 = Integer.parseInt(textView.getText().toString());

            Integer sum = digit + digit2;
            textView.setText(sum.toString());
        }
    });
    buttonSmall.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int digit = 1;
            int digit2 = Integer.parseInt(textView.getText().toString());

            Integer sum = digit2 - digit;
            textView.setText(sum.toString());
        }
    });

    }package com.example.homework_3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class First_Fragment extends Fragment {

    public Button buttonBig;
    public Button buttonSmall;
    public TextView textView;
    public Integer counter;
    public Integer digit;
    public Integer sum;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    Button buttonBig = view.findViewById(R.id.buttonBig);
    Button buttonSmall = view.findViewById(R.id.buttonSmall);
    TextView textView = view.findViewById(R.id.text);

    buttonBig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            digit = 1;
            counter = Integer.parseInt(textView.getText().toString());

            sum = digit + counter;
            textView.setText(sum.toString());
        }
    });
    buttonSmall.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            digit = 1;
            counter = Integer.parseInt(textView.getText().toString());

            sum = counter - digit;
            textView.setText(sum.toString());
        }
    });

    }
}
