public class ClassZhangElven {

    // 模仿扫雷地形

    public static void thunder(int[][] terrain) {
        int count = 0;
        for (int i = 0; i < 16; i++) {
            for (int a = 0; a < 16; a++) {
                if (count <= 40) {
                    terrain[i][a] = -1;
                    count++;
                } else {
                    terrain[i][a] = 0;
                }
            }
        }
    }

    public static void sort(int[][] terrain) {
        int count = 0;
        for (int i = 0; i < 16; i++) {
            for (int a = 0; a < 16; a++) {
                int b = (int) (Math.random() * 16);
                int c = (int) (Math.random() * 16);
                terrain[b][c] = terrain[i][a];
                count++;
                if (count == 40) {
                    break;
                }
            }
        }
    }

    public static void Calculation(int[][] terrain) {
        for (int i = 0; i < 16; i++) {
            for (int a = 0; a < 16; a++) {
                if (terrain[i][a] == -1 && i != 15 && a != 15 && i != 0 && a != 0) {
                    terrain[i][a - 1]++;
                    terrain[i][a + 1]++;
                    terrain[i - 1][a]++;
                    terrain[i + 1][a]++;
                    terrain[i - 1][a + 1]++;
                    terrain[i - 1][a - 1]++;
                    terrain[i + 1][a + 1]++;
                    terrain[i + 1][a - 1]++;
                } else if (terrain[i][a] == -1 && i == 15 && a != 15 && i != 0 && a != 0) {
                    terrain[i][a - 1]++;
                    terrain[i - 1][a]++;
                    terrain[i - 1][a + 1]++;
                    terrain[i - 1][a - 1]++;
                    terrain[i][a + 1]++;
                } else if (terrain[i][a] == -1 && i != 15 && a == 15 && i != 0 && a != 0) {
                    terrain[i][a - 1]++;
                    terrain[i - 1][a]++;
                    terrain[i + 1][a]++;
                    terrain[i - 1][a - 1]++;
                    terrain[i + 1][a - 1]++;
                } else if (terrain[i][a] == -1 && i != 15 && a != 15 && i == 0 && a != 0) {
                    terrain[i][a - 1]++;
                    terrain[i][a + 1]++;
                    terrain[i + 1][a]++;
                    terrain[i + 1][a + 1]++;
                    terrain[i + 1][a - 1]++;
                } else if (terrain[i][a] == -1 && i != 15 && a != 15 && i != 0 && a == 0) {
                    terrain[i][a + 1]++;
                    terrain[i - 1][a]++;
                    terrain[i + 1][a]++;
                    terrain[i - 1][a + 1]++;
                    terrain[i + 1][a + 1]++;
                }
            }
        }
    }

    public static void Conversion(int[][] terrain, String[][] trueTerrain) {
        for (int i = 0; i < 16; i++) {
            for (int a = 0; a < 16; a++) {
                if (terrain[i][a] != -1) {
                    trueTerrain[i][a] = String.valueOf(terrain[i][a]);
                } else {
                    trueTerrain[i][a] = "*";
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] terrain = new int[16][16];
        thunder(terrain);
        sort(terrain);
        Calculation(terrain);
        String[][] trueTerrain = new String[16][16];
        Conversion(terrain, trueTerrain);
        for (int i = 0; i < 16; i++) {
            for (int a = 0; a < 16; a++) {
                System.out.print(trueTerrain[i][a] + "\t");
            }
            System.out.println();
        }
    }
}