package ua.kyslun.hw7;

import java.util.Arrays;


public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double getVectorLength() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public Vector getMultiplyVector(Vector vector2) {
        Vector total = new Vector(0, 0, 0);
        total.x = this.y * vector2.z - this.z * vector2.y;
        total.y = this.z * vector2.x - this.x * vector2.z;
        total.z = this.x * vector2.y - this.y * vector2.x;
        return total;
    }


    public double getVectorCos(Vector v2) {
        double cos = (this.x * v2.x + this.y * v2.y + this.z * v2.z) / ((Math.sqrt(Math.pow(this.x, 2) +
                Math.pow(this.y, 2) + Math.pow(this.z, 2))) * (Math.sqrt(Math.pow(v2.x, 2) +
                Math.pow(v2.y, 2) + Math.pow(v2.z, 2))));
        return cos;
    }

    public Vector getVectorSum(Vector v2) {
        return new Vector(this.x + v2.x, this.y + v2.y, this.z + v2.z);
    }

    public Vector getVectorDiv(Vector v2) {
        return new Vector(this.x - v2.x, this.y - v2.y, this.z - v2.z);
    }

    public static Vector[] writeRandomVector(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(0, 0, 0);
            vectors[i].x = (int) (Math.random() * 79) + 1;
            vectors[i].y = (int) (Math.random() * 79) + 1;
            vectors[i].z = (int) (Math.random() * 79) + 1;
        }
        return vectors;
    }


    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(2, 3, 4);
        System.out.println(v1.getVectorDiv(v2));
        System.out.println(v1.getVectorCos(v2));
        System.out.println(v1.getVectorLength());
        Vector[] v = writeRandomVector(4);
        System.out.println(Arrays.toString(v));
        System.out.println(v1.getMultiplyVector(v2));
        System.out.println(v1.getVectorSum(v2));
    }
}