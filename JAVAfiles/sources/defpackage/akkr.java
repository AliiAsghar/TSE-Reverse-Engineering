package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akkr {
    private static final algy a = new evp(15);
    private static final algy b = new evp(16);

    /* JADX WARN: Multi-variable type inference failed */
    public static akkq a(cg cgVar) {
        return c(((akkf) cgVar).aU(), b);
    }

    public static akkq b(aklj akljVar) {
        return c(akljVar.a, a);
    }

    private static akkq c(Context context, algy algyVar) {
        for (Context context2 = context; !algyVar.a(context2); context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (!(context2 instanceof ContextWrapper)) {
                throw new IllegalStateException("Cannot use base context of type " + String.valueOf(context.getClass()) + " for ViewContext.");
            }
        }
        return new akkq(context);
    }
}
