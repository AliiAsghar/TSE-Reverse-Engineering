package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxb {
    private static final uuf f = uuh.n(uuh.b, "simulate_manufacturer_with_watch_texting", false);
    public final Context a;
    public final armf b;
    public final arml c;
    public final arml d;
    public final arml e;
    private final armf g;
    private final arml h;

    public yxb(Context context, armf armfVar, armf armfVar2) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = context;
        this.g = armfVar;
        this.b = armfVar2;
        this.h = armd.a(new vnq(this, 19));
        this.c = armd.a(new vnq(this, 16));
        this.d = armd.a(new vnq(this, 15));
        armd.a(new vnq(this, 18));
        armd.a(new vnq(this, 14));
        this.e = armd.a(new vnq(this, 17));
    }

    public final boolean a() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final boolean b() {
        if (!((Boolean) f.e()).booleanValue()) {
            return false;
        }
        return true;
    }
}
