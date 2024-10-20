package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmv implements lkg {
    public final Uri a;
    public final String b;
    public final Uri c;
    public final List d;
    public final Integer e;
    public final long f;
    public final boolean g;
    public final List h;
    public final int i;
    private final boolean j;
    private final int k;

    public lmv(Uri uri, String str, long j, boolean z) {
        this(2, uri, str, null, null, null, j, z, 1816);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmv)) {
            return false;
        }
        lmv lmvVar = (lmv) obj;
        if (this.i != lmvVar.i || !d.F(this.a, lmvVar.a) || !d.F(this.b, lmvVar.b) || !d.F(this.c, lmvVar.c) || !d.F(this.d, lmvVar.d) || !d.F(this.e, lmvVar.e) || !a.bB(this.f, lmvVar.f) || this.g != lmvVar.g || !d.F(this.h, lmvVar.h)) {
            return false;
        }
        boolean z = lmvVar.j;
        int i = lmvVar.k;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = this.i;
        a.bm(i);
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = i * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (((i2 + hashCode) * 31) + hashCode2) * 31;
        Uri uri2 = this.c;
        if (uri2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri2.hashCode();
        }
        int hashCode5 = (((i3 + hashCode3) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        return ((((((((((hashCode5 + hashCode4) * 31) + a.A(this.f)) * 31) + a.v(this.g)) * 31) + 1) * 31) + a.v(false)) * 31) + 1;
    }

    public final String toString() {
        return "MediaViewer(openingSource=" + ((Object) akec.aj(this.i)) + ", uri=" + this.a + ", contentType=" + this.b + ", photos=" + this.c + ", items=" + this.d + ", position=" + this.e + ", videoStartPosition=" + arut.l(this.f) + ", startPlayingVideo=" + this.g + ", secondaryButtons=" + this.h + ", openInEditor=false, mediaEditorType=1)";
    }

    public /* synthetic */ lmv(int i, Uri uri, String str, Uri uri2, int i2) {
        this(i, uri, str, (i2 & 8) != 0 ? null : uri2, arnv.a, null, 0L, false, 1984);
    }

    public /* synthetic */ lmv(int i, Uri uri, String str, Uri uri2, List list, Integer num, long j, boolean z, int i2) {
        list = (i2 & 16) != 0 ? arnv.a : list;
        num = (i2 & 32) != 0 ? null : num;
        if ((i2 & 64) != 0) {
            long j2 = arut.a;
            j = 0;
        }
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        uri2 = (i2 & 8) != 0 ? null : uri2;
        str = i3 != 0 ? null : str;
        uri = i4 != 0 ? null : uri;
        boolean z2 = z & ((i2 & 128) == 0);
        arnv arnvVar = arnv.a;
        list.getClass();
        this.i = i;
        this.a = uri;
        this.b = str;
        this.c = uri2;
        this.d = list;
        this.e = num;
        this.f = j;
        this.g = z2;
        this.h = arnvVar;
        this.j = false;
        this.k = 1;
    }
}
