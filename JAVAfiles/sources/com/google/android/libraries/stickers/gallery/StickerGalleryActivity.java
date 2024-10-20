package com.google.android.libraries.stickers.gallery;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import defpackage.ahmc;
import defpackage.ahsa;
import defpackage.aiqi;
import defpackage.airg;
import defpackage.aova;
import defpackage.ex;
import defpackage.ivf;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StickerGalleryActivity extends ex {
    public boolean n;
    private int o;
    private airg p;
    private boolean q = false;

    public final void A() {
        NetworkInfo activeNetworkInfo;
        if (!this.q) {
            ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                this.q = true;
                runOnUiThread(new ahsa(this, 12));
                Log.e("StickerGalleryActivity", "No internet connection.");
            }
        }
    }

    public final boolean B() {
        return ahmc.N(this.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.re, android.app.Activity
    public final void onBackPressed() {
        if (!this.p.f()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.o = getIntent().getIntExtra("theme_mode", 0);
        if (B()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        ((aiqi) getApplicationContext()).b();
        int intExtra = getIntent().getIntExtra("starting_page", 0);
        this.n = getIntent().getBooleanExtra("show_back_button", false);
        airg airgVar = new airg(this, this);
        this.p = airgVar;
        setContentView(airgVar);
        if (intExtra != 0) {
            airg airgVar2 = this.p;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    if (intExtra == 3) {
                        airgVar2.e();
                    }
                } else {
                    airgVar2.e.j(1);
                    airgVar2.b();
                }
            } else {
                airgVar2.e.j(0);
                airgVar2.b();
            }
        }
        if (Build.VERSION.SDK_INT >= 27) {
            ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new ivf(16));
            this.p.setOnApplyWindowInsetsListener(new ivf(17));
        }
        A();
    }

    public final void y(aova aovaVar) {
        Intent intent = new Intent(this, (Class<?>) PackDetailsActivity.class);
        intent.putExtra("sticker_pack", aovaVar.toByteArray());
        intent.putExtra("theme_mode", this.o);
        if (getCallingActivity() != null) {
            startActivityForResult(intent, 1);
        } else {
            startActivity(intent);
        }
    }

    public final void z() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/collection/promotion_30029ba_stickers_apps_gboard"));
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("StickerGalleryActivity", "Failed to start play store stickers intent: ".concat(intent.toString()), e);
        }
    }
}
