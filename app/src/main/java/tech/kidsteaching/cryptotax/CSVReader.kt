package tech.kidsteaching.cryptotax

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.util.ArrayList

//    https://en.proft.me/2017/07/6/how-read-csv-file-android/
class CSVReader {
    internal var rows: MutableList<Array<String>> = ArrayList()

    @Throws(IOException::class)
    fun readCSV(): List<Array<String>> {
        val br = BufferedReader(FileReader(BuildConfig.CSV_LOCATION))
        var line: String? = br.readLine()

        while (line != null) {
            val row = line.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            rows.add(row)
            line = br.readLine()
        }
        return rows
    }
}