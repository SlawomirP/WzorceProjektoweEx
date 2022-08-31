package factoryExpl.metodaFabrykujaca;

public class Tank extends Unit {
    //usuniecie modyfiktora dostepu spowoduje ze tylko klasy z tej
    //paczki beda mogly stworzyc ten obiekt
    Tank(int hp, int exp, int dmg) {
        super(hp, exp, dmg);
    }
}
