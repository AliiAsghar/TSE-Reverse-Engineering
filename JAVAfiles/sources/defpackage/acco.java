package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acco {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public acco() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acco) {
            acco accoVar = (acco) obj;
            if (this.a.equals(accoVar.a) && this.b.equals(accoVar.b) && this.c.equals(accoVar.c) && this.d.equals(accoVar.d) && this.e.equals(accoVar.e) && this.f.equals(accoVar.f) && this.g.equals(accoVar.g) && this.h == accoVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "BuildInfo{fingerprint=" + this.a + ", brand=" + this.b + ", product=" + this.c + ", device=" + this.d + ", model=" + this.e + ", manufacturer=" + this.f + ", baseOs=" + this.g + ", sdkInt=" + this.h + "}";
    }

    public acco(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
    }
}
