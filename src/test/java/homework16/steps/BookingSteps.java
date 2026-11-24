package homework16.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class BookingSteps {

    @Дано("в ресторане {int} столиков вместимостью {int} человек")
    public void вРесторанеСтоликовВместимостьюЧеловек(int arg0, int arg1) {
        System.out.println("All available tables");
    }

//    хепипас
    @Дано("гость бронирует столик на {int} человека на {double}")
    public void гостьБронируетСтоликНаЧеловекаНа(int arg0, double arg2) {

    }

    @Когда("есть доступные для брони столики в {double}")
    public void естьДоступныеДляБрониСтоликиВ(double arg) {
    }

    @И("среди свободных столиков есть на {int} и более человек")
    public void средиСвободныхСтоликовЕстьНаИБолееЧеловек(int arg0) {
    }

    @Тогда("столик свободен|забронирован")
    public void столик(String arg0) {
    }

//отказ
    @Когда("нет доступных для брони стиликов на {string}")
    public void нетДоступныхДляБрониСтиликовНа(String arg0) {
    }

    @И("нет доступных столиков на {int} и более человек")
    public void нетДоступныхСтоликовНаИБолееЧеловек(int arg0) {
    }



//отмена брони
    @Дано("гость ранее забронировал столик")
    public void гостьРанееЗабронировалСтолик() {
    }

    @Когда("гость отменяет бронь")
    public void гостьОтменяетБронь() {
    }

    @Тогда("бронь отменена")
    public void броньОтменена() {

    }

    @И("столик обозначен как свободный")
    public void столикОбозначенКакСвободныи() {
    }

}
