package ru.mail.park.lecture4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CooperationActivity extends AppCompatActivity implements CooperationFragment.CooperationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooperation);

        CooperationFragment fragment = (CooperationFragment) getSupportFragmentManager().findFragmentById(R.id.cooperation);
        fragment.setCooperationText("Hello, cooperation!");
    }

    @Override
    public void onCooperation(String cooperationText) {
        Toast.makeText(CooperationActivity.this, "Coo coo! " + cooperationText
                , Toast.LENGTH_SHORT).show();
    }
}
