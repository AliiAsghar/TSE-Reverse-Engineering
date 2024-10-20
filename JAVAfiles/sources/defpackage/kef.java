package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kef implements aeze {
    public final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final arqg f;

    public kef(String str, String str2, String str3, String str4, String str5, arqg arqgVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
        this.e = str5;
        this.f = arqgVar;
    }

    @Override // defpackage.aeze
    public final arqg a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kef)) {
            return false;
        }
        kef kefVar = (kef) obj;
        if (d.F(this.b, kefVar.b) && d.F(this.c, kefVar.c) && d.F(this.d, kefVar.d) && d.F(this.a, kefVar.a) && d.F(this.e, kefVar.e) && d.F(this.f, kefVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "YoutubePreviewUiData(name=" + this.b + ", description=" + this.c + ", source=" + this.d + ", videoId=" + this.a + ", imageContentDescription=" + this.e + ", onClick=" + this.f + ")";
    }
}
