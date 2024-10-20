package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqne implements aqnd {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;
    public static final ahvf e;
    public static final ahvf f;
    public static final ahvf g;
    public static final ahvf h;
    public static final ahvf i;
    public static final ahvf j;
    public static final ahvf k;
    public static final ahvf l;
    public static final ahvf m;
    public static final ahvf n;

    static {
        altg altgVar = altg.a;
        a = ahvj.d("SuperpacksFlags__additional_download_labels", new ahvh(3), "Cg8KB3JlbGVhc2USBHByb2Q", "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        b = ahvj.c("SuperpacksFlags__always_download_on_startup", false, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        c = ahvj.a("SuperpacksFlags__classification_count_limit_per_protection", 1000L, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        d = ahvj.c("SuperpacksFlags__download_requires_charging", false, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        e = ahvj.c("SuperpacksFlags__download_requires_wifi", false, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        f = ahvj.c("SuperpacksFlags__enable_classification_count_based_protection_decay", true, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        g = ahvj.c("SuperpacksFlags__enable_default_client_role", true, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        h = ahvj.c("SuperpacksFlags__enable_flexible_downloads", false, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        i = ahvj.c("SuperpacksFlags__enable_persephone_downloads", false, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        j = ahvj.b("SuperpacksFlags__persephone_api_key", "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8", "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        k = ahvj.b("SuperpacksFlags__persephone_host_url", "ondevicesafety-pa.googleapis.com", "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        l = ahvj.a("SuperpacksFlags__protection_decay_period_days", -1L, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        m = ahvj.a("SuperpacksFlags__protection_download_period", 7L, "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
        n = ahvj.d("SuperpacksFlags__protection_download_policy", new ahvh(4), "CgYIAhAAGAASDgoECID1JBIGCAIQABgA", "com.google.android.libraries.abuse.hades.moirai", altgVar, true, false);
    }

    @Override // defpackage.aqnd
    public final long a(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.aqnd
    public final long b(Context context) {
        return ((Long) l.a(context)).longValue();
    }

    @Override // defpackage.aqnd
    public final long c(Context context) {
        return ((Long) m.a(context)).longValue();
    }

    @Override // defpackage.aqnd
    public final iap d(Context context) {
        return (iap) a.a(context);
    }

    @Override // defpackage.aqnd
    public final aecq e(Context context) {
        return (aecq) n.a(context);
    }

    @Override // defpackage.aqnd
    public final String f(Context context) {
        return (String) j.a(context);
    }

    @Override // defpackage.aqnd
    public final String g(Context context) {
        return (String) k.a(context);
    }

    @Override // defpackage.aqnd
    public final boolean h(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean i(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean j(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean k(Context context) {
        return ((Boolean) f.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean l(Context context) {
        return ((Boolean) g.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean m(Context context) {
        return ((Boolean) h.a(context)).booleanValue();
    }

    @Override // defpackage.aqnd
    public final boolean n(Context context) {
        return ((Boolean) i.a(context)).booleanValue();
    }
}
