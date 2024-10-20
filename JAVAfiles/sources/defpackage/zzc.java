package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzc {
    public final alog a;

    public zzc(alog alogVar) {
        this.a = alogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzc) && d.F(this.a, ((zzc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderActionsUiData(actions=" + this.a + ")";
    }
}
