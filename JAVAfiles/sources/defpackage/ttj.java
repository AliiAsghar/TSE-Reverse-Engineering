package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttj implements vgw {
    public static final xze a = xze.g("BugleEtouffee", "EtouffeeStateMachine");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/E2eeStateMachine");
    public final armf c;
    public final armf d;
    public final mbl e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final anen l;
    public final anen m;
    public final apwt n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    private final armf s;
    private final Object u = new Object();
    private final Map t = alzz.aj(2);

    public ttj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, mbl mblVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, anen anenVar, anen anenVar2, apwt apwtVar) {
        this.s = armfVar;
        this.q = armfVar3;
        this.c = armfVar2;
        this.d = armfVar4;
        this.e = mblVar;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
        this.p = armfVar9;
        this.r = armfVar10;
        this.j = armfVar11;
        this.k = armfVar12;
        this.l = anenVar;
        this.m = anenVar2;
        this.n = apwtVar;
        this.o = armfVar13;
    }

    public static amkj d(typ typVar) {
        int ordinal = typVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return amkj.UNKNOWN_PROVISIONING_STATE;
                }
                return amkj.NOT_PROVISIONED_BUT_INITIALIZED;
            }
            return amkj.NOT_PROVISIONED;
        }
        return amkj.PROVISIONED;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    public final tyt a(String str) {
        tyt tytVar;
        synchronized (this.u) {
            tytVar = (tyt) this.t.get(str);
            if (tytVar == null) {
                znj znjVar = (znj) ((izc) this.s.b()).a.b();
                znjVar.getClass();
                str.getClass();
                tyt tytVar2 = new tyt(znjVar, str);
                this.t.put(str, tytVar2);
                tytVar = tytVar2;
            }
        }
        return tytVar;
    }

    public final akul b(String str) {
        if (!TextUtils.isEmpty(str) && ttd.a()) {
            return a(str).a().h(new rgh(16), andi.a);
        }
        return aktp.ag(false);
    }

    public final akul c(String str) {
        return ((ttb) this.d.b()).c(str);
    }

    public final akul e(String str, ved vedVar, ved vedVar2, int i) {
        String str2;
        typ typVar;
        xyo c = a.c();
        c.H("onRegistrationUpdate from Tachyon");
        c.z("previousState", vedVar.name());
        c.z("newState", vedVar2.name());
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str2 = "STARTUP_ENSURE_CONSISTENCY";
                        } else {
                            str2 = "TACHYON_UPDATE_DEBUG";
                        }
                    } else {
                        str2 = "TACHYON_UPDATE_REFRESH";
                    }
                } else {
                    str2 = "TACHYON_UPDATE_REGISTER_VERIFY";
                }
            } else {
                str2 = "TACHYON_UPDATE_REGISTER";
            }
        } else {
            str2 = "TACHYON_UPDATE_RESET";
        }
        c.z("reason", str2);
        c.q();
        if (vedVar2 == ved.REGISTERED_WITH_PREKEYS) {
            if (ttd.a()) {
                typVar = typ.PROVISIONED;
            } else {
                typVar = typ.NOT_PROVISIONED_BUT_INITIALIZED;
            }
        } else {
            typVar = typ.NOT_PROVISIONED;
        }
        return a(str).a().i(new rga(this, typVar, vedVar, vedVar2, i, str, 2), andi.a).i(new qbt(this, str, typVar, 14), this.l);
    }

    @Override // defpackage.vgw
    public final akul f(String str, ved vedVar, ved vedVar2, int i) {
        int i2 = i - 1;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 4;
                if (i2 != 3) {
                    if (i2 != 4) {
                        i3 = 6;
                    } else {
                        i3 = 5;
                    }
                }
            } else {
                i3 = 3;
            }
        }
        return e(str, vedVar2, vedVar, i3);
    }
}
