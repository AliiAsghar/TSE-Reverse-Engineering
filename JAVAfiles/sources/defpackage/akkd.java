package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkd {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public akkd(ahiy ahiyVar, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.c = ahiyVar;
        this.f = anenVar;
        this.e = anenVar2;
        this.b = armfVar;
        this.d = armfVar2;
        this.a = armfVar5;
        this.h = armfVar3;
        this.g = armfVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alor b(Collection collection, aozy aozyVar) {
        boolean z;
        int R;
        int i;
        ajzb ajzbVar;
        ajzw ajzwVar = (ajzw) aozyVar.s();
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            ajzb ajzbVar2 = (ajzb) it.next();
            Iterator it2 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajzw) aozyVar.b).d)).values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    ajzz ajzzVar = (ajzz) it2.next();
                    ajzb ajzbVar3 = ajzzVar.d;
                    if (ajzbVar3 == null) {
                        ajzbVar3 = ajzb.a;
                    }
                    if (ajzbVar3.i.equals(ajzbVar2.i) && ajzbVar3.c.equals(ajzbVar2.c)) {
                        aozy builder = ajzzVar.toBuilder();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        ajzz ajzzVar2 = (ajzz) builder.b;
                        ajzbVar2.getClass();
                        ajzb ajzbVar4 = ajzzVar2.d;
                        if (ajzbVar4 != null && ajzbVar4 != (ajzbVar = ajzb.a)) {
                            apaa apaaVar = (apaa) ajzbVar.createBuilder(ajzbVar4);
                            apaaVar.w(ajzbVar2);
                            ajzzVar2.d = (ajzb) apaaVar.t();
                        } else {
                            ajzzVar2.d = ajzbVar2;
                        }
                        ajzzVar2.b = 2 | ajzzVar2.b;
                        aozyVar.ay(ajzzVar.c, (ajzz) builder.s());
                        i = ajzzVar.c;
                    }
                } else {
                    aozy createBuilder = ajzz.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ajzz ajzzVar3 = (ajzz) apagVar;
                    ajzbVar2.getClass();
                    ajzzVar3.d = ajzbVar2;
                    ajzzVar3.b = 2 | ajzzVar3.b;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    ajzz ajzzVar4 = (ajzz) createBuilder.b;
                    ajzzVar4.e = 0;
                    ajzzVar4.b |= 4;
                    apag apagVar2 = aozyVar.b;
                    int i2 = ((ajzw) apagVar2).c;
                    int i3 = i2 + 1;
                    if (!apagVar2.isMutable()) {
                        aozyVar.u();
                    }
                    ajzw ajzwVar2 = (ajzw) aozyVar.b;
                    ajzwVar2.b |= 1;
                    ajzwVar2.c = i3;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ajzz ajzzVar5 = (ajzz) createBuilder.b;
                    ajzzVar5.b = 1 | ajzzVar5.b;
                    ajzzVar5.c = i2;
                    aozyVar.ay(i2, (ajzz) createBuilder.s());
                    i = i2;
                }
            }
            hashMap.put(ajwt.a(i), ajzbVar2);
        }
        alor j = alor.j(hashMap);
        if (j.size() == collection.size()) {
            z = true;
        }
        albo.U(z, "Provider had duplicate accounts.");
        alpt<ajwt> o = alpt.o(alzz.G(ansy.w(ajzwVar), j.keySet()));
        alok alokVar = new alok();
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajzw) aozyVar.b).d));
        for (ajwt ajwtVar : o) {
            Integer valueOf = Integer.valueOf(ajwtVar.a);
            if (unmodifiableMap.containsKey(valueOf) && (R = a.R(((ajzz) unmodifiableMap.get(valueOf)).e)) != 0 && R == 2) {
                alokVar.h(ajwtVar, (ajzz) unmodifiableMap.get(valueOf));
            }
        }
        alor b = alokVar.b();
        Iterator<E> it3 = o.iterator();
        while (it3.hasNext()) {
            int i4 = ((ajwt) it3.next()).a;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            ((ajzw) aozyVar.b).a().remove(Integer.valueOf(i4));
        }
        return b;
    }

    public static atkn c(ajzd ajzdVar, Set set) {
        ListenableFuture bH;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                bH = ((ajzf) it.next()).a(ajzdVar);
                arrayList.add(bH);
            } catch (Exception e) {
                bH = albo.bH(e);
            }
            akat.c(bH, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return albo.bV(arrayList);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahtx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final ListenableFuture a(String str, boolean z) {
        akrh f = aktp.f("Fetching experiments for device", akrk.a);
        try {
            f = aktp.f("PhenotypeApi.getConfigurationSnapshot", akrk.a);
            try {
                ListenableFuture c = this.c.c(str, "");
                if (z) {
                    c = aktu.a(c, 25L, TimeUnit.SECONDS, this.a);
                }
                f.b(c);
                armd.i(f, null);
                ListenableFuture g = ancj.g(c, akto.d(new ahsi(this, str, 12)), andi.a);
                f.b(g);
                armd.i(f, null);
                return ancj.f(akec.B(aqjn.B(aktp.T(((atqq) this.g).i(), abrn.class, new akez(agdl.n, 7), andi.a), g)), akto.a(new akez(g, 6)), andi.a);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture d(ahiy ahiyVar, algk algkVar) {
        AtomicReference atomicReference = new AtomicReference();
        return ancj.f(ahiyVar.z(akto.a(new ajzr(algkVar, atomicReference, 0)), this.f), akto.a(new ajyn(atomicReference, 8)), andi.a);
    }

    public akkd(algw algwVar, ScheduledExecutorService scheduledExecutorService, asqe asqeVar, asqe asqeVar2, Map map, ahtx ahtxVar, akmy akmyVar, atqq atqqVar) {
        algwVar.getClass();
        scheduledExecutorService.getClass();
        asqeVar.getClass();
        asqeVar2.getClass();
        map.getClass();
        ahtxVar.getClass();
        atqqVar.getClass();
        this.d = algwVar;
        this.a = scheduledExecutorService;
        this.e = asqeVar;
        this.f = asqeVar2;
        this.b = map;
        this.c = ahtxVar;
        this.h = akmyVar;
        this.g = atqqVar;
    }

    public akkd(ScheduledExecutorService scheduledExecutorService, Map map, ahtx ahtxVar, algw algwVar, asqe asqeVar, asqe asqeVar2, akmy akmyVar, atqq atqqVar) {
        scheduledExecutorService.getClass();
        map.getClass();
        ahtxVar.getClass();
        algwVar.getClass();
        asqeVar.getClass();
        asqeVar2.getClass();
        atqqVar.getClass();
        this.a = scheduledExecutorService;
        this.b = map;
        this.c = ahtxVar;
        this.d = algwVar;
        this.e = asqeVar;
        this.f = asqeVar2;
        this.h = akmyVar;
        this.g = atqqVar;
    }
}
