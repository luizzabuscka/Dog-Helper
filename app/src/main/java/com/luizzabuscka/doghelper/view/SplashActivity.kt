package com.luizzabuscka.doghelper.view

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.luizzabuscka.doghelper.R.layout
import com.luizzabuscka.doghelper.presentation.ISplashPresenter
import com.luizzabuscka.doghelper.presentation.SplashPresenter
import java.lang.reflect.Type

class SplashActivity : AppCompatActivity(), ISplashActivity {

  val presenter : ISplashPresenter = SplashPresenter(this, this)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_splash)
    presenter.downloadLogins()
  }

  override fun callNextActivity(intent: Intent) {
    startActivity(intent)
  }
}
