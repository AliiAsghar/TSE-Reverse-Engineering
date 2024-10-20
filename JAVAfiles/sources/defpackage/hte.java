package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hte implements hnn {
    @Override // defpackage.hnn
    public final hpt b(Context context, hpt hptVar, int i, int i2) {
        if (hyv.n(i, i2)) {
            hqa hqaVar = hkz.b(context).a;
            Bitmap bitmap = (Bitmap) hptVar.c();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(hqaVar, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return hptVar;
            }
            return huh.g(c, hqaVar);
        }
        throw new IllegalArgumentException(a.cl(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    protected abstract Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2);
}
