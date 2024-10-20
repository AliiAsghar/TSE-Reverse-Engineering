package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hah implements Executor {
    final /* synthetic */ gpx a;

    public hah(gpx gpxVar) {
        this.a = gpxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) this.a.a).post(runnable);
    }
}
