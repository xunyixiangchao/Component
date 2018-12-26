package com.work.component.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import component.work.com.module_sign.ui.LoginActivity

/**
 * Created by lis on 2018/12/25.
 */
class SplashActivity : Activity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Handler().postDelayed({ inMain() }, (3 * 1000).toLong())
	}

	/**
	 * 进入主页面
	 */
	private fun inMain() {
		startActivity(Intent(this, LoginActivity::class.java))
		finish()
	}
}