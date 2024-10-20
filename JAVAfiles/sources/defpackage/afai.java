package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afai implements afaj, aetq {
    public final afag a;
    private final String b;

    public afai(String str, afag afagVar) {
        str.getClass();
        this.b = str;
        this.a = afagVar;
    }

    @Override // defpackage.aetq
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afai)) {
            return false;
        }
        afai afaiVar = (afai) obj;
        if (d.F(this.b, afaiVar.b) && d.F(this.a, afaiVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SingleLine(id=" + this.b + ", line=" + this.a + ")";
    }
}
