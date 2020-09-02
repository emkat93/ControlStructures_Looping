fun main(){
    var userAns = 0
    var userString = "x"
    var isexit = true

    do{
        println("1. Pizza, fries, and cola combo")
        println("2. Hot-dog, onion rings, and mountain dew combo")
        println("3. Burger, waffle fries, beer")
        println("4. BLT, chips, and lemonade combo")
        println("5. Salad, fruit bowl and tea combo")
        println("6. Exit")

        print("Enter Choice ")
        userAns = readLine()!!.toInt()
        when (userAns){
            1 -> {userString = "Pizza, fries, and cola combo"
            isexit = false
            }
            2 -> {userString = "Hot-dog, onion rings, and mountain dew combo"
            isexit = false
            }
            3 -> {userString = "Burger, waffle fries, beer"
            isexit = false
            }
            4 -> {userString = "BLT, chips, and lemonade combo"
            isexit = false
            }
            5 -> {userString = "Salad, fruit bowl and tea combo"
            isexit = false
            }
            6 -> {userString = "Exit"
            isexit = false
            }
            !in 1..6 -> println("Invalid Option, Please Try Again")

        }
    } while (isexit)


    println("You have selected: ")
    println("$userString")

}