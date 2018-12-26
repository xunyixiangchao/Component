package component.work.com.module_sign.ui

import android.app.Application
import android.databinding.ObservableField
import android.text.TextUtils
import me.goldze.mvvmhabit.base.BaseViewModel
import me.goldze.mvvmhabit.binding.command.BindingAction
import me.goldze.mvvmhabit.binding.command.BindingCommand
import me.goldze.mvvmhabit.utils.ToastUtils

/**
 * Created by lis on 2018/12/25.
 */
class LoginViewModel(application: Application) : BaseViewModel(application) {
	//用户名的绑定
	var userName = ObservableField("")
	//密码的绑定
	var password = ObservableField("")
	//登录按钮的点击事件
	var loginOnClickCommand = BindingCommand<BindingAction>(BindingAction { login() })


	private fun login() {
		if (TextUtils.isEmpty(userName.get())) {
			ToastUtils.showShort("请输入账号！")
			return
		}
		if (TextUtils.isEmpty(password.get())) {
			ToastUtils.showShort("请输入密码！")
			return
		}
	}
}
