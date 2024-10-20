package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dog implements dnd {
    private final int a;
    private final int b;

    public dog(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        if (dnhVar.k()) {
            dnhVar.f();
        }
        int u = arrn.u(this.a, 0, dnhVar.c());
        int u2 = arrn.u(this.b, 0, dnhVar.c());
        if (u != u2) {
            if (u < u2) {
                dnhVar.i(u, u2);
            } else {
                dnhVar.i(u2, u);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dog)) {
            return false;
        }
        dog dogVar = (dog) obj;
        if (this.a == dogVar.a && this.b == dogVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
