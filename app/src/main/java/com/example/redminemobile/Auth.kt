package com.example.redminemobile

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.redminemobile.databinding.AuthBinding
import com.google.android.material.appbar.AppBarLayout


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Auth : Fragment() {

    private var _binding: AuthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        changeBarColor()
        _binding = AuthBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signInBtn.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun changeBarColor() {
        val window: Window = activity!!.window
        //window.statusBarColor = ContextCompat.getColor(activity!!, R.color.auth_orange)
        val toolbar = window.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        //toolbar.setBackgroundColor(R.color.black)
        //toolbar.visibility = View.INVISIBLE

        val appBarLayout = window.findViewById<AppBarLayout>(R.id.appBarLayout)
        //appBarLayout.setBackgroundColor(R.color.auth_orange)
        //bar.setStatusBarForegroundColor(R.color.auth_orange)
        //appBarLayout.visibility = View.INVISIBLE
    }

}