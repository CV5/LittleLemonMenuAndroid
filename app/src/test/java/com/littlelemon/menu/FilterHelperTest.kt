package com.littlelemon.menu

import org.junit.Test
import org.junit.Assert.*


class FilterHelperTest {
    private val classUnderTest = FilterHelper()
    private val sampleProductsList = mutableListOf(
        ProductItem(
            title = "Black tea",
            price = 3.00,
            category = "Drinks",
            R.drawable.black_tea
        ),
        ProductItem(
            title = "Croissant",
            price = 7.00,
            category = "Dessert",
            R.drawable.croissant
        ),
        ProductItem(
            title = "Bouillabaisse",
            price = 20.00,
            category = "Food",
            R.drawable.bouillabaisse
        ),
        ProductItem(
            title = "Croissant2",
            price = 20.00,
            category = "Dessert",
            R.drawable.croissant
        )
    )

    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val result = classUnderTest.filterProducts(FilterType.Dessert,sampleProductsList)
        val expectedDessertList = listOf(
            ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
            ProductItem("Croissant2", 20.00, "Dessert", R.drawable.croissant)
        )

        assertEquals(expectedDessertList, result)

    }

}