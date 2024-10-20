package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpn {
    public final long a;
    public long b;
    long c;
    int d;
    int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    public int j;
    String k;
    public asiy l;
    int m;
    ashu n;
    int o;
    int p;
    public int q;
    public int r;
    public int s;
    public algw t;
    public int u;
    public int v;
    int w;

    public ahpn(String str) {
        this(null, str, false, SystemClock.elapsedRealtime());
    }

    public static ahpn a(String str, ahka ahkaVar) {
        return new ahpn(str, ahka.d(ahkaVar), true, SystemClock.elapsedRealtime());
    }

    public final void b(int i, int i2) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = i;
        this.e = i2;
    }

    public final void c(String str) {
        if (!albo.ah(str)) {
            this.k = str;
        }
    }

    public ahpn(String str, String str2, boolean z, long j) {
        this.w = 1;
        this.s = -1;
        this.g = albo.af(str);
        this.f = albo.af(str2);
        this.h = z;
        this.a = j;
        this.t = alfd.a;
    }
}
