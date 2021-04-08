package viettu.pvt.kotlin_tablayout_fragment.TabFragment

import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class GroupViewAdapter(suportManager: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(suportManager, behavior) {
    override fun getCount(): Int {
       return 3
    }

    override fun getItem(position: Int): Fragment {
       when(position){
           0 -> return  Tab1Fragment()
           1 -> return  Tab2Fragment()
           2 -> return  Tab3Fragment()
           else -> return  Tab1Fragment()
       }
    }

    override fun getPageTitle(position: Int): CharSequence {

        when(position){
            0 -> return "Tab1"
            1 -> return  "Tab2"
            2-> return "Tab3"
            else -> return  "Tab1"
        }
    }

}