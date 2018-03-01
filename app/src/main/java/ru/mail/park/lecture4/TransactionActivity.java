package ru.mail.park.lecture4;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class TransactionActivity extends AppCompatActivity {

    private CheckBox backStackCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        backStackCheckbox = findViewById(R.id.checkbox);

        findViewById(R.id.btn_add_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment();
            }
        });

        findViewById(R.id.btn_remove_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeFragment();
            }
        });
    }

    private void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        RedFragment red = (RedFragment) fragmentManager.findFragmentById(R.id.red_container);
        GreenFragment green = (GreenFragment) fragmentManager.findFragmentById(R.id.green_container);
        BlueFragment blue = (BlueFragment) fragmentManager.findFragmentById(R.id.blue_container);

        if (red == null) {
            transaction.replace(R.id.red_container, new RedFragment());
        } else if (green == null) {
            transaction.replace(R.id.green_container, new GreenFragment());
        } else if (blue == null) {
            transaction.replace(R.id.blue_container, new BlueFragment());
        }

        if (backStackCheckbox.isChecked()) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    private void removeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        RedFragment red = (RedFragment) fragmentManager.findFragmentById(R.id.red_container);
        GreenFragment green = (GreenFragment) fragmentManager.findFragmentById(R.id.green_container);
        BlueFragment blue = (BlueFragment) fragmentManager.findFragmentById(R.id.blue_container);

        if (blue != null && blue.isAdded()) {
            transaction.remove(blue);
        } else if (green != null && green.isAdded()) {
            transaction.remove(green);
        } else if (red != null && red.isAdded()) {
            transaction.remove(red);
        }

        if (backStackCheckbox.isChecked()) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }
}
