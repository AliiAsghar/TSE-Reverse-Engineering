package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doi implements dnd {
    private final int a;
    private final int b;

    public doi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        int u = arrn.u(this.a, 0, dnhVar.c());
        int u2 = arrn.u(this.b, 0, dnhVar.c());
        if (u < u2) {
            dnhVar.j(u, u2);
        } else {
            dnhVar.j(u2, u);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doi)) {
            return false;
        }
        doi doiVar = (doi) obj;
        if (this.a == doiVar.a && this.b == doiVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
