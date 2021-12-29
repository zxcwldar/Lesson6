package com.example.lesson6.ui.activity.second;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import com.example.lesson6.databinding.ActivityMainBinding;
import com.example.lesson6.databinding.ActivitySecondBinding;
import com.example.lesson6.ui.adapter.GameAdapter;
import com.example.lesson6.ui.data.GameClient;
import com.example.lesson6.ui.data.GameModel;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    ArrayList<GameModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getData();
    }


    private void getData() {
        Intent arguments = getIntent();
        String quiz = arguments.getStringExtra("key1");
        binding.tvText.setText(quiz);
        String answerOne = arguments.getStringExtra("key2");
        binding.btnOne.setText(answerOne);
        String answerTwo = arguments.getStringExtra("key3");
        binding.btnTwo.setText(answerTwo);
        String answerTree = arguments.getStringExtra("key4");
        binding.btnThree.setText(answerTree);
        String answerFour = arguments.getStringExtra("key5");
        binding.btnFour.setText(answerFour);
        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arguments.getStringExtra("key1") == arguments.getStringExtra("key2")) {
                    Toast.makeText(SecondActivity.this, "  правильно", Toast.LENGTH_SHORT).show();
                }
                binding.btnTwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (arguments.getStringExtra("key1") == arguments.getStringExtra("key3")) {
                            Toast.makeText(SecondActivity.this, " правильно", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(SecondActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                        }
                        binding.btnThree.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (arguments.getStringExtra("key1") == arguments.getStringExtra("key4")) {
                                    Toast.makeText(SecondActivity.this, " правильно", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(SecondActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                                }
                                binding.btnFour.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (arguments.getStringExtra("key1") == arguments.getStringExtra("key5")) {
                                            Toast.makeText(SecondActivity.this, " правильно", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(SecondActivity.this, " правильно", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }

                        });
                    }

                });

            }


        });
    }
}







