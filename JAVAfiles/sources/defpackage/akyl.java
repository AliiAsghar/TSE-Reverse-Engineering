package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akyl implements akxq {
    final /* synthetic */ akym a;
    final /* synthetic */ akmy b;

    public akyl(akym akymVar, akmy akmyVar) {
        this.b = akmyVar;
        this.a = akymVar;
    }

    @Override // defpackage.akxq
    public final void a(Throwable th) {
        this.b.j(1);
        throw new IllegalStateException("unhandled exception in request processing", th);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.function.Consumer, java.lang.Object] */
    @Override // defpackage.akxq
    public final /* synthetic */ void b(Object obj) {
        Object apply;
        akxa akxaVar = (akxa) obj;
        aozy createBuilder = albh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((albh) createBuilder.b).d = false;
        Object obj2 = akxaVar.a;
        if (obj2 != null) {
            akym akymVar = this.a;
            aozy createBuilder2 = albg.a.createBuilder();
            for (Map.Entry entry : akymVar.b.d.entrySet()) {
                apply = d$$ExternalSyntheticApiModelOutline0.m329m(entry.getValue()).apply(obj2);
                List list = (List) apply;
                if (!list.isEmpty()) {
                    aozy createBuilder3 = albf.a.createBuilder();
                    String str = (String) entry.getKey();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar = createBuilder3.b;
                    str.getClass();
                    ((albf) apagVar).b = str;
                    if (!apagVar.isMutable()) {
                        createBuilder3.u();
                    }
                    albf albfVar = (albf) createBuilder3.b;
                    apax apaxVar = albfVar.c;
                    if (!apaxVar.c()) {
                        albfVar.c = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(list, albfVar.c);
                    albf albfVar2 = (albf) createBuilder3.s();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    albg albgVar = (albg) createBuilder2.b;
                    albfVar2.getClass();
                    apax apaxVar2 = albgVar.b;
                    if (!apaxVar2.c()) {
                        albgVar.b = apag.mutableCopy(apaxVar2);
                    }
                    albgVar.b.add(albfVar2);
                }
            }
            albg albgVar2 = (albg) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            albh albhVar = (albh) createBuilder.b;
            albgVar2.getClass();
            albhVar.c = albgVar2;
            albhVar.b = 3;
        }
        akmy akmyVar = this.b;
        akmyVar.a.q(albo.s("app_action_result", (albh) createBuilder.s()));
    }
}
