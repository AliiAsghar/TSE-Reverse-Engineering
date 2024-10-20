package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lls implements lkf {
    public final llt a;

    public lls(llt lltVar) {
        this.a = lltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lls) && d.F(this.a, ((lls) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(arguments=" + this.a + ")";
    }
}
