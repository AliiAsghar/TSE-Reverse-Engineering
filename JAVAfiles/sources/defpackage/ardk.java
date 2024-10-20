package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardk extends aqrs {
    final /* synthetic */ ardo a;

    public ardk(ardo ardoVar) {
        this.a = ardoVar;
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        ScheduledExecutorService c;
        ardr ardrVar = this.a.c;
        Executor g = ardrVar.g(aqrrVar);
        if (ardrVar.D) {
            c = null;
        } else {
            c = this.a.c.i.c();
        }
        arai araiVar = new arai(aquxVar, g, aqrrVar, ardrVar.S, c, this.a.c.F);
        ardr ardrVar2 = this.a.c;
        araiVar.j = ardrVar2.n;
        araiVar.k = ardrVar2.o;
        return araiVar;
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.a.b;
    }
}
