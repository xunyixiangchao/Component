package component.work.com.module_sign.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import component.work.com.library_base.router.RouterActivityPath
import component.work.com.module_sign.BR
import component.work.com.module_sign.R
import component.work.com.module_sign.databinding.SignActivityLoginLayoutBinding
import me.goldze.mvvmhabit.base.BaseActivity

/**
 * Created by lis on 2018/12/25.
 */
@Route(path = RouterActivityPath.Sign.PAGER_LOGIN)
class LoginActivity : BaseActivity<SignActivityLoginLayoutBinding, LoginViewModel>() {
	override fun initVariableId(): Int {
		return BR.viewModel
	}

	override fun initContentView(p0: Bundle?): Int {
		return R.layout.sign_activity_login_layout
	}

	override fun initViewObservable() {
		super.initViewObservable()

	}
}