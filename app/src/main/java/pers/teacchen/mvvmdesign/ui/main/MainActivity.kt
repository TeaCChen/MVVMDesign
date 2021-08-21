package pers.teacchen.mvvmdesign.ui.main

import android.os.Bundle
import pers.teacchen.mvvmbase.contract.BaseContractActivity
import pers.teacchen.mvvmbase.contract.IViewHost
import pers.teacchen.mvvmdesign.R
import pers.teacchen.mvvmdesign.databinding.ActivityMainBinding
import pers.teacchen.mvvmdesign.ui.main.constract.MainContract


class MainActivity : BaseContractActivity<ActivityMainBinding, MainContract.AbsViewModel>(),
    MainContract.IView {

    override fun initViewModel(): MainContract.AbsViewModel {
        TODO("Not yet implemented")
    }

    override fun initData(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

    override fun initView(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

    override fun startObserve() {
        TODO("Not yet implemented")
    }

    override fun abc() {
        TODO("Not yet implemented")
    }

    override val host: IViewHost<MainContract.AbsViewModel>
        get() = this
}