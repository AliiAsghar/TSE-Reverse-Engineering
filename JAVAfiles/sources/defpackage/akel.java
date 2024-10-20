package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akel extends akec {
    public final akeo a;

    public akel(akeo akeoVar) {
        this.a = akeoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akel) && d.F(this.a, ((akel) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        akeo akeoVar = this.a;
        if (akeoVar == null) {
            return 0;
        }
        return akeoVar.hashCode();
    }

    public final String toString() {
        return "Reading(cause=" + this.a + ")";
    }
}
