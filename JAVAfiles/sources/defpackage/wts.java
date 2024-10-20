package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wts implements akgr {
    final /* synthetic */ wtt a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public wts(wtt wttVar) {
        this.a = wttVar;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ akfd a() {
        return wtt.a;
    }

    @Override // defpackage.akgr
    public final ListenableFuture b() {
        if (!((Boolean) ((utz) wti.a.get()).e()).booleanValue()) {
            akul ag = aktp.ag(new wth(false));
            ag.getClass();
            return ag;
        }
        if (!this.b.getAndSet(true)) {
            wtt wttVar = this.a;
            akrh e = aktp.e("ScreenDetectionListener.loadData.initialRegistration");
            try {
                qjh.l(wttVar.e, null, new uxs(wttVar, (arpe) null, 10), 3);
                armd.i(e, null);
            } finally {
            }
        }
        akul ag2 = aktp.ag(this.a.f.get());
        ag2.getClass();
        return ag2;
    }
}
