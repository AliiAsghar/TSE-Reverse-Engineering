package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzn implements rhi {
    final /* synthetic */ CountDownLatch a;

    public rzn(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void a(rhj rhjVar, Action action, Object obj, Object obj2) {
        this.a.countDown();
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void b(rhj rhjVar, Object obj, Object obj2) {
        this.a.countDown();
    }
}
