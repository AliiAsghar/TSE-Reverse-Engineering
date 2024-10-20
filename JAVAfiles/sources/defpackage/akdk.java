package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akdk implements ancs {
    private final /* synthetic */ int a;

    public /* synthetic */ akdk(int i) {
        this.a = i;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return ((akph) obj).b();
                            }
                            return ((akph) obj).a();
                        }
                        ((alvg) ((alvg) ((alvg) aknh.a.h()).g((TimeoutException) obj)).h("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "maybeAddTimeout", 377, "IntentFilterAcledReceiver.java")).q("Receiver future timed out. Cancelling and returning due to HasReceiverTimeout.");
                        return albo.bG();
                    }
                    return ((akcs) obj).b();
                }
                return ((akcs) obj).c();
            }
            return albo.bI("");
        }
        return ((akcs) obj).a();
    }
}
