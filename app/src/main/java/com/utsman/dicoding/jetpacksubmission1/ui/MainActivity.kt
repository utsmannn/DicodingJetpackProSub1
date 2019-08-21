package com.utsman.dicoding.jetpacksubmission1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.utsman.dicoding.jetpacksubmission1.R
import com.utsman.dicoding.jetpacksubmission1.data.MOVIES
import com.utsman.dicoding.jetpacksubmission1.data.SHOWS
import com.utsman.dicoding.jetpacksubmission1.ui.adapter.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieFragment = MainFragment.instance(MOVIES)
        val showsFragment = MainFragment.instance(SHOWS)

        val fragmentPagerAdapter = MainPagerAdapter(supportFragmentManager)
        fragmentPagerAdapter.addFragment(movieFragment, showsFragment)
        fragmentPagerAdapter.addTitle("Movies", "Tv Shows")

        main_view_pager.adapter = fragmentPagerAdapter
        main_tab_layout.setupWithViewPager(main_view_pager)
    }
}
