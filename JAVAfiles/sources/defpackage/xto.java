package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xto {
    public final adiw a;

    public xto(adiw adiwVar) {
        adiwVar.getClass();
        this.a = adiwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xto) && d.F(this.a, ((xto) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tachygram(simId=" + this.a + ")";
    }
}
