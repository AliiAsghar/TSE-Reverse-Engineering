package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abve extends alwm {
    public static final alvz a = abvf.a;
    private int d;

    public abve(alww alwwVar) {
        super(alwwVar);
        this.d = -1;
    }

    @Override // defpackage.aluw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final alwl a(Level level) {
        int i;
        if (l(level)) {
            if (this.d != -1) {
                i = 0;
            } else {
                i = 386;
            }
            this.d = -1;
            alwn alwnVar = new alwn(this, level, 1);
            alwnVar.X(a, i);
            return alwnVar;
        }
        return c;
    }
}
