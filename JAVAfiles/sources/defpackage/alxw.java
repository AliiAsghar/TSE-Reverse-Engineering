package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alxw {
    public static final Set a;
    public static final alzz b;

    static {
        Set singleton = Collections.singleton(alvm.a);
        a = singleton;
        b = new alxv(singleton);
    }

    public static String a(alwv alwvVar) {
        return alwy.b(alwvVar.k());
    }

    public static boolean b(alwv alwvVar, alxr alxrVar, Set set) {
        if (alwvVar.j() == null && alxrVar.a() <= set.size() && set.containsAll(alxrVar.c())) {
            return false;
        }
        return true;
    }

    public static void c(alxr alxrVar, alxh alxhVar, StringBuilder sb) {
        alwu alwuVar = new alwu(sb);
        alxrVar.d(alxhVar, alwuVar);
        if (alwuVar.c) {
            alwuVar.b.append(alwuVar.a);
        }
    }
}
