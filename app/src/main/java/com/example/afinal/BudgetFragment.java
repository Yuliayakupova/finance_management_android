package com.example.afinal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BudgetFragment extends Fragment {

    private EditText editTextAmount;
    private EditText editTextDescription;
    private Button buttonAddExpense;
    private Button buttonAddIncome;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_budget, container, false);

        editTextAmount = view.findViewById(R.id.editTextAmount);
        editTextDescription = view.findViewById(R.id.editTextDescription);
        buttonAddExpense = view.findViewById(R.id.buttonAddExpense);
        buttonAddIncome = view.findViewById(R.id.buttonAddIncome);

        buttonAddExpense.setOnClickListener(v -> {
            String amount = editTextAmount.getText().toString();
            String description = editTextDescription.getText().toString();
            if (!amount.isEmpty() && !description.isEmpty()) {
                addTransaction(amount, description, "expense");
            } else {
                Toast.makeText(getActivity(), "Please enter amount and description", Toast.LENGTH_SHORT).show();
            }
        });

        buttonAddIncome.setOnClickListener(v -> {
            String amount = editTextAmount.getText().toString();
            String description = editTextDescription.getText().toString();
            if (!amount.isEmpty() && !description.isEmpty()) {
                addTransaction(amount, description, "income");
            } else {
                Toast.makeText(getActivity(), "Please enter amount and description", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    private void addTransaction(String amount, String description, String type) {
        String message = type.equals("expense") ? "Burned" : "Income";
        Toast.makeText(getActivity(), message + ": " + amount + " (" + description + ")", Toast.LENGTH_LONG).show();
        editTextAmount.setText("");
        editTextDescription.setText("");
    }
}
