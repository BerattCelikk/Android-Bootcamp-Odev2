package com.beratcelik.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    fun soru1(degree:Int):Int{
        val fahrenheit = (degree * 9 / 5) +32
        return fahrenheit
    }
    fun soru2(side1 : Int,side2:Int): Int {
        val rectangle = (side1 + side2) * 2
        return rectangle
    }
    fun soru3(number:Int):Int{
        var factorial = 1
        for(i in 1..number ){
            factorial*=i
        }
        return factorial
    }
    fun soru4(kelime:String) : Int{
        var sayac = 0
        for(harf in kelime){
            if(harf == 'a' || harf == 'A'){
                sayac++
            }
        }
        return sayac
    }
    fun soru5(side_number : Int) : Int{
        var ic_acilar_toplam = (side_number-2)* 180
        return  ic_acilar_toplam
    }
    fun soru6(gun : Int) : Int {
        var maas = 0
        val saat = gun * 8

        if (saat <= 160) {
            maas = saat * 10
        } else {
            val mesaiSaat = saat - 160
            maas = (160 * 10) + (mesaiSaat * 20)
        }

        return maas
    }
    fun soru7(total_gb : Int,) : Int{
        var ucret = 100
        if(total_gb >50){
            ucret = ucret + (total_gb-50)*4
        }
        return  ucret
    }
}
