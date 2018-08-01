public class Card {
    private SuitType suitType;
    private NumberType numberType;

    public Card(SuitType suitType, NumberType numberType){
        this.suitType = suitType;
        this.numberType = numberType;
    }

    public SuitType getSuitType(){
        return this.suitType;
    }

    public NumberType getNumberType(){
        return this.numberType;
    }
}
