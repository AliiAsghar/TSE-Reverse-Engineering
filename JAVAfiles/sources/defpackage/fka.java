package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fka {
    public final int a;
    public esk c;
    public eqn d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public boolean m;
    public boolean n;
    public long o;
    final /* synthetic */ fkd r;
    private final ArrayList s = new ArrayList();
    public final fkf b = new fkf();
    public long k = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public fkn p = fkn.b;
    public Executor q = fkd.a;

    public fka(fkd fkdVar, Context context) {
        this.r = fkdVar;
        this.a = eul.l(context);
    }

    public final void a(boolean z) {
        if (k()) {
            esk eskVar = this.c;
            eyb eybVar = ((exi) eskVar).c;
            if (eybVar.b()) {
                try {
                    eyw a = eybVar.a();
                    a.k();
                    ezc ezcVar = ((exi) eskVar).d;
                    synchronized (ezcVar.a) {
                        ezcVar.c = true;
                        ezcVar.b.clear();
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    int i = 7;
                    ezcVar.h(new exd(ezcVar, countDownLatch, i, null), false);
                    countDownLatch.await();
                    a.n();
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    a.r(new ewt(countDownLatch2, i));
                    ((exi) eskVar).d.d(new ewt(((exi) eskVar).g, 8));
                    countDownLatch2.await();
                    a.r(null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.m = false;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        fkd fkdVar = this.r;
        if (fkdVar.o == 1) {
            fkdVar.n++;
            fkdVar.e.a();
            etu etuVar = fkdVar.l;
            dzg.h(etuVar);
            etuVar.b(new fhg(fkdVar, 3));
        }
        if (z) {
            this.r.d.h();
        }
        this.o = -9223372036854775807L;
    }

    public final void b(boolean z) {
        this.r.d.c(z);
    }

    public final void c() {
        if (this.d == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.s);
        eqn eqnVar = this.d;
        dzg.g(eqnVar);
        esk eskVar = this.c;
        dzg.h(eskVar);
        int i = this.e;
        eqd eqdVar = eqnVar.C;
        eskVar.c(i, arrayList, new eqo(fkd.e(eqdVar), eqnVar.v, eqnVar.w, eqnVar.z, 0L));
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0103, code lost:
    
        r2 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r16, long r18) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fka.d(long, long):void");
    }

    public final void e(int i) {
        this.r.d.i(i);
    }

    public final void f(Surface surface, eug eugVar) {
        fkd fkdVar = this.r;
        Pair pair = fkdVar.m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((eug) fkdVar.m.second).equals(eugVar)) {
            return;
        }
        fkdVar.m = Pair.create(surface, eugVar);
        fkdVar.f(surface, eugVar.b, eugVar.c);
    }

    public final void g(float f) {
        boolean z;
        if (f > brg.a) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.r.e.a.l(f);
    }

    public final void h(long j, long j2, long j3, long j4) {
        boolean z = this.j;
        boolean z2 = true;
        if (this.g == j2 && this.h == j3) {
            z2 = false;
        }
        this.j = z | z2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
    }

    public final void i(List list) {
        if (this.s.equals(list)) {
            return;
        }
        this.s.clear();
        this.s.addAll(list);
        this.s.addAll(this.r.g);
        c();
    }

    public final void j(fke fkeVar) {
        this.r.k = fkeVar;
    }

    public final boolean k() {
        if (this.c != null) {
            return true;
        }
        return false;
    }
}
