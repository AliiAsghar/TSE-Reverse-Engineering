package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fth implements flu {
    private final euf a;
    private boolean b;
    private final /* synthetic */ int c;
    private final Object d;

    public fth(int i, byte[] bArr) {
        this.c = i;
        this.d = new ftg();
        this.a = new euf(2786);
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        if (this.c != 0) {
            int i = alog.d;
            return alsx.a;
        }
        int i2 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        if (this.c != 0) {
            ((ftg) this.d).b(flwVar, new fuq(0, 1));
            flwVar.r();
            flwVar.w(new fmj(-9223372036854775807L));
            return;
        }
        ((fti) this.d).b(flwVar, new fuq(0, 1));
        flwVar.r();
        flwVar.w(new fmj(-9223372036854775807L));
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        if (this.c != 0) {
            this.b = false;
            ((ftg) this.d).e();
        } else {
            this.b = false;
            ((fti) this.d).e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return false;
     */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.flv r19) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fth.g(flv):boolean");
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        if (this.c != 0) {
            int a = flvVar.a(this.a.a, 0, 2786);
            if (a == -1) {
                return -1;
            }
            this.a.J(0);
            this.a.I(a);
            if (!this.b) {
                ((ftg) this.d).a = 0L;
                this.b = true;
            }
            ((ftg) this.d).a(this.a);
            return 0;
        }
        int a2 = flvVar.a(this.a.a, 0, 16384);
        if (a2 == -1) {
            return -1;
        }
        this.a.J(0);
        this.a.I(a2);
        if (!this.b) {
            ((fti) this.d).a = 0L;
            this.b = true;
        }
        ((fti) this.d).a(this.a);
        return 0;
    }

    public fth(int i) {
        this.c = i;
        this.d = new fti(null, 0);
        this.a = new euf(16384);
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
