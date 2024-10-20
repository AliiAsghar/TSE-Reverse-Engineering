package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuw {
    static final utz a = uuh.i(uuh.b, "enable_walkman_code", false);

    public static void a(Menu menu) {
        if (((Boolean) a.e()).booleanValue()) {
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.getItem(i);
                dyf.d(item, item.getTitle());
            }
        }
    }
}
