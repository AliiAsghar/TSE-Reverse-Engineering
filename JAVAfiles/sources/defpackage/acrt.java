package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrt {
    public static final acrt a;
    public static final acrt b;
    public static final acrt c;
    public static final acrt d;
    public final int e;
    public final Duration f;

    static {
        akia a2 = a();
        a2.k(1);
        a = a2.i();
        akia a3 = a();
        a3.k(2);
        b = a3.i();
        akia a4 = a();
        a4.k(3);
        c = a4.i();
        akia a5 = a();
        a5.k(4);
        d = a5.i();
    }

    public acrt() {
        throw null;
    }

    public static akia a() {
        akia akiaVar = new akia();
        akiaVar.j(Duration.ZERO);
        return akiaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acrt) {
            acrt acrtVar = (acrt) obj;
            if (this.e == acrtVar.e && this.f.equals(acrtVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.e ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "FileTransferError{type=" + this.e + ", retryAfter=" + String.valueOf(this.f) + "}";
    }

    public acrt(int i, Duration duration) {
        this.e = i;
        this.f = duration;
    }
}
