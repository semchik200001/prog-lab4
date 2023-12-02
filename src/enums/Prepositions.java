package enums;

public enum Prepositions {
    ABOVETHEM("над ними"), ON("на"), ONBOTHSIDES("по сторонам"), AFTERTHEM("вслед за ними"),
    THOUGH("через"), UNDERFEET("под ногами"), IN("В"), BY("по"),
    FROMALLSIDES("со всех сторон"), AROUND("вокруг"), NEARBY("неподалеку"),
    ONLYTHAT("лишь о том,что"), AND("И"), WITHYOU("с собой"),
    INALLSIDES("во все стороны"), WITH("с "), INFRONTOF("перед собой"),BEFORE("до"),
    BYTHEM("по нему");
    private String value;
    Prepositions(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
