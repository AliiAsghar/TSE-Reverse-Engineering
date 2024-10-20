package com.google.android.gms.gmscompliance.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.abbh;
import defpackage.acah;
import defpackage.agxw;
import defpackage.ahnz;
import defpackage.ajvj;
import defpackage.ajvk;
import defpackage.ajwg;
import defpackage.appq;
import defpackage.edh;
import defpackage.edz;
import defpackage.ex;
import defpackage.ivq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UncertifiedDeviceActivity extends ex {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Spanned fromHtml;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            if (ajwg.a == null) {
                appq appqVar = new appq((char[]) null);
                appqVar.b = R.style.SudThemeGlif_DayNight;
                appqVar.b();
                ajwg.a = appqVar.a();
            }
            appq appqVar2 = new appq(ajwg.a);
            appqVar2.b = 0;
            appqVar2.b();
            if (true != appqVar2.a().d) {
                i = R.style.SudThemeGlifV3_Light;
            } else {
                i = R.style.SudThemeGlifV3_DayNight;
            }
        }
        if (i != 0) {
            setTheme(i);
        }
        Window window = getWindow();
        agxw agxwVar = ajvk.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        ajvj ajvjVar = new ajvj();
        ajvjVar.c = window;
        ajvjVar.a = 3;
        ajvjVar.d.run();
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{android.R.attr.statusBarColor, android.R.attr.navigationBarColor});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
        setContentView(R.layout.auth_uncertified_activity_v2);
        if (Build.VERSION.SDK_INT >= 35 && getApplicationInfo().targetSdkVersion >= 35) {
            edz.k(getWindow().getDecorView(), new edh() { // from class: acag
                @Override // defpackage.edh
                public final efo ez(View view, efo efoVar) {
                    view.setPadding(0, efoVar.f(1).c, 0, efoVar.f(64).e);
                    return efo.a;
                }
            });
        }
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(getColor(R.color.play_protect_auth_navigation_bar_color));
        }
        ahnz.u((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (!TextUtils.isEmpty(stringExtra) && intent != null) {
                Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new ivq(this, intent, bundleExtra, 14, (short[]) null));
            } else {
                button.setVisibility(4);
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (!TextUtils.isEmpty(stringExtra2)) {
                fromHtml = Html.fromHtml(stringExtra2, 63);
                textView.setText(fromHtml);
                ahnz.u(textView, LinkMovementMethod.getInstance());
                Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new abbh((Object) this, (Object) intent2, 5));
                }
            } else {
                textView.setVisibility(4);
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new acah(this, 0));
        }
    }
}
