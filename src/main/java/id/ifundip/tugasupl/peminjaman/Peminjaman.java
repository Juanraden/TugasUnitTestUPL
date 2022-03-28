package id.ifundip.tugasupl.peminjaman;

import id.ifundip.tugasupl.buku.Buku;

public class Peminjaman {
	
	public String pinjamBuku(Buku buku) {
		if (buku.getStokTersediaBuku() > 0) {
			buku.setStokTersediaBuku(buku.getStokTersediaBuku() - 1);
			return "Peminjaman Sukses";
		} else {
			return "Peminjaman Gagal";
		}
	}
	
	public String kembalikanBuku(Buku buku) {
		if (buku.getStokTersediaBuku() < buku.getStokBuku()) {
			buku.setStokTersediaBuku(buku.getStokTersediaBuku() + 1);
			return "Pengembalian Sukses";
		} else {
			return "Pengembalian Gagal";
		}
	}
}
