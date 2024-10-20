package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfg {
    private static adfg e;
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    private adfg(Context context, byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new eue(this), intentFilter);
    }

    public static synchronized adfg l(Context context) {
        adfg adfgVar;
        synchronized (adfg.class) {
            if (e == null) {
                e = new adfg(context, (byte[]) null);
            }
            adfgVar = e;
        }
        return adfgVar;
    }

    public final void a(adeu adeuVar) {
        ((CopyOnWriteArrayList) this.c).add(adeuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            adeu adeuVar = (adeu) it.next();
            if (adeuVar.shouldTriggerOnCapabilitiesChanged() || !z) {
                adeuVar.onConnectivityChange((Context) this.b, this.a);
            }
        }
    }

    public final void c(adeu adeuVar) {
        ((CopyOnWriteArrayList) this.c).remove(adeuVar);
    }

    public final void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = adwp.f((Context) this.b).d();
        } catch (adwk e2) {
            advr.s(e2, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfo = null;
        }
        int i = 2;
        if (networkInfo != null && networkInfo.isConnected()) {
            i = 1;
        }
        this.a = i;
    }

    public final void e(boolean z, arjq arjqVar, asqu asquVar, boolean z2) {
        asquVar.getClass();
        int b = arjqVar.b();
        boolean d = arjqVar.d();
        int i = (int) asquVar.b;
        if (!d && b >= i) {
            arjqVar.c(asquVar, i, z);
        } else {
            if (!d && b > 0) {
                arjqVar.c(asquVar, b, false);
            }
            arjqVar.a.hq(asquVar, (int) asquVar.b);
            arjqVar.d = z | arjqVar.d;
        }
        if (z2) {
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arki, java.lang.Object] */
    public final void f() {
        try {
            this.c.c();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arjr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [arjr, java.lang.Object] */
    public final void g() {
        arjq[] s = this.d.s();
        Collections.shuffle(Arrays.asList(s));
        int length = s.length;
        int i = ((arjq) this.b).b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                arjq arjqVar = s[i3];
                int min = Math.min(i, Math.min(arjqVar.a(), ceil));
                if (min > 0) {
                    arjqVar.c += min;
                    i -= min;
                }
                if (arjqVar.a() > 0) {
                    s[i2] = arjqVar;
                    i2++;
                }
            }
            length = i2;
        }
        arjs arjsVar = new arjs();
        for (arjq arjqVar2 : this.d.s()) {
            arjqVar2.e(arjqVar2.c, arjsVar);
            arjqVar2.c = 0;
        }
        if (arjsVar.a()) {
            f();
        }
    }

    public final void h(arjq arjqVar, int i) {
        if (arjqVar == null) {
            ((arjq) this.b).f(i);
            g();
            return;
        }
        arjqVar.f(i);
        arjs arjsVar = new arjs();
        arjqVar.e(arjqVar.b(), arjsVar);
        if (arjsVar.a()) {
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void i() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ghb) it.next()).a();
        }
    }

    public final int j() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public final void k(int i) {
        synchronized (this.d) {
            if (this.a == i) {
                return;
            }
            this.a = i;
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                qdq qdqVar = (qdq) weakReference.get();
                if (qdqVar != null) {
                    qdqVar.G(i);
                } else {
                    ((CopyOnWriteArrayList) this.c).remove(weakReference);
                }
            }
        }
    }

    public adfg() {
        this.c = new ArrayList();
        this.b = new gha(this);
        this.a = 0;
        this.d = new Object();
    }

    public adfg(Context context) {
        this.c = new CopyOnWriteArrayList();
        this.b = context;
        d();
        advr.c("Use network callbacks", new Object[0]);
        this.d = new adfe(this);
    }

    public adfg(arjr arjrVar, arki arkiVar) {
        this.d = arjrVar;
        arkiVar.getClass();
        this.c = arkiVar;
        this.a = 65535;
        this.b = new arjq(this, 0, 65535, null);
    }
}
