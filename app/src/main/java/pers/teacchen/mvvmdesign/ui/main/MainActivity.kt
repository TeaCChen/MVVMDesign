package pers.teacchen.mvvmdesign.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import pers.teacchen.mvvmbase.contract.BaseContractActivity
import pers.teacchen.mvvmbase.contract.IViewHost
import pers.teacchen.mvvmdesign.databinding.ActivityMainBinding
import pers.teacchen.mvvmdesign.ui.main.constract.MainContract
import pers.teacchen.mvvmdesign.ui.main.constract.MainViewModel


class MainActivity : BaseContractActivity<ActivityMainBinding, MainContract.AbsViewModel>(),
    MainContract.IView {

    override fun initViewModel(): MainContract.AbsViewModel =
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        ).get(
            MainViewModel::class.java
        )

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun initView(savedInstanceState: Bundle?) {
    }

    override fun startObserve() {
    }

    override fun abc() {
    }

    override val host: IViewHost<MainContract.AbsViewModel>
        get() = this
}