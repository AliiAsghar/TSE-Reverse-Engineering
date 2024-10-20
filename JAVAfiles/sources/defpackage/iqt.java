package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqt implements emx {
    private final armf c;
    private final armf d;
    private final cj f;
    private final xnv g;
    private Instant h;
    private final xze b = xze.g("Bugle", "ConversationScreenErrorStateLogger");
    public final AtomicInteger a = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);

    public iqt(cj cjVar, armf armfVar, armf armfVar2, xnv xnvVar) {
        this.f = cjVar;
        this.d = armfVar;
        this.c = armfVar2;
        this.g = xnvVar;
    }

    public final void a(int i) {
        this.e.set(i - 1);
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        this.b.l("onCreate called:");
        this.h = this.g.f();
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        this.b.l("onDestroy called:");
        if (Duration.between(this.h, this.g.f()).compareTo(Duration.ofMillis(((Long) kuw.a.e()).longValue())) > 0 && this.e.get() != 3) {
            aozy createBuilder = amum.a.createBuilder();
            aozy createBuilder2 = amol.a.createBuilder();
            int Y = a.Y(this.a.get());
            if (Y != 0) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amol amolVar = (amol) createBuilder2.b;
                amolVar.d = Y - 1;
                amolVar.b |= 2;
                boolean f = ((izc) this.d.b()).f(this.f);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amol amolVar2 = (amol) createBuilder2.b;
                amolVar2.b |= 1;
                amolVar2.c = f;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amum amumVar = (amum) createBuilder.b;
                amol amolVar3 = (amol) createBuilder2.s();
                amolVar3.getClass();
                amumVar.d = amolVar3;
                amumVar.b |= 2;
                aozy createBuilder3 = amom.a.createBuilder();
                int Y2 = a.Y(this.e.get());
                if (Y2 != 0) {
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amom amomVar = (amom) createBuilder3.b;
                    amomVar.c = Y2 - 1;
                    amomVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amum amumVar2 = (amum) createBuilder.b;
                    amom amomVar2 = (amom) createBuilder3.s();
                    amomVar2.getClass();
                    amumVar2.c = amomVar2;
                    amumVar2.b |= 1;
                    maq maqVar = (maq) this.c.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.CONVERSATION_SCREEN_METRIC_EVENT;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder4 = amun.a.createBuilder();
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    amun amunVar = (amun) createBuilder4.b;
                    amum amumVar3 = (amum) createBuilder.s();
                    amumVar3.getClass();
                    amunVar.c = amumVar3;
                    amunVar.b = 1;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amun amunVar2 = (amun) createBuilder4.s();
                    amunVar2.getClass();
                    amfrVar2.bj = amunVar2;
                    amfrVar2.g |= 32;
                    maqVar.k(amfqVar, amrs.CONVERSATION_SCREEN_METRIC_EVENT);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }
}
