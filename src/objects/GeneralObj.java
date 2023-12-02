package objects;

import enums.Prepositions;

public abstract class GeneralObj {
    private String name;

    public GeneralObj(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    public String getName() {
        return name;
    }
    // статический класс
    public static class Tool{

        public static void forWhat(String reason){
            System.out.println("с тем, чтобы " + reason);
        }
    }
}