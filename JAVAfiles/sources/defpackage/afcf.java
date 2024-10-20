package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcf extends adom {
    public final String a;
    private final String b;

    public afcf(String str) {
        super(null);
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afcf)) {
            return false;
        }
        afcf afcfVar = (afcf) obj;
        if (!d.F(this.a, afcfVar.a)) {
            return false;
        }
        String str = afcfVar.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Data(data=" + this.a + ", baseUrl=null)";
    }
}
