package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.ArrayMap;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkw {
    public final Object a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public akkw(Context context, String str, aoij aoijVar, String str2, boolean z) {
        this.d = context;
        this.c = str;
        this.a = aoijVar;
        this.e = str2;
        this.b = z;
    }

    public static agox g(final int i) {
        if (i == 0) {
            return new sab(5);
        }
        return new agox() { // from class: agob
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                return "JT_" + i + "_" + ((String) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l(agpo agpoVar, alog alogVar) {
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            agoa agoaVar = (agoa) alogVar.get(i);
            k(agoaVar.e);
            l(agpoVar, agoaVar.a.n.i());
        }
    }

    public final Object a(ajwt ajwtVar) {
        Set c = c();
        boolean z = true;
        if (!this.b && !c.isEmpty() && (c.size() != 1 || !c.contains(ajwtVar))) {
            z = false;
        }
        albo.Z(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", c, ajwtVar);
        albo.X(((aklj) this.d).a.getApplicationContext() instanceof apxq, "Sting Activity must be attached to an @Sting Application. Found: %s", ((aklj) this.d).a.getApplicationContext());
        aoij aoijVar = (aoij) this.e;
        if (((algw) aoijVar.a).f()) {
            kra i = ((akkv) aovp.m(((ansy) aoijVar.c).h(ajwtVar), akkv.class)).i();
            i.b = (Activity) ((algw) aoijVar.a).b();
            return i.a();
        }
        kra i2 = ((akkv) aovp.m(((ansy) aoijVar.c).h(ajwtVar), akkv.class)).i();
        i2.c = aoijVar.b;
        return i2.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final void b(ajwt ajwtVar) {
        apxa apxaVar;
        synchronized (this.a) {
            Set c = c();
            if (!c.isEmpty()) {
                ajwt ajwtVar2 = (ajwt) alzz.aP(c);
                synchronized (this.a) {
                    albo.T(this.c.containsKey(ajwtVar2));
                    this.c.remove(ajwtVar2);
                    akku g = ((ansy) ((aoij) this.e).c).g(ajwtVar2);
                    synchronized (g.c) {
                        eog eogVar = g.a;
                        for (String str : aqjn.h(aqjn.h(eogVar.b.keySet(), eogVar.c.keySet()), eogVar.d.keySet())) {
                            g.a.b(str);
                            eog eogVar2 = g.a;
                            str.getClass();
                            eogVar2.c.remove(str);
                        }
                        if (g.d != null) {
                            apxaVar = ((akkt) aovp.m(g.d, akkt.class)).a();
                        } else {
                            apxaVar = null;
                        }
                        g.d = null;
                    }
                    if (apxaVar != null) {
                        apxaVar.b();
                    }
                }
            }
            this.c.put(ajwtVar, a(ajwtVar));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public final Set c() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.c.keySet());
        }
        return unmodifiableSet;
    }

    public final ListenableFuture d(String str) {
        return ancj.f(((ahta) this.a).b().c((String) this.c, str), new algk() { // from class: ahvm
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                long j;
                boolean z;
                double d;
                String str2;
                aozb aozbVar;
                ahtu ahtuVar = (ahtu) obj;
                aozy createBuilder = ahvp.a.createBuilder();
                if (ahtuVar == null) {
                    return (ahvp) createBuilder.s();
                }
                for (ahtw ahtwVar : ahtuVar.f) {
                    aozy createBuilder2 = ahvq.a.createBuilder();
                    String str3 = ahtwVar.e;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    ahvq ahvqVar = (ahvq) apagVar;
                    str3.getClass();
                    ahvqVar.b |= 1;
                    ahvqVar.e = str3;
                    int i = ahtwVar.c;
                    int a = ahop.a(i);
                    if (a != 0) {
                        int i2 = a - 1;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            if (i == 5) {
                                                aozbVar = (aozb) ahtwVar.d;
                                            } else {
                                                aozbVar = aozb.b;
                                            }
                                            if (!createBuilder2.b.isMutable()) {
                                                createBuilder2.u();
                                            }
                                            ahvq ahvqVar2 = (ahvq) createBuilder2.b;
                                            aozbVar.getClass();
                                            ahvqVar2.c = 6;
                                            ahvqVar2.d = aozbVar;
                                        } else {
                                            throw new IllegalStateException("No known flag type");
                                        }
                                    } else {
                                        if (i == 4) {
                                            str2 = (String) ahtwVar.d;
                                        } else {
                                            str2 = "";
                                        }
                                        if (!apagVar.isMutable()) {
                                            createBuilder2.u();
                                        }
                                        ahvq ahvqVar3 = (ahvq) createBuilder2.b;
                                        str2.getClass();
                                        ahvqVar3.c = 5;
                                        ahvqVar3.d = str2;
                                    }
                                } else {
                                    if (i == 3) {
                                        d = ((Double) ahtwVar.d).doubleValue();
                                    } else {
                                        d = 0.0d;
                                    }
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ahvq ahvqVar4 = (ahvq) createBuilder2.b;
                                    ahvqVar4.c = 4;
                                    ahvqVar4.d = Double.valueOf(d);
                                }
                            } else {
                                if (i == 2) {
                                    z = ((Boolean) ahtwVar.d).booleanValue();
                                } else {
                                    z = false;
                                }
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                ahvq ahvqVar5 = (ahvq) createBuilder2.b;
                                ahvqVar5.c = 3;
                                ahvqVar5.d = Boolean.valueOf(z);
                            }
                        } else {
                            if (i == 1) {
                                j = ((Long) ahtwVar.d).longValue();
                            } else {
                                j = 0;
                            }
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            ahvq ahvqVar6 = (ahvq) createBuilder2.b;
                            ahvqVar6.c = 2;
                            ahvqVar6.d = Long.valueOf(j);
                        }
                        ahvq ahvqVar7 = (ahvq) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahvp ahvpVar = (ahvp) createBuilder.b;
                        ahvqVar7.getClass();
                        apax apaxVar = ahvpVar.g;
                        if (!apaxVar.c()) {
                            ahvpVar.g = apag.mutableCopy(apaxVar);
                        }
                        ahvpVar.g.add(ahvqVar7);
                    } else {
                        throw null;
                    }
                }
                String str4 = ahtuVar.e;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                ahvp ahvpVar2 = (ahvp) apagVar2;
                str4.getClass();
                ahvpVar2.b = 4 | ahvpVar2.b;
                ahvpVar2.e = str4;
                String str5 = ahtuVar.c;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                ahvp ahvpVar3 = (ahvp) apagVar3;
                str5.getClass();
                ahvpVar3.b = 1 | ahvpVar3.b;
                ahvpVar3.c = str5;
                long j2 = ahtuVar.i;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                ahvp ahvpVar4 = (ahvp) apagVar4;
                ahvpVar4.b |= 8;
                ahvpVar4.f = j2;
                if ((ahtuVar.b & 2) != 0) {
                    aozb aozbVar2 = ahtuVar.d;
                    if (!apagVar4.isMutable()) {
                        createBuilder.u();
                    }
                    ahvp ahvpVar5 = (ahvp) createBuilder.b;
                    aozbVar2.getClass();
                    ahvpVar5.b |= 2;
                    ahvpVar5.d = aozbVar2;
                }
                return (ahvp) createBuilder.s();
            }
        }, ((ahta) this.a).d());
    }

    public final ListenableFuture e(ahvp ahvpVar) {
        return albo.bM(new ahes(this, ahvpVar, 4), ((ahta) this.a).d());
    }

    public final boolean f() {
        ahvr ahvrVar = ((ahta) this.a).f;
        if (this.b) {
            ahuk b = ahvrVar.b();
            if (b.e && new apaq(b.i, ahuk.a).contains(aocu.PROCESS_STABLE)) {
                return true;
            }
            return false;
        }
        ahuj a = ahvrVar.a();
        if (a.e && new apaq(a.j, ahuj.a).contains(aocu.PROCESS_STABLE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final agox h(String str) {
        return (agox) this.e.get(str);
    }

    public final alog i() {
        return ((alob) this.d).g();
    }

    public final boolean j() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void k(String str) {
        if (this.e.containsKey(str)) {
        } else {
            this.e.put(str, g(((AtomicInteger) this.c).getAndIncrement()));
        }
    }

    public akkw() {
        this(false);
    }

    public akkw(aklj akljVar, aoij aoijVar) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = akljVar;
        this.e = aoijVar;
        algw algwVar = (algw) aoijVar.a;
        boolean z = false;
        if (algwVar.f() && (algwVar.b() instanceof akke)) {
            z = true;
        }
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    public akkw(agpo agpoVar, agpf agpfVar, boolean z) {
        this(z);
        alur it = agpfVar.p.iterator();
        while (it.hasNext()) {
            agoa agoaVar = (agoa) it.next();
            ((alob) this.d).h(agoaVar);
            this.a.add(agoaVar.a.k);
        }
        l(agpoVar, agpfVar.p);
    }

    public akkw(boolean z) {
        this.e = new ArrayMap();
        this.d = new alob();
        this.a = new ArrayList();
        this.c = new AtomicInteger(1);
        this.b = z;
    }

    public akkw(Context context, algw algwVar, ahsh ahshVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.d = context;
        this.c = albo.D(new agud(context, 17));
        this.b = ((Boolean) algwVar.d(false)).booleanValue();
        this.a = ahshVar;
        this.e = clearcutMetricSnapshotTransmitter;
    }

    public akkw(ahta ahtaVar, String str, String str2, boolean z) {
        this.a = ahtaVar;
        this.c = str;
        this.e = str2;
        this.b = z;
        aiuz aiuzVar = new aiuz(ahtaVar.d);
        aiuzVar.c("phenotype");
        aiuzVar.d(str2 + "/" + str + ".pb");
        if (z) {
            int i = agqa.a;
            aiuzVar.b();
        }
        this.d = aiuzVar.a();
    }
}
