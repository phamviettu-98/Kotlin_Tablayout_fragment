package viettu.pvt.kotlin_tablayout_fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import viettu.pvt.kotlin_tablayout_fragment.R


class LocationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

    companion object {
        fun newInstance(): LocationFragment {

            return LocationFragment()
        }
    }
}