package com.dicoding.submissions.githubuserapp_hakam.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dicoding.submissions.githubuserapp_hakam.data.local.entity.FavoriteEntity

@Dao
interface FavoriteDao {

    @Query("SELECT * FROM favorite ORDER BY username ASC")
    fun getFavoriteUserList(): LiveData<List<FavoriteEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertFavoriteUser(favorite: FavoriteEntity)

    @Delete
    fun deleteFavoriteUser(favorite: FavoriteEntity)

}