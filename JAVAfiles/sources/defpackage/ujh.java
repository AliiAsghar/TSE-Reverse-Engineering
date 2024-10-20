package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujh implements uji {
    public static final xze a = xze.g("BugleDataModel", "RichCardMessagePartMediaDownloadHandler");
    public final agnq b;
    public final ConversationIdType c;
    public final MessageIdType d;
    public final String e;
    public final armf f;
    private final anen g;
    private final ujg h;
    private final obm i;

    public ujh(anen anenVar, armf armfVar, agnq agnqVar, ujg ujgVar, obm obmVar, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        this.g = anenVar;
        this.f = armfVar;
        this.b = agnqVar;
        this.h = ujgVar;
        this.i = obmVar;
        this.c = conversationIdType;
        this.d = messageIdType;
        this.e = str;
    }

    @Override // defpackage.uji
    public final void a(String str) {
        xyo c = a.c();
        c.H("Media download cancelled");
        c.z("requestedUri", str);
        c.q();
    }

    @Override // defpackage.uji
    public final void b(String str) {
        xyo b = a.b();
        b.H("Media download failed");
        b.z("requestedUri", str);
        b.q();
        if (this.i.a()) {
            qiu.h(aktp.ai(new rbg(this, 14), this.g));
        }
    }

    @Override // defpackage.uji
    public final void c(String str, long j, long j2) {
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(this.d, Long.parseLong(this.e));
        xof xofVar = new xof();
        xofVar.b(j);
        xofVar.c(j2);
        xog a2 = xofVar.a();
        ujg ujgVar = this.h;
        qjh.l(ujgVar.b, null, new ypa(ujgVar, coreBuglePartialMessageId, a2, (arpe) null, 1), 3);
    }

    @Override // defpackage.uji
    public final void d(String str) {
        xyo c = a.c();
        c.H("Media download started");
        c.z("requestedUri", str);
        c.x("handlerHashCode", hashCode());
        c.q();
        if (this.i.a()) {
            qiu.h(aktp.ai(new rbg(this, 13), this.g));
        }
    }

    @Override // defpackage.uji
    public final void e(String str, Uri uri) {
        qiu.h(aktp.ah(new ryv(this, uri, 18, null), this.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujh)) {
            return false;
        }
        ujh ujhVar = (ujh) obj;
        if (Objects.equals(this.c, ujhVar.c) && Objects.equals(this.d, ujhVar.d) && Objects.equals(this.e, ujhVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e);
    }
}
