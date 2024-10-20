package defpackage;

import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsz implements andy {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ acta c;

    public acsz(acta actaVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = actaVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (!((Boolean) acta.b.a()).booleanValue()) {
            return;
        }
        if (th instanceof GbaBootstrapAuthenticationException) {
            advr.j(th, acta.a, "GbaBootstrapAuthenticationException from content server %s", this.a);
            this.c.d.a(aphy.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE);
            return;
        }
        advr.j(th, acta.a, "unexpected exception during GBA HTTP request processing", new Object[0]);
        this.c.d.a(aphy.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION);
    }

    @Override // defpackage.andy
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d.b(this.a, ((HttpResponse) obj).getStatusLine().getStatusCode(), agkx.W().longValue() - this.b);
    }
}
