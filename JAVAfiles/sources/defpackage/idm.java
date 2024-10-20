package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idm extends arpw implements arqv {
    final /* synthetic */ ido a;
    final /* synthetic */ UUID b;
    final /* synthetic */ abnf c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idm(ido idoVar, int i, int i2, UUID uuid, abnf abnfVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = idoVar;
        this.d = i;
        this.e = i2;
        this.b = uuid;
        this.c = abnfVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        ((alvg) ido.a.g().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logFailureEvent$1", "invokeSuspend", 166, "D2DEventLogger.kt")).q("Logging D2D failure event to clearcut.");
        aozy createBuilder = amut.a.createBuilder();
        createBuilder.getClass();
        akec.T(this.d, createBuilder);
        akec.R(ido.a(0, 0, 0), createBuilder);
        aozy createBuilder2 = amuv.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        int i = this.e;
        amuv amuvVar = (amuv) createBuilder2.b;
        amuvVar.c = i - 1;
        amuvVar.b |= 1;
        apag s = createBuilder2.s();
        s.getClass();
        amuv amuvVar2 = (amuv) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amut amutVar = (amut) createBuilder.b;
        amutVar.d = amuvVar2;
        amutVar.c = 6;
        aozy builder = akec.Q(createBuilder).toBuilder();
        builder.getClass();
        UUID uuid = this.b;
        if (uuid != null) {
            aozb bX = yyb.bX(uuid);
            if (!builder.b.isMutable()) {
                builder.u();
            }
            amut amutVar2 = (amut) builder.b;
            amutVar2.b |= 2;
            amutVar2.f = bX;
        }
        abnf abnfVar = this.c;
        if (abnfVar != null) {
            if (!builder.b.isMutable()) {
                builder.u();
            }
            amut amutVar3 = (amut) builder.b;
            amutVar3.h = abnfVar.a();
            amutVar3.b |= 8;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.D2D_BACKUP_AND_RESTORE_EVENT, amfqVar);
        alzz.m((amut) builder.s(), amfqVar);
        aozy builder2 = alzz.h(amfqVar).toBuilder();
        builder2.getClass();
        mar a = ((mbb) this.a.b.b()).a();
        a.e(amrs.D2D_BACKUP_AND_RESTORE_EVENT);
        a.b((amfq) builder2, mbt.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new idm(this.a, this.d, this.e, this.b, this.c, arpeVar);
    }
}
