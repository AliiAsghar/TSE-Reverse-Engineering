package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevq {
    public final aevp a;
    public final aevo b;
    public final aevn c;

    public aevq(aevp aevpVar, aevo aevoVar, aevn aevnVar) {
        this.a = aevpVar;
        this.b = aevoVar;
        this.c = aevnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevq)) {
            return false;
        }
        aevq aevqVar = (aevq) obj;
        if (d.F(this.a, aevqVar.a) && d.F(this.b, aevqVar.b) && d.F(this.c, aevqVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        aevp aevpVar = this.a;
        int i = 0;
        if (aevpVar == null) {
            hashCode = 0;
        } else {
            hashCode = aevpVar.hashCode();
        }
        aevo aevoVar = this.b;
        if (aevoVar != null) {
            i = aevoVar.hashCode();
        }
        int i2 = hashCode * 31;
        if (this.c == null) {
            return (i2 + i) * 31;
        }
        throw null;
    }

    public final String toString() {
        return "SeparatorsUiData(text=" + this.a + ", lastReadMarker=" + this.b + ", aiSummary=" + this.c + ")";
    }

    public aevq() {
        this(null, null, null);
    }
}
