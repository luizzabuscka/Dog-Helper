package com.luizzabuscka.doghelper.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.luizzabuscka.doghelper.interactors.ISplashInteractor
import com.luizzabuscka.doghelper.interactors.SplashInteractor
import com.luizzabuscka.doghelper.view.ISplashActivity
import com.luizzabuscka.doghelper.view.LoginActivity
import kotlin.jvm.javaClass

/**
 * Created by luizzabuscka on 02/08/17.
 */
class SplashPresenter(val context: Context, val activity: ISplashActivity) : ISplashPresenter {

  val interactor : ISplashInteractor = SplashInteractor(this)

  override fun callNextActivity() {
    if (!verifyLogged()) {
      activity.callNextActivity(Intent(context, LoginActivity::class.java))
    }
  }

  override fun downloadLogins() {
    if (verifyLogged()) {
      callNextActivity()
    } else {
      interactor.downloadLogins()
    }
  }

  override fun verifyLogged() : Boolean {
    return false
  }

}