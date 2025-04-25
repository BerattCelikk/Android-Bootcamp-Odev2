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
}
