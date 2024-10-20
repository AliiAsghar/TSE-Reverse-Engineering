package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfw {
    public static final alwo a = alwo.o("BugleTachygram");
    public final anen b;
    public final vcj c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final wyp g;
    private final Optional h;
    private final xym i;

    public xfw(wyp wypVar, anen anenVar, vcj vcjVar, Optional optional, xym xymVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = anenVar;
        this.g = wypVar;
        this.c = vcjVar;
        this.h = optional;
        this.i = xymVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
    }

    public static boolean a(vee veeVar) {
        aqfk aqfkVar = veeVar.m;
        if (aqfkVar == null) {
            aqfkVar = aqfk.b;
        }
        return new apaq(aqfkVar.c, aqfk.a).contains(askr.TACHYGRAM);
    }

    public final akul b(String str) {
        String str2;
        akul b;
        if (this.h.isEmpty()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 223, "TachygramLifecycleManager.java")).q("Tachygram is active but no tachyon receiver manager provided");
            return aktp.ag(null);
        }
        boolean z = this.i.a;
        alwl alwlVar = (alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 228, "TachygramLifecycleManager.java");
        if (true != z) {
            str2 = "pull";
        } else {
            str2 = "bind";
        }
        alwlVar.t("Tachygram is newly active. Starting %s", str2);
        if (z) {
            b = ((vhi) this.h.get()).e(str);
        } else {
            vhi vhiVar = (vhi) this.h.get();
            aozy createBuilder = aqfn.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((aqfn) apagVar).d = "RCS";
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aqfn) createBuilder.b).c = str;
            b = vhiVar.b((aqfn) createBuilder.s());
        }
        return b.e(aqwb.class, new xdh(19), this.b);
    }
}
