package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc {
    private ActivityOptions d;
    private Bundle e;
    public final Intent a = new Intent("android.intent.action.VIEW");
    public final mka c = new mka();
    public int b = 0;

    public final void a(efu efuVar) {
        this.e = efuVar.p();
    }

    public final fdx b() {
        LocaleList adjustedDefault;
        int size;
        String str;
        Bundle bundle;
        Locale locale;
        Bundle bundle2 = null;
        if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            this.a.putExtras(bundle3);
        }
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        this.a.putExtras(this.c.l().p());
        Bundle bundle4 = this.e;
        if (bundle4 != null) {
            this.a.putExtras(bundle4);
        }
        this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.b);
        adjustedDefault = LocaleList.getAdjustedDefault();
        size = adjustedDefault.size();
        if (size > 0) {
            locale = adjustedDefault.get(0);
            str = locale.toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.a.hasExtra("com.android.browser.headers")) {
                bundle = this.a.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", str);
                this.a.putExtra("com.android.browser.headers", bundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.d == null) {
                this.d = ActivityOptions.makeBasic();
            }
            this.d.setShareIdentityEnabled(false);
        }
        ActivityOptions activityOptions = this.d;
        if (activityOptions != null) {
            bundle2 = activityOptions.toBundle();
        }
        return new fdx(this.a, bundle2);
    }
}
