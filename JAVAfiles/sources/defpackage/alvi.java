package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alvi extends aluw {
    private static final alvv a = new alvv();

    public alvi(alww alwwVar) {
        super(alwwVar);
    }

    @Deprecated
    public static alvi m(String str) {
        alzz.c(!str.isEmpty(), "injected class name is empty");
        return new alvi(alxu.d(str.replace('/', '.')));
    }

    @Override // defpackage.aluw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final alvg a(Level level) {
        boolean l = l(level);
        alxu.n(j(), level, l);
        if (!l) {
            return a;
        }
        return new alvh(this, level);
    }
}
