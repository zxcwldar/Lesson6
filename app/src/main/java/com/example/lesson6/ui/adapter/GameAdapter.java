package com.example.lesson6.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson6.databinding.ListHolderBinding;
import com.example.lesson6.ui.data.GameModel;
import com.example.lesson6.ui.interfaces.OnItemClickListener;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
    ArrayList <GameModel> list = new ArrayList<>();
    OnItemClickListener onItemClickListener ;

    public void setList(ArrayList<GameModel> list) {
        this.list = list;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public GameAdapter(ArrayList<GameModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public GameAdapter.GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new GameHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()),parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.GameHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        ListHolderBinding binding;
        public GameHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(GameModel gameModel) {
            binding.tvTitle.setText(gameModel.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(gameModel);

                }
            });
        }

    }
}
