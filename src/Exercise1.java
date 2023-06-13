// If you could receive up to eight different types of radio signals simultaneously (into your
// computer & a program you wrote) and you needed to be able to record which of those eight
// you received at any given time, what would be a highly compact (or compressed - using
// the least amount of memory or storage) way to record them (using what you learned in this
// module)? For example, you could receive signals A + B + C simultaneously, or A + D, or just
// G, etc.
//    1. If you received signals A + D + C simultaneously, how could you efficiently determine
//    that D was one of the signals you received - based on your solution above?

public class Exercise1 {
    public static void main(String[] args) {
//        G    F    E   D   C   B   A
//        64   32   16  8   4   2   1
        int ABC = 1 | 2 | 4; // 7
        int AD =    1 | 8; // 9

        int ADC = 1 | 8 | 4; // 13

//        Determina se D è presente in ADC
        System.out.println((13 & 8) == 8); // L'AND logico del segnale originale (13) AND 'D' (8) sarà uguale a 8 SE e solo SE 'D' era presente nel segnale originale.
    }
}
