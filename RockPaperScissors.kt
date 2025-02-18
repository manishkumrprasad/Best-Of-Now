fun main() {
    var computer = ""
    var player = ""

    print("Enter Your Choice Rock, Paper , Or Scissors = ")
    player = readln()

    val randomnum = (1..3).random()

//    var computer = when(randomnum){
//        1 -> computer = "Rock"
//        2 -> computer = "Paper"
//        3 -> computer = "Scissors"
//    }

    if(randomnum == 1 ){
        computer = "rock"
    }else if(randomnum == 2){
        computer = "paper"
    }else if(randomnum == 3){
        computer = "scissor"
    }

    if (player  == "rock"){
        if(computer == "rock"){
            println("Same Choice Selected Retry")
        }else if(computer == "paper"){
            println("You Lose")
            println("The Choice Of Computer Was $computer")
        }else if(computer == "scissor") {
            println("Congo You Won")
        }
    }

    else if (player == "paper"){
        if(computer == "paper"){
            println("Same Choice Selected Retry")
        }else if(computer == "scissor"){
            println("You Lose")
            println("The Choice Of Computer Was $computer")
        }else if(computer == "rock") {
            println("Congo You Won")
        }
    }

    else if(player == "scissor"){
        if(computer == "scissor"){
            println("Same Choice Selected Retry")
        }else if(computer == "rock"){
            println("You Lose")
            println("The Choice Of Computer Was $computer")
        }else if(computer == "paper") {
            println("Congo You Won")
        }
    }



}