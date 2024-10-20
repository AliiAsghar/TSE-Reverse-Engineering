package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byp<N> implements bwc<N> {
    private final bwc a;
    private final int b;
    private int c;

    public byp(bwc bwcVar, int i) {
        this.a = bwcVar;
        this.b = i;
    }

    @Override // defpackage.bwc
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.bwc
    public final /* synthetic */ void b(arqv arqvVar, Object obj) {
        bwb.a(this, arqvVar, obj);
    }

    @Override // defpackage.bwc
    public final void c() {
        throw null;
    }

    @Override // defpackage.bwc
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.bwc
    public final /* synthetic */ void g() {
        bwh bwhVar;
        Object a = a();
        if (a instanceof bwh) {
            bwhVar = (bwh) a;
        } else {
            bwhVar = null;
        }
        if (bwhVar != null) {
            bwhVar.d();
        }
    }

    @Override // defpackage.bwc
    public final void h() {
        if (this.c <= 0) {
            bwp.i("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.bwc
    public final void i(int i, Object obj) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.i(i + i2, obj);
    }

    @Override // defpackage.bwc
    public final void j(int i, Object obj) {
        int i2;
        if (this.c == 0) {
            i2 = this.b;
        } else {
            i2 = 0;
        }
        this.a.j(i + i2, obj);
    }

    @Override // defpackage.bwc
    public final void k(int i, int i2, int i3) {
        int i4;
        if (this.c == 0) {
            i4 = this.b;
        } else {
            i4 = 0;
        }
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.bwc
    public final void l(int i, int i2) {
        int i3;
        if (this.c == 0) {
            i3 = this.b;
        } else {
            i3 = 0;
        }
        this.a.l(i + i3, i2);
    }

    @Override // defpackage.bwc
    public final /* synthetic */ void f() {
    }
}
