package com.example.assignment07;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imageName = intent.getStringArrayExtra("ImageName");

        TextView tv[] = new TextView[imageName.length];
        RatingBar rbar[] = new RatingBar[imageName.length];

        Integer tvId[] = {R.id.tv1, R.id.tv2, R.id.tv3,R.id.tv4,R.id.tv5,
                            R.id.tv6,R.id.tv7,R.id.tv8,R.id.tv9};
        Integer rbarId[] = {R.id.rbar1,R.id.rbar2,R.id.rbar3,R.id.rbar4,R.id.rbar5,
                            R.id.rbar6,R.id.rbar7,R.id.rbar8,R.id.rbar9};
        Integer imageFileId[] = {R.drawable.pic1, R.drawable.pic2,R.drawable.pic3,
                                    R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,
                                    R.drawable.pic7,R.drawable.pic8,R.drawable.pic9};

        for(int i = 0; i < voteResult.length; i++){
            tv[i] = (TextView) findViewById(tvId[i]);
            rbar[i] = (RatingBar) findViewById(rbarId[i]);
        }

        for(int i = 0; i < voteResult.length; i++){
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }

        int idx = 0;
        for(int i = 1; i < voteResult.length; i++){
            if(voteResult[i-1] < voteResult[i])
                idx = i;
        }

        ImageView resultImg = (ImageView) findViewById(R.id.resultImg);
        TextView  resultTitle = (TextView) findViewById(R.id.resultTitle);
        resultImg.setImageResource(imageFileId[idx]);
        resultTitle.setText(imageName[idx]);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}
