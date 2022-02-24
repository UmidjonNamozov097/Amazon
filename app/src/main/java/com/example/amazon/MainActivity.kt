package com.example.amazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.amazon.adapter.EssentialAdapter
import com.example.amazon.adapter.SelectionAdapter
import com.example.amazon.model.Essential
import com.example.amazon.model.Selection

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView_selec: RecyclerView
    lateinit var ll_fashion: LinearLayout
    lateinit var ll_popular: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.rv_essential)
        ll_fashion = findViewById(R.id.ll_fashion)
        ll_popular = findViewById(R.id.ll_popular)

        setLinearHeight(ll_fashion)
        setLinearHeight(ll_popular)

        refreshAdapter(getEssentil())

        selectionAdapter(getSelection())
    }

    private fun selectionAdapter(items: ArrayList<Selection>) {
        var adapter = SelectionAdapter(this, items)
        recyclerView_selec = findViewById(R.id.rv_explore)
        recyclerView_selec.adapter = adapter
    }

    private fun getSelection(): ArrayList<Selection> {
        var items = ArrayList<Selection>()

        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))
        items.add(Selection(R.drawable.sports, "Sports and Outdoors"))

        return items
    }

    fun setLinearHeight(layout: LinearLayout) {
        //Get screen width programmatically

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var widthPixels = displayMetrics.widthPixels

        //Set layout width programmatically
        val params: ViewGroup.LayoutParams = layout.layoutParams
        params.height = widthPixels
        layout.setLayoutParams(params)
    }

    private fun refreshAdapter(items: ArrayList<Essential>) {
        var adapter = EssentialAdapter(this, items)

        recyclerView.adapter = adapter
    }

    private fun getEssentil(): ArrayList<Essential> {
        var items = ArrayList<Essential>()

        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))
        items.add(Essential("Oculus", R.drawable.oculus))

        return items
    }
}