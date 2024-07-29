package com.example.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingDatabase: RoomDatabase() {
    abstract fun getShoppingDao() : ShoppingDao
}