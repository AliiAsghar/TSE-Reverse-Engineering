package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnn implements adns {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adnn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.adns
    public final void a(aozy aozyVar) {
        apjp apjpVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        alor alorVar = adnt.a;
                        if (!aozyVar.b.isMutable()) {
                            aozyVar.u();
                        }
                        Object obj = this.a;
                        apjr apjrVar = (apjr) aozyVar.b;
                        apjr apjrVar2 = apjr.a;
                        apjrVar.f = ((apjq) obj).d;
                        apjrVar.b |= 8;
                        return;
                    }
                    alor alorVar2 = adnt.a;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    apjr apjrVar3 = (apjr) aozyVar.b;
                    apjr apjrVar4 = apjr.a;
                    apao apaoVar = apjrVar3.m;
                    if (!apaoVar.c()) {
                        apjrVar3.m = apag.mutableCopy(apaoVar);
                    }
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        apjrVar3.m.g(((apjo) it.next()).d);
                    }
                    return;
                }
                alor alorVar3 = adnt.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj2 = this.a;
                apjr apjrVar5 = (apjr) aozyVar.b;
                apjr apjrVar6 = apjr.a;
                apjrVar5.n = ((apjo) obj2).d;
                apjrVar5.b |= 1024;
                return;
            }
            alor alorVar4 = adnt.a;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            Object obj3 = this.a;
            apjr apjrVar7 = (apjr) aozyVar.b;
            apjr apjrVar8 = apjr.a;
            apjrVar7.A = ((amww) obj3).aa;
            apjrVar7.b |= 16777216;
            return;
        }
        alor alorVar5 = adnt.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        Object obj4 = this.a;
        apjr apjrVar9 = (apjr) aozyVar.b;
        apjr apjrVar10 = apjr.a;
        adjl adjlVar = (adjl) obj4;
        apjrVar9.j = adjlVar.a.E;
        apjrVar9.b |= 128;
        if (adjlVar.e()) {
            apjpVar = apjp.TRUE;
        } else {
            apjpVar = apjp.FALSE;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apjr apjrVar11 = (apjr) aozyVar.b;
        apjrVar11.k = apjpVar.d;
        apjrVar11.b |= 256;
    }
}
