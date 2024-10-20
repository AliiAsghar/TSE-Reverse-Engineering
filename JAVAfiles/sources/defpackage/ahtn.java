package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtn {
    public final String a;
    public final Uri b;
    final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ahtn(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String l(Object obj, ahtp ahtpVar, String str) {
        return str + ahtpVar.d() + ": " + String.valueOf(obj);
    }

    public final ahtn a() {
        return new ahtn(this.a, this.b, this.c, this.d, this.e, true);
    }

    public final ahtn b() {
        if (this.c.isEmpty()) {
            return new ahtn(this.a, this.b, this.c, this.d, true, this.f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final ahtn c(String str) {
        return new ahtn(this.a, this.b, this.c, str, this.e, this.f);
    }

    @Deprecated
    public final ahtp d(String str, double d) {
        return new ahtg(this, str, Double.valueOf(d), false);
    }

    @Deprecated
    public final ahtp e(String str, int i) {
        return new ahte(this, str, Integer.valueOf(i));
    }

    @Deprecated
    public final ahtp f(String str, long j) {
        return new ahtd(this, str, Long.valueOf(j), false);
    }

    @Deprecated
    public final ahtp g(String str, boolean z) {
        return new ahtf(this, str, Boolean.valueOf(z), false);
    }

    public final ahtp h(String str, long j) {
        return new ahtd(this, str, Long.valueOf(j), true);
    }

    public final ahtp i(String str, boolean z) {
        return new ahtf(this, str, Boolean.valueOf(z), true);
    }

    @Deprecated
    public final ahtp j(String str, float f) {
        return new ahth(this, str, Float.valueOf(f));
    }

    public final void k(String str) {
        new ahtg(this, str, Double.valueOf(0.0d), true);
    }

    public ahtn(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public ahtn() {
        this("PhenotypePrefs", null, "", "", false, false);
    }
}
