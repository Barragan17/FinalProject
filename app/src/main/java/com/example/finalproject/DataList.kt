package com.example.finalproject

import java.util.*

object DataList {
    private val places = arrayOf("Decathlon Bekasi",
        "Eastadio Futsal",
        "Prima Futsal",
        "Citra Futsal",
        "Bagus Gym",
        "Rafi Gym")

    private val details = arrayOf("Address: Jl. Bulevar Ahmad Yani, RT.007/RW.003, Harapan Mulya, Kec. Bekasi Utara, Kota Bks, Jawa Barat 17143",
        "Address: Jl. Perjuangan No.66, RT.003/RW.008, Marga Mulya, Kec. Bekasi Utara, Kota Bks, Jawa Barat 17143",
        "Address: Jl. Perjuangan No.6, RT.001/RW.004, Harapan Baru, Kec. Bekasi Utara, Kota Bks, Jawa Barat 17123",
        "Address: Jl. Alexindo, RT.003/RW.016, Kali Baru, Kecamatan Medan Satria, Kota Bks, Jawa Barat 17132",
        "Address: Jl. Batu Raden RT.009/RW.020, Kali Lama, Kecamatan Karang Satria ",
        "Address: Jl. Banyumas RT.010/RW.021, Kali Baru, Kecamatan Medan Satria ")

    private val images = intArrayOf(R.drawable.decathlon,
        R.drawable.estadio,
        R.drawable.prima,
        R.drawable.citra,
        R.drawable.gym,
        R.drawable.rafi)

    val listData: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (position in places.indices) {
                val hero = Data()
                hero.name = places[position]
                hero.detail = details[position]
                hero.photo = images[position]
                list.add(hero)
            }
            return list
        }
}