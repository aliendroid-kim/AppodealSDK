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
 <b>maven { url "https://artifactory.appodeal.com/appodeal"} </b>
 
<b>D. Pengaturan Iklan</b>
1. Iklan di sematkan pada SELECT_MAIN_ADS ="ADMOB"
2. SWITCH_OPEN_ADS diisi angka 2 (non open ads Admob), jika diisi 1 maka aplikasi akan berhenti di halaman awal
3. Masukan APP ID Appodeal di bagian INITIALIZE_MAIN_ADS dan INITIALIZE_BACKUP_ADS 

 <b>E. Plus Minus Single dan Multy SDK Ads</b>
<br />1. Multy Ads memiliki ukuran file 10-15mb dengan sistem switch, backup, open bidding dan mediasi, sehingga ukuran file akan menjadi lebih besar.<br />2. Kekurangan dari single SDK tidak bisa melakukan backup maupun switch sehingga setiap akan mengganti ads harus melakukan update aplikasi, dan SDK Appodeal memiliki ukuran file yang sangat besar <br />3. Untuk mengganti setiap SDK silahkan buka build.gradle dan ganti SDK <strong>AlienMultyAds, </strong>sesuaikan dengan Iklan yang dipilih</p>
<p><img src="https://aliendro.id/uploads/blog/202210/img_635264a9b00592-48631043-54973966.jpg" alt="" width="793" height="538" /></p>
<p>4. Pada beberapa Ads, membutuhkan maven untuk melakukan konfigurasi sdk, Maven terletak di settings.gradle atau build.gradle project</p>
<p><img src="https://aliendro.id/uploads/blog/202210/img_6352656b2fac19-97214146-62944342.jpg" alt="" width="794" height="401" /></p>
<p><img src="https://aliendro.id/uploads/blog/202210/img_6352659840bba4-34791743-27851708.jpg" alt="" width="801" height="482" /></p>
<p>5. Jika proses penggantian gagal silahkan cek kembali bagian apa saja yang harus di tambah atau lakukan <strong>file-invalidate</strong></p>
