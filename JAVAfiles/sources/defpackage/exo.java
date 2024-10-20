package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class exo implements exw, exy {
    public final EGLDisplay c;
    public final EGLContext d;
    public final EGLSurface e;
    public final ezc f;
    public final esj g;
    public final euc i;
    public final euc j;
    public final exx k;
    public final boolean l;
    public boolean m;
    public boolean o;
    public boolean p;
    public erv q;
    public EGLSurface r;
    public gop s;
    public final anna t;
    private final Context u;
    private final eqd v;
    private int w;
    private int x;
    private exa y;
    private eug z;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public exu n = new exn(0);
    public final Queue h = new ConcurrentLinkedQueue();

    public exo(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, eqd eqdVar, ezc ezcVar, esj esjVar, exx exxVar, int i, boolean z) {
        this.u = context;
        this.c = eGLDisplay;
        this.d = eGLContext;
        this.e = eGLSurface;
        this.v = eqdVar;
        this.f = ezcVar;
        this.g = esjVar;
        this.k = exxVar;
        this.l = z;
        this.t = new anna(eqd.i(eqdVar), i);
        this.i = new euc(i);
        this.j = new euc(i);
    }

    private final int b() {
        if (this.k == null) {
            return 1;
        }
        return this.t.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0187 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01da A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007d A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0074 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[Catch: esh | ets -> 0x022e, esh -> 0x0230, TryCatch #2 {esh | ets -> 0x022e, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:17:0x0029, B:19:0x003b, B:20:0x0046, B:22:0x004f, B:24:0x0053, B:27:0x0058, B:29:0x005f, B:30:0x0064, B:32:0x006f, B:34:0x0078, B:36:0x0081, B:38:0x0085, B:39:0x0095, B:41:0x0099, B:42:0x009e, B:44:0x00a2, B:47:0x00a8, B:49:0x00ac, B:50:0x00b5, B:52:0x00b9, B:55:0x00c1, B:57:0x00cd, B:59:0x00d6, B:60:0x00d7, B:61:0x00df, B:64:0x00ea, B:67:0x00f2, B:72:0x0133, B:80:0x0146, B:82:0x014e, B:84:0x0167, B:87:0x0170, B:90:0x017c, B:93:0x017f, B:94:0x0128, B:100:0x00bf, B:101:0x0183, B:103:0x0187, B:105:0x01af, B:106:0x01cd, B:114:0x01c4, B:116:0x01da, B:118:0x01de, B:119:0x007d, B:120:0x0074, B:3:0x0228), top: B:6:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.eqp r17, defpackage.eqq r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exo.a(eqp, eqq, long, long):void");
    }

    @Override // defpackage.exw
    public final void c() {
        this.f.g();
        if (this.k != null) {
            this.t.n();
            this.i.d();
            this.j.d();
        }
        this.h.clear();
        this.m = false;
        exa exaVar = this.y;
        if (exaVar != null) {
            exaVar.c();
        }
        this.n.u();
        for (int i = 0; i < b(); i++) {
            this.n.d();
        }
    }

    @Override // defpackage.exw
    public final void d(eqp eqpVar, eqq eqqVar, long j) {
        this.f.g();
        boolean z = true;
        new eyq(this, j, true ? 1 : 0).run();
        if (this.k == null) {
            if (this.l) {
                a(eqpVar, eqqVar, j, j * 1000);
            } else {
                this.h.add(Pair.create(eqqVar, Long.valueOf(j)));
            }
            this.n.d();
            return;
        }
        long j2 = j * 1000;
        if (this.t.j() <= 0) {
            z = false;
        }
        dzg.d(z);
        a(eqpVar, eqqVar, j, j2);
    }

    @Override // defpackage.exw
    public final void e() {
        this.f.g();
        exa exaVar = this.y;
        if (exaVar != null) {
            exaVar.e();
        }
        try {
            this.t.l();
            ett.s(this.c, this.r);
            ett.m();
        } catch (ets e) {
            throw new esh(e);
        }
    }

    @Override // defpackage.exw
    public final void f(eqq eqqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.exw
    public final void g(exu exuVar) {
        this.f.g();
        this.n = exuVar;
        for (int i = 0; i < b(); i++) {
            exuVar.d();
        }
    }

    @Override // defpackage.exw
    public final void h(exv exvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.exw
    public final void i() {
        this.f.g();
        if (this.h.isEmpty()) {
            gop gopVar = this.s;
            dzg.g(gopVar);
            gopVar.a();
            this.m = false;
            return;
        }
        dzg.d(!this.l);
        this.m = true;
    }

    @Override // defpackage.exw
    public final void k(ext extVar) {
        throw new UnsupportedOperationException();
    }
}
