package com.example.afinal;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

public class ChatFragment extends Fragment {

    private EditText userInput;
    private TextView chatHistory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        userInput = view.findViewById(R.id.user_input);
        chatHistory = view.findViewById(R.id.chat_history);
        Button sendButton = view.findViewById(R.id.send_button);


        return view;
    }
}
