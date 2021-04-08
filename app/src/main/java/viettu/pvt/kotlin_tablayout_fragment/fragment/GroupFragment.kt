package viettu.pvt.kotlin_tablayout_fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_group.*
import viettu.pvt.kotlin_tablayout_fragment.R
import viettu.pvt.kotlin_tablayout_fragment.TabFragment.GroupViewAdapter


class GroupFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_group, container, false)
        var vp_group :ViewPager = view.findViewById(R.id.vp_group)
        var  tab_layout: TabLayout = view.findViewById(R.id.tab_layout)
         vp_group.adapter = GroupViewAdapter(childFragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT )
          tab_layout.setupWithViewPager(vp_group)
        return  view;
    }

    companion object {
        fun newInstance(): GroupFragment {

            return GroupFragment()
        }
    }
}