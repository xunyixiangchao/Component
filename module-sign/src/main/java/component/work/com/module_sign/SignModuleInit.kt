package component.work.com.module_sign

import android.app.Application
import component.work.com.library_base.base.IModuleInit
import component.work.com.library_base.config.ModuleLifecycleReflexs
import me.goldze.mvvmhabit.utils.KLog

/**
 * Created by lis on 2018/12/25.
 */
class SignModuleInit : IModuleInit {
	override fun onInitAhead(application: Application): Boolean {
		KLog.i(ModuleLifecycleReflexs.LOG_TAG, "登录模块初始化 -- onInitAhead")
		return false
	}

	override fun onInitLow(application: Application): Boolean {
		KLog.i(ModuleLifecycleReflexs.LOG_TAG, "登录模块初始化 -- onInitLow")
		return false
	}
}
