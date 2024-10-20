package defpackage;

import android.content.Context;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhv {
    public final Context a;
    public final afhq b;
    public final afhw c;
    public final aday e;
    public aeke f;
    private final arml g = armd.a(new afhj(this, 5));
    private final arml h = armd.a(new afhj(this, 4));
    public final arml d = armd.a(new afhj(this, 6));

    public afhv(Context context, aday adayVar, afhq afhqVar, afhw afhwVar) {
        this.a = context;
        this.e = adayVar;
        this.b = afhqVar;
        this.c = afhwVar;
    }

    public final Size a(int i) {
        afhr b = b();
        if (true != b.b()) {
            b = null;
        }
        if (b == null) {
            return null;
        }
        return b.a(i);
    }

    public final afhr b() {
        return (afhr) this.g.a();
    }

    public final agfy c() {
        return (agfy) this.h.a();
    }
}
