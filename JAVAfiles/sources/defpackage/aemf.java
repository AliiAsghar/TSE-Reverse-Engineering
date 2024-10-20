package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemf {
    public final aehx a;

    public aemf(aehx aehxVar) {
        this.a = aehxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aemf) && d.F(this.a, ((aemf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveButtonUiData(callback=" + this.a + ")";
    }
}
