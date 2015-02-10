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

public class Extremo extends ActionBarActivity {

	private static final int TAM = 6;
	private ImageButton b11;
	private ImageButton b12;
	private ImageButton b13;
	private ImageButton b14;
	private ImageButton b15;
	private ImageButton b16;
	private ImageButton b21;
	private ImageButton b22;
	private ImageButton b23;
	private ImageButton b24;
	private ImageButton b25;
	private ImageButton b26;
	private ImageButton b31;
	private ImageButton b32;
	private ImageButton b33;
	private ImageButton b34;
	private ImageButton b35;
	private ImageButton b36;
	private ImageButton b41;
	private ImageButton b42;
	private ImageButton b43;
	private ImageButton b44;
	private ImageButton b45;
	private ImageButton b46;
	private ImageButton b51;
	private ImageButton b52;
	private ImageButton b53;
	private ImageButton b54;
	private ImageButton b55;
	private ImageButton b56;
	private ImageButton b61;
	private ImageButton b62;
	private ImageButton b63;
	private ImageButton b64;
	private ImageButton b65;
	private ImageButton b66;
	boolean tabla[][] = new boolean[TAM][TAM];


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.extremo);

		// AdView
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);


		b11 = (ImageButton) findViewById(R.id.b11);
		b12 = (ImageButton) findViewById(R.id.b12);
		b13 = (ImageButton) findViewById(R.id.b13);
		b14 = (ImageButton) findViewById(R.id.b14);
		b15 = (ImageButton) findViewById(R.id.b15);
		b16 = (ImageButton) findViewById(R.id.b16);
		b21 = (ImageButton) findViewById(R.id.b21);
		b22 = (ImageButton) findViewById(R.id.b22);
		b23 = (ImageButton) findViewById(R.id.b23);
		b24 = (ImageButton) findViewById(R.id.b24);
		b25 = (ImageButton) findViewById(R.id.b25);
		b26 = (ImageButton) findViewById(R.id.b26);
		b31 = (ImageButton) findViewById(R.id.b31);
		b32 = (ImageButton) findViewById(R.id.b32);
		b33 = (ImageButton) findViewById(R.id.b33);
		b34 = (ImageButton) findViewById(R.id.b34);
		b35 = (ImageButton) findViewById(R.id.b35);
		b36 = (ImageButton) findViewById(R.id.b36);
		b41 = (ImageButton) findViewById(R.id.b41);
		b42 = (ImageButton) findViewById(R.id.b42);
		b43 = (ImageButton) findViewById(R.id.b43);
		b44 = (ImageButton) findViewById(R.id.b44);
		b45 = (ImageButton) findViewById(R.id.b45);
		b46 = (ImageButton) findViewById(R.id.b46);
		b51 = (ImageButton) findViewById(R.id.b51);
		b52 = (ImageButton) findViewById(R.id.b52);
		b53 = (ImageButton) findViewById(R.id.b53);
		b54 = (ImageButton) findViewById(R.id.b54);
		b55 = (ImageButton) findViewById(R.id.b55);
		b56 = (ImageButton) findViewById(R.id.b56);
		b61 = (ImageButton) findViewById(R.id.b61);
		b62 = (ImageButton) findViewById(R.id.b62);
		b63 = (ImageButton) findViewById(R.id.b63);
		b64 = (ImageButton) findViewById(R.id.b64);
		b65 = (ImageButton) findViewById(R.id.b65);
		b66 = (ImageButton) findViewById(R.id.b66);

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
		Intent intent = new Intent(this, Extremo.class);
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
		case "03":
			b = b14;
			break;
		case "04":
			b = b15;
			break;
		case "05":
			b = b16;
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
		case "13":
			b = b24;
			break;
		case "14":
			b = b25;
			break;
		case "15":
			b = b26;
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
		case "23":
			b = b34;
			break;
		case "24":
			b = b35;
			break;
		case "25":
			b = b36;
			break;
		case "30":
			b = b41;
			break;
		case "31":
			b = b42;
			break;
		case "32":
			b = b43;
			break;
		case "33":
			b = b44;
			break;
		case "34":
			b = b45;
			break;
		case "35":
			b = b46;
			break;
		case "40":
			b = b51;
			break;
		case "41":
			b = b52;
			break;
		case "42":
			b = b53;
			break;
		case "43":
			b = b54;
			break;
		case "44":
			b = b55;
			break;
		case "45":
			b = b56;
			break;
		case "50":
			b = b61;
			break;
		case "51":
			b = b62;
			break;
		case "52":
			b = b63;
			break;
		case "53":
			b = b64;
			break;
		case "54":
			b = b65;
			break;
		case "55":
			b = b66;
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

	public void on14(View view) {
		cambiaNumero(1, 4);
	}

	public void on15(View view) {
		cambiaNumero(1, 5);
	}

	public void on16(View view) {
		cambiaNumero(1, 6);
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

	public void on24(View view) {
		cambiaNumero(2, 4);
	}

	public void on25(View view) {
		cambiaNumero(2, 5);
	}

	public void on26(View view) {
		cambiaNumero(2, 6);
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

	public void on34(View view) {
		cambiaNumero(3, 4);
	}

	public void on35(View view) {
		cambiaNumero(3, 5);
	}

	public void on36(View view) {
		cambiaNumero(3, 6);
	}

	public void on41(View view) {
		cambiaNumero(4, 1);
	}

	public void on42(View view) {
		cambiaNumero(4, 2);
	}

	public void on43(View view) {
		cambiaNumero(4, 3);
	}

	public void on44(View view) {
		cambiaNumero(4, 4);
	}

	public void on45(View view) {
		cambiaNumero(4, 5);
	}

	public void on46(View view) {
		cambiaNumero(4, 6);
	}

	public void on51(View view) {
		cambiaNumero(5, 1);
	}

	public void on52(View view) {
		cambiaNumero(5, 2);
	}

	public void on53(View view) {
		cambiaNumero(5, 3);
	}

	public void on54(View view) {
		cambiaNumero(5, 4);
	}

	public void on55(View view) {
		cambiaNumero(5, 5);
	}

	public void on56(View view) {
		cambiaNumero(5, 6);
	}

	public void on61(View view) {
		cambiaNumero(6, 1);
	}

	public void on62(View view) {
		cambiaNumero(6, 2);
	}

	public void on63(View view) {
		cambiaNumero(6, 3);
	}

	public void on64(View view) {
		cambiaNumero(6, 4);
	}

	public void on65(View view) {
		cambiaNumero(6, 5);
	}

	public void on66(View view) {
		cambiaNumero(6, 6);
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
