package pers.teacchen.mvvmbase.contract

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @ClassName: BaseContractActivity
 * @description:
 *
 * @author TeaC
 * @date 2021-08-21
 */
abstract class BaseContractActivity<
        VB : ViewBinding,
        VM : BaseContract.AbsViewModel>
    : AppCompatActivity(), IViewHost<VM> {

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


    /**
     * Activity override
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = inflateBinding(this, layoutInflater)
        setContentView(viewBinding.root)
        _viewModel = initViewModel()
        initData(savedInstanceState)
        initView(savedInstanceState)
        startObserve()
    }

    override fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    override fun showLoading(text: String) {

    }

    override fun dismissLoading() {
    }
}