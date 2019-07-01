package com.example.a1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //define variable that would refer o our views
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14;
    TextView p1score, p2score, teamScore, overs,p1name,p2name;
    int teamS = 0, over = 0, wickets = 0, ballc = 0;
    Players p1, p2;
    int TeamPointer = 1;
    String[] team = {"Shikhar", "Rohit", "Virat", "Rahul", "Dhoni", "Hardik", "Kedar", "Kuldeep", "Bhuvi", "Bumrah", "Chahal"};
    ArrayList<Players> players;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create instance of the views
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button11);
        bt3 = findViewById(R.id.button17);
        bt4 = findViewById(R.id.button10);
        bt5 = findViewById(R.id.button16);
        bt6 = findViewById(R.id.button9);
        bt7 = findViewById(R.id.button15);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button14);
        bt10 = findViewById(R.id.button7);
        bt11 = findViewById(R.id.button13);
        bt12 = findViewById(R.id.button6);
        bt13 = findViewById(R.id.button12);
        bt14 = findViewById(R.id.button5);

        //creating instance for current players
        p1 = new Players(team[0], 0, 0);
        p2 = new Players(team[1], 0, 0);

        //create instance of the textViews
        p1score = findViewById(R.id.textView3);
        p2score = findViewById(R.id.textView4);
        teamScore = findViewById(R.id.textView5);
        overs = findViewById(R.id.textView6);
        p1name=findViewById(R.id.textView);
        p2name=findViewById(R.id.textView2);

        players=new ArrayList<Players>();
        p1name.setText(p1.getPlayerName());
        p2name.setText(p2.getPlayerName());
        p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
        p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
        overs.setText("" + over + "." + ballc);
        teamScore.setText(""+teamS+"/"+wickets);

        //clickListner for button 1
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 6);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 6;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        //clickListner for button2
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 6);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 6;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 4);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 4;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 4);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 4;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 3);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 3;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        //clickListner for button2
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 3);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 3;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 2);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 2;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        //clickListner for button2
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 2);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 2;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 1);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 1;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        //clickListner for button2
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 1);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 1;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setScore(p1.getScore() + 0);
                ballc++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 0;
                p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        //clickListner for button2
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.setScore(p2.getScore() + 0);
                ballc++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamS += 0;
                p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                teamScore.setText("" + teamS + "/" + wickets);
                overs.setText("" + over + "." + ballc);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballc++;
                wickets++;
                p1.setBallsPlayed(p1.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamScore.setText(""+teamS+"/"+wickets);
                players.add(p1);
                if(wickets<10) {
                    p1 = new Players(team[TeamPointer + 1], 0, 0);
                    TeamPointer++;
                    p1name.setText(p1.getPlayerName());
                    p1score.setText("" + p1.getScore() + "(" + p1.getBallsPlayed() + ")");
                    overs.setText("" + over + "." + ballc);
                }
                else
                {
                    players.add(p2);
                    Toast.makeText(MainActivity.this,"Innings Over"+players.size(),Toast.LENGTH_SHORT).show();
                    showScore();
                }
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballc++;
                wickets++;
                p2.setBallsPlayed(p2.getBallsPlayed() + 1);
                if (ballc == 6) {
                    ballc = 0;
                    over++;
                }
                teamScore.setText(""+teamS+"/"+wickets);
                players.add(p2);
                if(wickets<10) {
                    p2 = new Players(team[TeamPointer + 1], 0, 0);
                    TeamPointer++;
                    p2name.setText(p2.getPlayerName());
                    p2score.setText("" + p2.getScore() + "(" + p2.getBallsPlayed() + ")");
                    overs.setText("" + over + "." + ballc);
                }
                else
                {
                    players.add(p1);
                    Toast.makeText(MainActivity.this,"Innings Over"+players.size(),Toast.LENGTH_SHORT).show();
                    showScore();
                }
            }
        });
    }
    private void showScore()
    {
        Intent intent=new Intent(MainActivity.this,ScoreCard.class);
        ((Intent) intent).putExtra("playerList",players);
        startActivity(intent);
    }
}
