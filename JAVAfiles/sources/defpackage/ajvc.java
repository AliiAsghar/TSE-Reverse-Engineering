package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.Button;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvc {
    public static final HashMap a = new HashMap();

    public static int a(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, Button button, ajus ajusVar) {
        if (ajuu.h(context).r(ajusVar)) {
            int c = ajuu.h(context).c(context, ajusVar);
            if (c != 0) {
                button.setTextColor(ColorStateList.valueOf(c));
                return;
            }
            return;
        }
        HashMap hashMap = a;
        if (hashMap.containsKey(Integer.valueOf(button.getId()))) {
            button.setTextColor((ColorStateList) hashMap.get(Integer.valueOf(button.getId())));
            return;
        }
        throw new IllegalStateException("There is no saved default color for button");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Button button, int i) {
        if (i != 0) {
            button.setTextColor(ColorStateList.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Context context, Button button, ajus ajusVar) {
        c(button, ajuu.h(context).c(context, ajusVar));
    }
}
