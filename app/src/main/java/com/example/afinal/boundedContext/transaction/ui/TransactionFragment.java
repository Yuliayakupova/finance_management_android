package com.example.afinal.boundedContext.transaction.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.afinal.R;
import com.example.afinal.boundedContext.transaction.api.TransactionApiService;
import com.example.afinal.boundedContext.transaction.request.CreateTransactionRequest;
import com.example.afinal.sharedContext.api.ApiClient;

import java.math.BigDecimal;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TransactionFragment extends Fragment {

    /*private EditText editTextAmount, editTextDescription, editTextCategory;
    private Button addButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);

        editTextAmount = view.findViewById(R.id.editTextAmount);
        editTextDescription = view.findViewById(R.id.editTextDescription);
        editTextCategory = view.findViewById(R.id.editTextCategory);

        addButton = view.findViewById(R.id.buttonAddTransaction);

        addButton.setOnClickListener(v -> createTransaction());

        return view;
    }

    private void createTransaction() {
        String amount = editTextAmount.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();
        String category = editTextCategory.getText().toString().trim();

        if (amount.isEmpty() || description.isEmpty() || category.isEmpty()) {
            Toast.makeText(getActivity(), "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        CreateTransactionRequest request = new CreateTransactionRequest(
                new BigDecimal(amount),
                description,
                "2025-05-12",  // Пример, можно заменить на текущее время
                1,  // Пример moneyboxId
                Integer.parseInt(category)
        );

        TransactionApiService apiService = ApiClient.getClient().create(TransactionApiService.class);
        Call<Void> call = apiService.createTransaction(request);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getActivity(), "Transaction created", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Failed to create transaction", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(getActivity(), "Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }*/
}
