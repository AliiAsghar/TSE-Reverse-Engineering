package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lot implements lkg {
    public final Uri a;
    public final long b;
    public final int c;
    public final int d;

    public lot(Uri uri, long j, int i, int i2) {
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lot)) {
            return false;
        }
        lot lotVar = (lot) obj;
        if (d.F(this.a, lotVar.a) && this.b == lotVar.b && this.c == lotVar.c && this.d == lotVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.A(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "VideoTrimmer(uri=" + this.a + ", maxOutputFileKb=" + this.b + ", outputWidthPx=" + this.c + ", outputHeightPx=" + this.d + ")";
    }
}
