package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyj extends alxy {
    public static final Set a;
    public static final alxh b;
    public static final alyh c;
    private final String d;
    private final Level e;
    private final Set f;
    private final alxh g;
    private final int h;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(alvm.a, alwp.a, alwq.a)));
        a = unmodifiableSet;
        alxh a2 = alxk.a(unmodifiableSet);
        b = a2;
        c = new alyh(2, Level.ALL, false, unmodifiableSet, a2);
    }

    public alyj(String str, int i, Level level, Set set, alxh alxhVar) {
        super(str);
        this.d = alzz.x(str);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = alxhVar;
    }

    public static void e(alwv alwvVar, String str, int i, Level level, Set set, alxh alxhVar) {
        boolean z;
        String sb;
        Boolean bool = (Boolean) alwvVar.i().d(alwq.a);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        alxr g = alxr.g(alxu.f(), alwvVar.i());
        if (alwvVar.m().intValue() < level.intValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !alxw.b(alwvVar, g, set)) {
            sb = alxw.a(alwvVar);
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (alzz.y(2, alwvVar.e(), sb2)) {
                sb2.append(" ");
            }
            if (z && alwvVar.j() != null) {
                sb2.append("(REDACTED) ");
                sb2.append(alwvVar.j().b);
            } else {
                alzr.e(alwvVar, sb2);
                alxw.c(g, alxhVar, sb2);
            }
            sb = sb2.toString();
        }
        Throwable th = (Throwable) alwvVar.i().d(alvm.a);
        int w = alzz.w(alwvVar.m());
        if (w != 2) {
            if (w != 3) {
                if (w != 4) {
                    if (w != 5) {
                        Log.e(str, sb, th);
                        return;
                    } else {
                        Log.w(str, sb, th);
                        return;
                    }
                }
                Log.i(str, sb, th);
                return;
            }
            Log.d(str, sb, th);
            return;
        }
        Log.v(str, sb, th);
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        e(alwvVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        String str = this.d;
        int w = alzz.w(level);
        if (!Log.isLoggable(str, w) && !Log.isLoggable("all", w)) {
            return false;
        }
        return true;
    }
}
