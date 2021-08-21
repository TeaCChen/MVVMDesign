package pers.teacchen.mvvmbase.contract

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * @FileName: ViewBindingUtil
 * @description:
 *
 * @author TeaC
 * @date   2021-08-21
 */


/**
 *  通过反射去生成viewBinding实例，仅限于BaseContractActivity或BaseContractFragment中调用
 *  与具体实现方式耦合，有较大局限性
 */
@Suppress("UNCHECKED_CAST")
internal fun <VB : ViewBinding> inflateBinding(
    contractHost: Any,
    inflater: LayoutInflater
): VB {
    val type = contractHost.javaClass as ParameterizedType
    val clazz = type.actualTypeArguments[0] as Class<VB>
    val method = clazz.getMethod("inflate", LayoutInflater::class.java)
    return method.invoke(null, inflater) as VB
}