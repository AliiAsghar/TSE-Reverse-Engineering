package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfd implements agfe {
    public final agcb a;

    public agfd(agcb agcbVar) {
        this.a = agcbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agfd) && d.F(this.a, ((agfd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Keyboard(keyboard=" + this.a + ")";
    }
}
