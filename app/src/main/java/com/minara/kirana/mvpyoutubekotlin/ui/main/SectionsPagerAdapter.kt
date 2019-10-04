package com.minara.kirana.mvpyoutubekotlin.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.minara.kirana.mvpyoutubekotlin.R
import com.minara.kirana.mvpyoutubekotlin.ui.fragment.DestinationFragment
import com.minara.kirana.mvpyoutubekotlin.ui.fragment.FootballFragment
import com.minara.kirana.mvpyoutubekotlin.ui.fragment.TravellerFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
// TODO 0 memimilih TAB ACTIVITY ketika awal membuat project dan ubah menjadi di bawah ini
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = FootballFragment()
            1 -> fragment = DestinationFragment()
            2 -> fragment = TravellerFragment()
        }
        return fragment

    }

    override fun getPageTitle(position: Int): CharSequence? {

        var title = ""
        when(position){
            0 -> title = "Football"
            1 -> title = "Destination"
            2 -> title = "Traveller"
        }
        return title
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}