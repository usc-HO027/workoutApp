package com.example.workoutapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.workoutapp.data.NoteEntity

class MainViewModel : ViewModel() {
    val notesList = MutableLiveData<List<NoteEntity>>()
    init{
        notesList.value = SampleDataProvider.getNotes()
    }
}