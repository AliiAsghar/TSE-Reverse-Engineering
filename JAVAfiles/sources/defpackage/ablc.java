package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablc extends IStatusCallback.Stub {
    final /* synthetic */ acit a;

    public ablc(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        abld.a(status, null, this.a);
    }
}
