package ru.mail.park.lecture4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.v(getLogTag(), "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(getLogTag(), "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.v(getLogTag(), "onCreateView");
        return null;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(getLogTag(), "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(getLogTag(), "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(getLogTag(), "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(getLogTag(), "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(getLogTag(), "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v(getLogTag(), "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(getLogTag(), "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v(getLogTag(), "onDetach");
    }

    private String getLogTag() {
        return getClass().getSimpleName();
    }
}
