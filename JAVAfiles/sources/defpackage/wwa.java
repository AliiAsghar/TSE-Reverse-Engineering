package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwa {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl");
    public final armf a;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;

    public wwa(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        armfVar2.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        this.a = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar6;
        this.g = armfVar7;
        this.h = armfVar8;
        this.i = armfVar9;
        this.j = armfVar10;
    }

    public final void a() {
        alvg alvgVar = (alvg) b.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleUpdatePhoneSimsState", 44, "SimStateSchedulerImpl.kt");
        Object b2 = this.c.b();
        b2.getClass();
        alvgVar.s("Scheduling UPDATE_PHONE_SIMS_STATE. Delay Seconds: %s", ((Number) b2).longValue());
        armf armfVar = this.c;
        wwk wwkVar = wwk.WORK_TYPE_UPDATE_PHONE_SIMS_STATE;
        Object b3 = armfVar.b();
        b3.getClass();
        c(wwkVar, ((Number) b3).longValue());
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [armf, java.lang.Object] */
    public final void b(wwk wwkVar, long j) {
        wfh wfhVar = (wfh) this.f.b();
        aozy createBuilder = wwd.a.createBuilder();
        createBuilder.getClass();
        wwkVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wwd wwdVar = (wwd) createBuilder.b;
        wwdVar.c = wwkVar.a();
        wwdVar.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        ((uof) wfhVar.a.b()).a(upk.b("sim_state_update", (wwd) s, new uta(wwkVar.name(), "sim_state_update_deduplication_tag".concat(String.valueOf(wwkVar.name())), Duration.ofSeconds(j), null, null, null)));
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [armf, java.lang.Object] */
    public final void c(wwk wwkVar, long j) {
        ((alvg) b.g().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateSchedulerImpl", "scheduleWorkWithPwq", 64, "SimStateSchedulerImpl.kt")).C("Scheduling %s using PWQ. Delay Seconds: %s", wwkVar.name(), j);
        if (((pci) this.j.b()).a() && ((xnv) this.i.b()).a() < ((aozn) this.d.b()).b * 1000) {
            Object b2 = this.e.b();
            b2.getClass();
            qjh.l((arwe) b2, null, new wvz(this, wwkVar, j, (arpe) null, 0), 3);
        } else {
            b(wwkVar, j);
        }
        if (((okc) this.h.b()).a()) {
            wfh wfhVar = (wfh) this.g.b();
            wwkVar.getClass();
            ((mbl) wfhVar.a.b()).e("Bugle.Dsdr.SimStateScheduler", wwkVar.ordinal());
        }
    }
}
