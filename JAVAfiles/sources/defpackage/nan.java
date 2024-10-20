package defpackage;

import android.content.BroadcastReceiver;
import android.net.Uri;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nan implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nan(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v63, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean equals;
        agnw d;
        agnw d2;
        boolean z;
        String str;
        Integer valueOf;
        Integer valueOf2;
        int i = 4;
        int i2 = 1;
        int i3 = 9;
        byte[] bArr = null;
        int i4 = 0;
        switch (this.c) {
            case 0:
                ((nao) this.a).a.a(alzz.aZ(this.b));
                return;
            case 1:
                ((mux) this.a).a.q(this.b);
                return;
            case 2:
                nga ngaVar = (nga) this.b;
                boolean a = ((olx) ngaVar.d.b()).a();
                ?? r2 = this.a;
                if (a) {
                    qei a2 = ((vpk) ngaVar.e.b()).a(ngaVar.f);
                    if (a2 != null) {
                        equals = ((Boolean) r2.e().map(new nfc(a2, i3)).orElse(false)).booleanValue();
                    } else {
                        return;
                    }
                } else {
                    Optional d3 = ngaVar.d();
                    if (d3.isEmpty()) {
                        alwl alwlVar = (alwl) nga.a.i();
                        alwlVar.X(ydl.t, Integer.valueOf(ngaVar.f));
                        alwlVar.X(ydl.L, ngaVar.g);
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "shouldHandleEncryptionUpdateLegacy", 184, "EtouffeeEncryptionStateSupplier.java")).q("SelfIdentity encryption state CANNOT be observed. Missing MSISDN.");
                        equals = false;
                    } else {
                        equals = ((msh) d3.get()).equals(r2);
                    }
                }
                if (equals) {
                    alwl alwlVar2 = (alwl) nga.a.g();
                    alwlVar2.X(ydl.t, Integer.valueOf(ngaVar.f));
                    alwlVar2.X(ydl.L, ngaVar.g);
                    alwlVar2.X(ydl.D, ((qei) r2.e().get()).d);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "notifyUpdate", 196, "EtouffeeEncryptionStateSupplier.java")).q("SelfIdentity encryption state changed.");
                    ngaVar.h.y(new nfz(i4), "EtouffeeEncryptionStateSupplier::Notify");
                    return;
                }
                return;
            case 3:
                alvw f = UncaughtExceptionReceiver.c.f();
                f.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) f).g((Throwable) this.b)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 162, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Finishing UncaughtExceptionReceiver for");
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 4:
                uhl.j(((ngv) this.b).b, (Uri) this.a);
                return;
            case 5:
                String[] strArr = tdv.a;
                int i5 = tdb.a;
                wsx wsxVar = new wsx(null);
                wsxVar.k((String) this.b);
                BusinessInfoProperty businessInfoProperty = (BusinessInfoProperty) this.a;
                wsxVar.m(BusinessInfoData.getPropertyTypeFromLegacyType(businessInfoProperty));
                wsxVar.i(businessInfoProperty.getHeader());
                wsxVar.l(businessInfoProperty.getSubHeader());
                wsxVar.j(businessInfoProperty.getValue());
                tdo h = wsxVar.h();
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                long a3 = agnc.a(d2, "rbm_business_info_properties", h, new tbe(d, 7), new ter(h, i2));
                Long.valueOf(a3).getClass();
                if (a3 >= 0) {
                    return;
                }
                xyo b = prd.a.b();
                b.H("Failed to insert RBM business info property into table.");
                b.z("RBM business verifier info bind data", h);
                b.q();
                throw new prr("Failed to insert RBM business info property into table.", 19);
            case 6:
                ((pth) this.a).b.b.e("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresherBatched", new nau(this.b, 5));
                return;
            case 7:
                qap qapVar = (qap) this.a;
                rwd rwdVar = (rwd) qapVar.a.b();
                ?? r22 = this.b;
                rwdVar.N(r22);
                ((Optional) qapVar.c).ifPresent(new ptf(r22, i3));
                return;
            case 8:
                ((qax) this.a).b.remove(this.b);
                return;
            case 9:
                usk uskVar = (usk) this.a;
                ?? r1 = uskVar.a;
                qdv qdvVar = (qdv) this.b;
                ConversationIdType conversationIdType = qdvVar.b;
                Map map = (Map) r1.get(conversationIdType);
                if (map == null) {
                    return;
                }
                qei qeiVar = qdvVar.a;
                if (map.containsKey(qeiVar) && ((Instant) map.get(qeiVar)).equals(qdvVar.c)) {
                    map.remove(qdvVar.a);
                }
                if (map.isEmpty()) {
                    uskVar.a.remove(conversationIdType);
                }
                uskVar.l(conversationIdType.a());
                return;
            case 10:
                qdu qduVar = new qdu();
                qdv qdvVar2 = (qdv) this.b;
                qduVar.d(qdvVar2.a);
                qduVar.c(qdvVar2.c);
                qduVar.e(ajqk.STOP);
                qduVar.b(qdvVar2.b);
                qdv a4 = qduVar.a();
                Object obj = this.a;
                nan nanVar = new nan(obj, a4, i3);
                usk uskVar2 = (usk) obj;
                ((ahiy) uskVar2.b).q(aktp.ah(nanVar, uskVar2.f), new akgc("typing_status_all_conversations"));
                return;
            case 11:
                qdv qdvVar3 = (qdv) this.b;
                boolean equals2 = ajqk.START.equals(qdvVar3.d);
                Object obj2 = this.a;
                if (equals2) {
                    ConversationIdType conversationIdType2 = qdvVar3.b;
                    usk uskVar3 = (usk) obj2;
                    Map map2 = (Map) uskVar3.a.get(conversationIdType2);
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    map2.put(qdvVar3.a, qdvVar3.c);
                    uskVar3.a.put(conversationIdType2, map2);
                    uskVar3.l(qdvVar3.b.a());
                    return;
                }
                ConversationIdType conversationIdType3 = qdvVar3.b;
                usk uskVar4 = (usk) obj2;
                Map map3 = (Map) uskVar4.a.get(conversationIdType3);
                if (map3 != null) {
                    map3.remove(qdvVar3.a);
                    if (map3.isEmpty()) {
                        uskVar4.a.remove(conversationIdType3);
                    }
                }
                uskVar4.l(conversationIdType3.a());
                return;
            case 12:
                qlf qlfVar = new qlf(new qin(this.b, 4), 3);
                qmu qmuVar = (qmu) this.a;
                qmuVar.b.m(qlfVar);
                Object b2 = qmuVar.e.b();
                b2.getClass();
                if (((Boolean) b2).booleanValue()) {
                    ((uof) ((hmk) qmuVar.d.b()).a.b()).a(upk.a("schedule_delete_and_import_contacts", aozo.a));
                    return;
                } else {
                    qmuVar.g.m();
                    return;
                }
            case 13:
                ?? r0 = this.b;
                r0.getClass();
                qna qnaVar = (qna) this.a;
                if (!((Boolean) qnaVar.f.b()).booleanValue()) {
                    qnaVar.b.m(new qlf(qnc.b, i));
                }
                hmk hmkVar = qnaVar.j;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((uof) hmkVar.a.b()).a(upk.a("batch_contacts_import", (qmo) it.next()));
                }
                return;
            case 14:
                ?? r02 = this.b;
                r02.getClass();
                qlf qlfVar2 = new qlf(qnc.a, 6);
                qnd qndVar = (qnd) this.a;
                qndVar.b.m(qlfVar2);
                if (r02.isEmpty()) {
                    ((hmk) qndVar.f.b()).m();
                    return;
                }
                hmk hmkVar2 = (hmk) qndVar.c.b();
                Iterator it2 = r02.iterator();
                while (it2.hasNext()) {
                    ((uof) hmkVar2.a.b()).a(upk.a("batch_deleted_contacts_sync", (qmr) it2.next()));
                }
                return;
            case 15:
                qot.c((smr) this.a, (xhv) this.b);
                return;
            case 16:
                akrh e = aktp.e("DeleteDatabaseOperations#getSoftDeletedConversations");
                try {
                    xyl.h();
                    snf e2 = sni.e();
                    e2.w("getSoftDeletedConversations");
                    e2.h(new uzd(i3));
                    alog t = e2.b().t();
                    e.close();
                    alur it3 = t.iterator();
                    while (it3.hasNext()) {
                        ?? r12 = this.b;
                        smr smrVar = (smr) it3.next();
                        if (smrVar.r() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        xyl.k(z);
                        qoz qozVar = (qoz) r12.b();
                        qox a5 = qoy.a();
                        a5.f(amfe.CONVERSATION_FROM_BG_STARTUP_TASK);
                        a5.b(smrVar.x());
                        a5.c(smrVar.r());
                        qozVar.a(a5.a());
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 17:
                qoz qozVar2 = (qoz) this.b;
                Object obj3 = this.a;
                akrh e3 = aktp.e("DeleteDatabaseOperations#softDeleteConversation");
                qoy qoyVar = (qoy) obj3;
                long j = qoyVar.b;
                ConversationIdType conversationIdType4 = qoyVar.a;
                try {
                    xyl.h();
                    sng sngVar = new sng();
                    sngVar.l(j);
                    sngVar.e(conversationIdType4);
                    e3.close();
                    ((uhj) qozVar2.b.b()).d(conversationIdType4);
                    qozVar2.b(qoyVar);
                    return;
                } catch (Throwable th3) {
                    try {
                        e3.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 18:
                Object obj4 = this.b;
                Object obj5 = this.a;
                qoy qoyVar2 = (qoy) obj5;
                if (qoyVar2.e) {
                    alvw f2 = qoz.a.f();
                    f2.X(alwp.a, "BugleConversation");
                    alvg alvgVar = (alvg) f2;
                    alvgVar.X(ydl.p, qoyVar2.a);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 66, "ConversationDeleterPwqImpl.java")).q("Queuing conversation with DeleteConversationHandler to be deleted only if its empty (not using soft delete)");
                    ((qoz) obj4).b(qoyVar2);
                    return;
                }
                alvw f3 = qoz.a.f();
                f3.X(alwp.a, "BugleConversation");
                alvg alvgVar2 = (alvg) f3;
                alvgVar2.X(ydl.p, qoyVar2.a);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 74, "ConversationDeleterPwqImpl.java")).q("Soft deleting conversation and queuing with DeleteConversationHandler to be deleted");
                ((agnq) ((qoz) obj4).c.b()).e("ConversationDeleterPwqImpl.deleteConversation", new nan(obj4, obj5, 17, bArr));
                return;
            case 19:
                int i6 = 0;
                while (true) {
                    ?? r13 = this.b;
                    if (i6 < ((alsx) r13).c) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) r13.get(i6);
                        String[] strArr2 = tkr.a;
                        aglz[] au = bindData.au("self_participants", new tkh[0]);
                        au.getClass();
                        tkh tkhVar = (tkh) aqil.m(au);
                        if (tkhVar != null) {
                            str = tkhVar.l();
                        } else {
                            str = null;
                        }
                        qwe g = ((qwk) this.a).a.g(bindData.p(), str, null);
                        tbb f4 = ParticipantsTable.f();
                        valueOf = Integer.valueOf(a.bp().c());
                        int intValue = valueOf.intValue();
                        valueOf2 = Integer.valueOf(a.bp().c());
                        if (valueOf2.intValue() >= 59930 && intValue >= 59930) {
                            f4.a.put("my_identity_token", riw.n(g));
                        }
                        f4.d(bindData.M());
                        i6++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                qyj qyjVar = (qyj) this.a;
                qyjVar.b((ConversationIdType) this.b);
                uac uacVar = (uac) qyjVar.a.b();
                akrh e4 = aktp.e("BugleDbOperationsCached::populateExistingConversation");
                try {
                    e4.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        e4.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
    }

    public /* synthetic */ nan(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
