package com.example.afinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class SavingsFragment extends Fragment {

    private EditText editTextAmount;
    private EditText editTextPiggyBankName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_savings, container, false);

        editTextAmount = view.findViewById(R.id.editTextAmount);
        editTextPiggyBankName = view.findViewById(R.id.editTextPiggyBankName);
        Button buttonAddToSavings = view.findViewById(R.id.buttonAddToSavings);

        buttonAddToSavings.setOnClickListener(v -> addToSavings());

        return view;
    }

    private void addToSavings() {
        String amountStr = editTextAmount.getText().toString();
        String piggyBankName = editTextPiggyBankName.getText().toString();

        if (amountStr.isEmpty() || piggyBankName.isEmpty()) {
            Toast.makeText(getActivity(), "Please enter amount and piggy bank name", Toast.LENGTH_SHORT).show();
            return;
        }

        double amount = Double.parseDouble(amountStr);

        Toast.makeText(getActivity(), "Saved " + amount + " in " + piggyBankName + "!", Toast.LENGTH_SHORT).show();

        editTextAmount.setText("");
        editTextPiggyBankName.setText("");
    }
}
