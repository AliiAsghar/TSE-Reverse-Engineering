package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alwo extends alwm {
    public alwo(alww alwwVar) {
        super(alwwVar);
    }

    public static alwo o(String str) {
        return new alwo(alxu.d(str));
    }

    public static alwo p() {
        return new alwo(alxu.d(alxu.g().b(alwo.class)));
    }

    @Override // defpackage.aluw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final alwl a(Level level) {
        boolean l = l(level);
        alxu.n(j(), level, l);
        if (!l) {
            return c;
        }
        return new alwn(this, level, 0);
    }
}
