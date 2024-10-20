package defpackage;

import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvc extends arpw implements arqv {
    final /* synthetic */ lve a;
    final /* synthetic */ amxr b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ amxp h;
    final /* synthetic */ lwz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvc(lve lveVar, amxr amxrVar, UUID uuid, Duration duration, int i, int i2, int i3, amxp amxpVar, lwz lwzVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = lveVar;
        this.b = amxrVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = amxpVar;
        this.i = lwzVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lvc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        amxq aR;
        aqil.P(obj);
        alvw g = lve.a.g();
        g.X(alwp.a, "BugleBackup");
        alvg alvgVar = (alvg) g;
        alvgVar.V(10, TimeUnit.SECONDS);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 118, "RestoreEventLogger.kt")).q("Logging restore complete event to clearcut");
        aozy createBuilder = amxs.a.createBuilder();
        createBuilder.getClass();
        aktp.aO(this.b, createBuilder);
        aktp.aQ(yyb.bX(this.c), createBuilder);
        aozy createBuilder2 = amxt.a.createBuilder();
        createBuilder2.getClass();
        aozn j = aoue.j(this.d);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxt amxtVar = (amxt) createBuilder2.b;
        amxtVar.c = j;
        amxtVar.b |= 1;
        apag s = createBuilder2.s();
        s.getClass();
        amxt amxtVar2 = (amxt) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxs amxsVar = (amxs) createBuilder.b;
        amxsVar.d = amxtVar2;
        amxsVar.c = 5;
        aozy builder = aktp.aN(createBuilder).toBuilder();
        builder.getClass();
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        Duration duration = this.d;
        amxp amxpVar = this.h;
        if (duration.toMillis() == 0) {
            aozy createBuilder3 = amxq.a.createBuilder();
            createBuilder3.getClass();
            aktp.aT(yyb.cG(i3), createBuilder3);
            if (amxpVar != null) {
                aktp.aS(amxpVar, createBuilder3);
            }
            aR = aktp.aR(createBuilder3);
        } else {
            aozy createBuilder4 = amxq.a.createBuilder();
            createBuilder4.getClass();
            int a = lve.a(i, duration);
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amxq amxqVar = (amxq) createBuilder4.b;
            amxqVar.b |= 1;
            amxqVar.c = a;
            int a2 = lve.a(i2, duration);
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amxq amxqVar2 = (amxq) createBuilder4.b;
            amxqVar2.b |= 2;
            amxqVar2.d = a2;
            aktp.aT(yyb.cG(i3), createBuilder4);
            if (amxpVar != null) {
                aktp.aS(amxpVar, createBuilder4);
            }
            aR = aktp.aR(createBuilder4);
        }
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        amxs amxsVar2 = (amxs) apagVar;
        amxsVar2.g = aR;
        amxsVar2.b |= 4;
        lwz lwzVar = this.i;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        amxs amxsVar3 = (amxs) builder.b;
        amxsVar3.h = lwzVar.d;
        amxsVar3.b |= 8;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.RESTORE_WORKFLOW_EVENT, amfqVar);
        alzz.p((amxs) builder.s(), amfqVar);
        aozy builder2 = alzz.h(amfqVar).toBuilder();
        builder2.getClass();
        mar a3 = ((mbb) this.a.b.b()).a();
        a3.e(amrs.RESTORE_WORKFLOW_EVENT);
        a3.b((amfq) builder2, mbt.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        alvw g2 = lve.a.g();
        g2.X(alwp.a, "BugleBackup");
        alvg alvgVar2 = (alvg) g2;
        alvgVar2.V(10, TimeUnit.SECONDS);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logCompleteEvent$1", "invokeSuspend", 141, "RestoreEventLogger.kt")).q("Logged restore complete event to clearcut");
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new lvc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, arpeVar);
    }
}
