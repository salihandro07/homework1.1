package com.example.homework11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework11.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Получаем данные из аргументов
        val name = arguments?.getString("name") ?: "N/A"
        val email = arguments?.getString("email") ?: "N/A"
        val password = arguments?.getString("password") ?: "N/A"

        binding.nameTextView.text = "Name: $name"
        binding.emailTextView.text = "Email: $email"
        binding.passwordTextView.text = "Password: $password"
    }
}
