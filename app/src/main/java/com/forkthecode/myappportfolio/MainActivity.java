package com.forkthecode.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.moviesAppButton:
                makeToast(getString(R.string.popularMoviesApp));
                break;
            case R.id.scoresAppButton:
                makeToast(getString(R.string.scoresApp));
                break;
            case R.id.libraryAppButton:
                makeToast(getString(R.string.libraryApp));
                break;
            case R.id.buildAppButton:
                makeToast(getString(R.string.buildBiggerApp));
                break;
            case R.id.readerAppButton:
                makeToast(getString(R.string.readerApp));
                break;
            case R.id.capstoneAppButton:
                makeToast(getString(R.string.capstoneApp));
                break;
        }
    }
    private void makeToast(String appName){
        Toast.makeText(this,"This button will launch " + appName + " app",Toast.LENGTH_SHORT).show();
    }
}
