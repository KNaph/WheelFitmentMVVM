package com.kylephan.autoapps.wheelfitment.specpreview

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kylephan.autoapps.wheelfitment.R
import com.kylephan.autoapps.wheelfitment.databinding.FragmentSpecPreviewBinding

class FragmentSpecPreview : Fragment() {

    companion object {
        private val TAG = FragmentSpecPreview::class.java.simpleName
    }

    private lateinit var binding: FragmentSpecPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "KP## THIS IS A LOG FOR FRAGMENT SPEC PREVIEW")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_spec_preview,
            container,
            false
        )

        return binding.root
    }
}