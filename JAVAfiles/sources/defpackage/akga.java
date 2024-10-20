package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akga extends akfd {
    private final alpt a;

    public akga() {
        throw null;
    }

    @Override // defpackage.akfd
    public final alpt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akga) {
            return this.a.equals(((akga) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetKey{notificationKeys=" + this.a.toString() + "}";
    }

    public akga(alpt alptVar) {
        if (alptVar == null) {
            throw new NullPointerException("Null notificationKeys");
        }
        this.a = alptVar;
    }
}
