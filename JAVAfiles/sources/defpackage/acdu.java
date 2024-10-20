package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdu extends IStatusCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ acit b;

    public acdu(Object obj, acit acitVar) {
        this.a = obj;
        this.b = acitVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        abhb.d(status, this.a, this.b);
    }
}
