package defpackage;

import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uof {
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueBatchingImpl");
    public final upp b;
    public final xnv c;
    public final usk d;
    public final apwt e;
    private final armf f;
    private final agnq g;
    private final arwe h;
    private final arwe i;
    private final anen j;
    private final uoo k;
    private final Optional l;
    private final uqg m;

    public uof(armf armfVar, agnq agnqVar, arwe arweVar, arwe arweVar2, anen anenVar, upp uppVar, xnv xnvVar, uoo uooVar, Optional optional, usk uskVar, uqg uqgVar, apwt apwtVar) {
        armfVar.getClass();
        agnqVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        anenVar.getClass();
        uppVar.getClass();
        xnvVar.getClass();
        uskVar.getClass();
        uqgVar.getClass();
        apwtVar.getClass();
        this.f = armfVar;
        this.g = agnqVar;
        this.h = arweVar;
        this.i = arweVar2;
        this.j = anenVar;
        this.b = uppVar;
        this.c = xnvVar;
        this.k = uooVar;
        this.l = optional;
        this.d = uskVar;
        this.m = uqgVar;
        this.e = apwtVar;
        if (!((yyt) uooVar.f.b()).z()) {
            return;
        }
        egl.i(uooVar.b, new uon(uooVar), new IntentFilter("messaging.workqueue.WorkQueueDebugger"), "android.permission.DUMP");
    }

    public final unz a(upk upkVar) {
        upkVar.getClass();
        akrh e = aktp.e("WorkQueueBatchingImpl#queueWorkItem");
        try {
            alog r = alog.r(upkVar);
            r.getClass();
            Object obj = d(r).get(upkVar);
            obj.getClass();
            unz unzVar = (unz) obj;
            armd.i(e, null);
            return unzVar;
        } finally {
        }
    }

    public final akul b(upk upkVar) {
        akul c;
        c = qjh.c(this.h, arpj.a, arwf.a, new uog(this, upkVar, (arpe) null, 1));
        return c;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, apbt] */
    public final alog c(String str) {
        uoh uohVar = (uoh) this.e.b();
        alog<upr> b = uohVar.b(str, true);
        ArrayList arrayList = new ArrayList(aqjn.J(b, 10));
        for (upr uprVar : b) {
            ?? d = uohVar.b.c(str).e().d(uprVar.s());
            d.getClass();
            arrayList.add(new unb(d, uprVar.m(), uprVar.n()));
        }
        return alzz.aZ(arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [arwe, java.lang.Object] */
    public final alor d(alog alogVar) {
        Object next;
        akrh e = aktp.e("WorkQueueBatchingImpl#queueWorkItems");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : alogVar) {
                upk upkVar = (upk) obj;
                upkVar.getClass();
                if (!this.l.isEmpty()) {
                    Object obj2 = this.l.get();
                    byte[] byteArray = upkVar.b.toByteArray();
                    uop uopVar = (uop) ((upj) obj2).c.b();
                    String str = upkVar.a;
                    unx b = uopVar.b(str);
                    if (b != null) {
                        if (!str.contains("-")) {
                            try {
                                int length = byteArray.length;
                                if (length <= ((Integer) upj.b.e()).intValue()) {
                                    if (upkVar.b.equals(b.e().d(byteArray))) {
                                        if (!b.i(byteArray)) {
                                            alvw f = upj.a.f();
                                            f.X(alwp.a, "BugleWorkQueue");
                                            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "check", 58, "WorkQueuePreflightImpl.java")).t("preflightRaw for %s returned false", upkVar.a);
                                            arrayList2.add(obj);
                                        }
                                    } else {
                                        alvw i = upj.a.i();
                                        i.X(alwp.a, "BugleWorkQueue");
                                        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 88, "WorkQueuePreflightImpl.java")).q("failed equality reparsing protobuf (wrong protobuf type?)");
                                        throw new ute();
                                    }
                                } else {
                                    alvw h = upj.a.h();
                                    h.X(alwp.a, "BugleWorkQueue");
                                    ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 82, "WorkQueuePreflightImpl.java")).w("protobuf too big %d vs %d", length, upj.b.e());
                                    throw new utf("protobuf too big " + length + " vs " + String.valueOf(upj.b.e()));
                                }
                            } catch (apba e2) {
                                alvw i2 = upj.a.i();
                                i2.X(alwp.a, "BugleWorkQueue");
                                ((alvg) ((alvg) ((alvg) i2).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", ']', "WorkQueuePreflightImpl.java")).q("got InvalidProtocolBufferException re-parsing protobuf (wrong protobuf type?)");
                                throw new utd(e2);
                            }
                        } else {
                            alvw i3 = upj.a.i();
                            i3.X(alwp.a, "BugleWorkQueue");
                            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 76, "WorkQueuePreflightImpl.java")).t("key cannot contain the character - %s", str);
                            throw new utc("key cannot contain the character - ".concat(str));
                        }
                    } else {
                        alvw i4 = upj.a.i();
                        i4.X(alwp.a, "BugleWorkQueue");
                        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 71, "WorkQueuePreflightImpl.java")).t("no handler found for type %s", str);
                        throw new utb("no handler found for type ".concat(str));
                    }
                }
                arrayList.add(obj);
            }
            armo armoVar = new armo(arrayList, arrayList2);
            List list = (List) armoVar.a;
            List list2 = (List) armoVar.b;
            int i5 = 10;
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(list2, 10)), 16));
            for (Object obj3 : list2) {
                linkedHashMap.put(obj3, upb.e());
            }
            if (list.isEmpty()) {
                alor bc = alzz.bc(linkedHashMap);
                armd.i(e, null);
                return bc;
            }
            uop uopVar2 = (uop) this.f.b();
            ArrayList arrayList3 = new ArrayList(aqjn.J(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((upk) it.next()).a);
            }
            Set<String> aE = aqjn.aE(arrayList3);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(aE, 10)), 16));
            for (String str2 : aE) {
                armo armoVar2 = new armo(str2, uopVar2.c(str2).f());
                linkedHashMap2.put(armoVar2.a, armoVar2.b);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj4 : list) {
                upk upkVar2 = (upk) obj4;
                String str3 = (String) linkedHashMap2.get(upkVar2.a);
                String str4 = upkVar2.c.a;
                if (TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                    if (str3 == null) {
                        str3 = upkVar2.a;
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str3 = str3.concat("-");
                    } else {
                        str3 = a.co(str4, str3, "-");
                    }
                }
                Object obj5 = linkedHashMap3.get(str3);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap3.put(str3, obj5);
                }
                ((List) obj5).add(obj4);
            }
            ArrayList arrayList4 = new ArrayList(linkedHashMap3.size());
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                final String str5 = (String) entry.getKey();
                final List list3 = (List) entry.getValue();
                str5.getClass();
                int i6 = 0;
                this.l.ifPresent(new uoa(qnc.r, i6));
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list3) {
                    if (((upk) obj6).c.b != null) {
                        arrayList5.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj7 : arrayList5) {
                    String str6 = ((upk) obj7).c.b;
                    str6.getClass();
                    Object obj8 = linkedHashMap4.get(str6);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap4.put(str6, obj8);
                    }
                    ((List) obj8).add(obj7);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(aqjn.i(linkedHashMap4.size()));
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    linkedHashMap5.put(entry2.getKey(), (upk) ((List) entry2.getValue()).get(0));
                }
                Collection<List> values = linkedHashMap4.values();
                ArrayList arrayList6 = new ArrayList();
                for (List list4 : values) {
                    List al = aqjn.al(list4, 1);
                    ArrayList arrayList7 = new ArrayList(aqjn.J(al, i5));
                    Iterator it2 = al.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(new armo((upk) it2.next(), list4.get(i6)));
                        i6 = 0;
                    }
                    aqjn.S(arrayList6, arrayList7);
                    i6 = 0;
                    i5 = 10;
                }
                uod uodVar = new uod(linkedHashMap5, aqjn.q(arrayList6));
                final Map map = uodVar.a;
                final Map map2 = uodVar.b;
                uoe uoeVar = (uoe) this.g.c("WorkQueueBatchingImpl#queueWorkItemAndReturnFuture", new alhr() { // from class: uob
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.alhr
                    public final Object get() {
                        Map map3;
                        agnw d;
                        Object next2;
                        Optional optional;
                        ArrayList arrayList8;
                        List list5 = list3;
                        list5.getClass();
                        akrh e3 = aktp.e("WorkQueueBatchingImpl#duplicateRows");
                        Map map4 = map2;
                        Map map5 = map;
                        try {
                            boolean isEmpty = map5.isEmpty();
                            String str7 = str5;
                            uof uofVar = this;
                            int i7 = 0;
                            if (isEmpty) {
                                map3 = arnw.a;
                            } else {
                                upy a2 = uqb.a();
                                a2.w("WorkQueueBatchingImpl#findExistingDuplicateRows");
                                a2.d(new uoc(str7, list5, uofVar, i7));
                                alog t = a2.b().t();
                                t.getClass();
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(t, 10)), 16));
                                alur it3 = t.iterator();
                                while (it3.hasNext()) {
                                    E next3 = it3.next();
                                    String n = ((upr) next3).n();
                                    upk upkVar3 = (upk) map5.get(n);
                                    if (upkVar3 != null) {
                                        linkedHashMap6.put(upkVar3, next3);
                                    } else {
                                        throw new IllegalStateException("Could not find request for deduplication tag ".concat(String.valueOf(n)));
                                    }
                                }
                                xyo d2 = uof.a.d();
                                d2.H("Deduping pwq items");
                                d2.x("count", linkedHashMap6.size());
                                d2.z("queue", str7);
                                d2.q();
                                map3 = linkedHashMap6;
                            }
                            armd.i(e3, null);
                            e3 = aktp.e("WorkQueueBatchingImpl#scheduleNewRows");
                            try {
                                ArrayList<upk> arrayList9 = new ArrayList();
                                for (Object obj9 : list5) {
                                    upk upkVar4 = (upk) obj9;
                                    if (!map3.keySet().contains(upkVar4) && !map4.keySet().contains(upkVar4)) {
                                        arrayList9.add(obj9);
                                    }
                                }
                                long epochMilli = uofVar.c.f().toEpochMilli();
                                ArrayList arrayList10 = new ArrayList(aqjn.J(arrayList9, 10));
                                for (upk upkVar5 : arrayList9) {
                                    upkVar5.getClass();
                                    String[] strArr = uqb.a;
                                    int i8 = tyr.a;
                                    ups upsVar = new ups();
                                    upsVar.h(upkVar5.a);
                                    upsVar.g(epochMilli);
                                    upsVar.f(upkVar5.b.toByteArray());
                                    upsVar.e(str7);
                                    upsVar.c(upkVar5.c.b);
                                    upsVar.b(upkVar5.c.d);
                                    Duration duration = upkVar5.c.c;
                                    if (duration != null) {
                                        arrayList8 = arrayList9;
                                        upsVar.d(new Date(epochMilli + duration.toMillis()));
                                    } else {
                                        arrayList8 = arrayList9;
                                    }
                                    arrayList10.add(upsVar.a());
                                    arrayList9 = arrayList8;
                                    i7 = 0;
                                }
                                ArrayList arrayList11 = arrayList9;
                                upr[] uprVarArr = (upr[]) arrayList10.toArray(new upr[i7]);
                                upr[] uprVarArr2 = (upr[]) Arrays.copyOf(uprVarArr, uprVarArr.length);
                                d = agnc.d("$primary");
                                long[] x = agnc.x(d, 0, true, new vhg(1), uprVarArr2);
                                x.getClass();
                                arns arnsVar = new arns(x);
                                upy a3 = uqb.a();
                                a3.w("WorkQueueBatchingImpl#loadInsertedRows");
                                a3.d(new uje(arnsVar, 18));
                                a3.e(new atkn(uqb.c.a, (byte[]) null));
                                alog t2 = a3.b().t();
                                xyo d3 = uof.a.d();
                                d3.H("Queued");
                                d3.z("queue", str7);
                                d3.x("count", arrayList11.size());
                                d3.q();
                                t2.getClass();
                                Map q = aqjn.q(aqjn.aA(arrayList11, t2));
                                armd.i(e3, null);
                                e3 = aktp.e("WorkQueueBatchingImpl#maybeSchedulingDeferred");
                                try {
                                    Iterator it4 = q.values().iterator();
                                    if (!it4.hasNext()) {
                                        next2 = null;
                                    } else {
                                        next2 = it4.next();
                                        if (it4.hasNext()) {
                                            long k = ((upr) next2).k();
                                            do {
                                                Object next4 = it4.next();
                                                long k2 = ((upr) next4).k();
                                                if (k > k2) {
                                                    k = k2;
                                                }
                                                if (k > k2) {
                                                    next2 = next4;
                                                }
                                            } while (it4.hasNext());
                                        }
                                    }
                                    upr uprVar = (upr) next2;
                                    if (uprVar != null) {
                                        optional = uofVar.b.c(uprVar);
                                    } else {
                                        optional = null;
                                    }
                                    if (optional == null) {
                                        optional = Optional.empty();
                                    }
                                    armd.i(e3, null);
                                    return new uoe(map3, q, optional);
                                } finally {
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                });
                Map map3 = uoeVar.a;
                Map map4 = uoeVar.b;
                arwl arwlVar = (arwl) arsd.k(uoeVar.c);
                if (arwlVar == null) {
                    Iterator it3 = map4.values().iterator();
                    if (!it3.hasNext()) {
                        next = null;
                    } else {
                        next = it3.next();
                        if (it3.hasNext()) {
                            long k = ((upr) next).k();
                            do {
                                Object next2 = it3.next();
                                long k2 = ((upr) next2).k();
                                if (k > k2) {
                                    k = k2;
                                }
                                if (k > k2) {
                                    next = next2;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    upr uprVar = (upr) next;
                    if (uprVar != null) {
                        arwlVar = arrn.I(this.i, null, arwf.b, new iqi(this, uprVar, (arpe) null, 18), 1);
                    } else {
                        arwlVar = null;
                    }
                    if (arwlVar == null) {
                        arwlVar = new arvv();
                        arwlVar.v(null);
                    }
                }
                e = aktp.e("WorkQueueBatchingImpl#finish");
                try {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(aqjn.i(map4.size()));
                    for (Iterator it4 = map4.entrySet().iterator(); it4.hasNext(); it4 = it4) {
                        Map.Entry entry3 = (Map.Entry) it4.next();
                        Object key = entry3.getKey();
                        uqg uqgVar = this.m;
                        long k3 = ((upr) entry3.getValue()).k();
                        uqf uqfVar = new uqf(arwlVar, uqgVar.a);
                        ((ConcurrentHashMap) uqgVar.b).putIfAbsent(Long.valueOf(k3), uqfVar);
                        linkedHashMap6.put(key, uqfVar);
                    }
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(aqjn.i(map3.size()));
                    for (Map.Entry entry4 : map3.entrySet()) {
                        Object key2 = entry4.getKey();
                        Object obj9 = (unz) ((ConcurrentHashMap) this.m.b).get(Long.valueOf(((upr) entry4.getValue()).k()));
                        if (obj9 == null) {
                            obj9 = upb.e();
                        }
                        linkedHashMap7.put(key2, obj9);
                    }
                    arwlVar.A();
                    Set h2 = aqjn.h(map3.keySet(), map2.keySet());
                    e = aktp.e("WorkQueueBatchingImpl#runWorkRequestExtrasCallbacks");
                    try {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it5 = h2.iterator();
                        while (it5.hasNext()) {
                            ahjj ahjjVar = ((upk) it5.next()).c.f;
                            if (ahjjVar != null) {
                                arrayList8.add(ahjjVar);
                            }
                        }
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            xzw.c(new aafg(((ahjj) it6.next()).a, 20));
                        }
                        Set keySet = linkedHashMap6.keySet();
                        ArrayList arrayList9 = new ArrayList();
                        Iterator it7 = keySet.iterator();
                        while (it7.hasNext()) {
                            ahjj ahjjVar2 = ((upk) it7.next()).c.f;
                            if (ahjjVar2 != null) {
                                arrayList9.add(ahjjVar2);
                            }
                        }
                        Iterator it8 = arrayList9.iterator();
                        while (it8.hasNext()) {
                            xzw.c(new aafg(((ahjj) it8.next()).a, 19));
                        }
                        for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                            upk upkVar3 = (upk) entry5.getKey();
                            unz unzVar = (unz) entry5.getValue();
                            andy andyVar = upkVar3.c.e;
                            if (andyVar != null) {
                                unzVar.a().k(andyVar, this.j);
                            }
                        }
                        armd.i(e, null);
                        Map p = aqjn.p(linkedHashMap6, linkedHashMap7);
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap(aqjn.i(map2.size()));
                        for (Map.Entry entry6 : map2.entrySet()) {
                            Object key3 = entry6.getKey();
                            Object obj10 = p.get(entry6.getValue());
                            obj10.getClass();
                            linkedHashMap8.put(key3, (unz) obj10);
                        }
                        Map p2 = aqjn.p(p, linkedHashMap8);
                        armd.i(e, null);
                        arrayList4.add(p2);
                        i5 = 10;
                    } finally {
                    }
                } finally {
                }
            }
            Iterator it9 = arrayList4.iterator();
            if (it9.hasNext()) {
                Object next3 = it9.next();
                while (it9.hasNext()) {
                    next3 = aqjn.p((Map) next3, (Map) it9.next());
                }
                alor bc2 = alzz.bc(aqjn.p((Map) next3, linkedHashMap));
                armd.i(e, null);
                return bc2;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        } finally {
        }
    }

    public final void e(String str, String str2) {
        if (!Integer.valueOf(((uoh) this.e.b()).a(str, str2)).equals(0)) {
            return;
        }
        uoh.a.h().D("Attempted to cancel work, but no work found %s %s", str, str2);
        throw new IndexOutOfBoundsException("Attempted to cancel work, but no work found");
    }

    public final void f(String str) {
        ((uoh) this.e.b()).b(str, false);
    }
}
