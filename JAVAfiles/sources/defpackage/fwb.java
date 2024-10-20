package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwb extends fxb implements fwt {
    private static final ByteBuffer e = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    private final eqn f;
    private final AtomicLong g;
    private final Queue h;
    private final Queue i;
    private volatile boolean j;
    private long k;
    private boolean l;
    private long m;
    private ewl n;

    public fwb(eqn eqnVar, fxh fxhVar, fwy fwyVar, fwr fwrVar) {
        super(eqnVar, fwyVar);
        this.f = eqnVar;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        fwrVar.a(fxhVar);
    }

    @Override // defpackage.fxa
    public final /* synthetic */ int a() {
        return dyf.l();
    }

    @Override // defpackage.fxa
    public final /* synthetic */ Surface b() {
        return dyf.k();
    }

    @Override // defpackage.fxa
    public final ewl c() {
        if (this.n == null) {
            ewl ewlVar = (ewl) this.h.poll();
            this.n = ewlVar;
            if (!this.l) {
                if (ewlVar == null) {
                    ewl ewlVar2 = new ewl(2);
                    this.n = ewlVar2;
                    ewlVar2.d = e;
                } else {
                    long j = this.m;
                    dzg.g(ewlVar.d);
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.fwz
    public final void e(fvz fvzVar, long j, eqn eqnVar, boolean z) {
        this.k = this.g.get();
        this.g.addAndGet(j);
    }

    @Override // defpackage.fxa
    public final /* synthetic */ void f() {
        dyf.o();
    }

    @Override // defpackage.fxa
    public final /* synthetic */ int h(Bitmap bitmap, etl etlVar) {
        return dyf.m();
    }

    @Override // defpackage.fxa
    public final /* synthetic */ boolean i() {
        return dyf.n();
    }

    @Override // defpackage.fxa
    public final void j() {
        ewl ewlVar = this.n;
        dzg.g(ewlVar);
        this.n = null;
        boolean z = true;
        if (ewlVar.eR()) {
            this.j = true;
        } else {
            ewlVar.f += this.k;
            this.i.add(ewlVar);
        }
        if (!this.l) {
            int size = this.h.size() + this.i.size();
            long j = this.m;
            dzg.g(ewlVar.d);
            long capacity = j + r0.capacity();
            this.m = capacity;
            if (size < 10 || (size < 200 && capacity < 2097152)) {
                z = false;
            }
            this.l = z;
        }
    }

    @Override // defpackage.fxb
    protected final eqn p() {
        return this.f;
    }

    @Override // defpackage.fxb
    protected final ewl q() {
        return (ewl) this.i.peek();
    }

    @Override // defpackage.fxb
    protected final void s() {
        ewl ewlVar = (ewl) this.i.remove();
        ewlVar.eO();
        ewlVar.f = 0L;
        this.h.add(ewlVar);
    }

    @Override // defpackage.fxb
    protected final boolean t() {
        if (this.j && this.i.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fxb
    public final void d() {
    }

    @Override // defpackage.fxb
    public final fwt r(fvz fvzVar, eqn eqnVar, int i) {
        return this;
    }
}
