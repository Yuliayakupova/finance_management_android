package com.example.afinal.boundedContext.dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.afinal.AccountFragment;
import com.example.afinal.BudgetFragment;
import com.example.afinal.ChatFragment;
import com.example.afinal.R;
import com.example.afinal.SavingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.HashMap;
import java.util.Map;

public class DashboardActivity extends AppCompatActivity {

    private Map<Integer, Fragment> fragmentMap;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        String userName = getIntent().getStringExtra("USER_NAME");
        TextView usernameTextView = findViewById(R.id.username_text_view);
        usernameTextView.setText("Welcome, " + userName + "!");

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.nav_budget, new BudgetFragment());
        //fragmentMap.put(R.id.nav_transaction, new TransactionFragment());
        fragmentMap.put(R.id.nav_chat, new ChatFragment());
        fragmentMap.put(R.id.nav_piggy_bank, new SavingsFragment());
        //fragmentMap.put(R.id.nav_limit, new LimitFragment());


        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = fragmentMap.get(item.getItemId());
            if (selectedFragment != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, selectedFragment)
                        .commit();
            }
            return true;
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new AccountFragment())
                    .commit();
        }
    }
}
