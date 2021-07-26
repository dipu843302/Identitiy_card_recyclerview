package com.example.identitiy_card_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass>userList;

    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }




    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=userList.get(position).getImageView();
        String industry=userList.get(position).getTextView1();
        String age=userList.get(position).getTextView2();
        String profession=userList.get(position).getTextView3();
        holder.setData(resource,industry,age,profession);
    }
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
      private ImageView imageView;
      private TextView textView1;
      private TextView textView2;
      private TextView textView3;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imagview);
            textView1=itemView.findViewById(R.id.tv1);
            textView2=itemView.findViewById(R.id.tv3);
            textView3=itemView.findViewById(R.id.tv5);
        }
        public  void setData(int resource,String industry,String age,String profession){
            imageView.setImageResource(resource);
            textView1.setText(industry);
            textView2.setText(age);
            textView3.setText(profession);
        } 
    }
}
