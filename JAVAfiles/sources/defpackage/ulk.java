package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulk extends aker {
    final /* synthetic */ uie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulk(uie uieVar, aksr aksrVar) {
        super(aksrVar, "ContentChangeObserver.Observer#onChange", andi.a);
        this.a = uieVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        ahjj ahjjVar = (ahjj) ((AtomicReference) this.a.a).get();
        if (ahjjVar != null) {
            ?? r4 = ahjjVar.a;
            akrh e = aktp.e("WorkerStartupModule#provideCmsBackupStartupTask#onContentChanged");
            try {
                ((qzm) r4.b()).b().F(TimeUnit.SECONDS.toMillis(2L));
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
