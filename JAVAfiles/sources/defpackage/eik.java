package defpackage;

import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eik extends arpw implements arqr {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eik(eij eijVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.d = i;
        this.c = eijVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return new eik((urm) this.c, (arpe) obj, 2).b(arnb.a);
            }
            return new eik((eij) this.c, (arpe) obj, 1).b(arnb.a);
        }
        return new eik((eil) this.c, (arpe) obj, 0).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        ?? r0;
        FileInputStream fileInputStream;
        ?? r3;
        Throwable th;
        FileInputStream fileInputStream2;
        Object obj2;
        eiz eizVar;
        LinkedHashMap linkedHashMap;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                arpl arplVar = arpl.a;
                int i2 = 10;
                if (this.b != 0) {
                    ?? r02 = this.a;
                    aqil.P(obj);
                    linkedHashMap = r02;
                } else {
                    aqil.P(obj);
                    ura uraVar = new ura(urd.a);
                    uqu uquVar = urd.c;
                    uraVar.c((uqv) uquVar.a, (uqv) uquVar.b);
                    uraVar.w("findFailedWorkManagerTasks");
                    uraVar.d(new unt(i2));
                    uraVar.q();
                    alog t = uraVar.b().t();
                    t.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(t, 10)), 16));
                    alur it = t.iterator();
                    while (it.hasNext()) {
                        uqs uqsVar = (uqs) it.next();
                        Object obj3 = uqsVar.h().get();
                        String k = uqsVar.k();
                        k.getClass();
                        armo armoVar = new armo(obj3, k);
                        linkedHashMap2.put(armoVar.a, armoVar.b);
                    }
                    Set keySet = linkedHashMap2.keySet();
                    Object obj4 = this.c;
                    ArrayList arrayList = new ArrayList(aqjn.J(keySet, 10));
                    Iterator it2 = keySet.iterator();
                    while (it2.hasNext()) {
                        urm urmVar = (urm) obj4;
                        arrayList.add(arrn.I(urmVar.e(), null, null, new lxi((UUID) it2.next(), urmVar, (arpe) null, 4), 3));
                    }
                    this.a = linkedHashMap2;
                    this.b = 1;
                    obj = arrj.j(arrayList, this);
                    if (obj != arplVar) {
                        linkedHashMap = linkedHashMap2;
                    } else {
                        return arplVar;
                    }
                }
                Set<Map.Entry> entrySet = aqjn.q((Iterable) obj).entrySet();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(entrySet, 10)), 16));
                for (Map.Entry entry : entrySet) {
                    UUID uuid = (UUID) entry.getKey();
                    gtl gtlVar = (gtl) entry.getValue();
                    Object obj5 = linkedHashMap.get(uuid);
                    obj5.getClass();
                    armo armoVar2 = new armo(obj5, gtlVar);
                    linkedHashMap3.put(armoVar2.a, armoVar2.b);
                }
                Set entrySet2 = linkedHashMap3.entrySet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : entrySet2) {
                    gtl gtlVar2 = (gtl) ((Map.Entry) obj6).getValue();
                    if (!Objects.isNull(gtlVar2)) {
                        Set set = urm.b;
                        gtlVar2.getClass();
                        if (!set.contains(gtlVar2.b)) {
                        }
                    }
                    arrayList2.add(obj6);
                }
                ArrayList arrayList3 = new ArrayList(aqjn.J(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((String) ((Map.Entry) it3.next()).getKey());
                }
                return arrayList3;
            }
            arpl arplVar2 = arpl.a;
            int i3 = this.b;
            try {
            } catch (Throwable th2) {
                kkc h = ((eij) this.c).h();
                this.a = th2;
                this.b = 2;
                Object y = h.y();
                if (y != arplVar2) {
                    obj2 = th2;
                    obj = y;
                } else {
                    return arplVar2;
                }
            }
            if (i3 != 0) {
                if (i3 != 1) {
                    obj2 = this.a;
                    aqil.P(obj);
                    eizVar = new eit((Throwable) obj2, ((Number) obj).intValue());
                    return new armo(eizVar, true);
                }
                aqil.P(obj);
            } else {
                aqil.P(obj);
                Object obj7 = this.c;
                this.b = 1;
                obj = ((eij) obj7).d(true, this);
                if (obj == arplVar2) {
                    return arplVar2;
                }
            }
            eizVar = (eiz) obj;
            return new armo(eizVar, true);
        }
        arpl arplVar3 = arpl.a;
        int i4 = this.b;
        try {
        } catch (FileNotFoundException unused) {
            if (((eil) this.c).a.exists()) {
                FileInputStream fileInputStream3 = new FileInputStream(((eil) this.c).a);
                try {
                    fvq fvqVar = ((eil) this.c).b;
                    this.a = fileInputStream3;
                    this.b = 2;
                    if (fvqVar.o(fileInputStream3) != arplVar3) {
                        fileInputStream = fileInputStream3;
                    } else {
                        return arplVar3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r0 = fileInputStream3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        if (i4 != 0) {
            if (i4 != 1) {
                r0 = this.a;
                try {
                    aqil.P(obj);
                    fileInputStream = r0;
                    armd.i(fileInputStream, null);
                    return ((eil) this.c).b.a;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
            r3 = this.a;
            try {
                aqil.P(obj);
                fileInputStream2 = r3;
            } catch (Throwable th5) {
                th = th5;
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            aqil.P(obj);
            FileInputStream fileInputStream4 = new FileInputStream(((eil) this.c).a);
            try {
                fvq fvqVar2 = ((eil) this.c).b;
                this.a = fileInputStream4;
                this.b = 1;
                Object o = fvqVar2.o(fileInputStream4);
                if (o != arplVar3) {
                    fileInputStream2 = fileInputStream4;
                    obj = o;
                } else {
                    return arplVar3;
                }
            } catch (Throwable th6) {
                r3 = fileInputStream4;
                th = th6;
                throw th;
            }
        }
        armd.i(fileInputStream2, null);
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eik(eil eilVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.d = i;
        this.c = eilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eik(urm urmVar, arpe arpeVar, int i) {
        super(1, arpeVar);
        this.d = i;
        this.c = urmVar;
    }
}
