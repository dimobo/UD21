package com.ud21.geometria.UD21Ejercicio01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	static Geometria[] geo = new Geometria[9];
	Geometria geoTest;

	@BeforeAll
	private static void before() {
		System.out.println("before()");
		geo[0] = new Geometria();
		geo[1] = new Geometria(1);
		geo[2] = new Geometria(2);
		geo[3] = new Geometria(3);
		geo[4] = new Geometria(4);
		geo[5] = new Geometria(5);
		geo[6] = new Geometria(6);
		geo[7] = new Geometria(7);
		geo[8] = new Geometria(8);
	}

	@Test
	void testGeometria() {
		System.out.println("testGeometria()");
		geoTest = new Geometria();
		assertEquals(geoTest.getId(), geo[0].getId());
	}

	@Test
	void testFiguraDefault() {
		System.out.println("testFiguraDefault()");
		geoTest = new Geometria(9);
		assertEquals(geoTest.getId(), geo[0].getId());
	}

	@Test
	void testAreaCuadrado() {
		System.out.println("testAreaCuadrado()");
		int cos = 2;
		double area = cos * cos;
		geo[1].setArea(geo[1].areacuadrado(cos));
		assertEquals(area, geo[1].getArea());
	}

	@Test
	void testAreaCirculo() {
		System.out.println("testAreaCirculo()");
		int radio = 4;
		final double PI = 3.1416;
		double area = PI * Math.pow(radio, 2);
		geo[2].setArea(geo[2].areaCirculo(radio));
		assertEquals(area, geo[2].getArea());
	}

	@Test
	void testAreaTriangulo() {
		System.out.println("testAreaTriangulo()");
		int altura = 4, base = 8;
		double area = (altura * base) / 2;
		geo[3].setArea(geo[3].areatriangulo(altura, base));
		assertEquals(area, geo[3].getArea());
	}

	@Test
	void testAreaRectangulo() {
		System.out.println("testAreaRectangulo()");
		int altura = 4, base = 8;
		double area = altura * base;
		geo[4].setArea(geo[4].arearectangulo(base, altura));
		assertEquals(area, geo[4].getArea());
	}

	@Test
	void testAreaPentagono() {
		System.out.println("testAreaPentagono()");
		int p = 4, a = 8;
		double area = (p * a) / 2;
		geo[5].setArea(geo[5].areapentagono(p, a));
		assertEquals(area, geo[5].getArea());
	}

	@Test
	void testAreaRombo() {
		System.out.println("testAreaRombo()");
		int D = 4, d = 8;
		double area = (D * d) / 2;
		geo[5].setArea(geo[5].arearombo(D, d));
		assertEquals(area, geo[5].getArea());
	}

	@Test
	void testAreaRomboide() {
		System.out.println("testAreaRomboide()");
		int b = 4, h = 8;
		double area = b * h;
		geo[5].setArea(geo[5].arearomboide(b, h));
		assertEquals(area, geo[5].getArea());

	}

	@Test
	void testAreaTrapecio() {
		System.out.println("testAreaTrapecio()");
		int B = 2, b = 4, h = 8;
		double area = ((B + b) / 2) * h;
		geo[5].setArea(geo[5].areatrapecio(B, b, h));
		assertEquals(area, geo[5].getArea());

	}

	@Test
	public void testToString() {
		System.out.println("testToString()");
		int cos = 2;
		geo[1].setArea(geo[1].areacuadrado(cos));
		System.out.println(geo[1].toString());
		assertEquals(geo[1].toString(), "Geometria [id=1, nom=cuadrado, area=4.0]");
	}

}
