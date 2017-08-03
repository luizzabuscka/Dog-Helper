package com.luizzabuscka.doghelper.interactors

import com.luizzabuscka.doghelper.model.Login
import com.luizzabuscka.doghelper.presentation.ISplashPresenter
import com.luizzabuscka.doghelper.services.Factory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by luizzabuscka on 02/08/17.
 */
class SplashInteractor(val presenter: ISplashPresenter) : ISplashInteractor {

  override fun saveLogin(login: Login) {

    presenter.callNextActivity()
  }

  override fun downloadLogins() {
    Factory.create().login()
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribe({
          result ->
          saveLogin(result)
        }, {
          error ->
          presenter.callNextActivity()
        })
  }
}