package com.example.lesson6.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson6.databinding.ActivityMainBinding;
import com.example.lesson6.ui.activity.second.SecondActivity;
import com.example.lesson6.ui.adapter.GameAdapter;
import com.example.lesson6.ui.data.GameClient;
import com.example.lesson6.ui.data.GameModel;
import com.example.lesson6.ui.interfaces.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    GameAdapter gameAdapter;
    ArrayList<GameModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        listeners();
    }


    private void initialization() {
        list = (ArrayList<GameModel>) GameClient.getGameList();
        gameAdapter = new GameAdapter(list);
        binding.recyclerView.setAdapter(gameAdapter);

    }

    private void listeners() {
        gameAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(GameModel gameModel) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key1", gameModel.getQuiz());
                intent.putExtra("key2", gameModel.getAnswerOne());
                intent.putExtra("key3 ", gameModel.getAnswerTwo());
                intent.putExtra("key4", gameModel.getAnswerThree());
                intent.putExtra("key5", gameModel.getCorrectAnswer());
                startActivity(intent);


            }
        });
    }
}