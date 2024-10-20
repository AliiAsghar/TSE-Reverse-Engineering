package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apyf extends apyh {
    private final Throwable a;

    public apyf(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.apyh
    public final Object a() {
        throw new ExecutionException(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apyf) {
            return this.a.equals(((apyf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Produced[failed with " + this.a.getClass().getCanonicalName() + "]";
    }
}
