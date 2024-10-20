package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrp implements xro {
    private final armf a;
    private final armf b;

    public xrp(armf armfVar, armf armfVar2) {
        this.a = armfVar;
        this.b = armfVar2;
    }

    @Override // defpackage.xro
    public final xrz a(MessageCoreData messageCoreData, alog alogVar) {
        MessagePartCoreData G = messageCoreData.G();
        if (G != null) {
            Uri t = G.t();
            String d = gh.d(G.U());
            if (t != null) {
                ContentType contentType = null;
                xry xryVar = new xry(null);
                xryVar.d(t);
                if (d != null) {
                    contentType = ContentType.d(d);
                }
                xryVar.c(contentType);
                xryVar.e(yyb.bF(G));
                if (!G.bk() && !G.bz()) {
                    if (G.aW()) {
                        xryVar.b(Duration.ofMillis(G.k()));
                    }
                } else {
                    byte[] a = ((xrq) this.a.b()).a(G, ((xrr) this.b.b()).a(alogVar));
                    if (a != null) {
                        xryVar.g(ContentType.d("image/jpeg"));
                        xryVar.h(aozb.w(a));
                    }
                }
                return xryVar.a();
            }
            throw new IllegalArgumentException("Content uri in FileUploadInfo should be valid.");
        }
        throw new IllegalArgumentException("Unable to prepare file for uploading since the message does not contain an attachment.");
    }
}
