package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzw {
    public static final abzw a;
    public final String b;
    public final int c;
    public final String d;

    static {
        abzv abzvVar = new abzv();
        abzvVar.b = "gmscompliance-pa.googleapis.com";
        abzvVar.b();
        abzvVar.a = "AIzaSyAZyAvJ8K9XaZCj_nrBkIYRe_iyODXJxAk";
        a = abzvVar.a();
        abzv abzvVar2 = new abzv();
        abzvVar2.b = "staging-gmscompliance-pa.sandbox.googleapis.com";
        abzvVar2.b();
        abzvVar2.a = "AIzaSyBJO1-Q7JrHnlrtDZgengd4liAMLoT7sIU";
        abzvVar2.a();
    }

    public abzw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abzw) {
            abzw abzwVar = (abzw) obj;
            if (this.b.equals(abzwVar.b) && this.c == abzwVar.c && this.d.equals(abzwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "UdevsSpec{hostName=" + this.b + ", hostPort=" + this.c + ", apiKey=" + this.d + "}";
    }

    public abzw(String str, int i, String str2) {
        this.b = str;
        this.c = i;
        this.d = str2;
    }
}
