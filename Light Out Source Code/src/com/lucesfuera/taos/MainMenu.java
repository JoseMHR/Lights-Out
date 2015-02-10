package com.lucesfuera.taos;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainMenu extends ActionBarActivity {

	MediaPlayer mediaPlayer;
	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);

		// AdView
		AdView adView = (AdView) this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		// Intersetial.
		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-4116840717941176/4700700843");
		AdRequest adRequestInterstitial = new AdRequest.Builder().build();
		interstitial.loadAd(adRequestInterstitial);
	}

	public void onFacil(View view) {
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.boton);
		mediaPlayer.start();
		Intent intent = new Intent(this, Facil.class);
		startActivity(intent);
		this.finish();

	}

	public void onNormal(View view) {
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.boton);
		mediaPlayer.start();
		Intent intent = new Intent(this, Normal.class);
		startActivity(intent);
		this.finish();
	}

	public void onDificil(View view) {
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.boton);
		mediaPlayer.start();
		Intent intent = new Intent(this, Dificil.class);
		startActivity(intent);
		this.finish();
	}

	public void onExtremo(View view) {
		mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.boton);
		mediaPlayer.start();
		Intent intent = new Intent(this, Extremo.class);
		startActivity(intent);
		this.finish();
	}

	public void onSalir(View view) {
		displayInterstitial();
		this.finish();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			displayInterstitial();
			this.finish();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}

}
