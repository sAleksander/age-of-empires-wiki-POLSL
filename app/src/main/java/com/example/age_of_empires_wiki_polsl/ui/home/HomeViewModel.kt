package com.example.age_of_empires_wiki_polsl.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nibh massa. Aenean ut scelerisque tellus. Morbi porttitor tortor ligula, a blandit lectus ornare nec. Donec id cursus lorem. Vestibulum suscipit risus dui, vel elementum dolor hendrerit a. Nunc erat purus, lobortis nec laoreet vel, condimentum nec arcu. Suspendisse imperdiet sapien ut felis rutrum, in placerat enim ultricies. Mauris ac elit neque. Suspendisse odio velit, varius ultrices est vitae, tincidunt placerat tortor. Integer blandit ante porttitor ante volutpat tempus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec nec purus arcu. Praesent at arcu eu velit posuere facilisis. Pellentesque vel semper quam.\n"
    }
    val text: LiveData<String> = _text
}