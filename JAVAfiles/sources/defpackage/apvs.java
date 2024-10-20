package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvs implements apvh {
    public final apvr a;
    public final apvt b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final apuu f;
    private final CronetEngine g;
    private final ExecutorService h;

    public apvs(String str, String str2, apuu apuuVar, CronetEngine cronetEngine, ExecutorService executorService, apvr apvrVar, apvt apvtVar) {
        this.d = str;
        this.e = str2;
        this.f = apuuVar;
        this.g = cronetEngine;
        this.h = executorService;
        this.a = apvrVar;
        this.b = apvtVar;
    }

    @Override // defpackage.apvh
    public final long a() {
        return this.b.a.get();
    }

    @Override // defpackage.apvh
    public final ListenableFuture b() {
        long j;
        UrlRequest.Builder newUrlRequestBuilder = this.g.newUrlRequestBuilder(this.d, this.a, this.h);
        newUrlRequestBuilder.setHttpMethod(this.e);
        for (String str : this.f.c()) {
            Iterator it = this.f.b(str).iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(str, (String) it.next());
            }
        }
        if (!this.f.f(assi.a)) {
            newUrlRequestBuilder.addHeader(assi.a, anbk.b.toString());
        }
        apvt apvtVar = this.b;
        if (apvtVar != null) {
            j = apvtVar.b;
        } else {
            j = 0;
        }
        newUrlRequestBuilder.addHeader("Content-Length", String.valueOf(j));
        apvt apvtVar2 = this.b;
        if (apvtVar2 != null) {
            newUrlRequestBuilder.setUploadDataProvider(apvtVar2, this.h);
        }
        if (newUrlRequestBuilder instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) newUrlRequestBuilder;
            builder.setTrafficStatsTag(-1);
            builder.setTrafficStatsUid(-1);
        }
        this.c = newUrlRequestBuilder.build();
        this.h.execute(new aomp(this, 6));
        return this.a.a;
    }

    @Override // defpackage.apvh
    public final String d() {
        return this.d;
    }

    @Override // defpackage.apvh
    public final void e() {
        if (this.c != null) {
            this.h.execute(new aomp(this, 5));
        }
    }

    @Override // defpackage.apvh
    public final void h(aovn aovnVar, int i, int i2) {
        this.h.execute(new uym(this, aovnVar, i, i2, 6));
    }
}
