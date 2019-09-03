package com.example.mymail;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.pavlospt.roundedletterview.RoundedLetterView;

import java.util.ArrayList;

public class EmailAdapter  extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {


    public  EmailAdapter(ArrayList<Email> list){this.listEmail =list;}

    private ArrayList<Email> listEmail;
    boolean sudahDiclik = true;



    @NonNull
    @Override
    public EmailAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_email,parent,false);

        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final EmailAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(listEmail.get(position).getName());
        holder.tvTitle.setText(listEmail.get(position).getTitle());
        holder.tvDesk.setText(listEmail.get(position).getDesk());
        holder.tvTime.setText(listEmail.get(position).getTime());
        holder.imgView.setTitleText(listEmail.get(position).getNameUpperCase());
        holder.imgView.setBackgroundColor(Color.parseColor(listEmail.get(position).getColor()));


        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sudahDiclik){
                    holder.btnFavorite.setBackgroundResource(R.drawable.ic_star_black_24dp);
                    sudahDiclik = false;
                }else{
                    holder.btnFavorite.setBackgroundResource(R.drawable.ic_star_border_black_24dp);
                    sudahDiclik = true;
                }
                 }
        });
    }

    @Override
    public int getItemCount() {
        Log.d("sdsd",String.valueOf(listEmail.size()));
        return listEmail.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvTitle,tvDesk,tvTime;
        RoundedLetterView imgView;
        ImageButton btnFavorite;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDesk = itemView.findViewById(R.id.tv_item_desk);
            tvTime = itemView.findViewById(R.id.tv_item_time);
            imgView = itemView.findViewById(R.id.img_view);
            btnFavorite = itemView.findViewById(R.id.btn_fav);
        }
    }
}
