package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cau<T> implements cax<T> {
    public final Object a;

    public cau(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cax
    public final Object a(byx byxVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cau) && d.F(this.a, ((cau) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
