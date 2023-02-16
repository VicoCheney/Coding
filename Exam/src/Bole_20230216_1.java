public class Bole_20230216_1 {
    public boolean OpenAllRoom (int[][] rooms) {
        // write code here
        boolean[] booleans = new boolean[rooms.length];
        booleans[0] = true;

        read(0, booleans, rooms);

        for (boolean b:booleans) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    private static void read(int key, boolean[] vistis, int[][] rooms) {
        vistis[key] = true;
        for (int newkey:rooms[key]) {
            if (!vistis[newkey]) {
                read(newkey, vistis, rooms);
            }
        }
    }
}
