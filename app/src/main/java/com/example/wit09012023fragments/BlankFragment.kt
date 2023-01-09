package com.example.wit09012023fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class BlankFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("LIFECYCLE_TAG","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFECYCLE_TAG","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LIFECYCLE_TAG","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LIFECYCLE_TAG","onViewCreated")

        view.findViewById<Button>(R.id.btn_open).setOnClickListener{
            findNavController().navigate(R.id.action_blankFragment_to_secondFragment2)


//            before navigation
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment,SecondFragment())
//                .addToBackStack(null)
//                .commit()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE_TAG","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE_TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE_TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE_TAG","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LIFECYCLE_TAG","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE_TAG","onDestroy")
    }

}