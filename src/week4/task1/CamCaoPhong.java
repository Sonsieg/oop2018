package week4.task1;

public class CamCaoPhong extends QuaCam {
    private double khoiluong;
    private String huongvi;

    public CamCaoPhong(double x, String hv){
        this.khoiluong = x;
        this.huongvi = hv;
    }

    public CamCaoPhong(){
        this.khoiluong = 0;
        this.huongvi = "";
    }

    public double getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(double khoiluong) {
        this.khoiluong = khoiluong;
    }

    public String getHuongvi() {
        return huongvi;
    }

    public void setHuongvi(String huongvi) {
        this.huongvi = huongvi;
    }


    public void gioiThieucamcaophong(CamCaoPhong s){
        System.out.println("Cam cao phong co vi " + s.getHuongvi());
        System.out.println("Cam cao phong khoi luong " + s.getKhoiluong());
    }

    public void inCamcaophong( CamCaoPhong c1, CamCaoPhong c2){
        System.out.println(c1.getTenqua()+", Noi nhap:  " + c1.getNoinhap());
        System.out.println(c2.getTenqua()+", Noi nhap:  " + c2.getNoinhap());
    }

}