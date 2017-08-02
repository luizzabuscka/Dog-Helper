package com.luizzabuscka.doghelper.interactors

import com.luizzabuscka.doghelper.model.Login

/**
 * Created by luizzabuscka on 02/08/17.
 */
interface ISplashInteractor {
  fun saveLogin(login: Login)
  fun downloadLogins()
}