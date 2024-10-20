package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trn {
    public static final xze a = xze.g("BugleNetwork", "DittoDesktops");
    public final xnv b;
    public final armf c;
    public final armf d;
    private final anen e;
    private final armf f;

    static {
        uuh.k(uuh.b, "max_persistent_active_dittos", 2);
        uuh.k(uuh.b, "max_pwa_pairing_count", 1);
        uuh.k(uuh.b, "max_satellite_pairing_count", 2);
        uuh.k(uuh.b, "max_non_persistent_active_dittos", 1);
    }

    public trn(xnv xnvVar, armf armfVar, armf armfVar2, anen anenVar, armf armfVar3) {
        this.b = xnvVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = anenVar;
        this.f = armfVar3;
    }

    public static final boolean f(aqfn aqfnVar) {
        soo a2 = sor.a();
        a2.w("isActiveDesktop");
        a2.d(new tkg(aqfnVar, 15));
        return a2.b().K();
    }

    public static final akul g(List list, Function function) {
        Object apply;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            trm trmVar = (trm) it.next();
            String str = trmVar.b;
            if (TextUtils.isEmpty(str)) {
                a.l("Skip running the task on the desktop due to empty request Id.");
            } else {
                aqfn aqfnVar = trmVar.a;
                trl a2 = trm.a();
                a2.b(aqfnVar);
                a2.g(str);
                a2.c(trmVar.c);
                a2.e(trmVar.d);
                a2.d(trmVar.e);
                apply = function.apply(a2.a());
                arrayList.add((akul) apply);
            }
        }
        return aktp.ad(arrayList);
    }

    private final Optional h(sog sogVar) {
        if (((lpg) this.f.b()).z() && sogVar.m() != null) {
            return Optional.of(aozb.w(sogVar.m()));
        }
        return Optional.empty();
    }

    public final trm a(String str) {
        trm trmVar;
        tro troVar;
        akrh e = aktp.e("DittoDesktops#getDesktop");
        try {
            soo a2 = sor.a();
            a2.w("getDesktop");
            a2.d(new tkg(str, 10));
            sol solVar = (sol) a2.b().n();
            try {
                if (solVar.moveToFirst()) {
                    sog sogVar = (sog) solVar.cK();
                    String m = solVar.m();
                    String o = solVar.o();
                    Optional h = h(sogVar);
                    if (o == null) {
                        troVar = new tro(twj.e(m, tqm.ANONYMOUS), m, Optional.empty());
                    } else {
                        troVar = new tro(twj.e(o, tqm.GAIA), m, h);
                    }
                    trl a3 = trm.a();
                    a3.b(troVar.a);
                    a3.f(solVar.g());
                    a3.c(solVar.j());
                    a3.e(solVar.u());
                    a3.d(troVar);
                    String r = solVar.r();
                    if (r != null) {
                        a3.g(r);
                    }
                    trmVar = a3.a();
                    solVar.close();
                } else {
                    a.l("getDesktop returning null because it did not find a matching id.");
                    solVar.close();
                    trmVar = null;
                }
                e.close();
                return trmVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul b(Function function) {
        return aktp.ai(new rbg(this, 10), this.e).i(new tsz(function, 1), this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final alog c() {
        aqfn d;
        akrh e = aktp.e("DittoDesktops#getActiveDesktops");
        try {
            soo a2 = sor.a();
            a2.w("getActiveDesktops");
            a2.d(new tgn(4));
            a2.d(new tgn(5));
            alog t = a2.b().t();
            alob alobVar = new alob();
            int i = ((alsx) t).c;
            for (int i2 = 0; i2 < i; i2++) {
                sog sogVar = (sog) t.get(i2);
                if (((lpg) this.f.b()).z()) {
                    String l = sogVar.l();
                    if (sogVar.h().equals(tqm.GAIA) && !albo.ah(l)) {
                        d = twj.e(l, sogVar.h());
                    } else {
                        d = twj.e(sogVar.k(), sogVar.h());
                    }
                } else {
                    d = twj.d(sogVar.k());
                }
                trl a3 = trm.a();
                a3.b(d);
                sogVar.ao(15, "request_id");
                a3.g(albo.ag(sogVar.p));
                sogVar.ao(2, "last_connection_time");
                a3.f(sogVar.c);
                sogVar.ao(17, "desktop_type");
                a3.c(sogVar.r);
                sogVar.ao(16, "is_persistent");
                a3.e(sogVar.q);
                a3.d(new tro(d, sogVar.k(), h(sogVar)));
                alobVar.h(a3.a());
            }
            alog g = alobVar.g();
            e.close();
            return g;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List d() {
        akrh e = aktp.e("DittoDesktops#getStoredDesktopIds");
        try {
            soo a2 = sor.a();
            a2.w("getStoredDesktopIds");
            a2.c(new tgn(8));
            sol solVar = (sol) a2.b().m(sor.c.b);
            try {
                alob alobVar = new alob();
                while (solVar.moveToNext()) {
                    if (solVar.m() != null) {
                        alobVar.h(solVar.m());
                    }
                }
                alog g = alobVar.g();
                solVar.close();
                List list = (List) Collection.EL.stream(g).map(new tkg(this, 16)).collect(Collectors.toCollection(new toe(15)));
                e.close();
                return list;
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e(aqfn aqfnVar) {
        if (aqfnVar == null) {
            return false;
        }
        Iterator it = d().iterator();
        while (it.hasNext()) {
            if (((aqfn) it.next()).c.equals(aqfnVar.c)) {
                return true;
            }
        }
        return false;
    }
}
