package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxa {
    public final agej a;
    public final agej b;

    public afxa(agej agejVar, agej agejVar2) {
        this.a = agejVar;
        this.b = agejVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afxa)) {
            return false;
        }
        afxa afxaVar = (afxa) obj;
        if (d.F(this.a, afxaVar.a) && d.F(this.b, afxaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + ((agei) this.b).a;
    }

    public final String toString() {
        return "Tint(background=" + this.a + ", icon=" + this.b + ")";
    }
}
