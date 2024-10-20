package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvu implements guf, gwn, gts {
    private static final String b = gsy.b("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final gvt e;
    private boolean f;
    private final gud i;
    private final gsb j;
    private final uix l;
    private final gpx m;
    private final hgi n;
    private final ico o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final gui h = gvf.ap();
    private final Map k = new HashMap();

    public gvu(Context context, gsb gsbVar, gqg gqgVar, gud gudVar, ico icoVar, gpx gpxVar) {
        this.c = context;
        gth gthVar = gsbVar.e;
        this.e = new gvt(this, gthVar);
        this.l = new uix(gthVar, icoVar);
        this.m = gpxVar;
        this.n = new hgi(gqgVar);
        this.j = gsbVar;
        this.i = gudVar;
        this.o = icoVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(gzw.a(this.c, this.j));
    }

    private final void g() {
        if (!this.f) {
            this.i.a(this);
            this.f = true;
        }
    }

    @Override // defpackage.gts
    public final void a(gyg gygVar, boolean z) {
        arxm arxmVar;
        hgi c = this.h.c(gygVar);
        if (c != null) {
            this.l.a(c);
        }
        synchronized (this.g) {
            arxmVar = (arxm) this.d.remove(gygVar);
        }
        if (arxmVar != null) {
            gsy a = gsy.a();
            String str = b;
            Objects.toString(gygVar);
            a.c(str, "Stopping tracking for ".concat(gygVar.toString()));
            arxmVar.v(null);
        }
        if (!z) {
            synchronized (this.g) {
                this.k.remove(gygVar);
            }
        }
    }

    @Override // defpackage.guf
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            gsy.a();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        gsy.a().c(b, "Cancelling work ID ".concat(String.valueOf(str)));
        gvt gvtVar = this.e;
        if (gvtVar != null && (runnable = (Runnable) gvtVar.d.remove(str)) != null) {
            gvtVar.c.a(runnable);
        }
        for (hgi hgiVar : this.h.a(str)) {
            this.l.a(hgiVar);
            gvf.an(this.o, hgiVar);
        }
    }

    @Override // defpackage.guf
    public final void c(gys... gysVarArr) {
        long max;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            gsy.a();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<gys> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (gys gysVar : gysVarArr) {
            if (!this.h.b(gvf.J(gysVar))) {
                synchronized (this.g) {
                    gyg J = gvf.J(gysVar);
                    atgu atguVar = (atgu) this.k.get(J);
                    if (atguVar == null) {
                        int i = gysVar.m;
                        gvf gvfVar = this.j.l;
                        atguVar = new atgu(i, System.currentTimeMillis());
                        this.k.put(J, atguVar);
                    }
                    max = atguVar.b + (Math.max((gysVar.m - atguVar.a) - 5, 0) * 30000);
                }
                long max2 = Math.max(gysVar.a(), max);
                gvf gvfVar2 = this.j.l;
                long currentTimeMillis = System.currentTimeMillis();
                if (gysVar.d == gtk.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        gvt gvtVar = this.e;
                        if (gvtVar != null) {
                            Runnable runnable = (Runnable) gvtVar.d.remove(gysVar.c);
                            if (runnable != null) {
                                gvtVar.c.a(runnable);
                            }
                            fhh fhhVar = new fhh(gvtVar, gysVar, 11, (char[]) null);
                            gvtVar.d.put(gysVar.c, fhhVar);
                            gvtVar.c.b(max2 - System.currentTimeMillis(), fhhVar);
                        }
                    } else if (gysVar.d()) {
                        gsf gsfVar = gysVar.l;
                        if (gsfVar.d) {
                            gsy.a().c(b, a.cc(gysVar, "Ignoring ", ". Requires device idle."));
                        } else if (gsfVar.b()) {
                            gsy.a().c(b, a.cc(gysVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(gysVar);
                            hashSet2.add(gysVar.c);
                        }
                    } else if (!this.h.b(gvf.J(gysVar))) {
                        gsy.a().c(b, "Starting work for ".concat(gysVar.c));
                        hgi e = this.h.e(gysVar);
                        this.l.b(e);
                        this.o.G(e);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                gsy.a().c(b, a.cp(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (gys gysVar2 : hashSet) {
                    gyg J2 = gvf.J(gysVar2);
                    if (!this.d.containsKey(J2)) {
                        this.d.put(J2, gwp.a(this.n, gysVar2, (arwb) this.m.d, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.guf
    public final boolean d() {
        return false;
    }

    @Override // defpackage.gwn
    public final void e(gys gysVar, gvf gvfVar) {
        boolean z = gvfVar instanceof gwh;
        gyg J = gvf.J(gysVar);
        if (z) {
            if (!this.h.b(J)) {
                gsy a = gsy.a();
                String str = b;
                Objects.toString(J);
                a.c(str, "Constraints met: Scheduling work ID ".concat(J.toString()));
                hgi d = this.h.d(J);
                this.l.b(d);
                this.o.G(d);
                return;
            }
            return;
        }
        gsy a2 = gsy.a();
        String str2 = b;
        Objects.toString(J);
        a2.c(str2, "Constraints not met: Cancelling work ID ".concat(J.toString()));
        hgi c = this.h.c(J);
        if (c != null) {
            this.l.a(c);
            this.o.I(c, ((gwi) gvfVar).a);
        }
    }
}
