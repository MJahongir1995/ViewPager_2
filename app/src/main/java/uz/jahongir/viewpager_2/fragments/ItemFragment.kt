package uz.jahongir.viewpager_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.jahongir.viewpager_2.MyData
import uz.jahongir.viewpager_2.R
import uz.jahongir.viewpager_2.databinding.ActivityMainBinding
import uz.jahongir.viewpager_2.databinding.FragmentItemBinding

private const val ARG_PARAM1 = "param1"

class ItemFragment : Fragment() {
    private var myData: MyData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            myData = it.getSerializable(ARG_PARAM1) as MyData
        }
    }

    lateinit var binding: FragmentItemBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemBinding.inflate(layoutInflater)

        binding.picture.setImageResource(myData!!.picture)
        binding.title.text = myData?.title
        binding.text.text = myData?.text

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(myData: MyData) =
            ItemFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, myData)
                }
            }
    }
}