public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVectorLength(Vector vector) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector getMultiplyVector(Vector vector1, Vector vector2) {
        Vector total = new Vector(0, 0, 0);
        total.x = vector1.y * vector2.z - vector1.z * vector2.y;
        total.y = vector1.z * vector2.x - vector1.x * vector2.z;
        total.z = vector1.x * vector2.y - vector1.y * vector2.x;
        return total;
    }


    public double getVectorCos(Vector v1, Vector v2) {
        double cos = (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z) / (Math.sqrt(Math.pow(v1.x, 2) +
                +Math.pow(v1.y, 2) + Math.pow(v1.z, 2))) * (Math.sqrt(Math.pow(v2.x, 2) +
                +Math.pow(v2.y, 2) + Math.pow(v2.z, 2)));
        return cos;
    }

    public Vector getVectorSum(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public Vector getVectorDiv(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }
    public static Vector[] writeRandomVector(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i].x = (int) Math.random() * 79 + 1;
            vectors[i].y = (int) Math.random() * 79 + 1;
            vectors[i].z = (int) Math.random() * 79 + 1;
        }
        return vectors;
    }
}
