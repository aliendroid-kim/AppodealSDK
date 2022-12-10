package com.aliendroid.alienads;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesStartApp;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAdmob;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesAlien;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesApplovinMax;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesFacebook;
import com.aliendroid.alienads.interfaces.natives.OnLoadSmallNativesStartApp;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.NativeIconView;
import com.appodeal.ads.NativeMediaView;
import com.appodeal.ads.native_ad.views.NativeAdView;

import java.util.List;

public class AliendroidNative {
    public static OnLoadSmallNativesAdmob onLoadSmallNativesAdmob;
    public static OnLoadSmallNativesApplovinMax onLoadSmallNativesApplovinMax;
    public static OnLoadSmallNativesFacebook onLoadSmallNativesFacebook;
    public static OnLoadSmallNativesStartApp onLoadSmallNativesStartApp;
    public static OnLoadSmallNativesAlien onLoadSmallNativesAlien;
    public static NativeAdView nativeAdViews;
    public static OnLoadMediumNativesAdmob onLoadMediumNativesAdmob;
    public static OnLoadMediumNativesApplovinMax onLoadMediumNativesApplovinMax;
    public static OnLoadMediumNativesFacebook onLoadMediumNativesFacebook;
    public static OnLoadMediumNativesStartApp onLoadMediumNativesStartApp;
    public static OnLoadMediumNativesAlien onLoadMediumNativesAlien;
    private static LinearLayout adView;
    private static NativeAd nativeAd;
    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        nativeAdViews = new NativeAdView(activity) {
            @Override
            public void setTitleView(View view) {
                super.setTitleView(view);
            }

            @Override
            public void setCallToActionView(View view) {
                super.setCallToActionView(view);
            }

            @Override
            public void setRatingView(View view) {
                super.setRatingView(view);
            }

            @Override
            public void setDescriptionView(View view) {
                super.setDescriptionView(view);
            }

            @Override
            public void setProviderView(View view) {
                super.setProviderView(view);
            }

            @Override
            public void setNativeIconView(NativeIconView nativeIconView) {
                super.setNativeIconView(nativeIconView);
            }

            @Override
            public void setNativeMediaView(NativeMediaView nativeMediaView) {
                super.setNativeMediaView(nativeMediaView);
            }

            @Override
            public View getRatingView() {
                return super.getRatingView();
            }

            @Override
            public View getProviderView() {
                return super.getProviderView();
            }

            @Override
            public List<View> getClickableViews() {
                return super.getClickableViews();
            }

            @Override
            public void registerView(NativeAd nativeAd) {
                super.registerView(nativeAd);
            }

            @Override
            public void registerView(NativeAd nativeAd, @NonNull String s) {
                super.registerView(nativeAd, s);
            }

            @Override
            public void unregisterViewForInteraction() {
                super.unregisterViewForInteraction();
            }

            @Override
            public void destroy() {
                super.destroy();
            }
        };
        showNativeAd(nativeAdViews,activity,layNative);
    }

    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }


    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }


    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        nativeAdViews = new NativeAdView(activity) {
            @Override
            public void setTitleView(View view) {
                super.setTitleView(view);
            }

            @Override
            public void setCallToActionView(View view) {
                super.setCallToActionView(view);
            }

            @Override
            public void setRatingView(View view) {
                super.setRatingView(view);
            }

            @Override
            public void setDescriptionView(View view) {
                super.setDescriptionView(view);
            }

            @Override
            public void setProviderView(View view) {
                super.setProviderView(view);
            }

            @Override
            public void setNativeIconView(NativeIconView nativeIconView) {
                super.setNativeIconView(nativeIconView);
            }

            @Override
            public void setNativeMediaView(NativeMediaView nativeMediaView) {
                super.setNativeMediaView(nativeMediaView);
            }

            @Override
            public View getRatingView() {
                return super.getRatingView();
            }

            @Override
            public View getProviderView() {
                return super.getProviderView();
            }

            @Override
            public List<View> getClickableViews() {
                return super.getClickableViews();
            }

            @Override
            public void registerView(NativeAd nativeAd) {
                super.registerView(nativeAd);
            }

            @Override
            public void registerView(NativeAd nativeAd, @NonNull String s) {
                super.registerView(nativeAd, s);
            }

            @Override
            public void unregisterViewForInteraction() {
                super.unregisterViewForInteraction();
            }

            @Override
            public void destroy() {
                super.destroy();
            }
        };
        showNativeAdBig(nativeAdViews,activity,layNative);
    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    //Rectangle
    public static void SmallNativeStartAppRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void SmallNativeAdmobRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

        nativeAdViews = new NativeAdView(activity) {
            @Override
            public void setTitleView(View view) {
                super.setTitleView(view);
            }

            @Override
            public void setCallToActionView(View view) {
                super.setCallToActionView(view);
            }

            @Override
            public void setRatingView(View view) {
                super.setRatingView(view);
            }

            @Override
            public void setDescriptionView(View view) {
                super.setDescriptionView(view);
            }

            @Override
            public void setProviderView(View view) {
                super.setProviderView(view);
            }

            @Override
            public void setNativeIconView(NativeIconView nativeIconView) {
                super.setNativeIconView(nativeIconView);
            }

            @Override
            public void setNativeMediaView(NativeMediaView nativeMediaView) {
                super.setNativeMediaView(nativeMediaView);
            }

            @Override
            public View getRatingView() {
                return super.getRatingView();
            }

            @Override
            public View getProviderView() {
                return super.getProviderView();
            }

            @Override
            public List<View> getClickableViews() {
                return super.getClickableViews();
            }

            @Override
            public void registerView(NativeAd nativeAd) {
                super.registerView(nativeAd);
            }

            @Override
            public void registerView(NativeAd nativeAd, @NonNull String s) {
                super.registerView(nativeAd, s);
            }

            @Override
            public void unregisterViewForInteraction() {
                super.unregisterViewForInteraction();
            }

            @Override
            public void destroy() {
                super.destroy();
            }
        };
        showNativeAdRectangle(nativeAdViews,activity,layNative);

    }

    public static void SmallNativeMaxRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void SmallNativeFanRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }


    public static void SmallNativeAlienRectangle(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void showNativeAd( NativeAdView nativeAdView, Activity activity, RelativeLayout layNative){
        List<NativeAd> loadedNativeAds = Appodeal.getNativeAds(1);
        if (loadedNativeAds.isEmpty()){
            //Native Ads not loaded yet
            return;
        }
        nativeAd = loadedNativeAds.get(0);

        LayoutInflater inflater = LayoutInflater.from(activity);
        adView = (LinearLayout) inflater.inflate(R.layout.appodeal_small_native, nativeAdView, false);
        layNative.addView(adView);

        TextView tvTitle = adView.findViewById(R.id.tv_title);
        tvTitle.setText(nativeAd.getTitle());
        nativeAdView.setTitleView(tvTitle);

        TextView tvDescription = adView.findViewById(R.id.tv_description);
        tvDescription.setText(nativeAd.getDescription());
        nativeAdView.setDescriptionView(tvDescription);

        RatingBar ratingBar = adView.findViewById(R.id.rb_rating);
        if (nativeAd.getRating() == 0) {
            ratingBar.setVisibility(View.INVISIBLE);
        } else {
            ratingBar.setVisibility(View.VISIBLE);
            ratingBar.setRating(nativeAd.getRating());
            ratingBar.setStepSize(0.1f);
        }
        nativeAdView.setRatingView(ratingBar);

        Button ctaButton = adView.findViewById(R.id.b_cta);
        ctaButton.setText(nativeAd.getCallToAction());
        nativeAdView.setCallToActionView(ctaButton);

        View providerView = nativeAd.getProviderView(activity);
        if (providerView != null) {
            if (providerView.getParent() != null && providerView.getParent() instanceof ViewGroup) {
                ((ViewGroup) providerView.getParent()).removeView(providerView);
            }
            FrameLayout providerViewContainer = adView.findViewById(R.id.provider_view);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            providerViewContainer.addView(providerView, layoutParams);
        }
        nativeAdView.setProviderView(providerView);

        TextView tvAgeRestrictions = adView.findViewById(R.id.tv_age_restriction);
        if (nativeAd.getAgeRestrictions() != null) {
            tvAgeRestrictions.setText(nativeAd.getAgeRestrictions());
            tvAgeRestrictions.setVisibility(View.VISIBLE);
        } else {
            tvAgeRestrictions.setVisibility(View.GONE);
        }

        NativeIconView nativeIconView = adView.findViewById(R.id.icon);
        nativeAdView.setNativeIconView(nativeIconView);

        NativeMediaView nativeMediaView = adView.findViewById(R.id.appodeal_media_view_content);
        nativeAdView.setNativeMediaView(nativeMediaView);

        nativeAdView.registerView(nativeAd);
        nativeAdView.setVisibility(View.VISIBLE);


    }

    public static void showNativeAdRectangle( NativeAdView nativeAdView, Activity activity, RelativeLayout layNative){
        List<NativeAd> loadedNativeAds = Appodeal.getNativeAds(1);
        if (loadedNativeAds.isEmpty()){
            //Native Ads not loaded yet
            return;
        }
        nativeAd = loadedNativeAds.get(0);

        LayoutInflater inflater = LayoutInflater.from(activity);
        adView = (LinearLayout) inflater.inflate(R.layout.appodeal_small_native_rectangle, nativeAdView, false);
        layNative.addView(adView);

        TextView tvTitle = adView.findViewById(R.id.tv_title);
        tvTitle.setText(nativeAd.getTitle());
        nativeAdView.setTitleView(tvTitle);

        TextView tvDescription = adView.findViewById(R.id.tv_description);
        tvDescription.setText(nativeAd.getDescription());
        nativeAdView.setDescriptionView(tvDescription);

        RatingBar ratingBar = adView.findViewById(R.id.rb_rating);
        if (nativeAd.getRating() == 0) {
            ratingBar.setVisibility(View.INVISIBLE);
        } else {
            ratingBar.setVisibility(View.VISIBLE);
            ratingBar.setRating(nativeAd.getRating());
            ratingBar.setStepSize(0.1f);
        }
        nativeAdView.setRatingView(ratingBar);

        Button ctaButton = adView.findViewById(R.id.b_cta);
        ctaButton.setText(nativeAd.getCallToAction());
        nativeAdView.setCallToActionView(ctaButton);

        View providerView = nativeAd.getProviderView(activity);
        if (providerView != null) {
            if (providerView.getParent() != null && providerView.getParent() instanceof ViewGroup) {
                ((ViewGroup) providerView.getParent()).removeView(providerView);
            }
            FrameLayout providerViewContainer = adView.findViewById(R.id.provider_view);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            providerViewContainer.addView(providerView, layoutParams);
        }
        nativeAdView.setProviderView(providerView);

        TextView tvAgeRestrictions = adView.findViewById(R.id.tv_age_restriction);
        if (nativeAd.getAgeRestrictions() != null) {
            tvAgeRestrictions.setText(nativeAd.getAgeRestrictions());
            tvAgeRestrictions.setVisibility(View.VISIBLE);
        } else {
            tvAgeRestrictions.setVisibility(View.GONE);
        }

        NativeIconView nativeIconView = adView.findViewById(R.id.icon);
        nativeAdView.setNativeIconView(nativeIconView);

        NativeMediaView nativeMediaView = adView.findViewById(R.id.appodeal_media_view_content);
        nativeAdView.setNativeMediaView(nativeMediaView);

        nativeAdView.registerView(nativeAd);
        nativeAdView.setVisibility(View.VISIBLE);


    }

    public static void showNativeAdBig( NativeAdView nativeAdView, Activity activity, RelativeLayout layNative){
        List<NativeAd> loadedNativeAds = Appodeal.getNativeAds(1);
        if (loadedNativeAds.isEmpty()){
            //Native Ads not loaded yet
            return;
        }
        nativeAd = loadedNativeAds.get(0);

        LayoutInflater inflater = LayoutInflater.from(activity);
        adView = (LinearLayout) inflater.inflate(R.layout.appodeal_big_native, nativeAdView, false);
        layNative.addView(adView);

        TextView tvTitle = adView.findViewById(R.id.tv_title);
        tvTitle.setText(nativeAd.getTitle());
        nativeAdView.setTitleView(tvTitle);

        TextView tvDescription = adView.findViewById(R.id.tv_description);
        tvDescription.setText(nativeAd.getDescription());
        nativeAdView.setDescriptionView(tvDescription);

        RatingBar ratingBar = adView.findViewById(R.id.rb_rating);
        if (nativeAd.getRating() == 0) {
            ratingBar.setVisibility(View.INVISIBLE);
        } else {
            ratingBar.setVisibility(View.VISIBLE);
            ratingBar.setRating(nativeAd.getRating());
            ratingBar.setStepSize(0.1f);
        }
        nativeAdView.setRatingView(ratingBar);

        Button ctaButton = adView.findViewById(R.id.b_cta);
        ctaButton.setText(nativeAd.getCallToAction());
        nativeAdView.setCallToActionView(ctaButton);

        View providerView = nativeAd.getProviderView(activity);
        if (providerView != null) {
            if (providerView.getParent() != null && providerView.getParent() instanceof ViewGroup) {
                ((ViewGroup) providerView.getParent()).removeView(providerView);
            }
            FrameLayout providerViewContainer = adView.findViewById(R.id.provider_view);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            providerViewContainer.addView(providerView, layoutParams);
        }
        nativeAdView.setProviderView(providerView);

        TextView tvAgeRestrictions = adView.findViewById(R.id.tv_age_restriction);
        if (nativeAd.getAgeRestrictions() != null) {
            tvAgeRestrictions.setText(nativeAd.getAgeRestrictions());
            tvAgeRestrictions.setVisibility(View.VISIBLE);
        } else {
            tvAgeRestrictions.setVisibility(View.GONE);
        }

        NativeIconView nativeIconView = adView.findViewById(R.id.icon);
        nativeAdView.setNativeIconView(nativeIconView);

        NativeMediaView nativeMediaView = adView.findViewById(R.id.appodeal_media_view_content);
        nativeAdView.setNativeMediaView(nativeMediaView);

        nativeAdView.registerView(nativeAd);
        nativeAdView.setVisibility(View.VISIBLE);


    }

}
