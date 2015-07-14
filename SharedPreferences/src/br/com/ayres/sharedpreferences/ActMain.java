package br.com.ayres.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ActMain extends Activity {

    private static final String MY_PREFERENCES = "MY_PREFERENCES";
    private static final String IS_FIRST_USE = "IS_FIRST_USE";

    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	mSharedPreferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
	if (mSharedPreferences.getBoolean(IS_FIRST_USE, true)) {
	    SharedPreferences.Editor editor = mSharedPreferences.edit();
	    editor.putBoolean(IS_FIRST_USE, false);
	    editor.commit();
	}
    }

}
