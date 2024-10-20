package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xvw {
    private static Typeface a;
    private static Typeface b;
    private static Typeface c;
    private static Typeface d;
    private static Typeface e;
    private static final alwo f = alwo.o("Bugle");

    @Deprecated
    public static synchronized Typeface a(Context context) {
        synchronized (xvw.class) {
            if (((Boolean) utw.af.e()).booleanValue()) {
                return Typeface.create("sans-serif", 0);
            }
            try {
                if (c == null) {
                    c = ean.b(context, R.font.google_sans);
                }
                return c;
            } catch (Exception unused) {
                return c();
            }
        }
    }

    @Deprecated
    public static synchronized Typeface b() {
        Typeface typeface;
        synchronized (xvw.class) {
            if (a == null) {
                a = Typeface.create(Typeface.SANS_SERIF, 1);
            }
            typeface = a;
        }
        return typeface;
    }

    @Deprecated
    public static synchronized Typeface c() {
        Typeface typeface;
        synchronized (xvw.class) {
            if (b == null) {
                b = Typeface.create(Typeface.SANS_SERIF, 0);
            }
            typeface = b;
        }
        return typeface;
    }

    public static synchronized Typeface d(Context context) {
        Typeface typeface;
        synchronized (xvw.class) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
            try {
                if (d == null) {
                    d = Typeface.create(ean.b(context, typedValue.resourceId), 1);
                }
                typeface = d;
            } catch (Exception unused) {
                alwl alwlVar = (alwl) f.i();
                alwlVar.W();
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentBold", 111, "Typefaces.java")).q("ThemeFontContentBold could not be created. Fallback to Roboto bold.");
                return b();
            }
        }
        return typeface;
    }

    public static synchronized Typeface e(Context context) {
        Typeface typeface;
        synchronized (xvw.class) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
            try {
                if (e == null) {
                    e = Typeface.create(ean.b(context, typedValue.resourceId), 0);
                }
                typeface = e;
            } catch (Exception unused) {
                alwl alwlVar = (alwl) f.i();
                alwlVar.W();
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentNormal", 129, "Typefaces.java")).q("ThemeFontContentNormal could not be created. Fallback to Roboto normal.");
                return c();
            }
        }
        return typeface;
    }
}
