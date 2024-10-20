package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tin extends agps {
    public tin() {
        super("restore_workflow_executions");
    }

    @Override // defpackage.agps
    public final /* synthetic */ agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void b(Optional optional) {
        tio tioVar = new tio();
        tioVar.b(optional);
        ae(new agpw(tioVar), "restore_workflow_executions-buildAndUpdateForSessionId");
    }

    public final void c(lwr lwrVar) {
        if (lwrVar == null) {
            this.a.putNull("status");
        } else {
            this.a.put("status", Integer.valueOf(lwrVar.p));
        }
    }

    public final void d(Instant instant) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60220) {
            agnc.t("status_timestamp", intValue2);
        }
        if (intValue >= 60220) {
            if (instant == null) {
                this.a.putNull("status_timestamp");
            } else {
                this.a.put("status_timestamp", Long.valueOf(uzz.k(instant)));
            }
        }
    }
}
