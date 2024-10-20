package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aidy implements ancs {
    public final /* synthetic */ aiea a;

    public /* synthetic */ aidy(aiea aieaVar) {
        this.a = aieaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, anmv] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, anmv] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        aiea aieaVar;
        akul g;
        List list = (List) obj;
        ((alvg) ((alvg) aiea.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "uploadObservations", 320, "MobaltPeriodicJobImpl.java")).r("Mobalt: uploading logs to the Cobalt Server, got %s observations", list.size());
        if (list.isEmpty()) {
            return aktp.ag(null);
        }
        alob alobVar = new alob();
        Iterator it = list.iterator();
        while (true) {
            aieaVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            aiei aieiVar = ((aidm) it.next()).b;
            aozy createBuilder = alem.a.createBuilder();
            alen alenVar = aieiVar.c;
            if (alenVar == null) {
                alenVar = alen.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alem alemVar = (alem) createBuilder.b;
            alenVar.getClass();
            alemVar.c = alenVar;
            alemVar.b |= 1;
            for (aieh aiehVar : aieiVar.d) {
                ajna ajnaVar = aieaVar.l;
                alel alelVar = aiehVar.d;
                if (alelVar == null) {
                    alelVar = alel.a;
                }
                int i = ajnaVar.a;
                alea a = ajna.a(alelVar, 12, ajnaVar.c, aicu.d, aiehVar.c);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                alem alemVar2 = (alem) createBuilder.b;
                a.getClass();
                alemVar2.a();
                alemVar2.d.add(a);
            }
            alobVar.h((alem) createBuilder.s());
        }
        agrk agrkVar = aieaVar.n;
        alog g2 = alobVar.g();
        alob alobVar2 = new alob();
        HashMap hashMap = new HashMap();
        alur it2 = g2.iterator();
        while (it2.hasNext()) {
            alem alemVar3 = (alem) it2.next();
            alen alenVar2 = alemVar3.c;
            if (alenVar2 == null) {
                alenVar2 = alen.a;
            }
            aozb byteString = alenVar2.toByteString();
            aozy aozyVar = (aozy) hashMap.get(byteString);
            if (aozyVar == null) {
                aozyVar = alem.a.createBuilder();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                alem alemVar4 = (alem) aozyVar.b;
                alenVar2.getClass();
                alemVar4.c = alenVar2;
                alemVar4.b |= 1;
                hashMap.put(byteString, aozyVar);
                alobVar2.h(aozyVar);
            }
            apax apaxVar = alemVar3.d;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            alem alemVar5 = (alem) aozyVar.b;
            alemVar5.a();
            aoyj.addAll(apaxVar, alemVar5.d);
        }
        alog alogVar = (alog) Collection.EL.stream(alobVar2.g()).map(new agnz(19)).collect(alls.a);
        aozy createBuilder2 = aleb.a.createBuilder();
        Object obj2 = agrkVar.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((aleb) apagVar).c = (aozb) obj2;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        aleb alebVar = (aleb) createBuilder2.b;
        apax apaxVar2 = alebVar.b;
        if (!apaxVar2.c()) {
            alebVar.b = apag.mutableCopy(apaxVar2);
        }
        aoyj.addAll(alogVar, alebVar.b);
        aleb alebVar2 = (aleb) createBuilder2.s();
        ajna ajnaVar2 = (ajna) agrkVar.b;
        int i2 = ajnaVar2.b;
        alea a2 = ajna.a(alebVar2, 11, ajnaVar2.d, aicu.b, aozb.b);
        aict aictVar = aieaVar.h;
        ((alvg) ((alvg) aict.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/clearcut/ClearcutUploader", "upload", 64, "ClearcutUploader.java")).t("Mobalt: start uploading logs to Clearcut log_source = %s", aictVar.c.h);
        aictVar.c.g(a2).c().q(new uyb(aictVar, 10));
        alog alogVar2 = (alog) Collection.EL.stream(list).map(new agnz(20)).collect(alls.a);
        aidd aiddVar = aieaVar.g;
        if (alogVar2.isEmpty()) {
            g = aktp.ag(null);
        } else {
            g = akul.g(aiddVar.c.f(new aidc(alogVar2, 0)));
        }
        return g.i(new ahce(aieaVar, 8), aieaVar.i).i(new aidy(aieaVar), aieaVar.i);
    }
}
