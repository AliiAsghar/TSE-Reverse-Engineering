package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyq implements cuc {
    private final ctc a;
    private final cys b;
    private final cyt c;

    public cyq(ctc ctcVar, cys cysVar, cyt cytVar) {
        this.a = ctcVar;
        this.b = cysVar;
        this.c = cytVar;
    }

    @Override // defpackage.ctc
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.ctc
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.ctc
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.ctc
    public final int d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.cuc
    public final cvc e(long j) {
        int c;
        int d;
        int i = 32767;
        if (this.c == cyt.a) {
            if (this.b == cys.b) {
                d = this.a.b(dqs.a(j));
            } else {
                d = this.a.d(dqs.a(j));
            }
            if (dqs.g(j)) {
                i = dqs.a(j);
            }
            return new cyr(d, i);
        }
        if (this.b == cys.b) {
            c = this.a.a(dqs.b(j));
        } else {
            c = this.a.c(dqs.b(j));
        }
        if (dqs.h(j)) {
            i = dqs.b(j);
        }
        return new cyr(i, c);
    }

    @Override // defpackage.ctc
    public final Object f() {
        return this.a.f();
    }
}
