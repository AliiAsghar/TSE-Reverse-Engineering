package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzz {
    public final alog a;
    public final boolean b;

    public yzz(alog alogVar) {
        this.a = alogVar;
        this.b = alogVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yzz) && d.F(this.a, ((yzz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderIndexUiData(headers=" + this.a + ")";
    }
}
