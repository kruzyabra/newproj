package com.example.kruzyabra.myapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kruzyabra.myapplication.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImportFragment extends Fragment {

    @BindView(R.id.textView) TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View source = inflater.inflate(R.layout.fragment_import, container, false);
        ButterKnife.bind(this, source);
        Random random = new Random(System.currentTimeMillis());
        mTextView.setText(String.valueOf(random.nextInt(100)));
        return source;
    }
}
