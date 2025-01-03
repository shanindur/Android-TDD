package com.shanindu.android_tdd.data

import android.content.Context
import androidx.room.Room

object DatabaseProvider {

    private var DATABASE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
        return DATABASE?: synchronized(this){
            val database = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
            ).build()
            DATABASE = database
            database
        }
    }
}