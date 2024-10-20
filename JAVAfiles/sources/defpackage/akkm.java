package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkm implements aiex {
    private final Optional a;
    private final armf b;
    private final armf c;
    private final armf d;

    public akkm(Optional optional, armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.a = optional;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    @Override // defpackage.aiex
    public final void a() {
        this.a.isPresent();
        if (!aiep.b()) {
            return;
        }
        if (((Boolean) arsd.j((Optional) ((apxx) this.d).a, false)).booleanValue()) {
            akkp akkpVar = (akkp) this.c.b();
            if (aiep.a(akkpVar.a) == null) {
                ((alvg) akkpVar.f.i().h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 92, "StartupAfterPackageReplacedWithRetryRunner.kt")).q("Couldn't determine current process name. Skipping startup after package replaced listeners.");
                return;
            }
            if (!akkpVar.j.i()) {
                boolean z = akkpVar.g;
                return;
            }
            int i = akkpVar.d;
            ahmn a = akkpVar.a();
            agrk agrkVar = new agrk((short[]) null);
            agrkVar.x("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
            agrkVar.y(Long.valueOf(i));
            akat.c(aktp.Z(new akuk(a.E(agrkVar.J())).d(new lpx(afup.m, 15), akkpVar.b).f().e(Exception.class, new akez(new aggd(akkpVar, 14), 18), andi.a), new ajzp(new aggd(akkpVar, 16), 13), akkpVar.b), "StartupAfterPackageReplacedListenerImpl infrastructure failure.", new Object[0]);
            return;
        }
        akkl akklVar = (akkl) this.b.b();
        if (!akklVar.i.i()) {
            boolean z2 = akklVar.g;
        } else {
            akklVar.a(true);
        }
    }
}
