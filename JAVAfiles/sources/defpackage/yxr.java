package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxr implements yxn, yxh {
    private static final xze g = xze.g("BugleDataModel", "XmsViaSlmSender");
    public final anen a;
    public final anen b;
    public final xnv c;
    public final yxo d;
    public final yxg e;
    public final wpp f;
    private final qdx h;
    private final armf i;
    private final vbu j;
    private final yyt k;

    public yxr(yyt yytVar, anen anenVar, anen anenVar2, xnv xnvVar, yxo yxoVar, wpp wppVar, qdx qdxVar, armf armfVar, yxg yxgVar, vbu vbuVar) {
        this.k = yytVar;
        this.a = anenVar;
        this.b = anenVar2;
        this.c = xnvVar;
        this.d = yxoVar;
        this.f = wppVar;
        this.h = qdxVar;
        this.i = armfVar;
        this.e = yxgVar;
        this.j = vbuVar;
    }

    public static vqh c() {
        return vqh.a(2, 0).a();
    }

    public static akul d() {
        g.q("Cannot get selfChatEndpoint");
        return aktp.ag(vqh.a(2, 0).a());
    }

    @Override // defpackage.yxh
    public final akul a(yxj yxjVar) {
        return ((akul) this.j.f(yxjVar.c).map(new yuq(this, yxjVar, 5)).orElseGet(new yaa(19))).h(new yts(16), this.b);
    }

    @Override // defpackage.yxn
    public final akul b(yxl yxlVar) {
        return ((akul) this.j.f(yxlVar.c).map(new yuq(this, yxlVar, 6)).orElseGet(new yaa(20))).h(new yts(17), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul e(rve rveVar, wxk wxkVar) {
        akul akulVar;
        qgr qgrVar = wxkVar.h;
        if (qgrVar == null) {
            qgrVar = qgr.a;
        }
        wpp wppVar = this.f;
        qgrVar.getClass();
        rveVar.getClass();
        wppVar.a(qgrVar, rveVar, 4);
        yyt yytVar = this.k;
        rve a = rve.a(wxkVar.e);
        if (((Boolean) ((utz) vzh.b.get()).e()).booleanValue()) {
            Object obj = yytVar.d;
            qgr qgrVar2 = wxkVar.h;
            if (qgrVar2 == null) {
                qgrVar2 = qgr.a;
            }
            ((vzh) obj).b(qgrVar2, a);
        }
        wxq wxqVar = wxkVar.f;
        if (wxqVar == null) {
            wxqVar = wxq.a;
        }
        int i = 2;
        if (wxqVar.c == 2) {
            Object obj2 = yytVar.c;
            akrh e = aktp.e("SendSlmMessageMethod#execute");
            try {
                Object obj3 = ((wpp) obj2).a;
                wel welVar = (wel) obj3;
                akul a2 = welVar.a(wxkVar, ((wcj) ((wpp) obj2).b).b(((was) ((wpp) obj2).c).apply(wxkVar)));
                e.b(a2);
                e.close();
                akulVar = a2;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            Object obj4 = yytVar.a;
            akrh e2 = aktp.e("SendSlmFileMethod#execute");
            try {
                Object obj5 = ((yyt) obj4).c;
                Object obj6 = ((yyt) obj4).b;
                wel welVar2 = (wel) obj5;
                akul a3 = welVar2.a(wxkVar, arlj.a(((arlb) obj6).a.a(wcm.e(), ((arlb) obj6).b), ((waq) ((yyt) obj4).a).apply(wxkVar)));
                e2.b(a3);
                e2.close();
                akulVar = a3;
            } finally {
                try {
                    e2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return akulVar.h(new way((Object) yytVar, (Object) wxkVar, a, i), yytVar.b).h(new yxu(this, wxkVar, rveVar, 1), this.b);
    }

    public final boolean f(MessageCoreData messageCoreData) {
        messageCoreData.bO(tqu.SLM);
        sya syaVar = new sya();
        syaVar.N(tqu.SLM);
        syaVar.aj("updateXmsTransport");
        if (messageCoreData.E().i()) {
            rve a = this.h.a();
            messageCoreData.bR(a);
            syaVar.x(a);
            syaVar.aj("updateXmsTransportAndRcsMessageId");
        }
        boolean O = ((rwd) this.i.b()).O(messageCoreData.z(), messageCoreData.B(), syaVar);
        if (!O) {
            xyo e = g.e();
            e.H("Unable to update MessageCoreData when trying to send the message via SLM");
            e.z("messageId", messageCoreData.B());
            e.q();
        }
        return O;
    }
}
