package com.omao.viewpagerapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.omao.viewpagerapp.MainActivity
import com.omao.viewpagerapp.fragments.FragmentOne
import com.omao.viewpagerapp.fragments.FragmentThree
import com.omao.viewpagerapp.fragments.FragmentTwo

class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {
    private val Fragments_Size = 3

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int {
        return Fragments_Size
    }

    /**
     * Provide a new Fragment associated with the specified position.
     *
     *
     * The adapter will be responsible for the Fragment lifecycle:
     *
     *  * The Fragment will be used to display an item.
     *  * The Fragment will be destroyed when it gets too far from the viewport, and its state
     * will be saved. When the item is close to the viewport again, a new Fragment will be
     * requested, and a previously saved state will be used to initialize it.
     *
     * @see ViewPager2.setOffscreenPageLimit
     */
    override fun createFragment(position: Int): Fragment {

        when (position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return FragmentOne()
    }

}