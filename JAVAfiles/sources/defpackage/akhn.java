package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhn extends akho {
    private final Object a;

    public akhn() {
        throw null;
    }

    @Override // defpackage.akho
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.akho
    public final boolean b() {
        return true;
    }

    @Override // defpackage.akho
    public final Throwable c() {
        throw new IllegalStateException("This Result was a success, and is being polled for an error.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhn) {
            return this.a.equals(((akhn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Success{data=" + this.a.toString() + "}";
    }

    public akhn(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
    }
}
