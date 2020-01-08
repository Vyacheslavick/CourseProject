package com.example.slavick.courseproject.Support;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;
import android.arch.persistence.room.Update;

import com.example.slavick.courseproject.Classes.Detail;
import com.example.slavick.courseproject.Classes.Supplier;
import com.example.slavick.courseproject.Classes.Supply;

import java.util.Date;
import java.util.List;

@Dao
public interface DealerDao {

    @Query("Select * from Detail ")
    List<Detail> getAllDetails();

    @Query("Select * from Detail where detailCode = :detailCode")
    Detail getDetailByCode(int detailCode);

    @Query("Select * from Detail where vendor =  :vendor")
    List<Detail> getDetailsByVendor(String vendor);

    @Update
    void updateDetail(Detail detail);

    @Delete
    void deleteDetail(Detail detail);

//    -----------------------------------------------------------------------------

    @Query("Select * from Supplier ")
    List<Supplier> getAllSuppliers();

    @Query("Select * from Supplier where srCode = :srCode")
    Supplier getSupplierByCode(int srCode);

    @Update
    void updateSupplier(Supplier supplier);

    @Delete
    void deleteSupplier(Supplier supplier);

//    -----------------------------------------------------------------------------

    @Query("Select * from Supply")
    List<Supply> getAllSupply();

    @Query("Select * from Supply where detailCode = :detailCode and srCode = :srCode")
    Supply getSupplyByCode(int detailCode, int srCode);

    @Query("Select * from Supply where date = :date")
    List<Detail> getDetailsByVendor(@TypeConverters(DateConverter.class) Date date);

    @Update
    void updateSupply(Supply supply);

    @Delete
    void deleteSupply(Supply supply);
}
