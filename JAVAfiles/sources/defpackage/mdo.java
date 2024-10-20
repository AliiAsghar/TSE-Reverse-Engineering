package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdo extends aiwj {
    private final mbl a;
    private final aiww b = new aiww(mdn.a);

    public mdo(mbl mblVar) {
        this.a = mblVar;
    }

    @Override // defpackage.aiwj
    public final ListenableFuture a(IOException iOException, ahmn ahmnVar) {
        this.a.c("Bugle.ProtoDataStore.Corruption.UsageData.Count");
        return this.b.a(iOException, ahmnVar);
    }
}
