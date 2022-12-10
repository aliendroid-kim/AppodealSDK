package com.aliendroid.alienads;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.interstitial.admob.OnFullScreenContentCallbackAdmob;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAdmob;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAlienMediation;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialAlienView;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialApplovinDiscovery;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialApplovinMax;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialFacebook;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialGoogle;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialIronSource;
import com.aliendroid.alienads.interfaces.interstitial.load.OnLoadInterstitialStartApp;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAlienMediation;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAlienView;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialApplovinDiscovery;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialApplovinMax;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialFacebook;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialGoogle;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialIronSource;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialStartApp;
import com.appodeal.ads.Appodeal;


public class AliendroidIntertitial {
    public  static int counter=0;
    public static OnLoadInterstitialAdmob onLoadInterstitialAdmob;
    public static OnShowInterstitialAdmob onShowInterstitialAdmob;

    public static OnShowInterstitialGoogle onShowInterstitialGoogle;
    public static OnLoadInterstitialGoogle onLoadInterstitialGoogle;

    public static OnLoadInterstitialFacebook onLoadInterstitialFacebook;
    public static OnShowInterstitialFacebook onShowInterstitialFacebook;

    public static OnLoadInterstitialApplovinDiscovery onLoadInterstitialApplovinDiscovery;
    public static OnShowInterstitialApplovinDiscovery onShowInterstitialApplovinDiscovery;

    public static OnLoadInterstitialApplovinMax onLoadInterstitialApplovinMax;
    public static OnShowInterstitialApplovinMax onShowInterstitialApplovinMax;

    public static OnLoadInterstitialIronSource onLoadInterstitialIronSource;
    public static OnShowInterstitialIronSource onShowInterstitialIronSource;

    public static OnLoadInterstitialStartApp onLoadInterstitialStartApp;
    public static OnShowInterstitialStartApp onShowInterstitialStartApp;

    public static OnLoadInterstitialAlienMediation onLoadInterstitialAlienMediation;
    public static OnLoadInterstitialAlienView onLoadInterstitialAlienView;

    public static OnShowInterstitialAlienMediation onShowInterstitialAlienMediation;
    public static OnShowInterstitialAlienView onShowInterstitialAlienView;

    public static OnFullScreenContentCallbackAdmob onFullScreenContentCallbackAdmob;
    public static void LoadIntertitialUnity(Activity activity, String selectAds, String idIntertitial, String idBackupIntertitial) {

    }


    public static void LoadIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void LoadIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup
    ) {

    }

    public static void LoadIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5
    ) {

    }

    public static void LoadIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialStartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }


    public static void LoadIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void ShowIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
        if (counter >= interval) {
            if(Appodeal.isLoaded(Appodeal.INTERSTITIAL )){
                Appodeal.show(activity, Appodeal.INTERSTITIAL);
            }
            LoadIntertitialAdmob(activity, selectAdsBackup, idIntertitial, idIntertitialBackup, Hpk1, Hpk2, Hpk3, Hpk4, Hpk5);
            counter = 0;
        } else {
            counter++;
        }
    }

    public static void ShowIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {

    }

    public static void ShowIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval, String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5) {

    }
    public static void ShowIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {
    }

    public static void ShowIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                           int interval) {

    }

    public static void ShowIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }


    public static void ShowIntertitialSartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                              int interval) {
    }


    public static void ShowIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                          int interval) {
    }

    public static void ShowIntertitialUnity(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }

    public static void ShowIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval) {
    }
}
