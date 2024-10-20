package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqb {
    public final String a;
    public final String b;
    public final String c;

    public ajqb() {
        throw null;
    }

    public static arbj a() {
        arbj arbjVar = new arbj();
        arbjVar.I("urn:ietf:params:cpim-headers:");
        return arbjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqb) {
            ajqb ajqbVar = (ajqb) obj;
            if (this.a.equals(ajqbVar.a) && this.b.equals(ajqbVar.b) && this.c.equals(ajqbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CpimMessageHeader{namespace=" + this.a + ", name=" + this.b + ", value=" + this.c + "}";
    }

    public ajqb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
