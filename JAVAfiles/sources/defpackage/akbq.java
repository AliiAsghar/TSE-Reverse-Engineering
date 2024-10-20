package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akbq implements Runnable {
    final List a = new ArrayList();
    Runnable b;

    @Override // java.lang.Runnable
    public final void run() {
        aiut.c();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
