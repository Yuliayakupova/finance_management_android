package com.example.afinal;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AccountFragment extends Fragment {

    private TextView selectedDatesText;
    private String startDate = "Not selected";
    private String endDate = "Not selected";
    private Long userId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        selectedDatesText = view.findViewById(R.id.selected_dates_text);
        Button buttonSelectStartDate = view.findViewById(R.id.button_select_start_date);
        Button buttonSelectEndDate = view.findViewById(R.id.button_select_end_date);
        Button buttonGetTransactions = view.findViewById(R.id.button_get_transactions);

        userId = getArguments() != null ? getArguments().getLong("USER_ID") : null;

        buttonSelectStartDate.setOnClickListener(v -> showDatePickerDialog(true));
        buttonSelectEndDate.setOnClickListener(v -> showDatePickerDialog(false));



        return view;
    }

    private void showDatePickerDialog(boolean isStartDate) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        @SuppressLint("SetTextI18n") DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext(),
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;

                    if (isStartDate) {
                        startDate = selectedDate;
                        selectedDatesText.setText(startDate + (endDate != null ? " - " + endDate : ""));
                    } else {
                        if (startDate != null) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                            try {
                                Date start = sdf.parse(startDate);
                                Date end = sdf.parse(selectedDate);

                                assert end != null;
                                if (end.before(start)) {
                                    Toast.makeText(requireContext(), "End date must be after start date!", Toast.LENGTH_SHORT).show();
                                    return;
                                }
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                        endDate = selectedDate;
                        selectedDatesText.setText(startDate + " - " + endDate);
                    }
                }, year, month, day);

        datePickerDialog.setTitle(isStartDate ? "Choose your start date!" : "Choose your end date!");
        datePickerDialog.show();
    }






}
