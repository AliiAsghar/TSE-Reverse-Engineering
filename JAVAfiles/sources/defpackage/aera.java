package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aera implements aeqx {
    public final String a;
    private final Uri b;
    private final String c;
    private final arqg d;
    private final aeqz e;

    public aera(Uri uri, String str, arqg arqgVar, String str2, aeqz aeqzVar) {
        this.b = uri;
        this.c = str;
        this.d = arqgVar;
        this.a = str2;
        this.e = aeqzVar;
    }

    @Override // defpackage.aeqx
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.aeqx
    public final String b() {
        return this.c;
    }

    @Override // defpackage.aeqx
    public final arqg c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aera)) {
            return false;
        }
        aera aeraVar = (aera) obj;
        if (d.F(this.b, aeraVar.b) && d.F(this.c, aeraVar.c) && d.F(this.d, aeraVar.d) && d.F(this.a, aeraVar.a) && d.F(this.e, aeraVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + 1237;
    }

    public final String toString() {
        return "GalleryVideoUiData(uri=" + this.b + ", contentDescription=" + this.c + ", onClick=" + this.d + ", formattedTimeString=" + this.a + ", flags=" + this.e + ")";
    }
}
