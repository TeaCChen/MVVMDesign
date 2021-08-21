package pers.teacchen.mvvmbase.contract

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * @ClassName: BaseContractFragment
 * @description:
 *
 * @author TeaC
 * @date 2021-08-21
 */
abstract class BaseContractFragment<
        VB : ViewBinding,
        VM : BaseContract.AbsViewModel>
    : Fragment(), IViewHost<VM> {

    private var _viewBinding: VB? = null
    protected val viewBinding
        get() = _viewBinding ?: throw IllegalStateException("ViewBinding not init yet!")

    private var _viewModel: VM? = null
    final override val viewModel
        get() = _viewModel ?: throw IllegalStateException("ViewModel not init yet!")

    protected abstract fun initViewModel(): VM
    protected abstract fun initData(savedInstanceState: Bundle?)
    protected abstract fun initView(savedInstanceState: Bundle?)
    protected abstract fun startObserve()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding =
            inflateBinding(this, inflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _viewModel = initViewModel()
        initData(savedInstanceState)
        initView(savedInstanceState)
        startObserve()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewBinding = null
    }

    override fun showLoading(text: String) {
        TODO("Not yet implemented")
    }

    override fun dismissLoading() {
        TODO("Not yet implemented")
    }

    override fun showToast(text: String) {
        TODO("Not yet implemented")
    }
}