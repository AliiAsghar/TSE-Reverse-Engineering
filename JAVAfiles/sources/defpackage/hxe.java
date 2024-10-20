package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxe implements hwx, hxp, hxd {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private boolean A;
    private RuntimeException B;
    private int C;
    private final zeq D;
    private final String b;
    private final Object c;
    private final hxb d;
    private final hwz e;
    private final Context f;
    private final hlf g;
    private final Object h;
    private final Class i;
    private final hwu j;
    private final int k;
    private final int l;
    private final hlh m;
    private final hxq n;
    private final List o;
    private final hya p;
    private final Executor q;
    private hpt r;
    private hpe s;
    private long t;
    private volatile hpf u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private int y;
    private int z;

    public hxe(Context context, hlf hlfVar, Object obj, Object obj2, Class cls, hwu hwuVar, int i, int i2, hlh hlhVar, hxq hxqVar, hxb hxbVar, List list, hwz hwzVar, hpf hpfVar, hya hyaVar, Executor executor) {
        String str;
        if (a) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.b = str;
        this.D = new zeq();
        this.c = obj;
        this.f = context;
        this.g = hlfVar;
        this.h = obj2;
        this.i = cls;
        this.j = hwuVar;
        this.k = i;
        this.l = i2;
        this.m = hlhVar;
        this.n = hxqVar;
        this.d = hxbVar;
        this.o = list;
        this.e = hwzVar;
        this.u = hpfVar;
        this.p = hyaVar;
        this.q = executor;
        this.C = 1;
        if (this.B == null && hlfVar.h.b(hld.class)) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        if (this.x == null) {
            this.x = null;
            int i = this.j.o;
            if (i > 0) {
                this.x = p(i);
            }
        }
        return this.x;
    }

    private final Drawable o() {
        if (this.w == null) {
            hwu hwuVar = this.j;
            Drawable drawable = hwuVar.g;
            this.w = null;
            int i = hwuVar.h;
            if (i > 0) {
                this.w = p(i);
            }
        }
        return this.w;
    }

    private final Drawable p(int i) {
        Resources.Theme theme = this.j.s;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        Context context = this.f;
        return hux.a(context, context, i, theme);
    }

    private final void q() {
        if (!this.A) {
        } else {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void r(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:15:0x0075, B:17:0x0079, B:18:0x007e, B:20:0x0084, B:22:0x0096, B:24:0x009a, B:27:0x00a7, B:29:0x00ab, B:32:0x00b2, B:34:0x00b6, B:36:0x00bc, B:38:0x00c0, B:40:0x00c8, B:42:0x00cc, B:43:0x00d0), top: B:14:0x0075, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:15:0x0075, B:17:0x0079, B:18:0x007e, B:20:0x0084, B:22:0x0096, B:24:0x009a, B:27:0x00a7, B:29:0x00ab, B:32:0x00b2, B:34:0x00b6, B:36:0x00bc, B:38:0x00c0, B:40:0x00c8, B:42:0x00cc, B:43:0x00d0), top: B:14:0x0075, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:15:0x0075, B:17:0x0079, B:18:0x007e, B:20:0x0084, B:22:0x0096, B:24:0x009a, B:27:0x00a7, B:29:0x00ab, B:32:0x00b2, B:34:0x00b6, B:36:0x00bc, B:38:0x00c0, B:40:0x00c8, B:42:0x00cc, B:43:0x00d0), top: B:14:0x0075, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(defpackage.hpp r10, int r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.s(hpp, int):void");
    }

    private final boolean t() {
        hwz hwzVar = this.e;
        if (hwzVar != null && !hwzVar.h(this)) {
            return false;
        }
        return true;
    }

    private final void u() {
        hwz hwzVar = this.e;
        if (hwzVar != null) {
            hwzVar.a().j();
        }
    }

    @Override // defpackage.hxd
    public final Object a() {
        this.D.a();
        return this.c;
    }

    @Override // defpackage.hwx
    public final void b() {
        synchronized (this.c) {
            q();
            this.D.a();
            this.t = SystemClock.elapsedRealtimeNanos();
            int i = 5;
            if (this.h == null) {
                if (hyv.n(this.k, this.l)) {
                    this.y = this.k;
                    this.z = this.l;
                }
                if (i() != null) {
                    i = 3;
                }
                s(new hpp("Received null model"), i);
                return;
            }
            int i2 = this.C;
            if (i2 != 2) {
                if (i2 == 4) {
                    e(this.r, 5);
                    return;
                }
                List<hxb> list = this.o;
                if (list != null) {
                    for (hxb hxbVar : list) {
                        if (hxbVar instanceof hww) {
                            throw null;
                        }
                    }
                }
                this.C = 3;
                if (hyv.n(this.k, this.l)) {
                    g(this.k, this.l);
                } else {
                    this.n.d(this);
                }
                int i3 = this.C;
                if ((i3 == 2 || i3 == 3) && t()) {
                    this.n.f(o());
                }
                if (a) {
                    r("finished run method in " + hyq.a(this.t));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // defpackage.hwx
    public final void c() {
        synchronized (this.c) {
            q();
            this.D.a();
            if (this.C == 6) {
                return;
            }
            q();
            this.D.a();
            this.n.g(this);
            hpe hpeVar = this.s;
            hpt hptVar = null;
            if (hpeVar != null) {
                synchronized (hpeVar.c) {
                    hpeVar.a.g(hpeVar.b);
                }
                this.s = null;
            }
            hpt hptVar2 = this.r;
            if (hptVar2 != null) {
                this.r = null;
                hptVar = hptVar2;
            }
            hwz hwzVar = this.e;
            if (hwzVar == null || hwzVar.g(this)) {
                this.n.e(o());
            }
            this.C = 6;
            if (hptVar != null) {
                ((hpn) hptVar).f();
            }
        }
    }

    @Override // defpackage.hxd
    public final void d(hpp hppVar) {
        s(hppVar, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0174, code lost:
    
        ((defpackage.hpn) r13).f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0179, code lost:
    
        return;
     */
    @Override // defpackage.hxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.hpt r13, int r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.e(hpt, int):void");
    }

    @Override // defpackage.hwx
    public final void f() {
        synchronized (this.c) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0112 A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #3 {all -> 0x01fb, blocks: (B:28:0x0112, B:46:0x017a, B:62:0x00c6, B:64:0x00ce, B:66:0x00d3, B:68:0x00d7, B:70:0x00e2, B:74:0x00fd, B:76:0x0107, B:78:0x010b, B:79:0x00ee, B:81:0x00f2, B:82:0x00f5), top: B:61:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01db A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:4:0x0010, B:6:0x0014, B:7:0x0029, B:9:0x002e, B:12:0x0030, B:14:0x0049, B:15:0x005e, B:17:0x0090, B:37:0x01d4, B:39:0x01db, B:41:0x01e0, B:42:0x01f7, B:56:0x01ff, B:60:0x01d0, B:87:0x0205), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e0 A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:4:0x0010, B:6:0x0014, B:7:0x0029, B:9:0x002e, B:12:0x0030, B:14:0x0049, B:15:0x005e, B:17:0x0090, B:37:0x01d4, B:39:0x01db, B:41:0x01e0, B:42:0x01f7, B:56:0x01ff, B:60:0x01d0, B:87:0x0205), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [ecf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [ecf, java.lang.Object] */
    @Override // defpackage.hxp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.g(int, int):void");
    }

    @Override // defpackage.hwx
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            if (this.C == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            if (this.C == 6) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            if (this.C == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean m(hwx hwxVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        hwu hwuVar;
        hlh hlhVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        hwu hwuVar2;
        hlh hlhVar2;
        int i6;
        boolean equals;
        if (!(hwxVar instanceof hxe)) {
            return false;
        }
        synchronized (this.c) {
            i = this.k;
            i2 = this.l;
            obj = this.h;
            cls = this.i;
            hwuVar = this.j;
            hlhVar = this.m;
            List list = this.o;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        hxe hxeVar = (hxe) hwxVar;
        synchronized (hxeVar.c) {
            i4 = hxeVar.k;
            i5 = hxeVar.l;
            obj2 = hxeVar.h;
            cls2 = hxeVar.i;
            hwuVar2 = hxeVar.j;
            hlhVar2 = hxeVar.m;
            List list2 = hxeVar.o;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = hyv.a;
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else {
                if (obj instanceof hsb) {
                    equals = ((hsb) obj).a();
                } else {
                    equals = obj.equals(obj2);
                }
                if (!equals) {
                    return false;
                }
            }
            if (cls.equals(cls2) && hwuVar.equals(hwuVar2) && hlhVar == hlhVar2 && i3 == i6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.hwx
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            int i = this.C;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
