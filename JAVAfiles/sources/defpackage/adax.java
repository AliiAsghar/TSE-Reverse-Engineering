package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adax extends adqp {
    private static final advp a = new advp("MessageReceivedListener");
    private static final alpt b = alpt.r("application/conference-info+xml", GroupManagementContentType.CONTENT_TYPE);
    private final adrc c;
    private final anen d;
    private final adba e;

    public adax(anen anenVar, adba adbaVar, adrc adrcVar) {
        this.d = anenVar;
        this.c = adrcVar;
        this.e = adbaVar;
    }

    private static final boolean p(adqu adquVar) {
        Optional empty;
        String str = adquVar.h;
        if ("message/cpim".equals(str)) {
            try {
                Optional b2 = ajki.j(adquVar.f).c.b();
                if (b2.isPresent()) {
                    empty = Optional.of(ContentType.d((String) b2.get()));
                } else {
                    empty = Optional.empty();
                }
                if (empty.isPresent()) {
                    str = ((ContentType) empty.get()).toString();
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e);
            }
        }
        if (b.contains(str)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void c(adqu adquVar) {
        if (!p(adquVar)) {
            if (aczr.d() && p(adquVar)) {
                return;
            }
            adxq adxqVar = new adxq(null, null, null);
            adxqVar.g(adquVar);
            adxqVar.h(this.c);
            ListenableFuture a2 = this.e.a(adxqVar.f());
            advr.l(a.b("handleReceiveMessagebbugle"), "handle received message %s", adquVar.k);
            albo.bR(a2, new pum(12), this.d);
        }
    }
}
