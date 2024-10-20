package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbu extends arwb {
    public static final arml a = armd.a(AnonymousClass1.a);
    public static final ThreadLocal b = new ThreadLocal<arpi>() { // from class: dbu.2
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ arpi initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                dbu dbuVar = new dbu(choreographer, dzg.c(myLooper));
                return dbuVar.plus(dbuVar.j);
            }
            throw new IllegalStateException("no Looper on this thread");
        }
    };
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final byd j;
    private boolean n;
    public final Object e = new Object();
    private final arnr m = new arnr();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final AnonymousClass3 i = new AnonymousClass3();

    /* compiled from: PG */
    /* renamed from: dbu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arpi> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            Choreographer choreographer;
            if (dbv.a()) {
                choreographer = Choreographer.getInstance();
            } else {
                arwb arwbVar = arws.a;
                choreographer = (Choreographer) arrn.G(asfh.a, new dbt(null));
            }
            dbu dbuVar = new dbu(choreographer, dzg.c(Looper.getMainLooper()));
            return dbuVar.plus(dbuVar.j);
        }
    }

    /* compiled from: PG */
    /* renamed from: dbu$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 implements Choreographer.FrameCallback, Runnable {
        public AnonymousClass3() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            dbu.this.d.removeCallbacks(this);
            dbu.this.b();
            dbu dbuVar = dbu.this;
            synchronized (dbuVar.e) {
                if (!dbuVar.h) {
                    return;
                }
                dbuVar.h = false;
                List list = dbuVar.f;
                dbuVar.f = dbuVar.g;
                dbuVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            dbu.this.b();
            dbu dbuVar = dbu.this;
            synchronized (dbuVar.e) {
                if (dbuVar.f.isEmpty()) {
                    dbuVar.c.removeFrameCallback(this);
                    dbuVar.h = false;
                }
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final arpi a() {
            return (arpi) dbu.a.a();
        }
    }

    public dbu(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new dbw(choreographer, this);
    }

    private final Runnable c() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.f();
        }
        return runnable;
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                this.d.post(this.i);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(this.i);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable c = c();
            while (c != null) {
                c.run();
                c = c();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
