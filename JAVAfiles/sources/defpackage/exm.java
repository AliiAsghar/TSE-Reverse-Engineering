package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class exm extends eyw {
    public static final long a;
    private static final int[] m = {2, 3, 6, 7, 8, 9, 11, 14};
    private static final int[] n = {1920, 1088};
    public exj b;
    public final SurfaceTexture c;
    public final Queue d;
    public int e;
    public int f;
    public boolean g;
    public eqo h;
    public CountDownLatch i;
    public volatile boolean j;
    public volatile RuntimeException k;
    private final eqp o;
    private final int p;
    private final Surface q;
    private final float[] r;
    private final ScheduledExecutorService s;
    private eqo t;
    private boolean u;
    private Future v;

    static {
        long j;
        if (true != eul.Z()) {
            j = 500;
        } else {
            j = 20000;
        }
        a = j;
    }

    public exm(eqp eqpVar, final ezc ezcVar, boolean z) {
        super(ezcVar);
        this.o = eqpVar;
        this.u = z;
        try {
            int a2 = ett.a();
            this.p = a2;
            SurfaceTexture surfaceTexture = new SurfaceTexture(a2);
            this.c = surfaceTexture;
            this.r = new float[16];
            this.d = new ConcurrentLinkedQueue();
            this.s = eul.Q("ExtTexMgr:Timer");
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: exk
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    ezcVar.e(new ewt(exm.this, 12), false);
                }
            });
            this.q = new Surface(surfaceTexture);
        } catch (ets e) {
            throw new esh(e);
        }
    }

    private static float s(float f, int i) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 += i3) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (t(i4, f, i) < t(i2, f, i)) {
                i2 = i4;
            }
        }
        int[] iArr = n;
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = iArr[i5];
            if (i6 >= i && t(i6, f, i) < t(i2, f, i)) {
                i2 = i6;
            }
        }
        if (t(i2, f, i) > 1.0E-9f) {
            return f;
        }
        return i / i2;
    }

    private static float t(int i, float f, int i2) {
        float f2 = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f3 = ((i2 - i3) / i) - f;
            if (Math.abs(f3) < f2) {
                f2 = Math.abs(f3);
            }
        }
        return f2;
    }

    @Override // defpackage.eyw
    public final int a() {
        return this.d.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyw
    public final void b() {
        this.e = 0;
        this.h = null;
        this.d.clear();
        this.t = null;
        super.b();
    }

    @Override // defpackage.eyw, defpackage.exu
    public final void d() {
        this.l.d(new ewt(this, 16));
    }

    @Override // defpackage.eyw
    public final void e() {
        this.c.release();
        this.q.release();
        this.s.shutdownNow();
    }

    @Override // defpackage.eyw
    public final void f(exw exwVar) {
        dzg.d(true);
        this.l.d(new exd(this, exwVar, 3, null));
    }

    @Override // defpackage.eyw
    public final void g() {
        this.l.d(new ewt(this, 10));
    }

    @Override // defpackage.eyw
    public final Surface i() {
        return this.q;
    }

    public final void j() {
        Future future = this.v;
        if (future != null) {
            future.cancel(false);
        }
        this.v = null;
    }

    @Override // defpackage.eyw
    public final void k() {
        this.j = true;
    }

    public final void l() {
        eqo eqoVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.e != 0 && this.f != 0 && this.h == null) {
            this.c.updateTexImage();
            this.f--;
            if (this.u) {
                eqoVar = this.t;
                dzg.g(eqoVar);
            } else {
                eqoVar = (eqo) this.d.element();
            }
            this.h = eqoVar;
            this.e--;
            this.c.getTransformMatrix(this.r);
            long timestamp = (this.c.getTimestamp() / 1000) + eqoVar.e;
            float[] fArr = this.r;
            int i6 = eqoVar.b;
            int i7 = eqoVar.c;
            int[] iArr = m;
            char c = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i = 1;
                if (i8 >= 8) {
                    break;
                }
                if (Math.abs(fArr[iArr[i8]]) <= 1.0E-9f) {
                    i = 0;
                }
                i9 |= i;
                i8++;
            }
            if (Math.abs(fArr[10] - 1.0f) > 1.0E-9f) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i10 = i2 | i9;
            if (Math.abs(fArr[15] - 1.0f) > 1.0E-9f) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i11 = i10 | i3;
            char c2 = '\f';
            char c3 = '\r';
            char c4 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                if (Math.abs(fArr[1]) > 1.0E-9f) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                int i12 = i11 | i5;
                if (Math.abs(fArr[4]) <= 1.0E-9f) {
                    i = 0;
                }
                i |= i12;
                c4 = 5;
            } else if (Math.abs(fArr[1]) > 1.0E-9f && Math.abs(fArr[4]) > 1.0E-9f) {
                if (Math.abs(fArr[0]) > 1.0E-9f) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i13 = i11 | i4;
                if (Math.abs(fArr[5]) > 1.0E-9f) {
                    c = 1;
                }
                int i14 = i13 | c;
                c = 1;
                i = i14;
                c3 = '\f';
                c2 = '\r';
            } else {
                c = 65535;
                c2 = 65535;
                c3 = 65535;
                c4 = 65535;
            }
            if (i != 0) {
                int i15 = ewx.a;
            } else {
                float f = fArr[c];
                float f2 = fArr[c2];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float copySign = Math.copySign(s(Math.abs(f), i6), f);
                    float f3 = ((f - copySign) * 0.5f) + f2;
                    int i16 = ewx.a;
                    fArr[c] = copySign;
                    fArr[c2] = f3;
                }
                float f4 = fArr[c4];
                float f5 = fArr[c3];
                if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                    float copySign2 = Math.copySign(s(Math.abs(f4), i7), f4);
                    float f6 = ((f4 - copySign2) * 0.5f) + f5;
                    int i17 = ewx.a;
                    fArr[c4] = copySign2;
                    fArr[c3] = f6;
                }
            }
            exj exjVar = this.b;
            dzg.g(exjVar);
            ((exa) exjVar).f.g("uTexTransformationMatrix", this.r);
            exj exjVar2 = this.b;
            dzg.g(exjVar2);
            exjVar2.d(this.o, new eqq(this.p, -1, eqoVar.b, eqoVar.c), timestamp);
            if (!this.u) {
                dzg.h((eqo) this.d.remove());
            }
            int i18 = ewx.a;
        }
    }

    @Override // defpackage.eyw
    public final void m(eqo eqoVar) {
        this.t = eqoVar;
        if (!this.u) {
            this.d.add(eqoVar);
        }
        this.l.d(new ewt(this, 11));
    }

    @Override // defpackage.eyw
    public final void n() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.i = countDownLatch;
        this.l.d(new ewt(this, 13));
        try {
            if (!countDownLatch.await(a, TimeUnit.MILLISECONDS)) {
                eub.f("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            eub.f("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.i = null;
        if (this.k == null) {
        } else {
            throw this.k;
        }
    }

    public final void o() {
        while (true) {
            int i = this.f;
            if (i <= 0) {
                break;
            }
            this.f = i - 1;
            this.c.updateTexImage();
            this.d.remove();
        }
        if (this.i != null && this.d.isEmpty()) {
            this.i.countDown();
        }
    }

    public final void p() {
        j();
        this.v = this.s.schedule(new exl(this, 0), a, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.eyw
    public final void q(eqo eqoVar, boolean z) {
        this.u = z;
        if (z) {
            this.t = eqoVar;
            this.c.setDefaultBufferSize(eqoVar.b, eqoVar.c);
        }
    }

    @Override // defpackage.eyw, defpackage.exu
    public final void v(eqq eqqVar) {
        this.l.d(new ewt(this, 15));
    }
}
