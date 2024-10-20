package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akeq extends akfs {
    private final alpt a;
    private volatile transient alpt b;

    public akeq(alpt alptVar) {
        if (alptVar != null) {
            this.a = alptVar;
            return;
        }
        throw new NullPointerException("Null childKeys");
    }

    @Override // defpackage.akfs
    public final alpt a() {
        return this.a;
    }

    @Override // defpackage.akfs, defpackage.akfd
    public final alpt b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    alpt alptVar = this.a;
                    alpr alprVar = new alpr();
                    for (Object obj : alptVar) {
                        if (obj instanceof akfd) {
                            alprVar.j(((akfd) obj).b());
                        } else {
                            alprVar.c(obj);
                        }
                    }
                    alprVar.c(this);
                    this.b = alprVar.g();
                    if (this.b == null) {
                        throw new NullPointerException("getNotificationKeys() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akfs) {
            return this.a.equals(((akfs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MergedKey{childKeys=" + this.a.toString() + "}";
    }
}
