package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class how implements Runnable, Comparable, hos, hza {
    private boolean A;
    private int B;
    private int C;
    public hlf c;
    public hne d;
    public hlh e;
    public hpl f;
    public int g;
    public int h;
    public hpb i;
    public hnj j;
    public int k;
    public hne l;
    public volatile hot m;
    public volatile boolean n;
    public int o;
    public final hpd p;
    public hpj q;
    private final ecf t;
    private long u;
    private Thread v;
    private hne w;
    private Object x;
    private hns y;
    private volatile boolean z;
    public final hou a = new hou();
    private final List s = new ArrayList();
    private final zeq D = new zeq();
    public final pa r = new pa((char[]) null);
    public final hov b = new hov();

    public how(hpd hpdVar, ecf ecfVar) {
        this.p = hpdVar;
        this.t = ecfVar;
    }

    private final int g() {
        return this.e.ordinal();
    }

    private final hot h() {
        int i = this.B;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 5) {
                            return null;
                        }
                        throw new IllegalStateException("Unrecognized stage: ".concat(hlc.f(i)));
                    }
                    return new hpx(this.a, this);
                }
                hou houVar = this.a;
                return new hoq(houVar.d(), houVar, this);
            }
            return new hpu(this.a, this);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0250, code lost:
    
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0252, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0254, code lost:
    
        r9.a.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0259, code lost:
    
        r13.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0263, code lost:
    
        if (android.util.Log.isLoggable("DecodeJob", 2) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0265, code lost:
    
        j(defpackage.hht.c(r0, "Decoded result "), r19, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0271, code lost:
    
        r18.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0281, code lost:
    
        throw new defpackage.hpp(r9.c, new java.util.ArrayList(r12));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023b A[LOOP:1: B:98:0x00b6->B:140:0x023b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0250 A[EDGE_INSN: B:141:0x0250->B:142:0x0250 BREAK  A[LOOP:1: B:98:0x00b6->B:140:0x023b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[Catch: all -> 0x0298, TryCatch #17 {all -> 0x0298, blocks: (B:79:0x004f, B:81:0x0062, B:85:0x006c, B:87:0x0076, B:93:0x0093, B:219:0x0080), top: B:78:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b8 A[Catch: all -> 0x0284, TRY_LEAVE, TryCatch #1 {all -> 0x0284, blocks: (B:97:0x00ad, B:99:0x00b8, B:101:0x00c1, B:106:0x00de, B:172:0x00ee, B:175:0x00f6, B:178:0x00fa), top: B:96:0x00ad }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, hne] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, hne] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.how.i():void");
    }

    private final void j(String str, long j, String str2) {
        String str3;
        double a = hyq.a(j);
        String valueOf = String.valueOf(this.f);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        Log.v("DecodeJob", str + " in " + a + ", load key: " + valueOf + str3 + ", thread: " + Thread.currentThread().getName());
    }

    private final void k() {
        m();
        hpp hppVar = new hpp("Failed to load resource", new ArrayList(this.s));
        hpj hpjVar = this.q;
        synchronized (hpjVar) {
            hpjVar.h = hppVar;
        }
        synchronized (hpjVar) {
            hpjVar.m.a();
            if (hpjVar.k) {
                hpjVar.e();
            } else if (!hpjVar.a.d()) {
                if (!hpjVar.i) {
                    hpjVar.i = true;
                    hne hneVar = hpjVar.d;
                    hpi b = hpjVar.a.b();
                    hpjVar.d(b.a() + 1);
                    hpjVar.c.c(hpjVar, hneVar, null);
                    Iterator<hph> it = b.iterator();
                    while (it.hasNext()) {
                        hph next = it.next();
                        next.b.execute(new hpg(hpjVar, next.a, 0));
                    }
                    hpjVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.b.c()) {
            a();
        }
    }

    private final void l() {
        this.v = Thread.currentThread();
        this.u = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.n && this.m != null && !(z = this.m.c())) {
            this.B = c(this.B);
            this.m = h();
            if (this.B == 4) {
                e(2);
                return;
            }
        }
        if ((this.B == 6 || this.n) && !z) {
            k();
        }
    }

    private final void m() {
        Throwable th;
        this.D.a();
        if (this.z) {
            if (this.s.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) this.s.get(r0.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.z = true;
    }

    public final void a() {
        this.b.a();
        pa paVar = this.r;
        paVar.b = null;
        paVar.a = null;
        paVar.c = null;
        hou houVar = this.a;
        houVar.c = null;
        houVar.d = null;
        houVar.m = null;
        houVar.g = null;
        houVar.j = null;
        houVar.h = null;
        houVar.n = null;
        houVar.i = null;
        houVar.o = null;
        houVar.a.clear();
        houVar.k = false;
        houVar.b.clear();
        houVar.l = false;
        this.z = false;
        this.c = null;
        this.d = null;
        this.j = null;
        this.e = null;
        this.f = null;
        this.q = null;
        this.B = 0;
        this.m = null;
        this.v = null;
        this.l = null;
        this.x = null;
        this.C = 0;
        this.y = null;
        this.u = 0L;
        this.n = false;
        this.s.clear();
        this.t.b(this);
    }

    @Override // defpackage.hos
    public final void b(hne hneVar, Exception exc, hns hnsVar, int i) {
        hnsVar.d();
        hpp hppVar = new hpp("Fetching data failed", Collections.singletonList(exc));
        hppVar.b(hneVar, i, hnsVar.a());
        this.s.add(hppVar);
        if (Thread.currentThread() != this.v) {
            e(2);
        } else {
            l();
        }
    }

    public final int c(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 5) {
                            throw new IllegalArgumentException("Unrecognized stage: ".concat(hlc.f(i)));
                        }
                        return 6;
                    }
                    return 4;
                }
                if (this.i.a()) {
                    return 3;
                }
                return c(3);
            }
            if (this.i.b()) {
                return 2;
            }
            return c(2);
        }
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        how howVar = (how) obj;
        int g = g() - howVar.g();
        if (g == 0) {
            return this.k - howVar.k;
        }
        return g;
    }

    @Override // defpackage.hos
    public final void d(hne hneVar, Object obj, hns hnsVar, int i, hne hneVar2) {
        this.l = hneVar;
        this.x = obj;
        this.y = hnsVar;
        this.C = i;
        this.w = hneVar2;
        boolean z = false;
        if (hneVar != this.a.d().get(0)) {
            z = true;
        }
        this.A = z;
        if (Thread.currentThread() == this.v) {
            i();
        } else {
            e(3);
        }
    }

    public final void e(int i) {
        this.o = i;
        this.q.a().execute(this);
    }

    @Override // defpackage.hza
    public final zeq f() {
        return this.D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        hns hnsVar = this.y;
        try {
            try {
                if (this.n) {
                    k();
                } else {
                    int i = this.o;
                    int i2 = i - 1;
                    if (i != 0) {
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i != 1) {
                                        if (i != 2) {
                                            str = "DECODE_DATA";
                                        } else {
                                            str = "SWITCH_TO_SOURCE_SERVICE";
                                        }
                                    } else {
                                        str = "INITIALIZE";
                                    }
                                    throw new IllegalStateException("Unrecognized run reason: ".concat(str));
                                }
                                i();
                            } else {
                                l();
                            }
                        } else {
                            this.B = c(1);
                            this.m = h();
                            l();
                        }
                    } else {
                        throw null;
                    }
                }
            } catch (hop e) {
                throw e;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.n + ", stage: " + hlc.f(this.B), th);
                }
                if (this.B != 5) {
                    this.s.add(th);
                    k();
                }
                if (!this.n) {
                    throw th;
                }
                throw th;
            }
        } finally {
            if (hnsVar != null) {
                hnsVar.d();
            }
        }
    }
}
