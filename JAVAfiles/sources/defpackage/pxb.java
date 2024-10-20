package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxb implements pxe {
    public static final alwo a = alwo.o("BugleFileTransfer");
    static final utz b = uuh.e(uuh.b, "ft_http_request_connect_timeout_millis", 15000);
    static final utz c = uuh.e(uuh.b, "ft_http_request_read_timeout_millis", 10000);
    private final aneo d;
    private final UrlRequest e;
    private ScheduledFuture f;

    public pxb(aneo aneoVar, armf armfVar, String str, UrlRequest.Callback callback, alpg alpgVar, Optional optional, pws pwsVar) {
        this.d = aneoVar;
        UrlRequest.Builder trafficStatsTag = ((CronetEngine) armfVar.b()).newUrlRequestBuilder(str, new pxa(this, callback), aneoVar).setHttpMethod(pwsVar.toString()).setTrafficStatsTag(8194);
        aluq listIterator = alpgVar.r().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            trafficStatsTag.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        optional.ifPresent(new ksn(trafficStatsTag, aneoVar, 12, null));
        this.e = trafficStatsTag.build();
    }

    private final void e(int i) {
        this.f = this.d.schedule(new nau(this, 6), i, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.pxe
    public final void a() {
        this.e.cancel();
    }

    @Override // defpackage.pxe
    public final void b() {
        alwl alwlVar = (alwl) a.n().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "MonitoredUrlRequest.java");
        utz utzVar = b;
        alwlVar.t("HTTP request starting, starting connection timer (%d millis)", utzVar.e());
        e(((Integer) utzVar.e()).intValue());
        this.e.start();
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.f;
        scheduledFuture.getClass();
        scheduledFuture.cancel(false);
    }

    public final void d(int i) {
        c();
        e(i);
    }
}
