package com.example.grocerryapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class GroceryViewModal (private val repository: GroceryRepository) : ViewModel() {



    fun insert(items: GroceryItems) = GlobalScope.launch {
        repository.insert(items)}



    fun delete(items: GroceryItems)= GlobalScope.launch {
        repository.delete(items)}



    fun getAllGroceryItems ( ) = repository.getAllItems( )



}