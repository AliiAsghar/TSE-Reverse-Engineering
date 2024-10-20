package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qtp {
    public final qss a;
    private final int b;

    public qtp(qss qssVar) {
        qssVar.getClass();
        this.a = qssVar;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtp)) {
            return false;
        }
        qtp qtpVar = (qtp) obj;
        if (!d.F(this.a, qtpVar.a)) {
            return false;
        }
        int i = qtpVar.b;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a.bm(2);
        return hashCode + 2;
    }

    public final String toString() {
        return "GroupMember(destinationToken=" + this.a + ", role=MEMBER)";
    }
}
