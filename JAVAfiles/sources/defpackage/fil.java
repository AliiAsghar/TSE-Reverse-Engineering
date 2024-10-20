package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fil extends ezg implements Handler.Callback {
    private final fqu A;
    public long j;
    private final ewl k;
    private fig l;
    private final fik m;
    private boolean n;
    private int o;
    private frd p;
    private frf q;
    private frg r;
    private frg s;
    private int t;
    private final Handler u;
    private boolean v;
    private boolean w;
    private eqn x;
    private long y;
    private final faa z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fil(faa faaVar, Looper looper) {
        super(3);
        Handler handler;
        fik fikVar = fik.b;
        dzg.g(faaVar);
        this.z = faaVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.m = fikVar;
        this.k = new ewl(1);
        this.A = new fqu();
        this.j = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    private final long W() {
        if (this.t != -1) {
            dzg.g(this.r);
            if (this.t < this.r.a()) {
                return this.r.c(this.t);
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    private final void X() {
        boolean z = true;
        if (!Objects.equals(this.x.o, "application/cea-608") && !Objects.equals(this.x.o, "application/x-mp4-cea-608") && !Objects.equals(this.x.o, "application/cea-708")) {
            z = false;
        }
        dzg.e(z, "Legacy decoding is disabled, can't handle " + this.x.o + " samples (expected application/x-media3-cues).");
    }

    private final void Y() {
        int i = alog.d;
        alog alogVar = alsx.a;
        ah(this.y);
        af(new eta(alogVar));
    }

    private final void Z(fre freVar) {
        eub.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.x))), freVar);
        Y();
        ae();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aa() {
        /*
            r6 = this;
            r0 = 1
            r6.n = r0
            eqn r1 = r6.x
            defpackage.dzg.g(r1)
            java.lang.String r2 = r1.o
            if (r2 == 0) goto L5a
            int r3 = r2.hashCode()
            r4 = 930165504(0x37713300, float:1.4376594E-5)
            r5 = 2
            if (r3 == r4) goto L35
            r4 = 1566015601(0x5d578071, float:9.705335E17)
            if (r3 == r4) goto L2b
            r4 = 1566016562(0x5d578432, float:9.705995E17)
            if (r3 == r4) goto L21
            goto L3f
        L21:
            java.lang.String r3 = "application/cea-708"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r5
            goto L40
        L2b:
            java.lang.String r3 = "application/cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = 0
            goto L40
        L35:
            java.lang.String r3 = "application/x-mp4-cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r0
            goto L40
        L3f:
            r3 = -1
        L40:
            if (r3 == 0) goto L51
            if (r3 == r0) goto L51
            if (r3 == r5) goto L47
            goto L5a
        L47:
            int r0 = r1.I
            java.util.List r1 = r1.r
            frv r2 = new frv
            r2.<init>(r0, r1)
            goto L78
        L51:
            int r0 = r1.I
            frr r1 = new frr
            r1.<init>(r2, r0)
            r2 = r1
            goto L78
        L5a:
            fik r0 = r6.m
            fij r0 = (defpackage.fij) r0
            fri r3 = r0.a
            boolean r3 = r3.c(r1)
            if (r3 == 0) goto L80
            fri r0 = r0.a
            frl r0 = r0.b(r1)
            frb r2 = new frb
            java.lang.Class r1 = r0.getClass()
            r1.getSimpleName()
            r2.<init>(r0)
        L78:
            r6.p = r2
            long r0 = r6.f
            r2.f(r0)
            return
        L80:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.aa():void");
    }

    private final void ab(eta etaVar) {
        this.z.a.f.f(27, new ezu(etaVar.b, 16));
        fad fadVar = this.z.a;
        fadVar.x = etaVar;
        fadVar.f.f(27, new ezu(etaVar, 13));
    }

    private final void ac() {
        this.q = null;
        this.t = -1;
        frg frgVar = this.r;
        if (frgVar != null) {
            frgVar.h();
            this.r = null;
        }
        frg frgVar2 = this.s;
        if (frgVar2 != null) {
            frgVar2.h();
            this.s = null;
        }
    }

    private final void ad() {
        ac();
        frd frdVar = this.p;
        dzg.g(frdVar);
        frdVar.e();
        this.p = null;
        this.o = 0;
    }

    private final void ae() {
        ad();
        aa();
    }

    private final void af(eta etaVar) {
        Handler handler = this.u;
        if (handler != null) {
            handler.obtainMessage(1, etaVar).sendToTarget();
        } else {
            ab(etaVar);
        }
    }

    private static boolean ag(eqn eqnVar) {
        return Objects.equals(eqnVar.o, "application/x-media3-cues");
    }

    private static final void ah(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "TextRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0189, code lost:
    
        if (r12 != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1 A[EXC_TOP_SPLITTER, LOOP:2: B:70:0x01d1->B:90:0x01d1, LOOP_START, SYNTHETIC] */
    @Override // defpackage.fbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(long r10, long r12) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.S(long, long):void");
    }

    @Override // defpackage.fbd
    public final boolean T() {
        return this.w;
    }

    @Override // defpackage.fbd
    public final boolean U() {
        return true;
    }

    @Override // defpackage.fbf
    public final int V(eqn eqnVar) {
        int i;
        if (!ag(eqnVar)) {
            fik fikVar = this.m;
            String str = eqnVar.o;
            if (!((fij) fikVar).a.c(eqnVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return dzn.d(erl.i(eqnVar.o) ? 1 : 0);
            }
        }
        if (eqnVar.L == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return dzn.d(i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ab((eta) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ezg
    protected final void s() {
        this.x = null;
        this.j = -9223372036854775807L;
        Y();
        this.y = -9223372036854775807L;
        if (this.p != null) {
            ad();
        }
    }

    @Override // defpackage.ezg
    protected final void u(long j, boolean z) {
        this.y = j;
        fig figVar = this.l;
        if (figVar != null) {
            figVar.d();
        }
        Y();
        this.v = false;
        this.w = false;
        this.j = -9223372036854775807L;
        eqn eqnVar = this.x;
        if (eqnVar != null && !ag(eqnVar)) {
            if (this.o != 0) {
                ae();
                return;
            }
            ac();
            frd frdVar = this.p;
            dzg.g(frdVar);
            frdVar.c();
            frdVar.f(this.f);
        }
    }

    @Override // defpackage.ezg
    protected final void z(eqn[] eqnVarArr, long j, long j2, fgv fgvVar) {
        fig fiiVar;
        eqn eqnVar = eqnVarArr[0];
        this.x = eqnVar;
        if (!ag(eqnVar)) {
            X();
            if (this.p != null) {
                this.o = 1;
                return;
            } else {
                aa();
                return;
            }
        }
        if (this.x.J == 1) {
            fiiVar = new fih();
        } else {
            fiiVar = new fii();
        }
        this.l = fiiVar;
    }
}
