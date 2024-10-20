package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kca extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(agak agakVar, View view, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = agakVar;
        this.a = view;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((kca) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v167, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [mjg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mjg] */
    /* JADX WARN: Type inference failed for: r2v33, types: [mjg] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v4, types: [qdq] */
    /* JADX WARN: Type inference failed for: r6v5, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        alvw g;
        List y;
        long j;
        int i = 5;
        int i2 = 13;
        int i3 = 2;
        int i4 = 4;
        int i5 = 1;
        int i6 = 3;
        Object obj2 = null;
        Object obj3 = null;
        arpe arpeVar = null;
        Object obj4 = null;
        switch (this.c) {
            case 0:
                aqil.P(obj);
                qiu.f(((kcc) this.a).d.x(this.b), "Failed to load link preview");
                return arnb.a;
            case 1:
                aqil.P(obj);
                qiu.h(((kcc) this.a).d.p(this.b.b()));
                return arnb.a;
            case 2:
                aqil.P(obj);
                alvw g2 = kcr.a.g();
                g2.X(alwp.a, "BugleImage");
                ((alvg) g2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 653, "ImageBubbleUiAdapter.kt")).t("Pausing file transfer for messageId=%s", this.b);
                ((kcr) this.a).f.m(this.b);
                return arnb.a;
            case 3:
                aqil.P(obj);
                ((kdh) this.b).e.a(((kde) this.a).a.b());
                return arnb.a;
            case 4:
                aqil.P(obj);
                ((kdh) this.b).e.a(((kde) this.a).a.b());
                return arnb.a;
            case 5:
                aqil.P(obj);
                ((kdn) this.a).f.a(this.b);
                return arnb.a;
            case 6:
                aqil.P(obj);
                ((kdn) this.a).f.a(this.b);
                return arnb.a;
            case 7:
                aqil.P(obj);
                ((kdn) this.a).f.a(this.b);
                return arnb.a;
            case 8:
                aqil.P(obj);
                ((alvg) ken.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 434, "VideoBubbleUiAdapter.kt")).t("Pausing file transfer for messageId=%s", this.b);
                ((ken) this.a).h.m(this.b);
                return arnb.a;
            case 9:
                aqil.P(obj);
                agxw agxwVar = (agxw) this.b;
                ajwt n = agxwVar.n();
                kpy kpyVar = (kpy) this.a;
                agxw agxwVar2 = kpyVar.b;
                if (agxwVar2 == null) {
                    kpyVar.b = agxwVar;
                    if (agxwVar.o().equals("google")) {
                        vno vnoVar = (vno) ((kpy) this.a).a.get();
                        n.getClass();
                        vnoVar.g();
                    }
                } else if (agxwVar2.n().a != n.a) {
                    String o = agxwVar2.o();
                    String o2 = agxwVar.o();
                    kpyVar.b = agxwVar;
                    if (o.equals("google") && o2.equals("pseudonymous")) {
                        ((vno) ((kpy) this.a).a.get()).f();
                        return arnb.a;
                    }
                    if (((agxw) this.b).o().equals("google")) {
                        vno vnoVar2 = (vno) ((kpy) this.a).a.get();
                        n.getClass();
                        vnoVar2.g();
                    }
                }
                return arnb.a;
            case 10:
                aqil.P(obj);
                boolean al = aktp.al(u());
                ?? r3 = this.b;
                Object obj5 = this.a;
                if (al) {
                    akrh e = aktp.e("MessageDetailsScreenUiAdapter#createUiDataFlow");
                    try {
                        jzz jzzVar = new jzz(((lfo) obj5).i.j(r3, null, null), false, null, null, null, false, false, false, false, false, null, false, false, false, false, 163260);
                        lxe lxeVar = ((lfo) obj5).h;
                        asai h = qkq.h(new akee(qkf.a(new kdp(((jej) lxeVar.a.b()).a, lxeVar, 6), "TopbarUiData"), new fzs((arpe) null, 5, (boolean[]) null), 10), new akee(qkf.a(((lfo) obj5).g.a(((lfo) obj5).c, jzzVar), "MessageBubbleUiData"), new fzs((arpe) null, 6, (float[]) null), 10), ((lfo) obj5).c, new jdy((arpe) null, 6, (float[]) null));
                        armd.i(e, null);
                        return h;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            armd.i(e, th);
                            throw th2;
                        }
                    }
                }
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            case 11:
                aqil.P(obj);
                ?? r0 = this.b;
                if (r0 != 0) {
                    r0.f((View) this.a, false);
                }
                return arnb.a;
            case 12:
                aqil.P(obj);
                arsb arsbVar = new arsb();
                ((lgo) this.a).g.d(new kjs(this.b, arsbVar, 3));
                jha jhaVar = (jha) arsbVar.a;
                if (jhaVar != null) {
                    g = lgo.a.f();
                } else {
                    g = lgo.a.g();
                }
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 113, "DraftAttachmentUiAdapterImpl.kt")).t("removeAttachment removed: %s", jhaVar);
                if (jhaVar instanceof jgz) {
                    obj2 = ((jgz) jhaVar).a;
                } else if (jhaVar instanceof jgv) {
                    obj2 = ((jgv) jhaVar).a;
                }
                if (obj2 instanceof afcw) {
                    ((alvg) lgo.a.f().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl$removeAttachment$1", "invokeSuspend", 126, "DraftAttachmentUiAdapterImpl.kt")).t("Removing from vCardFlowCache for %s", obj2);
                    ((lgo) this.a).e.remove(((afcw) obj2).b);
                }
                return arnb.a;
            case 13:
                aqil.P(obj);
                ?? r02 = this.b;
                if (r02.length() != 0) {
                    obj4 = r02;
                }
                ((jxv) ((mgu) this.a).c).e(new kju(obj4, 13));
                return arnb.a;
            case 14:
                aqil.P(obj);
                arpe arpeVar2 = ((lko) this.a).b;
                if (arpeVar2 == null) {
                    arro.b("continuation");
                    arpeVar2 = null;
                }
                Object obj6 = this.b;
                arpeVar2.getClass();
                ((lkk) obj6).c = arpeVar2;
                try {
                    arpe arpeVar3 = ((lkk) obj6).c;
                    if (arpeVar3 == null) {
                        arro.b("continuation");
                    } else {
                        arpeVar = arpeVar3;
                    }
                    arpeVar.w(((lkk) this.b).b);
                } catch (Exception unused) {
                    ((alvg) lkk.a.i().h("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState$transitionFrom$1", "invokeSuspend", 36, "CompletedWithResultState.kt")).q("Disregarding exception thrown by resumed continuation");
                }
                return arnb.a;
            case 15:
                aqil.P(obj);
                vno vnoVar3 = (vno) ((Optional) ((apxx) ((lqq) this.a).b).a).get();
                ((Boolean) this.b).booleanValue();
                vnoVar3.h();
                return arnb.a;
            case 16:
                aqil.P(obj);
                Object obj7 = this.b;
                obj7.getClass();
                tim a = tip.a();
                a.w("RestoreWorkflowSettingsService#getRestoreExecutionSync");
                a.c(new lut(obj7, i6));
                tie tieVar = (tie) ((tij) a.b().n()).cO();
                if (tieVar == null) {
                    return null;
                }
                return luz.o(tieVar);
            case 17:
                aqil.P(obj);
                ?? r03 = this.b;
                if (mgl.b.contains(Integer.valueOf(r03.d())) && !r03.cn() && r03.j() == 100 && r03.an().length() > 0) {
                    if (this.b.d() == 3) {
                        y = aqjn.B(new Integer(0), new Integer(1));
                    } else {
                        y = aqjn.y(new Integer(3));
                    }
                    ?? r4 = this.b;
                    Object obj8 = this.a;
                    long n2 = r4.n();
                    Object b = ((mgl) obj8).d.b();
                    b.getClass();
                    long millis = n2 - aoue.l((aozn) b).toMillis();
                    sxy d = MessagesTable.d();
                    d.w("findDuplicateMessageIdAsync");
                    d.g(new lut(this.b, i2));
                    d.g(new lut(this.b, 14));
                    d.g(new mfk(i4));
                    d.g(new lut(y, 15));
                    d.g(new mfk(i));
                    d.g(new lut(this.b, 16));
                    d.g(new lut(this.b, 17));
                    d.g(new ilg(millis, 12));
                    alog t = d.b().t();
                    t.getClass();
                    Object obj9 = this.a;
                    ?? r32 = this.b;
                    alur it = t.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            MessageCoreData q = ((rwd) ((mgl) obj9).c.b()).q(((MessagesTable.BindData) next).A());
                            if (q != null && q.c() == r32.c() && d.F(q.an(), r32.an())) {
                                obj3 = next;
                            }
                        }
                    }
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj3;
                    if (bindData == null) {
                        return Optional.empty();
                    }
                    alvw g3 = mgl.a.g();
                    g3.X(alwp.a, "BugleUsageStatistics");
                    alvg alvgVar = (alvg) g3;
                    alvgVar.X(ydl.b, bindData.A());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker$findDuplicateMessageIdAsync$1", "invokeSuspend", 84, "DuplicateMessageChecker.kt")).q("Found a duplicate message.");
                    return Optional.of(new Long(bindData.x()));
                }
                return Optional.empty();
            case 18:
                aqil.P(obj);
                sxy d2 = MessagesTable.d();
                d2.w("refreshDeliveryStatusFromDb");
                d2.e(new mva(i4));
                d2.g(new mvp(this.a, i5));
                agmq n3 = d2.b().n();
                ?? r33 = this.b;
                try {
                    sxt sxtVar = (sxt) n3;
                    if (sxtVar.moveToNext()) {
                        mix ax = lga.ax(sxtVar.n());
                        synchronized (r33) {
                            for (mum mumVar : r33) {
                                ax.getClass();
                                mumVar.e(ax);
                            }
                        }
                    }
                    armd.i(n3, null);
                    return arnb.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        armd.i(n3, th3);
                        throw th4;
                    }
                }
            case 19:
                aqil.P(obj);
                int i7 = xet.a;
                ?? r04 = this.a;
                d.t(r04.a().equals(miy.b), "Logging file download events supported only for RCS messages.");
                Long j2 = r04.j();
                amgl amglVar = (amgl) amgu.a.createBuilder();
                xqc xqcVar = (xqc) ((lfl) this.b).b;
                long b2 = ((lzz) xqcVar.c.b()).b(r04.d().b());
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar = (amgu) amglVar.b;
                amguVar.b |= 1073741824;
                amguVar.G = b2;
                if (j2 != null) {
                    j = j2.longValue();
                } else {
                    j = 0;
                }
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar2 = (amgu) amglVar.b;
                amguVar2.b |= 128;
                amguVar2.n = j;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar3 = (amgu) amglVar.b;
                amguVar3.g = 3;
                amguVar3.b |= 1;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar4 = (amgu) amglVar.b;
                amguVar4.h = 32;
                amguVar4.b |= 2;
                amxo n4 = ((hgj) xqcVar.d.b()).n();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar5 = (amgu) amglVar.b;
                amguVar5.aa = n4.h;
                amguVar5.c |= 2097152;
                if (true != r04.n()) {
                    i3 = 3;
                }
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar6 = (amgu) amglVar.b;
                amguVar6.S = i3 - 1;
                amguVar6.c |= 16384;
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_MESSAGE;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                amgu amguVar7 = (amgu) amglVar.s();
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amguVar7.getClass();
                amfrVar2.k = amguVar7;
                amfrVar2.b |= 4;
                ((mbb) xqcVar.b.b()).a().b(amfqVar, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                return arnb.a;
            default:
                aqil.P(obj);
                return Boolean.valueOf(((mxa) this.a).j.g(this.b.b()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [lke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, nfw] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new kca((kcc) this.a, (MessageId) this.b, arpeVar, 0);
            case 1:
                return new kca((kcc) this.a, (miz) this.b, arpeVar, 1);
            case 2:
                return new kca((MessageId) this.b, (kcr) this.a, arpeVar, 2);
            case 3:
                return new kca((kdh) this.b, (kde) this.a, arpeVar, 3);
            case 4:
                return new kca((kdh) this.b, (kde) this.a, arpeVar, 4, (byte[]) null);
            case 5:
                return new kca((kdn) this.a, (mxr) this.b, arpeVar, 5);
            case 6:
                return new kca((kdn) this.a, (mxr) this.b, arpeVar, 6, (byte[]) null);
            case 7:
                return new kca((kdn) this.a, (mxr) this.b, arpeVar, 7, (char[]) null);
            case 8:
                return new kca((MessageId) this.b, (ken) this.a, arpeVar, 8);
            case 9:
                return new kca((agxw) this.b, (kpy) this.a, arpeVar, 9);
            case 10:
                return new kca((lfo) this.a, (miz) this.b, arpeVar, 10);
            case 11:
                return new kca((agak) this.b, (View) this.a, arpeVar, 11);
            case 12:
                return new kca((lgo) this.a, (arqr) this.b, arpeVar, 12);
            case 13:
                return new kca((String) this.b, (mgu) this.a, arpeVar, 13);
            case 14:
                return new kca((lkk) this.b, (lke) this.a, arpeVar, 14);
            case 15:
                return new kca((lqq) this.a, this.b, arpeVar, 15);
            case 16:
                return new kca((luz) this.a, (UUID) this.b, arpeVar, 16);
            case 17:
                return new kca((mgl) this.a, (MessageCoreData) this.b, arpeVar, 17);
            case 18:
                return new kca((MessageIdType) this.a, (List) this.b, arpeVar, 18);
            case 19:
                return new kca((lfl) this.b, (miz) this.a, arpeVar, 19);
            default:
                return new kca((mxa) this.a, (nfw) this.b, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(agxw agxwVar, kpy kpyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = agxwVar;
        this.a = kpyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(MessageId messageId, kcr kcrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = messageId;
        this.a = kcrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(MessageId messageId, ken kenVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = messageId;
        this.a = kenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(MessageIdType messageIdType, List list, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = messageIdType;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(String str, mgu mguVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = str;
        this.a = mguVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kcc kccVar, MessageId messageId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = kccVar;
        this.b = messageId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kcc kccVar, miz mizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = kccVar;
        this.b = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kdh kdhVar, kde kdeVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = kdhVar;
        this.a = kdeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kdh kdhVar, kde kdeVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = kdhVar;
        this.a = kdeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kdn kdnVar, mxr mxrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = kdnVar;
        this.b = mxrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kdn kdnVar, mxr mxrVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = kdnVar;
        this.b = mxrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(kdn kdnVar, mxr mxrVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = kdnVar;
        this.b = mxrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(lfl lflVar, miz mizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = lflVar;
        this.a = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(lfo lfoVar, miz mizVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = lfoVar;
        this.b = mizVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(lgo lgoVar, arqr arqrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = lgoVar;
        this.b = arqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(lkk lkkVar, lke lkeVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = lkkVar;
        this.a = lkeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(lqq lqqVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = lqqVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(luz luzVar, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = luzVar;
        this.b = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(mgl mglVar, MessageCoreData messageCoreData, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = mglVar;
        this.b = messageCoreData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(mxa mxaVar, nfw nfwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = mxaVar;
        this.b = nfwVar;
    }
}
