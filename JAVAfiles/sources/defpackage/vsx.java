package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vsx implements vsy {
    public final /* synthetic */ apag a;
    private final /* synthetic */ int b;

    public /* synthetic */ vsx(apag apagVar, int i) {
        this.b = i;
        this.a = apagVar;
    }

    @Override // defpackage.vsy
    public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
        if (this.b != 0) {
            return rcsEngineLifecycleServiceV2.initializeAndStartRcsTransport(new adsx((aplh) this.a));
        }
        return rcsEngineLifecycleServiceV2.stopAllRcsTransportsExcept(new adsy((aplj) this.a));
    }
}
