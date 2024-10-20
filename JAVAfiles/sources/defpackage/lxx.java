package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxx implements lxw {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl");
    public static final Optional b = Optional.empty();
    public final Context c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public boolean h;
    private final arwe i;
    private final alhr j;

    public lxx(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.c = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.i = arweVar;
        this.j = albo.D(new ezp(this, 19));
    }

    @Override // defpackage.lxw
    public final void a() {
        qjh.l(this.i, null, new leb(this, (arpe) null, 13), 3);
    }

    @Override // defpackage.lxw
    public final boolean b() {
        return d();
    }

    @Override // defpackage.lxw
    public final boolean c() {
        if (this.h && d()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        try {
            return ((Boolean) this.j.get()).booleanValue();
        } catch (Exception e) {
            ((alvg) ((alvg) a.i()).g(e).h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl", "isDemoUser", 109, "RetailModeEntryPointImpl.kt")).q("Failed to check if device is running in Retail Demo mode");
            return false;
        }
    }
}
