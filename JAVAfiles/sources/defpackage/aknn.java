package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknn extends aqvh {
    private final SettableFuture a;

    public aknn(apsd apsdVar, SettableFuture settableFuture) {
        super(apsdVar);
        this.a = settableFuture;
    }

    @Override // defpackage.aqvh, defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        try {
            super.a(status, aqutVar);
        } finally {
            this.a.set(null);
        }
    }
}
