package com.example.afinal.boundedContext.budget.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.afinal.R;
import com.example.afinal.boundedContext.budget.api.BudgetApiService;
import com.example.afinal.boundedContext.budget.dto.Budget;
import com.example.afinal.sharedContext.api.ApiClient;
import com.github.mikephil.charting.charts.PieChart;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BudgetFragment extends Fragment {

    private PieChart pieChart;
    private TextView balanceTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_budget, container, false);
        balanceTextView = view.findViewById(R.id.text_balance);

        loadBudget();
        return view;
    }

    private void loadBudget() {

        BudgetApiService apiService = ApiClient.getClient(requireContext()).create(BudgetApiService.class);

        apiService.getUserBudget().enqueue(new Callback<Budget>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Budget> call, Response<Budget> response) {
                if (response.isSuccessful() && response.body() != null) {
                    balanceTextView.setText("Balance: " + response.body().getTotalBalance().toPlainString());
                } else {
                    Log.e("BudgetFragment", "Error: " + response.message());
                    Toast.makeText(getContext(), "Failed to load budget", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Budget> call, Throwable t) {
                Toast.makeText(getContext(), "Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
