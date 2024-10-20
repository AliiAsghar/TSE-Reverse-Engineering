package defpackage;

import android.app.Application;
import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmm implements apxw {
    public static alya a(Object obj) {
        final akmj akmjVar = (akmj) obj;
        return new alya() { // from class: akmk
            @Override // defpackage.alya
            public final alww a(String str) {
                return new akml(str, akmj.this);
            }
        };
    }

    public static aiex c(Context context, final long j) {
        final Application application = (Application) context;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final akmx akmxVar = new akmx(atomicBoolean, application);
        return new aiex() { // from class: akmw
            @Override // defpackage.aiex
            public final void a() {
                Application application2 = application;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = akmxVar;
                application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                aiut.e(new prc(atomicBoolean, application2, activityLifecycleCallbacks, j, 6));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alog d(Map map, vl vlVar, Object obj) {
        List list;
        int i;
        int i2;
        Set keySet = map.keySet();
        synchronized (vlVar) {
            list = (List) vlVar.get(keySet);
            if (list == null) {
                list = new ArrayList(keySet);
                Collections.shuffle(list, (Random) ((akmy) obj).a);
                vl vlVar2 = new vl();
                ArrayDeque arrayDeque = new ArrayDeque(list);
                HashSet hashSet = new HashSet(list);
                while (true) {
                    i = 0;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    akno aknoVar = (akno) arrayDeque.remove();
                    alog alogVar = aknoVar.b;
                    int i3 = ((alsx) alogVar).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        akno aknoVar2 = (akno) alogVar.get(i4);
                        akmy.h(vlVar2, aknoVar, aknoVar2);
                        if (hashSet.add(aknoVar2)) {
                            arrayDeque.add(aknoVar2);
                        }
                    }
                    alog alogVar2 = aknoVar.c;
                    int i5 = ((alsx) alogVar2).c;
                    while (i < i5) {
                        akno aknoVar3 = (akno) alogVar2.get(i);
                        akmy.h(vlVar2, aknoVar3, aknoVar);
                        if (hashSet.add(aknoVar3)) {
                            arrayDeque.add(aknoVar3);
                        }
                        i++;
                    }
                }
                alpt o = alpt.o(list);
                try {
                    ArrayList<anbu> arrayList = new ArrayList(list.size());
                    HashMap hashMap = new HashMap(list.size());
                    int i6 = 0;
                    for (Object obj2 : list) {
                        anbu anbuVar = new anbu(obj2, i6);
                        arrayList.add(anbuVar);
                        List list2 = (List) hashMap.get(obj2);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(obj2, list2);
                        }
                        list2.add(anbuVar);
                        i6++;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        anbu anbuVar2 = (anbu) arrayList.get(i);
                        Iterator<E> it = akmy.g(o, vlVar2, (akno) anbuVar2.a).iterator();
                        while (true) {
                            i2 = i + 1;
                            if (it.hasNext()) {
                                List list3 = (List) hashMap.get(it.next());
                                if (list3 != null) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        ((anbu) it2.next()).c.add(anbuVar2);
                                        anbuVar2.d++;
                                    }
                                } else {
                                    anbuVar2.d++;
                                }
                            }
                        }
                        i = i2;
                    }
                    ArrayList arrayList2 = new ArrayList(list.size());
                    PriorityQueue priorityQueue = new PriorityQueue();
                    for (anbu anbuVar3 : arrayList) {
                        if (anbuVar3.d == 0) {
                            priorityQueue.add(anbuVar3);
                        }
                    }
                    while (!priorityQueue.isEmpty()) {
                        anbu anbuVar4 = (anbu) priorityQueue.poll();
                        arrayList2.add(anbuVar4);
                        for (anbu anbuVar5 : anbuVar4.c) {
                            int i7 = anbuVar5.d - 1;
                            anbuVar5.d = i7;
                            if (i7 == 0) {
                                priorityQueue.add(anbuVar5);
                            }
                        }
                    }
                    if (arrayList2.size() != list.size()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (anbu anbuVar6 : arrayList) {
                            if (anbuVar6.d > 0) {
                                arrayList3.add(anbuVar6.a);
                            }
                        }
                        throw new anbt(arrayList3);
                    }
                    list.clear();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        list.add(((anbu) it3.next()).a);
                    }
                    vlVar.put(keySet, list);
                } catch (anbt e) {
                    throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
                }
            }
        }
        alob alobVar = new alob();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((Set) map.get((akno) it4.next())).iterator();
            while (it5.hasNext()) {
                alobVar.h((aolh) ((armf) it5.next()).b());
            }
        }
        alog g = alobVar.g();
        g.getClass();
        return g;
    }

    public static akoi e(boolean z, armf armfVar, armf armfVar2) {
        if (true != z) {
            armfVar = armfVar2;
        }
        akoi akoiVar = (akoi) armfVar.b();
        akoiVar.getClass();
        return akoiVar;
    }

    public static aksr f(Object obj, armf armfVar, Set set) {
        return new aksr((akte) obj, armfVar, set);
    }

    public static anca g() {
        anbz anbzVar = anbz.a;
        anbzVar.getClass();
        return anbzVar;
    }

    public static aoma h(Map map, aksr aksrVar) {
        alok alokVar = new alok();
        for (Map.Entry entry : ((alor) map).entrySet()) {
            alokVar.h((String) entry.getKey(), new vhf(aksrVar, entry, 12));
        }
        return new aoma(alokVar.b());
    }

    public static alya i() {
        alyh alyhVar = alyj.c;
        String str = alyhVar.a;
        int i = alyhVar.f;
        return new alyh(2, alyhVar.b, true, alyhVar.d, alyhVar.e);
    }

    public static aquq j(Context context) {
        return new aquq(new acss(context, 14));
    }

    public static alya k(final Context context, final apwt apwtVar, Object obj, final zfj zfjVar, final String str) {
        final akmi akmiVar = (akmi) obj;
        return new alya() { // from class: akmf
            @Override // defpackage.alya
            public final alww a(String str2) {
                apwt apwtVar2 = apwtVar;
                apwtVar2.getClass();
                return new akmh(str2, new aoms(context, akmiVar, zfjVar, new acss(apwtVar2, 13), str));
            }
        };
    }

    public static akcy l(armf armfVar, ahiy ahiyVar) {
        return new akdf(new acss(armfVar, 16), ahiyVar);
    }

    public static akcy m(armf armfVar, ahiy ahiyVar) {
        return new akdf(new acss(armfVar, 17), ahiyVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public static boolean n(aojh aojhVar) {
        return ((asqc) aojhVar.a.b()).y("com.google.android.apps.messaging.auto 45370282").e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public static boolean o(aojh aojhVar) {
        return ((asqc) aojhVar.a.b()).y("com.google.android.apps.messaging.auto 45368720").e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long p(aojh aojhVar) {
        return ((asqc) aojhVar.a.b()).y("com.google.android.apps.messaging.auto 45368721").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long q(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45639089").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long r(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45634061").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long s(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45643860").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long t(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45625892").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long u(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45634380").b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public static long v(aojj aojjVar) {
        return ((asqc) aojjVar.b.b()).y("com.google.android.apps.messaging.auto 45625894").b();
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
