package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhm extends akho {
    private final Throwable a;

    public akhm() {
        throw null;
    }

    @Override // defpackage.akho
    public final Object a() {
        throw new IllegalStateException("This Result was a failure, and is being polled for data.");
    }

    @Override // defpackage.akho
    public final boolean b() {
        return false;
    }

    @Override // defpackage.akho
    public final Throwable c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhm) {
            return this.a.equals(((akhm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Failure{error=" + this.a.toString() + "}";
    }

    public akhm(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.a = th;
    }
}
