package ru.mail.park.lecture4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ru.mail.park.lecture4.R;
import ru.mail.park.lecture4.cooperation.CooperationActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_second_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        findViewById(R.id.btn_layout_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LayoutFragmentActivity.class));
            }
        });

        findViewById(R.id.btn_transactions).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TransactionActivity.class));
            }
        });

        findViewById(R.id.btn_multi_action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MultiActionActivity.class));
            }
        });

        findViewById(R.id.btn_state_loss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, StateLossActivity.class));
            }
        });

        findViewById(R.id.btn_cooperation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CooperationActivity.class));
            }
        });
    }
}
