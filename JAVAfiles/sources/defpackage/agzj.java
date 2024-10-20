package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agzj {
    private final alor a = altc.a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof agzj)) {
            return false;
        }
        return alzz.am(this.a, ((agzj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("SessionInfo@%x : %s", Integer.valueOf(hashCode()), this.a);
    }
}
