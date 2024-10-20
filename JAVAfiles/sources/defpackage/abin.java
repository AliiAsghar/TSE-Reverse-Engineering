package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abin implements abil {
    private final Context a;

    public abin(Context context) {
        this.a = context;
    }

    @Override // defpackage.abil
    public final znp a(String str, abik abikVar) {
        return new znp(this.a, str, abikVar);
    }

    @Override // defpackage.abil
    public final znp b(abih abihVar, abik abikVar) {
        if (new abih().equals(abihVar)) {
            return a("FCM_CLIENT_EVENT_LOGGING", abikVar);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(abihVar.toString()));
    }
}
