package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arae extends araw {
    final /* synthetic */ arhp a;
    final /* synthetic */ arah b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arae(arah arahVar, arhp arhpVar) {
        super(arahVar.b.e);
        this.a = arhpVar;
        this.b = arahVar;
    }

    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        if (this.b.a != null) {
            arcb.g(this.a);
            return;
        }
        while (true) {
            try {
                InputStream g = this.a.g();
                if (g != null) {
                    try {
                        arah arahVar = this.b;
                        arahVar.c.d(arahVar.b.b.e.b(g));
                        g.close();
                    } finally {
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                arcb.g(this.a);
                this.b.b(Status.c.d(th).withDescription("Failed to read message."));
                return;
            }
        }
    }
}
