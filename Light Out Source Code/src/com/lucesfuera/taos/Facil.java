package com.lucesfuera.taos;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class Facil extends ActionBarActivity {

	private static final int TAM = 3;
	private ImageButton b11;
	private ImageButton b12;
	private ImageButton b13;
	private ImageButton b21;
	private ImageButton b22;
	private ImageButton b23;
	private ImageButton b31;
	private ImageButton b32;
	private ImageButton b33;
	boolean tabla[][] = new boolean[TAM][TAM];


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facil);

		// AdView
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		b11 = (ImageButton) findViewById(R.id.b11);
		b12 = (ImageButton) findViewById(R.id.b12);
		b13 = (ImageButton) findViewById(R.id.b13);
		b21 = (ImageButton) findViewById(R.id.b21);
		b22 = (ImageButton) findViewById(R.id.b22);
		b23 = (ImageButton) findViewById(R.id.b23);
		b31 = (ImageButton) findViewById(R.id.b31);
		b32 = (ImageButton) findViewById(R.id.b32);
		b33 = (ImageButton) findViewById(R.id.b33);

		for (int column = 0; column < TAM; column++) {
			for (int row = 0; row < TAM; row++) {
				tabla[column][row] = false;
			}
		}
	}

	public void onBack(View view) {
		Intent intent = new Intent(this, MainMenu.class);
		startActivity(intent);
		this.finish();
	}

	public void onReset(View view) {
		Intent intent = new Intent(this, Facil.class);
		startActivity(intent);
		this.finish();
	}

	public void cambiarFondo(int i, int j) {
		ImageButton b;
		String ij = i + "" + j;
		switch (ij) {
		case "00":
			b = b11;
			break;
		case "01":
			b = b12;
			break;
		case "02":
			b = b13;
			break;
		case "10":
			b = b21;
			break;
		case "11":
			b = b22;
			break;
		case "12":
			b = b23;
			break;
		case "20":
			b = b31;
			break;
		case "21":
			b = b32;
			break;
		case "22":
			b = b33;
			break;
		default:
			b = b11;
		}

		tabla[i][j] = !tabla[i][j];
		boolean encendido = tabla[i][j];
		if (encendido) {
			b.setBackgroundColor(0x000099);
			b.setImageResource(R.drawable.lighton);
		} else {
			b.setBackgroundColor(0x000000);
			b.setImageResource(R.drawable.lightoff);
		}
	}

	public void cambiaNumero(int i, int j) {
		i = i - 1;
		j = j - 1;

		cambiarFondo(i, j);
		if ((j + 1) < TAM) {
			cambiarFondo(i, j + 1);
		}
		if ((j - 1) >= 0) {
			cambiarFondo(i, j - 1);
		}
		if ((i + 1) < TAM) {
			cambiarFondo(i + 1, j);
		}
		if ((i - 1) >= 0) {
			cambiarFondo(i - 1, j);
		}

		boolean terminado = true;
		for (int row = 0; row < TAM; row++) {
			for (int column = 0; column < TAM; column++) {
				if (tabla[row][column] == false) {
					terminado = false;
				}
			}
		}
		if (terminado) {
			Intent intent = new Intent(this, Terminado.class);
			startActivity(intent);
			this.finish();
		}
	}

	public void on11(View view) {
		cambiaNumero(1, 1);
	}

	public void on12(View view) {
		cambiaNumero(1, 2);
	}

	public void on13(View view) {
		cambiaNumero(1, 3);
	}

	public void on21(View view) {
		cambiaNumero(2, 1);
	}

	public void on22(View view) {
		cambiaNumero(2, 2);
	}

	public void on23(View view) {
		cambiaNumero(2, 3);
	}

	public void on31(View view) {
		cambiaNumero(3, 1);
	}

	public void on32(View view) {
		cambiaNumero(3, 2);
	}

	public void on33(View view) {
		cambiaNumero(3, 3);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent();
			intent.setClass(this, MainMenu.class);
			startActivity(intent);
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
