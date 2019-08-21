package com.utsman.dicoding.jetpacksubmission1.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    private val listFragment: MutableList<Fragment> = mutableListOf()
    private val listTitle: MutableList<String> = mutableListOf()

    override fun getItem(position: Int): Fragment = listFragment[position]

    override fun getCount(): Int = listFragment.size

    override fun getPageTitle(position: Int): CharSequence? = listTitle[position]

    fun addFragment(vararg fragment: Fragment) {
        fragment.map { frg ->
            listFragment.add(frg)
        }
    }

    fun addTitle(vararg title: String) {
        title.map { ttl ->
            listTitle.add(ttl)
        }
    }
}