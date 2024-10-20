package defpackage;

import android.graphics.Outline;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddl {
    public static final ddl a = new ddl();

    private ddl() {
    }

    public final void a(Outline outline, clr clrVar) {
        if (!(clrVar instanceof cke)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((cke) clrVar).a);
    }
}
