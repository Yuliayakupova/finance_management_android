package com.example.afinal.boundedContext.budget.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.afinal.ChatFragment;
import com.example.afinal.R;
import com.example.afinal.SavingsFragment;
import com.example.afinal.boundedContext.limit.ui.LimitFragment;
import com.example.afinal.boundedContext.transaction.ui.TransactionActivity;
import com.example.afinal.boundedContext.transaction.ui.TransactionFragment;
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

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.nav_budget, new BudgetFragment());
        fragmentMap.put(R.id.nav_transaction, new TransactionFragment());
        fragmentMap.put(R.id.nav_chat, new ChatFragment());
        fragmentMap.put(R.id.nav_moneybox, new SavingsFragment());
        fragmentMap.put(R.id.nav_limit, new LimitFragment());
        if (savedInstanceState == null) {
            bottomNav.setSelectedItemId(R.id.nav_budget);
        }

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

        findViewById(R.id.fab_add_transaction).setOnClickListener(v -> {
            startActivity(new Intent(this, TransactionActivity.class));
        });
    }
}
