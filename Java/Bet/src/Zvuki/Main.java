/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zvuki;

/**
 *
 * @author AlexC_000
 */
public class Main {
	public static void main(String[] args) {
		AePlayWave wav = new AePlayWave("sndAuth.wav");
		wav.start();
	}
}
