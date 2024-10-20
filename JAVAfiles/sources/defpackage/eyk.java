package defpackage;

import android.content.Context;
import android.util.SparseArray;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyk implements esm, fxs {
    public final Context a;
    public final eqd b;
    public final esl c;
    public final Executor d;
    public final List e;
    public final SparseArray f;
    public final DefaultVideoFrameProcessor$Factory g;
    public final Queue h;
    public final SparseArray i;
    public esk j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public volatile boolean o;
    public exc p;
    private final eyj q;
    private final eqg r;
    private final ExecutorService s;
    private boolean t;

    public eyk(Context context, esi esiVar, eqd eqdVar, eqg eqgVar, esl eslVar, Executor executor, List list) {
        d.s(true);
        this.a = context;
        this.b = eqdVar;
        this.r = eqgVar;
        this.c = eslVar;
        this.d = executor;
        this.e = new ArrayList(list);
        this.n = -9223372036854775807L;
        this.f = new SparseArray();
        ScheduledExecutorService Q = eul.Q("Effect:MultipleInputVideoGraph:Thread");
        this.s = Q;
        eyj eyjVar = new eyj();
        this.q = eyjVar;
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder((DefaultVideoFrameProcessor$Factory) esiVar);
        builder.b = eyjVar;
        builder.a = Q;
        this.g = builder.build();
        this.h = new ArrayDeque();
        this.i = new SparseArray();
    }

    public final void a(Exception exc) {
        new ewq(this, exc, 7).run();
    }

    public final void b() {
        aboh abohVar;
        dzg.h(this.j);
        if (this.l && (abohVar = (aboh) this.h.peek()) != null) {
            esk eskVar = this.j;
            dzg.g(eskVar);
            int i = ((eqq) abohVar.b).b;
            exi exiVar = (exi) eskVar;
            boolean z = true;
            dzg.d(!exiVar.j);
            if (!exiVar.k.g()) {
                z = false;
            } else {
                exiVar.c.a().w(i, abohVar.a);
            }
            dzg.d(z);
            this.h.remove();
            if (this.m && this.h.isEmpty()) {
                esk eskVar2 = this.j;
                dzg.g(eskVar2);
                eskVar2.f();
            }
        }
    }

    @Override // defpackage.fxs
    public final fwt c(int i) {
        dzg.d(!eul.S(this.f, i));
        exc excVar = this.p;
        dzg.g(excVar);
        excVar.c(i);
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder(this.g);
        builder.c = new eyf(this, i);
        d.s(true);
        builder.d = 2;
        this.f.put(i, builder.build().a(this.a, eqg.a, this.b, true, this.d, new eyi(this, i)));
        dzg.d(eul.S(this.f, i));
        esk eskVar = (esk) this.f.get(i);
        int i2 = alog.d;
        return new fxu(eskVar, alsx.a);
    }

    @Override // defpackage.esm
    public final void e() {
        boolean z = false;
        if (this.f.size() == 0 && this.p == null && this.j == null && !this.t) {
            z = true;
        }
        dzg.d(z);
        exi a = this.g.a(this.a, this.r, this.b, true, andi.a, new eyh(this));
        this.j = a;
        qdq qdqVar = new qdq(this);
        eyb eybVar = a.c;
        dzg.d(eul.S(eybVar.f, 3));
        ((eya) eybVar.f.get(3)).a.x(qdqVar);
        this.p = new exc(this.a, this.q, this.s, new qdq(this, null), new eye(this));
    }

    @Override // defpackage.esm
    public final void f() {
        if (!this.t) {
            for (int i = 0; i < this.f.size(); i++) {
                SparseArray sparseArray = this.f;
                ((esk) sparseArray.get(sparseArray.keyAt(i))).d();
            }
            this.f.clear();
            exc excVar = this.p;
            if (excVar != null) {
                excVar.d();
                this.p = null;
            }
            esk eskVar = this.j;
            if (eskVar != null) {
                eskVar.d();
                this.j = null;
            }
            try {
                if (this.q.a != null) {
                    ett.r(ett.h(), this.q.a);
                }
            } catch (ets e) {
                eub.d("MultiInputVG", "Error releasing GL context", e);
            }
            this.s.shutdown();
            try {
                this.s.awaitTermination(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                new ewq(this, e2, 8).run();
            }
            this.t = true;
        }
    }

    @Override // defpackage.esm
    public final void g(erv ervVar) {
        esk eskVar = this.j;
        dzg.g(eskVar);
        eskVar.e(ervVar);
    }

    @Override // defpackage.esm
    public final boolean h() {
        return this.o;
    }
}
