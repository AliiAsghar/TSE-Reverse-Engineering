package defpackage;

import android.app.job.JobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class rii extends JobService implements apxr {
    private volatile apxl a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxl aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new apxl(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ActionJobService actionJobService = (ActionJobService) this;
            kqo kqoVar = (kqo) aS();
            actionJobService.a = (rib) kqoVar.b.jG.b();
            actionJobService.b = (aksr) kqoVar.b.at.b();
            actionJobService.c = kqoVar.b.jI;
        }
        super.onCreate();
    }
}
