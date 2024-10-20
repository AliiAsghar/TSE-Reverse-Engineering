package defpackage;

import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdr implements qdj {
    public static final xze a = xze.g("BugleDataModel", "UnencryptedSinglePartIncomingChatMessageProcessor");
    public final ajsg b;
    public final qdo c;
    public final armf d;
    private final anen e;
    private final pwa f;

    public qdr(anen anenVar, ajsg ajsgVar, pwa pwaVar, qdo qdoVar, armf armfVar) {
        this.b = ajsgVar;
        this.f = pwaVar;
        this.c = qdoVar;
        this.e = anenVar;
        this.d = armfVar;
    }

    @Override // defpackage.qdj
    public final akul a(qdk qdkVar) {
        return b(qdkVar, Bundle.EMPTY);
    }

    public final akul b(final qdk qdkVar, final Bundle bundle) {
        akrh e = aktp.e("UnencryptedSinglePartIncomingChatMessageProcessor::process");
        try {
            final ajrt ajrtVar = (ajrt) this.f.m().fu(qdkVar.a());
            final ContentType contentType = ajrtVar.b;
            final String str = qdkVar.a.g;
            xyo c = a.c();
            c.H("Processing incoming message");
            c.g(rve.a(str));
            c.z("contentType", contentType);
            c.q();
            akul f = akul.g(d.m(new dts() { // from class: qdp
                @Override // defpackage.dts
                public final Object a(dtq dtqVar) {
                    qdr qdrVar = qdr.this;
                    ajqz a2 = qdrVar.b.a(contentType).a(ajrtVar);
                    qdq qdqVar = new qdq(dtqVar);
                    Bundle bundle2 = bundle;
                    bundle2.getClass();
                    qdo qdoVar = qdrVar.c;
                    anen anenVar = (anen) qdoVar.a.b();
                    anenVar.getClass();
                    xnv xnvVar = (xnv) qdoVar.b.b();
                    xnvVar.getClass();
                    a2.gU(new qdn(qdkVar, qdqVar, bundle2, anenVar, xnvVar, qdoVar.c, qdoVar.d, qdoVar.e, qdoVar.f, qdoVar.g, qdoVar.h, qdoVar.i, qdoVar.j, qdoVar.k, qdoVar.l, qdoVar.m, qdoVar.n, qdoVar.o, qdoVar.p));
                    return "UnencryptedIncomingChatMessageVisitor for messageId:".concat(String.valueOf(str));
                }
            })).f(ajsh.class, new mmc(this, str, contentType, qdkVar, 5), this.e);
            e.b(f);
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
