package com.example.a1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<Players> playersArrayList;
    MyAdapter(Context context, ArrayList<Players> playersArrayList) {
        this.context = context;
        this.playersArrayList = playersArrayList;
    }

    @Override
    public int getCount() {
        return playersArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return playersArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflated layout for each list item
        if(convertView==null)
        {
            convertView=LayoutInflater.from(context).inflate(R.layout.list_layout_view,parent,false);
        }
        //get the current item to be displayed
        Players currentPlayer=(Players)getItem(position);
        //finding and instatiating the text views and textview
        TextView playerName=convertView.findViewById(R.id.player_name);
        TextView playerScore=convertView.findViewById(R.id.player_score);
        TextView ballsPlayed=convertView.findViewById(R.id.balls_played);
        //set the data of the players to the textviews
        playerName.setText(currentPlayer.getPlayerName());
        playerScore.setText(currentPlayer.getScore());
        ballsPlayed.setText(currentPlayer.getBallsPlayed());
        return convertView;
    }
}
