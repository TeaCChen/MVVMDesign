package pers.teacchen.mvvmbase.contract

/**
 * @ClassName: IViewHost
 * @description: 视图层宿主，封装视图层的通用操作，用以提供给IView中调用通用操作
 *
 * @author TeaC
 * @date 2021-08-21
 */
interface IViewHost<out VM : BaseContract.AbsViewModel> {
    val viewModel: VM
    fun showLoading(text: String = "")
    fun dismissLoading()
    fun showToast(text: String)
}