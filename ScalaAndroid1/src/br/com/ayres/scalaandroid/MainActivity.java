package br.com.ayres.scalaandroid;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends Activity {

    private SharedPreferences mSharedPreferences;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mSharedPreferences = getSharedPreferences("", Context.MODE_PRIVATE);
        
    }
    
}
