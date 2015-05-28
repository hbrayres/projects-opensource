package br.com.ayres.scalaandroid

import android.R.layout
import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class ActScalaMain extends Activity {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.act_main)
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater.inflate(R.menu.act_main, menu)
    return true
  }

  override def onOptionsItemSelected(item: MenuItem): Boolean = {

    val id = item.getItemId
    if (id == R.id.action_settings) {
      return true
    }

    return super.onOptionsItemSelected(item)
  }

}