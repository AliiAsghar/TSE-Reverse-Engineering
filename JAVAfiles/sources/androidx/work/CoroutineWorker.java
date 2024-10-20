package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.arpe;
import defpackage.arpi;
import defpackage.arwb;
import defpackage.arxo;
import defpackage.d;
import defpackage.eie;
import defpackage.gsg;
import defpackage.gsx;
import defpackage.gvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends gsx {
    private final WorkerParameters e;
    private final arwb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = gsg.a;
    }

    @Override // defpackage.gsx
    public final ListenableFuture a() {
        return gvf.au(this.f.plus(new arxo(null)), new eie(this, (arpe) null, 12));
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        arpi arpiVar;
        if (!d.F(this.f, gsg.a)) {
            arpiVar = this.f;
        } else {
            arpiVar = this.e.f;
        }
        arpiVar.getClass();
        return gvf.au(arpiVar.plus(new arxo(null)), new eie(this, (arpe) null, 13, (byte[]) null));
    }

    public abstract Object c(arpe arpeVar);

    @Override // defpackage.gsx
    public final void d() {
    }
}
