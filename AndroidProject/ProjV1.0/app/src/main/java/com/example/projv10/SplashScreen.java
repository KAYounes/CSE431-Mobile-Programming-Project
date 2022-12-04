package com.example.projv10;

import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.projv10.databinding.FragmentSplashScreenBinding;

public class SplashScreen extends Fragment {

    private FragmentSplashScreenBinding binder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binder = FragmentSplashScreenBinding.inflate(inflater, container, false);
        View view = binder.getRoot();
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.palette_primary));

        return view; // inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binder = null;
    }
}