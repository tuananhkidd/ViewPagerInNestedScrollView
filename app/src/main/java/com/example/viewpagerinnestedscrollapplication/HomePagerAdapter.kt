package com.example.viewpagerinnestedscrollapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class HomePagerAdapter(fm: FragmentManager?, private val lsFragment:ArrayList<Fragment>) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return lsFragment[position]
    }

    override fun getCount(): Int {
        return lsFragment.size
    }
}