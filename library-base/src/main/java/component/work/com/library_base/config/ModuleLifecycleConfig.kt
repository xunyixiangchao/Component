package component.work.com.library_base.config

import android.app.Application
import component.work.com.library_base.base.IModuleInit
import io.reactivex.annotations.Nullable

/**
 * 作为组件生命周期初始化的配置类，通过反射机制，动态调用每个组件初始化逻辑
 * Created by lis on 2018/12/25.
 */
class ModuleLifecycleConfig private constructor() {
	//内部类，在装载该内部类时才会去创建单例对象
	private object SingletonHolder {
		var instance = ModuleLifecycleConfig()
	}

	//初始化组件-靠前
	fun initModuleAhead(@Nullable application: Application) {
		for (moduleInitName in ModuleLifecycleReflexs.initModuleNames) {
			try {
				val clazz = Class.forName(moduleInitName)
				val init = clazz.newInstance() as IModuleInit
				//调用初始化方法
				init.onInitAhead(application)
			} catch (e: ClassNotFoundException) {
				e.printStackTrace()
			} catch (e: InstantiationException) {
				e.printStackTrace()
			} catch (e: IllegalAccessException) {
				e.printStackTrace()
			}

		}
	}

	//初始化组件-靠后
	fun initModuleLow(@Nullable application: Application) {
		for (moduleInitName in ModuleLifecycleReflexs.initModuleNames) {
			try {
				val clazz = Class.forName(moduleInitName)
				val init = clazz.newInstance() as IModuleInit
				//调用初始化方法
				init.onInitLow(application)
			} catch (e: ClassNotFoundException) {
				e.printStackTrace()
			} catch (e: InstantiationException) {
				e.printStackTrace()
			} catch (e: IllegalAccessException) {
				e.printStackTrace()
			}

		}
	}

	companion object {

		val instance: ModuleLifecycleConfig
			get() = SingletonHolder.instance
	}
}
