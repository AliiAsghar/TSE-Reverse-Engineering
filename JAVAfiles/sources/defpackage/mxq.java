package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxq implements myn {
    public final String a;
    public final Uri b;
    public final Optional c;
    public final Uri d;
    public final myz e;
    private final Size f;
    private final long g;
    private final boolean h;
    private final String i;
    private final Uri j;
    private final int k;

    public mxq() {
        throw null;
    }

    @Override // defpackage.myn
    public final long a() {
        return this.g;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return this.d;
    }

    @Override // defpackage.myn
    public final Uri c() {
        return this.j;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        myz myzVar;
        String str;
        Uri uri2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxq) {
            mxq mxqVar = (mxq) obj;
            if (this.a.equals(mxqVar.a) && this.b.equals(mxqVar.b) && this.f.equals(mxqVar.f) && this.c.equals(mxqVar.c) && this.g == mxqVar.g && this.h == mxqVar.h && ((uri = this.d) != null ? uri.equals(mxqVar.d) : mxqVar.d == null) && ((myzVar = this.e) != null ? myzVar.equals(mxqVar.e) : mxqVar.e == null) && ((str = this.i) != null ? str.equals(mxqVar.i) : mxqVar.i == null) && ((uri2 = this.j) != null ? uri2.equals(mxqVar.j) : mxqVar.j == null)) {
                int i = this.k;
                int i2 = mxqVar.k;
                if (i != 0) {
                    if (i == i2) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return this.e;
    }

    @Override // defpackage.myn
    public final Optional h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode();
        Uri uri = this.d;
        int i2 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        long j = this.g;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((((((((hashCode4 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ hashCode) * 1000003;
        myz myzVar = this.e;
        if (myzVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = myzVar.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.i;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Uri uri2 = this.j;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        int i6 = this.k;
        a.aS(i6);
        return ((i5 ^ i2) * 1000003) ^ i6;
    }

    @Override // defpackage.myt
    public final String i() {
        return this.i;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    @Override // defpackage.myn
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.myn
    public final boolean l() {
        return false;
    }

    @Override // defpackage.myn
    public final int m() {
        return this.k;
    }

    public final String toString() {
        Uri uri = this.j;
        myz myzVar = this.e;
        Uri uri2 = this.d;
        Optional optional = this.c;
        Size size = this.f;
        return "BugleImageContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", size=" + String.valueOf(size) + ", duration=" + String.valueOf(optional) + ", mediaModifiedTimestamp=" + this.g + ", isResizable=" + this.h + ", saveToExternalStorage=false, originalUri=" + String.valueOf(uri2) + ", progress=" + String.valueOf(myzVar) + ", caption=" + this.i + ", previewUri=" + String.valueOf(uri) + ", displayState=" + lga.aC(this.k) + "}";
    }

    public mxq(String str, Uri uri, Size size, Optional optional, long j, boolean z, Uri uri2, myz myzVar, String str2, Uri uri3, int i) {
        this.a = str;
        this.b = uri;
        this.f = size;
        this.c = optional;
        this.g = j;
        this.h = z;
        this.d = uri2;
        this.e = myzVar;
        this.i = str2;
        this.j = uri3;
        this.k = i;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
