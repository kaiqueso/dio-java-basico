public class Comentarios {
    // olá, eu sou um comentário de linha
    /*
     * Eu sou um comentario de bloco
     */

     public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é o resultado

        if (m == "M") { // M = multiplica
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }

        return r;
     }
}
