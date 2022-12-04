package com.example.projv10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projv10.databinding.FragmentAppBarBinding;
import com.example.projv10.databinding.FragmentSplashScreenBinding;


public class AppBar extends Fragment {

    FragmentAppBarBinding binder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binder = FragmentAppBarBinding.inflate(inflater, container, false);
        View view = binder.getRoot();
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.palette_primary));

        return view; // inflater.inflate(R.layout.fragment_splash_screen, container, false);inflater.inflate(R.layout.fragment_app_bar, container, false);
    }
}