package kg.geektech.kotlin14

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.kotlin14.fragment.FirstFragment
import kg.geektech.kotlin14.fragment.SecondFragment
import kg.geektech.kotlin14.fragment.ThirtFragment

class PagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return FirstFragment ()
            1 -> return SecondFragment ()
            2 -> return ThirtFragment ()
        }
        return FirstFragment()
    }
}