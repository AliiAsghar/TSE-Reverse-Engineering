package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gue extends gjk {
    private final Context c;

    public gue(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        if (this.b >= 10) {
            gkdVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
