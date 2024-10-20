package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyk {
    public final Bundle a;
    public final dzw[] b;
    public final boolean c;
    public boolean d;
    public final int e;
    public final boolean f;

    @Deprecated
    public int g;
    public final CharSequence h;
    public final PendingIntent i;
    public final boolean j;
    private IconCompat k;

    public dyk(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, dzw[] dzwVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.d = true;
        this.k = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.g = iconCompat.a();
        }
        this.h = dyu.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.b = dzwVarArr;
        this.c = z;
        this.e = i;
        this.d = z2;
        this.f = z3;
        this.j = z4;
    }

    public final IconCompat a() {
        int i;
        if (this.k == null && (i = this.g) != 0) {
            this.k = IconCompat.h(null, "", i);
        }
        return this.k;
    }
}
