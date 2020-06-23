package com.example.finalproject

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*
import nl.joery.animatedbottombar.AnimatedBottomBar

class Dashboard : AppCompatActivity() {

    lateinit var navigationView: AnimatedBottomBar
    lateinit var fragmentManager: FragmentManager
    private var tag: String = Dashboard::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        navigationView = findViewById(R.id.navigationView)

        if(savedInstanceState == null) {
            navigationView.selectTabById(R.id.home, true)
            fragmentManager = supportFragmentManager
            var homeFragment: HomeFragment = HomeFragment.newInstance()
            fragmentManager.beginTransaction().replace(R.id.container,homeFragment)
                .commit()
        }

        navigationView.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener{
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                var fragment: Fragment? = null
                when(newTab.id){
                    R.id.home -> {
                        fragment = HomeFragment.newInstance()
                    }
                    R.id.search -> {
                        fragment = FirstFragment.newInstance()
                    }
                    R.id.locate -> {
                        fragment = SecondFragment.newInstance()
                    }
                    R.id.profile -> {
                        fragment = ProfileFragment.newInstance()
                    }
                }

                if(fragment!= null) {
                    fragmentManager = supportFragmentManager
                    fragmentManager.beginTransaction().replace(R.id.container,fragment)
                        .commit()
                } else {
                    Log.e(tag, "Error in Creating Fragment")
                }

            }
        })
    }

}


