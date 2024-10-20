package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myz {
    public final ncq a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public myz() {
        throw null;
    }

    public static myy a() {
        myy myyVar = new myy();
        myyVar.f(false);
        myyVar.g(false);
        myyVar.e(false);
        myyVar.b(false);
        myyVar.c(false);
        myyVar.d(false);
        return myyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myz) {
            myz myzVar = (myz) obj;
            if (this.a.equals(myzVar.a) && this.b == myzVar.b && this.c == myzVar.c && this.d == myzVar.d && this.e == myzVar.e && this.f == myzVar.f && this.g == myzVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i6 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i7 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (true != this.d) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i9 = (i8 ^ i3) * 1000003;
        if (true != this.e) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i10 = (i9 ^ i4) * 1000003;
        if (true != this.f) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i11 = (i10 ^ i5) * 1000003;
        if (true == this.g) {
            i6 = 1231;
        }
        return i11 ^ i6;
    }

    public final String toString() {
        return "BugleFileTransferProgress{progress=" + String.valueOf(this.a) + ", isTransferring=" + this.b + ", isYetToManualDownload=" + this.c + ", isManualDownloading=" + this.d + ", isAutoDownloading=" + this.e + ", hasPermanentFailure=" + this.f + ", isCms=" + this.g + "}";
    }

    public myz(ncq ncqVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = ncqVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }
}
