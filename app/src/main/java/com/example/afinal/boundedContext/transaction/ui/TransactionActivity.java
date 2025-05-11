package com.example.afinal.boundedContext.transaction.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.afinal.R;
import com.example.afinal.boundedContext.transaction.api.TransactionApiService;
import com.example.afinal.boundedContext.transaction.request.CreateTransactionRequest;
import com.example.afinal.boundedContext.transaction.request.UpdateTransactionRequest;
import com.example.afinal.sharedContext.api.ApiClient;
import com.example.afinal.boundedContext.transaction.dto.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TransactionActivity extends AppCompatActivity {

   /* private EditText editTextAmount, editTextDescription, editTextCategory;
    private Button addButton, updateButton, deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        editTextAmount = findViewById(R.id.editTextAmount);
        editTextDescription = findViewById(R.id.editTextDescription);
        editTextCategory = findViewById(R.id.editTextCategory);

        addButton = findViewById(R.id.buttonAddTransaction);
        updateButton = findViewById(R.id.buttonUpdateTransaction);
        deleteButton = findViewById(R.id.buttonDeleteTransaction);

        addButton.setOnClickListener(v -> createTransaction());
        updateButton.setOnClickListener(v -> updateTransaction(1));  // Пример для обновления транзакции с id = 1
        deleteButton.setOnClickListener(v -> deleteTransaction(1));  // Пример для удаления транзакции с id = 1
    }

    private void createTransaction() {
        String amount = editTextAmount.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();
        String category = editTextCategory.getText().toString().trim();

        if (amount.isEmpty() || description.isEmpty() || category.isEmpty()) {
            Toast.makeText(TransactionActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        CreateTransactionRequest request = new CreateTransactionRequest(
                new BigDecimal(amount),
                description,
                Integer.parseInt(category)
        );

        TransactionApiService apiService = ApiClient.getClient().create(TransactionApiService.class);
        Call<Void> call = apiService.createTransaction(request);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(TransactionActivity.this, "Transaction created", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TransactionActivity.this, "Failed to create transaction", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(TransactionActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void updateTransaction(int transactionId) {
        String amount = editTextAmount.getText().toString().trim();
        String description = editTextDescription.getText().toString().trim();
        String category = editTextCategory.getText().toString().trim();

        if (amount.isEmpty() || description.isEmpty() || category.isEmpty()) {
            Toast.makeText(TransactionActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        UpdateTransactionRequest request = new UpdateTransactionRequest(
                new BigDecimal(amount),
                description,
                LocalDateTime.now(),
                category
        );

        TransactionApiService apiService = ApiClient.getClient().create(TransactionApiService.class);
        Call<Void> call = apiService.updateTransaction(transactionId, request);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(TransactionActivity.this, "Transaction updated", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TransactionActivity.this, "Failed to update transaction", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(TransactionActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void deleteTransaction(int transactionId) {
        TransactionApiService apiService = ApiClient.getClient().create(TransactionApiService.class);
        Call<Void> call = apiService.deleteTransaction(transactionId);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(TransactionActivity.this, "Transaction deleted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TransactionActivity.this, "Failed to delete transaction", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(TransactionActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }*/
}