package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbx extends aiwj {
    private final mbl a;
    private final aiww b = new aiww(xbu.a);

    public xbx(mbl mblVar) {
        this.a = mblVar;
    }

    @Override // defpackage.aiwj
    public final ListenableFuture a(IOException iOException, ahmn ahmnVar) {
        this.a.c("Bugle.ForwardSync.SyncManagerDataStore.CorruptData.Count");
        return this.b.a(iOException, ahmnVar);
    }
}
