package minggu03;

public class Bola {
    public double jariJariBola;

    public Bola(double jariJariBola) {
        this.jariJariBola = jariJariBola;
    }

    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * (jariJariBola * jariJariBola);
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * (jariJariBola * jariJariBola * jariJariBola);
    }
}
