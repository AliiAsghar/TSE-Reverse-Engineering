package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdm extends akec {
    public final Throwable a;

    public akdm(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akdm) && d.F(this.a, ((akdm) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
