package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvg implements fwt {
    public final esp a;
    public final Queue b;
    public final AtomicLong c;
    public eso d;
    public boolean e;
    public boolean f;
    public long g;
    public boolean h;
    private final Queue i;
    private final Queue j;
    private ewl k;
    private boolean l;
    private long m;
    private boolean n;
    private kkc o;

    public fvg(esp espVar, fvz fvzVar, eqn eqnVar) {
        esp espVar2 = new esp(eqnVar);
        d.t(fve.b(espVar2), espVar2);
        this.i = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            ewl ewlVar = new ewl(2);
            ewlVar.d = order;
            this.i.add(ewlVar);
        }
        this.j = new ConcurrentLinkedQueue();
        this.b = new ConcurrentLinkedQueue();
        this.o = new kkc(espVar2);
        eso o = o(fvzVar, espVar2, espVar);
        this.d = o;
        o.c();
        esp espVar3 = this.d.a;
        this.a = espVar3;
        d.t(espVar3.d == 2, espVar3);
        this.c = new AtomicLong(-9223372036854775807L);
        this.g = -9223372036854775807L;
    }

    private final long k() {
        return eul.v(this.m / r2.e, ((esp) this.o.b).b);
    }

    private final void l() {
        kkc kkcVar = this.o;
        ((AtomicLong) kkcVar.a).addAndGet(r3.e * eul.r(this.g - k(), ((esp) kkcVar.b).b));
        this.n = true;
        if (this.h) {
            this.f = true;
        }
    }

    private final void m(ewl ewlVar) {
        ewlVar.eO();
        ewlVar.f = 0L;
        this.i.add(ewlVar);
    }

    private final boolean n() {
        if (!this.n) {
            long j = this.g;
            if (j != -9223372036854775807L && j - k() > 2000) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static eso o(fvz fvzVar, esp espVar, esp espVar2) {
        int i;
        int i2;
        alob alobVar = new alob();
        boolean z = fvzVar.d;
        alobVar.j(fvzVar.g.b);
        if (espVar2.b != -1) {
            esw eswVar = new esw();
            eswVar.b = espVar2.b;
            alobVar.h(eswVar);
        }
        int i3 = espVar2.c;
        if (i3 == 1 || i3 == 2) {
            est estVar = new est();
            estVar.o(esu.b(1, espVar2.c));
            estVar.o(esu.b(2, espVar2.c));
            alobVar.h(estVar);
        }
        eso esoVar = new eso(alobVar.g());
        esp a = esoVar.a(espVar);
        int i4 = espVar2.b;
        if ((i4 != -1 && i4 != a.b) || (((i = espVar2.c) != -1 && i != a.c) || ((i2 = espVar2.d) != -1 && i2 != a.d))) {
            throw new esq("Audio can not be modified to match downstream format", espVar);
        }
        return esoVar;
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
        if (!this.b.isEmpty()) {
            return null;
        }
        return (ewl) this.i.peek();
    }

    public final ByteBuffer d() {
        ByteBuffer byteBuffer;
        Object obj;
        if (!this.l) {
            byteBuffer = esr.a;
        } else if (this.d.h()) {
            while (true) {
                if (this.o.q()) {
                    ByteBuffer p = this.o.p();
                    this.d.e(p);
                    if (p.hasRemaining()) {
                        break;
                    }
                    if (!this.o.q()) {
                        this.d.d();
                        break;
                    }
                } else {
                    ewl ewlVar = (ewl) this.j.peek();
                    if (ewlVar == null) {
                        if (!this.b.isEmpty()) {
                            if (n()) {
                                l();
                            } else {
                                this.d.d();
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (ewlVar.eR()) {
                        if (n()) {
                            l();
                            m((ewl) this.j.remove());
                        } else {
                            this.d.d();
                            this.e = true;
                            m((ewl) this.j.remove());
                            break;
                        }
                    } else {
                        ByteBuffer byteBuffer2 = ewlVar.d;
                        dzg.g(byteBuffer2);
                        long remaining = byteBuffer2.remaining();
                        this.d.e(byteBuffer2);
                        this.m += remaining - byteBuffer2.remaining();
                        if (byteBuffer2.hasRemaining()) {
                            break;
                        }
                        m((ewl) this.j.remove());
                    }
                }
            }
            byteBuffer = this.d.b();
        } else if (this.o.q()) {
            byteBuffer = this.o.p();
        } else {
            ewl ewlVar2 = this.k;
            if (ewlVar2 != null) {
                byteBuffer = ewlVar2.d;
                dzg.h(byteBuffer);
                if (!byteBuffer.hasRemaining()) {
                    ewl ewlVar3 = this.k;
                    dzg.h(ewlVar3);
                    m(ewlVar3);
                    this.k = null;
                }
            }
            ewl ewlVar4 = (ewl) this.j.poll();
            if (ewlVar4 == null) {
                if (!this.b.isEmpty() && n()) {
                    l();
                }
                byteBuffer = esr.a;
            } else {
                ByteBuffer byteBuffer3 = ewlVar4.d;
                this.e = ewlVar4.eR();
                if (byteBuffer3 != null && byteBuffer3.hasRemaining() && !this.e) {
                    this.k = ewlVar4;
                    this.m += byteBuffer3.remaining();
                    byteBuffer = byteBuffer3;
                } else {
                    m(ewlVar4);
                    if (this.e && n()) {
                        l();
                    }
                    byteBuffer = esr.a;
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (!g() && !this.b.isEmpty()) {
            fvf fvfVar = (fvf) this.b.poll();
            dzg.h(fvfVar);
            this.m = 0L;
            this.h = fvfVar.d;
            this.n = false;
            eqn eqnVar = fvfVar.c;
            if (eqnVar != null) {
                this.g = fvfVar.b;
                esp espVar = new esp(eqnVar);
                this.o = new kkc(espVar);
                obj = espVar;
            } else {
                if (fvfVar.a.g.b.isEmpty()) {
                    this.g = fvfVar.a.a(fvfVar.b);
                } else {
                    this.g = fvfVar.b;
                }
                Object obj2 = this.o.b;
                this.c.compareAndSet(-9223372036854775807L, 0L);
                l();
                obj = obj2;
            }
            if (this.l) {
                this.d = o(fvfVar.a, (esp) obj, this.a);
            }
            this.d.c();
            this.e = false;
            this.l = true;
        }
        return esr.a;
    }

    @Override // defpackage.fwz
    public final void e(fvz fvzVar, long j, eqn eqnVar, boolean z) {
        boolean z2;
        if (eqnVar == null) {
            if (j != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            dzg.e(z2, "Could not generate silent audio because duration is unknown.");
        } else {
            dzg.d(erl.g(eqnVar.o));
            esp espVar = new esp(eqnVar);
            dzg.e(fve.b(espVar), espVar);
        }
        this.b.add(new fvf(fvzVar, j, eqnVar, z));
    }

    @Override // defpackage.fxa
    public final /* synthetic */ void f() {
        dyf.o();
    }

    public final boolean g() {
        ByteBuffer byteBuffer;
        if (!this.l) {
            return false;
        }
        ewl ewlVar = this.k;
        if ((ewlVar != null && (byteBuffer = ewlVar.d) != null && byteBuffer.hasRemaining()) || this.o.q() || !this.j.isEmpty()) {
            return true;
        }
        if (!this.d.h() || this.d.g()) {
            return false;
        }
        return true;
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
        dzg.d(this.b.isEmpty());
        ewl ewlVar = (ewl) this.i.remove();
        this.j.add(ewlVar);
        this.c.compareAndSet(-9223372036854775807L, ewlVar.f);
    }
}
