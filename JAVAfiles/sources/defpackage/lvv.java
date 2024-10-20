package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvv extends arpw implements arqv {
    final /* synthetic */ lvx a;
    final /* synthetic */ amxr b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ lwz h;
    final /* synthetic */ amxp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvv(lvx lvxVar, amxr amxrVar, UUID uuid, Duration duration, int i, int i2, int i3, lwz lwzVar, amxp amxpVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = lvxVar;
        this.b = amxrVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = lwzVar;
        this.i = amxpVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lvv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        try {
            lve lveVar = (lve) this.a.b.b();
            amxr amxrVar = this.b;
            UUID uuid = this.c;
            Duration duration = this.d;
            int i = this.e;
            int i2 = this.f;
            int i3 = this.g;
            lwz lwzVar = this.h;
            qjh.l(lveVar.c, null, new lvc(lveVar, amxrVar, uuid, duration, i, i2, i3, this.i, lwzVar, null), 3);
        } catch (Exception e) {
            alvw i4 = lvx.a.i();
            i4.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i4).g(e).h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowStepsEventLoggers$logCompleteEvent$1", "invokeSuspend", 113, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log complete event for: %s", this.b);
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new lvv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, arpeVar);
    }
}
