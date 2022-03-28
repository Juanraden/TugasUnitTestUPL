package id.ifundip.tugasupl.buku;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BukuTest {
	
	private Buku buku;
	
	@BeforeEach
	public void setBukuDiAwal() {
		buku = new Buku("judul buku", 10);
	}
	
	@Test
	void testGetIdBuku() {
		buku = mock(Buku.class);
		when(buku.getIdBuku()).thenReturn("1");
		assertEquals("1", buku.getIdBuku());
	}
	
	@Test
	void testGetJudulBuku() {
		assertEquals("judul buku", buku.getJudulBuku());
	}
	
	@Test
	void testGetStokBuku() {
		assertEquals(10, buku.getStokBuku());
	}
	
	@Test
	void testGetStokTersediaBuku() {
		assertEquals(10, buku.getStokTersediaBuku());
	}
	
	@Test
	void testSetJudulBuku() {
		buku.setJudulBuku("judul buku baru");
		assertEquals("judul buku baru", buku.getJudulBuku());
	}
	
	@Test
	void testSetStokBuku() {
		buku.setStokBuku(11);
		assertEquals(11, buku.getStokBuku());
	}
	
	@Test
	void testSetStokTersediaBuku() {
		buku.setStokTersediaBuku(9);
		assertEquals(9, buku.getStokTersediaBuku());
	}

}
