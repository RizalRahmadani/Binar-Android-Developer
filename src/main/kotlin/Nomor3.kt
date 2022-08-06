fun main() {
    //bintang
    for ( i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println("")
    }
    //angka
    for ( i in 1..5){
        for (j in 1..i){
            print(i)
        }
        println(i)

    }

    //angka
    for ( i in 1..5){
        for (j in 1..i){
            print(j)
        }
        println("")
    }

    //segitiga terbalik
    for ( i in 1..5){
        for (j in 5 downTo i){
            print("*")
        }
     println("")
    }
}