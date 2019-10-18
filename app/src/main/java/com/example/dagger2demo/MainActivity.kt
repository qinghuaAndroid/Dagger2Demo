package com.example.dagger2demo

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.SimpleAdapter
import org.jetbrains.anko.AnkoLogger

class MainActivity : ListActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = SimpleAdapter(this, getData(),
                android.R.layout.simple_list_item_1, arrayOf("title"),
                intArrayOf(android.R.id.text1))
    }

    private fun getData(): MutableList<Map<String, Any>>? {
        val myData = mutableListOf<Map<String, Any>>()

        myData.add(mapOf("title" to "daggerOne case1 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerOne.case1.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerOne case2 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerOne.case2.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerTwo case1 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerTwo.case1.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerTwo case2 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerTwo.case2.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerTwo case3 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerTwo.case3.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerThree case1 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerThree.case1.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerThree case2 LoginActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerThree.case2.LoginActivity::class.java)))
        myData.add(mapOf("title" to "daggerThree case3 ParkingActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerThree.case3.ParkingActivity::class.java)))
        myData.add(mapOf("title" to "daggerFour case1 ChildActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerFour.case1.ChildActivity::class.java)))
        myData.add(mapOf("title" to "daggerFour case2 ChildActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerFour.case2.ChildActivity::class.java)))
        myData.add(mapOf("title" to "daggerFour case3 ChildActivity",
                "intent" to activityToIntent(com.example.dagger2demo.daggerFour.case3.ChildActivity::class.java)))

        return myData
    }

    private fun activityToIntent(cls: Class<*>): Intent {
        return Intent(Intent.ACTION_VIEW).setClass(this, cls)
    }

    override fun onListItemClick(listView: ListView, view: View, position: Int, id: Long) {
        val map = listView.getItemAtPosition(position) as Map<*, *>

        val intent = Intent(map["intent"] as Intent)
        intent.addCategory(Intent.CATEGORY_SAMPLE_CODE)
        startActivity(intent)
    }
}
