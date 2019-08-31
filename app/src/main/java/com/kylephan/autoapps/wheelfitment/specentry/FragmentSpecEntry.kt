package com.kylephan.autoapps.wheelfitment.specentry

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
import com.kylephan.autoapps.wheelfitment.R
import com.kylephan.autoapps.wheelfitment.databinding.FragmentSpecEntryBinding
import com.kylephan.autoapps.wheelfitment.databinding.FragmentSpecEntryBindingImpl
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

        binding.specEntryPreviewBtn.setOnClickListener { Log.d(TAG, "KP## PREVIEW BUTTON CLICKED! ")
            viewModel.updateWheelSpec(binding.tireWidthET.text.toString().toInt(),
                                      binding.tireSidewallET.text.toString().toInt(),
                                      binding.wheelDiameterET.text.toString().toInt(),
                                      binding.wheelWidthET.text.toString().toFloat(),
                                      binding.wheelOffsetET.text.toString().toInt(),
                                      binding.wheelCamberET.text.toString().toFloat()
                )

//            viewModel.updateWheelSpec(
//                225,
//                45,
//                17,
//                7f,
//                30,
//                -2f
//            )
            goToPreview()
        }
        binding.specEntryResetBtn.setOnClickListener { Log.d(TAG, "KP## RESET BUTTON CLICKED! ")}

        viewModel = ViewModelProviders.of(this).get(SpecEntryViewModel::class.java)

        return binding.root
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun goToPreview() {
        val action = FragmentSpecEntryDirections.specEntryToPreview()

        NavHostFragment.findNavController(this).navigate(action)
    }
}