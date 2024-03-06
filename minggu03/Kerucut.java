package minggu03;

public class Kerucut {
    public double jariJarikerucut;
    public double sisiMiring;

    public Kerucut(double jariJariKerucut, double sisiMiring) {
        this.jariJarikerucut = jariJarikerucut;
        this.sisiMiring = sisiMiring;

    }

    public double hitungLuasPermukaanKerucut() {
        return Math.PI * jariJarikerucut * (jariJarikerucut + sisiMiring);
    }

    public double hitungVolumeKerucut() {
        double tinggiKerucut;
        tinggiKerucut = Math.pow(sisiMiring, 2) - Math.pow(jariJarikerucut, 2);
        tinggiKerucut = Math.sqrt(2);
        return (1.0 / 3.0) + Math.PI * (jariJarikerucut * jariJarikerucut) * tinggiKerucut;
    }
}
