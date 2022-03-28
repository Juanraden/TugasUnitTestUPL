package id.ifundip.tugasupl.buku;

public class Buku {

    private String id;
	private String judul;
    private int stok;
    private int stokTersedia;
    
    public Buku() {
		this.judul = "Tidak ada";
		this.stok = 0;
		this.stokTersedia = 0;
	}
    
    public Buku(String judul, int stok) {
    	this.judul = judul;
    	this.stok = stok;
    	this.stokTersedia = stok;
    }
    
	public String getIdBuku() {
		return this.id;
	}
	
	public String getJudulBuku() {
		return this.judul;
	}
	
	public int getStokBuku() {
		return this.stok;
	}
	
	public int getStokTersediaBuku() {
		return this.stokTersedia;
	}
	
	public void setJudulBuku(String judul) {
		this.judul = judul;
	}
	
	public void setStokBuku(int stok) {
		this.stok = stok;
	}
	
	public void setStokTersediaBuku(int stokTersedia) {
		this.stokTersedia = stokTersedia;
	}
	
}
