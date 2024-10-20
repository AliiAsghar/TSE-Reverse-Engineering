package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vev {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger");
    private final armf b;
    private final armf c;
    private final armf d;

    public vev(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    private static final void b(String str) {
        alvw i = a.i();
        i.X(alwp.a, "BugleRcs");
        ((alvg) ((alvg) i).g(new veu()).h("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger", "logPrimesWarningWithStackTrace", 57, "NormalizedPhoneNumberDiscrepancyLogger.kt")).q(str);
    }

    public final void a(String str, int i) {
        str.getClass();
        if (((olp) this.b.b()).a()) {
            if (!arsd.M(str)) {
                if (!((yjr) this.c.b()).A(str)) {
                    b("Unexpected empty phone number instead of E164");
                    ((mbl) this.d.b()).e("Bugle.Dsdr.NonE164PhoneNumber.Count", i);
                    return;
                }
                return;
            }
            b("Non E164 phone number");
            ((mbl) this.d.b()).e("Bugle.Dsdr.EmptyPhoneNumber.Count", i);
        }
    }
}
