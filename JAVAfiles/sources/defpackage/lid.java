package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lid {
    public final alog a;
    public final boolean b;

    public lid(alog alogVar) {
        this.a = alogVar;
        this.b = alogVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lid) && d.F(this.a, ((lid) obj).a)) {
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
