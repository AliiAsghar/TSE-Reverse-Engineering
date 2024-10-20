package defpackage;

import j$.time.Instant;
import j$.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgl extends eor {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final akbn c = new akbn("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final akbl e;
    public final aegu f;
    public final Executor g;
    public final ahiy h;

    public akgl(aegu aeguVar, ahiy ahiyVar, Executor executor) {
        this.f = aeguVar;
        this.h = ahiyVar;
        this.g = executor;
        akbl akblVar = new akbl(executor, true, false);
        this.e = akblVar;
        akblVar.c();
    }

    public final void a(akfb akfbVar, akgo akgoVar, akgh akghVar) {
        int andIncrement;
        boolean z;
        aiut.c();
        akfbVar.getClass();
        akgn akgnVar = (akgn) Map.EL.computeIfAbsent(this.a, akghVar.getClass(), new agpp(this, akfbVar, 2));
        aiut.c();
        akbn akbnVar = this.c;
        tm tmVar = akbnVar.c;
        Class<?> cls = akghVar.getClass();
        if (tmVar.containsKey(cls)) {
            andIncrement = ((Integer) akbnVar.c.get(cls)).intValue();
        } else {
            andIncrement = akbn.a.getAndIncrement();
            akbnVar.c.put(cls, Integer.valueOf(andIncrement));
        }
        Object put = akbnVar.b.put(Integer.valueOf(andIncrement), akghVar);
        akfbVar.c().getClass();
        boolean z2 = false;
        if ((akghVar instanceof akgg) && (akghVar instanceof akey)) {
            z = false;
        } else {
            z = true;
        }
        d.s(z);
        akge akgeVar = akgnVar.g;
        Object obj = akgeVar.b;
        Instant f = akgnVar.a.f();
        if (akgeVar.d != Long.MAX_VALUE) {
            z2 = true;
        }
        albo.U(z2, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        akghVar.getClass();
        akgnVar.g = new akge(akfbVar, akfbVar.c(), akgoVar, akgeVar.d + 1, 3, akgeVar.e.a(akfbVar, f));
        akgi akgiVar = akgnVar.h;
        akgnVar.h = new akgi(akgiVar.b + 1, akghVar, akgiVar.d, akgiVar.e, alfd.a);
        if (akgnVar.d == null) {
            akgnVar.d = new akgm(akgnVar);
            akgnVar.i.s(akgnVar.g.b, akgnVar.d);
        } else if (!akgnVar.g.b.equals(obj)) {
            akgnVar.i.t(obj, akgnVar.d);
            akgnVar.i.s(akgnVar.g.b, akgnVar.d);
        }
        if (put == null && akgnVar.h.e.f()) {
            albo.U(!akgnVar.h.f.f(), "Cannot be the case that subscription has data.");
            akgi akgiVar2 = akgnVar.h;
            akgnVar.h = akgn.j(akgiVar2, (akfq) akgiVar2.e.b());
            albo.U(akgnVar.h.f.f(), "Callbacks did not accept pinned data after rotation.");
            if ((akgnVar.h.c instanceof akey) && !akgnVar.j.g()) {
                akgnVar.h = akgnVar.h.b(true);
                akgn.f((akey) akgnVar.h.c);
                return;
            }
            return;
        }
        akgnVar.e(akgnVar.g.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eor
    public final void gi() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((akgn) it.next()).a();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((akgn) it2.next()).a();
        }
        this.e.a().clear();
    }
}
