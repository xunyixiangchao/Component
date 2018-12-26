package com.work.component

import component.work.com.library_base.config.ModuleLifecycleConfig
import me.goldze.mvvmhabit.base.BaseApplication

/**
 * Created by lis on 2018/12/25.
 */
class AppApplication : BaseApplication() {
	override fun onCreate() {
		super.onCreate()
		//初始化组件(靠前)
		ModuleLifecycleConfig.instance.initModuleAhead(this)
		//....
		//初始化组件(靠后)
		ModuleLifecycleConfig.instance.initModuleLow(this)
	}

}