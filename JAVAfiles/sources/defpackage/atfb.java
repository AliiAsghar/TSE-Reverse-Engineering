package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class atfb implements atff {
    public final /* synthetic */ atfc a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ atfb(atfc atfcVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = atfcVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.atff
    public final void a() {
        if (this.d != 0) {
            atfc atfcVar = this.a;
            if (atfcVar.d.g.compareAndSet(5, 4)) {
                Object obj = this.c;
                atfcVar.a.onReadCompleted(atfcVar.d, this.b, (ByteBuffer) obj);
                return;
            }
            return;
        }
        atfc atfcVar2 = this.a;
        Object obj2 = this.c;
        atfcVar2.a.onRedirectReceived(atfcVar2.d, this.b, (String) obj2);
    }
}
