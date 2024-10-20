package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abow extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ abox a;

    public abow(abox aboxVar) {
        this.a = aboxVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogEvent(Status status) {
        this.a.j(status);
    }
}
