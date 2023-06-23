package com.example.h_m_2_abai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AbaiFragment extends Fragment {


    private TextView num;
    private Button pos;
    private Button neg;
    private int velue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abai, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InitView();
        InitListener();
    }

    private void InitView() {
        num=requireActivity().findViewById(R.id.tv_num);
        pos=requireActivity().findViewById(R.id.positiv);
        neg=requireActivity().findViewById(R.id.negativ);
    }
    private void InitListener() {
        pos.setOnClickListener(view -> {

            velue++;
            num.setText(String.valueOf(velue));

        });
        neg.setOnClickListener(view -> {
            velue--;
            num.setText(String.valueOf(velue));
        });
    }

}