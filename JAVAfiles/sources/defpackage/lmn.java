package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmn implements lkf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/ForwardMessage");
    public final mym b;

    public lmn(miz mizVar) {
        this.b = mizVar.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lmn) && d.F(this.b, ((lmn) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ForwardMessage(content=" + this.b + ")";
    }
}
