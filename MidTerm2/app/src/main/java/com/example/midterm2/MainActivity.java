package com.example.midterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    private int mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumber = 0;
    }

    public void mOnClick(View view){

        if(view.getId() == R.id.editText) {
            TextView textNumber = (TextView) view;
            textNumber.setText(mNumber + "");
        }
        else if (view.getId() == R.id.button){
            Button button = (Button) view;
            button.setText(mNumber+"");
        }
        else if (view.getId() == R.id.checkBox){
            CheckBox checkBox = (CheckBox) view;
            checkBox.setText(mNumber+"");
        }
        else if (view.getId() == R.id.toggleButton){
            ToggleButton toggleButton = (ToggleButton) view;
            toggleButton.setText(mNumber + "");
        }
        mNumber++;


        /*
        switch 문에서 case에 뷰 아이디 값인 R.id.뷰아이디를 쓰면 오류 발생
        Gradle 8.0부터 뷰 아이디 값들에 붙던 final이 붙지 않아 상수가 아니여서 case에 사용할 수 없게 되었음
        if/else문 사용

        switch(view.getId()){
            case R.id.editText:
                TextView textNumber = (TextView) view;
                textNumber.setText(mNumber+"");
                break;
            case R.id.button:
                Button button = (Button) view;
                button.setText(mNumber+"");
                break;
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                checkBox.setText(mNumber+"");
                break;
            case R.id.toggleButton:
                ToggleButton toggleButton = (ToggleButton) view;
                toggleButton.setText(mNumber + "");
                break;
        }

        */

    }
}