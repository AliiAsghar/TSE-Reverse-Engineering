package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbs {
    public final erx a;
    public alog b;
    public fgv c;
    public fgv d;
    public fgv e;
    private alor f;

    public fbs(erx erxVar) {
        this.a = erxVar;
        int i = alog.d;
        this.b = alsx.a;
        this.f = altc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fgv b(ert ertVar, alog alogVar, fgv fgvVar, erx erxVar) {
        Object f;
        int i;
        erz H = ertVar.H();
        int v = ertVar.v();
        if (H.q()) {
            f = null;
        } else {
            f = H.f(v);
        }
        if (!ertVar.R() && !H.q()) {
            i = H.n(v, erxVar).b(eul.u(ertVar.A()) - erxVar.e);
        } else {
            i = -1;
        }
        for (int i2 = 0; i2 < alogVar.size(); i2++) {
            fgv fgvVar2 = (fgv) alogVar.get(i2);
            if (e(fgvVar2, f, ertVar.R(), ertVar.s(), ertVar.t(), i)) {
                return fgvVar2;
            }
        }
        if (alogVar.isEmpty() && fgvVar != null) {
            if (e(fgvVar, f, ertVar.R(), ertVar.s(), ertVar.t(), i)) {
                return fgvVar;
            }
        }
        return null;
    }

    private final void d(alok alokVar, fgv fgvVar, erz erzVar) {
        if (fgvVar != null) {
            if (erzVar.a(fgvVar.a) != -1) {
                alokVar.h(fgvVar, erzVar);
                return;
            }
            erz erzVar2 = (erz) this.f.get(fgvVar);
            if (erzVar2 != null) {
                alokVar.h(fgvVar, erzVar2);
            }
        }
    }

    private static boolean e(fgv fgvVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!fgvVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (fgvVar.b != i || fgvVar.c != i2) {
                return false;
            }
        } else if (fgvVar.b != -1 || fgvVar.e != i3) {
            return false;
        }
        return true;
    }

    public final erz a(fgv fgvVar) {
        return (erz) this.f.get(fgvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(erz erzVar) {
        alok alokVar = new alok();
        if (this.b.isEmpty()) {
            d(alokVar, this.d, erzVar);
            if (!d.B(this.e, this.d)) {
                d(alokVar, this.e, erzVar);
            }
            if (!d.B(this.c, this.d) && !d.B(this.c, this.e)) {
                d(alokVar, this.c, erzVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                d(alokVar, (fgv) this.b.get(i), erzVar);
            }
            if (!this.b.contains(this.c)) {
                d(alokVar, this.c, erzVar);
            }
        }
        this.f = alokVar.b();
    }
}
