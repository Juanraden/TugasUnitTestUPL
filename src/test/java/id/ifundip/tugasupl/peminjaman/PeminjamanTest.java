package id.ifundip.tugasupl.peminjaman;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import id.ifundip.tugasupl.buku.Buku;

class PeminjamanTest {
	
	private Peminjaman peminjaman;
	
	@BeforeEach
	public void setPeminjamanDiAwal() {
		peminjaman = new Peminjaman();
	}
	
	@Test
	public void tesPeminjamanSukses() {
		Buku buku = mock(Buku.class);
		when(buku.getStokTersediaBuku()).thenReturn(10);
		
		assertEquals("Peminjaman Sukses", peminjaman.pinjamBuku(buku));
	}
	
	@Test
	public void tesPeminjamanGagal() {
		Buku buku = mock(Buku.class);
		when(buku.getStokTersediaBuku()).thenReturn(0);
		
		assertEquals("Peminjaman Gagal", peminjaman.pinjamBuku(buku));
	}
	
	@Test
	public void tesPengembalianSukses() {
		Buku buku = mock(Buku.class);
		when(buku.getStokBuku()).thenReturn(10);
		when(buku.getStokTersediaBuku()).thenReturn(9);
		
		assertEquals("Pengembalian Sukses", peminjaman.kembalikanBuku(buku));
	}
	
	@Test
	public void tesPengembalianGagal() {
		Buku buku = mock(Buku.class);
		when(buku.getStokBuku()).thenReturn(10);
		when(buku.getStokTersediaBuku()).thenReturn(10);
		
		assertEquals("Pengembalian Gagal", peminjaman.kembalikanBuku(buku));
	}

}
