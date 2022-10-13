import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

//declarar a variavel
//tipo dela, se for classe precisa ser letra maiuscula
fun main() {
    var datahora: LocalDateTime  //data/hora
    var data: LocalDate//DATAS
    var horas: LocalTime//horas

            println("Loading data from NOW  data e hora "+ LocalDateTime.now())
            println("Loading data from NOW data "+ LocalDate.now())
            println("Loading data from NOW horas "+ LocalTime.now())

println("------------------------------------------------------------------------------------")
    var datahoraFormatada: LocalDateTime  //data/hora
    var dataFormatada: LocalDate//DATAS
    var horasFormatada: LocalTime//horas

    println("Loading data from NOW  data e hora formatada "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")))
    println("Loading data from NOW data formatada  "+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
    println("Loading data from NOW horas formatada  "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))



}