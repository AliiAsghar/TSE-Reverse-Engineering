package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glx {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            b(viewGroup, z);
        } else {
            viewGroup.suppressLayout(z);
        }
    }

    private static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
