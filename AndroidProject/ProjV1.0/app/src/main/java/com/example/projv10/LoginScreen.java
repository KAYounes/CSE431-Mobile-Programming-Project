package com.example.projv10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projv10.databinding.FragmentLoginScreenBinding;

public class LoginScreen extends Fragment {
    FragmentLoginScreenBinding binder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binder = FragmentLoginScreenBinding.inflate(inflater, container, false);
        View view = binder.getRoot();
        System.out.println("FRAGMENT LOGIN       > " + Integer.toString(binder.tvPassword.getInputType()));
        binder.btnToggleShowPassword.setOnClickListener(view1 -> {
            System.out.println(Integer.toString(binder.tvPassword.getInputType()));
            int cursor_position = binder.tvPassword.getSelectionStart();

            if(binder.tvPassword.getInputType() == (InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT)){
                binder.tvPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                binder.btnToggleShowPassword.setImageDrawable(getResources().getDrawable(R.drawable.eye_slash));
            }else{
                binder.tvPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                binder.btnToggleShowPassword.setImageDrawable(getResources().getDrawable(R.drawable.eye));
                binder.tvPassword.setSelection(binder.tvPassword.getText().length());
            }

            binder.tvPassword.setSelection(cursor_position);
//                binder.tvPassword.setInputType(InputType.TYPE_CLASS_TEXT);
        });
        return view;//inflater.inflate(R.layout.fragment_login_screen, container, false);
    }
}