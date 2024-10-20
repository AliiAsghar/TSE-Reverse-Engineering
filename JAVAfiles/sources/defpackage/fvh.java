package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvh extends fxb {
    private final esp e;
    private final ewl f;
    private final ewl g;
    private final fve h;
    private final fvg i;
    private final eqn j;
    private boolean k;
    private long l;
    private final fvp m;

    /* JADX WARN: Multi-variable type inference failed */
    public fvh(eqn eqnVar, eqn eqnVar2, fxh fxhVar, fvz fvzVar, alog alogVar, fvl fvlVar, fwy fwyVar, fwr fwrVar) {
        super(eqnVar, fwyVar);
        fve fveVar = new fve(alogVar);
        this.h = fveVar;
        this.j = eqnVar2;
        this.i = fveVar.a(fvzVar, eqnVar2);
        esp espVar = fveVar.b.a;
        this.e = espVar;
        dzg.d(!espVar.equals(esp.a));
        eqm eqmVar = new eqm();
        String str = fxhVar.b;
        if (str == null) {
            str = eqnVar.o;
            dzg.g(str);
        }
        eqmVar.b(str);
        eqmVar.C = espVar.b;
        eqmVar.B = espVar.c;
        eqmVar.D = espVar.d;
        eqmVar.j = eqnVar2.k;
        eqn eqnVar3 = new eqn(eqmVar);
        eqm eqmVar2 = new eqm(eqnVar3);
        eqmVar2.b(k(eqnVar3, fwyVar.b(1)));
        eqn eqnVar4 = new eqn(eqmVar2);
        fvj fvjVar = (fvj) fvlVar;
        fvl fvlVar2 = fvjVar.a;
        if (eqnVar4.j == -1) {
            eqm eqmVar3 = new eqm(eqnVar4);
            eqmVar3.h = 131072;
            eqnVar4 = new eqn(eqmVar3);
        }
        eqn eqnVar5 = eqnVar4;
        if (eqnVar5.o != null) {
            MediaFormat g = dzh.g(eqnVar5);
            alog e = fwf.e(eqnVar5.o);
            if (!e.isEmpty()) {
                fvp fvpVar = new fvp(((fvw) fvlVar2).a, eqnVar5, g, ((MediaCodecInfo) e.get(0)).getName(), false, null);
                fvjVar.b = fvpVar.d();
                this.m = fvpVar;
                this.f = new ewl(0);
                this.g = new ewl(0);
                eqn eqnVar6 = fvpVar.a;
                if (!Objects.equals(eqnVar3.o, eqnVar6.o)) {
                    fxg fxgVar = new fxg(fxhVar);
                    fxgVar.b(eqnVar6.o);
                    fxhVar = fxgVar.a();
                }
                fwrVar.a(fxhVar);
                return;
            }
            throw fvw.a(eqnVar5, "No audio media codec found");
        }
        throw fvw.b(eqnVar5, false);
    }

    private final long h() {
        esp espVar = this.e;
        return ((this.l / espVar.e) * 1000000) / espVar.b;
    }

    @Override // defpackage.fxb
    public final void d() {
        int i = 0;
        while (true) {
            fve fveVar = this.h;
            if (i < fveVar.a.size()) {
                ((fvg) ((asnn) fveVar.a.get(i)).b).d.f();
                i++;
            } else {
                fveVar.a.clear();
                fvo fvoVar = fveVar.h;
                fvoVar.a.clear();
                fvoVar.b = 0;
                fvoVar.c = esp.a;
                fvoVar.d = -1;
                fvoVar.j = new mkk[0];
                fvoVar.e = -9223372036854775807L;
                fvoVar.f = -1L;
                fvoVar.g = 0L;
                fvoVar.h = Long.MAX_VALUE;
                fvoVar.i = 0L;
                fveVar.b.f();
                fveVar.g = 0;
                fveVar.f = esr.a;
                fveVar.c = esp.a;
                this.m.g();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x037a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x037d  */
    @Override // defpackage.fxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean g() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvh.g():boolean");
    }

    @Override // defpackage.fxb
    protected final eqn p() {
        return this.m.b();
    }

    @Override // defpackage.fxb
    protected final ewl q() {
        ewl ewlVar = this.g;
        ewlVar.d = this.m.e();
        if (ewlVar.d == null) {
            return null;
        }
        MediaCodec.BufferInfo a = this.m.a();
        dzg.g(a);
        ewlVar.f = a.presentationTimeUs;
        ewl ewlVar2 = this.g;
        ewlVar2.a = 1;
        return ewlVar2;
    }

    @Override // defpackage.fxb
    public final /* bridge */ /* synthetic */ fwt r(fvz fvzVar, eqn eqnVar, int i) {
        if (!this.k) {
            this.k = true;
            dzg.d(eqnVar.equals(this.j));
            return this.i;
        }
        return this.h.a(fvzVar, eqnVar);
    }

    @Override // defpackage.fxb
    protected final void s() {
        this.m.k();
    }

    @Override // defpackage.fxb
    protected final boolean t() {
        return this.m.i();
    }
}
