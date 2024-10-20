package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiww extends aiwj {
    private final apbt a;

    public aiww(apbt apbtVar) {
        this.a = apbtVar;
    }

    @Override // defpackage.aiwj
    public final ListenableFuture a(IOException iOException, ahmn ahmnVar) {
        if (!(iOException.getCause() instanceof apba)) {
            return albo.bH(iOException);
        }
        return ancd.g(ahmnVar.g(albo.bI(this.a)), IOException.class, new ahce(iOException, 18), andi.a);
    }
}
