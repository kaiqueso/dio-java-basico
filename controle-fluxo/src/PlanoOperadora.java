public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "P";

        switch (plano) {
            case "T": {
                System.out.println("TIM");
                break;
            }

            case "V": {
                System.out.println("VIVO");
                break;
            }

            case "C": {
                System.out.println("CLARO");
                break;
            }

            default: {
                System.out.println("Operadora não identificada");
            }
        }
    }
}
