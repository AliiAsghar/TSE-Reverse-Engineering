package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qjk {
    public static final xze a = xze.g("Bugle", "ThreadUtilizationLogger");
    public final armf b;
    private final armf c;
    private final anen d;

    public qjk(armf armfVar, armf armfVar2, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul a(final String str) {
        aday adayVar = (aday) this.c.b();
        return akul.g(albo.bM(new aaze(adayVar, 10), adayVar.a)).h(new algk() { // from class: qjj
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                int cu;
                Collection<aglf> collection = (Collection) obj;
                xze xzeVar = qjk.a;
                String str2 = str;
                xzeVar.l("takeSnapshot at ".concat(str2));
                if (!collection.isEmpty()) {
                    maq maqVar = (maq) qjk.this.b.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.THREAD_UTILIZATION;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amtu.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    amtu amtuVar = (amtu) apagVar;
                    amtuVar.b |= 1;
                    amtuVar.c = str2;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    amtu amtuVar2 = (amtu) createBuilder.b;
                    amtuVar2.d = 1;
                    amtuVar2.b |= 2;
                    for (aglf aglfVar : collection) {
                        qjk.a.l("ThreadPoolStatsSnapshot(" + akec.ai() + ") at " + str2 + ": " + String.valueOf(aglfVar));
                        aozy createBuilder2 = amtt.a.createBuilder();
                        String str3 = aglfVar.a;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amtt amttVar = (amtt) createBuilder2.b;
                        amttVar.b |= 1;
                        amttVar.c = str3;
                        aglc a2 = aglfVar.a();
                        long millis = TimeUnit.NANOSECONDS.toMillis(a2.c);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar2 = createBuilder2.b;
                        amtt amttVar2 = (amtt) apagVar2;
                        amttVar2.b |= 2;
                        amttVar2.d = millis;
                        long j = a2.b;
                        long j2 = a2.c + j;
                        if (j2 == 0) {
                            cu = 0;
                        } else {
                            cu = albo.cu((j * 100) / j2);
                        }
                        if (!apagVar2.isMutable()) {
                            createBuilder2.u();
                        }
                        amtt amttVar3 = (amtt) createBuilder2.b;
                        amttVar3.b |= 4;
                        amttVar3.e = cu;
                        qjk.a.l("ThreadPoolStats(" + akec.ai() + ") at " + str2 + ": " + String.valueOf(createBuilder2.s()));
                        amtt amttVar4 = (amtt) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amtu amtuVar3 = (amtu) createBuilder.b;
                        amttVar4.getClass();
                        apax apaxVar = amtuVar3.e;
                        if (!apaxVar.c()) {
                            amtuVar3.e = apag.mutableCopy(apaxVar);
                        }
                        amtuVar3.e.add(amttVar4);
                    }
                    qjk.a.l("ThreadUtilization(" + akec.ai() + ") at " + str2 + ": " + String.valueOf(createBuilder.s()));
                    amtu amtuVar4 = (amtu) createBuilder.s();
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amtuVar4.getClass();
                    amfrVar2.bk = amtuVar4;
                    amfrVar2.g |= 64;
                    maqVar.j(amfqVar);
                    return null;
                }
                return null;
            }
        }, this.d);
    }
}
