package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armp implements Serializable {
    public final Throwable a;

    public armp(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof armp) && d.F(this.a, ((armp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}
