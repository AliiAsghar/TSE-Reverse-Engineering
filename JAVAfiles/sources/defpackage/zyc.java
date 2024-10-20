package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyc {
    public final alog a;

    public zyc(alog alogVar) {
        this.a = alogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zyc) && d.F(this.a, ((zyc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsUiData(actions=" + this.a + ")";
    }
}
