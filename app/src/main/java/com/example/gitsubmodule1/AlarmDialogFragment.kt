package com.example.gitsubmodule1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class AlarmDialogFragment : Fragment() {

    companion object {
        fun newInstance() = AlarmDialogFragment()
    }

    private lateinit var viewModel: AlarmDialogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_alarm_dialog, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AlarmDialogViewModel::class.java)
        // TODO: Use the ViewModel
    }

    fun foo(){
        println("foo()")
    }

}