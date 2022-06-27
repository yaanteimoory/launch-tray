package com.example.lunchtray.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.lunchtray.data.DataSource
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    // Map of menu items
    val menuItems = DataSource.menuItems

    // Default values for item prices
    private var previousEntreePrice = 0.0
    private var previousSidePrice = 0.0
    private var previousAccompanimentPrice = 0.0

    // Default tax rate
    private val taxRate = 0.08

    // Entree for the order
    private val _entree = MutableLiveData<MenuItem?>()
    val entree: LiveData<MenuItem?> = _entree

    // Side for the order
    private val _side = MutableLiveData<MenuItem?>()
    val side: LiveData<MenuItem?> = _side

    // Accompaniment for the order.
    private val _accompaniment = MutableLiveData<MenuItem?>()
    val accompaniment: LiveData<MenuItem?> = _accompaniment

    // Subtotal for the order
    private val _subtotal = MutableLiveData(0.0)
    val subtotal: LiveData<String> = Transformations.map(_subtotal) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // Total cost of the order
    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // Tax for the order
    private val _tax = MutableLiveData(0.0)
    val tax: LiveData<String> = Transformations.map(_tax) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    /**
     * Set the entree for the order.
     */
    fun setEntree(entree: String) {

        _entree.value = menuItems[entree]
        updateSubtotal()

    }

    /**
     * Set the side for the order.
     */
    fun setSide(side: String) {

        _side.value = menuItems[side]
        updateSubtotal()

    }

    /**
     * Set the accompaniment for the order.
     */
    fun setAccompaniment(accompaniment: String) {

        _accompaniment.value = menuItems[accompaniment]
        updateSubtotal()
    }

    /**
     * Update subtotal value.
     */
    private fun updateSubtotal(itemPrice: Double=0.0) {
        val subTotal = (entree.value?.price?:0.0) +
                (side.value?.price?:0.0) +
                (accompaniment.value?.price?:0.0)

        _subtotal.value = subTotal
        calculateTaxAndTotal()

    }

    /**
     * Calculate tax and update total.
     */
    fun calculateTaxAndTotal() {
        // set _tax.value based on the subtotal and the tax rate.
        _tax.value = _subtotal.value?.times(taxRate)
        // set the total based on the subtotal and _tax.value.
        _total.value = _tax.value?.let { _subtotal.value?.plus(it) }
    }

    /**
     * Reset all values pertaining to the order.
     */
    fun resetOrder() {
//        previousEntreePrice = 0.0
//        previousSidePrice = 0.0
//        previousAccompanimentPrice = 0.0

        _entree.value = null
        _side.value = null
        _accompaniment.value = null

        updateSubtotal()
//        _subtotal.value = 0.0
//        calculateTaxAndTotal()
    }
}
