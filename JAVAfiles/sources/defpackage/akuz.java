package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akuz extends aqvi {
    private final SettableFuture a;

    public akuz(aqvr aqvrVar, akrh akrhVar) {
        super(aqvrVar);
        SettableFuture create = SettableFuture.create();
        akrhVar.b(create);
        this.a = create;
    }

    @Override // defpackage.aqvi, defpackage.aqvr
    public final void a(Status status, aqut aqutVar) {
        super.a(status, aqutVar);
        this.a.set(null);
    }
}
