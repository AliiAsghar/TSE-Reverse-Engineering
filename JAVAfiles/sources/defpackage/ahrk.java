package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrk {
    public final Object a;
    public final Object b;

    public ahrk(ahow ahowVar, apwt apwtVar) {
        this.a = ahowVar;
        this.b = apwtVar;
    }

    public final aozy a(ahka ahkaVar) {
        aozy createBuilder = asjg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asjg asjgVar = (asjg) apagVar;
        asjgVar.b |= 1;
        asjgVar.c = true;
        String d = ahka.d(ahkaVar);
        if (d != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            asjg asjgVar2 = (asjg) createBuilder.b;
            asjgVar2.b |= 4;
            asjgVar2.e = d;
        }
        try {
            aozy createBuilder2 = asiz.a.createBuilder();
            asiy a = ((ahow) this.a).a();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            asiz asizVar = (asiz) createBuilder2.b;
            a.getClass();
            asizVar.c = a;
            asizVar.b |= 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asjg asjgVar3 = (asjg) createBuilder.b;
            asiz asizVar2 = (asiz) createBuilder2.s();
            asizVar2.getClass();
            asjgVar3.d = asizVar2;
            asjgVar3.b |= 2;
        } catch (RuntimeException e) {
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'V', "CrashMetricFactory.java")).q("Failed to get process stats.");
        }
        return createBuilder;
    }

    public ahrk(Context context, armf armfVar) {
        this.a = context;
        this.b = armfVar;
    }
}
