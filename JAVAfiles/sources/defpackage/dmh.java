package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmh {
    public static final Typeface a(Typeface typeface, dlw dlwVar, Context context) {
        ThreadLocal threadLocal = dml.a;
        if (typeface == null) {
            return null;
        }
        if (!dlwVar.a.isEmpty()) {
            Paint paint = (Paint) dml.a.get();
            if (paint == null) {
                paint = new Paint();
                dml.a.set(paint);
            }
            paint.setTypeface(typeface);
            dqr.a(context);
            paint.setFontVariationSettings(dru.d(dlwVar.a, null, new dmk(), 31));
            return paint.getTypeface();
        }
        return typeface;
    }
}
