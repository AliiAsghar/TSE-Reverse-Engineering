package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akem extends akec {
    public final Object a;
    public final akeo b;

    public akem(Object obj, akeo akeoVar) {
        this.a = obj;
        this.b = akeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akem)) {
            return false;
        }
        akem akemVar = (akem) obj;
        if (d.F(this.a, akemVar.a) && d.F(this.b, akemVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        akeo akeoVar = this.b;
        if (akeoVar != null) {
            i = akeoVar.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "Rereading(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
