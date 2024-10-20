package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hux {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    so soVar = new so(context2, theme);
                    soVar.a(theme.getResources().getConfiguration());
                    context3 = soVar;
                } else {
                    context3 = context2;
                }
                return d.f(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return context2.getDrawable(i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        WeakHashMap weakHashMap = ean.a;
        return resources.getDrawable(i, theme);
    }
}
