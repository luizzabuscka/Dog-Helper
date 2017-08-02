package com.luizzabuscka.doghelper.presentation

import com.luizzabuscka.doghelper.model.Login

/**
 * Created by luizzabuscka on 02/08/17.
 */
interface ISplashPresenter {
  fun downloadLogins()
  fun verifyLogged() : Boolean
  fun callNextActivity()
}