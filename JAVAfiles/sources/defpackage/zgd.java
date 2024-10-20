package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/toast/ToastsControllerImpl");
    public final Context b;
    public final enh c;
    public final zge d;
    private final arwe e;
    private boolean f;

    public zgd(Context context, arwe arweVar, enh enhVar, zge zgeVar) {
        arweVar.getClass();
        enhVar.getClass();
        zgeVar.getClass();
        this.b = context;
        this.e = arweVar;
        this.c = enhVar;
        this.d = zgeVar;
    }

    public final void a() {
        ((alvg) a.d().h("com/google/android/apps/messaging/toast/ToastsControllerImpl", "initialize", 32, "ToastsControllerImpl.kt")).q("Initializing toast controller.");
        if (this.f) {
            return;
        }
        qjh.l(this.e, null, new lfn(this, (arpe) null, 14), 3);
        this.f = true;
    }
}
