package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    val data = listOf(
        Affirmation(R.string.affirmation1,R.drawable.image1),
        Affirmation(R.string.affirmation2,R.drawable.image2),
    )

    @Test
    fun adapter_size(){
    val adapter = ItemAdapter(context,data)
    assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}