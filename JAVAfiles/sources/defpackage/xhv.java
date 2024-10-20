package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhv implements Comparable {
    private final Optional a;

    public xhv() {
        this.a = Optional.empty();
    }

    @Deprecated
    public static xhv b(long j) {
        if (j == -1) {
            return new xhv();
        }
        return new xhv(j);
    }

    public final long a() {
        return ((Long) this.a.get()).longValue();
    }

    public final boolean c() {
        if (!d()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xhv xhvVar = (xhv) obj;
        if (this.a.isPresent() && xhvVar.a.isPresent()) {
            return ((Long) this.a.get()).compareTo((Long) xhvVar.a.get());
        }
        if (this.a.isPresent() == xhvVar.a.isPresent()) {
            return 0;
        }
        if (!this.a.isPresent()) {
            return -1;
        }
        return 1;
    }

    public final boolean d() {
        if (!this.a.isEmpty() && ((Long) this.a.get()).longValue() >= 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof xhv)) {
            return this.a.equals(((xhv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "threadId=".concat(this.a.toString());
    }

    public xhv(long j) {
        this.a = Optional.of(Long.valueOf(j));
    }
}
