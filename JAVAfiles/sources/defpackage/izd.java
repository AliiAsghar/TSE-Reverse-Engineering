package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class izd implements ancu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ izd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v45, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [tra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r4v37, types: [ancu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancu
    public final andc a(ahmn ahmnVar) {
        akul i;
        Object apply;
        akul c;
        akul c2;
        akul ag;
        akul c3;
        int i2 = 16;
        int i3 = 4;
        int i4 = 6;
        int i5 = 10;
        int i6 = 9;
        byte[] bArr = null;
        int i7 = 1;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                ize izeVar = (ize) obj2;
                akul ai = aktp.ai(new haw(obj2, obj, i5), izeVar.b);
                akul h = izeVar.e.a((String) obj).h(new ijq(obj2, obj, i4), izeVar.b);
                return new andc(aktp.ap(ai, h).h(new haw(ai, h, i6), andi.a));
            case 1:
                Object obj3 = this.a;
                akrh e = aktp.e("DraftDataService#getDraftData");
                try {
                    MessageCoreData messageCoreData = (MessageCoreData) ((imk) obj3).n.getAndSet(null);
                    iml imlVar = (iml) ((imk) obj3).m.getAndSet(iml.a);
                    final imk imkVar = (imk) obj3;
                    akul ai2 = aktp.ai(new Callable() { // from class: img
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Set, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v3, types: [imd] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Integer valueOf;
                            String[] strArr;
                            Object apply2;
                            akrh e2 = aktp.e("DraftDataService#queryDraft");
                            imk imkVar2 = imk.this;
                            ConversationIdType conversationIdType = imkVar2.l;
                            try {
                                iew iewVar = imkVar2.p;
                                valueOf = Integer.valueOf(d.P().W().c());
                                if (valueOf.intValue() == Integer.MAX_VALUE) {
                                    strArr = sbx.a;
                                } else {
                                    alob alobVar = new alob();
                                    alobVar.h("messages._id");
                                    alobVar.h("messages.conversation_id");
                                    alobVar.h("messages.sender_id");
                                    if (valueOf.intValue() >= 54040) {
                                        alobVar.h("messages.sender_send_destination");
                                    }
                                    if (valueOf.intValue() >= 59340) {
                                        alobVar.h("messages.msisdn_receiving_rcs_message");
                                    }
                                    if (valueOf.intValue() >= 54040) {
                                        alobVar.h("messages.receiving_network_country");
                                    }
                                    alobVar.h("messages.sent_timestamp");
                                    if (valueOf.intValue() >= 17030) {
                                        alobVar.h("messages.queue_insert_timestamp");
                                    }
                                    alobVar.h("messages.received_timestamp");
                                    alobVar.h("messages.message_protocol");
                                    alobVar.h("messages.message_status");
                                    if (valueOf.intValue() >= 13020) {
                                        alobVar.h("messages.message_report_status");
                                    }
                                    alobVar.h("messages.seen");
                                    alobVar.h("messages.read");
                                    alobVar.h("messages.sms_message_uri");
                                    alobVar.h("messages.sms_priority");
                                    alobVar.h("messages.sms_message_size");
                                    alobVar.h("messages.mms_subject");
                                    alobVar.h("messages.mms_transaction_id");
                                    alobVar.h("messages.mms_content_location");
                                    alobVar.h("messages.mms_expiry");
                                    if (valueOf.intValue() >= 59890) {
                                        alobVar.h("messages.rcs_expiry");
                                    }
                                    if (valueOf.intValue() >= 9030) {
                                        alobVar.h("messages.mms_retrieve_text");
                                    }
                                    alobVar.h("messages.raw_status");
                                    alobVar.h("messages.self_id");
                                    if (valueOf.intValue() >= 60160) {
                                        alobVar.h("messages.my_identity_foreign_key");
                                    }
                                    alobVar.h("messages.retry_start_timestamp");
                                    if (valueOf.intValue() >= 8500) {
                                        alobVar.h("messages.cloud_sync_id");
                                    }
                                    if (valueOf.intValue() >= 41040) {
                                        alobVar.h("messages.rcs_message_id_with_text_type");
                                    }
                                    if (valueOf.intValue() >= 29060) {
                                        alobVar.h("messages.etouffee_status");
                                    }
                                    if (valueOf.intValue() >= 29090) {
                                        alobVar.h("messages.verification_status");
                                    }
                                    if (valueOf.intValue() >= 39000) {
                                        alobVar.h("messages.rcs_ui_status");
                                    }
                                    if (valueOf.intValue() >= 30010) {
                                        alobVar.h("messages.is_hidden");
                                    }
                                    if (valueOf.intValue() >= 10002) {
                                        alobVar.h("messages.rcs_remote_instance");
                                    }
                                    if (valueOf.intValue() >= 10004) {
                                        alobVar.h("messages.rcs_file_transfer_session_id");
                                    }
                                    if (valueOf.intValue() >= 9000) {
                                        alobVar.h("messages.sms_error_code");
                                    }
                                    if (valueOf.intValue() >= 9000) {
                                        alobVar.h("messages.sms_error_desc_map_name");
                                    }
                                    if (valueOf.intValue() >= 9010) {
                                        alobVar.h("messages.correlation_id");
                                    }
                                    if (valueOf.intValue() >= 31010) {
                                        alobVar.h("messages.cms_id");
                                    }
                                    if (valueOf.intValue() >= 37040) {
                                        alobVar.h("messages.cms_last_mod_seq");
                                    }
                                    if (valueOf.intValue() >= 19020) {
                                        alobVar.h("messages.web_id");
                                    }
                                    if (valueOf.intValue() >= 29100) {
                                        alobVar.h("messages.usage_stats_logging_id");
                                    }
                                    if (valueOf.intValue() >= 35030) {
                                        alobVar.h("messages.send_counter");
                                    }
                                    if (valueOf.intValue() >= 35030) {
                                        alobVar.h("messages.original_rcs_message_id");
                                    }
                                    if (valueOf.intValue() >= 37020) {
                                        alobVar.h("messages.custom_delivery_receipt_mime_type");
                                    }
                                    if (valueOf.intValue() >= 37020) {
                                        alobVar.h("messages.custom_delivery_receipt_content");
                                    }
                                    if (valueOf.intValue() >= 37030) {
                                        alobVar.h("messages.report_attempt_acounter");
                                    }
                                    if (valueOf.intValue() >= 45020) {
                                        alobVar.h("messages.custom_headers");
                                    }
                                    if (valueOf.intValue() >= 46010) {
                                        alobVar.h("messages.cms_correlation_id");
                                    }
                                    if (valueOf.intValue() >= 48030) {
                                        alobVar.h("messages.group_private_participant");
                                    }
                                    if (valueOf.intValue() >= 48030) {
                                        alobVar.h("messages.original_message_id");
                                    }
                                    if (valueOf.intValue() >= 49060) {
                                        alobVar.h("messages.awaiting_reverse_sync");
                                    }
                                    if (valueOf.intValue() >= 49060) {
                                        alobVar.h("messages.old_sms_message_uri");
                                    }
                                    if (valueOf.intValue() >= 56000) {
                                        alobVar.h("messages.draft_id");
                                    }
                                    if (valueOf.intValue() >= 58040) {
                                        alobVar.h("messages.result_code");
                                    }
                                    if (valueOf.intValue() >= 58210) {
                                        alobVar.h("messages.cms_life_cycle");
                                    }
                                    if (valueOf.intValue() >= 58710) {
                                        alobVar.h("messages.fallback_reason");
                                    }
                                    if (valueOf.intValue() >= 58230) {
                                        alobVar.h("messages.auto_retry_counter");
                                    }
                                    if (valueOf.intValue() >= 58280) {
                                        alobVar.h("messages.can_revoke_before_delivered_with_rcs");
                                    }
                                    if (valueOf.intValue() >= 58680) {
                                        alobVar.h("messages.trace_id");
                                    }
                                    if (valueOf.intValue() >= 58720) {
                                        alobVar.h("messages.outgoing_delivery_report_status");
                                    }
                                    if (valueOf.intValue() >= 58720) {
                                        alobVar.h("messages.outgoing_read_report_status");
                                    }
                                    if (valueOf.intValue() >= 59310) {
                                        alobVar.h("messages.xms_transport");
                                    }
                                    if (valueOf.intValue() >= 59430) {
                                        alobVar.h("messages.message_original_protocol");
                                    }
                                    if (valueOf.intValue() >= 59490) {
                                        alobVar.h("messages.satellite_datagram_id");
                                    }
                                    if (valueOf.intValue() >= 60190) {
                                        alobVar.h("messages.encryption_protocol");
                                    }
                                    if (valueOf.intValue() >= 60370) {
                                        alobVar.h("messages.message_persistence_id");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.message_id_message_replies");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view._id_messages");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.received_timestamp_messages");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view._id_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.sub_id_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.normalized_destination_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.display_destination_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.full_name_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.first_name_participants");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view._id_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.text_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.uri_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.content_type_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.file_name_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.duration_parts");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.trigger_url_link_preview");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.expiration_time_millis_link_preview");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.link_title_link_preview");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.link_image_url_link_preview");
                                    }
                                    if (valueOf.intValue() >= 0) {
                                        alobVar.h("message_replies_view.link_preview_failed_link_preview");
                                    }
                                    strArr = (String[]) alobVar.g().toArray(new String[0]);
                                }
                                sbv sbvVar = new sbv(strArr);
                                sbvVar.w("queryDraftForConversation1");
                                apply2 = new ijs(conversationIdType, 14).apply(new sbw());
                                sbvVar.k(new agpw((sbw) apply2));
                                if (iewVar.a.contains(sev.a)) {
                                    sbvVar.o("REPLIES_VIEW_JOIN", sby.a);
                                } else {
                                    sbvVar.o("REPLIES_VIEW_JOIN", "0");
                                    sbvVar.q();
                                }
                                sbt sbtVar = (sbt) ((lbz) sbvVar.b().n()).cO();
                                lth lthVar = null;
                                if (sbtVar != null) {
                                    sdj sdjVar = sbtVar.a;
                                    if (true == sdjVar.f().b()) {
                                        sdjVar = null;
                                    }
                                    if (sdjVar != null) {
                                        lthVar = lti.a(sdjVar);
                                    }
                                    MessagesTable.BindData bindData = sbtVar.b;
                                    bindData.getClass();
                                    lthVar = new imd(bindData, lthVar);
                                }
                                e2.close();
                                return Optional.ofNullable(lthVar);
                            } catch (Throwable th) {
                                try {
                                    e2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, ((imk) obj3).g);
                    akul ai3 = aktp.ai(new gvk(obj3, i5), ((imk) obj3).g);
                    akul i8 = aktp.ap(ai2, ai3).i(new tvp((imk) obj3, ai2, ai3, messageCoreData, imlVar, 1), ((imk) obj3).f);
                    if (((Boolean) vof.a.e()).booleanValue() && this.b != null) {
                        i8 = i8.i(new ici(obj3, 13), ((imk) obj3).f);
                    }
                    akul akulVar = i8;
                    if (messageCoreData != null && !imlVar.equals(iml.c)) {
                        ((alwl) imk.a.m().h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "getDraftData", 252, "DraftDataService.java")).q("Skipping extractRepliedToData because incomingDraft is present");
                        i = aktp.ag(Optional.empty());
                        akul akulVar2 = i;
                        akul h2 = aktp.ap(akulVar, ai3, akulVar2).h(new imh(akulVar, ai3, (Object) akulVar2, (Object) imlVar, 0), ((imk) obj3).f);
                        e.b(h2);
                        e.close();
                        return new andc(h2);
                    }
                    i = ai2.i(new ikd(obj3, messageCoreData, i3), ((imk) obj3).f);
                    akul akulVar22 = i;
                    akul h22 = aktp.ap(akulVar, ai3, akulVar22).h(new imh(akulVar, ai3, (Object) akulVar22, (Object) imlVar, 0), ((imk) obj3).f);
                    e.b(h22);
                    e.close();
                    return new andc(h22);
                } finally {
                }
            case 2:
                kkc kkcVar = (kkc) ((kor) this.a).b;
                ((alwl) ((alwm) kkcVar.b).n().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/util/AdvancedFeedbackScreenshotHelper", "getScreenshot", 65, "AdvancedFeedbackScreenshotHelper.java")).q("Getting screenshot from temp file");
                return new andc(aktp.ai(new kva(this.b, i7), kkcVar.a));
            case 3:
                return new andc(((lqx) this.b).a(((kws) this.a).g.get()));
            case 4:
                return new andc(((qxr) this.a).l((ConversationIdType) this.b));
            case 5:
                final Object obj4 = this.b;
                final qya qyaVar = (qya) this.a;
                ahmnVar.x(new AutoCloseable() { // from class: qjg
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        qya qyaVar2 = qya.this;
                        Object obj5 = qyaVar2.d;
                        Object obj6 = obj4;
                        synchronized (obj5) {
                            ((HashMap) qyaVar2.c).remove(obj6);
                        }
                    }
                }, qyaVar.b);
                apply = qyaVar.a.apply(obj4);
                return akuk.a((ListenableFuture) apply).a;
            case 6:
                return new andc(this.a.a(this.b));
            case 7:
                ?? r2 = this.b;
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((vby) obj5).s = (akul) r2;
                }
                ahmnVar.x(new ucz(obj5, 9, null), ((vby) obj5).o);
                return akuk.a(r2).a;
            case 8:
                Object obj6 = this.a;
                vgk vgkVar = (vgk) obj6;
                Object obj7 = vgkVar.b;
                ?? r5 = this.b;
                synchronized (obj7) {
                    ((vgk) obj6).g = (akul) r5;
                }
                ahmnVar.x(new vgj(vgkVar, (akul) r5, 0), vgkVar.c);
                return akuk.a(r5).a;
            case 9:
                return new andc(((wgd) this.a).c((String) this.b).h(new wax(i2), andi.a));
            case 10:
                Object obj8 = this.a;
                aair aairVar = (aair) this.b;
                c = qjh.c(aairVar.d, arpj.a, arwf.a, new zez(aairVar, (ConversationIdType) obj8, (arpe) null, 0));
                return new andc(c);
            case 11:
                Object obj9 = this.a;
                aair aairVar2 = (aair) this.b;
                c2 = qjh.c(aairVar2.d, arpj.a, arwf.a, new zez(aairVar2, (ConversationIdType) obj9, (arpe) null, 2, (byte[]) null));
                return new andc(c2);
            case 12:
                Object obj10 = this.b;
                zug zugVar = (zug) obj10;
                tay tayVar = zugVar.j;
                scm scmVar = zugVar.k;
                akul ai4 = aktp.ai(new yxs(obj10, tayVar, 12), zugVar.e);
                akul ai5 = aktp.ai(new ytr(scmVar, i4), zugVar.e);
                akul ai6 = aktp.ai(new yxs(obj10, this.a, 11), zugVar.e);
                akul ag2 = aktp.ag(false);
                if (((Boolean) zugVar.g.b()).booleanValue()) {
                    ag = ai4.h(new zet(obj10, i6), zugVar.e);
                } else {
                    ag = aktp.ag(null);
                }
                akul akulVar3 = ag;
                return new andc(aktp.an(ai4, ai5, ai6, ag2, akulVar3).h(new kwr(obj10, ai4, ai5, ai6, akulVar3, 7), andi.a));
            case 13:
                Object obj11 = this.a;
                aair aairVar3 = (aair) this.b;
                c3 = qjh.c(aairVar3.f, arpj.a, arwf.a, new yhj(aairVar3, (ConversationIdType) obj11, (arpe) null, 14));
                return new andc(c3);
            case 14:
                Object obj12 = this.b;
                zvq zvqVar = (zvq) obj12;
                sxx sxxVar = zvqVar.b;
                akul ai7 = aktp.ai(new yxs(obj12, this.a, i2), zvqVar.a);
                akul ai8 = aktp.ai(new ytr(sxxVar, 7), zvqVar.a);
                return new andc(aktp.an(ai8, ai7).h(new xqt(ai7, ai8, (Object) sxxVar, 8), zvqVar.a));
            case 15:
                Object obj13 = this.b;
                zwb zwbVar = (zwb) obj13;
                return new andc(aktp.ai(new yxs(obj13, zwbVar.c, 17), zwbVar.b).i(new yui(obj13, this.a, i3, bArr), andi.a));
            case 16:
                Object obj14 = this.b;
                zwt zwtVar = (zwt) obj14;
                akul ai9 = aktp.ai(new ytr(obj14, i6), zwtVar.d);
                akul ai10 = aktp.ai(new ytr(obj14, i5), zwtVar.d);
                return new andc(aktp.an(ai9, ai10).i(new mtz(obj14, this.a, ai9, ai10, 7, null), zwtVar.d));
            case 17:
                return new andc(aktp.Y(((ahiy) this.b).C((ajwt) this.a), new ajwz(i4), andi.a));
            default:
                ?? r22 = this.a;
                long j = akto.a;
                ahmnVar.getClass();
                akru b = akqj.b();
                akry h3 = akqj.h(b, r22);
                try {
                    return this.b.a(ahmnVar);
                } catch (Throwable th) {
                    try {
                        akqd.b(th);
                        throw th;
                    } finally {
                        akqj.h(b, h3);
                    }
                }
        }
    }

    public /* synthetic */ izd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
