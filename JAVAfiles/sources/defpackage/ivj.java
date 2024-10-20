package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivj implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ivj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 7;
        boolean z = false;
        switch (this.c) {
            case 0:
                alvi alviVar = ixd.a;
                return ((LayoutInflater) this.a).inflate(R.layout.conversation_fragment, (ViewGroup) this.b, false);
            case 1:
                szt sztVar = (szt) obj;
                alog g = ((sxx) this.a).g();
                alob alobVar = new alob();
                alur it = g.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
                }
                Object obj2 = this.b;
                sztVar.U(new agmf("p2p_suggestions.target_message_id", 3, szt.X(alobVar.g()), true));
                sztVar.U(new agoi("p2p_suggestions.generated_timestamp", 7, Long.valueOf(((Instant) obj2).toEpochMilli())));
                return sztVar;
            case 2:
                alvi alviVar2 = ixd.a;
                return ((LayoutInflater) this.a).inflate(R.layout.conversation_fragment_with_c2o, (ViewGroup) this.b, false);
            case 3:
                ixd ixdVar = (ixd) this.b;
                MessageCoreData messageCoreData = ixdVar.bY;
                if (messageCoreData != null && messageCoreData.u() != null) {
                    ((alwl) ((alwl) imk.a.i()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "readDraftData", 177, "DraftDataService.java")).q("DraftDataService does not accept incoming drafts that are replies: clearing the reply context");
                    messageCoreData.bB(null);
                } else {
                    if (messageCoreData == null || messageCoreData.u() == null) {
                        z = true;
                    }
                    d.t(z, "DraftDataService does not accept incoming drafts that are replies");
                }
                ajwt ajwtVar = ixdVar.bE;
                imk imkVar = (imk) this.a;
                imkVar.m.set(iml.a);
                imkVar.n.set(messageCoreData);
                return imkVar.a(ajwtVar);
            case 4:
                ila ilaVar = (ila) obj;
                ixd ixdVar2 = (ixd) this.a;
                if (!ixdVar2.aV()) {
                    ixdVar2.bH = false;
                }
                int a = ilaVar.a(this.b);
                if (!ixdVar2.aV()) {
                    ixdVar2.bH = true;
                }
                return Integer.valueOf(a);
            case 5:
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                rre s = composeMessageView.E().s();
                rsr rsrVar = (rsr) s.a();
                ?? r4 = this.b;
                if (rsrVar.S(Collections.singletonList(r4), s.b())) {
                    Object obj3 = this.a;
                    if (r4 instanceof PendingAttachmentData) {
                        ixd ixdVar3 = (ixd) obj3;
                        ixdVar3.bH = false;
                        composeMessageView.E().H();
                        ixdVar3.bH = true;
                        composeMessageView.E().x();
                    } else {
                        composeMessageView.E().y(true);
                        ((gpx) ((ixd) obj3).bl.b()).x();
                    }
                    if (((Boolean) vof.a.e()).booleanValue() && r4.bi() && r4.t() != null) {
                        Uri t = r4.t();
                        t.getClass();
                        if (!alog.r(t.toString()).isEmpty()) {
                            ixd ixdVar4 = (ixd) obj3;
                            if (!ixdVar4.cL.c().isEmpty()) {
                                ixdVar4.ay.c(new ahlp(((vnz) ixdVar4.cL.c().get()).a()), ixdVar4.aZ);
                            }
                        }
                    }
                }
                return Integer.valueOf(((rsr) s.a()).k() - 1);
            case 6:
                if (((SelectedConversation) obj).s) {
                    return this.a;
                }
                return this.b;
            case 7:
                lcy lcyVar = (lcy) obj;
                lcyVar.W(lga.t(((lcq) this.a).c));
                lcyVar.W(this.b);
                return lcyVar;
            case 8:
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.W(lga.t(((lcq) this.a).c));
                lcyVar2.W(this.b);
                return lcyVar2;
            case 9:
                lcq lcqVar = (lcq) this.a;
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.W(lga.t(lcqVar.c));
                lcyVar3.W(this.b);
                lcyVar3.h(lcqVar.b.a);
                return lcyVar3;
            case 10:
                lcy lcyVar4 = (lcy) obj;
                lcyVar4.W(lga.t(((lcq) this.a).c));
                lcyVar4.W(this.b);
                return lcyVar4;
            case 11:
                lcq lcqVar2 = (lcq) this.a;
                lcy lcyVar5 = (lcy) obj;
                lcyVar5.W(lga.t(lcqVar2.c));
                lcyVar5.W(this.b);
                lcyVar5.h(lcqVar2.b.a);
                return lcyVar5;
            case 12:
                lcy lcyVar6 = (lcy) obj;
                lcyVar6.W(lga.t(((lcq) this.a).c));
                lcyVar6.W(this.b);
                return lcyVar6;
            case 13:
                tbd tbdVar = (tbd) obj;
                tbdVar.m(this.b);
                smm smmVar = new smm(smp.a);
                smmVar.e(new mjz(this.a, i));
                smmVar.c((smi) smp.d.c);
                tbdVar.i(smmVar.b());
                return tbdVar;
            case 14:
                mqo mqoVar = (mqo) obj;
                int i2 = mqi.c;
                mqoVar.b(this.b);
                mqoVar.c(((alog) this.a).size());
                return mqoVar;
            case 15:
                mqw mqwVar = (mqw) obj;
                int i3 = mqi.c;
                mqwVar.b(this.b);
                mqwVar.c(((alog) this.a).size());
                return mqwVar;
            case 16:
                mqo mqoVar2 = (mqo) obj;
                int i4 = mqi.c;
                mqoVar2.b(this.b);
                mqoVar2.c(((alog) this.a).size());
                return mqoVar2;
            case 17:
                mqw mqwVar2 = (mqw) obj;
                int i5 = mqi.c;
                mqwVar2.b(this.b);
                mqwVar2.c(((alog) this.a).size());
                return mqwVar2;
            case 18:
                syc sycVar = (syc) obj;
                akip.c(sycVar, (BugleConversationId) this.a);
                akip.e(sycVar, (mts) this.b);
                return sycVar;
            case 19:
                syc sycVar2 = (syc) obj;
                akip.c(sycVar2, (BugleConversationId) this.a);
                akip.d(sycVar2, (mts) this.b);
                return sycVar2;
            default:
                syc sycVar3 = (syc) obj;
                akip.c(sycVar3, (BugleConversationId) ((adlx) this.b).f);
                akip.e(sycVar3, (mts) this.a);
                return sycVar3;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ ivj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
