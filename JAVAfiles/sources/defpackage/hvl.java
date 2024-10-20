package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvl {
    public final hmb a;
    public final List b;
    final hls c;
    public boolean d;
    public hvj e;
    public boolean f;
    public hvj g;
    public Bitmap h;
    public hvj i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final hqa n;
    private boolean o;
    private hlp p;

    public hvl(hkz hkzVar, hmb hmbVar, int i, int i2, hnn hnnVar, Bitmap bitmap) {
        hqa hqaVar = hkzVar.a;
        hls c = hkz.c(hkzVar.a());
        hlp p = hkz.c(hkzVar.a()).b().p(((hxc) ((hxc) hxc.d(hpb.a).Z()).ac()).L(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new hvk(this, 0));
        this.n = hqaVar;
        this.m = handler;
        this.p = p;
        this.a = hmbVar;
        e(hnnVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((hmf) this.a).f.c;
    }

    public final void b() {
        int i;
        if (this.d && !this.o) {
            hvj hvjVar = this.i;
            if (hvjVar != null) {
                this.i = null;
                c(hvjVar);
                return;
            }
            this.o = true;
            hmf hmfVar = (hmf) this.a;
            hmd hmdVar = hmfVar.f;
            int i2 = hmdVar.c;
            int i3 = 0;
            if (i2 > 0 && (i = hmfVar.e) >= 0) {
                i3 = i < i2 ? ((hmc) hmdVar.e.get(i)).i : -1;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i3;
            this.a.b();
            this.g = new hvj(this.m, ((hmf) this.a).e, uptimeMillis);
            this.p.p((hxc) new hxc().P(new hyf(Double.valueOf(Math.random())))).j(this.a).v(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(hvj hvjVar) {
        int i;
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, hvjVar).sendToTarget();
            return;
        }
        if (this.d) {
            if (hvjVar.b != null) {
                d();
                hvj hvjVar2 = this.e;
                this.e = hvjVar;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    hvf hvfVar = (hvf) this.b.get(size);
                    Object callback = hvfVar.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        hvfVar.stop();
                        hvfVar.invalidateSelf();
                    } else {
                        hvfVar.invalidateSelf();
                        hvj hvjVar3 = hvfVar.a.a.e;
                        if (hvjVar3 != null) {
                            i = hvjVar3.a;
                        } else {
                            i = -1;
                        }
                        if (i == r4.a() - 1) {
                            hvfVar.c++;
                        }
                        if (hvfVar.d != -1 && hvfVar.c >= 0) {
                            hvfVar.stop();
                        }
                    }
                }
                if (hvjVar2 != null) {
                    this.m.obtainMessage(2, hvjVar2).sendToTarget();
                }
            }
            b();
            return;
        }
        this.i = hvjVar;
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(hnn hnnVar, Bitmap bitmap) {
        hwr.i(hnnVar);
        hwr.i(bitmap);
        this.h = bitmap;
        this.p = this.p.p(new hxc().R(hnnVar));
        this.j = hyv.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
