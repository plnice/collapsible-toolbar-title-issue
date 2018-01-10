package com.github.plnice.collapsibletoolbartitleissue

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var menuRes: Int = R.menu.menu_1_item
        set(value) {
            field = value
            invalidateOptionsMenu()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        findViewById<Button>(R.id.one_item).setOnClickListener { menuRes = R.menu.menu_1_item }
        findViewById<Button>(R.id.two_items).setOnClickListener { menuRes = R.menu.menu_2_items }
        findViewById<Button>(R.id.three_items).setOnClickListener { menuRes = R.menu.menu_3_items }
        findViewById<Button>(R.id.four_items).setOnClickListener { menuRes = R.menu.menu_4_items }
        findViewById<Button>(R.id.five_items).setOnClickListener { menuRes = R.menu.menu_5_items }
        findViewById<Button>(R.id.six_items).setOnClickListener { menuRes = R.menu.menu_6_items }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(menuRes, menu)
        return true
    }
}
