package component.work.com.library_base.router

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by lis on 2018/12/25.
 */
object RouterFragmentPath {
	/**
	 * 首页组件
	 */
	object Home {
		private const val HOME = "/home"
		/*首页*/
		const val PAGER_HOME = "$HOME/Home"
	}

	/**
	 * 工作组件
	 */
	object Work {
		private const val WORK = "/work"
		/*工作*/
		const val PAGER_WORK = "$WORK/Work"
	}

	/**
	 * 消息组件
	 */
	object Msg {
		private const val MSG = "/msg"
		/*消息*/
		const val PAGER_MSG = "$MSG/msg/Msg"
	}

	/**
	 * 用户组件
	 */
	object User {
		private const val USER = "/user"
		/*我的*/
		const val PAGER_ME = "$USER/Me"
	}
}
