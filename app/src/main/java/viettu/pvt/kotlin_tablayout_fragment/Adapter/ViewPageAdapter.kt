package viettu.pvt.kotlin_tablayout_fragment.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import viettu.pvt.kotlin_tablayout_fragment.fragment.Frag1Fragment
import viettu.pvt.kotlin_tablayout_fragment.fragment.GroupFragment
import viettu.pvt.kotlin_tablayout_fragment.fragment.LocationFragment

class ViewPageAdapter(supportFragmentManager:FragmentManager, behavior:Int) :
    FragmentStatePagerAdapter(supportFragmentManager, behavior) {



    override fun getCount(): Int {
      return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return Frag1Fragment()
            1-> return  GroupFragment()
            2-> return LocationFragment()
            else -> return  Frag1Fragment()
        }
    }
}