package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llc {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher");
    private final sb b;

    public llc(cj cjVar) {
        cjVar.getClass();
        this.b = cjVar.g;
    }

    public final Object a(String str, se seVar, arpe arpeVar) {
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        arrx arrxVar = new arrx();
        arsb arsbVar = new arsb();
        arsbVar.a = this.b.a(str, seVar, new llb(arrxVar, arvpVar, arsbVar, 0));
        if (arrxVar.a) {
            ((alvg) a.d().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "retrievePendingResult", 93, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration, unregistering launcher.");
            ((rw) arsbVar.a).a();
        }
        Object l = arvpVar.l();
        if (l == arpl.a) {
            arpeVar.getClass();
        }
        return l;
    }

    public final Object c(String str, se seVar, Object obj, efu efuVar, arpe arpeVar) {
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        arrx arrxVar = new arrx();
        arsb arsbVar = new arsb();
        arsbVar.a = this.b.a(str, seVar, new llb(arrxVar, arvpVar, arsbVar, 1));
        if (arrxVar.a) {
            ((rw) arsbVar.a).a();
            ((alvg) a.i().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 53, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration.");
        } else {
            try {
                ((alvg) a.d().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 56, "ActivityResultLauncher.kt")).t("Launching activity for result. key = %s", str);
                ((rw) arsbVar.a).b(obj, efuVar);
            } catch (Exception e) {
                ((alvg) a.i().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 63, "ActivityResultLauncher.kt")).q("Launching activity threw exception, clearing registration and completing continuation with failure.");
                arrxVar.a = true;
                arvpVar.w(aqil.O(e));
                ((rw) arsbVar.a).a();
            }
        }
        Object l = arvpVar.l();
        if (l == arpl.a) {
            arpeVar.getClass();
        }
        return l;
    }
}
