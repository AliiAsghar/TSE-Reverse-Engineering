package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acar extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ acas a;

    public acar(acas acasVar) {
        this.a = acasVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsbdSaved() {
        this.a.j(Status.a);
    }
}
