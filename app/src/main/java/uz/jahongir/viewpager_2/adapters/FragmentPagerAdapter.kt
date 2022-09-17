package uz.jahongir.viewpager_2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.jahongir.viewpager_2.MyData
import uz.jahongir.viewpager_2.fragments.ItemFragment

class FragmentPagerAdapter(fm: FragmentActivity, private val list: List<MyData>) : FragmentStateAdapter(fm) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return ItemFragment.newInstance(list[position])

    }
}