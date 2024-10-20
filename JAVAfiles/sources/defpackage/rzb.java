package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzb extends unp {
    public static final xze a = xze.g("Bugle", "RequestLinkPreviewAction");
    public static final utz b = uuh.q(155131104);
    public static final ahka c = new ahka("LinkPreviewFetchLatency");
    public final armf d;
    public final ryx e;
    public final xnv f;
    public final uhj g;
    public final rys h;
    private final anen i;
    private final armf j;
    private final ujv k;
    private final ryg l;
    private final ahqr m;
    private final lrf n;

    public rzb(anen anenVar, armf armfVar, armf armfVar2, ryx ryxVar, ujv ujvVar, ryg rygVar, xnv xnvVar, uhj uhjVar, rys rysVar, lrf lrfVar, ahqr ahqrVar) {
        this.i = anenVar;
        this.d = armfVar;
        this.j = armfVar2;
        this.e = ryxVar;
        this.k = ujvVar;
        this.l = rygVar;
        this.f = xnvVar;
        this.g = uhjVar;
        this.h = rysVar;
        this.n = lrfVar;
        this.m = ahqrVar;
    }

    private final void n(MessageCoreData messageCoreData, String str) {
        ryg rygVar = this.l;
        long n = messageCoreData.n();
        qwm d = rygVar.d();
        List singletonList = Collections.singletonList(d.a());
        this.k.h(Optional.empty(), messageCoreData.z(), d, d.a(), singletonList, 210, n + 1, -1L);
        o(messageCoreData, str);
        if (this.n.a() == -1) {
            ((zxy) this.n.b).l(n);
        }
    }

    private final void o(MessageCoreData messageCoreData, String str) {
        ssj a2 = sss.a();
        a2.l(messageCoreData.B());
        a2.m(str);
        a2.d(messageCoreData.n());
        ((uie) this.d.b()).f(a2.a(), messageCoreData.z());
    }

    private final void p(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        ssj a2 = sss.a();
        a2.l(messageIdType);
        a2.m(str);
        a2.d(Long.MAX_VALUE);
        a2.j(true);
        ((uie) this.d.b()).f(a2.a(), conversationIdType);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(4);
        gsd gsdVar = new gsd();
        gsdVar.d();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        a2.c(unv.WORKMANAGER_ONLY);
        a2.c = amdy.REQUEST_LINK_PREVIEW_ACTION;
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RequestLinkPreviewHandler");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ea, code lost:
    
        if (defpackage.uie.h(r10.aw()) < ((java.lang.Integer) defpackage.utw.x.e()).intValue()) goto L62;
     */
    @Override // defpackage.unp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* synthetic */ defpackage.akul d(defpackage.uns r18, defpackage.apbt r19) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzb.d(uns, apbt):akul");
    }

    @Override // defpackage.unx
    public final apca e() {
        return umo.a.getParserForType();
    }

    public final void j(ahqq ahqqVar, ahqp ahqpVar) {
        if (ahqqVar != null) {
            this.m.f(ahqqVar, c, null, ahqpVar);
        }
    }

    public final void k(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        ssj a2 = sss.a();
        a2.l(messageIdType);
        a2.m(str);
        a2.d(Long.MAX_VALUE);
        a2.i(true);
        ((uie) this.d.b()).f(a2.a(), conversationIdType);
    }

    public final boolean l(MessageIdType messageIdType) {
        Optional g = uie.g(messageIdType);
        if (g.isPresent() && this.e.c((ssi) g.get())) {
            return true;
        }
        return false;
    }

    public final void m(MessageIdType messageIdType, int i, int i2) {
        MessageCoreData q = ((rwd) this.j.b()).q(messageIdType);
        if (q == null) {
            return;
        }
        this.e.f(q, i, i2);
    }
}
