fun main(){

    //Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média
   // dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

  var num = 0
  var mul = 0

    do {
        print("Me diga um numero: ")
        var i = readLine()!!.toInt()

        if (i % 3 == 0 && i != 0) {
            mul++
            num += i
        }
    }while (i != 0)

    var conv = num.toDouble() / mul.toDouble()


          println("Media dos multiplos são : $conv")
    }










}