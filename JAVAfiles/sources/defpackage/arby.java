package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arby implements arhk {
    @Override // defpackage.arhk
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(arcb.k("grpc-default-executor-%d"));
    }

    @Override // defpackage.arhk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
