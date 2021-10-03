package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var myViewPager: ViewPager2
    lateinit var image: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewPager = findViewById(R.id.view_pager)


        image = listOf(
            R.drawable.fernandes,
            R.drawable.greenwood,
            R.drawable.greenwood2,
            R.drawable.ozil2,
            R.drawable.ronaldo,
            R.drawable.ronaldo2
        )
        viewPagerAdapter = ViewPagerAdapter(image)
        myViewPager.adapter = viewPagerAdapter


        //for vertical display
        /**
        myViewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

         */

    }
}