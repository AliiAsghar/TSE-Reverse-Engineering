package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuj implements cuc {
    private final ctc a;
    private final cul b;
    private final cum c;

    public cuj(ctc ctcVar, cul culVar, cum cumVar) {
        this.a = ctcVar;
        this.b = culVar;
        this.c = cumVar;
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
        if (this.c == cum.a) {
            if (this.b == cul.b) {
                d = this.a.b(dqs.a(j));
            } else {
                d = this.a.d(dqs.a(j));
            }
            if (dqs.g(j)) {
                i = dqs.a(j);
            }
            return new cuk(d, i);
        }
        if (this.b == cul.b) {
            c = this.a.a(dqs.b(j));
        } else {
            c = this.a.c(dqs.b(j));
        }
        if (dqs.h(j)) {
            i = dqs.b(j);
        }
        return new cuk(i, c);
    }

    @Override // defpackage.ctc
    public final Object f() {
        return this.a.f();
    }
}
