package component.work.com.library_base.router

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by lis on 2018/12/25.
 */
object RouterActivityPath {
	/**
	 * 主业务组件
	 */
	object Main {
		private const val MAIN = "/main"
		/*主业务界面*/
		const val PAGER_MAIN = "$MAIN/Main"
	}

	/**
	 * 身份验证组件
	 */
	object Sign {
		private const val SIGN = "/sign"
		/*登录界面*/
		const val PAGER_LOGIN = "$SIGN/Login"
	}

	/**
	 * 用户组件
	 */
	object User {
		private const val USER = "/user"
		/*用户详情*/
		const val PAGER_USERDETAIL = "$USER/UserDetail"
	}
}
