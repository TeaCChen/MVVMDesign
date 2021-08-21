package pers.teacchen.mvvmbase.contract

import androidx.lifecycle.ViewModel

/**
 * @ClassName: BaseContract
 * @description: 契约基类，用以限定设计和描述其中功能
 *
 * @author TeaC
 * @date   2021-08-21
 */
class BaseContract {

    /**
     *  视图层接口，限定host属性，host即为视图层宿主，一般为Activity/Fragment
     */
    interface IView<out VM : AbsViewModel> {
        val host: IViewHost<VM>
    }

    /**
     * ViewModel层抽象类，此处抽象类用以 [IViewHost] 的下界限定
     */
    abstract class AbsViewModel : ViewModel()
}