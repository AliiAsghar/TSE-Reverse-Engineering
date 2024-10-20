package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhz implements aios {
    private final adhw a;

    public adhz(adhw adhwVar) {
        this.a = adhwVar;
    }

    @Override // defpackage.aios
    public final void a(String str, Throwable th) {
        Object[] objArr = {th.getMessage()};
        adhw adhwVar = this.a;
        advr.h(adhwVar.m, "Transport error while receiving a message: %s", objArr);
        Bundle bundle = new Bundle();
        bundle.putString("transport_id", str);
        bundle.putSerializable("transport_error_cause", th);
        adhwVar.s(5, bundle);
    }
}
