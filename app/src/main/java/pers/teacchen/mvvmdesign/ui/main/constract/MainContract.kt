package pers.teacchen.mvvmdesign.ui.main.constract

import pers.teacchen.mvvmbase.contract.BaseContract

/**
 * @ClassName: MainContract
 * @description:
 *
 * @author TeaC
 * @date 2021-08-21
 */
class MainContract {

    interface IView : BaseContract.IView<AbsViewModel> {
        fun abc()
    }

    abstract class AbsViewModel : BaseContract.AbsViewModel() {
        fun def() {

        }
    }
}