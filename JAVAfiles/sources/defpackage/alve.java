package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alve extends aluw {
    static final alvv a = new alvv();

    public alve(alww alwwVar) {
        super(alwwVar);
    }

    public static alve m() {
        return new alve(alxu.d(alxu.g().b(alve.class)));
    }

    @Override // defpackage.aluw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final alvc a(Level level) {
        boolean l = l(level);
        alxu.n(j(), level, l);
        if (!l) {
            return a;
        }
        return new alvd(this, level);
    }
}
