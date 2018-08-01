public enum SuitType {
    SPADE(3),
    HEART(2),
    DIAMOND(1),
    CLUB(0);

    private final int ranking;

    SuitType(int ranking){
        this.ranking = ranking;
    }

    public int getRanking(){
        return this.ranking;
    }
}
