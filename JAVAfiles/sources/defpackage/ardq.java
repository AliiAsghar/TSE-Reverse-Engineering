package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardq {
    public final Object a = new Object();
    public Collection b = new HashSet();
    public Status c;
    public final /* synthetic */ ardr d;

    public ardq(ardr ardrVar) {
        this.d = ardrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean isEmpty = this.b.isEmpty();
            if (isEmpty) {
                this.d.z.o(status);
            }
        }
    }
}
