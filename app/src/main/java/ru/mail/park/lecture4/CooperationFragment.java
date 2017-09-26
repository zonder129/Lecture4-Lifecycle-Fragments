package ru.mail.park.lecture4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CooperationFragment extends BaseFragment {

    private CooperationListener cooperationListener;
    private String cooperationText;

    public void setCooperationText(String cooperationText) {
        this.cooperationText = cooperationText;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        cooperationListener = (CooperationListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cooperation, container, false);
        view.findViewById(R.id.btn_do_it).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cooperationListener.onCooperation(cooperationText);
            }
        });
        return view;
    }

    public interface CooperationListener {
        void onCooperation(String cooperationText);
    }
}
