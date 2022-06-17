package com.example.theatersandcinemaspractice
import android.content.ContentValues.TAG
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException


object  Test {

    @JvmStatic
    fun connection() {
            try {
                val c = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/kulakovcinema?kulakovcinema=UTC",
                    "root",
                    "root"
                )
                println("All ok")
                val s =
                    c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
                val r = s.executeQuery("SELECT * FROM `theater`")
                r.next()
                var i = 0

                //Вывод инфы
                println(String.format("%-15s%-15s",
                    r.getString("ID"),
                    r.getString("NAME")))
                while (r.next()) {
                    i = r.row
                    println(String.format("%-15s%-15s",
                        r.getString("ID"),
                        r.getString("NAME")))
                }
                //
            } catch (e: SQLException) {
                println("Eror")
                Log.e("InfoAsyncTask", "Error reading school information", e)
            }

    }




}