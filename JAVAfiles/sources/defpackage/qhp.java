package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qhp extends qhl {
    public final qei a;

    public qhp(qei qeiVar) {
        qeiVar.getClass();
        this.a = qeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qhp) && d.F(this.a, ((qhp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshRegistrationData(selfChatEndpoint=" + this.a + ")";
    }
}
