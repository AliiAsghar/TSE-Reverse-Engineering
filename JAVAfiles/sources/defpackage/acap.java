package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acap extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ acaq a;

    public acap(acaq acaqVar) {
        this.a = acaqVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsdSaved() {
        this.a.j(Status.a);
    }
}
