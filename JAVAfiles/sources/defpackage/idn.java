package defpackage;

import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idn extends arpw implements arqv {
    final /* synthetic */ ido a;
    final /* synthetic */ Duration b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ UUID f;
    final /* synthetic */ abnf g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idn(ido idoVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, abnf abnfVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = idoVar;
        this.h = i;
        this.b = duration;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = uuid;
        this.g = abnfVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aozb w;
        aqil.P(obj);
        ((alvg) ido.a.g().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logSuccessEvent$1", "invokeSuspend", 98, "D2DEventLogger.kt")).q("Logging D2D success event to clearcut.");
        aozn j = aoue.j(this.b);
        aozy createBuilder = amut.a.createBuilder();
        createBuilder.getClass();
        akec.T(this.h, createBuilder);
        w = aozb.w(ByteBuffer.allocate(16).putLong(r1.getMostSignificantBits()).putLong(this.f.getLeastSignificantBits()).array());
        akec.S(w, createBuilder);
        akec.R(ido.a(this.c, this.d, this.e), createBuilder);
        aozy createBuilder2 = amuu.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amuu amuuVar = (amuu) createBuilder2.b;
        amuuVar.c = j;
        amuuVar.b |= 1;
        apag s = createBuilder2.s();
        s.getClass();
        amuu amuuVar2 = (amuu) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amut amutVar = (amut) createBuilder.b;
        amutVar.d = amuuVar2;
        amutVar.c = 5;
        aozy builder = akec.Q(createBuilder).toBuilder();
        builder.getClass();
        abnf abnfVar = this.g;
        if (abnfVar != null) {
            if (!builder.b.isMutable()) {
                builder.u();
            }
            amut amutVar2 = (amut) builder.b;
            amutVar2.h = abnfVar.a();
            amutVar2.b |= 8;
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
        return new idn(this.a, this.h, this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
