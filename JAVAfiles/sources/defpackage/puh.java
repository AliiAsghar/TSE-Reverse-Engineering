package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class puh extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ pui c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puh(pui puiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = puiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((puh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        pui puiVar;
        ?? r0;
        armo armoVar;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            r0 = this.a;
            puiVar = (pui) this.d;
            try {
                aqil.P(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    armd.i(r0, th);
                    throw th2;
                }
            }
        } else {
            aqil.P(obj);
            arwe arweVar = (arwe) this.d;
            puiVar = this.c;
            akrh e = aktp.e("UnifiedCacheRcsCapabilitiesDataSource#LoadData");
            try {
                ?? r5 = puiVar.d.get();
                r5.getClass();
                Set aE = aqjn.aE(r5);
                Object obj2 = puiVar.j.a;
                int d = ((iki) obj2).d();
                boolean w = ((adjc) ((iki) obj2).r.b()).w(d);
                alvw d2 = iki.a.d();
                d2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "isRcsAvailableForCurrentlySelectedSubId", 258, "RcsCapabilitiesDataSourceWrapper.java")).x("Currently selected in convo v1 is subId=%d, isRcsAvailable=%b", d, w);
                if (!w) {
                    List an = aqjn.an(aE);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(an, 10)), 16));
                    for (Object obj3 : an) {
                        linkedHashMap.put(obj3, psv.c());
                    }
                    akfa a = akfa.a(alzz.bc(linkedHashMap), puiVar.b.f());
                    armd.i(e, null);
                    return a;
                }
                List an2 = aqjn.an(aE);
                ArrayList arrayList = new ArrayList(aqjn.J(an2, 10));
                Iterator it = an2.iterator();
                while (it.hasNext()) {
                    arrayList.add(arrn.I(arweVar, null, null, new iqi((msh) it.next(), puiVar, (arpe) null, 8), 3));
                }
                this.d = puiVar;
                this.a = e;
                this.b = 1;
                obj = arrj.j(arrayList, this);
                if (obj != arplVar) {
                    r0 = e;
                } else {
                    return arplVar;
                }
            } catch (Throwable th3) {
                th = th3;
                r0 = e;
                throw th;
            }
        }
        Map q = aqjn.q((Iterable) obj);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : q.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                armoVar = new armo(key, value);
            } else {
                armoVar = null;
            }
            if (armoVar != null) {
                arrayList2.add(armoVar);
            }
        }
        alor bc = alzz.bc(aqjn.q(arrayList2));
        if (puiVar.e) {
            puiVar.e = false;
            ?? r4 = puiVar.d.get();
            r4.getClass();
            msh mshVar = (msh) aqjn.ah(aqjn.an(r4));
            if (mshVar != null) {
                qjh.l(puiVar.a, null, new iqi(puiVar, mshVar, (arpe) null, 7), 3);
            }
        }
        akfa a2 = akfa.a(bc, puiVar.b.f());
        armd.i(r0, null);
        return a2;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        puh puhVar = new puh(this.c, arpeVar);
        puhVar.d = obj;
        return puhVar;
    }
}
