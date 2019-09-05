package com.kylephan.autoapps.wheelfitment.specpreview

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment

class FragmentSpecPreviewOpenGL : Fragment() {

    companion object {
        private val TAG = FragmentSpecPreviewOpenGL::class.java.simpleName
    }

    private lateinit var gLView: GLSurfaceView

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContentView(gLView)
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        gLView = MyGLSurfaceView(context!!)

        return gLView
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}