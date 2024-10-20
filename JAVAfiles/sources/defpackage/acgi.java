package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgi extends IGetStorageInfoCallbacks.Stub {
    final /* synthetic */ acit a;

    public acgi(acit acitVar) {
        this.a = acitVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks
    public final void onResult(Status status, byte[] bArr) {
        if (status.c()) {
            try {
                abhb.d(status, (ahum) apag.parseFrom(ahum.a, bArr, aozs.a()), this.a);
                return;
            } catch (apba e) {
                this.a.a(e);
                return;
            }
        }
        abhb.d(status, null, this.a);
    }
}
