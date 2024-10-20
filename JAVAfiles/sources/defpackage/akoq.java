package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akoq implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akoq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj2;
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        Object obj3 = this.a;
                        ((amdw) obj3).j++;
                        try {
                            ((amdw) obj3).i.b();
                            return (ListenableFuture) ((amdw) obj3).d.get();
                        } catch (Exception e) {
                            ((ance) obj3).setException(e);
                            return albo.bI(null);
                        }
                    }
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        obj2 = this.a;
                        i = 4;
                        if (!it.hasNext()) {
                            break;
                        }
                        akou akouVar = (akou) ((Map.Entry) it.next()).getValue();
                        akpc akpcVar = (akpc) obj2;
                        aogy aogyVar = akpcVar.c;
                        gsf b = akpc.b(akouVar.a);
                        String d = akpc.d(akpc.b(akouVar.a), akpcVar.c());
                        long j = akouVar.b;
                        algw c = akpcVar.c();
                        akct a = akcx.a(akpa.class);
                        a.e = algw.i(Long.valueOf(j));
                        a.c(new akcu(akpa.b, alfd.a));
                        a.e(new akcw(d, 3));
                        a.b(b);
                        a.d(new altx(akpa.d(c)));
                        arrayList.add(ancj.f(aogyVar.r(a.a()), akto.a(new akok(akouVar, 4)), andi.a));
                    }
                    Set keySet = map.keySet();
                    HashSet hashSet = new HashSet();
                    Iterator it2 = keySet.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(akpc.b((Set) it2.next()));
                    }
                    akpc akpcVar2 = (akpc) obj2;
                    arrayList.add(ancj.g(akpcVar2.c.s(akpa.d(akpcVar2.c())), akto.d(new akoz(obj2, hashSet, i)), akpcVar2.b));
                    return albo.bX(arrayList).a(akto.k(new agug(14)), andi.a);
                }
                Map map2 = (Map) obj;
                if (map2.isEmpty()) {
                    return aneh.a;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    Object obj4 = this.a;
                    akou akouVar2 = (akou) ((Map.Entry) it3.next()).getValue();
                    boolean z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    for (akny aknyVar : akouVar2.a) {
                        if (aknyVar == akny.ON_CHARGER) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z4 |= z;
                        if (aknyVar == akny.ON_NETWORK_CONNECTED) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z6 |= z2;
                        if (aknyVar == akny.ON_NETWORK_UNMETERED) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z5 |= z3;
                    }
                    gsd gsdVar = new gsd();
                    gsdVar.a = z4;
                    if (z5) {
                        gsdVar.c(3);
                    } else if (z6) {
                        gsdVar.c(2);
                    }
                    gsf a2 = gsdVar.a();
                    Set set = akouVar2.a;
                    akpb akpbVar = (akpb) obj4;
                    akpbVar.b();
                    StringBuilder sb = new StringBuilder("SyncTask");
                    Iterator it4 = new TreeSet(set).iterator();
                    while (it4.hasNext()) {
                        sb.append(((akny) it4.next()).d);
                        sb.append('_');
                    }
                    String sb2 = sb.toString();
                    akcv akcvVar = new akcv(Math.max(0L, akouVar2.b - akpbVar.b.f().toEpochMilli()), TimeUnit.MILLISECONDS);
                    akpbVar.b();
                    akct a3 = akcx.a(akoy.class);
                    a3.d = akcvVar;
                    a3.e(new akcw(sb2, 1));
                    a3.b(a2);
                    a3.d(new altx("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"));
                    arrayList2.add(ancj.f(akpbVar.c.r(a3.a()), akto.a(new akok(akouVar2, 3)), andi.a));
                }
                return albo.bX(arrayList2).a(akto.k(new agug(13)), andi.a);
            }
            final long longValue = ((Long) obj).longValue();
            final tm tmVar = new tm();
            final tm tmVar2 = new tm();
            Object obj5 = this.a;
            final akos akosVar = (akos) obj5;
            final long epochMilli = akosVar.b.f().toEpochMilli();
            return aktp.Z(aktp.Y(akosVar.h(akosVar.f.b()), new algk() { // from class: akop
                @Override // defpackage.algk
                public final Object apply(Object obj6) {
                    Object obj7;
                    akop akopVar = this;
                    akos akosVar2 = akos.this;
                    Object obj8 = akosVar2.j;
                    Map map3 = (Map) obj6;
                    Map map4 = tmVar2;
                    long j2 = longValue;
                    synchronized (obj8) {
                        try {
                            Iterator it5 = akosVar2.k.entrySet().iterator();
                            while (true) {
                                boolean hasNext = it5.hasNext();
                                Map map5 = tmVar;
                                if (hasNext) {
                                    Map.Entry entry = (Map.Entry) it5.next();
                                    akot akotVar = (akot) entry.getKey();
                                    if (!akosVar2.l.containsKey(akotVar)) {
                                        if (akosVar2.m()) {
                                            Map map6 = akosVar2.m;
                                            Long valueOf = Long.valueOf(j2);
                                            long max = Math.max(((Long) Map.EL.getOrDefault(map6, akotVar, valueOf)).longValue(), ((Long) Map.EL.getOrDefault(map3, akotVar, valueOf)).longValue());
                                            aknz aknzVar = ((akot) entry.getKey()).b;
                                            aknv a4 = ((akob) entry.getValue()).a();
                                            long j3 = a4.a;
                                            long j4 = j2;
                                            long j5 = epochMilli;
                                            if (j3 + max <= j5) {
                                                Iterator<E> it6 = ((alor) a4.c).entrySet().iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        Map.Entry entry2 = (Map.Entry) it6.next();
                                                        obj7 = obj8;
                                                        try {
                                                            long j6 = ((aknx) entry2.getValue()).b;
                                                            long j7 = j5 - max;
                                                            long j8 = j5;
                                                            long j9 = a4.a + j6;
                                                            if (j6 != -1 && j7 > j9) {
                                                                obj8 = obj7;
                                                                j5 = j8;
                                                            }
                                                            akny aknyVar2 = (akny) entry2.getKey();
                                                            if (!map4.containsKey(aknyVar2)) {
                                                                map4.put(aknyVar2, Boolean.valueOf(((akoc) ((armf) akosVar2.g.get(aknyVar2)).b()).a()));
                                                            }
                                                            if (((Boolean) map4.get(aknyVar2)).booleanValue()) {
                                                                obj8 = obj7;
                                                                j5 = j8;
                                                            } else {
                                                                ((alvg) ((alvg) akos.a.e()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "shouldSync", 574, "SyncManagerImpl.java")).t("Skipping synclet %s due to unsatisfied constraint", aknzVar);
                                                                break;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            throw th;
                                                        }
                                                    } else {
                                                        obj7 = obj8;
                                                        SettableFuture create = SettableFuture.create();
                                                        akosVar2.l.put(akotVar, create);
                                                        map5.put(akotVar, create);
                                                        break;
                                                    }
                                                }
                                                akopVar = this;
                                                j2 = j4;
                                                obj8 = obj7;
                                            } else {
                                                akopVar = this;
                                                j2 = j4;
                                            }
                                        }
                                    }
                                    akopVar = this;
                                } else {
                                    return map5;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj7 = obj8;
                        }
                    }
                }
            }, akosVar.c), new ajzp(obj5, 20), akosVar.c);
        }
        return this.a;
    }
}
