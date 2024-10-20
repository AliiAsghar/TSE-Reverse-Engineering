package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apyg extends apyh {
    private final Object a;

    public apyg(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.apyh
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apyg) {
            return d.B(this.a, ((apyg) obj).a);
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
        return "Produced[" + this.a + "]";
    }
}
