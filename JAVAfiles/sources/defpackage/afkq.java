package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afkq {
    public final aflb a;
    public final afku b;

    public afkq(aflb aflbVar, afku afkuVar) {
        aflbVar.getClass();
        this.a = aflbVar;
        this.b = afkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afkq)) {
            return false;
        }
        afkq afkqVar = (afkq) obj;
        if (d.F(this.a, afkqVar.a) && d.F(this.b, afkqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftController(textController=" + this.a + ", attachmentsController=" + this.b + ")";
    }
}
