package com.example.viewpagerinnestedscrollapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_test.view.*

class TestAdapter(val listStr : ArrayList<String>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TestViewHolder {
        return TestViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_test,p0,false))
    }

    override fun getItemCount(): Int {
        return listStr.size
    }

    override fun onBindViewHolder(p0: TestViewHolder, p1: Int) {
        p0.tv.text = listStr[p1]
    }

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv:TextView = itemView.tvItem
    }
}