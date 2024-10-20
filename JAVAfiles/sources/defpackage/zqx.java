package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqx {
    public static final alhr a = uuh.x(133388132, "enable_scheduled_send_long_click_description");
    public final Context b;
    public final Resources c;
    public final Optional d;
    public final uac e;
    private View.AccessibilityDelegate f;
    private View.AccessibilityDelegate g;

    public zqx(Context context, uac uacVar, Optional optional) {
        this.b = context;
        this.c = context.getResources();
        this.e = uacVar;
        this.d = optional;
    }

    public final synchronized View.AccessibilityDelegate a() {
        if (this.f == null) {
            this.f = new zqv();
        }
        return this.f;
    }

    public final synchronized View.AccessibilityDelegate b() {
        if (this.g == null) {
            this.g = new zqw(this);
        }
        return this.g;
    }

    public final String c(int i) {
        return this.c.getString(i);
    }

    public final String d(int i, String str) {
        return this.c.getString(i, str);
    }
}
