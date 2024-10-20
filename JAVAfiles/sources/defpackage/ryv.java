package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ryv implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ryv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [agnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v116, types: [uji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v118, types: [uji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v120, types: [uji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v10, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        agnw d;
        agnw d2;
        String a;
        int i;
        qei qeiVar = null;
        byte b = 0;
        switch (this.c) {
            case 0:
                ryx ryxVar = (ryx) this.a;
                ?? r2 = this.b;
                akrh e = aktp.e("LinkPreviewDatabaseOperations#incrementParticipantManualLinkPreviewCount");
                try {
                    xyl.h();
                    if (!TextUtils.isEmpty(r2)) {
                        long parseLong = Long.parseLong((String) r2);
                        ssf ssfVar = new ssf();
                        ssfVar.aa("manual_link_preview_count", agkx.h(uie.e((String) r2)));
                        ssg ssgVar = new ssg();
                        ssgVar.b(parseLong);
                        if (!ssfVar.ae(new agpw(ssgVar), "link_preview_participants_table-buildAndUpdateForParticipantId")) {
                            int i2 = srr.a;
                            tgd tgdVar = new tgd(null);
                            tgdVar.c(parseLong);
                            tgdVar.b(1L);
                            ssa a2 = tgdVar.a();
                            d = agnc.d("$primary");
                            d2 = agnc.d("$primary");
                            agnc.a(d2, "link_preview_participants_table", a2, new spl(d, 5), new smq(a2, 5));
                        }
                    }
                    e.close();
                    if (((Boolean) utw.w.e()).booleanValue() && !((Boolean) lec.c.e()).booleanValue()) {
                        ryxVar.h.c("Bugle.Share.WebLinkPreview.ManualPreviewButtonClick");
                    }
                    if (uie.h((String) r2) == ((Integer) utw.x.e()).intValue() && ((Boolean) utw.w.e()).booleanValue() && !((Boolean) lec.c.e()).booleanValue()) {
                        ryxVar.h.c("Bugle.Share.WebLinkPreview.ManualPreviewThresholdReached");
                        return;
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
            case 1:
                Toast.makeText(((rys) this.a).a, (CharSequence) this.b, 1).show();
                return;
            case 2:
                aozy createBuilder = umo.a.createBuilder();
                String a3 = ((MessageIdType) this.a).a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                umo umoVar = (umo) apagVar;
                a3.getClass();
                umoVar.b |= 1;
                umoVar.c = a3;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                umo umoVar2 = (umo) createBuilder.b;
                Object obj = this.b;
                umoVar2.d = 1;
                umoVar2.b = 2 | umoVar2.b;
                ((uof) ((rzc) obj).a.a.b()).a(upk.a("request_link_preview", (umo) createBuilder.s()));
                return;
            case 3:
                ((tsp) this.b).j((ConversationIdType) this.a, uax.DOWNGRADE_REMOTE_REGISTRATION_MISSING_E2EE);
                return;
            case 4:
                ((tsp) this.b).j((ConversationIdType) this.a, uax.DOWNGRADE_GROUP_NOT_ALL_MEMBERS_VALID_ID);
                return;
            case 5:
                ttj ttjVar = (ttj) this.a;
                if (((okg) ttjVar.p.b()).a()) {
                    qeiVar = ((psq) ttjVar.r.b()).c((String) this.b);
                }
                alog c = ((tsa) ttjVar.i.b()).c(((Integer) ttd.D.e()).intValue());
                xyo c2 = ttj.a.c();
                c2.H("E2EE provisioned. Restoring E2EE state in previously-E2EE conversations");
                c2.z("conversations", c);
                c2.q();
                int i3 = ((alsx) c).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ConversationIdType conversationIdType = (ConversationIdType) c.get(i4);
                    aozy createBuilder2 = tss.a.createBuilder();
                    String a4 = conversationIdType.a();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    tss tssVar = (tss) createBuilder2.b;
                    a4.getClass();
                    tssVar.b = a4;
                    if (((okg) ttjVar.p.b()).a()) {
                        qeiVar.getClass();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        tss tssVar2 = (tss) createBuilder2.b;
                        tssVar2.a();
                        tssVar2.c.add(qeiVar);
                        a = conversationIdType.a() + "#" + qeiVar.hashCode();
                    } else {
                        a = conversationIdType.a();
                    }
                    ((uof) ((iew) ttjVar.k.b()).a.b()).a(upk.b("update_conversation_encryption_status", (tss) createBuilder2.s(), new uta(null, a, null, null, null, null)));
                }
                return;
            case 6:
                Object obj2 = this.a;
                Object obj3 = this.b;
                akrh e2 = aktp.e("ScytaleEventPublisher::onScytaleEvent");
                try {
                    aozy createBuilder3 = amia.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar2 = createBuilder3.b;
                    amia amiaVar = (amia) apagVar2;
                    obj3.getClass();
                    amiaVar.d = (ScytaleLoggingProto$ScytaleEvent) obj3;
                    amiaVar.b = 2 | amiaVar.b;
                    int i5 = xyp.a;
                    if (!apagVar2.isMutable()) {
                        createBuilder3.u();
                    }
                    amia amiaVar2 = (amia) createBuilder3.b;
                    int i6 = i5 - 1;
                    if (i5 != 0) {
                        amiaVar2.e = i6;
                        amiaVar2.b |= 4;
                        if (((twa) obj2).b.isPresent()) {
                            Object obj4 = ((twa) obj2).b.get();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            amia amiaVar3 = (amia) createBuilder3.b;
                            amiaVar3.c = ((amhz) obj4).i;
                            amiaVar3.b |= 1;
                        }
                        amfq amfqVar = (amfq) amfr.a.createBuilder();
                        amfp amfpVar = amfp.BUGLE_SCYTALE_EVENT;
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar = (amfr) amfqVar.b;
                        amfrVar.i = amfpVar.dg;
                        amfrVar.b |= 1;
                        amia amiaVar4 = (amia) createBuilder3.s();
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar2 = (amfr) amfqVar.b;
                        amiaVar4.getClass();
                        amfrVar2.M = amiaVar4;
                        amfrVar2.c |= 8192;
                        ((maq) ((twa) obj2).a.b()).j(amfqVar);
                        e2.close();
                        return;
                    }
                    throw null;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 7:
                Object obj5 = this.a;
                Object obj6 = this.b;
                if (tte.h()) {
                    tyk tykVar = (tyk) obj6;
                    MessageIdType messageIdType = (MessageIdType) obj5;
                    Optional e3 = tykVar.c.e(messageIdType);
                    if (e3.isPresent()) {
                        MessageIdType messageIdType2 = (MessageIdType) e3.get();
                        boolean j = ((xot) tykVar.e.b()).j(messageIdType);
                        xyo a5 = tyk.a.a();
                        a5.H("Resending as non-etouffee message");
                        a5.c(messageIdType);
                        a5.z("messageIdToResend", messageIdType2);
                        a5.A("Chat API file upload response deleted?", j);
                        a5.q();
                        tykVar.d.a(messageIdType2, new MessageUsageStatisticsDataImpl());
                        return;
                    }
                    xyo e4 = tyk.a.e();
                    e4.H("Failed to prepare the message, skip resending");
                    e4.c(messageIdType);
                    e4.q();
                    return;
                }
                tyk tykVar2 = (tyk) obj6;
                MessageIdType messageIdType3 = (MessageIdType) obj5;
                if (tykVar2.c.l(messageIdType3)) {
                    boolean j2 = ((xot) tykVar2.e.b()).j(messageIdType3);
                    xyo a6 = tyk.a.a();
                    a6.H("Resending as non-etouffee message");
                    a6.z("messageId", obj5);
                    a6.A("Chat API file upload response deleted?", j2);
                    a6.q();
                    tykVar2.d.a(messageIdType3, new MessageUsageStatisticsDataImpl());
                    return;
                }
                xyo c3 = tyk.a.c();
                c3.H("Failed to update etouffee status, skip resending");
                c3.z("messageId", obj5);
                c3.q();
                return;
            case 8:
                tzc tzcVar = (tzc) this.b;
                uie uieVar = (uie) tzcVar.g.b();
                ConversationIdType conversationIdType2 = (ConversationIdType) this.a;
                rto m = uieVar.m(conversationIdType2);
                if (m != null) {
                    if (true != m.E()) {
                        i = 30;
                    } else {
                        i = 40;
                    }
                    ((tzj) tzcVar.d.b()).a(conversationIdType2, i);
                    return;
                }
                return;
            case 9:
                tzn tznVar = (tzn) this.b;
                uac uacVar = (uac) tznVar.d.b();
                ?? r3 = this.a;
                rto z = uacVar.z(r3.z());
                if (z != null && z.S() && z.G() == 2) {
                    ((tzr) tznVar.j.b()).a(3);
                    tzc tzcVar2 = (tzc) tznVar.h.b();
                    tzc.a.l("Invoking updateTombstonesBeforeResend");
                    ((tzp) tzcVar2.e.b()).b(r3);
                    return;
                }
                ((tzr) tznVar.j.b()).b(3);
                tznVar.e(r3);
                return;
            case 10:
                tzn tznVar2 = (tzn) this.b;
                uac uacVar2 = (uac) tznVar2.d.b();
                ?? r32 = this.a;
                rto z2 = uacVar2.z(r32.z());
                if (z2 != null && z2.S() && z2.G() == 2) {
                    ((tzr) tznVar2.j.b()).a(2);
                    tzc tzcVar3 = (tzc) tznVar2.h.b();
                    r32.getClass();
                    tzc.a.l("Invoking updateTombstonesBeforeDelete");
                    ((tzp) tzcVar3.e.b()).b(r32);
                    return;
                }
                ((tzr) tznVar2.j.b()).b(2);
                tznVar2.e(r32);
                return;
            case 11:
                ((uci) this.a).k().execSQL((String) this.b);
                return;
            case 12:
                ((ueb) this.b).C((Bundle) this.a);
                return;
            case 13:
                uhl.j(((uis) this.b).b, (Uri) this.a);
                return;
            case 14:
                uhl.j(((uis) this.b).b, (Uri) this.a);
                return;
            case 15:
                try {
                    this.b.a(((Uri) this.a).toString());
                    return;
                } catch (RuntimeException e5) {
                    ujd.a.r("Error while calling #onCancel", e5);
                    return;
                }
            case 16:
                try {
                    this.b.b(((Uri) this.a).toString());
                    return;
                } catch (RuntimeException e6) {
                    ujd.a.r("Error while calling #onFailure", e6);
                    return;
                }
            case 17:
                try {
                    this.b.d(((Uri) this.a).toString());
                    return;
                } catch (RuntimeException e7) {
                    ujd.a.r("Error while calling #onStart", e7);
                    return;
                }
            case 18:
                xyo c4 = ujh.a.c();
                c4.H("Updating media part with local");
                Object obj7 = this.a;
                c4.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, obj7);
                c4.q();
                Object obj8 = this.b;
                ((ujh) obj8).b.e("UpdateMessagePartUri", new ryv(obj8, obj7, 19, b == true ? 1 : 0));
                return;
            case 19:
                ujh ujhVar = (ujh) this.b;
                rxc rxcVar = (rxc) ujhVar.f.b();
                Object obj9 = this.a;
                ConversationIdType conversationIdType3 = ujhVar.c;
                MessageIdType messageIdType4 = ujhVar.d;
                String str = ujhVar.e;
                akrh e8 = aktp.e("MessagePartDatabaseOperations#updateMessagePartContentUri");
                try {
                    xyl.h();
                    tbt tbtVar = new tbt();
                    tbtVar.aj("updateMessagePartContentUri");
                    tbtVar.s((Uri) obj9);
                    rxcVar.e(conversationIdType3, messageIdType4, str, tbtVar);
                    e8.close();
                    return;
                } finally {
                    try {
                        e8.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }
            default:
                ?? r0 = this.a;
                ?? r1 = this.b;
                akrh a7 = r0.a();
                try {
                    r1.run();
                    a7.close();
                    return;
                } catch (Throwable th5) {
                    try {
                        a7.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
    }

    public /* synthetic */ ryv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
