package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urr implements uro {
    public static final xze a = xze.g("BugleWorkQueue", "WorkQueueWorkerImpl");
    public static final uuf b = uuh.q(151866670);
    public final armf c;
    public final anen d;
    public final aneo e;
    public final agnq f;
    public final apwt g;
    public final uot h;
    public final xnv i;
    public final uvi k;
    public final mce l;
    public final uqg m;
    public final unj n;
    public final Executor j = andi.a;
    private final Map o = DesugarCollections.synchronizedMap(new HashMap());

    public urr(armf armfVar, anen anenVar, aneo aneoVar, agnq agnqVar, apwt apwtVar, uot uotVar, xnv xnvVar, uvi uviVar, mce mceVar, uqg uqgVar) {
        this.c = armfVar;
        this.d = anenVar;
        this.e = aneoVar;
        this.f = agnqVar;
        this.g = apwtVar;
        this.h = uotVar;
        this.i = xnvVar;
        this.k = uviVar;
        this.l = mceVar;
        this.m = uqgVar;
        this.n = new unj(agnqVar);
    }

    public static int c(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new unt(12));
        int i = alog.d;
        return ((alog) map.collect(alls.a)).hashCode();
    }

    @Override // defpackage.uro
    public final akul a(String str, String str2) {
        int a2 = ((uop) this.c.b()).a(str2);
        xyo d = a.d();
        d.H("startWork");
        d.z("src", str);
        d.z("queue", str2);
        d.q();
        andr andrVar = (andr) Map.EL.computeIfAbsent(this.o, str2, new unt(13));
        upy a3 = uqb.a();
        a3.w("WorkQueueWorkerImpl#startWork");
        a3.d(new tux(this, str2, 11));
        upt uptVar = uqb.c;
        a3.e(new atkn(uptVar.j, (byte[]) null), new atkn(uptVar.a, (byte[]) null));
        a3.u(a2);
        return akul.g(andrVar.b(akto.c(new ahpg(this, str, str2, a3.b(), a2, 1)), this.d));
    }

    @Override // defpackage.uro
    public final void b(arjs arjsVar, Pattern pattern) {
        unj unjVar = this.n;
        unjVar.c(new rvz((Object) unjVar, (Object) arjsVar, (Object) pattern, 18, (byte[]) null));
    }

    public final upm d(unx unxVar, alog alogVar, upm upmVar, unh unhVar) {
        this.n.d();
        if (upmVar.d) {
            return upmVar;
        }
        return (upm) this.f.c("WorkQueueWorkerImpl#handleResultInner", new ahjf(this, alogVar, unhVar, upmVar, unxVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(alog alogVar, unh unhVar) {
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            this.n.a((upr) alogVar.get(i)).c(unhVar);
        }
    }
}
