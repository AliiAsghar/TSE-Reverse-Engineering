package defpackage;

import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqx extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqx(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ecd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v45, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r1v23, types: [hxq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        eov P;
        eov P2;
        enb enbVar = null;
        switch (this.c) {
            case 0:
                ((gqy) this.a).b.a(this.b);
                return arnb.a;
            case 1:
                kxx.a.o("Creating a new instance of ConversationListDataSource.");
                kxx kxxVar = (kxx) this.b;
                kxxVar.r = new kxu(kxxVar);
                return new gat(this.a, kxxVar.r);
            case 2:
                gsy.a().c(gwp.a, "NetworkRequestConstraintController unregister callback");
                ((gwl) this.a).a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.b);
                return arnb.a;
            case 3:
                Object obj = this.b;
                gxg gxgVar = ((gwq) this.a).a;
                synchronized (gxgVar.b) {
                    if (gxgVar.c.remove(obj) && gxgVar.c.isEmpty()) {
                        gxgVar.e();
                    }
                }
                return arnb.a;
            case 4:
                Object obj2 = this.b;
                WorkDatabase workDatabase = ((gvd) obj2).e;
                workDatabase.getClass();
                workDatabase.n(new fhh(obj2, this.a, 15));
                gvf.w((gvd) this.b);
                return arnb.a;
            case 5:
                gvf.v((String) this.a, (gvd) this.b);
                gvf.w((gvd) this.b);
                return arnb.a;
            case 6:
                Object obj3 = this.b;
                WorkDatabase workDatabase2 = ((gvd) obj3).e;
                workDatabase2.getClass();
                workDatabase2.n(new faq(workDatabase2, this.a, obj3, 16));
                gvf.w((gvd) this.b);
                return arnb.a;
            case 7:
                ((hls) this.b).j(this.a);
                return arnb.a;
            case 8:
                ((ien) this.a).b((ief) this.b);
                return arnb.a;
            case 9:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null && (P = enbVar.P()) != null) {
                    return P;
                }
                return ((cg) this.b).P();
            case 10:
                Object obj4 = this.a;
                igm igmVar = (igm) this.b;
                qjh.l(igmVar.a, null, new iqi(igmVar, (iha) obj4, (arpe) null, 1), 3);
                return arnb.a;
            case 11:
                return Integer.valueOf(((yje) ((ico) this.b).b.b()).f((String) this.a));
            case 12:
                ico icoVar = (ico) this.a.b();
                Object obj5 = icoVar.a;
                Object obj6 = this.b;
                saw c = sax.c();
                c.f = ((iks) obj6).a;
                return ((iew) obj5).c("conversation_metadata", c.a().a(), new eig(icoVar, (arpe) null, 11));
            case 13:
                ico icoVar2 = (ico) this.a.b();
                Object obj7 = icoVar2.a;
                Object obj8 = this.b;
                saw c2 = sak.c();
                c2.f = ((iks) obj8).a;
                return ((iew) obj7).c("conversation_metadata", c2.c().a(), new eig(icoVar2, (arpe) null, 12, (byte[]) null));
            case 14:
                ifs ifsVar = (ifs) this.a.b();
                Object obj9 = ifsVar.a;
                ConversationIdType conversationIdType = ((iks) this.b).a;
                return ((iew) obj9).c("participants", ush.g(conversationIdType), new gwk(ifsVar, conversationIdType, (arpe) null, 2));
            case 15:
                iji ijiVar = (iji) this.a.b();
                BugleConversationId bugleConversationId = new BugleConversationId(((iks) this.b).a);
                Object obj10 = ijiVar.c;
                ncq d2 = ((ndi) ijiVar.a).d(bugleConversationId);
                return ((gpx) ((iew) obj10).a).B("recipients_model", new iku(d2), new ikt(new eig(ijiVar, (arpe) null, 13), d2, null));
            case 16:
                eoz d3 = dyt.d(this.a);
                if (d3 instanceof enb) {
                    enbVar = (enb) d3;
                }
                if (enbVar != null && (P2 = enbVar.P()) != null) {
                    return P2;
                }
                return ((cg) this.b).P();
            case 17:
                ?? r0 = this.a;
                jdd jddVar = (jdd) this.b;
                qjh.l(jddVar.b, null, new gbv(jddVar, (ConversationId) r0, (arpe) null, 18), 3);
                return arnb.a;
            case 18:
                ?? r5 = this.a;
                jdd jddVar2 = (jdd) this.b;
                qjh.l(jddVar2.b, null, new gbv(jddVar2, (ConversationId) r5, (arpe) null, 19, (byte[]) null), 3);
                return arnb.a;
            case 19:
                ((jdi) this.b).b.a(this.a);
                return arnb.a;
            default:
                ?? r02 = this.a;
                Object obj11 = this.b;
                akrc b = ((jdp) obj11).f.b("DeleteConversationActionPlugin: Delete Conversation");
                try {
                    ((jdp) obj11).c(r02);
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqx(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
