package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hkd implements Comparable {
    public final hkm a;
    public final String b;
    public final int c;
    public final Object d;
    public hkh e;
    public Integer f;
    public hkg g;
    public final boolean h;
    public boolean i;
    public hjs j;
    public hjv k;
    public gpx l;
    private boolean m;

    public hkd(String str, hkh hkhVar) {
        hkm hkmVar;
        Uri parse;
        String host;
        if (hkm.a) {
            hkmVar = new hkm();
        } else {
            hkmVar = null;
        }
        this.a = hkmVar;
        this.d = new Object();
        this.h = true;
        int i = 0;
        this.m = false;
        this.i = false;
        this.j = null;
        this.b = str;
        this.e = hkhVar;
        this.k = new hjv(2500, 1, 1.0f);
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.c = i;
    }

    public final int a() {
        return this.k.a;
    }

    public Map b() {
        return Collections.emptyMap();
    }

    public final void c(String str) {
        if (hkm.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hkd hkdVar = (hkd) obj;
        int j = hkdVar.j();
        int j2 = j();
        if (j2 == j) {
            return this.f.intValue() - hkdVar.f.intValue();
        }
        return (j - 1) - (j2 - 1);
    }

    public void d() {
        synchronized (this.d) {
            this.m = true;
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str) {
        hkg hkgVar = this.g;
        if (hkgVar != null) {
            synchronized (hkgVar.a) {
                hkgVar.a.remove(this);
            }
            synchronized (hkgVar.f) {
                Iterator it = hkgVar.f.iterator();
                while (it.hasNext()) {
                    ((hkf) it.next()).a();
                }
            }
            hkgVar.b();
        }
        if (hkm.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new maa(this, str, id, 1));
            } else {
                this.a.a(str, id);
                this.a.b(toString());
            }
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.i = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        gpx gpxVar;
        synchronized (this.d) {
            gpxVar = this.l;
        }
        if (gpxVar != null) {
            gpxVar.p(this);
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    public int j() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        hkg hkgVar = this.g;
        if (hkgVar != null) {
            hkgVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract akju l(hka hkaVar);

    public final void m(gpx gpxVar) {
        synchronized (this.d) {
            this.l = gpxVar;
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(Integer.toHexString(this.c));
        if (true != i()) {
            str = "[ ] ";
        } else {
            str = "[X] ";
        }
        if (j() != 1) {
            str2 = "NORMAL";
        } else {
            str2 = "LOW";
        }
        return str + this.b + " " + "0x".concat(valueOf) + " " + str2 + " " + this.f;
    }
}
