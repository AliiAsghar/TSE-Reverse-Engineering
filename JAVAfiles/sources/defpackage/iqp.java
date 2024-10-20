package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iqp implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ iqp(amrl amrlVar, amrk amrkVar, Optional optional, int i) {
        this.d = i;
        this.b = amrlVar;
        this.c = amrkVar;
        this.a = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [rsr] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [rsr] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v18, types: [arnv] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v5, types: [arnv] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        Object apply;
        int i = 1;
        switch (this.d) {
            case 0:
                iji ijiVar = (iji) obj;
                ((Snackbar) this.a).s(((Context) ijiVar.c).getString(R.string.snackbar_action_label_add_to_group), new akwb(ijiVar.b, "AddToGroupSnackbarAction", new ivq(ijiVar, (ConversationIdType) this.b, (iqs) this.c, i), 1));
                return;
            case 1:
                RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj;
                alwo alwoVar = imk.a;
                boolean equals = ((iml) this.b).equals(iml.c);
                Object obj2 = this.c;
                ?? r4 = this.a;
                if (equals) {
                    ((alwl) imk.a.m().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 325, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft with overwritten text");
                    r4.bB(lua.a(repliedToDataAdapter.b));
                    ((ajli) obj2).b = repliedToDataAdapter;
                    return;
                }
                lua u = r4.u();
                if (u == null) {
                    ((alwl) ((alwl) imk.a.i()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 335, "DraftDataService.java")).q("Combined draft is not a reply but RepliedToDataAdapter was extracted");
                    return;
                }
                ((alwl) imk.a.m().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "setRepliedToDataWithPreconditions", 339, "DraftDataService.java")).q("Setting RepliedToDataAdapter for combined draft");
                albo.U(repliedToDataAdapter.b.equals(u.b), "Extracted RepliedToDataAdapter has different message ID than the replied-to message ID of combined draft");
                ((ajli) obj2).b = repliedToDataAdapter;
                return;
            case 2:
                ixd ixdVar = (ixd) this.b;
                xbf xbfVar = ixdVar.al;
                Object obj3 = this.a;
                Activity q = ixdVar.q();
                ixd A = ixdVar.A();
                ComposeMessageView composeMessageView = (ComposeMessageView) obj3;
                zrb E = composeMessageView.E();
                lex lexVar = ixdVar.cB;
                da G = ixdVar.M.G();
                xbe a = xbfVar.a(ixdVar.a());
                rre s = composeMessageView.E().s();
                yyz yyzVar = ixdVar.cP;
                aabl aablVar = (aabl) yyzVar.f.b();
                zfm zfmVar = (zfm) yyzVar.c.b();
                mcm mcmVar = (mcm) yyzVar.l.b();
                mci mciVar = (mci) yyzVar.m.b();
                zhg zhgVar = (zhg) yyzVar.i.b();
                abdc abdcVar = (abdc) yyzVar.e.b();
                abdcVar.getClass();
                yjf yjfVar = (yjf) yyzVar.j.b();
                yjfVar.getClass();
                yai yaiVar = (yai) yyzVar.g.b();
                ((mho) yyzVar.b.b()).getClass();
                xnv xnvVar = (xnv) yyzVar.h.b();
                xnvVar.getClass();
                abbu abbuVar = (abbu) yyzVar.a.b();
                abbuVar.getClass();
                lexVar.getClass();
                G.getClass();
                ydf ydfVar = ixdVar.R;
                ydfVar.getClass();
                ixdVar.bT = new aabp(aablVar, zfmVar, mcmVar, mciVar, zhgVar, abdcVar, yjfVar, yaiVar, xnvVar, abbuVar, yyzVar.k, q, A, E, lexVar, G, ydfVar, a, ixdVar.ca, s);
                ixdVar.bT.j((Bundle) this.c);
                return;
            case 3:
                ((ila) obj).d().R(this.b, ((Integer) this.a).intValue());
                ((ixd) this.c).aR();
                return;
            case 4:
                ixd ixdVar2 = (ixd) this.c;
                ((rsr) ixdVar2.cl.a()).R(this.b, ((Integer) this.a).intValue());
                ixdVar2.aR();
                return;
            case 5:
                nfm nfmVar = (nfm) obj;
                nfmVar.getClass();
                ?? r9 = this.c;
                ?? r10 = this.a;
                if (r9 != 0) {
                    r10.add(qjh.j(nfmVar.b, new naw(nfmVar, (alog) r9, (arpe) null, 4, (byte[]) null)));
                }
                ?? r3 = this.b;
                if (r3 != 0) {
                    akul ag = aktp.ag(null);
                    ag.getClass();
                    r10.add(ag);
                }
                if ((r9 != 0 && !r9.isEmpty()) || (r3 != 0 && !r3.isEmpty())) {
                    if (r9 == 0) {
                        r9 = arnv.a;
                    }
                    if (r3 == 0) {
                        r3 = arnv.a;
                    }
                    r10.add(qjh.j(nfmVar.b, new naw(nfmVar, alzz.aZ(aqjn.aq(r9, r3)), (arpe) null, 3)));
                    return;
                }
                return;
            case 6:
                alwl alwlVar = (alwl) qdn.a.g();
                alwlVar.X(ydl.f, rve.a(((MessageReceipt) this.a).d()));
                alwlVar.X(ydl.p, ruy.b(((qfo) this.b).h));
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processFailedDeliveryReceipt", 494, "UnencryptedIncomingChatMessageVisitor.java")).q("Completed action for locally generated MSRP report Message Receipt from Persistent Work Queue.");
                ((qdn) this.c).i.a(pwh.SUCCESS);
                return;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                String str2 = ((agmx) entry.getValue()).b;
                boolean contains = this.a.contains(str);
                adwp adwpVar = ((qxn) this.b).o;
                if (adwpVar.a.containsKey("work_queue_index_tag")) {
                    if (contains) {
                        ((SQLiteDatabase) this.c).execSQL("DROP INDEX ".concat(String.valueOf(str)));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("no value for conditionTag: work_queue_index_tag");
            case 8:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                ((rxc) ((UploadAttachmentsToBlobstoreAction) this.c).c.b()).c(messagePartCoreData, (String) this.b);
                if (rjo.b(messagePartCoreData, true)) {
                    ((ArrayList) this.a).add(messagePartCoreData);
                    return;
                }
                return;
            case 9:
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) obj;
                ((rxc) ((UploadAttachmentsToBlobstoreAction) this.c).c.b()).c(messagePartCoreData2, (String) this.b);
                if (rjo.b(messagePartCoreData2, true)) {
                    ((ArrayList) this.a).add(messagePartCoreData2);
                    return;
                }
                return;
            case 10:
                ((ActionExecutorImpl) this.c).e.f((ahqq) obj, (ahka) this.b, null, (ahqp) this.a);
                return;
            case 11:
                sec secVar = (sec) obj;
                qei qeiVar = (qei) ((alor) this.c).get(secVar.g());
                if (secVar.k() && secVar.j() && qeiVar != null) {
                    Object obj4 = this.b;
                    this.a.add(qeiVar);
                    ((alpu) obj4).b(qeiVar, secVar.h());
                    return;
                }
                xyo c = vcb.a.c();
                c.H("No group encryption support for at least one participant.");
                c.L("participant", secVar.g());
                c.q();
                return;
            case 12:
                sec secVar2 = (sec) obj;
                apply = this.a.apply(secVar2);
                if (((Boolean) apply).booleanValue()) {
                    this.b.add(secVar2.g());
                }
                ((alpu) this.c).b(secVar2.g(), secVar2.h());
                return;
            case 13:
                amgl amglVar = (amgl) obj;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                Object obj5 = this.a;
                Object obj6 = this.b;
                amgu amguVar = (amgu) amglVar.b;
                amgu amguVar2 = amgu.a;
                obj6.getClass();
                amguVar.an = (amrl) obj6;
                amguVar.d |= 4;
                aozy createBuilder = amrk.a.createBuilder();
                String a2 = xqc.a((String) obj5);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj7 = this.c;
                amrk amrkVar = (amrk) createBuilder.b;
                a2.getClass();
                amrkVar.b |= 2;
                amrkVar.d = a2;
                int aD = a.aD(((Long) ((xqc) obj7).e.b()).intValue());
                if (aD != 0) {
                    i = aD;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amrk amrkVar2 = (amrk) createBuilder.b;
                amrkVar2.e = i - 1;
                amrkVar2.b |= 4;
                amrk amrkVar3 = (amrk) createBuilder.s();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar3 = (amgu) amglVar.b;
                amrkVar3.getClass();
                amguVar3.at = amrkVar3;
                amguVar3.d |= 256;
                return;
            default:
                amgl amglVar2 = (amgl) obj;
                if (!amglVar2.b.isMutable()) {
                    amglVar2.u();
                }
                Object obj8 = this.b;
                amgu amguVar4 = (amgu) amglVar2.b;
                amgu amguVar5 = amgu.a;
                obj8.getClass();
                amguVar4.an = (amrl) obj8;
                amguVar4.d |= 4;
                if (!amglVar2.b.isMutable()) {
                    amglVar2.u();
                }
                Object obj9 = this.a;
                Object obj10 = this.c;
                amgu amguVar6 = (amgu) amglVar2.b;
                obj10.getClass();
                amguVar6.at = (amrk) obj10;
                amguVar6.d |= 256;
                yyt.G(amglVar2, (Optional) obj9);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.d) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ iqp(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ iqp(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ iqp(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ iqp(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
