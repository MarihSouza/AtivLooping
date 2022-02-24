fun main(){

    //Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
 // O programa termina quando idade for =-99.

     var i = 0
     var n21 = 0
     var n50 = 0
     var num = 0

               while(i != -99){

                   print("Me diga sua idade: ")
                   i = readLine()!!.toInt()

                            if(i < 21){
                                n21++


                            }else if(i <50){
                                   n50 ++



                            }
               }
                  println("Pessoas com menos de 21 anos são $n21" + " Pessoas com mais de 50 anos $n50")


}