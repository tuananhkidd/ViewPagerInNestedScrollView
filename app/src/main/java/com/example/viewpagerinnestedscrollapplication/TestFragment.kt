package com.example.viewpagerinnestedscrollapplication


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_test.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TestFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listStr = arrayListOf<String>("hihi", "huhu", "hoho", "hihi", "huhu", "hoho", "hihi", "huhu", "hoho", "hihi", "huhu", "hoho"
                , "hihi", "huhu", "hoho", "hihi", "huhu", "hoho")
        val testAdapter = TestAdapter(listStr)
        rcv.adapter = testAdapter
    }

}
