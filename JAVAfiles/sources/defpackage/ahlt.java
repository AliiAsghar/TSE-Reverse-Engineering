package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlt {
    public Handler e;
    public ahka h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new agqd(this, 16);

    public ahlt(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new ahlr(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (ahli ahliVar : this.g) {
            }
            this.d = true;
        }
    }
}
