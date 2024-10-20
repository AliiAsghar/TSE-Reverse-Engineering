package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahat implements AutoCloseable {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager");
    public final algw b;
    private final ahau e;
    public final AtomicReference d = new AtomicReference(null);
    private final int f = 3;
    public final boolean c = true;

    public ahat(algw algwVar, ahau ahauVar) {
        this.b = algwVar;
        this.e = ahauVar;
    }

    private static boolean b(String str) {
        if (str.length() != 1 || str.charAt(0) != '-') {
            return false;
        }
        return true;
    }

    private static boolean d(String str) {
        if (str.length() != 1 || str.charAt(0) != '*') {
            return false;
        }
        return true;
    }

    public abstract Object a(String str);

    public final void c(String str) {
        ahas ahasVar;
        alpr alprVar;
        List<String> c = this.e.b.c(str);
        if (c.isEmpty()) {
            ahasVar = ahas.b;
        } else {
            if (c.size() == 1) {
                String str2 = (String) alzz.aP(c);
                if (d(str2)) {
                    ahasVar = ahas.a;
                } else if (b(str2)) {
                    ahasVar = ahas.b;
                }
            }
            alpr alprVar2 = new alpr();
            alpr alprVar3 = new alpr();
            for (String str3 : c) {
                if (!d(str3) && !b(str3)) {
                    boolean z = false;
                    if (str3.charAt(0) == '-') {
                        str3 = str3.substring(1);
                    } else {
                        z = true;
                    }
                    if (true != z) {
                        alprVar = alprVar3;
                    } else {
                        alprVar = alprVar2;
                    }
                    try {
                        alprVar.c(a(str3));
                    } catch (Exception e) {
                        ((alvg) ((alvg) ((alvg) a.h()).g(e)).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 267, "FlagRestrictionManager.java")).t("failed to parse %s", str3);
                    }
                } else if (ahaw.a) {
                    ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 255, "FlagRestrictionManager.java")).D("Dropped invalid item '%s' from '%s'", str3, str);
                }
            }
            alpt g = alprVar2.g();
            alpt g2 = alprVar3.g();
            if (ahaw.a) {
                if (g.isEmpty() && g2.isEmpty()) {
                    ((alvg) ((alvg) a.h()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 274, "FlagRestrictionManager.java")).t("All items are invalid in '%s'", str);
                } else if (!g.isEmpty() && !g2.isEmpty()) {
                    ((alvg) ((alvg) a.f()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 276, "FlagRestrictionManager.java")).D("Allowlisted and blocklisted items can be reduced to only allowlisted: '%s' -> '%s'", str, algs.c(',').d(g));
                }
            }
            ahasVar = new ahas();
        }
        this.d.set(ahasVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
