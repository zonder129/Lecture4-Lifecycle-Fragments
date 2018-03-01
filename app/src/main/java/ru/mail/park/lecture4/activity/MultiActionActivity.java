package ru.mail.park.lecture4.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ru.mail.park.lecture4.R;
import ru.mail.park.lecture4.fragment.GreenFragment;
import ru.mail.park.lecture4.fragment.RedFragment;

public class MultiActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_action);

        toggleState();

        findViewById(R.id.btn_switch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleState();
            }
        });
    }

    private void toggleState() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment top = getSupportFragmentManager().findFragmentById(R.id.top_container);
        Fragment bottom = getSupportFragmentManager().findFragmentById(R.id.bottom_container);

        if (top != null && top.isAdded()) {
            transaction.remove(top);
            transaction.add(R.id.bottom_container, new GreenFragment());
        } else if (bottom != null && bottom.isAdded()) {
            transaction.remove(bottom);
            transaction.add(R.id.top_container, new RedFragment());
        } else {
            transaction.add(R.id.top_container, new RedFragment());
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }
}
