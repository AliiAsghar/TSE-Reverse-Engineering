package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyw implements ancs {
    public final List a;
    public final int b;
    public final Executor c;
    private final algy e;
    public int d = -1;
    private final ancs f = akto.d(this);

    public ajyw(List list, algy algyVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = algyVar;
        this.c = executor;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        if (this.e.a(obj)) {
            return albo.bI(obj);
        }
        return b();
    }

    public final ListenableFuture b() {
        int i = this.d + 1;
        this.d = i;
        if (i < this.b) {
            return ancj.g((ListenableFuture) this.a.get(i), this.f, this.c);
        }
        return albo.bI(null);
    }
}
