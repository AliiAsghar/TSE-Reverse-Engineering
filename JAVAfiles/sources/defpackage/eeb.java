package defpackage;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeb {
    public static Boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(a.bV(i, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
