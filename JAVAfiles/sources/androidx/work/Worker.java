package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.gqj;
import defpackage.gqu;
import defpackage.gsx;
import defpackage.gvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends gsx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.gsx
    public final ListenableFuture a() {
        return gvf.aq(h(), new gqj(6));
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        return gvf.aq(h(), new gqu(this, 5));
    }

    public abstract gvf c();
}
