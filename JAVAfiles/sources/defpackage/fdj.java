package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdj implements fdp {
    public final List a;
    public final fdy b;
    public final UUID c;
    public final fdh d;
    public int e;
    public byte[] f;
    public final fez g;
    public final fvq h;
    public fvq i;
    private final boolean j = true;
    private final boolean k;
    private final HashMap l;
    private final etn m;
    private final fbz n;
    private final Looper o;
    private int p;
    private HandlerThread q;
    private fdf r;
    private ewg s;
    private fdo t;
    private byte[] u;
    private fdx v;
    private final qdq w;

    public fdj(UUID uuid, fdy fdyVar, fez fezVar, qdq qdqVar, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, fvq fvqVar, Looper looper, fbz fbzVar) {
        this.c = uuid;
        this.g = fezVar;
        this.w = qdqVar;
        this.b = fdyVar;
        this.k = z2;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            dzg.g(list);
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.l = hashMap;
        this.h = fvqVar;
        this.m = new etn();
        this.n = fbzVar;
        this.e = 2;
        this.o = looper;
        this.d = new fdh(this, looper);
    }

    private final void p(etm etmVar) {
        Set set;
        etn etnVar = this.m;
        synchronized (etnVar.a) {
            set = etnVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            etmVar.a((apuv) it.next());
        }
    }

    private final void q(Throwable th, boolean z) {
        if (!(th instanceof NotProvisionedException) && !edz.v(th)) {
            int i = 1;
            if (true != z) {
                i = 2;
            }
            f(th, i);
            return;
        }
        this.g.d(this);
    }

    private final void r(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.c(bArr, this.a, i, this.l);
            fdf fdfVar = this.r;
            int i2 = eul.a;
            fdx fdxVar = this.v;
            dzg.g(fdxVar);
            fdfVar.a(2, fdxVar, z);
        } catch (Exception | NoSuchMethodError e) {
            q(e, true);
        }
    }

    private final boolean s() {
        try {
            this.b.h(this.f, this.u);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            f(e, 1);
            return false;
        }
    }

    @Override // defpackage.fdp
    public final int a() {
        i();
        return this.e;
    }

    @Override // defpackage.fdp
    public final ewg b() {
        i();
        return this.s;
    }

    @Override // defpackage.fdp
    public final fdo c() {
        i();
        if (this.e == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.fdp
    public final UUID d() {
        i();
        return this.c;
    }

    public final void e(boolean z) {
        Map d;
        long min;
        if (!this.k) {
            byte[] bArr = this.f;
            int i = eul.a;
            if (this.u == null) {
                r(bArr, 1, z);
                return;
            }
            if (this.e != 4 && !s()) {
                return;
            }
            if (!eqc.d.equals(this.c)) {
                min = Long.MAX_VALUE;
            } else {
                i();
                byte[] bArr2 = this.f;
                Pair pair = null;
                if (bArr2 == null) {
                    d = null;
                } else {
                    d = this.b.d(bArr2);
                }
                if (d != null) {
                    pair = new Pair(Long.valueOf(eea.f(d, "LicenseDurationRemaining")), Long.valueOf(eea.f(d, "PlaybackDurationRemaining")));
                }
                dzg.g(pair);
                min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            }
            int i2 = 2;
            if (min <= 60) {
                eub.b("DefaultDrmSession", a.ck(min, "Offline license has expired or will expire soon. Remaining seconds: "));
                r(bArr, 2, z);
            } else {
                this.e = 4;
                p(new fde(i2));
            }
        }
    }

    public final void f(Throwable th, int i) {
        int i2;
        int i3 = 1;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = eul.j(eul.k(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            int i4 = eul.a;
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !edz.v(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof fee) {
                        i2 = 6001;
                    } else if (th instanceof fdl) {
                        i2 = 6003;
                    } else if (th instanceof fec) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.t = new fdo(th, i2);
        eub.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            p(new frh(th, i3));
        } else if (th instanceof Error) {
            if (!edz.w(th) && !edz.v(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.e != 4) {
            this.e = 1;
        }
    }

    public final void g(Object obj, Object obj2) {
        if (obj == this.v && j()) {
            this.v = null;
            int i = 0;
            if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                try {
                    byte[] l = this.b.l(this.f, (byte[]) obj2);
                    if (this.u != null && l != null && l.length != 0) {
                        this.u = l;
                    }
                    this.e = 4;
                    p(new fde(i));
                    return;
                } catch (Exception | NoSuchMethodError e) {
                    q(e, true);
                    return;
                }
            }
            q((Throwable) obj2, false);
        }
    }

    public final void h() {
        this.i = this.b.m();
        fdf fdfVar = this.r;
        int i = eul.a;
        fvq fvqVar = this.i;
        dzg.g(fvqVar);
        fdfVar.a(1, fvqVar, true);
    }

    public final void i() {
        if (Thread.currentThread() != this.o.getThread()) {
            eub.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.o.getThread().getName(), new IllegalStateException());
        }
    }

    public final boolean j() {
        int i = this.e;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            r4 = this;
            boolean r0 = r4.j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            fdy r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.k()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            fdy r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            fbz r3 = r4.n     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.i(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            fdy r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ewg r0 = r0.b(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.e = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            fde r0 = new fde     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0.<init>(r1)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.p(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            defpackage.dzg.g(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = defpackage.edz.v(r0)
            if (r2 == 0) goto L41
            fez r0 = r4.g
            r0.d(r4)
            goto L4a
        L41:
            r4.f(r0, r1)
            goto L4a
        L45:
            fez r0 = r4.g
            r0.d(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdj.k():boolean");
    }

    @Override // defpackage.fdp
    public final boolean l() {
        i();
        return true;
    }

    @Override // defpackage.fdp
    public final boolean m(String str) {
        i();
        byte[] bArr = this.f;
        dzg.h(bArr);
        return this.b.j(bArr, str);
    }

    @Override // defpackage.fdp
    public final void n(apuv apuvVar) {
        int i;
        i();
        int i2 = this.p;
        boolean z = false;
        if (i2 < 0) {
            eub.c("DefaultDrmSession", a.bV(i2, "Session reference count less than zero: "));
            this.p = 0;
        }
        if (apuvVar != null) {
            etn etnVar = this.m;
            synchronized (etnVar.a) {
                ArrayList arrayList = new ArrayList(etnVar.d);
                arrayList.add(apuvVar);
                etnVar.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) etnVar.b.get(apuvVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(etnVar.c);
                    hashSet.add(apuvVar);
                    etnVar.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                Map map = etnVar.b;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                map.put(apuvVar, Integer.valueOf(i));
            }
        }
        int i3 = this.p + 1;
        this.p = i3;
        if (i3 == 1) {
            if (this.e == 2) {
                z = true;
            }
            dzg.d(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new fdf(this, this.q.getLooper());
            if (k()) {
                e(true);
            }
        } else if (apuvVar != null && j() && this.m.a(apuvVar) == 1) {
            apuvVar.z(this.e);
        }
        qdq qdqVar = this.w;
        ((fdn) qdqVar.a).d.remove(this);
        Handler handler = ((fdn) qdqVar.a).i;
        dzg.g(handler);
        handler.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.fdp
    public final void o(apuv apuvVar) {
        i();
        int i = this.p;
        if (i <= 0) {
            eub.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.e = 0;
            fdh fdhVar = this.d;
            int i3 = eul.a;
            fdhVar.removeCallbacksAndMessages(null);
            this.r.b();
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.v = null;
            this.i = null;
            byte[] bArr = this.f;
            if (bArr != null) {
                this.b.e(bArr);
                this.f = null;
            }
        }
        if (apuvVar != null) {
            etn etnVar = this.m;
            synchronized (etnVar.a) {
                Integer num = (Integer) etnVar.b.get(apuvVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(etnVar.d);
                    arrayList.remove(apuvVar);
                    etnVar.d = DesugarCollections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        etnVar.b.remove(apuvVar);
                        HashSet hashSet = new HashSet(etnVar.c);
                        hashSet.remove(apuvVar);
                        etnVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    } else {
                        etnVar.b.put(apuvVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.m.a(apuvVar) == 0) {
                apuvVar.B();
            }
        }
        qdq qdqVar = this.w;
        int i4 = this.p;
        if (i4 == 1) {
            fdn fdnVar = (fdn) qdqVar.a;
            if (fdnVar.e > 0) {
                fdnVar.d.add(this);
                Handler handler = ((fdn) qdqVar.a).i;
                dzg.g(handler);
                handler.postAtTime(new exl(this, 18), this, SystemClock.uptimeMillis() + ((fdn) qdqVar.a).a);
            }
        } else if (i4 == 0) {
            ((fdn) qdqVar.a).b.remove(this);
            fdn fdnVar2 = (fdn) qdqVar.a;
            if (fdnVar2.f == this) {
                fdnVar2.f = null;
            }
            if (fdnVar2.g == this) {
                fdnVar2.g = null;
            }
            fez fezVar = fdnVar2.l;
            fezVar.a.remove(this);
            if (fezVar.b == this) {
                fezVar.b = null;
                if (!fezVar.a.isEmpty()) {
                    fezVar.b = (fdj) fezVar.a.iterator().next();
                    ((fdj) fezVar.b).h();
                }
            }
            Handler handler2 = ((fdn) qdqVar.a).i;
            dzg.g(handler2);
            handler2.removeCallbacksAndMessages(this);
            ((fdn) qdqVar.a).d.remove(this);
        }
        ((fdn) qdqVar.a).b();
    }
}
