package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesc implements aesf {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final aerg f;
    private final aesb g;
    private final arqg h;

    public aesc(String str, String str2, String str3, Uri uri, String str4, aerg aergVar, aesb aesbVar, arqg arqgVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = aergVar;
        this.g = aesbVar;
        this.h = arqgVar;
    }

    @Override // defpackage.aeze
    public final arqg a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesc)) {
            return false;
        }
        aesc aescVar = (aesc) obj;
        if (d.F(this.a, aescVar.a) && d.F(this.b, aescVar.b) && d.F(this.c, aescVar.c) && d.F(this.d, aescVar.d) && d.F(this.e, aescVar.e) && d.F(this.f, aescVar.f) && d.F(this.g, aescVar.g) && d.F(this.h, aescVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Loaded(name=" + this.a + ", description=" + this.b + ", source=" + this.c + ", imageUri=" + this.d + ", imageContentDescription=" + this.e + ", requestListener=" + this.f + ", flags=" + this.g + ", onClick=" + this.h + ")";
    }
}
