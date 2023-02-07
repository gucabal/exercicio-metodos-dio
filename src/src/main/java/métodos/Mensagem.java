package métodos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensagem {



        public void mensagem(){
            LocalDateTime hora = LocalDateTime.now();

       if(hora.getHour() > 04 && hora.getHour() < 12  ){
           System.out.println("Bom dia!");
       }else if(hora.getHour() > 12 && hora.getHour() < 18){
           System.out.println("Boa tarde!");
       }else{
           System.out.println("Boa noite!");
       }

        }

    }




