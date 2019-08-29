package com.kylephan.autoapps.wheelfitment.specentry

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.kylephan.autoapps.wheelfitment.R
import com.kylephan.autoapps.wheelfitment.databinding.FragmentSpecEntryBinding
import com.kylephan.autoapps.wheelfitment.viewmodel.SpecEntryViewModel

class FragmentSpecEntry : Fragment() {

    companion object {
        private val TAG = FragmentSpecEntry::class.java.simpleName
    }

    private lateinit var binding: FragmentSpecEntryBinding
    private lateinit var viewModel: SpecEntryViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_spec_entry,
            container,
            false
        )

        binding.specEntryPreviewBtn.setOnClickListener { Log.d(TAG, "KP## PREVIEW BUTTON CLICKED! ")}
        binding.specEntryResetBtn.setOnClickListener { Log.d(TAG, "KP## RESET BUTTON CLICKED! ")}

        viewModel = ViewModelProviders.of(this).get(SpecEntryViewModel::class.java)

        return binding.root
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}