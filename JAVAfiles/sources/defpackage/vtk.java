package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtk {
    public long a;

    public final vtm a() {
        return new vtm(this.a);
    }

    public final void b(vtl vtlVar) {
        this.a &= ~vtlVar.e;
    }

    public final void c(vtl vtlVar) {
        this.a |= vtlVar.e;
    }

    public final rvd d() {
        return new rvd(this.a);
    }

    public final void e(vbe vbeVar) {
        this.a |= vbeVar.a();
    }

    public vtk(long j) {
        this.a = j;
    }

    public vtk(eqv eqvVar) {
        this.a = eqvVar.b;
    }

    public vtk(byte[] bArr) {
    }
}
