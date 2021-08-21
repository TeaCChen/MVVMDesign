package pers.teacchen.mvvmdesign.ui.main.constract

import pers.teacchen.mvvmbase.contract.IViewHost
import pers.teacchen.mvvmdesign.ui.main.constract.MainContract

/**
 * @ClassName: MainView
 * @description:
 *
 * @author TeaC
 * @date 2021-08-21
 */
class MainView(override val host: IViewHost<MainContract.AbsViewModel>) : MainContract.IView {

    override fun abc() {
    }
}