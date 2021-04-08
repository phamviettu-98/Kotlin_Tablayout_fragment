package viettu.pvt.kotlin_tablayout_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import viettu.pvt.kotlin_tablayout_fragment.Adapter.ViewPageAdapter

class MainActivity : AppCompatActivity() {
    val manger = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       viewpage.adapter = ViewPageAdapter(manger, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        viewpage?.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                when (position){
                   0 -> nav_bottom.menu.findItem(R.id.nav_home).setChecked(true)
                    1 -> nav_bottom.menu.findItem(R.id.nav_group).setChecked(true)
                    2 -> nav_bottom.menu.findItem(R.id.nav_location).setChecked(true)
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
        nav_bottom.setOnNavigationItemSelectedListener( BottomNavigationView.OnNavigationItemSelectedListener {
                item ->when(item.itemId){
                    R.id.nav_home ->{
                        viewpage.currentItem =0
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.nav_group->{
                        viewpage.currentItem =1
                        return@OnNavigationItemSelectedListener  true
                    }
                    R.id.nav_location->{
                        viewpage.currentItem =2
                        return@OnNavigationItemSelectedListener  true
                    }
                  else -> return@OnNavigationItemSelectedListener  true


                }  } )

    }
}