package com.aliendroid.alienads;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.Nullable;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.ConsentFormListener;
import com.appodeal.consent.ConsentManager;


import java.util.List;
import java.util.Map;


public class AliendroidInitialize {
    public static boolean consent;
    public static void SelectAdsAdmob(Activity activity, String selectAdsBackup, String idInitialize) {
        Appodeal.initialize(activity, idInitialize, Appodeal.INTERSTITIAL | Appodeal.BANNER_VIEW | Appodeal.NATIVE
                | Appodeal.REWARDED_VIDEO, new ApdInitializationCallback() {
            @Override public void onInitializationFinished(@Nullable List<ApdInitializationError> list) {
            }
        });
    }



    public static void SelectAdsGoogleAds(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsApplovinDis(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsApplovinMax(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsMopub(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsStartApp(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsIron(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {
    }

    public static void SelectAdsUnity(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }


    public static void SelectAdsFAN(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {
    }

    public static void SelectAdsAlienView(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {

    }

    public static void SelectAdsAlienMediation(Activity activity, String selectAdsBackup,String idInitialize, String idInitializeBackupAds) {

    }

}
