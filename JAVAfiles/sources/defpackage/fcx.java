package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcx {
    public static final Object a = new Object();
    public static ScheduledExecutorService b;
    public static int c;
    public float A;
    public ByteBuffer B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public eqa H;
    public long I;
    public boolean J;
    public boolean K;
    public Looper L;
    public long M;
    public long N;
    public Handler O;
    public final fcp P;
    public rdq Q;
    public mkk R;
    public mkk S;
    public ktk T;
    public efu U;
    public final kkc V;
    public qdq W;
    private final Context X;
    private final fcu Y;
    private long Z;
    private long aa;
    private ByteBuffer ab;
    private boolean ac;
    public final fco d;
    public final fdd e;
    public final alog f;
    public final alog g;
    public final fcn h;
    public final ArrayDeque i;
    public final fcu j;
    public fbz k;
    public fcs l;
    public fcs m;
    public eso n;
    public AudioTrack o;
    public fcb p;
    public fcf q;
    public epz r;
    public ero s;
    public boolean t;
    public long u;
    public long v;
    public int w;
    public boolean x;
    public boolean y;
    public long z;

    public fcx(fcr fcrVar) {
        fcb fcbVar;
        Context context = fcrVar.a;
        this.X = context;
        epz epzVar = epz.a;
        this.r = epzVar;
        if (context != null) {
            fcb fcbVar2 = fcb.a;
            int i = eul.a;
            fcbVar = fcb.d(context, epzVar, null);
        } else {
            fcbVar = fcrVar.b;
        }
        this.p = fcbVar;
        this.V = fcrVar.f;
        int i2 = eul.a;
        fcp fcpVar = fcrVar.e;
        dzg.g(fcpVar);
        this.P = fcpVar;
        this.h = new fcn(new qdq(this, null));
        fco fcoVar = new fco();
        this.d = fcoVar;
        fdd fddVar = new fdd();
        this.e = fddVar;
        this.f = alog.t(new esx(), fcoVar, fddVar);
        this.g = alog.r(new fdc());
        this.A = 1.0f;
        this.G = 0;
        this.H = new eqa();
        this.S = new mkk(ero.a, 0L, 0L);
        this.s = ero.a;
        this.t = false;
        this.i = new ArrayDeque();
        this.j = new fcu();
        this.Y = new fcu();
    }

    public static boolean q() {
        boolean z;
        synchronized (a) {
            if (c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static boolean t(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (eul.a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        if (isOffloadedPlayback) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcx.v(java.nio.ByteBuffer):void");
    }

    private final void w() {
        eso esoVar = this.m.i;
        this.n = esoVar;
        esoVar.c();
    }

    private final boolean x() {
        fcs fcsVar = this.m;
        if (fcsVar.c == 0) {
            int i = fcsVar.a.F;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y() {
        /*
            r9 = this;
            java.nio.ByteBuffer r0 = r9.ab
            if (r0 != 0) goto L6
            goto Lb4
        L6:
            fcu r0 = r9.Y
            boolean r0 = r0.c()
            if (r0 != 0) goto Lb4
            java.nio.ByteBuffer r0 = r9.ab
            int r0 = r0.remaining()
            android.media.AudioTrack r1 = r9.o
            java.nio.ByteBuffer r2 = r9.ab
            r3 = 1
            int r1 = r1.write(r2, r0, r3)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r9.I = r4
            r4 = 0
            r2 = 0
            if (r1 >= 0) goto L67
            int r0 = defpackage.eul.a
            r0 = -6
            if (r1 == r0) goto L34
            r0 = -32
            if (r1 != r0) goto L32
            goto L34
        L32:
            r3 = r2
            goto L48
        L34:
            long r6 = r9.c()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3d
            goto L48
        L3d:
            android.media.AudioTrack r0 = r9.o
            boolean r0 = t(r0)
            if (r0 == 0) goto L32
            r9.h()
        L48:
            fck r0 = new fck
            fcs r2 = r9.m
            eqn r2 = r2.a
            r0.<init>(r1, r2, r3)
            qdq r1 = r9.W
            if (r1 == 0) goto L58
            r1.H(r0)
        L58:
            boolean r1 = r0.b
            if (r1 != 0) goto L62
            fcu r1 = r9.Y
            r1.b(r0)
            return
        L62:
            fcb r1 = defpackage.fcb.a
            r9.p = r1
            throw r0
        L67:
            fcu r6 = r9.Y
            r6.a()
            android.media.AudioTrack r6 = r9.o
            boolean r6 = t(r6)
            if (r6 == 0) goto L8a
            long r6 = r9.aa
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7c
            r9.K = r2
        L7c:
            boolean r4 = r9.F
            if (r4 == 0) goto L8a
            qdq r4 = r9.W
            if (r4 == 0) goto L8a
            if (r1 >= r0) goto L8a
            java.lang.Object r4 = r4.a
            ffh r4 = (defpackage.ffh) r4
        L8a:
            fcs r4 = r9.m
            int r4 = r4.c
            if (r4 != 0) goto L96
            long r5 = r9.Z
            long r7 = (long) r1
            long r5 = r5 + r7
            r9.Z = r5
        L96:
            if (r1 != r0) goto Lb4
            if (r4 == 0) goto Lb1
            java.nio.ByteBuffer r0 = r9.ab
            java.nio.ByteBuffer r1 = r9.B
            if (r0 != r1) goto La1
            goto La2
        La1:
            r3 = r2
        La2:
            defpackage.dzg.d(r3)
            long r0 = r9.aa
            int r2 = r9.w
            long r2 = (long) r2
            int r4 = r9.C
            long r4 = (long) r4
            long r2 = r2 * r4
            long r0 = r0 + r2
            r9.aa = r0
        Lb1:
            r0 = 0
            r9.ab = r0
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcx.y():void");
    }

    public final int a(eqn eqnVar) {
        i();
        if ("audio/raw".equals(eqnVar.o)) {
            if (!eul.W(eqnVar.F)) {
                eub.f("DefaultAudioSink", "Invalid PCM encoding: " + eqnVar.F);
                return 0;
            }
            if (eqnVar.F == 2) {
                return 2;
            }
            return 1;
        }
        if (this.p.a(eqnVar, this.r) == null) {
            return 0;
        }
        return 2;
    }

    public final long b() {
        if (this.m.c == 0) {
            return this.u / r0.b;
        }
        return this.v;
    }

    public final long c() {
        fcs fcsVar = this.m;
        if (fcsVar.c == 0) {
            long j = this.Z;
            long j2 = fcsVar.d;
            int i = eul.a;
            return ((j + j2) - 1) / j2;
        }
        return this.aa;
    }

    public final AudioTrack d(fcs fcsVar) {
        try {
            return fcsVar.b(this.r, this.G);
        } catch (fci e) {
            qdq qdqVar = this.W;
            if (qdqVar != null) {
                qdqVar.H(e);
            }
            throw e;
        }
    }

    public final void e(long j) {
        ero eroVar;
        boolean z;
        int i = 1;
        if (x()) {
            kkc kkcVar = this.V;
            eroVar = this.s;
            float f = eroVar.b;
            esw eswVar = (esw) kkcVar.c;
            if (eswVar.c != f) {
                eswVar.c = f;
                eswVar.g = true;
            }
            float f2 = eroVar.c;
            if (eswVar.d != f2) {
                eswVar.d = f2;
                eswVar.g = true;
            }
        } else {
            eroVar = ero.a;
        }
        ero eroVar2 = eroVar;
        this.s = eroVar2;
        if (x()) {
            kkc kkcVar2 = this.V;
            z = this.t;
            ((fdb) kkcVar2.b).e = z;
        } else {
            z = false;
        }
        this.t = z;
        this.i.add(new mkk(eroVar2, Math.max(0L, j), this.m.a(c())));
        w();
        qdq qdqVar = this.W;
        if (qdqVar != null) {
            boolean z2 = this.t;
            fdx fdxVar = ((fcz) qdqVar.a).l;
            Object obj = fdxVar.a;
            if (obj != null) {
                ((Handler) obj).post(new hwm(fdxVar, z2, i, null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, android.media.AudioRouting$OnRoutingChangedListener] */
    public final void f() {
        if (s()) {
            this.u = 0L;
            this.v = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.K = false;
            this.w = 0;
            this.S = new mkk(this.s, 0L, 0L);
            this.z = 0L;
            this.R = null;
            this.i.clear();
            this.B = null;
            this.C = 0;
            this.ab = null;
            this.ac = false;
            this.D = false;
            this.E = false;
            this.e.g = 0L;
            w();
            AudioTrack audioTrack = this.h.a;
            dzg.g(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.o.pause();
            }
            if (t(this.o)) {
                rdq rdqVar = this.Q;
                dzg.g(rdqVar);
                this.o.unregisterStreamEventCallback(ex$$ExternalSyntheticApiModelOutline0.m(rdqVar.c));
                ((Handler) rdqVar.b).removeCallbacksAndMessages(null);
            }
            dzo dzoVar = new dzo();
            fcs fcsVar = this.l;
            if (fcsVar != null) {
                this.m = fcsVar;
                this.l = null;
            }
            fcn fcnVar = this.h;
            fcnVar.c();
            fcnVar.a = null;
            fcnVar.c = null;
            int i = eul.a;
            ktk ktkVar = this.T;
            if (ktkVar != null) {
                ?? r4 = ktkVar.c;
                dzg.g(r4);
                ((AudioTrack) ktkVar.a).removeOnRoutingChangedListener((AudioRouting$OnRoutingChangedListener) r4);
                ktkVar.c = null;
                this.T = null;
            }
            AudioTrack audioTrack2 = this.o;
            qdq qdqVar = this.W;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (a) {
                if (b == null) {
                    b = eul.Q("ExoPlayer:AudioTrackReleaseThread");
                }
                c++;
                b.schedule(new eex(audioTrack2, qdqVar, handler, dzoVar, 5), 20L, TimeUnit.MILLISECONDS);
            }
            this.o = null;
        }
        this.Y.a();
        this.j.a();
        this.M = 0L;
        this.N = 0L;
        Handler handler2 = this.O;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void g() {
        this.x = true;
    }

    public final void h() {
        if (!this.m.c()) {
            return;
        }
        this.J = true;
    }

    public final void i() {
        fcb fcbVar;
        if (this.q == null && this.X != null) {
            this.L = Looper.myLooper();
            fcf fcfVar = new fcf(this.X, new qdq(this), this.r, this.U);
            this.q = fcfVar;
            if (fcfVar.h) {
                fcbVar = fcfVar.f;
                dzg.g(fcbVar);
            } else {
                fcfVar.h = true;
                fcd fcdVar = fcfVar.e;
                if (fcdVar != null) {
                    fcdVar.a.registerContentObserver(fcdVar.b, false, fcdVar);
                }
                int i = eul.a;
                fcc fccVar = fcfVar.c;
                if (fccVar != null) {
                    Context context = fcfVar.a;
                    Handler handler = fcfVar.b;
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    dzg.g(audioManager);
                    audioManager.registerAudioDeviceCallback(fccVar, handler);
                }
                fcfVar.f = fcb.e(fcfVar.a, fcfVar.a.registerReceiver(fcfVar.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, fcfVar.b), fcfVar.g, fcfVar.i);
                fcbVar = fcfVar.f;
            }
            this.p = fcbVar;
        }
    }

    public final void j() {
        this.F = true;
        if (s()) {
            fcn fcnVar = this.h;
            if (fcnVar.o != -9223372036854775807L) {
                eti etiVar = fcnVar.u;
                fcnVar.o = eul.u(SystemClock.elapsedRealtime());
            }
            fcm fcmVar = fcnVar.c;
            dzg.g(fcmVar);
            fcmVar.d();
            this.o.play();
        }
    }

    public final void k() {
        if (!this.ac) {
            this.ac = true;
            fcn fcnVar = this.h;
            long c2 = c();
            fcnVar.q = fcnVar.b();
            eti etiVar = fcnVar.u;
            fcnVar.o = eul.u(SystemClock.elapsedRealtime());
            fcnVar.r = c2;
            if (t(this.o)) {
                this.E = false;
            }
            this.o.stop();
        }
    }

    public final void l(long j) {
        y();
        if (this.ab == null) {
            if (this.n.h()) {
                while (!this.n.g()) {
                    do {
                        ByteBuffer b2 = this.n.b();
                        if (b2.hasRemaining()) {
                            v(b2);
                            y();
                        } else {
                            ByteBuffer byteBuffer = this.B;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.n.e(this.B);
                            } else {
                                return;
                            }
                        }
                    } while (this.ab == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.B;
            if (byteBuffer2 != null) {
                v(byteBuffer2);
                y();
            }
        }
    }

    public final void m() {
        f();
        int i = 0;
        while (true) {
            alog alogVar = this.f;
            if (i >= ((alsx) alogVar).c) {
                break;
            }
            ((esr) alogVar.get(i)).g();
            i++;
        }
        alog alogVar2 = this.g;
        for (int i2 = 0; i2 < ((alsx) alogVar2).c; i2++) {
            ((esr) alogVar2.get(i2)).g();
        }
        eso esoVar = this.n;
        if (esoVar != null) {
            esoVar.f();
        }
        this.F = false;
        this.J = false;
    }

    public final void n(ero eroVar) {
        mkk mkkVar = new mkk(eroVar, -9223372036854775807L, -9223372036854775807L);
        if (s()) {
            this.R = mkkVar;
        } else {
            this.S = mkkVar;
        }
    }

    public final void o() {
        if (s()) {
            this.o.setVolume(this.A);
        }
    }

    public final boolean p() {
        ByteBuffer byteBuffer;
        if (!this.n.h()) {
            y();
            if (this.ab == null) {
                return true;
            }
            return false;
        }
        this.n.d();
        l(Long.MIN_VALUE);
        if (this.n.g() && ((byteBuffer = this.ab) == null || !byteBuffer.hasRemaining())) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean isOffloadedPlayback;
        if (s()) {
            if (eul.a >= 29) {
                isOffloadedPlayback = this.o.isOffloadedPlayback();
                if (isOffloadedPlayback && this.E) {
                    return false;
                }
            }
            if (this.h.d(c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean s() {
        if (this.o != null) {
            return true;
        }
        return false;
    }

    public final boolean u(eqn eqnVar) {
        if (a(eqnVar) != 0) {
            return true;
        }
        return false;
    }
}
