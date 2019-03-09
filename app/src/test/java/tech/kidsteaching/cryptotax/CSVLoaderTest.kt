package tech.kidsteaching.cryptotax

import org.junit.Test

import org.junit.Assert.*
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException


class CSVLoaderTest {
    @Test
    fun read_csv_spike() {

        val rows = CSVReader().readCSV()


        assertEquals(4, 2 + 2)
    }
}
