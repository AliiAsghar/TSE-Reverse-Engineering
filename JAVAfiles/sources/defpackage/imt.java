package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imt implements imv, myn {
    public final String a;
    public final Uri b;
    public final ameb c;
    public final Size d;
    public final Optional e;
    public final long f;
    public final ampy g;
    private final boolean h;
    private final boolean i;
    private final int j;

    public imt() {
        throw null;
    }

    public static ims n() {
        ims imsVar = new ims(null);
        imsVar.f(-1L);
        imsVar.b = 1;
        return imsVar;
    }

    @Override // defpackage.myn
    public final long a() {
        return this.f;
    }

    @Override // defpackage.mxf
    public final Uri b() {
        return null;
    }

    @Override // defpackage.myn
    public final Uri c() {
        return null;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imt) {
            imt imtVar = (imt) obj;
            if (this.a.equals(imtVar.a) && this.b.equals(imtVar.b) && this.c.equals(imtVar.c) && this.d.equals(imtVar.d) && this.e.equals(imtVar.e) && this.f == imtVar.f && this.h == imtVar.h && this.i == imtVar.i && this.g.equals(imtVar.g)) {
                int i = this.j;
                int i2 = imtVar.j;
                if (i != 0) {
                    if (i2 == 1) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // defpackage.afcq
    public final /* synthetic */ afcp fh() {
        return hwr.m(this);
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    @Override // defpackage.mxf
    public final /* synthetic */ boolean fk() {
        return lga.aE(this);
    }

    @Override // defpackage.mxf
    public final myz fl() {
        return null;
    }

    @Override // defpackage.imv
    public final ameb g() {
        return this.c;
    }

    @Override // defpackage.myn
    public final Optional h() {
        return this.e;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode();
        int i2 = 1237;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j = this.f;
        int i3 = ((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003;
        if (true == this.i) {
            i2 = 1231;
        }
        int hashCode2 = ((i3 ^ i2) * 1000003) ^ this.g.hashCode();
        a.aS(this.j);
        return (hashCode2 * 1525764945) ^ 1;
    }

    @Override // defpackage.myt
    public final String i() {
        return null;
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
        return this.i;
    }

    @Override // defpackage.myn
    public final int m() {
        return this.j;
    }

    public final String toString() {
        ampy ampyVar = this.g;
        Optional optional = this.e;
        Size size = this.d;
        ameb amebVar = this.c;
        return "CameraContent{contentType=" + this.a + ", uri=" + String.valueOf(this.b) + ", contentSource=" + String.valueOf(amebVar) + ", size=" + String.valueOf(size) + ", caption=null, duration=" + String.valueOf(optional) + ", mediaModifiedTimestamp=" + this.f + ", isResizable=" + this.h + ", saveToExternalStorage=" + this.i + ", captureInfo=" + String.valueOf(ampyVar) + ", originalUri=null, previewUri=null, progress=null, displayState=" + lga.aC(this.j) + "}";
    }

    public imt(String str, Uri uri, ameb amebVar, Size size, Optional optional, long j, boolean z, boolean z2, ampy ampyVar) {
        this.a = str;
        this.b = uri;
        this.c = amebVar;
        this.d = size;
        this.e = optional;
        this.f = j;
        this.h = z;
        this.i = z2;
        this.g = ampyVar;
        this.j = 1;
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }

    @Override // defpackage.mxf
    public final /* synthetic */ void fm() {
    }
}
