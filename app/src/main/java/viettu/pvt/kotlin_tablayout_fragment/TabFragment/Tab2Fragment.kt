package viettu.pvt.kotlin_tablayout_fragment.TabFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import viettu.pvt.kotlin_tablayout_fragment.R


class Tab2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false)
    }

    companion object {
        fun newInstance(): Tab2Fragment {
            return  Tab2Fragment()
        }
    }
}