package ru.mail.park.lecture4;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class StateLossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_loss);

        findViewById(R.id.btn_do_it).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doIt(false);
            }
        });

        findViewById(R.id.btn_do_it_allowing_loss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doIt(true);
            }
        });
    }

    private void doIt(final boolean allowLoss) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.v("STATE_LOSS", "Performing fragment transaction");
                FragmentTransaction transaction = getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new RedFragment());
                if (allowLoss) {
                    transaction.commitAllowingStateLoss();
                } else {
                    transaction.commit();
                }
            }
        }, 3000);
    }
}
