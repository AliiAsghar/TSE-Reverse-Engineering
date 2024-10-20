package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ando implements ancr {
    final /* synthetic */ Callable a;

    public ando(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ancr
    public final ListenableFuture a() {
        return albo.bI(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
