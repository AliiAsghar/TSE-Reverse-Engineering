package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fax {
    public final faw d;
    public final etu g;
    public boolean h;
    public ewc i;
    public final fbt j;
    private final fbz l;
    public kkc k = new kkc((char[]) null);
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();
    public final HashMap e = new HashMap();
    public final Set f = new HashSet();

    public fax(faw fawVar, fbt fbtVar, etu etuVar, fbz fbzVar) {
        this.l = fbzVar;
        this.d = fawVar;
        this.j = fbtVar;
        this.g = etuVar;
    }

    private final void h(int i, int i2) {
        while (i < this.a.size()) {
            ((fav) this.a.get(i)).d += i2;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fgw, java.lang.Object] */
    private final void i(fav favVar) {
        kkc kkcVar = (kkc) this.e.get(favVar);
        if (kkcVar != null) {
            kkcVar.a.d(kkcVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fhb, java.lang.Object] */
    private final void j(fav favVar) {
        if (favVar.e && favVar.c.isEmpty()) {
            kkc kkcVar = (kkc) this.e.remove(favVar);
            dzg.g(kkcVar);
            kkcVar.a.k(kkcVar.b);
            kkcVar.a.n(kkcVar.c);
            kkcVar.a.m(kkcVar.c);
            this.f.remove(favVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final erz b() {
        if (!this.a.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                fav favVar = (fav) this.a.get(i2);
                favVar.d = i;
                i += favVar.a.d.c();
            }
            return new ezd(this.a, this.k);
        }
        return erz.a;
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            fav favVar = (fav) it.next();
            if (favVar.c.isEmpty()) {
                i(favVar);
                it.remove();
            }
        }
    }

    public final void d(fav favVar) {
        fgq fgqVar = favVar.a;
        fgw fgwVar = new fgw() { // from class: fat
            @Override // defpackage.fgw
            public final void a(fgx fgxVar, erz erzVar) {
                fai faiVar = (fai) fax.this.d;
                faiVar.d.a(2);
                faiVar.d.e(22);
            }
        };
        fau fauVar = new fau(this, favVar);
        this.e.put(favVar, new kkc((fgx) fgqVar, fgwVar, (Object) fauVar));
        fgqVar.c(eul.D(), fauVar);
        fgqVar.b(eul.D(), fauVar);
        fgqVar.h(fgwVar, this.i, this.l);
    }

    public final void e(fgt fgtVar) {
        fav favVar = (fav) this.b.remove(fgtVar);
        dzg.g(favVar);
        favVar.a.v(fgtVar);
        favVar.c.remove(((fgn) fgtVar).a);
        if (!this.b.isEmpty()) {
            c();
        }
        j(favVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                fav favVar = (fav) this.a.remove(i2);
                this.c.remove(favVar.b);
                h(i2, -favVar.a.d.c());
                favVar.e = true;
                if (this.h) {
                    j(favVar);
                }
            } else {
                return;
            }
        }
    }

    public final erz g(int i, List list, kkc kkcVar) {
        if (!list.isEmpty()) {
            this.k = kkcVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                fav favVar = (fav) list.get(i2 - i);
                if (i2 > 0) {
                    fav favVar2 = (fav) this.a.get(i2 - 1);
                    favVar.c(favVar2.d + favVar2.a.d.c());
                } else {
                    favVar.c(0);
                }
                h(i2, favVar.a.d.c());
                this.a.add(i2, favVar);
                this.c.put(favVar.b, favVar);
                if (this.h) {
                    d(favVar);
                    if (this.b.isEmpty()) {
                        this.f.add(favVar);
                    } else {
                        i(favVar);
                    }
                }
            }
        }
        return b();
    }
}
