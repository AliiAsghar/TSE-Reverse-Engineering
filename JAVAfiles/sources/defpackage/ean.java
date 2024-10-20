package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ean {
    private static final ThreadLocal c = new ThreadLocal();
    public static final WeakHashMap a = new WeakHashMap(0);
    public static final Object b = new Object();

    public static float a(Resources resources, int i) {
        float f;
        if (Build.VERSION.SDK_INT >= 29) {
            f = resources.getFloat(i);
            return f;
        }
        TypedValue c2 = c();
        resources.getValue(i, c2, true);
        if (c2.type == 4) {
            return c2.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(c2.type) + " is not valid");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i, new TypedValue(), 0, null, false, false);
    }

    public static TypedValue c() {
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static void d(Context context, int i, eal ealVar) {
        if (context.isRestricted()) {
            ealVar.c(-4);
        } else {
            e(context, i, new TypedValue(), 0, ealVar, false, false);
        }
    }

    public static Typeface e(Context context, int i, TypedValue typedValue, int i2, eal ealVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface f = f(context, resources, typedValue, i, i2, ealVar, z, z2);
        if (f == null && ealVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cf, code lost:
    
        if (r5.equals(r7) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        if (r34 == null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface f(android.content.Context r29, android.content.res.Resources r30, android.util.TypedValue r31, int r32, int r33, defpackage.eal r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ean.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, eal, boolean, boolean):android.graphics.Typeface");
    }
}
