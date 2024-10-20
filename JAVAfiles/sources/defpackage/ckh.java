package defpackage;

import android.graphics.Path;
import defpackage.clr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckh {
    public static final Path.Direction a(clr.a aVar) {
        clr.a aVar2 = clr.a.a;
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Path.Direction.CW;
            }
            throw new armm();
        }
        return Path.Direction.CCW;
    }

    public static final void b(String str) {
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
