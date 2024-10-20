package defpackage;

import android.app.job.JobParameters;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rhz implements rhn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rhz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.rhn
    public final void a() {
        if (this.c != 0) {
            ((ActionJobService) this.a).jobFinished((JobParameters) this.b, false);
            return;
        }
        utz utzVar = ria.b;
        Object obj = this.a;
        boolean isCancelled = ((ListenableFuture) ((AtomicReference) obj).get()).isCancelled();
        Object obj2 = this.b;
        if (isCancelled) {
            ((dtq) obj2).c();
        }
        try {
            ((dtq) obj2).b(albo.bQ((Future) ((AtomicReference) obj).get()));
        } catch (Throwable th) {
            ((dtq) obj2).d(th);
        }
    }
}
