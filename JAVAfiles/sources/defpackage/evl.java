package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evl {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        erf.b("media3.datasource");
    }

    public evl(Uri uri, int i, byte[] bArr, Map map, long j, int i2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(z);
        d.s(true);
        dzg.g(uri);
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = -1L;
        this.g = i2;
    }

    public static String a(int i) {
        if (i != 1) {
            if (i == 2) {
                return "POST";
            }
            throw new IllegalStateException();
        }
        return "GET";
    }

    public final boolean b(int i) {
        if ((this.g & i) == i) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Uri uri = this.a;
        return "DataSpec[" + a(this.b) + " " + uri.toString() + ", " + this.e + ", -1, null, " + this.g + "]";
    }
}
