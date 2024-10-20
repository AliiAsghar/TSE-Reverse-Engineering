package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmb {
    public final dme a;

    public dmb() {
        dme dmgVar;
        if (Build.VERSION.SDK_INT >= 28) {
            dmgVar = new dmf();
        } else {
            dmgVar = new dmg();
        }
        this.a = dmgVar;
    }
}
