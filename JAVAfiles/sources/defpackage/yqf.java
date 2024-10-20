package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqf {
    private final apzk a;

    public yqf(apzk apzkVar) {
        apzkVar.getClass();
        this.a = apzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yqf) && this.a == ((yqf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerdictEnforcementResult(action=" + this.a + ")";
    }
}
