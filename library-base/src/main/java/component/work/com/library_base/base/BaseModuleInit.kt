package component.work.com.library_base.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import component.work.com.library_base.BuildConfig
import component.work.com.library_base.config.ModuleLifecycleReflexs
import me.goldze.mvvmhabit.utils.KLog

/**
 * 基础库自身初始化操作
 * Created by lis on 2018/12/25.
 */
class BaseModuleInit : IModuleInit {
	override fun onInitAhead(application: Application): Boolean {
		//开启打印日志
		KLog.init(true)
		//初始化阿里路由框架
		if (BuildConfig.DEBUG) {
			ARouter.openLog()     // 打印日志
			ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
		}
		ARouter.init(application) // 尽可能早，推荐在Application中初始化
		KLog.i(ModuleLifecycleReflexs.LOG_TAG, "基础层初始化 -- onInitAhead")
		return false
	}

	override fun onInitLow(application: Application): Boolean {
		KLog.i(ModuleLifecycleReflexs.LOG_TAG, "基础层初始化 -- onInitLow")
		return false
	}
}
