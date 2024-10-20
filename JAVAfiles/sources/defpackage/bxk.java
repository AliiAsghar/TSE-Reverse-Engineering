package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxk<T> implements cax<T> {
    public final byn a;

    public bxk(byn bynVar) {
        this.a = bynVar;
    }

    @Override // defpackage.cax
    public final Object a(byx byxVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bxk) && d.F(this.a, ((bxk) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
