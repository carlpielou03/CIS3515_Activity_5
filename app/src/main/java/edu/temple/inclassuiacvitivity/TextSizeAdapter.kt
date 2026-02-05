package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes: Array<Int> ) : BaseAdapter() {

    private val context = _context
    private val textSizes = _textSizes
    override fun getCount(): Int {
        return  textSizes.size
    }

    override fun getItem(position: Int): Any {
        return  textSizes[position]
    }

    override fun getItemId(position: Int): Long {
       return  position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()
        textView.setPadding(5, 10, 0, 10)
        return textView
    }

}