package com.schoentoon.parallel.intentservice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
  private static final String TAG = MainActivity.class.getSimpleName();

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
  }

  public void onStartService(View v) {
    Log.d(TAG,"onStartService(View);");
    Intent intent = new Intent(this, TestService.class);
    for (int i = 0; i < 5; i++)
      startService(intent);
  }
}