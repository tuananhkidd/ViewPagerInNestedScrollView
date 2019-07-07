package com.example.viewpagerinnestedscrollapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsFragment: ArrayList<Fragment> = ArrayList()
        lsFragment.add(TestFragment())
        lsFragment.add(Test2Fragment())
        val homePagerAdapter = HomePagerAdapter(supportFragmentManager,lsFragment)
        vpHome.adapter = homePagerAdapter
    }
}
