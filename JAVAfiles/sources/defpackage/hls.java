package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hls implements ComponentCallbacks2, hwb {
    public static final hxc a;
    private static final hxc f;
    protected final hkz b;
    protected final Context c;
    public final hwa d;
    public final CopyOnWriteArrayList e;
    private final hwj g;
    private final hwi h;
    private final hwp i;
    private final Runnable j;
    private final hvu k;
    private hxc l;

    static {
        hxc c = hxc.c(Bitmap.class);
        c.ad();
        f = c;
        hxc.c(hvf.class).ad();
        a = (hxc) ((hxc) hxc.d(hpb.b).M(hlh.LOW)).ac();
    }

    public hls(hkz hkzVar, hwa hwaVar, hwi hwiVar, Context context) {
        hvu hweVar;
        String str;
        hwj hwjVar = new hwj();
        hld hldVar = hkzVar.f;
        this.i = new hwp();
        gtq gtqVar = new gtq(this, 6, null);
        this.j = gtqVar;
        this.b = hkzVar;
        this.d = hwaVar;
        this.h = hwiVar;
        this.g = hwjVar;
        this.c = context;
        Context applicationContext = context.getApplicationContext();
        hlr hlrVar = new hlr(this, hwjVar);
        int e = egl.e(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (e == 0) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (e == 0) {
            hweVar = new hvv(applicationContext, hlrVar);
        } else {
            hweVar = new hwe();
        }
        this.k = hweVar;
        synchronized (hkzVar.d) {
            if (!hkzVar.d.contains(this)) {
                hkzVar.d.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        if (hyv.k()) {
            hyv.j(gtqVar);
        } else {
            hwaVar.a(this);
        }
        hwaVar.a(hweVar);
        this.e = new CopyOnWriteArrayList(hkzVar.c.b);
        p(hkzVar.c.a());
    }

    public hlp a(Class cls) {
        return new hlp(this.b, this, cls, this.c);
    }

    public hlp b() {
        return a(Bitmap.class).p(f);
    }

    public hlp c() {
        return a(Drawable.class);
    }

    public hlp d(Drawable drawable) {
        throw null;
    }

    public hlp e(Uri uri) {
        return c().h(uri);
    }

    public hlp f(Object obj) {
        return c().j(obj);
    }

    public hlp g(String str) {
        return c().k(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized hxc h() {
        return this.l;
    }

    public final void i(View view) {
        j(new hlq(view));
    }

    public final void j(hxq hxqVar) {
        if (hxqVar != null) {
            boolean r = r(hxqVar);
            hwx c = hxqVar.c();
            if (!r) {
                hkz hkzVar = this.b;
                synchronized (hkzVar.d) {
                    Iterator it = hkzVar.d.iterator();
                    while (it.hasNext()) {
                        if (((hls) it.next()).r(hxqVar)) {
                            return;
                        }
                    }
                    if (c != null) {
                        hxqVar.h(null);
                        c.c();
                    }
                }
            }
        }
    }

    @Override // defpackage.hwb
    public final synchronized void k() {
        this.i.k();
        Iterator it = hyv.g(this.i.a).iterator();
        while (it.hasNext()) {
            j((hxq) it.next());
        }
        this.i.a.clear();
        hwj hwjVar = this.g;
        Iterator it2 = hyv.g(hwjVar.a).iterator();
        while (it2.hasNext()) {
            hwjVar.a((hwx) it2.next());
        }
        hwjVar.b.clear();
        this.d.b(this);
        this.d.b(this.k);
        hyv.f().removeCallbacks(this.j);
        hkz hkzVar = this.b;
        synchronized (hkzVar.d) {
            if (hkzVar.d.contains(this)) {
                hkzVar.d.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // defpackage.hwb
    public final synchronized void l() {
        o();
        this.i.l();
    }

    @Override // defpackage.hwb
    public final synchronized void m() {
        n();
        this.i.m();
    }

    public final synchronized void n() {
        hwj hwjVar = this.g;
        hwjVar.c = true;
        for (hwx hwxVar : hyv.g(hwjVar.a)) {
            if (hwxVar.n()) {
                hwxVar.f();
                hwjVar.b.add(hwxVar);
            }
        }
    }

    public final synchronized void o() {
        hwj hwjVar = this.g;
        hwjVar.c = false;
        for (hwx hwxVar : hyv.g(hwjVar.a)) {
            if (!hwxVar.l() && !hwxVar.n()) {
                hwxVar.b();
            }
        }
        hwjVar.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void p(hxc hxcVar) {
        this.l = (hxc) ((hxc) hxcVar.clone()).w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(hxq hxqVar, hwx hwxVar) {
        this.i.a.add(hxqVar);
        hwj hwjVar = this.g;
        hwjVar.a.add(hwxVar);
        if (!hwjVar.c) {
            hwxVar.b();
            return;
        }
        hwxVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        hwjVar.b.add(hwxVar);
    }

    final synchronized boolean r(hxq hxqVar) {
        hwx c = hxqVar.c();
        if (c == null) {
            return true;
        }
        if (this.g.a(c)) {
            this.i.a.remove(hxqVar);
            hxqVar.h(null);
            return true;
        }
        return false;
    }

    public void s(Integer num) {
        throw null;
    }

    public final synchronized String toString() {
        hwi hwiVar;
        hwj hwjVar;
        hwiVar = this.h;
        hwjVar = this.g;
        return super.toString() + "{tracker=" + String.valueOf(hwjVar) + ", treeNode=" + String.valueOf(hwiVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
