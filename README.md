Update Source Code (SC) dan Libs Alien SDK itu gratis, tapi jika ingin memberikan dukungan kepada pengembang SC silahkan anda bisa melakukan saweran dengan cara scan QR Code dibawah atau akses link https://aliendro.id/saweran
<p><img src="https://aliendro.id/uploads/images-file-manager/202211/img_63738decd99593-65171035-52358629.jpg" alt="" style="display: block; margin-left: auto; margin-right: auto;" /></p>
 <b>A. Deskirpsi </b>

Alien Single SDK Ads Appodeal, adalah libs tambahan untuk mengganti iklan Alien Multy Ads (minimal versi Neptunus-19) bawaan Source Code Aliendroid dengan iklan Appodeal

 <b>B. Mediasi Ads : </b>
1. Admob
2. Meta Audience Network
3. Applovin
4. IronScoure
5. Unity Ads

 <b>C. Cara Pasang </b>

Ganti <b>implementation 'com.github.aliendroid-kim:AlienMultyAds:Neptunus-21'</b> yang ada di Gradle Module, 
dengan <b>implementation 'com.github.aliendroid-kim:AppodealSDK:Bimasakti-01'</b>

lalu tambahan Maven di Gradle Project
 <b>maven { url "https://artifactory.appodeal.com/appodeal"} </>
