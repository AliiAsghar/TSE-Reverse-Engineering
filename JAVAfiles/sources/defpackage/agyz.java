package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agyz extends ContentObserver {
    final /* synthetic */ agza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyz(agza agzaVar, Handler handler) {
        super(handler);
        this.a = agzaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        agza agzaVar = this.a;
        agzaVar.e = Boolean.valueOf(agza.b(agzaVar.c));
        ((alvg) ((alvg) agza.a.g()).h("com/google/android/libraries/inputmethod/keypresseffect/SystemHapticSettings$1", "onChange", 124, "SystemHapticSettings.java")).t("vibration enabled: %s", this.a.e);
    }
}
