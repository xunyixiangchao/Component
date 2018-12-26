package component.work.com.library_base.config

/**
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 * Created by lis on 2018/12/25.
 */
object ModuleLifecycleReflexs {
	val LOG_TAG = "component"
	private val BaseInit = "component.work.com.library_base.base.BaseModuleInit"
	//主业务模块
	private val MainInit = "com.goldze.main.MainModuleInit"
	//登录验证模块
	private val SignInit = "component.work.com.module_sign.SignModuleInit"
	//首页业务模块
	private val HomeInit = "com.goldze.home.HomeModuleInit"
	//工作业务模块
	private val WorkInit = "com.goldze.work.WorkModuleInit"
	//消息业务模块
	private val MsgInit = "com.goldze.msg.MsgModuleInit"
	//用户业务模块
	private val UserInit = "com.goldze.user.UserModuleInit"

	var initModuleNames = arrayOf(BaseInit, MainInit, SignInit, HomeInit, WorkInit, MsgInit, UserInit)
}
