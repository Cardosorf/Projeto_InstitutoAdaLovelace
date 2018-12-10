package com.ms.sigada.teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ms.sigada.view.ManterAlunoForm;

public class ManterAlunoFormTestes {

	@Test
	public final void testVerifyCPF_Validos() {
		ManterAlunoForm t = new ManterAlunoForm("");
		Assert.assertEquals(true, t.verifyCPF("47763581077"));
		Assert.assertEquals(true, t.verifyCPF("49870235123"));
		Assert.assertEquals(true, t.verifyCPF("05093936081"));
		Assert.assertEquals(true, t.verifyCPF("13372061055"));
	}
	
	@Test
	public final void testVerifyCPF_Invalidos() {
		ManterAlunoForm t = new ManterAlunoForm("");
		Assert.assertEquals(false, t.verifyCPF("11111111111"));
		Assert.assertEquals(false, t.verifyCPF("87415447545"));
		Assert.assertEquals(false, t.verifyCPF("65485475422"));
		Assert.assertEquals(false, t.verifyCPF("89754124586"));
		Assert.assertEquals(false, t.verifyCPF("34651238569"));
		Assert.assertEquals(false, t.verifyCPF("abcdefrthyu"));
	}
	
	
	
}
