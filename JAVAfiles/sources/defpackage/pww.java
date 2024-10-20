package defpackage;

import android.net.Uri;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pww implements pwx {
    public final /* synthetic */ pwz a;
    private final /* synthetic */ int b;

    public pww(pwz pwzVar, int i) {
        this.b = i;
        this.a = pwzVar;
    }

    @Override // defpackage.pwx
    public final String a() {
        if (this.b != 0) {
            return "FinalState";
        }
        return "SetupState";
    }

    @Override // defpackage.pwx
    public final void b(pwu pwuVar) {
        Object d;
        int i = 2;
        if (this.b != 0) {
            alwl alwlVar = (alwl) pwz.a.g();
            alwlVar.X(xod.a, this.a.c);
            alwlVar.X(xod.i, "FinalState");
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$FinalState", "enter", 256, "InProgressFileTransfer.java")).q("Finalizing the HTTP execution flow.");
            int b = pwuVar.b() - 1;
            if (b != 2) {
                if (b == 3) {
                    ((dtq) this.a.k.b).b(new pxy(pwuVar.c()));
                    return;
                }
                throw new IllegalStateException(String.format("Transfer id %s finished with wrong event: %s.", this.a.c, ppm.b(pwuVar.b())));
            }
            pwz pwzVar = this.a;
            UrlResponseInfo urlResponseInfo = pwuVar.d().a;
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            rhx rhxVar = pwzVar.k;
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            if (httpStatusCode != 200 && httpStatusCode != 206) {
                pwq a = pwr.a();
                a.f(xoc.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
                a.e(httpStatusCode);
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                Comparator comparator2 = alqc.a;
                comparator.getClass();
                a.d(alqc.a(allHeaders, comparator));
                d = new pxy(a.a());
            } else {
                d = ppm.d((Uri) rhxVar.a);
            }
            ((dtq) rhxVar.b).b(d);
            return;
        }
        alwl alwlVar2 = (alwl) pwz.a.g();
        alwlVar2.X(xod.a, this.a.c);
        alwlVar2.X(xod.i, "SetupState");
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$SetupState", "enter", 143, "InProgressFileTransfer.java")).q("Preparing the HTTP request for execution.");
        this.a.d.a().h(new puy(this, i), this.a.b).k(qiu.b(), andi.a);
    }

    @Override // defpackage.pwx
    public final void c() {
        if (this.b == 0) {
        } else {
            throw new IllegalStateException(String.format("Transfer id %s can't exit from %s.", this.a.c, "FinalState"));
        }
    }
}
