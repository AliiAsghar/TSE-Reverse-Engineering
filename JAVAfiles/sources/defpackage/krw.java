package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.lang.reflect.Proxy;
import java.security.Security;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krw implements apya {
    public final krv a;
    private final int b;

    public krw(krv krvVar, int i) {
        this.a = krvVar;
        this.b = i;
    }

    private final Object a() {
        apya apyaVar;
        apya apyaVar2;
        apya apyaVar3;
        apya apyaVar4;
        apya apyaVar5;
        apya apyaVar6;
        krx krxVar;
        apya apyaVar7;
        krx krxVar2;
        apya apyaVar8;
        krx krxVar3;
        apya apyaVar9;
        krx krxVar4;
        nwg jf;
        krx krxVar5;
        apya apyaVar10;
        krx krxVar6;
        apya apyaVar11;
        apya apyaVar12;
        krx krxVar7;
        krx krxVar8;
        krx krxVar9;
        apya apyaVar13;
        krx krxVar10;
        apya apyaVar14;
        final apya apyaVar15;
        final apya apyaVar16;
        final apya apyaVar17;
        apya apyaVar18;
        apya apyaVar19;
        krx krxVar11;
        apya apyaVar20;
        apya apyaVar21;
        krx krxVar12;
        apya apyaVar22;
        krx krxVar13;
        long jd;
        apya apyaVar23;
        krx krxVar14;
        final apya apyaVar24;
        krx krxVar15;
        final agrk QQ;
        krx krxVar16;
        krx krxVar17;
        krx krxVar18;
        krx krxVar19;
        apya apyaVar25;
        ahlp Rh;
        apya apyaVar26;
        apya apyaVar27;
        krx krxVar20;
        apya apyaVar28;
        krx krxVar21;
        apya apyaVar29;
        krx krxVar22;
        apya apyaVar30;
        apya apyaVar31;
        agrk QQ2;
        krx krxVar23;
        Map o;
        krx krxVar24;
        Map l;
        apya apyaVar32;
        apya apyaVar33;
        apya apyaVar34;
        apya apyaVar35;
        ajzg hz;
        apya apyaVar36;
        apya apyaVar37;
        apya apyaVar38;
        krx krxVar25;
        Map Le;
        apya apyaVar39;
        apya apyaVar40;
        Map Le2;
        apya apyaVar41;
        apya apyaVar42;
        krx krxVar26;
        apya apyaVar43;
        apya apyaVar44;
        apya apyaVar45;
        apya apyaVar46;
        krx krxVar27;
        apya apyaVar47;
        apya apyaVar48;
        agrk QQ3;
        apya apyaVar49;
        apya apyaVar50;
        int x;
        krx krxVar28;
        Map o2;
        krx krxVar29;
        Map l2;
        krx krxVar30;
        apya apyaVar51;
        apya apyaVar52;
        agcp Rn;
        apya apyaVar53;
        krx krxVar31;
        apya apyaVar54;
        krx krxVar32;
        apya apyaVar55;
        krx krxVar33;
        apya apyaVar56;
        krx krxVar34;
        apya apyaVar57;
        apya apyaVar58;
        apya apyaVar59;
        apya apyaVar60;
        krx krxVar35;
        apya apyaVar61;
        krx krxVar36;
        apya apyaVar62;
        String UY;
        krx krxVar37;
        apya apyaVar63;
        apya apyaVar64;
        krx krxVar38;
        apya apyaVar65;
        apya apyaVar66;
        apya apyaVar67;
        krx krxVar39;
        apya apyaVar68;
        krx krxVar40;
        apya apyaVar69;
        apya apyaVar70;
        apya apyaVar71;
        Object Kw;
        apya apyaVar72;
        apya apyaVar73;
        apya apyaVar74;
        apya apyaVar75;
        apya apyaVar76;
        apya apyaVar77;
        apya apyaVar78;
        krx krxVar41;
        apya apyaVar79;
        krx krxVar42;
        apya apyaVar80;
        krx krxVar43;
        apya apyaVar81;
        krx krxVar44;
        apya apyaVar82;
        krx krxVar45;
        apya apyaVar83;
        apya apyaVar84;
        apya apyaVar85;
        apya apyaVar86;
        krx krxVar46;
        apya apyaVar87;
        apya apyaVar88;
        apya apyaVar89;
        apya apyaVar90;
        apya apyaVar91;
        apya apyaVar92;
        apya apyaVar93;
        apya apyaVar94;
        apya apyaVar95;
        apya apyaVar96;
        apya apyaVar97;
        apya apyaVar98;
        krx krxVar47;
        apya apyaVar99;
        apya apyaVar100;
        aojh RJ;
        apya apyaVar101;
        apya apyaVar102;
        apya apyaVar103;
        apya apyaVar104;
        krx krxVar48;
        krx krxVar49;
        apya apyaVar105;
        apya apyaVar106;
        apya apyaVar107;
        apya apyaVar108;
        apya apyaVar109;
        apya apyaVar110;
        apya apyaVar111;
        apya apyaVar112;
        krx krxVar50;
        apya apyaVar113;
        krx krxVar51;
        apya apyaVar114;
        apya apyaVar115;
        apya apyaVar116;
        apya apyaVar117;
        apya apyaVar118;
        apya apyaVar119;
        apya apyaVar120;
        apya apyaVar121;
        apya apyaVar122;
        apya apyaVar123;
        krx krxVar52;
        apya apyaVar124;
        krx krxVar53;
        apya apyaVar125;
        krx krxVar54;
        apya apyaVar126;
        krx krxVar55;
        apya apyaVar127;
        krx krxVar56;
        apya apyaVar128;
        apya apyaVar129;
        krx krxVar57;
        apya apyaVar130;
        apya apyaVar131;
        apya apyaVar132;
        krx krxVar58;
        apya apyaVar133;
        apya apyaVar134;
        apya apyaVar135;
        apya apyaVar136;
        krx krxVar59;
        apya apyaVar137;
        apya apyaVar138;
        final apya apyaVar139;
        apya apyaVar140;
        apya apyaVar141;
        final apya apyaVar142;
        final apya apyaVar143;
        apya apyaVar144;
        apya apyaVar145;
        apya apyaVar146;
        apya apyaVar147;
        apya apyaVar148;
        apya apyaVar149;
        krx krxVar60;
        apya apyaVar150;
        apya apyaVar151;
        apya apyaVar152;
        apya apyaVar153;
        krx krxVar61;
        apya apyaVar154;
        krx krxVar62;
        krx krxVar63;
        apya apyaVar155;
        krx krxVar64;
        krx krxVar65;
        krx krxVar66;
        krx krxVar67;
        krx krxVar68;
        krx krxVar69;
        krx krxVar70;
        krx krxVar71;
        krx krxVar72;
        krx krxVar73;
        krx krxVar74;
        krx krxVar75;
        apya apyaVar156;
        apya apyaVar157;
        apya apyaVar158;
        apya apyaVar159;
        apya apyaVar160;
        apya apyaVar161;
        krx krxVar76;
        apya apyaVar162;
        apya apyaVar163;
        apya apyaVar164;
        apya apyaVar165;
        krx krxVar77;
        apya apyaVar166;
        apya apyaVar167;
        krx krxVar78;
        apya apyaVar168;
        apya apyaVar169;
        apya apyaVar170;
        apya apyaVar171;
        krx krxVar79;
        apya apyaVar172;
        krx krxVar80;
        apya apyaVar173;
        apya apyaVar174;
        apya apyaVar175;
        krx krxVar81;
        apya apyaVar176;
        krx krxVar82;
        alhm Qq;
        apya apyaVar177;
        final apya apyaVar178;
        apya apyaVar179;
        apya apyaVar180;
        apya apyaVar181;
        apya apyaVar182;
        apya apyaVar183;
        apya apyaVar184;
        apya apyaVar185;
        apya apyaVar186;
        apya apyaVar187;
        apya apyaVar188;
        apya apyaVar189;
        apya apyaVar190;
        apya apyaVar191;
        apya apyaVar192;
        apya apyaVar193;
        krx krxVar83;
        apya apyaVar194;
        krx krxVar84;
        krx krxVar85;
        Set t;
        krx krxVar86;
        krx krxVar87;
        krx krxVar88;
        apya apyaVar195;
        apya apyaVar196;
        apya apyaVar197;
        apya apyaVar198;
        apya apyaVar199;
        apya apyaVar200;
        apya apyaVar201;
        apya apyaVar202;
        apya apyaVar203;
        krx krxVar89;
        apya apyaVar204;
        krx krxVar90;
        apya apyaVar205;
        krx krxVar91;
        apya apyaVar206;
        krx krxVar92;
        apya apyaVar207;
        final apya apyaVar208;
        final apya apyaVar209;
        final apya apyaVar210;
        apya apyaVar211;
        apya apyaVar212;
        apya apyaVar213;
        apya apyaVar214;
        apya apyaVar215;
        apya apyaVar216;
        apya apyaVar217;
        Map hW;
        krx krxVar93;
        krx krxVar94;
        apya apyaVar218;
        apya apyaVar219;
        int i = this.b;
        final int i2 = 3;
        final int i3 = 0;
        final int i4 = 2;
        final int i5 = 1;
        switch (i) {
            case 0:
                apyaVar = this.a.kB;
                agxw agxwVar = (agxw) apyaVar.b();
                apyaVar2 = this.a.z;
                apyaVar3 = this.a.ay;
                anen anenVar = (anen) apyaVar3.b();
                apyaVar4 = this.a.cc;
                agnq agnqVar = (agnq) apyaVar4.b();
                apyaVar5 = this.a.aC;
                ahiy ahiyVar = (ahiy) apyaVar5.b();
                apyaVar6 = this.a.bB;
                return new qyo(agxwVar, anenVar, agnqVar, ahiyVar, (mbl) apyaVar6.b());
            case 1:
                return new ipq();
            case 2:
                krxVar = this.a.a;
                apyaVar7 = krxVar.hx;
                return new wfh(apyaVar7);
            case 3:
                krxVar2 = this.a.a;
                apyaVar8 = krxVar2.hw;
                return alpt.o((Collection) apyaVar8.b());
            case 4:
                krv krvVar = this.a;
                krxVar3 = krvVar.a;
                apyaVar9 = krxVar3.hv;
                krxVar4 = krvVar.a;
                jf = krxVar4.jf();
                return weg.f(apyaVar9, jf);
            case 5:
                krxVar5 = this.a.a;
                apyaVar10 = krxVar5.hu;
                return weg.u(apyaVar10.b());
            case 6:
                krxVar6 = this.a.a;
                apyaVar11 = krxVar6.ht;
                apwt a = apxv.a(apyaVar11);
                apyaVar12 = this.a.m;
                return new wnb(a, (anen) apyaVar12.b());
            case 7:
                krxVar7 = this.a.a;
                atal iN = krx.iN(krxVar7);
                krxVar8 = this.a.a;
                atal iO = krx.iO(krxVar8);
                krxVar9 = this.a.a;
                return new wpp(iN, iO, krx.iP(krxVar9), (short[]) null);
            case 8:
                krv krvVar2 = this.a;
                apyaVar13 = krvVar2.m;
                krxVar10 = krvVar2.a;
                apyaVar14 = krxVar10.hy;
                return new znj((armf) apyaVar13, (nwj) apyaVar14.b());
            case 9:
                apyaVar15 = this.a.bN;
                return new nwj() { // from class: nit
                    @Override // defpackage.nwj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_direct_executor_for_simple_work_completion");
                    }
                };
            case 10:
                apyaVar16 = this.a.bN;
                return new nwi() { // from class: nis
                    @Override // defpackage.nwi
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.log_at_warning_when_skipping_pending_result_finish");
                    }
                };
            case 11:
                apyaVar17 = this.a.bN;
                return new nwh() { // from class: nir
                    @Override // defpackage.nwh
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.finish_pending_result_before_raising_on_broadcast_async_complete");
                    }
                };
            case 12:
                krv krvVar3 = this.a;
                apyaVar18 = krvVar3.n;
                apyaVar19 = krvVar3.cb;
                krxVar11 = krvVar3.a;
                apyaVar20 = krxVar11.hz;
                return new kmy(apyaVar18, apyaVar19, apyaVar20);
            case 13:
                alok h = alor.h(128);
                h.h("$primary+a2p_conversation_subscriptions", rms.u());
                h.h("$primary+active_sims", qlp.n());
                h.h("$primary+add_contact_banner", sfq.c());
                h.h("backup+conversation_participants_backup", qwx.g());
                h.h("backup+conversation_pins_backup", qwx.j());
                h.h("backup+conversations_backup", qwx.m());
                h.h("$primary+backup_id_map", sfq.e());
                h.h("backup+link_preview_backup", qwx.p());
                h.h("backup+message_reactions_backup", qwx.r());
                h.h("backup+message_replies_backup", rms.c());
                h.h("backup+message_star_backup", rms.e());
                h.h("backup+messages_backup", rms.h());
                h.h("backup+backup_metadata", rms.n());
                h.h("backup+my_identities_backup", rms.p());
                h.h("backup+participants_backup", rms.r());
                h.h("backup+parts_backup", rms.k());
                h.h("$primary+business_conversations_metadata", sfq.g());
                h.h("$primary+cms_backup_dependency_cache_table", sfq.i());
                h.h("$primary+cms_blobs_pending_delete", sfq.k());
                h.h("$primary+cms_dead_letter_queue", sfq.m());
                h.h("$primary+cms_deleted_messages_buffer", sfq.o());
                h.h("$primary+cms_media_notifications", sfq.q());
                h.h("$primary+cms_notifications", sfq.s());
                h.h("$primary+cms_restore_dependency_cache_table", sfq.u());
                h.h("$primary+cms_status", siv.c());
                h.h("$primary+cms", siv.d());
                h.h("$primary+contacts", siv.f());
                h.h("$primary+conversation_classifications_table", siv.i());
                h.h("$primary+conversation_labels", siv.k());
                h.h("$primary+conversation_matcher_cache", qlp.d());
                h.h("$primary+conversation_participants_audit_log", siv.m());
                h.h("$primary+conversation_participants", siv.o());
                h.h("$primary+conversation_pin", siv.r());
                h.h("$primary+conversation_suggestions", siv.t());
                h.h("$primary+conversation_to_participants_audit_log", smg.c());
                h.h("$primary+conversation_to_participants", smg.d());
                h.h("$primary+conversations", smg.f());
                h.h("$primary+custodian_rcs_group_ids", smg.i());
                h.h("$primary+data_upgrade_workers", smg.l());
                h.h("$primary+data_usage", smg.n());
                h.h("$primary+desktop", smg.p());
                h.h("$primary+destinations", qlp.g());
                h.h("$primary+disambiguations", smg.r());
                h.h("$primary+drafts", smg.t());
                h.h("$primary+etouffee_rcs_metadata", smg.v());
                h.h("$primary+events", sqe.a());
                h.h("$primary+file_processing", pps.t());
                h.h("$primary+file_transfer", wuj.j());
                h.h("$primary+flagged_messages", sqe.e());
                h.h("$primary+gemini_conversation_id_mappings", sqe.g());
                h.h("$primary+gemini", sqe.j());
                h.h("$primary+generic_worker_queue", sqe.l());
                h.h("$primary+group_members", qlp.i());
                h.h("$primary+groups", qlp.k());
                h.h("$primary+lighter_conversations_table", sqe.r());
                h.h("$primary+link_preview_participants_table", sqe.u());
                h.h("$primary+link_preview", sst.c());
                h.h("$primary+linked_account", sst.d());
                h.h("$primary+messages_annotations", sst.f());
                h.h("$primary+message_captions", sst.i());
                h.h("$primary+message_classifications_table", sst.k());
                h.h("$primary+message_destinations", sst.m());
                h.h("$primary+message_edits", sst.o());
                h.h("$primary+message_labels", sst.q());
                h.h("$primary+message_photos_sharing", sst.s());
                h.h("$primary+message_reactions", sst.u());
                h.h("$primary+message_replies", swa.c());
                h.h("$primary+message_send_receive_attempt", swa.d());
                h.h("$primary+message_spam", swa.f());
                h.h("$primary+message_star", swa.h());
                h.h("$primary+message_status", swa.j());
                h.h("$primary+messages", swa.l());
                h.h("$primary+modified_by", swa.n());
                h.h("$primary+my_identities", qlp.q());
                h.h("$primary+smarts_personalization_decayed_feature_values", swa.q());
                h.h("$primary+smarts_personalization_features", swa.s());
                h.h("$primary+smarts_personalization_normalized_feature_values", swa.u());
                h.h("$primary+p2p_conversation_suggestion_event", szm.c());
                h.h("$primary+p2p_suggestions", szm.e());
                h.h("$primary+parent_disallowed_conversations", szm.g());
                h.h("$primary+participants_audit_log", szm.i());
                h.h("$primary+participants", szm.l());
                h.h("$primary+parts", szm.o());
                h.h("$primary+pending_incoming_message_rcs_table", szm.q());
                h.h("$primary+phone_number_min_match_guesser", szm.s());
                h.h("$primary+pii_hash", szm.u());
                h.h("$primary+profiles_table", tdn.c());
                h.h("$primary+rbm_business_info_properties", tdn.d());
                h.h("$primary+rbm_business_info", tdn.f());
                h.h("$primary+rbm_business_verifier_info", tdn.h());
                h.h("$primary+rcs_remote_capabilities_cache", pps.q());
                h.h("$primary+read_reports", tdn.j());
                h.h("$primary+received_message_phone_numbers", tdn.l());
                h.h("$primary+recent_expressive_stickers", tdn.n());
                h.h("$primary+recent_gifs", tdn.p());
                h.h("$primary+recent_stickers", tdn.r());
                h.h("$primary+reminders", tdn.t());
                h.h("$primary+remote_instances", tdn.v());
                h.h("$primary+remote_registrations_table", thl.a());
                h.h("$primary+remote_user_id_info_table", thl.e());
                h.h("$primary+remote_user_id_to_registration_id", thl.g());
                h.h("$primary+restore_workflow_executions", thl.i());
                h.h("$primary+restore_workflow_files", thl.k());
                h.h("$primary+restore_workflow_scratch_duplicates", thl.m());
                h.h("$primary+restore_workflow_scratch_suffix", thl.o());
                h.h("$primary+restore_workflow_scratch_timestamps", thl.q());
                h.h("$primary+satellite_emergency_details", thl.s());
                h.h("$primary+scheduled_send", weg.h());
                h.h("$primary+self_participants", thl.v());
                h.h("$primary+self_profiles", tkz.a());
                h.h("$primary+settings", tkz.f());
                h.h("$primary+spam_logging_ids_table", xrh.o());
                h.h("$primary+sqlite_master", tkz.h());
                h.h("$primary+sqlite_stat1", tkz.i());
                h.h("$primary+sticker_sets_localization", tkz.j());
                h.h("$primary+sticker_sets", tkz.l());
                h.h("$primary+stickers_localization", tkz.n());
                h.h("$primary+stickers", tkz.p());
                h.h("$primary+subscriptions", qwx.a());
                h.h("$primary+supersort_labels", tkz.r());
                h.h("$primary+trigger_flags", tkz.t());
                h.h("$primary+user_references", tkz.v());
                h.h("$primary+verified_sms_blacklisted_senders", ton.d());
                h.h("$primary+verified_sms_brands", ton.f());
                h.h("$primary+verified_sms_senders", ton.h());
                h.h("$primary+vmt", ton.j());
                h.h("$primary+work_queue", ton.o());
                h.h("$primary+work_queue_work_manager_ids", ton.q());
                return h.f();
            case 14:
                apyaVar21 = this.a.n;
                return new knb(apyaVar21);
            case 15:
                krxVar12 = this.a.a;
                return new aodz(krx.hG(krxVar12));
            case 16:
                final algw i6 = algw.i(agdj.e());
                return new aiex() { // from class: aknq
                    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    @Override // defpackage.aiex
                    public final void a() {
                        int i7 = i5;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    ?? r0 = i6;
                                    if (!r0.isEmpty()) {
                                        akqj.s(alpt.o(r0));
                                        return;
                                    }
                                    return;
                                }
                                akrz.a = 1;
                                akpx.a = 3;
                                akrn.a = 1;
                                ?? r1 = i6;
                                if (!r1.isEmpty()) {
                                    akqj.s(alpt.o(r1));
                                }
                                akpz.a = 3;
                                return;
                            }
                            agkh.d = (agkh) ((alha) i6).a;
                            return;
                        }
                        aiui aiuiVar = new aiui(new aiuk());
                        atal atalVar = new atal((Context) i6);
                        synchronized (aiui.b) {
                            if (atal.c != null) {
                                return;
                            }
                            atal.c = atalVar;
                            if (aiui.c == null) {
                                aiui.c = new aium();
                            }
                            if (Security.insertProviderAt(aiui.c, 1) == 1) {
                                aiul aiulVar = aiuiVar.d;
                                if (aiulVar != null) {
                                    aiuo.a = aiulVar;
                                    aiul aiulVar2 = aiuiVar.d;
                                    if (aiulVar2 != null) {
                                        aiun.a = aiulVar2;
                                        aiui.b();
                                        aiui.a();
                                        Log.i(aiui.a, "SslGuard completed installation.");
                                        return;
                                    }
                                    throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                                }
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            throw new RuntimeException("Failed to install SslGuard with top priority.");
                        }
                    }
                };
            case 17:
                apyaVar22 = this.a.n;
                Context context = (Context) apyaVar22.b();
                krxVar13 = this.a.a;
                jd = krxVar13.jd();
                return akmm.c(context, jd);
            case 18:
                final alpt q = alpt.q();
                return new aiex() { // from class: aknq
                    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    @Override // defpackage.aiex
                    public final void a() {
                        int i7 = i4;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    ?? r0 = q;
                                    if (!r0.isEmpty()) {
                                        akqj.s(alpt.o(r0));
                                        return;
                                    }
                                    return;
                                }
                                akrz.a = 1;
                                akpx.a = 3;
                                akrn.a = 1;
                                ?? r1 = q;
                                if (!r1.isEmpty()) {
                                    akqj.s(alpt.o(r1));
                                }
                                akpz.a = 3;
                                return;
                            }
                            agkh.d = (agkh) ((alha) q).a;
                            return;
                        }
                        aiui aiuiVar = new aiui(new aiuk());
                        atal atalVar = new atal((Context) q);
                        synchronized (aiui.b) {
                            if (atal.c != null) {
                                return;
                            }
                            atal.c = atalVar;
                            if (aiui.c == null) {
                                aiui.c = new aium();
                            }
                            if (Security.insertProviderAt(aiui.c, 1) == 1) {
                                aiul aiulVar = aiuiVar.d;
                                if (aiulVar != null) {
                                    aiuo.a = aiulVar;
                                    aiul aiulVar2 = aiuiVar.d;
                                    if (aiulVar2 != null) {
                                        aiun.a = aiulVar2;
                                        aiui.b();
                                        aiui.a();
                                        Log.i(aiui.a, "SslGuard completed installation.");
                                        return;
                                    }
                                    throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                                }
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            throw new RuntimeException("Failed to install SslGuard with top priority.");
                        }
                    }
                };
            case 19:
                krv.Qv(this.a);
                return new aiex() { // from class: ahmx
                    @Override // defpackage.aiex
                    public final void a() {
                        Boolean bool = false;
                        bool.getClass();
                    }
                };
            case 20:
                apyaVar23 = this.a.n;
                final Context context2 = (Context) apyaVar23.b();
                krv krvVar4 = this.a;
                krxVar14 = krvVar4.a;
                apyaVar24 = krxVar14.hH;
                krxVar15 = krvVar4.a;
                final algw i7 = algw.i(krx.bo(krxVar15));
                QQ = this.a.QQ();
                return new aiex() { // from class: aiet
                    /* JADX WARN: Type inference failed for: r0v4, types: [algk, java.lang.Object] */
                    @Override // defpackage.aiex
                    public final void a() {
                        if (!agrk.this.i()) {
                            Boolean bool = false;
                            bool.getClass();
                            return;
                        }
                        algw algwVar = i7;
                        armf armfVar = apyaVar24;
                        Application application = (Application) context2;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((alha) algwVar).a.apply(new aieu(application, armfVar, algwVar)));
                    }
                };
            case 21:
                krxVar16 = this.a.a;
                Application.ActivityLifecycleCallbacks c = krx.c(krxVar16);
                krxVar17 = this.a.a;
                Application.ActivityLifecycleCallbacks b = krx.b(krxVar17);
                akmv akmvVar = new akmv();
                krxVar18 = this.a.a;
                return alpt.t(c, b, akmvVar, krx.d(krxVar18));
            case 22:
                krxVar19 = this.a.a;
                apyaVar25 = krxVar19.hE;
                return ahkm.i((arpi) apyaVar25.b());
            case 23:
                krv krvVar5 = this.a;
                Rh = krvVar5.Rh();
                apyaVar26 = krvVar5.ba;
                return ahkm.o(Rh, (aneo) apyaVar26.b());
            case 24:
                return new akju();
            case 25:
                apyaVar27 = this.a.n;
                final Context context3 = (Context) apyaVar27.b();
                return new aiex() { // from class: aknq
                    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    @Override // defpackage.aiex
                    public final void a() {
                        int i72 = i3;
                        if (i72 != 0) {
                            if (i72 != 1) {
                                if (i72 != 2) {
                                    ?? r0 = context3;
                                    if (!r0.isEmpty()) {
                                        akqj.s(alpt.o(r0));
                                        return;
                                    }
                                    return;
                                }
                                akrz.a = 1;
                                akpx.a = 3;
                                akrn.a = 1;
                                ?? r1 = context3;
                                if (!r1.isEmpty()) {
                                    akqj.s(alpt.o(r1));
                                }
                                akpz.a = 3;
                                return;
                            }
                            agkh.d = (agkh) ((alha) context3).a;
                            return;
                        }
                        aiui aiuiVar = new aiui(new aiuk());
                        atal atalVar = new atal((Context) context3);
                        synchronized (aiui.b) {
                            if (atal.c != null) {
                                return;
                            }
                            atal.c = atalVar;
                            if (aiui.c == null) {
                                aiui.c = new aium();
                            }
                            if (Security.insertProviderAt(aiui.c, 1) == 1) {
                                aiul aiulVar = aiuiVar.d;
                                if (aiulVar != null) {
                                    aiuo.a = aiulVar;
                                    aiul aiulVar2 = aiuiVar.d;
                                    if (aiulVar2 != null) {
                                        aiun.a = aiulVar2;
                                        aiui.b();
                                        aiui.a();
                                        Log.i(aiui.a, "SslGuard completed installation.");
                                        return;
                                    }
                                    throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                                }
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            throw new RuntimeException("Failed to install SslGuard with top priority.");
                        }
                    }
                };
            case 26:
                final alpt q2 = alpt.q();
                return new aiex() { // from class: aknq
                    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection, java.util.Set, java.lang.Object] */
                    @Override // defpackage.aiex
                    public final void a() {
                        int i72 = i2;
                        if (i72 != 0) {
                            if (i72 != 1) {
                                if (i72 != 2) {
                                    ?? r0 = q2;
                                    if (!r0.isEmpty()) {
                                        akqj.s(alpt.o(r0));
                                        return;
                                    }
                                    return;
                                }
                                akrz.a = 1;
                                akpx.a = 3;
                                akrn.a = 1;
                                ?? r1 = q2;
                                if (!r1.isEmpty()) {
                                    akqj.s(alpt.o(r1));
                                }
                                akpz.a = 3;
                                return;
                            }
                            agkh.d = (agkh) ((alha) q2).a;
                            return;
                        }
                        aiui aiuiVar = new aiui(new aiuk());
                        atal atalVar = new atal((Context) q2);
                        synchronized (aiui.b) {
                            if (atal.c != null) {
                                return;
                            }
                            atal.c = atalVar;
                            if (aiui.c == null) {
                                aiui.c = new aium();
                            }
                            if (Security.insertProviderAt(aiui.c, 1) == 1) {
                                aiul aiulVar = aiuiVar.d;
                                if (aiulVar != null) {
                                    aiuo.a = aiulVar;
                                    aiul aiulVar2 = aiuiVar.d;
                                    if (aiulVar2 != null) {
                                        aiun.a = aiulVar2;
                                        aiui.b();
                                        aiui.a();
                                        Log.i(aiui.a, "SslGuard completed installation.");
                                        return;
                                    }
                                    throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                                }
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            throw new RuntimeException("Failed to install SslGuard with top priority.");
                        }
                    }
                };
            case 27:
                this.a.QQ();
                Optional empty = Optional.empty();
                Optional.empty();
                krv krvVar6 = this.a;
                krxVar20 = krvVar6.a;
                apyaVar28 = krxVar20.hU;
                krxVar21 = krvVar6.a;
                apyaVar29 = krxVar21.hW;
                krxVar22 = krvVar6.a;
                apyaVar30 = krxVar22.hX;
                return new akkm(empty, apyaVar28, apyaVar29, apyaVar30);
            case 28:
                apyaVar31 = this.a.n;
                Context context4 = (Context) apyaVar31.b();
                krv krvVar7 = this.a;
                QQ2 = krvVar7.QQ();
                krxVar23 = krvVar7.a;
                o = alor.o("TikTok AccountProviders", krxVar23.hL, "TikTok Phenotype Configuration Updater", krxVar23.hM, "Home Permissions", krxVar23.hN, "TikTok Phenotype Registration", krxVar23.hQ);
                krxVar24 = this.a.a;
                l = alor.l("TikTok Sync", krxVar24.hT);
                apyaVar32 = this.a.z;
                anen anenVar2 = (anen) apyaVar32.b();
                apyaVar33 = this.a.bh;
                apwt a2 = apxv.a(apyaVar33);
                krv krvVar8 = this.a;
                apyaVar34 = krvVar8.at;
                apyaVar35 = krvVar8.Ev;
                return new akkl(context4, QQ2, o, l, anenVar2, a2, apyaVar34, apyaVar35);
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                hz = this.a.hz();
                return new akiz(hz, 1);
            case 30:
                apyaVar36 = this.a.AZ;
                return akdp.o((akyr) apyaVar36.b());
            case 31:
                apyaVar37 = this.a.n;
                return new akiz((Context) apyaVar37.b(), 2);
            case 32:
                apyaVar38 = this.a.aV;
                ahtx ahtxVar = (ahtx) apyaVar38.b();
                krxVar25 = this.a.a;
                return akdp.i(ahtxVar, krx.bl(krxVar25));
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                krv krvVar9 = this.a;
                alor k = alor.k();
                alor k2 = alor.k();
                Le = krvVar9.Le();
                apyaVar39 = krvVar9.bq;
                Map map = (Map) apyaVar39.b();
                apyaVar40 = this.a.bt;
                return akdp.g(k, k2, Le, map, (Map) apyaVar40.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                krv krvVar10 = this.a;
                alor k3 = alor.k();
                Le2 = krvVar10.Le();
                apyaVar41 = krvVar10.bq;
                Map map2 = (Map) apyaVar41.b();
                apyaVar42 = this.a.bt;
                return akdp.h(k3, Le2, map2, (Map) apyaVar42.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                krv krvVar11 = this.a;
                krxVar26 = krvVar11.a;
                apyaVar43 = krxVar26.hS;
                apyaVar44 = krvVar11.bH;
                return new akox(apyaVar43, ((Boolean) apyaVar44.b()).booleanValue());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                apyaVar45 = this.a.bH;
                boolean booleanValue = ((Boolean) apyaVar45.b()).booleanValue();
                krv krvVar12 = this.a;
                apyaVar46 = krvVar12.AS;
                krxVar27 = krvVar12.a;
                apyaVar47 = krxVar27.hR;
                return akmm.e(booleanValue, apyaVar46, apyaVar47);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return new akoh();
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                apyaVar48 = this.a.n;
                Context context5 = (Context) apyaVar48.b();
                krv krvVar13 = this.a;
                QQ3 = krvVar13.QQ();
                apyaVar49 = krvVar13.m;
                ExecutorService executorService = (ExecutorService) apyaVar49.b();
                apyaVar50 = this.a.z;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) apyaVar50.b();
                krv krvVar14 = this.a;
                x = krvVar14.x();
                krxVar28 = krvVar14.a;
                o2 = alor.o("TikTok AccountProviders", krxVar28.hL, "TikTok Phenotype Configuration Updater", krxVar28.hM, "Home Permissions", krxVar28.hN, "TikTok Phenotype Registration", krxVar28.hQ);
                krxVar29 = this.a.a;
                l2 = alor.l("TikTok Sync", krxVar29.hT);
                krxVar30 = this.a.a;
                apyaVar51 = krxVar30.hV;
                return new akkp(context5, QQ3, executorService, scheduledExecutorService, x, o2, l2, apxv.a(apyaVar51));
            case 39:
                apyaVar52 = this.a.n;
                Context context6 = (Context) apyaVar52.b();
                Rn = this.a.Rn();
                return akec.D(context6, Rn);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                apyaVar53 = this.a.ay;
                return new akcp((Executor) apyaVar53.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                krxVar31 = this.a.a;
                apyaVar54 = krxVar31.ia;
                alya alyaVar = (alya) apyaVar54.b();
                krxVar32 = this.a.a;
                apyaVar55 = krxVar32.ig;
                alya alyaVar2 = (alya) apyaVar55.b();
                krxVar33 = this.a.a;
                apyaVar56 = krxVar33.ih;
                alya alyaVar3 = (alya) apyaVar56.b();
                krxVar34 = this.a.a;
                apyaVar57 = krxVar34.ij;
                return alpt.t(alyaVar, alyaVar2, alyaVar3, (alya) apyaVar57.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                apyaVar58 = this.a.ajO;
                return akmm.a(apyaVar58.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                apyaVar59 = this.a.n;
                Context context7 = (Context) apyaVar59.b();
                apyaVar60 = this.a.gp;
                apwt a3 = apxv.a(apyaVar60);
                krxVar35 = this.a.a;
                apyaVar61 = krxVar35.id;
                Object b2 = apyaVar61.b();
                krxVar36 = this.a.a;
                apyaVar62 = krxVar36.f10if;
                zfj zfjVar = (zfj) apyaVar62.b();
                UY = this.a.UY();
                return akmm.k(context7, a3, b2, zfjVar, UY);
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                krxVar37 = this.a.a;
                apyaVar63 = krxVar37.ib;
                aomv aomvVar = (aomv) apyaVar63.b();
                apyaVar64 = this.a.nV;
                apwt a4 = apxv.a(apyaVar64);
                krxVar38 = this.a.a;
                apyaVar65 = krxVar38.ic;
                return new akmi(aomvVar, a4, (ansy) apyaVar65.b());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                apyaVar66 = this.a.n;
                Context context8 = (Context) apyaVar66.b();
                apyaVar67 = this.a.gp;
                return akdp.n(context8, apxv.a(apyaVar67), algw.i(true));
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return new ansy((char[]) null);
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                krxVar39 = this.a.a;
                apyaVar68 = krxVar39.ie;
                return new zfj(apyaVar68, (short[]) null);
            case 48:
                return akmm.i();
            case 49:
                krxVar40 = this.a.a;
                apyaVar69 = krxVar40.ii;
                return new ahkw((ahkx) apyaVar69.b());
            case 50:
                apyaVar70 = this.a.R;
                return new ahkx((ahow) apyaVar70.b());
            case 51:
                apyaVar71 = this.a.ajO;
                aiev aievVar = (aiev) apyaVar71.b();
                Kw = this.a.Kw();
                return alpt.r(aievVar, Kw);
            case 52:
                apyaVar72 = this.a.n;
                Context context9 = (Context) apyaVar72.b();
                apyaVar73 = this.a.z;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) apyaVar73.b();
                apyaVar74 = this.a.ay;
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) apyaVar74.b();
                krv krvVar15 = this.a;
                apyaVar75 = krvVar15.bU;
                apyaVar76 = krvVar15.at;
                aksr aksrVar = (aksr) apyaVar76.b();
                krv krvVar16 = this.a;
                apyaVar77 = krvVar16.dq;
                apyaVar78 = krvVar16.aM;
                krxVar41 = krvVar16.a;
                apyaVar79 = krxVar41.iQ;
                return new xcj(context9, scheduledExecutorService2, scheduledExecutorService3, apyaVar75, aksrVar, apyaVar77, apyaVar78, apyaVar79);
            case 53:
                krv krvVar17 = this.a;
                xcg xcgVar = xcg.APP_CREATED;
                krxVar42 = krvVar17.a;
                apyaVar80 = krxVar42.iq;
                xcg xcgVar2 = xcg.PERMISSIONS_ACQUIRED;
                krxVar43 = krvVar17.a;
                apyaVar81 = krxVar43.iD;
                xcg xcgVar3 = xcg.APP_INTERACTIVE;
                krxVar44 = krvVar17.a;
                apyaVar82 = krxVar44.iP;
                return alor.n(xcgVar, apyaVar80, xcgVar2, apyaVar81, xcgVar3, apyaVar82);
            case 54:
                krxVar45 = this.a.a;
                return new altx(krx.aT(krxVar45));
            case 55:
                apyaVar83 = this.a.n;
                Context context10 = (Context) apyaVar83.b();
                krv krvVar18 = this.a;
                apyaVar84 = krvVar18.az;
                apyaVar85 = krvVar18.bB;
                apyaVar86 = krvVar18.md;
                krxVar46 = krvVar18.a;
                apyaVar87 = krxVar46.im;
                apyaVar88 = krvVar18.bX;
                apyaVar89 = krvVar18.gD;
                apyaVar90 = krvVar18.oa;
                apyaVar91 = krvVar18.zZ;
                apyaVar92 = krvVar18.aM;
                apyaVar93 = krvVar18.ko;
                apyaVar94 = krvVar18.ay;
                anen anenVar3 = (anen) apyaVar94.b();
                krv krvVar19 = this.a;
                apyaVar95 = krvVar19.fa;
                apyaVar96 = krvVar19.gv;
                apyaVar97 = krvVar19.cL;
                apyaVar98 = krvVar19.Rv;
                krxVar47 = krvVar19.a;
                apyaVar99 = krxVar47.in;
                return new lzq(context10, apyaVar84, apyaVar85, apyaVar86, apyaVar87, apyaVar88, apyaVar89, apyaVar90, apyaVar91, apyaVar92, apyaVar93, anenVar3, apyaVar95, apyaVar96, apyaVar97, apyaVar98, apyaVar99);
            case 56:
                krv krvVar20 = this.a;
                apyaVar100 = krvVar20.cp;
                return mbf.q(apyaVar100, krv.PJ(krvVar20));
            case 57:
                RJ = this.a.RJ();
                return Boolean.valueOf(akmm.n(RJ));
            case 58:
                apyaVar101 = this.a.n;
                Context context11 = (Context) apyaVar101.b();
                krv krvVar21 = this.a;
                apyaVar102 = krvVar21.bC;
                apyaVar103 = krvVar21.bB;
                apyaVar104 = krvVar21.z;
                return new zeu(context11, apyaVar102, apyaVar103, (anen) apyaVar104.b());
            case 59:
                krxVar48 = this.a.a;
                zes aU = krx.aU(krxVar48);
                krxVar49 = this.a.a;
                return alpt.r(aU, krx.az(krxVar49));
            case 60:
                apyaVar105 = this.a.n;
                Context context12 = (Context) apyaVar105.b();
                krv krvVar22 = this.a;
                apyaVar106 = krvVar22.av;
                apyaVar107 = krvVar22.aF;
                apwt a5 = apxv.a(apyaVar107);
                apyaVar108 = this.a.gK;
                apwt a6 = apxv.a(apyaVar108);
                apyaVar109 = this.a.z;
                anen anenVar4 = (anen) apyaVar109.b();
                krv krvVar23 = this.a;
                apyaVar110 = krvVar23.gJ;
                apyaVar111 = krvVar23.pP;
                apyaVar112 = krvVar23.aM;
                krxVar50 = krvVar23.a;
                apyaVar113 = krxVar50.iy;
                krxVar51 = krvVar23.a;
                apyaVar114 = krxVar51.iz;
                return new lzt(context12, apyaVar106, a5, a6, anenVar4, apyaVar110, apyaVar111, apyaVar112, apyaVar113, apyaVar114);
            case 61:
                apyaVar115 = this.a.n;
                Context context13 = (Context) apyaVar115.b();
                apyaVar116 = this.a.z;
                Executor executor = (Executor) apyaVar116.b();
                apyaVar117 = this.a.ay;
                anen anenVar5 = (anen) apyaVar117.b();
                apyaVar118 = this.a.bQ;
                arwe arweVar = (arwe) apyaVar118.b();
                apyaVar119 = this.a.dP;
                arwe arweVar2 = (arwe) apyaVar119.b();
                krv krvVar24 = this.a;
                apyaVar120 = krvVar24.QP;
                apyaVar121 = krvVar24.dK;
                akbm akbmVar = (akbm) apyaVar121.b();
                krv krvVar25 = this.a;
                apyaVar122 = krvVar25.at;
                apyaVar123 = krvVar25.Jo;
                krxVar52 = krvVar25.a;
                apyaVar124 = krxVar52.k;
                krxVar53 = krvVar25.a;
                apyaVar125 = krxVar53.iv;
                krxVar54 = krvVar25.a;
                apyaVar126 = krxVar54.iw;
                krxVar55 = krvVar25.a;
                apyaVar127 = krxVar55.ix;
                return new wvy(context13, executor, anenVar5, arweVar, arweVar2, apyaVar120, akbmVar, apyaVar122, apyaVar123, apyaVar124, apyaVar125, apyaVar126, apyaVar127);
            case 62:
                krv krvVar26 = this.a;
                krxVar56 = krvVar26.a;
                apyaVar128 = krxVar56.ir;
                apyaVar129 = krvVar26.QD;
                krxVar57 = krvVar26.a;
                apyaVar130 = krxVar57.is;
                apyaVar131 = krvVar26.dP;
                apyaVar132 = krvVar26.mG;
                krxVar58 = krvVar26.a;
                apyaVar133 = krxVar58.it;
                apyaVar134 = krvVar26.yp;
                apyaVar135 = krvVar26.yq;
                apyaVar136 = krvVar26.bV;
                krxVar59 = krvVar26.a;
                apyaVar137 = krxVar59.iu;
                return new wwa(apyaVar128, apyaVar129, apyaVar130, apyaVar131, apyaVar132, apyaVar133, apyaVar134, apyaVar135, apyaVar136, apyaVar137);
            case 63:
                return Long.valueOf(aqjv.l(krv.Ue(this.a)));
            case 64:
                return aqjv.k(krv.Ue(this.a));
            case 65:
                apyaVar138 = this.a.ff;
                return new wfh(apyaVar138);
            case 66:
                apyaVar139 = this.a.bN;
                return new pci() { // from class: paq
                    @Override // defpackage.pci
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_fire_and_forget_pwq_scheduling_flag");
                    }
                };
            case 67:
                apyaVar140 = this.a.n;
                Context context14 = (Context) apyaVar140.b();
                apyaVar141 = this.a.dP;
                return new wwt(context14, (arwe) apyaVar141.b());
            case 68:
                apyaVar142 = this.a.bN;
                return new pcg() { // from class: pao
                    @Override // defpackage.pcg
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_context_registered_receiver");
                    }
                };
            case 69:
                apyaVar143 = this.a.bN;
                return new pck() { // from class: pas
                    @Override // defpackage.pck
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_manifest_registered_receiver");
                    }
                };
            case 70:
                krv krvVar27 = this.a;
                apyaVar144 = krvVar27.hA;
                apyaVar145 = krvVar27.pm;
                return new wle(apyaVar144, apyaVar145);
            case 71:
                apyaVar146 = this.a.n;
                Context context15 = (Context) apyaVar146.b();
                krv krvVar28 = this.a;
                apyaVar147 = krvVar28.aG;
                apyaVar148 = krvVar28.az;
                apyaVar149 = krvVar28.Nw;
                krxVar60 = krvVar28.a;
                apyaVar150 = krxVar60.iB;
                return new wlb(context15, apyaVar147, apyaVar148, apyaVar149, apyaVar150);
            case 72:
                apyaVar151 = this.a.n;
                Context context16 = (Context) apyaVar151.b();
                apyaVar152 = this.a.aG;
                Optional optional = (Optional) apyaVar152.b();
                apyaVar153 = this.a.oF;
                return new yhe(context16, optional, (wfh) apyaVar153.b());
            case 73:
                krxVar61 = this.a.a;
                apyaVar154 = krxVar61.iE;
                xcf xcfVar = (xcf) apyaVar154.b();
                krxVar62 = this.a.a;
                xcf aS = krx.aS(krxVar62);
                krxVar63 = this.a.a;
                apyaVar155 = krxVar63.iK;
                xcf xcfVar2 = (xcf) apyaVar155.b();
                krxVar64 = this.a.a;
                zew aW = krx.aW(krxVar64);
                krxVar65 = this.a.a;
                kpq hV = krx.hV(krxVar65);
                krxVar66 = this.a.a;
                uvv aB = krx.aB(krxVar66);
                krxVar67 = this.a.a;
                krxVar68 = this.a.a;
                krxVar69 = this.a.a;
                krxVar70 = this.a.a;
                krxVar71 = this.a.a;
                krxVar72 = this.a.a;
                krxVar73 = this.a.a;
                krxVar74 = this.a.a;
                krxVar75 = this.a.a;
                return alpt.v(xcfVar, aS, xcfVar2, aW, hV, aB, krx.aw(krxVar67), krx.ba(krxVar68), krx.ay(krxVar69), krx.ar(krxVar70), krx.u(krxVar71), krx.aV(krxVar72), krx.aK(krxVar73), krx.aC(krxVar74), krx.aZ(krxVar75));
            case 74:
                krv krvVar29 = this.a;
                apyaVar156 = krvVar29.iT;
                apyaVar157 = krvVar29.ll;
                apyaVar158 = krvVar29.ay;
                return new qow(apyaVar156, apyaVar157, (anen) apyaVar158.b());
            case 75:
                apyaVar159 = this.a.po;
                ahiy ahiyVar2 = (ahiy) apyaVar159.b();
                apyaVar160 = this.a.bQ;
                arwe arweVar3 = (arwe) apyaVar160.b();
                krv krvVar30 = this.a;
                apyaVar161 = krvVar30.wa;
                krxVar76 = krvVar30.a;
                wul aQ = krx.aQ(krxVar76);
                apyaVar162 = this.a.bU;
                yjf yjfVar = (yjf) apyaVar162.b();
                apyaVar163 = this.a.bV;
                return new yvj(ahiyVar2, arweVar3, apyaVar161, aQ, yjfVar, (xnv) apyaVar163.b());
            case 76:
                krv krvVar31 = this.a;
                apyaVar164 = krvVar31.Hy;
                apyaVar165 = krvVar31.ay;
                anen anenVar6 = (anen) apyaVar165.b();
                krv krvVar32 = this.a;
                krxVar77 = krvVar32.a;
                apyaVar166 = krxVar77.iG;
                apyaVar167 = krvVar32.bB;
                krxVar78 = krvVar32.a;
                apyaVar168 = krxVar78.iJ;
                apyaVar169 = krvVar32.HE;
                return new uln(apyaVar164, apyaVar166, apyaVar169, apyaVar168, apyaVar167, anenVar6);
            case 77:
                apyaVar170 = this.a.n;
                Context context17 = (Context) apyaVar170.b();
                apyaVar171 = this.a.at;
                return new uie(context17, (aksr) apyaVar171.b());
            case 78:
                krxVar79 = this.a.a;
                Set hR = krx.hR(krxVar79);
                apyaVar172 = this.a.yg;
                krxVar80 = this.a.a;
                apyaVar173 = krxVar80.iI;
                return new ugu(hR, apyaVar173);
            case 79:
                apyaVar174 = this.a.ff;
                return new zfj((Object) apyaVar174);
            case 80:
                apyaVar175 = this.a.ff;
                return new zfh((Object) apyaVar175, (byte[]) null);
            case 81:
                return new osj() { // from class: nvm
                };
            case 82:
                krxVar81 = this.a.a;
                apyaVar176 = krxVar81.iL;
                return new wfh((aiwu) apyaVar176.b(), (byte[]) null);
            case 83:
                krxVar82 = this.a.a;
                aknt bn = krx.bn(krxVar82);
                krv krvVar33 = this.a;
                Qq = krvVar33.Qq();
                apyaVar177 = krvVar33.aT;
                return wuj.n(bn, Qq, (agcp) apyaVar177.b());
            case 84:
                apyaVar178 = this.a.bN;
                return new pqg() { // from class: ppt
                    @Override // defpackage.pqg
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_firebase_init");
                    }
                };
            case 85:
                apyaVar179 = this.a.ff;
                return new izc((Object) apyaVar179);
            case 86:
                apyaVar180 = this.a.ff;
                return new lpg((Object) apyaVar180);
            case 87:
                apyaVar181 = this.a.n;
                Context context18 = (Context) apyaVar181.b();
                apyaVar182 = this.a.cc;
                agnq agnqVar2 = (agnq) apyaVar182.b();
                krv krvVar34 = this.a;
                apyaVar183 = krvVar34.jN;
                apyaVar184 = krvVar34.dw;
                apyaVar185 = krvVar34.xD;
                qyn qynVar = (qyn) apyaVar185.b();
                apyaVar186 = this.a.oi;
                yul yulVar = (yul) apyaVar186.b();
                apyaVar187 = this.a.eN;
                zxy zxyVar = (zxy) apyaVar187.b();
                apyaVar188 = this.a.fl;
                uhj uhjVar = (uhj) apyaVar188.b();
                apyaVar189 = this.a.z;
                return new ukh(context18, agnqVar2, apyaVar183, apyaVar184, qynVar, yulVar, zxyVar, uhjVar, (anen) apyaVar189.b());
            case 88:
                apyaVar190 = this.a.oi;
                yul yulVar2 = (yul) apyaVar190.b();
                apyaVar191 = this.a.uX;
                ytw ytwVar = (ytw) apyaVar191.b();
                apyaVar192 = this.a.bB;
                mbl mblVar = (mbl) apyaVar192.b();
                apyaVar193 = this.a.m;
                return new uki(yulVar2, ytwVar, mblVar, (anen) apyaVar193.b());
            case 89:
                xzf xzfVar = new xzf();
                krxVar83 = this.a.a;
                apyaVar194 = krxVar83.iY;
                xyj xyjVar = (xyj) apyaVar194.b();
                vkg vkgVar = new vkg();
                krxVar84 = this.a.a;
                return alpt.t(xzfVar, xyjVar, vkgVar, krx.aX(krxVar84));
            case 90:
                krxVar85 = this.a.a;
                t = alpt.t(new xyg(krxVar85.iX, (anen) krxVar85.a.m.b()), new mdm((ngu) krxVar85.a.tU.b()), (xye) krxVar85.iR.b(), (xye) krxVar85.iW.b());
                return new xyi(t);
            case 91:
                alpr i8 = alpt.i(4);
                krxVar86 = this.a.a;
                i8.j(krx.hM(krxVar86));
                krxVar87 = this.a.a;
                i8.j(krx.hN(krxVar87));
                krxVar88 = this.a.a;
                i8.j(krx.hO(krxVar88));
                apyaVar195 = this.a.pd;
                i8.c((xyf) apyaVar195.b());
                return i8.g();
            case 92:
                apyaVar196 = this.a.dn;
                return new abcq(apyaVar196);
            case 93:
                krv krvVar35 = this.a;
                apyaVar197 = krvVar35.av;
                apyaVar198 = krvVar35.we;
                apyaVar199 = krvVar35.dF;
                apya a7 = apxz.a();
                apyaVar200 = krvVar35.ij;
                apyaVar201 = krvVar35.m;
                aneo aneoVar = (aneo) apyaVar201.b();
                apyaVar202 = this.a.ay;
                aneo aneoVar2 = (aneo) apyaVar202.b();
                krv krvVar36 = this.a;
                apyaVar203 = krvVar36.go;
                krxVar89 = krvVar36.a;
                apyaVar204 = krxVar89.iS;
                krxVar90 = krvVar36.a;
                apyaVar205 = krxVar90.iT;
                krxVar91 = krvVar36.a;
                apyaVar206 = krxVar91.iU;
                krxVar92 = krvVar36.a;
                apyaVar207 = krxVar92.iV;
                return new kpa(apyaVar197, apyaVar198, apyaVar199, a7, apyaVar200, aneoVar, aneoVar2, apyaVar203, apyaVar204, apyaVar205, apyaVar206, apyaVar207);
            case 94:
                apyaVar208 = this.a.bN;
                return new olo() { // from class: nse
                    @Override // defpackage.olo
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.schedule_tachyon_binding_with_lightweight_executor");
                    }
                };
            case 95:
                apyaVar209 = this.a.bN;
                return new olq() { // from class: nsg
                    @Override // defpackage.olq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_async_application_state_callbacks_for_tachyon_bind_application");
                    }
                };
            case 96:
                apyaVar210 = this.a.bN;
                return new pow() { // from class: poi
                    @Override // defpackage.pow
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.migrate_tachygram_app_start_binding_to_shared");
                    }
                };
            case 97:
                apyaVar211 = this.a.dO;
                arwe arweVar4 = (arwe) apyaVar211.b();
                apyaVar212 = this.a.dN;
                arpi arpiVar = (arpi) apyaVar212.b();
                apyaVar213 = this.a.dj;
                arpi arpiVar2 = (arpi) apyaVar213.b();
                krv krvVar37 = this.a;
                apyaVar214 = krvVar37.dF;
                apyaVar215 = krvVar37.go;
                apyaVar216 = krvVar37.ij;
                apyaVar217 = krvVar37.we;
                return new vcl(arweVar4, arpiVar, arpiVar2, apyaVar214, apyaVar215, apyaVar216, apyaVar217);
            case 98:
                hW = krx.hW();
                return new zfh(hW);
            case 99:
                krv krvVar38 = this.a;
                krxVar93 = krvVar38.a;
                ocy D = krx.D(krxVar93);
                krxVar94 = krvVar38.a;
                apyaVar218 = krxVar94.iZ;
                apyaVar219 = krvVar38.z;
                return qwx.f(D, apyaVar218, (Executor) apyaVar219.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        Object KE;
        krx krxVar;
        krx krxVar2;
        krx krxVar3;
        apya apyaVar;
        ahiy Ra;
        apya apyaVar2;
        apya apyaVar3;
        krx krxVar4;
        apya apyaVar4;
        apya apyaVar5;
        apya apyaVar6;
        apya apyaVar7;
        apya apyaVar8;
        krx krxVar5;
        apya apyaVar9;
        apya apyaVar10;
        apya apyaVar11;
        apya apyaVar12;
        apya apyaVar13;
        krx krxVar6;
        apya apyaVar14;
        ahiy Ra2;
        apya apyaVar15;
        apya apyaVar16;
        apya apyaVar17;
        apya apyaVar18;
        apya apyaVar19;
        apya apyaVar20;
        apya apyaVar21;
        krx krxVar7;
        apya apyaVar22;
        krx krxVar8;
        apya apyaVar23;
        apya apyaVar24;
        apya apyaVar25;
        krx krxVar9;
        apya apyaVar26;
        krx krxVar10;
        apya apyaVar27;
        krx krxVar11;
        apya apyaVar28;
        apya apyaVar29;
        apya apyaVar30;
        apya apyaVar31;
        apya apyaVar32;
        apya apyaVar33;
        apya apyaVar34;
        apya apyaVar35;
        apya apyaVar36;
        apya apyaVar37;
        apya apyaVar38;
        apya apyaVar39;
        apya apyaVar40;
        apya apyaVar41;
        apya apyaVar42;
        apya apyaVar43;
        apya apyaVar44;
        apya apyaVar45;
        apya apyaVar46;
        apya apyaVar47;
        apya apyaVar48;
        apya apyaVar49;
        apya apyaVar50;
        apya apyaVar51;
        apya apyaVar52;
        apya apyaVar53;
        apya apyaVar54;
        apya apyaVar55;
        krx krxVar12;
        krx krxVar13;
        apya apyaVar56;
        krx krxVar14;
        apya apyaVar57;
        krx krxVar15;
        apya apyaVar58;
        krx krxVar16;
        apya apyaVar59;
        krx krxVar17;
        apya apyaVar60;
        krx krxVar18;
        apya apyaVar61;
        apya apyaVar62;
        apya apyaVar63;
        krx krxVar19;
        apya apyaVar64;
        apya apyaVar65;
        krx krxVar20;
        apya apyaVar66;
        krx krxVar21;
        apya apyaVar67;
        apya apyaVar68;
        apya apyaVar69;
        apya apyaVar70;
        apya apyaVar71;
        krx krxVar22;
        apya apyaVar72;
        apya apyaVar73;
        krx krxVar23;
        apya apyaVar74;
        apya apyaVar75;
        apya apyaVar76;
        krx krxVar24;
        apya apyaVar77;
        apya apyaVar78;
        apya apyaVar79;
        krx krxVar25;
        apya apyaVar80;
        apya apyaVar81;
        apya apyaVar82;
        apya apyaVar83;
        krx krxVar26;
        apya apyaVar84;
        krx krxVar27;
        apya apyaVar85;
        krx krxVar28;
        apya apyaVar86;
        apya apyaVar87;
        krx krxVar29;
        apya apyaVar88;
        apya apyaVar89;
        krx krxVar30;
        apya apyaVar90;
        apya apyaVar91;
        apya apyaVar92;
        apya apyaVar93;
        apya apyaVar94;
        krx krxVar31;
        apya apyaVar95;
        krx krxVar32;
        apya apyaVar96;
        apya apyaVar97;
        apya apyaVar98;
        apya apyaVar99;
        apya apyaVar100;
        krx krxVar33;
        apya apyaVar101;
        krx krxVar34;
        apya apyaVar102;
        apya apyaVar103;
        apya apyaVar104;
        apya apyaVar105;
        apya apyaVar106;
        krx krxVar35;
        krx krxVar36;
        apya apyaVar107;
        apya apyaVar108;
        apya apyaVar109;
        apya apyaVar110;
        apya apyaVar111;
        apya apyaVar112;
        apya apyaVar113;
        krx krxVar37;
        apya apyaVar114;
        apya apyaVar115;
        krx krxVar38;
        Set v;
        krx krxVar39;
        apya apyaVar116;
        alhm Qq;
        apya apyaVar117;
        final apya apyaVar118;
        final apya apyaVar119;
        final apya apyaVar120;
        apya apyaVar121;
        apya apyaVar122;
        apya apyaVar123;
        apya apyaVar124;
        apya apyaVar125;
        apya apyaVar126;
        apya apyaVar127;
        apya apyaVar128;
        apya apyaVar129;
        apya apyaVar130;
        krx krxVar40;
        apya apyaVar131;
        apya apyaVar132;
        apya apyaVar133;
        apya apyaVar134;
        apya apyaVar135;
        apya apyaVar136;
        apya apyaVar137;
        apya apyaVar138;
        apya apyaVar139;
        apya apyaVar140;
        krx krxVar41;
        krx krxVar42;
        krx krxVar43;
        apya apyaVar141;
        apya apyaVar142;
        apya apyaVar143;
        apya apyaVar144;
        krx krxVar44;
        apya apyaVar145;
        apya apyaVar146;
        apya apyaVar147;
        krx krxVar45;
        apya apyaVar148;
        krx krxVar46;
        alhm Qq2;
        apya apyaVar149;
        final apya apyaVar150;
        apya apyaVar151;
        apya apyaVar152;
        final apya apyaVar153;
        final apya apyaVar154;
        final apya apyaVar155;
        krx krxVar47;
        apya apyaVar156;
        apya apyaVar157;
        krx krxVar48;
        krx krxVar49;
        apya apyaVar158;
        apya apyaVar159;
        apya apyaVar160;
        apya apyaVar161;
        apya apyaVar162;
        apya apyaVar163;
        apya apyaVar164;
        apya apyaVar165;
        apya apyaVar166;
        krx krxVar50;
        apya apyaVar167;
        final apya apyaVar168;
        apya apyaVar169;
        krx krxVar51;
        krx krxVar52;
        apya apyaVar170;
        ahiy Ra3;
        apya apyaVar171;
        apya apyaVar172;
        apya apyaVar173;
        apya apyaVar174;
        apya apyaVar175;
        apya apyaVar176;
        krx krxVar53;
        apya apyaVar177;
        ahiy Ra4;
        apya apyaVar178;
        krx krxVar54;
        apya apyaVar179;
        krx krxVar55;
        apya apyaVar180;
        ahiy Ra5;
        krx krxVar56;
        krx krxVar57;
        apya apyaVar181;
        ahiy Ra6;
        apya apyaVar182;
        apya apyaVar183;
        apya apyaVar184;
        apya apyaVar185;
        apya apyaVar186;
        apya apyaVar187;
        krx krxVar58;
        apya apyaVar188;
        ahiy Ra7;
        apya apyaVar189;
        apya apyaVar190;
        apya apyaVar191;
        krx krxVar59;
        apya apyaVar192;
        krx krxVar60;
        apya apyaVar193;
        apya apyaVar194;
        krx krxVar61;
        apya apyaVar195;
        apya apyaVar196;
        apya apyaVar197;
        apya apyaVar198;
        apya apyaVar199;
        apya apyaVar200;
        krx krxVar62;
        apya apyaVar201;
        krx krxVar63;
        apya apyaVar202;
        apya apyaVar203;
        apya apyaVar204;
        apya apyaVar205;
        apya apyaVar206;
        krx krxVar64;
        boolean a;
        apya apyaVar207;
        krx krxVar65;
        apya apyaVar208;
        apya apyaVar209;
        final apya apyaVar210;
        apya apyaVar211;
        krx krxVar66;
        apya apyaVar212;
        krx krxVar67;
        apya apyaVar213;
        apya apyaVar214;
        krx krxVar68;
        apya apyaVar215;
        apya apyaVar216;
        apya apyaVar217;
        apya apyaVar218;
        apya apyaVar219;
        apya apyaVar220;
        krx krxVar69;
        apya apyaVar221;
        krx krxVar70;
        apya apyaVar222;
        apya apyaVar223;
        krx krxVar71;
        apya apyaVar224;
        apya apyaVar225;
        krx krxVar72;
        apya apyaVar226;
        apya apyaVar227;
        apya apyaVar228;
        apya apyaVar229;
        krx krxVar73;
        apya apyaVar230;
        apya apyaVar231;
        apya apyaVar232;
        apya apyaVar233;
        apya apyaVar234;
        krx krxVar74;
        apya apyaVar235;
        krx krxVar75;
        apya apyaVar236;
        krx krxVar76;
        apya apyaVar237;
        apya apyaVar238;
        apya apyaVar239;
        apya apyaVar240;
        apya apyaVar241;
        apya apyaVar242;
        krx krxVar77;
        apya apyaVar243;
        krx krxVar78;
        apya apyaVar244;
        krx krxVar79;
        apya apyaVar245;
        apya apyaVar246;
        apya apyaVar247;
        apya apyaVar248;
        apya apyaVar249;
        apya apyaVar250;
        apya apyaVar251;
        krx krxVar80;
        apya apyaVar252;
        apya apyaVar253;
        apya apyaVar254;
        apya apyaVar255;
        apya apyaVar256;
        apya apyaVar257;
        krx krxVar81;
        apya apyaVar258;
        krx krxVar82;
        apya apyaVar259;
        apya apyaVar260;
        final apya apyaVar261;
        apya apyaVar262;
        final apya apyaVar263;
        krx krxVar83;
        apya apyaVar264;
        ahiy Ra8;
        apya apyaVar265;
        apya apyaVar266;
        apya apyaVar267;
        apya apyaVar268;
        krx krxVar84;
        apya apyaVar269;
        krx krxVar85;
        apya apyaVar270;
        apya apyaVar271;
        apya apyaVar272;
        apya apyaVar273;
        krx krxVar86;
        apya apyaVar274;
        krx krxVar87;
        apya apyaVar275;
        apya apyaVar276;
        final apya apyaVar277;
        final apya apyaVar278;
        krx krxVar88;
        apya apyaVar279;
        ahiy Ra9;
        apya apyaVar280;
        krx krxVar89;
        wpd jg;
        apya apyaVar281;
        apya apyaVar282;
        apya apyaVar283;
        apya apyaVar284;
        ojm aS;
        krx krxVar90;
        apya apyaVar285;
        apya apyaVar286;
        krx krxVar91;
        krx krxVar92;
        apya apyaVar287;
        ahiy Ra10;
        krx krxVar93;
        apya apyaVar288;
        apya apyaVar289;
        apya apyaVar290;
        apya apyaVar291;
        apya apyaVar292;
        apya apyaVar293;
        apya apyaVar294;
        apya apyaVar295;
        apya apyaVar296;
        apya apyaVar297;
        apya apyaVar298;
        apya apyaVar299;
        apya apyaVar300;
        apya apyaVar301;
        krx krxVar94;
        rdc iz;
        krx krxVar95;
        apya apyaVar302;
        apya apyaVar303;
        krx krxVar96;
        apya apyaVar304;
        final apya apyaVar305;
        krx krxVar97;
        apya apyaVar306;
        ahiy Ra11;
        krx krxVar98;
        apya apyaVar307;
        krx krxVar99;
        apya apyaVar308;
        apya apyaVar309;
        apya apyaVar310;
        apya apyaVar311;
        apya apyaVar312;
        apya apyaVar313;
        apya apyaVar314;
        krx krxVar100;
        apya apyaVar315;
        apya apyaVar316;
        krx krxVar101;
        apya apyaVar317;
        apya apyaVar318;
        apya apyaVar319;
        apya apyaVar320;
        krx krxVar102;
        apya apyaVar321;
        krx krxVar103;
        apya apyaVar322;
        apya apyaVar323;
        apya apyaVar324;
        apya apyaVar325;
        apya apyaVar326;
        apya apyaVar327;
        apya apyaVar328;
        apya apyaVar329;
        krx krxVar104;
        apya apyaVar330;
        apya apyaVar331;
        apya apyaVar332;
        apya apyaVar333;
        apya apyaVar334;
        apya apyaVar335;
        final apya apyaVar336;
        final apya apyaVar337;
        krx krxVar105;
        apya apyaVar338;
        ahiy Ra12;
        apya apyaVar339;
        apya apyaVar340;
        apya apyaVar341;
        krx krxVar106;
        apya apyaVar342;
        ahiy Ra13;
        krx krxVar107;
        apya apyaVar343;
        apya apyaVar344;
        akov hH;
        apya apyaVar345;
        apya apyaVar346;
        krx krxVar108;
        apya apyaVar347;
        ahiy Ra14;
        int i = this.b;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                KE = this.a.KE();
                return new qyk((uac) KE, 1, null);
            case 101:
                krxVar = this.a.a;
                return agdj.f(krx.hK(krxVar));
            case 102:
                krxVar2 = this.a.a;
                return new aehr(krx.be(krxVar2));
            case 103:
                krv krvVar = this.a;
                krxVar3 = krvVar.a;
                apyaVar = krxVar3.jc;
                Ra = krvVar.Ra();
                return jsz.q(apyaVar, Ra);
            case 104:
                apyaVar2 = this.a.dO;
                arwe arweVar = (arwe) apyaVar2.b();
                krv krvVar2 = this.a;
                apyaVar3 = krvVar2.vs;
                krxVar4 = krvVar2.a;
                lpw s = krx.s(krxVar4);
                apyaVar4 = this.a.mG;
                return new lpm(arweVar, apyaVar3, s, (aogy) apyaVar4.b());
            case 105:
                apyaVar5 = this.a.bP;
                arpi arpiVar = (arpi) apyaVar5.b();
                apyaVar6 = this.a.dO;
                arwe arweVar2 = (arwe) apyaVar6.b();
                apyaVar7 = this.a.mr;
                uie uieVar = (uie) apyaVar7.b();
                apyaVar8 = this.a.bV;
                xnv xnvVar = (xnv) apyaVar8.b();
                krv krvVar3 = this.a;
                krxVar5 = krvVar3.a;
                apyaVar9 = krxVar5.t;
                apyaVar10 = krvVar3.et;
                apyaVar11 = krvVar3.dA;
                return new nei(arpiVar, arweVar2, uieVar, xnvVar, apyaVar9, apyaVar10, apyaVar11);
            case 106:
                apyaVar12 = this.a.bP;
                arpi arpiVar2 = (arpi) apyaVar12.b();
                apyaVar13 = this.a.cc;
                return new ibi(arpiVar2, (agnq) apyaVar13.b());
            case 107:
                krv krvVar4 = this.a;
                krxVar6 = krvVar4.a;
                apyaVar14 = krxVar6.jF;
                Ra2 = krvVar4.Ra();
                return weg.r(apyaVar14, Ra2);
            case 108:
                apyaVar15 = this.a.dP;
                arwe arweVar3 = (arwe) apyaVar15.b();
                apyaVar16 = this.a.n;
                Context context = (Context) apyaVar16.b();
                krv krvVar5 = this.a;
                apyaVar17 = krvVar5.jZ;
                apyaVar18 = krvVar5.aM;
                apyaVar19 = krvVar5.bV;
                apyaVar20 = krvVar5.av;
                apyaVar21 = krvVar5.gD;
                krxVar7 = krvVar5.a;
                apyaVar22 = krxVar7.u;
                krxVar8 = krvVar5.a;
                apyaVar23 = krxVar8.iC;
                apyaVar24 = krvVar5.pn;
                apyaVar25 = krvVar5.uF;
                krxVar9 = krvVar5.a;
                apyaVar26 = krxVar9.jC;
                krxVar10 = krvVar5.a;
                apyaVar27 = krxVar10.jD;
                krxVar11 = krvVar5.a;
                apyaVar28 = krxVar11.jE;
                apyaVar29 = krvVar5.oT;
                return new wmy(arweVar3, context, apyaVar17, apyaVar18, apyaVar19, apyaVar20, apyaVar21, apyaVar22, apyaVar23, apyaVar24, apyaVar25, apyaVar26, apyaVar27, apyaVar28, apyaVar29);
            case 109:
                apyaVar30 = this.a.n;
                Context context2 = (Context) apyaVar30.b();
                apyaVar31 = this.a.nW;
                trn trnVar = (trn) apyaVar31.b();
                apyaVar32 = this.a.aF;
                yjy yjyVar = (yjy) apyaVar32.b();
                apyaVar33 = this.a.cu;
                yhu yhuVar = (yhu) apyaVar33.b();
                apyaVar34 = this.a.gD;
                mho mhoVar = (mho) apyaVar34.b();
                apyaVar35 = this.a.bB;
                mbl mblVar = (mbl) apyaVar35.b();
                apyaVar36 = this.a.uT;
                apwt a2 = apxv.a(apyaVar36);
                krv krvVar6 = this.a;
                apyaVar37 = krvVar6.bY;
                apyaVar38 = krvVar6.eN;
                zxy zxyVar = (zxy) apyaVar38.b();
                apyaVar39 = this.a.gY;
                xyt xytVar = (xyt) apyaVar39.b();
                apyaVar40 = this.a.bO;
                yjr yjrVar = (yjr) apyaVar40.b();
                apyaVar41 = this.a.au;
                apyaVar42 = this.a.av;
                ykw ykwVar = (ykw) apyaVar42.b();
                apyaVar43 = this.a.bU;
                yjf yjfVar = (yjf) apyaVar43.b();
                apyaVar44 = this.a.bV;
                xnv xnvVar2 = (xnv) apyaVar44.b();
                apyaVar45 = this.a.aG;
                Optional optional = (Optional) apyaVar45.b();
                apyaVar46 = this.a.vj;
                lpg lpgVar = (lpg) apyaVar46.b();
                apyaVar47 = this.a.vk;
                xvu xvuVar = (xvu) apyaVar47.b();
                apyaVar48 = this.a.dt;
                vqu vquVar = (vqu) apyaVar48.b();
                apyaVar49 = this.a.pk;
                men menVar = (men) apyaVar49.b();
                apyaVar50 = this.a.pn;
                mek mekVar = (mek) apyaVar50.b();
                apyaVar51 = this.a.gN;
                mdt mdtVar = (mdt) apyaVar51.b();
                apyaVar52 = this.a.z;
                anen anenVar = (anen) apyaVar52.b();
                apyaVar53 = this.a.m;
                anen anenVar2 = (anen) apyaVar53.b();
                apyaVar54 = this.a.ay;
                anen anenVar3 = (anen) apyaVar54.b();
                apyaVar55 = this.a.aB;
                adtn adtnVar = (adtn) apyaVar55.b();
                krxVar12 = this.a.a;
                zai iT = krx.iT(krxVar12);
                krv krvVar7 = this.a;
                krxVar13 = krvVar7.a;
                apyaVar56 = krxVar13.z;
                Optional empty = Optional.empty();
                Optional of = Optional.of(krv.JU(krvVar7));
                krv krvVar8 = this.a;
                krxVar14 = krvVar8.a;
                apyaVar57 = krxVar14.jj;
                krxVar15 = krvVar8.a;
                apyaVar58 = krxVar15.jk;
                krxVar16 = krvVar8.a;
                apyaVar59 = krxVar16.jl;
                krxVar17 = krvVar8.a;
                apyaVar60 = krxVar17.jm;
                krxVar18 = krvVar8.a;
                apyaVar61 = krxVar18.jn;
                apyaVar62 = krvVar8.BG;
                apyaVar63 = krvVar8.oj;
                krxVar19 = krvVar8.a;
                apyaVar64 = krxVar19.jp;
                apyaVar65 = krvVar8.oi;
                Optional empty2 = Optional.empty();
                krxVar20 = krvVar8.a;
                apyaVar66 = krxVar20.jq;
                krv krvVar9 = this.a;
                krxVar21 = krvVar9.a;
                apyaVar67 = krxVar21.jr;
                apyaVar68 = krvVar9.ky;
                apyaVar69 = krvVar9.uJ;
                Optional of2 = Optional.of(apyaVar69);
                apyaVar70 = this.a.yk;
                Optional of3 = Optional.of(apyaVar70);
                krv krvVar10 = this.a;
                Optional empty3 = Optional.empty();
                apyaVar71 = krvVar10.vq;
                krxVar22 = krvVar10.a;
                apyaVar72 = krxVar22.A;
                krv krvVar11 = this.a;
                apyaVar73 = krvVar11.on;
                krxVar23 = krvVar11.a;
                apyaVar74 = krxVar23.js;
                apyaVar75 = krvVar11.rp;
                apyaVar76 = krvVar11.uq;
                krxVar24 = krvVar11.a;
                apyaVar77 = krxVar24.jw;
                apyaVar78 = krvVar11.dq;
                apyaVar79 = krvVar11.gb;
                krxVar25 = krvVar11.a;
                apyaVar80 = krxVar25.jx;
                apyaVar81 = krvVar11.sN;
                apyaVar82 = krvVar11.dF;
                apyaVar83 = krvVar11.vF;
                krxVar26 = krvVar11.a;
                apyaVar84 = krxVar26.jy;
                krxVar27 = krvVar11.a;
                apyaVar85 = krxVar27.jz;
                krxVar28 = krvVar11.a;
                apyaVar86 = krxVar28.jA;
                return new mfo(context2, trnVar, yjyVar, yhuVar, mhoVar, mblVar, a2, apyaVar37, zxyVar, xytVar, yjrVar, ykwVar, yjfVar, xnvVar2, optional, lpgVar, xvuVar, vquVar, menVar, mekVar, mdtVar, anenVar, anenVar2, anenVar3, adtnVar, iT, apyaVar56, empty, of, apyaVar57, apyaVar58, apyaVar59, apyaVar60, apyaVar61, apyaVar62, apyaVar63, apyaVar64, apyaVar65, empty2, apyaVar66, apyaVar67, apyaVar68, of2, of3, empty3, apyaVar71, apyaVar72, apyaVar73, apyaVar74, apyaVar75, apyaVar76, apyaVar77, apyaVar78, apyaVar79, apyaVar80, apyaVar81, apyaVar82, apyaVar83, apyaVar84, apyaVar85, apyaVar86);
            case 110:
                krv krvVar12 = this.a;
                apyaVar87 = krvVar12.n;
                krxVar29 = krvVar12.a;
                apyaVar88 = krxVar29.u;
                apyaVar89 = krvVar12.bB;
                krxVar30 = krvVar12.a;
                apyaVar90 = krxVar30.jh;
                apyaVar91 = krvVar12.jY;
                apyaVar92 = krvVar12.jW;
                apyaVar93 = krvVar12.z;
                apyaVar94 = krvVar12.ay;
                krxVar31 = krvVar12.a;
                apyaVar95 = krxVar31.ji;
                return new rfd(apyaVar87, apyaVar88, apyaVar89, apyaVar90, apyaVar91, apyaVar92, apyaVar93, apyaVar94, apyaVar95);
            case 111:
                krxVar32 = this.a.a;
                apyaVar96 = krxVar32.u;
                mfo mfoVar = (mfo) apyaVar96.b();
                apyaVar97 = this.a.vX;
                lzy lzyVar = (lzy) apyaVar97.b();
                apyaVar98 = this.a.gY;
                xyt xytVar2 = (xyt) apyaVar98.b();
                apyaVar99 = this.a.z;
                anen anenVar4 = (anen) apyaVar99.b();
                apyaVar100 = this.a.ay;
                anen anenVar5 = (anen) apyaVar100.b();
                krv krvVar13 = this.a;
                krxVar33 = krvVar13.a;
                apyaVar101 = krxVar33.v;
                krxVar34 = krvVar13.a;
                apyaVar102 = krxVar34.y;
                apyaVar103 = krvVar13.m;
                anen anenVar6 = (anen) apyaVar103.b();
                krv krvVar14 = this.a;
                apyaVar104 = krvVar14.hw;
                apyaVar105 = krvVar14.fY;
                apyaVar106 = krvVar14.gl;
                krxVar35 = krvVar14.a;
                orv L = krx.L(krxVar35);
                krxVar36 = krvVar14.a;
                return new lig(mfoVar, lzyVar, xytVar2, anenVar4, anenVar5, apyaVar101, apyaVar102, anenVar6, apyaVar104, apyaVar105, apyaVar106, L, krx.bb(krxVar36));
            case 112:
                krv krvVar15 = this.a;
                apyaVar107 = krvVar15.wh;
                apyaVar108 = krvVar15.n;
                Context context3 = (Context) apyaVar108.b();
                apyaVar109 = this.a.bV;
                xnv xnvVar3 = (xnv) apyaVar109.b();
                apyaVar110 = this.a.wj;
                abqa abqaVar = (abqa) apyaVar110.b();
                apyaVar111 = this.a.av;
                ykw ykwVar2 = (ykw) apyaVar111.b();
                apyaVar112 = this.a.m;
                anen anenVar7 = (anen) apyaVar112.b();
                apyaVar113 = this.a.ay;
                return new zas(apyaVar107, context3, xnvVar3, abqaVar, ykwVar2, anenVar7, (anen) apyaVar113.b());
            case 113:
                krxVar37 = this.a.a;
                apyaVar114 = krxVar37.v;
                zas zasVar = (zas) apyaVar114.b();
                apyaVar115 = this.a.m;
                anen anenVar8 = (anen) apyaVar115.b();
                krxVar38 = this.a.a;
                v = alpt.v(new yfj((zas) krxVar38.v.b(), (wfh) krxVar38.w.b(), 1), new yff(), new yfh((zas) krxVar38.v.b(), (wfh) krxVar38.w.b(), krxVar38.x, (arwe) krxVar38.a.dO.b(), (arpi) krxVar38.a.dN.b(), krxVar38.jf), new yfi(krxVar38.jg, (arwe) krxVar38.a.dO.b(), krxVar38.a.hr), new yfj((zas) krxVar38.v.b(), (wfh) krxVar38.w.b(), 0), new yfk(krxVar38.a.oC), new yfj((zas) krxVar38.v.b(), (wfh) krxVar38.w.b(), 2), new yfj((zas) krxVar38.v.b(), (wfh) krxVar38.w.b(), 3));
                return new zai(zasVar, anenVar8, v, new yfg());
            case 114:
                krxVar39 = this.a.a;
                apyaVar116 = krxVar39.je;
                return new wfh((aiwu) apyaVar116.b(), (byte[]) null);
            case 115:
                krv krvVar16 = this.a;
                aknt f = xrh.f();
                Qq = krvVar16.Qq();
                apyaVar117 = krvVar16.aT;
                return xrh.t(f, Qq, (agcp) apyaVar117.b());
            case 116:
                apyaVar118 = this.a.bN;
                return new ora() { // from class: nup
                    @Override // defpackage.ora
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_rcs_disabled_survey");
                    }
                };
            case 117:
                apyaVar119 = this.a.bN;
                return new pod() { // from class: pob
                    @Override // defpackage.pod
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.extend_rcs_disabled_survey_eligibility");
                    }
                };
            case 118:
                apyaVar120 = this.a.bN;
                return new poc() { // from class: poa
                    @Override // defpackage.poc
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_rcs_disabled_v2_survey");
                    }
                };
            case 119:
                return Long.valueOf(akmm.p(krv.RR(this.a)));
            case 120:
                krv krvVar17 = this.a;
                apyaVar121 = krvVar17.gD;
                apyaVar122 = krvVar17.bY;
                apyaVar123 = krvVar17.bV;
                xnv xnvVar4 = (xnv) apyaVar123.b();
                apyaVar124 = this.a.z;
                return new abau(apyaVar121, apyaVar122, xnvVar4, (anen) apyaVar124.b());
            case 121:
                krv krvVar18 = this.a;
                apyaVar125 = krvVar18.eB;
                itw itwVar = new itw(6);
                apyaVar126 = krvVar18.m;
                return new yyq(apyaVar125, itwVar, (Executor) apyaVar126.b());
            case 122:
                krv krvVar19 = this.a;
                apyaVar127 = krvVar19.bY;
                apyaVar128 = krvVar19.z;
                return new lxe(apyaVar127, (anen) apyaVar128.b());
            case 123:
                return Optional.of(new vom());
            case 124:
                apyaVar129 = this.a.m;
                anen anenVar9 = (anen) apyaVar129.b();
                apyaVar130 = this.a.gN;
                mdt mdtVar2 = (mdt) apyaVar130.b();
                krxVar40 = this.a.a;
                apyaVar131 = krxVar40.jo;
                return new mfh(anenVar9, mdtVar2, apyaVar131);
            case 125:
                apyaVar132 = this.a.n;
                return mbf.c((Context) apyaVar132.b());
            case 126:
                return new lga();
            case 127:
                krv krvVar20 = this.a;
                apyaVar133 = krvVar20.bY;
                apyaVar134 = krvVar20.le;
                apyaVar135 = krvVar20.de;
                apyaVar136 = krvVar20.m;
                return new qrg(apyaVar133, apyaVar134, apyaVar135, (anen) apyaVar136.b());
            case 128:
                krv krvVar21 = this.a;
                apyaVar137 = krvVar21.bY;
                apyaVar138 = krvVar21.n;
                return new vco(apyaVar137, (Context) apyaVar138.b(), (char[]) null);
            case 129:
                apyaVar139 = this.a.eB;
                itw itwVar2 = new itw(1);
                apyaVar140 = this.a.m;
                return new ijp(apyaVar139, itwVar2, (Executor) apyaVar140.b());
            case 130:
                krxVar41 = this.a.a;
                qlk ap = krx.ap(krxVar41);
                krxVar42 = this.a.a;
                return alpt.r(ap, krx.w(krxVar42));
            case 131:
                krxVar43 = this.a.a;
                return Boolean.valueOf(aqjv.n(krx.iY(krxVar43)));
            case 132:
                apyaVar141 = this.a.dj;
                arpi arpiVar3 = (arpi) apyaVar141.b();
                apyaVar142 = this.a.dP;
                arwe arweVar4 = (arwe) apyaVar142.b();
                krv krvVar22 = this.a;
                apyaVar143 = krvVar22.fX;
                apyaVar144 = krvVar22.vq;
                krxVar44 = krvVar22.a;
                apyaVar145 = krxVar44.jv;
                return new zai(arpiVar3, arweVar4, apyaVar143, apyaVar144, apyaVar145);
            case 133:
                apyaVar146 = this.a.dj;
                arpi arpiVar4 = (arpi) apyaVar146.b();
                apyaVar147 = this.a.dP;
                arwe arweVar5 = (arwe) apyaVar147.b();
                krxVar45 = this.a.a;
                apyaVar148 = krxVar45.ju;
                return new uac(arpiVar4, arweVar5, (aiwu) apyaVar148.b());
            case 134:
                krxVar46 = this.a.a;
                aknt bm = krx.bm(krxVar46);
                krv krvVar23 = this.a;
                Qq2 = krvVar23.Qq();
                apyaVar149 = krvVar23.aT;
                return uxd.l(bm, Qq2, (agcp) apyaVar149.b());
            case 135:
                apyaVar150 = this.a.bN;
                return new odr() { // from class: nmh
                    @Override // defpackage.odr
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_adding_exception_handler_to_gaia_sign_in_pds");
                    }
                };
            case 136:
                apyaVar151 = this.a.sg;
                vco vcoVar = (vco) apyaVar151.b();
                apyaVar152 = this.a.ci;
                return new uac(vcoVar, (mbl) apyaVar152.b());
            case 137:
                apyaVar153 = this.a.bN;
                return new pet() { // from class: pep
                    @Override // defpackage.pet
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_new_gaia_status_logging");
                    }
                };
            case 138:
                apyaVar154 = this.a.bN;
                return new odw() { // from class: nmk
                    @Override // defpackage.odw
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_crash_handling_for_gaia_sign_in_data_logger");
                    }
                };
            case 139:
                apyaVar155 = this.a.bN;
                return new pqy() { // from class: pqw
                    @Override // defpackage.pqy
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_last_search_time_logging");
                    }
                };
            case 140:
                krxVar47 = this.a.a;
                apyaVar156 = krxVar47.C;
                wns wnsVar = (wns) apyaVar156.b();
                krv krvVar24 = this.a;
                wsd fj = krv.fj(krvVar24);
                apyaVar157 = krvVar24.td;
                wns wnsVar2 = (wns) apyaVar157.b();
                krxVar48 = this.a.a;
                lwm t = krx.t(krxVar48);
                krxVar49 = this.a.a;
                return alpt.u(wnsVar, fj, wnsVar2, t, krx.aM(krxVar49));
            case 141:
                apyaVar158 = this.a.dO;
                arwe arweVar6 = (arwe) apyaVar158.b();
                krv krvVar25 = this.a;
                apyaVar159 = krvVar25.xg;
                apyaVar160 = krvVar25.Mc;
                apyaVar161 = krvVar25.xp;
                apyaVar162 = krvVar25.aM;
                yjv yjvVar = (yjv) apyaVar162.b();
                krv krvVar26 = this.a;
                apyaVar163 = krvVar26.xo;
                apyaVar164 = krvVar26.mG;
                apyaVar165 = krvVar26.Sf;
                apyaVar166 = krvVar26.wL;
                krxVar50 = krvVar26.a;
                apyaVar167 = krxVar50.jB;
                return new qlh(arweVar6, apyaVar159, apyaVar160, apyaVar161, yjvVar, apyaVar163, apyaVar164, apyaVar165, apyaVar166, apyaVar167);
            case 142:
                apyaVar168 = this.a.bN;
                return new oxh() { // from class: oxe
                    @Override // defpackage.oxh
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.import_on_recipient_sync_enabled");
                    }
                };
            case 143:
                apyaVar169 = this.a.mG;
                return new qre((aogy) apyaVar169.b());
            case 144:
                krxVar51 = this.a.a;
                return Optional.of(krx.hx(krxVar51));
            case 145:
                krv krvVar27 = this.a;
                krxVar52 = krvVar27.a;
                apyaVar170 = krxVar52.jH;
                Ra3 = krvVar27.Ra();
                return qlp.t(apyaVar170, Ra3);
            case 146:
                apyaVar171 = this.a.dO;
                arwe arweVar7 = (arwe) apyaVar171.b();
                apyaVar172 = this.a.xf;
                qnu qnuVar = (qnu) apyaVar172.b();
                krv krvVar28 = this.a;
                apyaVar173 = krvVar28.xi;
                apyaVar174 = krvVar28.mG;
                aogy aogyVar = (aogy) apyaVar174.b();
                krv krvVar29 = this.a;
                apyaVar175 = krvVar29.wJ;
                apyaVar176 = krvVar29.xo;
                return new qnp(arweVar7, qnuVar, apyaVar173, aogyVar, apyaVar175, apyaVar176);
            case 147:
                krv krvVar30 = this.a;
                krxVar53 = krvVar30.a;
                apyaVar177 = krxVar53.jJ;
                Ra4 = krvVar30.Ra();
                return qlp.s(apyaVar177, Ra4);
            case 148:
                apyaVar178 = this.a.dO;
                arwe arweVar8 = (arwe) apyaVar178.b();
                krxVar54 = this.a.a;
                apyaVar179 = krxVar54.C;
                return new qle(arweVar8, apyaVar179);
            case 149:
                krv krvVar31 = this.a;
                krxVar55 = krvVar31.a;
                apyaVar180 = krxVar55.jL;
                Ra5 = krvVar31.Ra();
                return qlp.v(apyaVar180, Ra5);
            case 150:
                krxVar56 = this.a.a;
                return new qrc(krx.aq(krxVar56));
            case 151:
                krv krvVar32 = this.a;
                krxVar57 = krvVar32.a;
                apyaVar181 = krxVar57.jN;
                Ra6 = krvVar32.Ra();
                return qlp.u(apyaVar181, Ra6);
            case 152:
                apyaVar182 = this.a.dO;
                arwe arweVar9 = (arwe) apyaVar182.b();
                apyaVar183 = this.a.xf;
                qnu qnuVar2 = (qnu) apyaVar183.b();
                krv krvVar33 = this.a;
                apyaVar184 = krvVar33.xk;
                apyaVar185 = krvVar33.mG;
                aogy aogyVar2 = (aogy) apyaVar185.b();
                krv krvVar34 = this.a;
                apyaVar186 = krvVar34.wJ;
                apyaVar187 = krvVar34.xo;
                return new qob(arweVar9, qnuVar2, apyaVar184, aogyVar2, apyaVar186, apyaVar187);
            case 153:
                krv krvVar35 = this.a;
                krxVar58 = krvVar35.a;
                apyaVar188 = krxVar58.kc;
                Ra7 = krvVar35.Ra();
                return weg.o(apyaVar188, Ra7);
            case 154:
                apyaVar189 = this.a.n;
                Context context4 = (Context) apyaVar189.b();
                krv krvVar36 = this.a;
                apyaVar190 = krvVar36.gC;
                apyaVar191 = krvVar36.gj;
                krxVar59 = krvVar36.a;
                apyaVar192 = krxVar59.E;
                krxVar60 = krvVar36.a;
                apyaVar193 = krxVar60.K;
                apyaVar194 = krvVar36.gY;
                krxVar61 = krvVar36.a;
                apyaVar195 = krxVar61.jR;
                apyaVar196 = krvVar36.ay;
                anen anenVar10 = (anen) apyaVar196.b();
                krv krvVar37 = this.a;
                apyaVar197 = krvVar37.sT;
                apyaVar198 = krvVar37.sY;
                oqx bf = krv.bf(krvVar37);
                apyaVar199 = krvVar37.fM;
                apyaVar200 = krvVar37.ht;
                krxVar62 = krvVar37.a;
                apyaVar201 = krxVar62.kb;
                return new wjp(context4, apyaVar190, apyaVar191, apyaVar192, apyaVar193, apyaVar194, apyaVar195, anenVar10, apyaVar197, apyaVar198, bf, apyaVar199, apyaVar200, apyaVar201);
            case 155:
                krxVar63 = this.a.a;
                apyaVar202 = krxVar63.D;
                aday adayVar = (aday) apyaVar202.b();
                apyaVar203 = this.a.gJ;
                adtl adtlVar = (adtl) apyaVar203.b();
                apyaVar204 = this.a.gj;
                adnv adnvVar = (adnv) apyaVar204.b();
                apyaVar205 = this.a.gC;
                adnk adnkVar = (adnk) apyaVar205.b();
                apyaVar206 = this.a.fM;
                vau vauVar = (vau) apyaVar206.b();
                krxVar64 = this.a.a;
                a = ((ojw) krxVar64.jQ.b()).a();
                return new adlx(adayVar, adtlVar, adnvVar, adnkVar, vauVar, a);
            case 156:
                apyaVar207 = this.a.n;
                Context context5 = (Context) apyaVar207.b();
                krxVar65 = this.a.a;
                apyaVar208 = krxVar65.jP;
                return new aday(context5, apyaVar208, (byte[]) null);
            case 157:
                apyaVar209 = this.a.bN;
                return new acwg(apyaVar209);
            case 158:
                apyaVar210 = this.a.bN;
                return new ojw() { // from class: nqn
                    @Override // defpackage.ojw
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_mobile_configuration_retriever_for_provisioning_request_builder");
                    }
                };
            case 159:
                apyaVar211 = this.a.sT;
                acnz acnzVar = (acnz) apyaVar211.b();
                krxVar66 = this.a.a;
                apyaVar212 = krxVar66.jR;
                adae adaeVar = (adae) apyaVar212.b();
                krxVar67 = this.a.a;
                apyaVar213 = krxVar67.F;
                adtl adtlVar2 = (adtl) apyaVar213.b();
                apyaVar214 = this.a.gJ;
                adtl adtlVar3 = (adtl) apyaVar214.b();
                krxVar68 = this.a.a;
                apyaVar215 = krxVar68.J;
                adko adkoVar = (adko) apyaVar215.b();
                apyaVar216 = this.a.aF;
                yjy yjyVar2 = (yjy) apyaVar216.b();
                apyaVar217 = this.a.ay;
                ExecutorService executorService = (ExecutorService) apyaVar217.b();
                krv krvVar38 = this.a;
                apyaVar218 = krvVar38.gz;
                apyaVar219 = krvVar38.gB;
                apyaVar220 = krvVar38.fM;
                return new adks(acnzVar, adaeVar, adtlVar2, adtlVar3, adkoVar, yjyVar2, executorService, apyaVar218, apyaVar219, apyaVar220);
            case 160:
                krxVar69 = this.a.a;
                return new adae(krx.ig(krxVar69));
            case 161:
                apyaVar221 = this.a.n;
                Context context6 = (Context) apyaVar221.b();
                krxVar70 = this.a.a;
                adnb bd = krx.bd(krxVar70);
                apyaVar222 = this.a.aF;
                return new adtl(context6, bd, (yjy) apyaVar222.b());
            case 162:
                apyaVar223 = this.a.n;
                Context context7 = (Context) apyaVar223.b();
                krxVar71 = this.a.a;
                apyaVar224 = krxVar71.jS;
                acoe acoeVar = (acoe) apyaVar224.b();
                apyaVar225 = this.a.fJ;
                aduu aduuVar = (aduu) apyaVar225.b();
                krxVar72 = this.a.a;
                apyaVar226 = krxVar72.I;
                adnt adntVar = (adnt) apyaVar226.b();
                apyaVar227 = this.a.bO;
                yjr yjrVar2 = (yjr) apyaVar227.b();
                apyaVar228 = this.a.gC;
                adnk adnkVar2 = (adnk) apyaVar228.b();
                apyaVar229 = this.a.aB;
                adtn adtnVar2 = (adtn) apyaVar229.b();
                krxVar73 = this.a.a;
                apyaVar230 = krxVar73.jV;
                adaw adawVar = (adaw) apyaVar230.b();
                apyaVar231 = this.a.gJ;
                adtl adtlVar4 = (adtl) apyaVar231.b();
                krv krvVar39 = this.a;
                apyaVar232 = krvVar39.gz;
                apyaVar233 = krvVar39.gB;
                apyaVar234 = krvVar39.fY;
                krxVar74 = krvVar39.a;
                apyaVar235 = krxVar74.jY;
                krxVar75 = krvVar39.a;
                apyaVar236 = krxVar75.jZ;
                krxVar76 = krvVar39.a;
                apyaVar237 = krxVar76.ka;
                return new adko(context7, acoeVar, aduuVar, adntVar, yjrVar2, adnkVar2, adtnVar2, adawVar, adtlVar4, apyaVar232, apyaVar233, apyaVar234, apyaVar235, apyaVar236, apyaVar237);
            case 163:
                apyaVar238 = this.a.gk;
                adeo adeoVar = (adeo) apyaVar238.b();
                apyaVar239 = this.a.aB;
                adtn adtnVar3 = (adtn) apyaVar239.b();
                krv krvVar40 = this.a;
                amnn e = weg.e();
                apyaVar240 = krvVar40.ay;
                anen anenVar11 = (anen) apyaVar240.b();
                apyaVar241 = this.a.gl;
                return new acoe(adeoVar, adtnVar3, e, anenVar11, (acnu) apyaVar241.b());
            case 164:
                apyaVar242 = this.a.n;
                Context context8 = (Context) apyaVar242.b();
                krxVar77 = this.a.a;
                apyaVar243 = krxVar77.G;
                atsg atsgVar = (atsg) apyaVar243.b();
                krxVar78 = this.a.a;
                apyaVar244 = krxVar78.jU;
                acoe acoeVar2 = (acoe) apyaVar244.b();
                krv krvVar41 = this.a;
                krxVar79 = krvVar41.a;
                apyaVar245 = krxVar79.H;
                apyaVar246 = krvVar41.ay;
                anen anenVar12 = (anen) apyaVar246.b();
                krv krvVar42 = this.a;
                apyaVar247 = krvVar42.gz;
                apyaVar248 = krvVar42.gB;
                apyaVar249 = krvVar42.gl;
                return new adnt(context8, atsgVar, acoeVar2, apyaVar245, anenVar12, apyaVar247, apyaVar248, apyaVar249);
            case 165:
                apyaVar250 = this.a.z;
                anen anenVar13 = (anen) apyaVar250.b();
                apyaVar251 = this.a.KM;
                agcp agcpVar = (agcp) apyaVar251.b();
                krxVar80 = this.a.a;
                return ahkm.p(anenVar13, agcpVar, krx.hL(krxVar80));
            case 166:
                return ahkm.g();
            case 167:
                apyaVar252 = this.a.gk;
                adeo adeoVar2 = (adeo) apyaVar252.b();
                apyaVar253 = this.a.aB;
                adtn adtnVar4 = (adtn) apyaVar253.b();
                krv krvVar43 = this.a;
                amnn e2 = weg.e();
                apyaVar254 = krvVar43.ay;
                anen anenVar14 = (anen) apyaVar254.b();
                apyaVar255 = this.a.gl;
                return new acoe(adeoVar2, adtnVar4, e2, anenVar14, (acnu) apyaVar255.b());
            case 168:
                apyaVar256 = this.a.bN;
                return new acvt(apyaVar256);
            case 169:
                apyaVar257 = this.a.gx;
                return new adaw((aduw) apyaVar257.b());
            case 170:
                krv krvVar44 = this.a;
                krxVar81 = krvVar44.a;
                apyaVar258 = krxVar81.jW;
                krxVar82 = krvVar44.a;
                apyaVar259 = krxVar82.jX;
                return Boolean.valueOf(adom.l(apyaVar258, apyaVar259));
            case 171:
                apyaVar260 = this.a.bN;
                return new acvy(apyaVar260);
            case 172:
                apyaVar261 = this.a.bN;
                return new olz() { // from class: nsn
                    @Override // defpackage.olz
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_sim_subscription_info_for_iccid_binding_in_bugle");
                    }
                };
            case 173:
                apyaVar262 = this.a.bN;
                return new acuz(apyaVar262);
            case 174:
                return new acuu();
            case 175:
                apyaVar263 = this.a.bN;
                return new pmn() { // from class: pmd
                    @Override // defpackage.pmn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.skip_disable_request_on_disabled_not_default_sms_app");
                    }
                };
            case 176:
                krv krvVar45 = this.a;
                krxVar83 = krvVar45.a;
                apyaVar264 = krxVar83.kg;
                Ra8 = krvVar45.Ra();
                return weg.p(apyaVar264, Ra8);
            case 177:
                apyaVar265 = this.a.n;
                Context context9 = (Context) apyaVar265.b();
                krv krvVar46 = this.a;
                apyaVar266 = krvVar46.gC;
                apyaVar267 = krvVar46.gJ;
                apyaVar268 = krvVar46.gj;
                krxVar84 = krvVar46.a;
                apyaVar269 = krxVar84.E;
                krxVar85 = krvVar46.a;
                apyaVar270 = krxVar85.K;
                apyaVar271 = krvVar46.gY;
                apyaVar272 = krvVar46.ay;
                anen anenVar15 = (anen) apyaVar272.b();
                krv krvVar47 = this.a;
                apyaVar273 = krvVar47.fY;
                krxVar86 = krvVar47.a;
                apyaVar274 = krxVar86.ke;
                krxVar87 = krvVar47.a;
                apyaVar275 = krxVar87.kf;
                apyaVar276 = krvVar47.fM;
                return new wjq(context9, apyaVar266, apyaVar267, apyaVar268, apyaVar269, apyaVar270, apyaVar271, anenVar15, apyaVar273, apyaVar274, apyaVar275, apyaVar276);
            case 178:
                apyaVar277 = this.a.bN;
                return new acxn() { // from class: acvv
                    @Override // defpackage.acxn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.use_new_apis_notify_rcs_unavailable_worker");
                    }
                };
            case 179:
                apyaVar278 = this.a.bN;
                return new oiu() { // from class: npo
                    @Override // defpackage.oiu
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.make_notify_rcs_unavailable_worker_multi_sim_aware");
                    }
                };
            case 180:
                krv krvVar48 = this.a;
                krxVar88 = krvVar48.a;
                apyaVar279 = krxVar88.kj;
                Ra9 = krvVar48.Ra();
                return weg.s(apyaVar279, Ra9);
            case 181:
                apyaVar280 = this.a.Lz;
                lgg lggVar = (lgg) apyaVar280.b();
                krxVar89 = this.a.a;
                jg = krxVar89.jg();
                apyaVar281 = this.a.dR;
                qvv qvvVar = (qvv) apyaVar281.b();
                apyaVar282 = this.a.jl;
                qvr qvrVar = (qvr) apyaVar282.b();
                apyaVar283 = this.a.dS;
                xyt xytVar3 = (xyt) apyaVar283.b();
                apyaVar284 = this.a.mG;
                aogy aogyVar3 = (aogy) apyaVar284.b();
                krv krvVar49 = this.a;
                aS = krvVar49.aS();
                krxVar90 = krvVar49.a;
                Duration hv = krx.hv(krxVar90);
                apyaVar285 = this.a.dP;
                arwe arweVar10 = (arwe) apyaVar285.b();
                apyaVar286 = this.a.dj;
                return new wph(lggVar, jg, qvvVar, qvrVar, xytVar3, aogyVar3, aS, hv, arweVar10, (arpi) apyaVar286.b());
            case 182:
                krxVar91 = this.a.a;
                return Long.valueOf(aqjx.h(krx.iU(krxVar91)));
            case 183:
                krv krvVar50 = this.a;
                krxVar92 = krvVar50.a;
                apyaVar287 = krxVar92.kn;
                Ra10 = krvVar50.Ra();
                return uxd.j(apyaVar287, Ra10);
            case 184:
                krxVar93 = this.a.a;
                apyaVar288 = krxVar93.km;
                return new vyf(apyaVar288);
            case 185:
                apyaVar289 = this.a.bV;
                xnv xnvVar5 = (xnv) apyaVar289.b();
                apyaVar290 = this.a.z;
                anen anenVar16 = (anen) apyaVar290.b();
                apyaVar291 = this.a.m;
                anen anenVar17 = (anen) apyaVar291.b();
                krv krvVar51 = this.a;
                apyaVar292 = krvVar51.lP;
                apyaVar293 = krvVar51.et;
                apyaVar294 = krvVar51.eQ;
                apyaVar295 = krvVar51.hE;
                apyaVar296 = krvVar51.mH;
                apyaVar297 = krvVar51.iU;
                apyaVar298 = krvVar51.gD;
                apyaVar299 = krvVar51.dd;
                apyaVar300 = krvVar51.kP;
                apyaVar301 = krvVar51.hG;
                psw pswVar = (psw) apyaVar301.b();
                krxVar94 = this.a.a;
                iz = krxVar94.iz();
                krv krvVar52 = this.a;
                krxVar95 = krvVar52.a;
                oqt J = krx.J(krxVar95);
                apyaVar302 = krvVar52.GB;
                apyaVar303 = krvVar52.dF;
                krxVar96 = krvVar52.a;
                apyaVar304 = krxVar96.kl;
                return new vyd(xnvVar5, anenVar16, anenVar17, apyaVar292, apyaVar293, apyaVar294, apyaVar295, apyaVar296, apyaVar297, apyaVar298, apyaVar299, apyaVar300, pswVar, iz, J, apyaVar302, apyaVar303, apyaVar304);
            case 186:
                apyaVar305 = this.a.bN;
                return new okv() { // from class: nrl
                    @Override // defpackage.okv
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_provisioning_engine_initialization_in_rcs_limbo_resolver");
                    }
                };
            case 187:
                krv krvVar53 = this.a;
                krxVar97 = krvVar53.a;
                apyaVar306 = krxVar97.kr;
                Ra11 = krvVar53.Ra();
                return weg.q(apyaVar306, Ra11);
            case 188:
                krv krvVar54 = this.a;
                krxVar98 = krvVar54.a;
                apyaVar307 = krxVar98.O;
                krxVar99 = krvVar54.a;
                apyaVar308 = krxVar99.L;
                apyaVar309 = krvVar54.gY;
                apyaVar310 = krvVar54.m;
                aneo aneoVar = (aneo) apyaVar310.b();
                apyaVar311 = this.a.z;
                anen anenVar18 = (anen) apyaVar311.b();
                krv krvVar55 = this.a;
                apyaVar312 = krvVar55.hr;
                apyaVar313 = krvVar55.cE;
                apyaVar314 = krvVar55.ay;
                anen anenVar19 = (anen) apyaVar314.b();
                krxVar100 = this.a.a;
                apyaVar315 = krxVar100.kq;
                return new wka(apyaVar307, apyaVar308, apyaVar309, aneoVar, anenVar18, apyaVar312, apyaVar313, anenVar19, apyaVar315);
            case 189:
                apyaVar316 = this.a.n;
                Context context10 = (Context) apyaVar316.b();
                krv krvVar56 = this.a;
                krxVar101 = krvVar56.a;
                apyaVar317 = krxVar101.kp;
                apyaVar318 = krvVar56.gC;
                adnk adnkVar3 = (adnk) apyaVar318.b();
                apyaVar319 = this.a.sT;
                acnz acnzVar2 = (acnz) apyaVar319.b();
                apyaVar320 = this.a.gJ;
                adtl adtlVar5 = (adtl) apyaVar320.b();
                krxVar102 = this.a.a;
                apyaVar321 = krxVar102.L;
                adih adihVar = (adih) apyaVar321.b();
                krxVar103 = this.a.a;
                apyaVar322 = krxVar103.M;
                adkd adkdVar = (adkd) apyaVar322.b();
                apyaVar323 = this.a.z;
                anen anenVar20 = (anen) apyaVar323.b();
                apyaVar324 = this.a.fM;
                vau vauVar2 = (vau) apyaVar324.b();
                apyaVar325 = this.a.hc;
                vjs vjsVar = (vjs) apyaVar325.b();
                apyaVar326 = this.a.ay;
                anen anenVar21 = (anen) apyaVar326.b();
                krv krvVar57 = this.a;
                apyaVar327 = krvVar57.sZ;
                apyaVar328 = krvVar57.gz;
                apyaVar329 = krvVar57.gB;
                krxVar104 = krvVar57.a;
                apyaVar330 = krxVar104.N;
                return new adka(context10, apyaVar317, adnkVar3, acnzVar2, adtlVar5, adihVar, adkdVar, anenVar20, vauVar2, vjsVar, anenVar21, apyaVar327, apyaVar328, apyaVar329, (acwl) apyaVar330.b());
            case 190:
                apyaVar331 = this.a.n;
                return new abkm((Context) apyaVar331.b());
            case 191:
                apyaVar332 = this.a.n;
                Context context11 = (Context) apyaVar332.b();
                apyaVar333 = this.a.gC;
                return new adih((Object) context11, apyaVar333.b());
            case 192:
                apyaVar334 = this.a.gC;
                adnk adnkVar4 = (adnk) apyaVar334.b();
                apyaVar335 = this.a.i;
                return new adkd(adnkVar4, (aegu) apyaVar335.b());
            case 193:
                apyaVar336 = this.a.bN;
                return new acwl() { // from class: acut
                    @Override // defpackage.acwl
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.enable_wear_consent_changes");
                    }
                };
            case 194:
                apyaVar337 = this.a.bN;
                return new nxn() { // from class: njm
                    @Override // defpackage.nxn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.cleanup_obsolete_availability_usage");
                    }
                };
            case 195:
                krv krvVar58 = this.a;
                krxVar105 = krvVar58.a;
                apyaVar338 = krxVar105.kt;
                Ra12 = krvVar58.Ra();
                return wuj.l(apyaVar338, Ra12);
            case 196:
                apyaVar339 = this.a.bQ;
                arwe arweVar11 = (arwe) apyaVar339.b();
                apyaVar340 = this.a.dj;
                arpi arpiVar5 = (arpi) apyaVar340.b();
                apyaVar341 = this.a.QP;
                return new wwj(arweVar11, arpiVar5, (wvm) apyaVar341.b());
            case 197:
                krv krvVar59 = this.a;
                krxVar106 = krvVar59.a;
                apyaVar342 = krxVar106.kv;
                Ra13 = krvVar59.Ra();
                return akmm.l(apyaVar342, Ra13);
            case 198:
                krxVar107 = this.a.a;
                apyaVar343 = krxVar107.hS;
                akoi akoiVar = (akoi) apyaVar343.b();
                apyaVar344 = this.a.mG;
                aogy aogyVar4 = (aogy) apyaVar344.b();
                krv krvVar60 = this.a;
                hH = krvVar60.hH();
                apyaVar345 = krvVar60.m;
                anen anenVar22 = (anen) apyaVar345.b();
                apyaVar346 = this.a.bH;
                return new akoy(akoiVar, aogyVar4, hH, anenVar22, ((Boolean) apyaVar346.b()).booleanValue());
            case 199:
                krv krvVar61 = this.a;
                krxVar108 = krvVar61.a;
                apyaVar347 = krxVar108.kx;
                Ra14 = krvVar61.Ra();
                return akmm.m(apyaVar347, Ra14);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        krx krxVar;
        apya apyaVar;
        apya apyaVar2;
        akov hH;
        apya apyaVar3;
        agrk QQ;
        apya apyaVar4;
        krx krxVar2;
        apya apyaVar5;
        ahiy Ra;
        apya apyaVar6;
        ahiy Ra2;
        krx krxVar3;
        apya apyaVar7;
        ahiy Ra3;
        apya apyaVar8;
        apya apyaVar9;
        apya apyaVar10;
        krx krxVar4;
        apya apyaVar11;
        apya apyaVar12;
        apya apyaVar13;
        apya apyaVar14;
        apya apyaVar15;
        apya apyaVar16;
        apya apyaVar17;
        apya apyaVar18;
        krx krxVar5;
        apya apyaVar19;
        apya apyaVar20;
        apya apyaVar21;
        apya apyaVar22;
        apya apyaVar23;
        krx krxVar6;
        krx krxVar7;
        krx krxVar8;
        krx krxVar9;
        arwb Mc;
        krx krxVar10;
        String str;
        apya apyaVar24;
        apya apyaVar25;
        apya apyaVar26;
        apya apyaVar27;
        xti fX;
        apya apyaVar28;
        final apya apyaVar29;
        final apya apyaVar30;
        final apya apyaVar31;
        apya apyaVar32;
        apya apyaVar33;
        apya apyaVar34;
        apya apyaVar35;
        apya apyaVar36;
        apya apyaVar37;
        apya apyaVar38;
        apya apyaVar39;
        apya apyaVar40;
        apya apyaVar41;
        apya apyaVar42;
        apya apyaVar43;
        apya apyaVar44;
        apya apyaVar45;
        krx krxVar11;
        apya apyaVar46;
        apya apyaVar47;
        krx krxVar12;
        apya apyaVar48;
        apya apyaVar49;
        apya apyaVar50;
        krx krxVar13;
        apya apyaVar51;
        krx krxVar14;
        apya apyaVar52;
        apya apyaVar53;
        krx krxVar15;
        apya apyaVar54;
        krx krxVar16;
        apya apyaVar55;
        apya apyaVar56;
        krx krxVar17;
        apya apyaVar57;
        krx krxVar18;
        apya apyaVar58;
        krx krxVar19;
        apya apyaVar59;
        apya apyaVar60;
        krx krxVar20;
        krx krxVar21;
        final apya apyaVar61;
        apya apyaVar62;
        final apya apyaVar63;
        krx krxVar22;
        apya apyaVar64;
        apya apyaVar65;
        apya apyaVar66;
        apya apyaVar67;
        apya apyaVar68;
        apya apyaVar69;
        apya apyaVar70;
        apya apyaVar71;
        apya apyaVar72;
        apya apyaVar73;
        apya apyaVar74;
        apya apyaVar75;
        apya apyaVar76;
        apya apyaVar77;
        apya apyaVar78;
        apya apyaVar79;
        final apya apyaVar80;
        apya apyaVar81;
        apya apyaVar82;
        apya apyaVar83;
        krx krxVar23;
        apya apyaVar84;
        apya apyaVar85;
        apya apyaVar86;
        apya apyaVar87;
        krx krxVar24;
        apya apyaVar88;
        apya apyaVar89;
        apya apyaVar90;
        apya apyaVar91;
        apya apyaVar92;
        krx krxVar25;
        apya apyaVar93;
        final apya apyaVar94;
        apya apyaVar95;
        apya apyaVar96;
        apya apyaVar97;
        apya apyaVar98;
        apya apyaVar99;
        apya apyaVar100;
        apya apyaVar101;
        apya apyaVar102;
        apya apyaVar103;
        apya apyaVar104;
        apya apyaVar105;
        apya apyaVar106;
        apya apyaVar107;
        apya apyaVar108;
        apya apyaVar109;
        apya apyaVar110;
        apya apyaVar111;
        apya apyaVar112;
        apya apyaVar113;
        apya apyaVar114;
        apya apyaVar115;
        apya apyaVar116;
        apya apyaVar117;
        apya apyaVar118;
        apya apyaVar119;
        apya apyaVar120;
        apya apyaVar121;
        apya apyaVar122;
        apya apyaVar123;
        apya apyaVar124;
        apya apyaVar125;
        apya apyaVar126;
        apya apyaVar127;
        krx krxVar26;
        apya apyaVar128;
        apya apyaVar129;
        apya apyaVar130;
        apya apyaVar131;
        apya apyaVar132;
        apya apyaVar133;
        apya apyaVar134;
        apya apyaVar135;
        apya apyaVar136;
        apya apyaVar137;
        apya apyaVar138;
        final apya apyaVar139;
        krx krxVar27;
        krx krxVar28;
        krx krxVar29;
        apya apyaVar140;
        apya apyaVar141;
        apya apyaVar142;
        apya apyaVar143;
        apya apyaVar144;
        apya apyaVar145;
        apya apyaVar146;
        apya apyaVar147;
        apya apyaVar148;
        apya apyaVar149;
        apya apyaVar150;
        apya apyaVar151;
        apya apyaVar152;
        apya apyaVar153;
        apya apyaVar154;
        apya apyaVar155;
        krx krxVar30;
        apya apyaVar156;
        apya apyaVar157;
        krx krxVar31;
        apya apyaVar158;
        apya apyaVar159;
        krx krxVar32;
        apya apyaVar160;
        apya apyaVar161;
        apya apyaVar162;
        apya apyaVar163;
        apya apyaVar164;
        apya apyaVar165;
        krx krxVar33;
        apya apyaVar166;
        apya apyaVar167;
        apya apyaVar168;
        apya apyaVar169;
        apya apyaVar170;
        apya apyaVar171;
        apya apyaVar172;
        apya apyaVar173;
        krx krxVar34;
        apya apyaVar174;
        krx krxVar35;
        apya apyaVar175;
        apya apyaVar176;
        krx krxVar36;
        apya apyaVar177;
        apya apyaVar178;
        apya apyaVar179;
        apya apyaVar180;
        apya apyaVar181;
        apya apyaVar182;
        apya apyaVar183;
        apya apyaVar184;
        apya apyaVar185;
        apya apyaVar186;
        apya apyaVar187;
        apya apyaVar188;
        krx krxVar37;
        apya apyaVar189;
        apya apyaVar190;
        krx krxVar38;
        apya apyaVar191;
        apya apyaVar192;
        apya apyaVar193;
        apya apyaVar194;
        apya apyaVar195;
        apya apyaVar196;
        final apya apyaVar197;
        apya apyaVar198;
        apya apyaVar199;
        apya apyaVar200;
        apya apyaVar201;
        apya apyaVar202;
        krx krxVar39;
        apya apyaVar203;
        apya apyaVar204;
        apya apyaVar205;
        krx krxVar40;
        apya apyaVar206;
        apya apyaVar207;
        apya apyaVar208;
        apya apyaVar209;
        apya apyaVar210;
        apya apyaVar211;
        apya apyaVar212;
        apya apyaVar213;
        apya apyaVar214;
        apya apyaVar215;
        krx krxVar41;
        apya apyaVar216;
        apya apyaVar217;
        apya apyaVar218;
        apya apyaVar219;
        apya apyaVar220;
        krx krxVar42;
        apya apyaVar221;
        apya apyaVar222;
        apya apyaVar223;
        apya apyaVar224;
        apya apyaVar225;
        apya apyaVar226;
        apya apyaVar227;
        apya apyaVar228;
        apya apyaVar229;
        krx krxVar43;
        apya apyaVar230;
        apya apyaVar231;
        krx krxVar44;
        apya apyaVar232;
        final apya apyaVar233;
        apya apyaVar234;
        apya apyaVar235;
        apya apyaVar236;
        apya apyaVar237;
        apya apyaVar238;
        apya apyaVar239;
        apya apyaVar240;
        apya apyaVar241;
        apya apyaVar242;
        apya apyaVar243;
        apya apyaVar244;
        krx krxVar45;
        apya apyaVar245;
        krx krxVar46;
        apya apyaVar246;
        apya apyaVar247;
        apya apyaVar248;
        apya apyaVar249;
        apya apyaVar250;
        apya apyaVar251;
        apya apyaVar252;
        apya apyaVar253;
        apya apyaVar254;
        apya apyaVar255;
        apya apyaVar256;
        apya apyaVar257;
        apya apyaVar258;
        apya apyaVar259;
        apya apyaVar260;
        apya apyaVar261;
        apya apyaVar262;
        apya apyaVar263;
        apya apyaVar264;
        apya apyaVar265;
        apya apyaVar266;
        apya apyaVar267;
        apya apyaVar268;
        krx krxVar47;
        apya apyaVar269;
        apya apyaVar270;
        apya apyaVar271;
        apya apyaVar272;
        apya apyaVar273;
        apya apyaVar274;
        apya apyaVar275;
        apya apyaVar276;
        apya apyaVar277;
        apya apyaVar278;
        apya apyaVar279;
        apya apyaVar280;
        apya apyaVar281;
        apya apyaVar282;
        apya apyaVar283;
        krx krxVar48;
        apya apyaVar284;
        apya apyaVar285;
        apya apyaVar286;
        krx krxVar49;
        apya apyaVar287;
        apya apyaVar288;
        apya apyaVar289;
        apya apyaVar290;
        apya apyaVar291;
        apya apyaVar292;
        apya apyaVar293;
        apya apyaVar294;
        apya apyaVar295;
        apya apyaVar296;
        apya apyaVar297;
        apya apyaVar298;
        apya apyaVar299;
        apya apyaVar300;
        apya apyaVar301;
        apya apyaVar302;
        apya apyaVar303;
        apya apyaVar304;
        apya apyaVar305;
        apya apyaVar306;
        apya apyaVar307;
        apya apyaVar308;
        apya apyaVar309;
        krx krxVar50;
        apya apyaVar310;
        krx krxVar51;
        apya apyaVar311;
        apya apyaVar312;
        apya apyaVar313;
        apya apyaVar314;
        apya apyaVar315;
        apya apyaVar316;
        apya apyaVar317;
        apya apyaVar318;
        apya apyaVar319;
        apya apyaVar320;
        krx krxVar52;
        apya apyaVar321;
        apya apyaVar322;
        apya apyaVar323;
        krx krxVar53;
        apya apyaVar324;
        apya apyaVar325;
        apya apyaVar326;
        krx krxVar54;
        apya apyaVar327;
        apya apyaVar328;
        apya apyaVar329;
        apya apyaVar330;
        apya apyaVar331;
        apya apyaVar332;
        apya apyaVar333;
        apya apyaVar334;
        apya apyaVar335;
        apya apyaVar336;
        apya apyaVar337;
        apya apyaVar338;
        apya apyaVar339;
        apya apyaVar340;
        apya apyaVar341;
        apya apyaVar342;
        apya apyaVar343;
        apya apyaVar344;
        apya apyaVar345;
        apya apyaVar346;
        apya apyaVar347;
        apya apyaVar348;
        apya apyaVar349;
        apya apyaVar350;
        apya apyaVar351;
        apya apyaVar352;
        apya apyaVar353;
        apya apyaVar354;
        krx krxVar55;
        apya apyaVar355;
        krx krxVar56;
        apya apyaVar356;
        apya apyaVar357;
        apya apyaVar358;
        apya apyaVar359;
        apya apyaVar360;
        krx krxVar57;
        apya apyaVar361;
        apya apyaVar362;
        apya apyaVar363;
        apya apyaVar364;
        apya apyaVar365;
        apya apyaVar366;
        apya apyaVar367;
        apya apyaVar368;
        apya apyaVar369;
        apya apyaVar370;
        apya apyaVar371;
        apya apyaVar372;
        apya apyaVar373;
        krx krxVar58;
        apya apyaVar374;
        apya apyaVar375;
        krx krxVar59;
        apya apyaVar376;
        apya apyaVar377;
        apya apyaVar378;
        apya apyaVar379;
        apya apyaVar380;
        apya apyaVar381;
        apya apyaVar382;
        apya apyaVar383;
        apya apyaVar384;
        krx krxVar60;
        apya apyaVar385;
        apya apyaVar386;
        apya apyaVar387;
        apya apyaVar388;
        apya apyaVar389;
        apya apyaVar390;
        apya apyaVar391;
        apya apyaVar392;
        apya apyaVar393;
        apya apyaVar394;
        apya apyaVar395;
        krx krxVar61;
        apya apyaVar396;
        apya apyaVar397;
        krx krxVar62;
        apya apyaVar398;
        apya apyaVar399;
        apya apyaVar400;
        apya apyaVar401;
        apya apyaVar402;
        apya apyaVar403;
        krx krxVar63;
        apya apyaVar404;
        krx krxVar64;
        apya apyaVar405;
        yvt gt;
        final apya apyaVar406;
        apya apyaVar407;
        apya apyaVar408;
        apya apyaVar409;
        apya apyaVar410;
        apya apyaVar411;
        apya apyaVar412;
        apya apyaVar413;
        apya apyaVar414;
        apya apyaVar415;
        apya apyaVar416;
        apya apyaVar417;
        apya apyaVar418;
        apya apyaVar419;
        apya apyaVar420;
        apya apyaVar421;
        apya apyaVar422;
        apya apyaVar423;
        apya apyaVar424;
        apya apyaVar425;
        apya apyaVar426;
        apya apyaVar427;
        apya apyaVar428;
        apya apyaVar429;
        apya apyaVar430;
        apya apyaVar431;
        apya apyaVar432;
        apya apyaVar433;
        apya apyaVar434;
        apya apyaVar435;
        apya apyaVar436;
        apya apyaVar437;
        apya apyaVar438;
        apya apyaVar439;
        apya apyaVar440;
        apya apyaVar441;
        apya apyaVar442;
        apya apyaVar443;
        apya apyaVar444;
        apya apyaVar445;
        apya apyaVar446;
        apya apyaVar447;
        apya apyaVar448;
        apya apyaVar449;
        krx krxVar65;
        apya apyaVar450;
        apya apyaVar451;
        apya apyaVar452;
        apya apyaVar453;
        apya apyaVar454;
        apya apyaVar455;
        apya apyaVar456;
        apya apyaVar457;
        apya apyaVar458;
        apya apyaVar459;
        apya apyaVar460;
        apya apyaVar461;
        apya apyaVar462;
        apya apyaVar463;
        apya apyaVar464;
        krx krxVar66;
        apya apyaVar465;
        apya apyaVar466;
        apya apyaVar467;
        apya apyaVar468;
        krx krxVar67;
        apya apyaVar469;
        apya apyaVar470;
        apya apyaVar471;
        apya apyaVar472;
        apya apyaVar473;
        apya apyaVar474;
        apya apyaVar475;
        krx krxVar68;
        apya apyaVar476;
        apya apyaVar477;
        apya apyaVar478;
        krx krxVar69;
        krx krxVar70;
        krx krxVar71;
        krx krxVar72;
        krx krxVar73;
        krx krxVar74;
        apya apyaVar479;
        apya apyaVar480;
        apya apyaVar481;
        final apya apyaVar482;
        apya apyaVar483;
        apya apyaVar484;
        krx krxVar75;
        apya apyaVar485;
        apya apyaVar486;
        apya apyaVar487;
        apya apyaVar488;
        apya apyaVar489;
        apya apyaVar490;
        apya apyaVar491;
        apya apyaVar492;
        krx krxVar76;
        apya apyaVar493;
        BiFunction LD;
        apya apyaVar494;
        apya apyaVar495;
        apya apyaVar496;
        apya apyaVar497;
        apya apyaVar498;
        apya apyaVar499;
        apya apyaVar500;
        apya apyaVar501;
        apya apyaVar502;
        apya apyaVar503;
        apya apyaVar504;
        apya apyaVar505;
        int i = this.b;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                krxVar = this.a.a;
                apyaVar = krxVar.hS;
                akoi akoiVar = (akoi) apyaVar.b();
                apyaVar2 = this.a.mG;
                aogy aogyVar = (aogy) apyaVar2.b();
                krv krvVar = this.a;
                hH = krvVar.hH();
                apyaVar3 = krvVar.m;
                anen anenVar = (anen) apyaVar3.b();
                krv krvVar2 = this.a;
                QQ = krvVar2.QQ();
                apyaVar4 = krvVar2.bH;
                return new akpa(akoiVar, aogyVar, hH, anenVar, QQ, ((Boolean) apyaVar4.b()).booleanValue());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                krv krvVar3 = this.a;
                krxVar2 = krvVar3.a;
                apyaVar5 = krxVar2.kz;
                Ra = krvVar3.Ra();
                return wuj.m(apyaVar5, Ra);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return new xnk(krv.fL(this.a));
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                krv krvVar4 = this.a;
                apyaVar6 = krvVar4.Tx;
                Ra2 = krvVar4.Ra();
                return ahkm.n(apyaVar6, Ra2);
            case 204:
                krv krvVar5 = this.a;
                krxVar3 = krvVar5.a;
                apyaVar7 = krxVar3.kD;
                Ra3 = krvVar5.Ra();
                return ton.u(apyaVar7, Ra3);
            case 205:
                apyaVar8 = this.a.bV;
                xnv xnvVar = (xnv) apyaVar8.b();
                apyaVar9 = this.a.Rh;
                usk uskVar = (usk) apyaVar9.b();
                apyaVar10 = this.a.Ri;
                usb usbVar = (usb) apyaVar10.b();
                krv krvVar6 = this.a;
                krxVar4 = krvVar6.a;
                apyaVar11 = krxVar4.kC;
                apyaVar12 = krvVar6.mG;
                aogy aogyVar2 = (aogy) apyaVar12.b();
                apyaVar13 = this.a.bQ;
                return new uqd(xnvVar, uskVar, usbVar, apyaVar11, aogyVar2, (arwe) apyaVar13.b());
            case 206:
                apyaVar14 = this.a.bV;
                xnv xnvVar2 = (xnv) apyaVar14.b();
                apyaVar15 = this.a.yu;
                upp uppVar = (upp) apyaVar15.b();
                apyaVar16 = this.a.Rl;
                uqr uqrVar = (uqr) apyaVar16.b();
                apyaVar17 = this.a.mG;
                aogy aogyVar3 = (aogy) apyaVar17.b();
                apyaVar18 = this.a.yt;
                uov uovVar = (uov) apyaVar18.b();
                krv krvVar7 = this.a;
                krxVar5 = krvVar7.a;
                pqt ao = krx.ao(krxVar5);
                apyaVar19 = krvVar7.ci;
                apyaVar20 = krvVar7.bQ;
                arwe arweVar = (arwe) apyaVar20.b();
                apyaVar21 = this.a.dP;
                return new urm(xnvVar2, uppVar, uqrVar, aogyVar3, uovVar, ao, apyaVar19, arweVar, (arwe) apyaVar21.b());
            case 207:
                return new qdq(this, null);
            case 208:
                apyaVar22 = this.a.rI;
                aedw aedwVar = (aedw) apyaVar22.b();
                apyaVar23 = this.a.rK;
                adzl adzlVar = (adzl) apyaVar23.b();
                krxVar6 = this.a.a;
                adwq ih = krx.ih(krxVar6);
                krxVar7 = this.a.a;
                aday iD = krx.iD(krxVar7);
                krxVar8 = this.a.a;
                krxVar8.a.ha();
                krxVar9 = this.a.a;
                krxVar9.a.ha();
                Mc = this.a.Mc();
                return new aeax(aedwVar, adzlVar, ih, iD, Mc);
            case 209:
                krxVar10 = this.a.a;
                str = krxVar10.a.ha().j;
                return acyb.f(str);
            case 210:
                return new qdq(this, null);
            case 211:
                apyaVar24 = this.a.bN;
                return Boolean.valueOf(lgb.V((ansy) apyaVar24.b()));
            case 212:
                apyaVar25 = this.a.n;
                Context context = (Context) apyaVar25.b();
                apyaVar26 = this.a.ej;
                return ton.l(context, apyaVar26);
            case 213:
                return new andr();
            case 214:
                apyaVar27 = this.a.ff;
                return new vyv(apyaVar27);
            case 215:
                krv krvVar8 = this.a;
                fX = krvVar8.fX();
                apyaVar28 = krvVar8.td;
                return alpt.r(fX, (acmr) apyaVar28.b());
            case 216:
                apyaVar29 = this.a.bN;
                return new pbx() { // from class: paf
                    @Override // defpackage.pbx
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.disable_kick_off_update_active_transport_in_ctc_migration");
                    }
                };
            case 217:
                apyaVar30 = this.a.bN;
                return new oqz() { // from class: nun
                    @Override // defpackage.oqz
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.trigger_rcs_provisioning_after_fi_sim_activation");
                    }
                };
            case 218:
                apyaVar31 = this.a.bN;
                return new oqv() { // from class: nul
                    @Override // defpackage.oqv
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.acknowledge_and_check_tycho_intent_in_pre_execute");
                    }
                };
            case 219:
                krv krvVar9 = this.a;
                apyaVar32 = krvVar9.dF;
                apyaVar33 = krvVar9.gC;
                apyaVar34 = krvVar9.gY;
                apyaVar35 = krvVar9.td;
                apyaVar36 = krvVar9.z;
                aneo aneoVar = (aneo) apyaVar36.b();
                apyaVar37 = this.a.ay;
                aneo aneoVar2 = (aneo) apyaVar37.b();
                apyaVar38 = this.a.EC;
                return new lsr(apyaVar32, apyaVar33, apyaVar34, apyaVar35, aneoVar, aneoVar2, apyaVar38);
            case 220:
                krv krvVar10 = this.a;
                apyaVar39 = krvVar10.jZ;
                apyaVar40 = krvVar10.aM;
                apyaVar41 = krvVar10.bV;
                apyaVar42 = krvVar10.av;
                apyaVar43 = krvVar10.az;
                apyaVar44 = krvVar10.bB;
                apyaVar45 = krvVar10.gD;
                krxVar11 = krvVar10.a;
                apyaVar46 = krxVar11.u;
                apyaVar47 = krvVar10.dn;
                Optional of = Optional.of(apyaVar47);
                krv krvVar11 = this.a;
                krxVar12 = krvVar11.a;
                apyaVar48 = krxVar12.iC;
                apyaVar49 = krvVar11.pn;
                apyaVar50 = krvVar11.uF;
                krxVar13 = krvVar11.a;
                apyaVar51 = krxVar13.kI;
                krxVar14 = krvVar11.a;
                apyaVar52 = krxVar14.jC;
                apyaVar53 = krvVar11.iR;
                krxVar15 = krvVar11.a;
                apyaVar54 = krxVar15.jD;
                krxVar16 = krvVar11.a;
                apyaVar55 = krxVar16.jE;
                apyaVar56 = krvVar11.oT;
                krxVar17 = krvVar11.a;
                apyaVar57 = krxVar17.kJ;
                krxVar18 = krvVar11.a;
                apyaVar58 = krxVar18.kK;
                return new wlc(apyaVar39, apyaVar40, apyaVar41, apyaVar42, apyaVar43, apyaVar44, apyaVar45, apyaVar46, of, apyaVar48, apyaVar49, apyaVar50, apyaVar51, apyaVar52, apyaVar53, apyaVar54, apyaVar55, apyaVar56, apyaVar57, apyaVar58);
            case 221:
                krxVar19 = this.a.a;
                apyaVar59 = krxVar19.C;
                wnx wnxVar = (wnx) apyaVar59.b();
                apyaVar60 = this.a.td;
                wnx wnxVar2 = (wnx) apyaVar60.b();
                krxVar20 = this.a.a;
                lwm t = krx.t(krxVar20);
                krxVar21 = this.a.a;
                return alpt.t(wnxVar, wnxVar2, t, krx.aM(krxVar21));
            case 222:
                apyaVar61 = this.a.bN;
                return new pnc() { // from class: pnb
                    @Override // defpackage.pnc
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_work_manager_for_boot_complete");
                    }
                };
            case 223:
                apyaVar62 = this.a.mG;
                return new wfh((aogy) apyaVar62.b());
            case 224:
                apyaVar63 = this.a.bN;
                return new plr() { // from class: plm
                    @Override // defpackage.plr
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.uncaught_exception_receiver_catches_deserialization");
                    }
                };
            case 225:
                return new lpg(krv.KW(this.a));
            case 226:
                krv krvVar12 = this.a;
                krxVar22 = krvVar12.a;
                apyaVar64 = krxVar22.ae;
                apyaVar65 = krvVar12.nW;
                apyaVar66 = krvVar12.oe;
                apya a = apyb.a(apyaVar66);
                krv krvVar13 = this.a;
                apyaVar67 = krvVar13.oa;
                apyaVar68 = krvVar13.lY;
                apyaVar69 = krvVar13.og;
                apyaVar70 = krvVar13.z;
                apyaVar71 = krvVar13.m;
                apyaVar72 = krvVar13.bV;
                apyaVar73 = krvVar13.bB;
                apyaVar74 = krvVar13.rz;
                apyaVar75 = krvVar13.cr;
                return new qyw(apyaVar64, apyaVar65, a, apyaVar67, apyaVar68, apyaVar69, apyaVar70, apyaVar71, apyaVar72, apyaVar73, apyaVar74, apyaVar75);
            case 227:
                apyaVar76 = this.a.n;
                Context context2 = (Context) apyaVar76.b();
                apyaVar77 = this.a.bV;
                return new qyx(context2, (xnv) apyaVar77.b());
            case 228:
                krv krvVar14 = this.a;
                apyaVar78 = krvVar14.fl;
                apyaVar79 = krvVar14.cc;
                return new qzi(apyaVar78, apyaVar79, 1, (byte[]) null);
            case 229:
                apyaVar80 = this.a.bN;
                return new oda() { // from class: nlu
                    @Override // defpackage.oda
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_resolve_mapi_conversation_id_in_delete_message_action");
                    }
                };
            case 230:
                krv krvVar15 = this.a;
                apyaVar81 = krvVar15.dS;
                apyaVar82 = krvVar15.bB;
                return new qze(apyaVar81, apyaVar82);
            case 231:
                krv krvVar16 = this.a;
                apyaVar83 = krvVar16.bV;
                krxVar23 = krvVar16.a;
                apyaVar84 = krxVar23.aj;
                apyaVar85 = krvVar16.xc;
                return new riu(apyaVar83, apyaVar84, apyaVar85, 1, null);
            case 232:
                krv krvVar17 = this.a;
                apyaVar86 = krvVar17.cb;
                apyaVar87 = krvVar17.oh;
                krxVar24 = krvVar17.a;
                apyaVar88 = krxVar24.al;
                return new riu(apyaVar86, apyaVar87, apyaVar88, 0);
            case 233:
                apyaVar89 = this.a.n;
                Context context3 = (Context) apyaVar89.b();
                apyaVar90 = this.a.ec;
                wfh wfhVar = (wfh) apyaVar90.b();
                krv krvVar18 = this.a;
                apyaVar91 = krvVar18.tA;
                apyaVar92 = krvVar18.um;
                krxVar25 = krvVar18.a;
                apyaVar93 = krxVar25.ak;
                return new qxe(context3, wfhVar, apyaVar91, apyaVar92, apyaVar93);
            case 234:
                apyaVar94 = this.a.bN;
                return new ort() { // from class: nva
                    @Override // defpackage.ort
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_mapi_conversation_id_in_pre_r_shortcut");
                    }
                };
            case 235:
                krv krvVar19 = this.a;
                apyaVar95 = krvVar19.n;
                apyaVar96 = krvVar19.fn;
                apyaVar97 = krvVar19.pc;
                apyaVar98 = krvVar19.dm;
                apyaVar99 = krvVar19.jN;
                apyaVar100 = krvVar19.dw;
                apyaVar101 = krvVar19.et;
                apyaVar102 = krvVar19.iS;
                apyaVar103 = krvVar19.bV;
                apyaVar104 = krvVar19.eQ;
                apyaVar105 = krvVar19.cc;
                apyaVar106 = krvVar19.nT;
                apyaVar107 = krvVar19.pp;
                apyaVar108 = krvVar19.fm;
                return new qzo(apyaVar95, apyaVar96, apyaVar97, apyaVar98, apyaVar99, apyaVar100, apyaVar101, apyaVar102, apyaVar103, apyaVar104, apyaVar105, apyaVar106, apyaVar107, apyaVar108);
            case 236:
                apyaVar109 = this.a.bV;
                xnv xnvVar3 = (xnv) apyaVar109.b();
                apyaVar110 = this.a.dx;
                wzs wzsVar = (wzs) apyaVar110.b();
                apyaVar111 = this.a.ko;
                return new wzl(xnvVar3, wzsVar, apyaVar111);
            case 237:
                krv krvVar20 = this.a;
                apyaVar112 = krvVar20.n;
                apyaVar113 = krvVar20.aF;
                apyaVar114 = krvVar20.si;
                apyaVar115 = krvVar20.oB;
                apyaVar116 = krvVar20.bB;
                apyaVar117 = krvVar20.et;
                apyaVar118 = krvVar20.oO;
                apyaVar119 = krvVar20.iV;
                apyaVar120 = krvVar20.dd;
                apyaVar121 = krvVar20.mn;
                apyaVar122 = krvVar20.lC;
                apyaVar123 = krvVar20.dm;
                apyaVar124 = krvVar20.dw;
                apyaVar125 = krvVar20.bV;
                apyaVar126 = krvVar20.sm;
                apyaVar127 = krvVar20.pP;
                return new rjb(apyaVar112, apyaVar113, apyaVar114, apyaVar115, apyaVar116, apyaVar117, apyaVar118, apyaVar119, apyaVar120, apyaVar121, apyaVar122, apyaVar123, apyaVar124, apyaVar125, apyaVar126, apyaVar127);
            case 238:
                krv krvVar21 = this.a;
                krxVar26 = krvVar21.a;
                apyaVar128 = krxVar26.kL;
                apyaVar129 = krvVar21.uy;
                apyaVar130 = krvVar21.xG;
                apyaVar131 = krvVar21.dm;
                apyaVar132 = krvVar21.gD;
                apyaVar133 = krvVar21.bV;
                xnv xnvVar4 = (xnv) apyaVar133.b();
                apyaVar134 = this.a.MW;
                return new rbd(apyaVar128, apyaVar129, apyaVar130, apyaVar131, apyaVar132, xnvVar4, apyaVar134);
            case 239:
                apyaVar135 = this.a.ff;
                return new lpg((Object) apyaVar135);
            case 240:
                apyaVar136 = this.a.aF;
                yjy yjyVar = (yjy) apyaVar136.b();
                apyaVar137 = this.a.dS;
                return new rdc(yjyVar, (xyt) apyaVar137.b());
            case 241:
                apyaVar138 = this.a.bN;
                return Boolean.valueOf(lgb.P((ansy) apyaVar138.b()));
            case 242:
                apyaVar139 = this.a.bN;
                return new pdg() { // from class: pbo
                    @Override // defpackage.pdg
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_chat_readiness_to_determine_whether_to_process_pending_messages");
                    }
                };
            case 243:
                krv krvVar22 = this.a;
                amuk amukVar = amuk.TRANSPORT_RCS;
                krxVar27 = krvVar22.a;
                wfm aJ = krx.aJ(krxVar27);
                krv krvVar23 = this.a;
                amuk amukVar2 = amuk.TRANSPORT_SINGLE_REGISTRATION;
                krxVar28 = krvVar23.a;
                return alor.m(amukVar, aJ, amukVar2, krx.aJ(krxVar28));
            case 244:
                krxVar29 = this.a.a;
                return Long.valueOf(aqjv.c(krx.iX(krxVar29)));
            case 245:
                apyaVar140 = this.a.uQ;
                return new rdc((odn) apyaVar140.b());
            case 246:
                apyaVar141 = this.a.od;
                return new vct(apxv.a(apyaVar141));
            case 247:
                apyaVar142 = this.a.m;
                anen anenVar2 = (anen) apyaVar142.b();
                apyaVar143 = this.a.z;
                anen anenVar3 = (anen) apyaVar143.b();
                krv krvVar24 = this.a;
                apyaVar144 = krvVar24.dr;
                apyaVar145 = krvVar24.iL;
                nfx nfxVar = (nfx) apyaVar145.b();
                apyaVar146 = this.a.nk;
                ndi ndiVar = (ndi) apyaVar146.b();
                apyaVar147 = this.a.nu;
                mlu mluVar = (mlu) apyaVar147.b();
                apyaVar148 = this.a.dA;
                return new wyp(anenVar2, anenVar3, apyaVar144, nfxVar, ndiVar, mluVar, apyaVar148);
            case 248:
                krv krvVar25 = this.a;
                apyaVar149 = krvVar25.nW;
                apyaVar150 = krvVar25.bB;
                apyaVar151 = krvVar25.m;
                apyaVar152 = krvVar25.z;
                apyaVar153 = krvVar25.ay;
                apyaVar154 = krvVar25.dB;
                apyaVar155 = krvVar25.rv;
                krxVar30 = krvVar25.a;
                apyaVar156 = krxVar30.aw;
                apyaVar157 = krvVar25.rz;
                krxVar31 = krvVar25.a;
                apyaVar158 = krxVar31.ay;
                apyaVar159 = krvVar25.fw;
                krxVar32 = krvVar25.a;
                apyaVar160 = krxVar32.kT;
                apyaVar161 = krvVar25.cr;
                apyaVar162 = krvVar25.hG;
                apyaVar163 = krvVar25.dA;
                return new rjd(apyaVar149, apyaVar150, apyaVar151, apyaVar152, apyaVar153, apyaVar154, apyaVar155, apyaVar156, apyaVar157, apyaVar158, apyaVar159, apyaVar160, apyaVar161, apyaVar162, apyaVar163);
            case 249:
                apyaVar164 = this.a.m;
                anen anenVar4 = (anen) apyaVar164.b();
                apyaVar165 = this.a.z;
                anen anenVar5 = (anen) apyaVar165.b();
                krv krvVar26 = this.a;
                krxVar33 = krvVar26.a;
                apyaVar166 = krxVar33.kS;
                apyaVar167 = krvVar26.dd;
                apyaVar168 = krvVar26.ds;
                apyaVar169 = krvVar26.dI;
                apyaVar170 = krvVar26.ee;
                apyaVar171 = krvVar26.dE;
                apyaVar172 = krvVar26.iL;
                return new ahmv(anenVar4, anenVar5, apyaVar166, apyaVar167, apyaVar168, apyaVar169, apyaVar170, apyaVar171, apyaVar172);
            case 250:
                apyaVar173 = this.a.dO;
                arwe arweVar2 = (arwe) apyaVar173.b();
                krv krvVar27 = this.a;
                krxVar34 = krvVar27.a;
                apyaVar174 = krxVar34.kP;
                krxVar35 = krvVar27.a;
                apyaVar175 = krxVar35.kR;
                apyaVar176 = krvVar27.ct;
                ansy ansyVar = (ansy) apyaVar176.b();
                krxVar36 = this.a.a;
                apyaVar177 = krxVar36.kN;
                return new tyb(arweVar2, apyaVar174, apyaVar175, ansyVar, apyaVar177);
            case 251:
                krv krvVar28 = this.a;
                apyaVar178 = krvVar28.bQ;
                apyaVar179 = krvVar28.dO;
                apyaVar180 = krvVar28.dj;
                apyaVar181 = krvVar28.bP;
                apyaVar182 = krvVar28.dN;
                apyaVar183 = krvVar28.dw;
                apyaVar184 = krvVar28.lS;
                apyaVar185 = krvVar28.cF;
                apyaVar186 = krvVar28.dI;
                apyaVar187 = krvVar28.ds;
                apyaVar188 = krvVar28.bV;
                krxVar37 = krvVar28.a;
                apyaVar189 = krxVar37.kN;
                apyaVar190 = krvVar28.dE;
                krxVar38 = krvVar28.a;
                apyaVar191 = krxVar38.kO;
                return new vid(apyaVar178, apyaVar179, apyaVar180, apyaVar181, apyaVar182, apyaVar183, apyaVar184, apyaVar185, apyaVar186, apyaVar187, apyaVar188, apyaVar189, apyaVar190, apyaVar191);
            case 252:
                apyaVar192 = this.a.bP;
                arpi arpiVar = (arpi) apyaVar192.b();
                krv krvVar29 = this.a;
                apyaVar193 = krvVar29.lR;
                apyaVar194 = krvVar29.lS;
                apyaVar195 = krvVar29.cF;
                apyaVar196 = krvVar29.dE;
                return new zai(arpiVar, apyaVar193, apyaVar194, apyaVar195, apyaVar196);
            case 253:
                apyaVar197 = this.a.bN;
                return new ozy() { // from class: pac
                    @Override // defpackage.ozy
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.assert_self_in_e2ee_info_data_source");
                    }
                };
            case 254:
                krv krvVar30 = this.a;
                apyaVar198 = krvVar30.bQ;
                apyaVar199 = krvVar30.bP;
                apyaVar200 = krvVar30.dN;
                apyaVar201 = krvVar30.nk;
                apyaVar202 = krvVar30.mZ;
                krxVar39 = krvVar30.a;
                apyaVar203 = krxVar39.kN;
                apyaVar204 = krvVar30.ds;
                apyaVar205 = krvVar30.bV;
                krxVar40 = krvVar30.a;
                apyaVar206 = krxVar40.kQ;
                apyaVar207 = krvVar30.dE;
                return new uqu(apyaVar198, apyaVar199, apyaVar200, apyaVar201, apyaVar202, apyaVar203, apyaVar204, apyaVar205, apyaVar206, apyaVar207);
            case 255:
                apyaVar208 = this.a.ci;
                return new izc(apyaVar208, (byte[]) null, (byte[]) null, (char[]) null);
            case 256:
                return new ozx() { // from class: pab
                };
            case 257:
                krv krvVar31 = this.a;
                apyaVar209 = krvVar31.et;
                apyaVar210 = krvVar31.bV;
                apyaVar211 = krvVar31.dx;
                apyaVar212 = krvVar31.gD;
                apyaVar213 = krvVar31.cc;
                return new rbr(apyaVar209, apyaVar210, apyaVar211, apyaVar212, apyaVar213);
            case 258:
                apyaVar214 = this.a.ff;
                return new iew(apyaVar214);
            case 259:
                krv krvVar32 = this.a;
                apyaVar215 = krvVar32.lY;
                krxVar41 = krvVar32.a;
                apyaVar216 = krxVar41.aw;
                apyaVar217 = krvVar32.nW;
                apyaVar218 = krvVar32.bB;
                apyaVar219 = krvVar32.m;
                apyaVar220 = krvVar32.z;
                krxVar42 = krvVar32.a;
                apyaVar221 = krxVar42.kU;
                apyaVar222 = krvVar32.rz;
                apyaVar223 = krvVar32.cr;
                return new rjg(apyaVar215, apyaVar216, apyaVar217, apyaVar218, apyaVar219, apyaVar220, apyaVar221, apyaVar222, apyaVar223);
            case 260:
                krv krvVar33 = this.a;
                apyaVar224 = krvVar33.lY;
                apyaVar225 = krvVar33.av;
                return new vco((armf) apyaVar224, (armf) apyaVar225, (byte[]) null);
            case 261:
                krv krvVar34 = this.a;
                apyaVar226 = krvVar34.PQ;
                apyaVar227 = krvVar34.oc;
                apyaVar228 = krvVar34.fh;
                apyaVar229 = krvVar34.z;
                krxVar43 = krvVar34.a;
                apyaVar230 = krxVar43.kV;
                apyaVar231 = krvVar34.nV;
                krxVar44 = krvVar34.a;
                apyaVar232 = krxVar44.kW;
                return new rjo(apyaVar226, apyaVar227, apyaVar228, apyaVar229, apyaVar230, apyaVar231, apyaVar232);
            case 262:
                apyaVar233 = this.a.bN;
                return new ods() { // from class: nmi
                    @Override // defpackage.ods
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_background_action_for_upload_attachments_to_blobstore");
                    }
                };
            case 263:
                krv krvVar35 = this.a;
                apyaVar234 = krvVar35.n;
                apyaVar235 = krvVar35.et;
                apyaVar236 = krvVar35.ko;
                apyaVar237 = krvVar35.aF;
                apyaVar238 = krvVar35.bX;
                apyaVar239 = krvVar35.uy;
                apyaVar240 = krvVar35.iV;
                apyaVar241 = krvVar35.fl;
                apyaVar242 = krvVar35.xJ;
                apyaVar243 = krvVar35.dx;
                apyaVar244 = krvVar35.bV;
                return new rdh(apyaVar234, apyaVar235, apyaVar236, apyaVar237, apyaVar238, apyaVar239, apyaVar240, apyaVar241, apyaVar242, apyaVar243, apyaVar244);
            case 264:
                return new rdj();
            case 265:
                krv krvVar36 = this.a;
                krxVar45 = krvVar36.a;
                apyaVar245 = krxVar45.kZ;
                krxVar46 = krvVar36.a;
                apyaVar246 = krxVar46.kZ;
                return new rdo(apyaVar245, apyaVar246);
            case 266:
                krv krvVar37 = this.a;
                apyaVar247 = krvVar37.n;
                apyaVar248 = krvVar37.jN;
                apyaVar249 = krvVar37.dw;
                apyaVar250 = krvVar37.et;
                apyaVar251 = krvVar37.iS;
                apyaVar252 = krvVar37.GT;
                apyaVar253 = krvVar37.pP;
                apyaVar254 = krvVar37.dm;
                apyaVar255 = krvVar37.bV;
                apyaVar256 = krvVar37.dx;
                apyaVar257 = krvVar37.aF;
                apyaVar258 = krvVar37.hC;
                apyaVar259 = krvVar37.jC;
                apyaVar260 = krvVar37.gD;
                apyaVar261 = krvVar37.oB;
                apyaVar262 = krvVar37.oM;
                apyaVar263 = krvVar37.qX;
                apyaVar264 = krvVar37.hA;
                apyaVar265 = krvVar37.rN;
                apyaVar266 = krvVar37.rO;
                apyaVar267 = krvVar37.pj;
                apyaVar268 = krvVar37.xD;
                krxVar47 = krvVar37.a;
                apyaVar269 = krxVar47.aH;
                apyaVar270 = krvVar37.uy;
                apyaVar271 = krvVar37.iU;
                apyaVar272 = krvVar37.iV;
                apyaVar273 = krvVar37.fl;
                apyaVar274 = krvVar37.pS;
                apyaVar275 = krvVar37.jS;
                apyaVar276 = krvVar37.fn;
                apyaVar277 = krvVar37.mr;
                apyaVar278 = krvVar37.pe;
                apyaVar279 = krvVar37.ko;
                apyaVar280 = krvVar37.mm;
                apyaVar281 = krvVar37.pp;
                apyaVar282 = krvVar37.gQ;
                apyaVar283 = krvVar37.dd;
                krxVar48 = krvVar37.a;
                apyaVar284 = krxVar48.kX;
                apyaVar285 = krvVar37.lk;
                apyaVar286 = krvVar37.nH;
                krxVar49 = krvVar37.a;
                apyaVar287 = krxVar49.kY;
                apyaVar288 = krvVar37.nO;
                apyaVar289 = krvVar37.kC;
                apyaVar290 = krvVar37.oT;
                apyaVar291 = krvVar37.dO;
                apyaVar292 = krvVar37.dN;
                apyaVar293 = krvVar37.bQ;
                apyaVar294 = krvVar37.bP;
                apyaVar295 = krvVar37.dj;
                apyaVar296 = krvVar37.bB;
                apyaVar297 = krvVar37.hw;
                apyaVar298 = krvVar37.ny;
                apyaVar299 = krvVar37.xE;
                apyaVar300 = krvVar37.fa;
                apyaVar301 = krvVar37.uK;
                apyaVar302 = krvVar37.sl;
                apyaVar303 = krvVar37.nQ;
                apyaVar304 = krvVar37.un;
                apyaVar305 = krvVar37.sm;
                apyaVar306 = krvVar37.pK;
                apyaVar307 = krvVar37.KT;
                return new rec(apyaVar247, apyaVar248, apyaVar249, apyaVar250, apyaVar251, apyaVar252, apyaVar253, apyaVar254, apyaVar255, apyaVar256, apyaVar257, apyaVar258, apyaVar259, apyaVar260, apyaVar261, apyaVar262, apyaVar263, apyaVar264, apyaVar265, apyaVar266, apyaVar267, apyaVar268, apyaVar269, apyaVar270, apyaVar271, apyaVar272, apyaVar273, apyaVar274, apyaVar275, apyaVar276, apyaVar277, apyaVar278, apyaVar279, apyaVar280, apyaVar281, apyaVar282, apyaVar283, apyaVar284, apyaVar285, apyaVar286, apyaVar287, apyaVar288, apyaVar289, apyaVar290, apyaVar291, apyaVar292, apyaVar293, apyaVar294, apyaVar295, apyaVar296, apyaVar297, apyaVar298, apyaVar299, apyaVar300, apyaVar301, apyaVar302, apyaVar303, apyaVar304, apyaVar305, apyaVar306, apyaVar307);
            case 267:
                krv krvVar38 = this.a;
                apyaVar308 = krvVar38.n;
                apyaVar309 = krvVar38.pP;
                krxVar50 = krvVar38.a;
                apyaVar310 = krxVar50.aG;
                krxVar51 = krvVar38.a;
                apyaVar311 = krxVar51.aH;
                apyaVar312 = krvVar38.dw;
                apyaVar313 = krvVar38.fn;
                return new rfg(apyaVar308, apyaVar309, apyaVar310, apyaVar311, apyaVar312, apyaVar313);
            case 268:
                krv krvVar39 = this.a;
                apyaVar314 = krvVar39.fa;
                apyaVar315 = krvVar39.bU;
                return new rrh(apyaVar314, apyaVar315);
            case 269:
                return new omg() { // from class: nst
                };
            case 270:
                apyaVar316 = this.a.bV;
                xnv xnvVar5 = (xnv) apyaVar316.b();
                krv krvVar40 = this.a;
                apyaVar317 = krvVar40.et;
                apyaVar318 = krvVar40.dw;
                apyaVar319 = krvVar40.dt;
                return new weo(xnvVar5, apyaVar317, apyaVar318, apyaVar319);
            case 271:
                krv krvVar41 = this.a;
                apyaVar320 = krvVar41.bV;
                krxVar52 = krvVar41.a;
                apyaVar321 = krxVar52.la;
                apyaVar322 = krvVar41.KX;
                return new ref(apyaVar320, apyaVar321, apyaVar322);
            case 272:
                apyaVar323 = this.a.cF;
                return new vyv(apyaVar323);
            case 273:
                krv krvVar42 = this.a;
                krxVar53 = krvVar42.a;
                apyaVar324 = krxVar53.aM;
                apyaVar325 = krvVar42.z;
                apyaVar326 = krvVar42.id;
                krxVar54 = krvVar42.a;
                apyaVar327 = krxVar54.aN;
                return new rei(apyaVar324, apyaVar325, apyaVar326, apyaVar327);
            case 274:
                apyaVar328 = this.a.n;
                Context context4 = (Context) apyaVar328.b();
                krv krvVar43 = this.a;
                apyaVar329 = krvVar43.jN;
                apyaVar330 = krvVar43.dw;
                apyaVar331 = krvVar43.et;
                apyaVar332 = krvVar43.iS;
                apyaVar333 = krvVar43.GT;
                apyaVar334 = krvVar43.pP;
                apyaVar335 = krvVar43.aF;
                apyaVar336 = krvVar43.dm;
                apyaVar337 = krvVar43.es;
                apyaVar338 = krvVar43.rN;
                apyaVar339 = krvVar43.rO;
                apyaVar340 = krvVar43.oZ;
                apyaVar341 = krvVar43.oC;
                apyaVar342 = krvVar43.gD;
                apyaVar343 = krvVar43.oB;
                apyaVar344 = krvVar43.oA;
                apyaVar345 = krvVar43.ph;
                apyaVar346 = krvVar43.pH;
                apyaVar347 = krvVar43.jC;
                apyaVar348 = krvVar43.df;
                apyaVar349 = krvVar43.xD;
                apyaVar350 = krvVar43.Nx;
                apyaVar351 = krvVar43.bV;
                apyaVar352 = krvVar43.cc;
                apyaVar353 = krvVar43.hA;
                apyaVar354 = krvVar43.dW;
                krxVar55 = krvVar43.a;
                apyaVar355 = krxVar55.aL;
                krxVar56 = krvVar43.a;
                apyaVar356 = krxVar56.aH;
                apyaVar357 = krvVar43.fl;
                apyaVar358 = krvVar43.pS;
                apyaVar359 = krvVar43.fn;
                apyaVar360 = krvVar43.eQ;
                krxVar57 = krvVar43.a;
                apyaVar361 = krxVar57.aK;
                apyaVar362 = krvVar43.oj;
                apyaVar363 = krvVar43.pe;
                apyaVar364 = krvVar43.ko;
                apyaVar365 = krvVar43.aL;
                apyaVar366 = krvVar43.eO;
                Optional optional = (Optional) apyaVar366.b();
                krv krvVar44 = this.a;
                apyaVar367 = krvVar44.mm;
                apyaVar368 = krvVar44.pp;
                apyaVar369 = krvVar44.z;
                apyaVar370 = this.a.ay;
                anen anenVar6 = (anen) apyaVar370.b();
                krv krvVar45 = this.a;
                apyaVar371 = krvVar45.nH;
                apyaVar372 = krvVar45.lk;
                apyaVar373 = krvVar45.m;
                krxVar58 = this.a.a;
                apyaVar374 = krxVar58.lc;
                apwt a2 = apxv.a(apyaVar374);
                krv krvVar46 = this.a;
                apyaVar375 = krvVar46.dd;
                krxVar59 = krvVar46.a;
                apyaVar376 = krxVar59.kY;
                apyaVar377 = krvVar46.rR;
                apyaVar378 = krvVar46.id;
                ahqr ahqrVar = (ahqr) apyaVar378.b();
                krv krvVar47 = this.a;
                apyaVar379 = krvVar47.oT;
                apyaVar380 = krvVar47.en;
                apyaVar381 = krvVar47.nO;
                apyaVar382 = krvVar47.sf;
                apyaVar383 = krvVar47.se;
                Optional empty = Optional.empty();
                apyaVar384 = krvVar47.ny;
                krxVar60 = krvVar47.a;
                apyaVar385 = krxVar60.ld;
                krv krvVar48 = this.a;
                apyaVar386 = krvVar48.sk;
                apyaVar387 = krvVar48.uK;
                apyaVar388 = krvVar48.sl;
                apyaVar389 = krvVar48.nQ;
                apyaVar390 = krvVar48.Al;
                apyaVar391 = krvVar48.sm;
                apyaVar392 = krvVar48.iU;
                apyaVar393 = krvVar48.KT;
                vco vcoVar = (vco) apyaVar393.b();
                apyaVar394 = this.a.Nd;
                return new rfa(context4, apyaVar329, apyaVar330, apyaVar331, apyaVar332, apyaVar333, apyaVar334, apyaVar335, apyaVar336, apyaVar337, apyaVar338, apyaVar339, apyaVar340, apyaVar341, apyaVar342, apyaVar343, apyaVar344, apyaVar345, apyaVar346, apyaVar347, apyaVar348, apyaVar349, apyaVar350, apyaVar351, apyaVar352, apyaVar353, apyaVar354, apyaVar355, apyaVar356, apyaVar357, apyaVar358, apyaVar359, apyaVar360, apyaVar361, apyaVar362, apyaVar363, apyaVar364, apyaVar365, optional, apyaVar367, apyaVar368, anenVar6, apyaVar371, apyaVar372, a2, apyaVar375, apyaVar376, apyaVar377, ahqrVar, apyaVar379, apyaVar380, apyaVar381, apyaVar382, apyaVar383, empty, apyaVar384, apyaVar385, apyaVar386, apyaVar387, apyaVar388, apyaVar389, apyaVar390, apyaVar391, apyaVar392, vcoVar, (pmz) apyaVar394.b());
            case 275:
                apyaVar395 = this.a.bB;
                mbl mblVar = (mbl) apyaVar395.b();
                krxVar61 = this.a.a;
                uhs ax = krx.ax(krxVar61);
                apyaVar396 = this.a.bV;
                xnv xnvVar6 = (xnv) apyaVar396.b();
                apyaVar397 = this.a.gD;
                mho mhoVar = (mho) apyaVar397.b();
                krxVar62 = this.a.a;
                apyaVar398 = krxVar62.aK;
                ukd ukdVar = (ukd) apyaVar398.b();
                apyaVar399 = this.a.z;
                anen anenVar7 = (anen) apyaVar399.b();
                apyaVar400 = this.a.m;
                anen anenVar8 = (anen) apyaVar400.b();
                apyaVar401 = this.a.oi;
                yul yulVar = (yul) apyaVar401.b();
                apyaVar402 = this.a.zy;
                yuu yuuVar = (yuu) apyaVar402.b();
                apyaVar403 = this.a.zA;
                return new ukj(mblVar, ax, xnvVar6, mhoVar, ukdVar, anenVar7, anenVar8, yulVar, yuuVar, apyaVar403);
            case 276:
                krxVar63 = this.a.a;
                apyaVar404 = krxVar63.n;
                return new ukd((ukh) apyaVar404.b());
            case 277:
                krxVar64 = this.a.a;
                apyaVar405 = krxVar64.lb;
                return new ibi(apxv.a(apyaVar405), (char[]) null);
            case 278:
                krv krvVar49 = this.a;
                uyd el = krv.el(krvVar49);
                gt = krvVar49.gt();
                return alpt.r(el, gt);
            case 279:
                apyaVar406 = this.a.bN;
                return new nxg() { // from class: njf
                    @Override // defpackage.nxg
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.measuring_performance_difference_for_sms_receiving");
                    }
                };
            case 280:
                apyaVar407 = this.a.id;
                return new lqn((ahqr) apyaVar407.b(), (byte[]) null);
            case 281:
                krv krvVar50 = this.a;
                apyaVar408 = krvVar50.n;
                apyaVar409 = krvVar50.pP;
                apyaVar410 = krvVar50.bV;
                apyaVar411 = krvVar50.es;
                apyaVar412 = krvVar50.jC;
                apyaVar413 = krvVar50.gD;
                apyaVar414 = krvVar50.dx;
                apyaVar415 = krvVar50.jN;
                apyaVar416 = krvVar50.et;
                apyaVar417 = krvVar50.iS;
                apyaVar418 = krvVar50.GT;
                apyaVar419 = krvVar50.dm;
                apyaVar420 = krvVar50.xD;
                apyaVar421 = krvVar50.xb;
                apyaVar422 = krvVar50.pS;
                apyaVar423 = krvVar50.uy;
                apyaVar424 = krvVar50.eQ;
                apyaVar425 = krvVar50.eb;
                apyaVar426 = krvVar50.cc;
                apyaVar427 = krvVar50.ko;
                apyaVar428 = krvVar50.jU;
                apyaVar429 = krvVar50.pp;
                apyaVar430 = krvVar50.oT;
                apyaVar431 = krvVar50.ny;
                apyaVar432 = krvVar50.lk;
                apyaVar433 = krvVar50.nO;
                apyaVar434 = krvVar50.dd;
                return new rfl(apyaVar408, apyaVar409, apyaVar410, apyaVar411, apyaVar412, apyaVar413, apyaVar414, apyaVar415, apyaVar416, apyaVar417, apyaVar418, apyaVar419, apyaVar420, apyaVar421, apyaVar422, apyaVar423, apyaVar424, apyaVar425, apyaVar426, apyaVar427, apyaVar428, apyaVar429, apyaVar430, apyaVar431, apyaVar432, apyaVar433, apyaVar434, 1, null);
            case 282:
                krv krvVar51 = this.a;
                apyaVar435 = krvVar51.n;
                apyaVar436 = krvVar51.jN;
                apyaVar437 = krvVar51.et;
                apyaVar438 = krvVar51.iS;
                apyaVar439 = krvVar51.GT;
                apyaVar440 = krvVar51.lk;
                apyaVar441 = krvVar51.pP;
                apyaVar442 = krvVar51.rN;
                apyaVar443 = krvVar51.rO;
                apyaVar444 = krvVar51.bX;
                apyaVar445 = krvVar51.es;
                apyaVar446 = krvVar51.dm;
                apyaVar447 = krvVar51.gD;
                apyaVar448 = krvVar51.uy;
                apyaVar449 = krvVar51.pS;
                krxVar65 = krvVar51.a;
                apyaVar450 = krxVar65.aO;
                apyaVar451 = krvVar51.eQ;
                apyaVar452 = krvVar51.cc;
                apyaVar453 = krvVar51.ko;
                apyaVar454 = krvVar51.pp;
                apyaVar455 = krvVar51.ny;
                apyaVar456 = krvVar51.oZ;
                apyaVar457 = krvVar51.nO;
                apyaVar458 = krvVar51.dd;
                apyaVar459 = krvVar51.oT;
                apyaVar460 = krvVar51.iU;
                apyaVar461 = krvVar51.nQ;
                return new rfl(apyaVar435, apyaVar436, apyaVar437, apyaVar438, apyaVar439, apyaVar440, apyaVar441, apyaVar442, apyaVar443, apyaVar444, apyaVar445, apyaVar446, apyaVar447, apyaVar448, apyaVar449, apyaVar450, apyaVar451, apyaVar452, apyaVar453, apyaVar454, apyaVar455, apyaVar456, apyaVar457, apyaVar458, apyaVar459, apyaVar460, apyaVar461, 0);
            case 283:
                return new riw();
            case 284:
                krv krvVar52 = this.a;
                apyaVar462 = krvVar52.dw;
                apyaVar463 = krvVar52.pc;
                apyaVar464 = krvVar52.fl;
                return new rip(apyaVar462, apyaVar463, apyaVar464);
            case 285:
                return new rhb();
            case 286:
                krxVar66 = this.a.a;
                apyaVar465 = krxVar66.le;
                return new uac(apyaVar465);
            case 287:
                apyaVar466 = this.a.bV;
                xnv xnvVar7 = (xnv) apyaVar466.b();
                apyaVar467 = this.a.jL;
                return new rht(xnvVar7, (rhk) apyaVar467.b());
            case 288:
                apyaVar468 = this.a.n;
                Context context5 = (Context) apyaVar468.b();
                krv krvVar53 = this.a;
                krxVar67 = krvVar53.a;
                apyaVar469 = krxVar67.aV;
                apyaVar470 = krvVar53.av;
                apyaVar471 = krvVar53.gL;
                apyaVar472 = krvVar53.bU;
                apyaVar473 = krvVar53.bO;
                apyaVar474 = krvVar53.lI;
                apyaVar475 = krvVar53.dI;
                krxVar68 = krvVar53.a;
                apyaVar476 = krxVar68.lf;
                apyaVar477 = krvVar53.fY;
                return new uhv(context5, apyaVar469, apyaVar470, apyaVar471, apyaVar472, apyaVar473, apyaVar474, apyaVar475, apyaVar476, apyaVar477);
            case 289:
                apyaVar478 = this.a.n;
                return new ylu((Context) apyaVar478.b());
            case 290:
                krxVar69 = this.a.a;
                return new vjs(krx.aP(krxVar69), (byte[]) null);
            case 291:
                krv krvVar54 = this.a;
                vkf vkfVar = vkf.NAT_QUICK_REPLY;
                krxVar70 = krvVar54.a;
                vkc aH = krx.aH(krxVar70);
                krv krvVar55 = this.a;
                vkf vkfVar2 = vkf.NAT_WEARABLE_QUICK_REPLY;
                krxVar71 = krvVar55.a;
                vkc aI = krx.aI(krxVar71);
                krv krvVar56 = this.a;
                vkf vkfVar3 = vkf.NAT_MARK_AS_READ;
                krxVar72 = krvVar56.a;
                vkc aG = krx.aG(krxVar72);
                krv krvVar57 = this.a;
                vkf vkfVar4 = vkf.NAT_COPY_OTP;
                krxVar73 = krvVar57.a;
                vkc aE = krx.aE(krxVar73);
                krv krvVar58 = this.a;
                vkf vkfVar5 = vkf.NAT_DIRECTOR;
                krxVar74 = krvVar58.a;
                return alor.p(vkfVar, aH, vkfVar2, aI, vkfVar3, aG, vkfVar4, aE, vkfVar5, krx.aF(krxVar74));
            case 292:
                krv krvVar59 = this.a;
                apyaVar479 = krvVar59.cj;
                apyaVar480 = krvVar59.z;
                anen anenVar9 = (anen) apyaVar480.b();
                apyaVar481 = this.a.m;
                return new xzk(apyaVar479, anenVar9, (anen) apyaVar481.b());
            case 293:
                apyaVar482 = this.a.bN;
                return new okq() { // from class: nrg
                    @Override // defpackage.okq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_multi_sim_logging_rcs_availability_log_worker");
                    }
                };
            case 294:
                krv krvVar60 = this.a;
                alok h = alor.h(9);
                apyaVar483 = krvVar60.ake;
                h.h("com.google.android.apps.messaging.messaging_service_add_user_to_group_response", apyaVar483);
                apyaVar484 = this.a.akf;
                h.h("com.google.android.apps.messaging.messaging_service_create_group_response", apyaVar484);
                krxVar75 = this.a.a;
                apyaVar485 = krxVar75.lg;
                h.h("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action", apyaVar485);
                apyaVar486 = this.a.Gh;
                h.h("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action", apyaVar486);
                apyaVar487 = this.a.akg;
                h.h("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response", apyaVar487);
                apyaVar488 = this.a.akh;
                h.h("com.google.android.apps.messaging.messaging_service_revoke_message_response", apyaVar488);
                apyaVar489 = this.a.aki;
                h.h("com.google.android.apps.messaging.messaging_service_send_message_response", apyaVar489);
                apyaVar490 = this.a.akj;
                h.h("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response", apyaVar490);
                apyaVar491 = this.a.akk;
                h.h("com.google.android.apps.messaging.messaging_service_update_group_response", apyaVar491);
                return h.f();
            case 295:
                apyaVar492 = this.a.lz;
                qco qcoVar = (qco) apyaVar492.b();
                krv krvVar61 = this.a;
                krxVar76 = krvVar61.a;
                znj jc = krx.jc(krxVar76);
                apyaVar493 = krvVar61.bZ;
                ylg ylgVar = (ylg) apyaVar493.b();
                krv krvVar62 = this.a;
                LD = krvVar62.LD();
                Object Jt = krv.Jt(krvVar62);
                apyaVar494 = krvVar62.lB;
                vza vzaVar = (vza) apyaVar494.b();
                apyaVar495 = this.a.m;
                anen anenVar10 = (anen) apyaVar495.b();
                apyaVar496 = this.a.z;
                anen anenVar11 = (anen) apyaVar496.b();
                apyaVar497 = this.a.ay;
                return new vym(qcoVar, jc, ylgVar, LD, (vyi) Jt, vzaVar, anenVar10, anenVar11, (anen) apyaVar497.b());
            case 296:
                apyaVar498 = this.a.gk;
                adeo adeoVar = (adeo) apyaVar498.b();
                apyaVar499 = this.a.aB;
                adtn adtnVar = (adtn) apyaVar499.b();
                krv krvVar63 = this.a;
                amnn e = weg.e();
                apyaVar500 = krvVar63.ay;
                anen anenVar12 = (anen) apyaVar500.b();
                apyaVar501 = this.a.gl;
                return new acnz(adeoVar, adtnVar, e, anenVar12, (acnu) apyaVar501.b());
            case 297:
                return new aday();
            case 298:
                apyaVar502 = this.a.gC;
                adnk adnkVar = (adnk) apyaVar502.b();
                apyaVar503 = this.a.fM;
                return new adki(adnkVar, (vau) apyaVar503.b());
            case 299:
                apyaVar504 = this.a.gC;
                adnk adnkVar2 = (adnk) apyaVar504.b();
                apyaVar505 = this.a.i;
                return new adkn(adnkVar2, (aegu) apyaVar505.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        afmr afmrVar;
        int i = this.b;
        int i2 = 3;
        switch (i) {
            case 300:
                return new adke((Context) this.a.n.b(), (adeo) this.a.gk.b(), (adtn) this.a.aB.b(), (anen) this.a.ay.b(), (acnu) this.a.gl.b());
            case 301:
                final apya apyaVar = this.a.bN;
                return new acxu() { // from class: acwc
                    @Override // defpackage.acxu
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.enable_set_consent_error_handling_fix");
                    }
                };
            case 302:
                final apya apyaVar2 = this.a.bN;
                return new acwt() { // from class: acvc
                    @Override // defpackage.acwt
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.disable_pesm_for_non_default_call_sim");
                    }
                };
            case 303:
                final apya apyaVar3 = this.a.bN;
                return new acww() { // from class: acve
                    @Override // defpackage.acww
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.enable_compute_availability_from_availability_util");
                    }
                };
            case 304:
                final apya apyaVar4 = this.a.bN;
                return new acuo() { // from class: acup
                    @Override // defpackage.acuo
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.always_set_initial_state");
                    }
                };
            case 305:
                final apya apyaVar5 = this.a.bN;
                return new acwo() { // from class: acux
                    @Override // defpackage.acwo
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.enable_handle_missing_verification_statuses");
                    }
                };
            case 306:
                final apya apyaVar6 = this.a.bN;
                return new acwk() { // from class: acus
                    @Override // defpackage.acwk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                    }
                };
            case 307:
                krv krvVar = this.a;
                return new wko(krvVar.dP, krvVar.a.bj, krvVar.xe);
            case 308:
                return new vyv(this.a.ff);
            case 309:
                return Optional.of(new altx((wnu) this.a.a.a.td.b()));
            case 310:
                return alpt.u((wnv) this.a.a.C.b(), (wnv) this.a.Cc.b(), (wnv) this.a.zU.b(), (wnv) this.a.td.b(), (wnv) this.a.a.bm.b());
            case 311:
                krv krvVar2 = this.a;
                return new abeg(krvVar2.a.l, krvVar2.ay);
            case 312:
                Context context = (Context) this.a.n.b();
                anen anenVar = (anen) this.a.z.b();
                anen anenVar2 = (anen) this.a.m.b();
                krv krvVar3 = this.a;
                qzw as = krvVar3.a.as();
                xru fV = krvVar3.fV();
                apya apyaVar7 = krvVar3.bB;
                xnv xnvVar = (xnv) krvVar3.bV.b();
                krv krvVar4 = this.a;
                return new woe(context, anenVar, anenVar2, as, fV, apyaVar7, xnvVar, new vyv(krvVar4.a.a.ff), (vyv) krvVar4.xH.b());
            case 313:
                return new uli(this.a.ff);
            case 314:
                return new vyv(this.a.ff);
            case 315:
                return new vjs(this.a.ff);
            case 316:
                return new wfh(this.a.av);
            case 317:
                return new mad((Context) this.a.n.b());
            case 318:
                krv krvVar5 = this.a;
                apya apyaVar8 = krvVar5.bY;
                apwt a = apxv.a(krvVar5.aG);
                krv krvVar6 = this.a;
                return new yyt((armf) apyaVar8, a, (armf) krvVar6.aM, (armf) krvVar6.vH);
            case 319:
                xnv xnvVar2 = (xnv) this.a.bV.b();
                Optional of = Optional.of(this.a.yJ);
                krv krvVar7 = this.a;
                krx krxVar = krvVar7.a;
                apya apyaVar9 = krvVar7.jC;
                apya apyaVar10 = krvVar7.dx;
                apya apyaVar11 = krxVar.aM;
                anen anenVar3 = (anen) krvVar7.ay.b();
                krv krvVar8 = this.a;
                apya apyaVar12 = krvVar8.a.aQ;
                apya apyaVar13 = krvVar8.fa;
                ahqr ahqrVar = (ahqr) krvVar8.id.b();
                lqn lqnVar = (lqn) this.a.a.aN.b();
                krv krvVar9 = this.a;
                return new woi(xnvVar2, of, apyaVar9, apyaVar10, apyaVar11, anenVar3, apyaVar12, apyaVar13, ahqrVar, lqnVar, krvVar9.gD, krvVar9.eQ, krvVar9.dm);
            case 320:
                final apya apyaVar14 = this.a.bN;
                return new nxf() { // from class: nje
                    @Override // defpackage.nxf
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_sms_tickle");
                    }
                };
            case 321:
                mbl mblVar = (mbl) this.a.cp.b();
                Optional optional = (Optional) this.a.ob.b();
                krx krxVar2 = this.a.a;
                return new uvd(mblVar, optional, krxVar2.aA(), krxVar2.jb());
            case 322:
                agxw agxwVar = (agxw) this.a.nV.b();
                Context context2 = (Context) this.a.a.a.n.b();
                context2.getClass();
                return new zhi(agxwVar, new achz(context2), (qrq) this.a.a.by.b(), (arpi) this.a.dj.b(), (arwe) this.a.dP.b());
            case 323:
                qro qroVar = new qro(3);
                krv krvVar10 = this.a;
                return new qrq(qroVar, krvVar10.ek, krvVar10.bt());
            case 324:
                final apya apyaVar15 = this.a.bN;
                return new olk() { // from class: nsa
                    @Override // defpackage.olk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.process_default_sms_changed_intent_for_dsdr");
                    }
                };
            case 325:
                krv krvVar11 = this.a;
                return new zhi(krvVar11.aF, krvVar11.dm, krvVar11.mt);
            case 326:
                tqx tqxVar = (tqx) this.a.eQ.b();
                rtb rtbVar = (rtb) this.a.eb.b();
                val valVar = (val) this.a.qa.b();
                apwt a2 = apxv.a(this.a.dx);
                xnv xnvVar3 = (xnv) this.a.bV.b();
                wyt wytVar = (wyt) this.a.es.b();
                Context context3 = (Context) this.a.n.b();
                krv krvVar12 = this.a;
                return new aamb(tqxVar, rtbVar, valVar, a2, xnvVar3, wytVar, context3, krvVar12.aY, krvVar12.ko, (abbu) krvVar12.yF.b(), Optional.empty());
            case 327:
                return new aant((armf) this.a.eb);
            case 328:
                ydh ydhVar = (ydh) this.a.eH.b();
                Context context4 = (Context) this.a.n.b();
                krv krvVar13 = this.a;
                return new rvq(ydhVar, context4, krvVar13.a.bE, (ydk) krvVar13.eD.b(), (mbl) this.a.bB.b(), (rtg) this.a.oG.b(), (tqx) this.a.eQ.b());
            case 329:
                return new ygt((Context) this.a.n.b());
            case 330:
                final apya apyaVar16 = this.a.bN;
                return new oru() { // from class: nvb
                    @Override // defpackage.oru
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_resolve_mapi_conversation_id_in_voice_action");
                    }
                };
            case 331:
                return new ywf(this.a.bB);
            case 332:
                return new ywh(this.a.bY, Optional.empty());
            case 333:
                Context context5 = (Context) this.a.n.b();
                krx krxVar3 = this.a.a;
                Context context6 = (Context) krxVar3.a.n.b();
                Optional q = ((ghw) krxVar3.a.zC.b()).q();
                q.getClass();
                vco Qc = krxVar3.a.Qc();
                aqut aqutVar = new aqut();
                if (!aqnf.b(context6)) {
                    aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), aqnf.a.get().c(context6));
                }
                aqutVar.h(new aquj("X-Android-Package", aqut.c), context6.getPackageName());
                Optional a3 = aehl.a(context6);
                a3.ifPresent(new adoj(aqutVar, 11));
                if (true != a3.isPresent()) {
                    i2 = 2;
                }
                ((alvg) ((alvg) aehl.a.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcModule", "logMetadataManagedChannel", 61, "RpcModule.java")).r("Number of headers in RPC request: %d", i2);
                aozy createBuilder = apmm.a.createBuilder();
                aozy createBuilder2 = apmn.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apmn apmnVar = (apmn) createBuilder2.b;
                apmnVar.b = 1 | apmnVar.b;
                apmnVar.c = i2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apmm apmmVar = (apmm) createBuilder.b;
                apmn apmnVar2 = (apmn) createBuilder2.s();
                apmnVar2.getClass();
                apmmVar.c = apmnVar2;
                apmmVar.b = 5;
                Qc.f((apmm) createBuilder.s());
                Optional map = q.map(new yuq(context6, aqutVar, 15, null));
                map.getClass();
                long b = acmd.b(((Context) this.a.a.a.n.b()).getContentResolver(), "android_id", 0L);
                krv krvVar14 = this.a;
                acyb.g();
                Optional of2 = Optional.of(apxv.a(krvVar14.aU));
                anen anenVar4 = (anen) this.a.ay.b();
                anen anenVar5 = (anen) this.a.m.b();
                krv krvVar15 = this.a;
                return new aehk(context5, map, b, of2, anenVar4, anenVar5, krvVar15.Qc(), apxv.a(krvVar15.a.bK));
            case 334:
                return new aehg((zfj) this.a.a.bJ.b(), (Context) this.a.n.b());
            case 335:
                return new zfj((Context) this.a.n.b());
            case 336:
                return new rdc((mbl) this.a.bB.b(), (byte[]) null);
            case 337:
                return new adwp();
            case 338:
                return new anew((anen) this.a.ay.b());
            case 339:
                return new gsb((grz) this.a.a.bP.b());
            case 340:
                aneo aneoVar = (aneo) this.a.z.b();
                arpi arpiVar = (arpi) this.a.bP.b();
                akbm akbmVar = (akbm) this.a.dK.b();
                gto gtoVar = (gto) this.a.a.Q.b();
                grz grzVar = new grz();
                grzVar.b(aneoVar);
                grzVar.e = new akdd(akbmVar, 0);
                grzVar.c(aneoVar);
                arpiVar.getClass();
                grzVar.b = arpiVar;
                grzVar.d(gtoVar);
                return grzVar;
            case 341:
                return new alhm(this.a.a.bQ);
            case 342:
                return new ngu(this.a);
            case 343:
                return new anfi((ansy) this.a.bN.b());
            case 344:
                Context context7 = (Context) this.a.n.b();
                apwt a4 = apxv.a(this.a.bw);
                krv krvVar16 = this.a;
                return new akka(context7, a4, krvVar16.QC(), (ahiy) krvVar16.tE.b(), this.a.QI(), krv.OE());
            case 345:
                krv krvVar17 = this.a;
                return new mck(krvVar17.eB, new itw(4), (Executor) krvVar17.m.b());
            case 346:
                final apya apyaVar17 = this.a.bN;
                return new pcw() { // from class: pbe
                    @Override // defpackage.pcw
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_ready_to_send_and_receive_rcs_on_any_sub");
                    }
                };
            case 347:
                return new ifb((rtb) this.a.eb.b(), (rtg) this.a.oG.b());
            case 348:
                final apya apyaVar18 = this.a.bN;
                return new ojb() { // from class: npu
                    @Override // defpackage.ojb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_early_resizing_in_draft");
                    }
                };
            case 349:
                return new lgg(apyd.a, (arwe) this.a.dO.b(), this.a.bk());
            case 350:
                final apya apyaVar19 = this.a.bN;
                return new oee() { // from class: nml
                    @Override // defpackage.oee
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_fix_for_new_sms_link_on_conv_v1");
                    }
                };
            case 351:
                final apya apyaVar20 = this.a.bN;
                return new omb() { // from class: nsp
                    @Override // defpackage.omb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_system_default_sub_id_in_convo1");
                    }
                };
            case 352:
                return new kor(Optional.empty(), Optional.of(new aabr()));
            case 353:
                return new obx() { // from class: nla
                };
            case 354:
                final apya apyaVar21 = this.a.bN;
                return new pcd() { // from class: pal
                    @Override // defpackage.pcd
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_active_self_filtering_in_draft_editor");
                    }
                };
            case 355:
                return agiz.M(agek.b, afog.a);
            case 356:
                return agiz.M(agek.b, afpc.a);
            case 357:
                afji afjiVar = (afji) this.a.a.ch.b();
                agcp io2 = this.a.a.io();
                afjiVar.getClass();
                return io2.d(afjiVar);
            case 358:
                afmd afmdVar = (afmd) this.a.a.cg.b();
                afmdVar.getClass();
                return new afji("emoji", afob.b, new lfn(afmdVar, (arpe) null, 16));
            case 359:
                return new afmd((arwe) this.a.dO.b());
            case 360:
                agcp Rn = this.a.Rn();
                akyr akyrVar = afjt.a;
                return Rn.A("usages", afjt.a);
            case 361:
                Optional of3 = Optional.of(ifc.h());
                krx krxVar4 = this.a.a;
                return agdj.a(of3, krxVar4.ci, krxVar4.cj);
            case 362:
                return new afxx((aksr) this.a.at.b(), this.a.Rh());
            case 363:
                return new afkd();
            case 364:
                krx krxVar5 = this.a.a;
                return new afmq(krxVar5.cn, (aiwu) krxVar5.co.b(), (arwe) this.a.bQ.b(), (afmd) this.a.a.cg.b());
            case 365:
                return Optional.of((afnx) this.a.a.cm.b());
            case 366:
                pgu pguVar = new pgu(this.a.a.a.bN);
                try {
                    Object e = ipe.f.e();
                    e.getClass();
                    afmrVar = (afmr) Enum.valueOf(afmr.class, (String) e);
                } catch (IllegalArgumentException unused) {
                    afmrVar = afmr.b;
                }
                return new afnx(afmrVar, new ezq(6), ((ansy) pguVar.a.b()).e("bugle.always_enable_emoji_search_renderer_before_search"), 250);
            case 367:
                Context context8 = (Context) this.a.n.b();
                atsg atsgVar = (atsg) this.a.a.G.b();
                context8.getClass();
                atsgVar.getClass();
                afnm afnmVar = afnm.a;
                afnmVar.getClass();
                return aeke.bP(context8, atsgVar, afnmVar, "emoji", "preferences");
            case 368:
                return new ioy((Context) this.a.n.b(), (mci) this.a.a.cq.b(), this.a.de);
            case 369:
                krv krvVar18 = this.a;
                return new mci(krvVar18.eB, new itw(4), (Executor) krvVar18.m.b());
            case 370:
                return new ipr((jgq) this.a.a.ct.b());
            case 371:
                return new jgq((mdc) this.a.a.cs.b());
            case 372:
                arwe arweVar = (arwe) this.a.dO.b();
                uvi uviVar = (uvi) this.a.de.b();
                krv krvVar19 = this.a;
                return new mdc(arweVar, uviVar, krvVar19.eB, new itw(4), (Executor) krvVar19.m.b());
            case 373:
                return Optional.empty();
            case 374:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.commit_fragment_transactions_immediately"));
            case 375:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.fix_reattach_on_configuration_change"));
            case 376:
                return new aday((char[]) null);
            case 377:
                return new ipq();
            case 378:
                return new aabd((Context) this.a.n.b(), (aiwu) this.a.a.cA.b(), (anen) this.a.z.b());
            case 379:
                akns a5 = aknt.a();
                a5.a = "EmojiVariantPreferences";
                a5.c(aaaw.a);
                aknt a6 = a5.a();
                krv krvVar20 = this.a;
                return krvVar20.Qq().e(a6, (agcp) krvVar20.aT.b());
            case 380:
                return new zxy((Executor) this.a.z.b(), (ykw) this.a.av.b());
            case 381:
                return new zjm((aagk) this.a.a.cE.b());
            case 382:
                xnv xnvVar4 = (xnv) this.a.bV.b();
                krv krvVar21 = this.a;
                apya apyaVar22 = krvVar21.DD;
                return new aagk(xnvVar4, krvVar21.wg, krvVar21.a.cD, (anen) apyaVar22.b(), (aneo) this.a.m.b());
            case 383:
                Context context9 = (Context) this.a.n.b();
                xzb.l("Bugle", "FirebaseUserActions initialized");
                return aodz.a(context9);
            case 384:
                krv krvVar22 = this.a;
                return new rwe(krvVar22.kR, krvVar22.pH, krvVar22.a.cG, (anen) krvVar22.ay.b());
            case 385:
                return new rvu(altg.a, (ahqr) this.a.id.b());
            case 386:
                return new ifb();
            case 387:
                uff uffVar = (uff) this.a.dZ.b();
                krv krvVar23 = this.a;
                krx krxVar6 = krvVar23.a;
                krv krvVar24 = krxVar6.a;
                apya apyaVar23 = krvVar23.gD;
                apya apyaVar24 = krxVar6.cJ;
                apya apyaVar25 = krxVar6.cK;
                apya apyaVar26 = krvVar23.bB;
                apya apyaVar27 = krvVar24.gD;
                apya apyaVar28 = krvVar24.pR;
                apyaVar27.getClass();
                apyaVar24.getClass();
                apyaVar28.getClass();
                abbu abbuVar = (abbu) krvVar23.yF.b();
                msk mskVar = (msk) this.a.dd.b();
                return new iih(uffVar, apyaVar23, apyaVar24, apyaVar25, apyaVar26, abbuVar, mskVar, this.a.lc);
            case 388:
                krv krvVar25 = this.a;
                return new ibi(krvVar25.eB, (Executor) krvVar25.m.b(), (byte[]) null);
            case 389:
                krv krvVar26 = this.a;
                return new ibi(krvVar26.eB, (Executor) krvVar26.m.b());
            case 390:
                return new yfu((Context) this.a.n.b());
            case 391:
                krv krvVar27 = this.a;
                return new ylo(krvVar27.av, (xyt) krvVar27.gY.b());
            case 392:
                return new mka();
            case 393:
                return new yyb();
            case 394:
                final apya apyaVar29 = this.a.bN;
                return new ohi() { // from class: now
                    @Override // defpackage.ohi
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_camera_in_home_screen");
                    }
                };
            case 395:
                final apya apyaVar30 = this.a.bN;
                return new ohk() { // from class: nox
                    @Override // defpackage.ohk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_preinflation_timers");
                    }
                };
            case 396:
                krv krvVar28 = this.a;
                return new kkc((armf) krvVar28.eN, (arwe) krvVar28.dO.b(), (xnv) this.a.bV.b());
            case 397:
                ansy ansyVar = (ansy) this.a.ct.b();
                arpi arpiVar2 = (arpi) this.a.bP.b();
                arwe arweVar2 = (arwe) this.a.dO.b();
                krv krvVar29 = this.a;
                return new aair(ansyVar, arpiVar2, arweVar2, krvVar29.oO, (ahiy) krvVar29.aC.b(), (xnv) this.a.bV.b(), this.a.a.cU);
            case 398:
                arpi arpiVar3 = (arpi) this.a.bP.b();
                arpi arpiVar4 = (arpi) this.a.dj.b();
                krv krvVar30 = this.a;
                return new yyt(arpiVar3, arpiVar4, new wfh(krvVar30.a.a.ff), (xnv) krvVar30.bV.b());
            case 399:
                return new yyb();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v466, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [armf, java.lang.Object] */
    private final Object f() {
        int i = this.b;
        switch (i) {
            case 400:
                return new abdc((ykw) this.a.av.b(), (abbu) this.a.yF.b());
            case 401:
                krv krvVar = this.a;
                return new uzj(krvVar.eB, (Executor) krvVar.m.b());
            case 402:
                return new uzz();
            case 403:
                return new aajv(this.a.yF);
            case 404:
                return Boolean.valueOf(((asqc) this.a.Ul().a.b()).y("com.google.android.apps.messaging.auto 45417049").e());
            case 405:
                krv krvVar2 = this.a;
                return new vsu(krvVar2.bZ, krvVar2.a.hS(), krvVar2.bB, krvVar2.gn(), (anen) krvVar2.m.b());
            case 406:
                Optional aQ = d.aQ(apxv.a(this.a.a.cZ), this.a.a.iv());
                aQ.getClass();
                return aQ;
            case 407:
                return Long.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45459897").b());
            case 408:
                Context context = (Context) this.a.n.b();
                krv krvVar3 = this.a;
                return new aajg(context, krvVar3.zC, (anen) krvVar3.z.b());
            case 409:
                return new zof((uie) this.a.mr.b(), this.a.dA);
            case 410:
                return new jci((arwe) this.a.dO.b(), (obh) this.a.a.da.b(), (atsg) this.a.Bi.b());
            case 411:
                final apya apyaVar = this.a.bN;
                return new obh() { // from class: nkn
                    @Override // defpackage.obh
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.conversation_screen_2_enabled");
                    }
                };
            case 412:
                return new okd() { // from class: nqs
                };
            case 413:
                return new nwz() { // from class: nja
                };
            case 414:
                return new atkn((arwe) this.a.dO.b(), (atsg) this.a.Bi.b(), (okr) this.a.gb.b());
            case 415:
                return Boolean.valueOf(((asqc) this.a.TX().a.b()).y("com.google.android.apps.messaging.auto 45419609").e());
            case 416:
                return new xnm((uof) this.a.ff.b(), (arwe) this.a.bQ.b());
            case 417:
                arwe arweVar = (arwe) this.a.dO.b();
                krv krvVar4 = this.a;
                return new qnu(arweVar, krvVar4.a.C, krvVar4.xo, krvVar4.wP, krvVar4.wS);
            case 418:
                krv krvVar5 = this.a;
                Map hX = krx.hX();
                krx krxVar = krvVar5.a;
                apya apyaVar2 = krxVar.dd;
                Map hJ = krxVar.hJ();
                apya apyaVar3 = krvVar5.a.de;
                apya apyaVar4 = krvVar5.cc;
                Context context2 = (Context) krvVar5.n.b();
                arwe arweVar2 = (arwe) this.a.dP.b();
                krv krvVar6 = this.a;
                return new rjx(hX, apyaVar2, hJ, apyaVar3, apyaVar4, context2, arweVar2, krvVar6.xU, krvVar6.a.iH());
            case 419:
                uac uacVar = (uac) this.a.a.dc.b();
                uacVar.getClass();
                return uacVar.b;
            case 420:
                return new uac(new rke(ror.a), new rpc(), new rke(rll.a), new rkr(), new rke(rnn.a), new rke(rny.a), this.a.a.av(), new rke(rla.a), new rke(rmr.a), new rke(rmi.a), new rke(rna.a), new rke(rlw.a));
            case 421:
                uac uacVar2 = (uac) this.a.a.dc.b();
                uacVar2.getClass();
                return uacVar2.a;
            case 422:
                znj znjVar = (znj) this.a.cj.b();
                krv krvVar7 = this.a;
                return new vdr(znjVar, krvVar7.PN(), (mbl) krvVar7.bB.b());
            case 423:
                final apya apyaVar5 = this.a.bN;
                return new pqm() { // from class: pql
                    @Override // defpackage.pqm
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_welcome_flow_v1");
                    }
                };
            case 424:
                return new aaoc((Context) this.a.n.b(), (anen) this.a.DD.b(), this.a.a.h);
            case 425:
                final apya apyaVar6 = this.a.bN;
                return new ozb() { // from class: oyz
                    @Override // defpackage.ozb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_database_debug_tool");
                    }
                };
            case 426:
                final apya apyaVar7 = this.a.bN;
                return new oyf() { // from class: oxv
                    @Override // defpackage.oyf
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_conversation1_fallback_options");
                    }
                };
            case 427:
                final apya apyaVar8 = this.a.bN;
                return new pgl() { // from class: pgd
                    @Override // defpackage.pgl
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_connect_to_satellite_debug_menu");
                    }
                };
            case 428:
                final apya apyaVar9 = this.a.bN;
                return new ozf() { // from class: ozd
                    @Override // defpackage.ozf
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_new_debug_submenus");
                    }
                };
            case 429:
                return new rym((atsg) this.a.bT.b(), (xnv) this.a.bV.b(), (yjf) this.a.bU.b(), (yio) this.a.oD.b(), (ryo) this.a.a.di.b(), (aksr) this.a.at.b());
            case 430:
                Context context3 = (Context) this.a.n.b();
                krv krvVar8 = this.a;
                apya apyaVar10 = krvVar8.et;
                anen anenVar = (anen) krvVar8.z.b();
                krx krxVar2 = this.a.a;
                anen anenVar2 = (anen) krxVar2.a.z.b();
                xnv xnvVar = (xnv) krxVar2.a.bV.b();
                krv krvVar9 = krxVar2.a;
                apya apyaVar11 = krvVar9.oO;
                uhj uhjVar = (uhj) krvVar9.fl.b();
                krv krvVar10 = krxVar2.a;
                return new ryo(context3, apyaVar10, anenVar, new ryq(anenVar2, xnvVar, apyaVar11, uhjVar, krvVar10.oJ, krvVar10.oK, krvVar10.oM));
            case 431:
                return new yyb();
            case 432:
                return new yee((Context) this.a.n.b(), (yea) this.a.a.dl.b(), (anen) this.a.eh.b(), (anen) this.a.m.b(), (xyt) this.a.dS.b());
            case 433:
                asme asmeVar = new asme(new asmd());
                apwt a = apxv.a(this.a.gA);
                atqj atqjVar = atqj.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                char[] cArr = aslx.a;
                aslw aslwVar = new aslw();
                aslwVar.c(null, "https://api.tenor.com/");
                aslx a2 = aslwVar.a();
                if ("".equals(a2.e.get(r9.size() - 1))) {
                    arrayList2.add(new atqz());
                    aonx aonxVar = (aonx) a.b();
                    if (aonxVar != null) {
                        arrayList.add(new atrb(aonxVar));
                        Executor a3 = atqjVar.a();
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList3.addAll(Arrays.asList(atov.a, new atpb(a3)));
                        ArrayList arrayList4 = new ArrayList(arrayList.size() + 2);
                        arrayList4.add(new aton());
                        arrayList4.addAll(arrayList);
                        arrayList4.addAll(Collections.singletonList(atpp.a));
                        atqq atqqVar = new atqq(asmeVar, a2, DesugarCollections.unmodifiableList(arrayList4), DesugarCollections.unmodifiableList(arrayList3));
                        if (yea.class.isInterface()) {
                            ArrayDeque arrayDeque = new ArrayDeque(1);
                            arrayDeque.add(yea.class);
                            while (!arrayDeque.isEmpty()) {
                                Class cls = (Class) arrayDeque.removeFirst();
                                if (cls.getTypeParameters().length != 0) {
                                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                                    sb.append(cls.getName());
                                    if (cls != yea.class) {
                                        sb.append(" which is an interface of ");
                                        sb.append(yea.class.getName());
                                    }
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                Collections.addAll(arrayDeque, cls.getInterfaces());
                            }
                            yea yeaVar = (yea) Proxy.newProxyInstance(yea.class.getClassLoader(), new Class[]{yea.class}, new atqp(atqqVar, yea.class));
                            yeaVar.getClass();
                            return yeaVar;
                        }
                        throw new IllegalArgumentException("API declarations must be interfaces.");
                    }
                    throw new NullPointerException("gson == null");
                }
                throw new IllegalArgumentException("baseUrl must end in /: ".concat(a2.g));
            case 434:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_selfie_gifs"));
            case 435:
                return new xve((Context) this.a.n.b());
            case 436:
                return new aagc((xve) this.a.a.f9do.b(), (Optional) ((apxx) this.a.a.dp).a);
            case 437:
                return new aabr();
            case 438:
                return new hgi((lzz) this.a.fB.b());
            case 439:
                final apya apyaVar12 = this.a.bN;
                return new ocj() { // from class: nlk
                    @Override // defpackage.ocj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.add_missing_intent_category_for_launcher_activity");
                    }
                };
            case 440:
                akrh e = aktp.e("provideExtensionRegistry");
                try {
                    aozs a4 = aozs.a();
                    e.close();
                    a4.getClass();
                    return a4;
                } finally {
                }
            case 441:
                krv krvVar11 = this.a;
                return new yyu(krvVar11.a.dy, apxv.a(krvVar11.dd));
            case 442:
                lpg lpgVar = new lpg(this.a.a.a.m, null, null, null);
                anen anenVar3 = (anen) this.a.z.b();
                krv krvVar12 = this.a;
                return new ifq(lpgVar, anenVar3, (mkb) krvVar12.a.hy(), krvVar12.a.iu(), krvVar12.a.dx);
            case 443:
                return new qnu((Context) this.a.n.b(), this.a.bU);
            case 444:
                Context context4 = (Context) this.a.n.b();
                anen anenVar4 = (anen) this.a.m.b();
                anen anenVar5 = (anen) this.a.z.b();
                anen anenVar6 = (anen) this.a.ay.b();
                krv krvVar13 = this.a;
                apya apyaVar13 = krvVar13.dd;
                krx krxVar3 = krvVar13.a;
                return new mkg(context4, anenVar4, anenVar5, anenVar6, apyaVar13, krxVar3.du, krxVar3.dv, krxVar3.dw, krvVar13.id, krvVar13.wN);
            case 445:
                return new qnu((Context) this.a.n.b(), this.a.bU);
            case 446:
                Context context5 = (Context) this.a.n.b();
                krv krvVar14 = this.a;
                apya apyaVar14 = krvVar14.id;
                arwe arweVar3 = (arwe) krvVar14.bQ.b();
                msk mskVar = (msk) this.a.dd.b();
                apya apyaVar15 = this.a.wN;
                context5.getClass();
                apyaVar14.getClass();
                arweVar3.getClass();
                mskVar.getClass();
                apyaVar15.getClass();
                abmt abmtVar = achd.g;
                return new mkn(arweVar3, apyaVar14, mskVar, new achp(context5), apyaVar15);
            case 447:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_smart_reply_sent_sound"));
            case 448:
                return new wcm();
            case 449:
                krv krvVar15 = this.a;
                return new aark(krvVar15.a.au(), (ykw) krvVar15.av.b(), (xyt) this.a.dS.b(), (anen) this.a.eh.b(), (aneo) this.a.z.b(), (anen) this.a.m.b());
            case 450:
                final apya apyaVar16 = this.a.bN;
                return new pix() { // from class: piq
                    @Override // defpackage.pix
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_remove_cast_to_bugle_conversation_id");
                    }
                };
            case 451:
                return MediaViewerActivity.class;
            case 452:
                return new oyo() { // from class: oyk
                };
            case 453:
                Context context6 = (Context) this.a.n.b();
                int i2 = acdh.a;
                return new acdo(context6);
            case 454:
                krx krxVar4 = this.a.a;
                return Optional.of(new jat((arwe) krxVar4.a.dP.b(), (Context) krxVar4.a.n.b(), (via) krxVar4.a.mt.b()));
            case 455:
                return Long.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45530923").b());
            case 456:
                final apya apyaVar17 = this.a.bN;
                return new oxm() { // from class: oxn
                    @Override // defpackage.oxm
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.add_conversation_state_tracker");
                    }
                };
            case 457:
                return new lfl(apxv.a(this.a.a.dM), apxv.a(this.a.a.dN), apxv.a(this.a.a.dO), apxv.a(this.a.a.dP), apxv.a(this.a.tU));
            case 458:
                return new adwq((adwq) this.a.a.dL.b());
            case 459:
                krv krvVar16 = this.a;
                altg altgVar = altg.a;
                ahdj ahdjVar = (ahdj) krvVar16.a.dK.b();
                alwo alwoVar = ahez.a;
                alpr alprVar = new alpr();
                alprVar.j(altgVar);
                alprVar.c(ahdjVar.f);
                return new adwq(alprVar.g(), null);
            case 460:
                ahcg ahcgVar = (ahcg) this.a.tR.b();
                final aksr aksrVar = (aksr) this.a.a.a.at.b();
                algw i3 = algw.i(new ahdf() { // from class: akak
                    @Override // defpackage.ahdf
                    public final Runnable a(Runnable runnable) {
                        if (akqj.u()) {
                            return akto.j(runnable);
                        }
                        return new ajnt(aksr.this, runnable, 6, (byte[]) null);
                    }
                });
                this.a.hm();
                ahdj ahdjVar2 = new ahdj(ahcgVar, (ahdf) i3.d(new ahdf() { // from class: ahdq
                    @Override // defpackage.ahdf
                    public final Runnable a(Runnable runnable) {
                        return runnable;
                    }
                }), (agxw) this.a.tS.b());
                if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                    Integer num = 500;
                    num.getClass();
                    ahdjVar2.d = 500;
                }
                return ahdjVar2;
            case 461:
                return ((adwq) this.a.a.dM.b()).a;
            case 462:
                adwq adwqVar = (adwq) this.a.a.dL.b();
                anen anenVar7 = (anen) this.a.z.b();
                ahdj ahdjVar3 = (ahdj) this.a.a.dK.b();
                adwqVar.getClass();
                anenVar7.getClass();
                ahdjVar3.getClass();
                new anew(anenVar7);
                return new ahji();
            case 463:
                ahcg ahcgVar2 = (ahcg) this.a.tR.b();
                agxw agxwVar = (agxw) this.a.tS.b();
                Boolean bool = false;
                bool.getClass();
                return new ahdo(ahcgVar2, agxwVar);
            case 464:
                return new oit() { // from class: npn
                };
            case 465:
                return new lga();
            case 466:
                final apya apyaVar18 = this.a.bN;
                return new oek() { // from class: nmq
                    @Override // defpackage.oek
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_logging_first_conversation_screen_visit");
                    }
                };
            case 467:
                final apya apyaVar19 = this.a.bN;
                return new obl() { // from class: nkq
                    @Override // defpackage.obl
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_projector");
                    }
                };
            case 468:
                return new ahji();
            case 469:
                krv krvVar17 = this.a;
                apya apyaVar20 = krvVar17.dt;
                apya apyaVar21 = krvVar17.a.cO;
                Context context7 = (Context) krvVar17.n.b();
                anen anenVar8 = (anen) this.a.ay.b();
                anen anenVar9 = (anen) this.a.m.b();
                krv krvVar18 = this.a;
                return new aazf(apyaVar20, apyaVar21, context7, anenVar8, anenVar9, krvVar18.hs, krvVar18.ht);
            case 470:
                final apya apyaVar22 = this.a.bN;
                return new odb() { // from class: nlv
                    @Override // defpackage.odb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.deprecate_rcs_promo_popup_presenter");
                    }
                };
            case 471:
                final apya apyaVar23 = this.a.bN;
                return new ofb() { // from class: nnc
                    @Override // defpackage.ofb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_rcs_default_on_oob_flow_in_rcs_success_popup");
                    }
                };
            case 472:
                return new ohr() { // from class: npd
                };
            case 473:
                final apya apyaVar24 = this.a.bN;
                return new pgp() { // from class: pgh
                    @Override // defpackage.pgp
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.fix_conversation_name_direction");
                    }
                };
            case 474:
                final apya apyaVar25 = this.a.bN;
                return new ohf() { // from class: nou
                    @Override // defpackage.ohf
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_rcs_availability_for_groups");
                    }
                };
            case 475:
                final apya apyaVar26 = this.a.bN;
                return new oju() { // from class: nqm
                    @Override // defpackage.oju
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_mms_group_upgrade_ui_home_screen");
                    }
                };
            case 476:
                return new obk() { // from class: nkp
                };
            case 477:
                final apya apyaVar27 = this.a.bN;
                return new ohh() { // from class: nov
                    @Override // defpackage.ohh
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_adapter_get_item_null_counter");
                    }
                };
            case 478:
                akns a5 = aknt.a();
                a5.a = "SwipeActionSettingsDataStore";
                a5.c(zmq.a);
                aknt a6 = a5.a();
                krv krvVar19 = this.a;
                return krvVar19.Qq().e(a6, (agcp) krvVar19.aT.b());
            case 479:
                final apya apyaVar28 = this.a.bN;
                return new ohq() { // from class: npc
                    @Override // defpackage.ohq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.tint_menu_item_intead_of_icon");
                    }
                };
            case 480:
                whj whjVar = (whj) this.a.gL.b();
                ansy ansyVar = new ansy((ahiy) this.a.a.a.aC.b());
                ansy ansyVar2 = new ansy((ahiy) this.a.a.a.aC.b());
                ansy ansyVar3 = (ansy) this.a.ct.b();
                xnv xnvVar2 = (xnv) this.a.bV.b();
                xyt xytVar = (xyt) this.a.gY.b();
                anen anenVar10 = (anen) this.a.z.b();
                anen anenVar11 = (anen) this.a.ay.b();
                anen anenVar12 = (anen) this.a.m.b();
                ykw ykwVar = (ykw) this.a.av.b();
                ahiy ahiyVar = (ahiy) this.a.aC.b();
                wwn wwnVar = (wwn) this.a.fY.b();
                krv krvVar20 = this.a;
                return new wgd(whjVar, ansyVar, ansyVar2, ansyVar3, xnvVar2, xytVar, anenVar10, anenVar11, anenVar12, ykwVar, ahiyVar, wwnVar, krvVar20.gb, krvVar20.fM);
            case 481:
                final apya apyaVar29 = this.a.bN;
                return new pgn() { // from class: pgf
                    @Override // defpackage.pgn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_fab_size_experiment");
                    }
                };
            case 482:
                return new nen((wfh) this.a.hm.b(), (arwe) this.a.dO.b(), (arwe) this.a.dP.b(), (usk) this.a.rB.b(), (msk) this.a.dd.b(), (xnv) this.a.bV.b(), this.a.dA, 1);
            case 483:
                arwe arweVar4 = (arwe) this.a.dO.b();
                krv krvVar21 = this.a;
                return new kzo(arweVar4, krvVar21.aF, krvVar21.a.eb, krvVar21.iJ);
            case 484:
                final apya apyaVar30 = this.a.bN;
                return new pfn() { // from class: pex
                    @Override // defpackage.pfn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_dsdr_rcs_availability_in_home_screen");
                    }
                };
            case 485:
                return new kzp((arwe) this.a.dO.b(), (nfx) this.a.iL.b(), 0);
            case 486:
                return new kzp((arwe) this.a.dP.b(), (wfh) this.a.hm.b(), this.a.a.o(), 1);
            case 487:
                return new AtomicBoolean(false);
            case 488:
                return new ohp() { // from class: npb
                };
            case 489:
                final apya apyaVar31 = this.a.bN;
                return new ohs() { // from class: npe
                    @Override // defpackage.ohs
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_avoid_keeping_view_reference");
                    }
                };
            case 490:
                final apya apyaVar32 = this.a.bN;
                return new pfq() { // from class: pfa
                    @Override // defpackage.pfq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.log_group_upgrade_homescreen_popup");
                    }
                };
            case 491:
                final apya apyaVar33 = this.a.bN;
                return new ory() { // from class: nve
                    @Override // defpackage.ory
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_open_penpal_chat_event_logging");
                    }
                };
            case 492:
                return ((asqc) this.a.Uo().a.b()).y("com.google.android.apps.messaging.auto 45648946").d();
            case 493:
                final apya apyaVar34 = this.a.bN;
                return new pgo() { // from class: pgg
                    @Override // defpackage.pgo
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_null_fragment_view_fix");
                    }
                };
            case 494:
                final apya apyaVar35 = this.a.bN;
                return new ozw() { // from class: paa
                    @Override // defpackage.ozw
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.always_pass_self_identity_to_start_chat_if_available");
                    }
                };
            case 495:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_link_preview_default_pref_capability"));
            case 496:
                krv krvVar22 = this.a;
                apya apyaVar36 = krvVar22.a.es;
                apya apyaVar37 = krvVar22.iL;
                xnv xnvVar3 = (xnv) krvVar22.bV.b();
                agxw agxwVar2 = (agxw) this.a.nV.b();
                krv krvVar23 = this.a;
                return new zhn(apyaVar36, apyaVar37, xnvVar3, agxwVar2, krvVar23.jo, krvVar23.dq, (arwe) krvVar23.dO.b(), (arwe) this.a.dP.b());
            case 497:
                final apya apyaVar38 = this.a.bN;
                return new opu() { // from class: ntr
                    @Override // defpackage.opu
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_constellation_on_demand_onboarding");
                    }
                };
            case 498:
                return Boolean.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45460584").e());
            case 499:
                return new apuv((Context) this.a.n.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v121, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v129, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v137, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v282, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v310, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v318, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v337, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v356, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v374, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v387, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v396, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v405, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v414, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v423, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v96, types: [armf, java.lang.Object] */
    private final Object g() {
        int i = this.b;
        switch (i) {
            case 500:
                final apya apyaVar = this.a.bN;
                return new ohb() { // from class: nor
                    @Override // defpackage.ohb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_home_ripple_on_go");
                    }
                };
            case 501:
                return new yai();
            case 502:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.fix_gif_flickering_in_message_list"));
            case 503:
                return new onv() { // from class: nsx
                };
            case 504:
                return new ryz((yjf) this.a.bU.b(), (anen) this.a.z.b(), this.a.n);
            case 505:
                return new ygq((anen) this.a.z.b());
            case 506:
                final apya apyaVar2 = this.a.bN;
                return new opm() { // from class: nto
                    @Override // defpackage.opm
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_suggested_texts_from_magic_compose");
                    }
                };
            case 507:
                Vibrator vibrator = (Vibrator) ((Context) this.a.n.b()).getSystemService("vibrator");
                vibrator.getClass();
                return vibrator;
            case 508:
                final apya apyaVar3 = this.a.bN;
                return new ohc() { // from class: nos
                    @Override // defpackage.ohc
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_send_ripple_on_go");
                    }
                };
            case 509:
                final apya apyaVar4 = this.a.bN;
                return new oyn() { // from class: oyj
                    @Override // defpackage.oyn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_copy_display_destination_to_clipboard");
                    }
                };
            case 510:
                Context context = (Context) this.a.n.b();
                krv krvVar = this.a;
                krx krxVar = krvVar.a;
                krv krvVar2 = krxVar.a;
                apya apyaVar5 = krvVar.fp;
                znj znjVar = new znj((Context) krvVar2.n.b(), (Optional) ((apxx) krxVar.a.aG).a, (byte[]) null);
                krv krvVar3 = this.a;
                apya apyaVar6 = krvVar3.fr;
                afxz afxzVar = (afxz) krvVar3.fq.b();
                krv krvVar4 = this.a;
                apya apyaVar7 = krvVar4.ft;
                apya apyaVar8 = krvVar4.ci;
                apya apyaVar9 = krvVar4.bY;
                mgu mguVar = (mgu) krvVar4.tV.b();
                arpi arpiVar = (arpi) this.a.dj.b();
                arpi arpiVar2 = (arpi) this.a.dN.b();
                krv krvVar5 = this.a;
                krx krxVar2 = krvVar5.a;
                krv krvVar6 = krxVar2.a;
                apya apyaVar10 = krvVar5.tz;
                wfh iW = krxVar2.iW();
                apya apyaVar11 = krvVar5.fB;
                apya apyaVar12 = krvVar6.bN;
                return new yvb(context, apyaVar5, znjVar, apyaVar6, afxzVar, apyaVar7, apyaVar8, apyaVar9, mguVar, arpiVar, arpiVar2, apyaVar10, iW, apyaVar11, new nwa(apyaVar12), new nvz(apyaVar12));
            case 511:
                return Optional.empty();
            case 512:
                return new oym() { // from class: oyi
                };
            case 513:
                final apya apyaVar13 = this.a.bN;
                return new nxk() { // from class: nji
                    @Override // defpackage.nxk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_e2ee_optimization");
                    }
                };
            case 514:
                final apya apyaVar14 = this.a.bN;
                return new oyp() { // from class: oyl
                    @Override // defpackage.oyp
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.fix_encryption_adapter_crash");
                    }
                };
            case 515:
                final apya apyaVar15 = this.a.bN;
                return new nxm() { // from class: njl
                    @Override // defpackage.nxm
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_leave_action_after_user_leaves");
                    }
                };
            case 516:
                final apya apyaVar16 = this.a.bN;
                return new nxl() { // from class: njk
                    @Override // defpackage.nxl
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.fix_only_send_sms_mms_action_eligibility");
                    }
                };
            case 517:
                final apya apyaVar17 = this.a.bN;
                return new pct() { // from class: pbb
                    @Override // defpackage.pct
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.mark_other_self_sim_in_conversation_details_page");
                    }
                };
            case 518:
                final apya apyaVar18 = this.a.bN;
                return new pcy() { // from class: pbh
                    @Override // defpackage.pcy
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.show_active_sim_module");
                    }
                };
            case 519:
                final apya apyaVar19 = this.a.bN;
                return new opj() { // from class: ntl
                    @Override // defpackage.opj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_reauthenticate_dialog");
                    }
                };
            case 520:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45477694").b());
            case 521:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45618039").b());
            case 522:
                return ((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45650861").d();
            case 523:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45477695").b());
            case 524:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_cdp_education"));
            case 525:
                final apya apyaVar20 = this.a.bN;
                return new pbz() { // from class: pah
                    @Override // defpackage.pbz
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.dsdr_fix_top_app_bar_middle_ui_adapter_impl");
                    }
                };
            case 526:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_internation_country_is_unreliable"));
            case 527:
                akns a = aknt.a();
                a.a = "EarlyFeedbackData";
                a.c(kjy.a);
                aknt a2 = a.a();
                krv krvVar7 = this.a;
                return krvVar7.Qq().e(a2, (agcp) krvVar7.aT.b());
            case 528:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45427029").b());
            case 529:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45427030").b());
            case 530:
                return Boolean.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45476294").e());
            case 531:
                final apya apyaVar21 = this.a.bN;
                return new odq() { // from class: nmg
                    @Override // defpackage.odq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_unavailable_attachment_over_satellite_ui");
                    }
                };
            case 532:
                final apya apyaVar22 = this.a.bN;
                return new oqc() { // from class: ntx
                    @Override // defpackage.oqc
                    public final void a() {
                        ((ansy) armf.this.b()).e("bugle.enable_profile_name_in_reactions");
                    }
                };
            case 533:
                final apya apyaVar23 = this.a.bN;
                return new ock() { // from class: nll
                    @Override // defpackage.ock
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_e2ee_transient_bottom_notice");
                    }
                };
            case 534:
                return new uli(this.a.a.eQ, (char[]) null, (char[]) null);
            case 535:
                krv krvVar8 = this.a;
                krx krxVar3 = krvVar8.a;
                return new zai(krvVar8.pi, krvVar8.dW, krxVar3.eO, krxVar3.eP, krvVar8.dd, (byte[]) null, (char[]) null);
            case 536:
                krv krvVar9 = this.a;
                return new uac((armf) krvVar9.n, (armf) krvVar9.bV);
            case 537:
                return new uli(this.a.n, (byte[]) null, (char[]) null);
            case 538:
                return new afdv((Context) this.a.n.b(), (arwe) this.a.a.eS.b());
            case 539:
                arpi arpiVar3 = (arpi) this.a.dj.b();
                arpiVar3.getClass();
                return arwi.e(arpiVar3);
            case 540:
                alor alorVar = altc.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(((altc) alorVar).d));
                for (Map.Entry entry : alorVar.entrySet()) {
                    afdn afdnVar = (afdn) entry.getKey();
                    afsx H = afwv.H(afdnVar.a());
                    if (H != null) {
                        linkedHashMap.put(H, entry.getValue());
                    } else {
                        throw new IllegalArgumentException("Invalid MediaType registered: '" + afdnVar.a() + "'");
                    }
                }
                return linkedHashMap;
            case 541:
                Context context2 = (Context) this.a.n.b();
                krx krxVar4 = this.a.a;
                krv krvVar10 = krxVar4.a;
                afiz bi = krxVar4.bi();
                afus afusVar = new afus((arwe) krvVar10.bQ.b());
                krx krxVar5 = this.a.a;
                return new atsg(context2, bi, afusVar, new afuu((arwe) krxVar5.a.bQ.b(), krxVar5.eV), new afvb((arwe) this.a.a.a.bQ.b()), (arwe) this.a.bQ.b(), this.a.a.eV);
            case 542:
                return Optional.of((afdm) this.a.a.eU.b());
            case 543:
                return new afdm(true, true, true, false, ((ansy) new pgt(this.a.a.a.bN).a.b()).e("bugle.add_more_exif_orientation_options"));
            case 544:
                return new yrr((Context) this.a.n.b(), (arwe) this.a.dP.b(), (arpi) this.a.dj.b(), this.a.a.eW);
            case 545:
                return new adxs((Context) this.a.n.b());
            case 546:
                return new jom();
            case 547:
                krv krvVar11 = this.a;
                return krvVar11.cc().d(new pvq(new ngq(krvVar11.a.a.ce(), 10)));
            case 548:
                arwe arweVar = (arwe) this.a.dO.b();
                krx krxVar6 = this.a.a;
                krxVar6.iQ();
                jgo jgoVar = new jgo((ydc) krxVar6.a.dU.b(), krxVar6.a.kN, krxVar6.V());
                krv krvVar12 = this.a;
                return new jgt(arweVar, jgoVar, (Optional) ((apxx) krvVar12.a.fa).a, Optional.empty(), krvVar12.kN, krvVar12.eB, new itw(4), (Executor) krvVar12.m.b());
            case 549:
                final apya apyaVar24 = this.a.bN;
                return new ovs() { // from class: ovt
                    @Override // defpackage.ovs
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.add_image_compression_info_to_bugle_transcoding_event");
                    }
                };
            case 550:
                final apya apyaVar25 = this.a.bN;
                return new ouj() { // from class: ouh
                    @Override // defpackage.ouj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.do_not_fetch_capabilities_for_image_only");
                    }
                };
            case 551:
                anen anenVar = (anen) this.a.ba.b();
                anenVar.getClass();
                return arsd.an(anenVar);
            case 552:
                return new ovi() { // from class: ouv
                };
            case 553:
                final apya apyaVar26 = this.a.bN;
                return new ovj() { // from class: ouu
                    @Override // defpackage.ovj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_direct_send_viewer_v2");
                    }
                };
            case 554:
                return new ovo() { // from class: ova
                };
            case 555:
                final apya apyaVar27 = this.a.bN;
                return new ove() { // from class: our
                    @Override // defpackage.ove
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_clear_attachments_on_close_in_direct_send_viewer_v2");
                    }
                };
            case 556:
                final apya apyaVar28 = this.a.bN;
                return new owp() { // from class: owg
                    @Override // defpackage.owp
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_v2_strings_in_image_compression_direct_send_viewer_v2");
                    }
                };
            case 557:
                return new adwo();
            case 558:
                final apya apyaVar29 = this.a.bN;
                return new ovh() { // from class: out
                    @Override // defpackage.ovh
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_direct_send_from_camera_gallery_input");
                    }
                };
            case 559:
                final apya apyaVar30 = this.a.bN;
                return new pli() { // from class: plg
                    @Override // defpackage.pli
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_magic_rewrite_shortcut");
                    }
                };
            case 560:
                final apya apyaVar31 = this.a.bN;
                return new ogy() { // from class: noq
                    @Override // defpackage.ogy
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_using_parent_theme_on_hugo_compose_screens");
                    }
                };
            case 561:
                arbj arbjVar = new arbj((char[]) null, (byte[]) null);
                arbjVar.i();
                arbjVar.j("Audio #%d");
                arbjVar.b = new acra(4);
                aneo bC = albo.bC(Executors.newScheduledThreadPool(2, arbj.t(arbjVar)));
                bC.getClass();
                return bC;
            case 562:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_animate_voice_mood_options"));
            case 563:
                return Boolean.valueOf(((ansy) this.a.bN.b()).e("bugle.enable_voice_screen_invocations"));
            case 564:
                final apya apyaVar32 = this.a.bN;
                return new ojt() { // from class: nql
                    @Override // defpackage.ojt
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_mms_group_upgrade_ui_conversation_screen");
                    }
                };
            case 565:
                final apya apyaVar33 = this.a.bN;
                return new pfo() { // from class: pey
                    @Override // defpackage.pfo
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_fix_for_group_upgrade_tooltip_talkback");
                    }
                };
            case 566:
                Context context3 = (Context) this.a.n.b();
                arwe arweVar2 = (arwe) this.a.bQ.b();
                context3.getClass();
                arweVar2.getClass();
                aozy createBuilder = utn.a.createBuilder();
                createBuilder.getClass();
                apag s = createBuilder.s();
                s.getClass();
                aozs aozsVar = aozs.a;
                apcc apccVar = apcc.a;
                return new eij(new eim(new fvq(s, aozs.a), rp.e, new qtq(context3, 19)), aqjn.y(new gds(arnv.a, (arpe) null, 1)), new dyi(), arweVar2);
            case 567:
                final apya apyaVar34 = this.a.bN;
                return new ogx() { // from class: noo
                    @Override // defpackage.ogx
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_theming_hugo");
                    }
                };
            case 568:
                return Boolean.valueOf(((asqc) this.a.SS().b.b()).y("com.google.android.apps.messaging.auto 45639172").e());
            case 569:
                return new ovp() { // from class: ovb
                };
            case 570:
                Context context4 = (Context) this.a.n.b();
                return new qyh(context4);
            case 571:
                return new aadi((arwe) this.a.bQ.b(), this.a.oL);
            case 572:
                return new ojf() { // from class: npy
                };
            case 573:
                return new ojg() { // from class: npz
                };
            case 574:
                return Long.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45648581").b());
            case 575:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45613917").b());
            case 576:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45640007").b());
            case 577:
                return Boolean.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45656178").e());
            case 578:
                final apya apyaVar35 = this.a.bN;
                return new pdr() { // from class: pdo
                    @Override // defpackage.pdr
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_dialog_list_item_on_click");
                    }
                };
            case 579:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45629264").b());
            case 580:
                return Long.valueOf(((asqc) this.a.a.a.dH.b()).y("com.google.android.apps.messaging.auto 45630590").b());
            case 581:
                final apya apyaVar36 = this.a.bN;
                return new piv() { // from class: pio
                    @Override // defpackage.piv
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_not_increment_counter_on_cancellation");
                    }
                };
            case 582:
                return Long.valueOf(((asqc) this.a.SL().b.b()).y("com.google.android.apps.messaging.auto 45478358").b());
            case 583:
                krv krvVar13 = this.a;
                return new kgq(krvVar13.oL, (arwe) krvVar13.bQ.b());
            case 584:
                final apya apyaVar37 = this.a.bN;
                return new pcz() { // from class: pbi
                    @Override // defpackage.pcz
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.show_sim_name_for_one_self_identity_group");
                    }
                };
            case 585:
                return new acxw() { // from class: acwe
                };
            case 586:
                final apya apyaVar38 = this.a.bN;
                return new oyb() { // from class: oxr
                    @Override // defpackage.oyb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_provide_assist_content");
                    }
                };
            case 587:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45426357").b());
            case 588:
                final apya apyaVar39 = this.a.bN;
                return new osd() { // from class: nvi
                    @Override // defpackage.osd
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.fix_monogram_colors");
                    }
                };
            case 589:
                final apya apyaVar40 = this.a.bN;
                return new pku() { // from class: pkt
                    @Override // defpackage.pku
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_group_search_in_multishare");
                    }
                };
            case 590:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45409228").b());
            case 591:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45409229").b());
            case 592:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45409230").b());
            case 593:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45428666").b());
            case 594:
                return Long.valueOf(((asqc) this.a.a.ja().a.b()).y("com.google.android.apps.messaging.auto 45428705").b());
            case 595:
                final apya apyaVar41 = this.a.bN;
                return new osc() { // from class: nvh
                    @Override // defpackage.osc
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.start_chat_enable_rcs_check_timeout");
                    }
                };
            case 596:
                final apya apyaVar42 = this.a.bN;
                return new oqj() { // from class: nuc
                    @Override // defpackage.oqj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_bot_id_resolver_via_bot_info");
                    }
                };
            case 597:
                final apya apyaVar43 = this.a.bN;
                return new oqk() { // from class: nua
                    @Override // defpackage.oqk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_bot_id_resolver_via_bot_info_germany");
                    }
                };
            case 598:
                final apya apyaVar44 = this.a.bN;
                return new oql() { // from class: nub
                    @Override // defpackage.oql
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_bot_id_resolver_via_bot_info_global");
                    }
                };
            case 599:
                final apya apyaVar45 = this.a.bN;
                return new oqi() { // from class: ntz
                    @Override // defpackage.oqi
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_bot_id_resolver_in_chat_starter");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        akmy TT;
        akmy TT2;
        final apya apyaVar;
        final apya apyaVar2;
        final apya apyaVar3;
        final apya apyaVar4;
        final apya apyaVar5;
        krx krxVar;
        apya apyaVar6;
        apya apyaVar7;
        krx krxVar2;
        apya apyaVar8;
        apya apyaVar9;
        krx krxVar3;
        krx krxVar4;
        apya apyaVar10;
        apya apyaVar11;
        krx krxVar5;
        apya apyaVar12;
        krx krxVar6;
        apya apyaVar13;
        apya apyaVar14;
        krx krxVar7;
        krx krxVar8;
        final apya apyaVar15;
        final apya apyaVar16;
        apya apyaVar17;
        krx krxVar9;
        apya apyaVar18;
        apya apyaVar19;
        apya apyaVar20;
        apya apyaVar21;
        apya apyaVar22;
        final apya apyaVar23;
        final apya apyaVar24;
        final apya apyaVar25;
        final apya apyaVar26;
        apya apyaVar27;
        apya apyaVar28;
        apya apyaVar29;
        apya apyaVar30;
        apya apyaVar31;
        apya apyaVar32;
        apya apyaVar33;
        krx krxVar10;
        apya apyaVar34;
        apya apyaVar35;
        apya apyaVar36;
        apya apyaVar37;
        apya apyaVar38;
        apya apyaVar39;
        apya apyaVar40;
        apya apyaVar41;
        apya apyaVar42;
        apya apyaVar43;
        apya apyaVar44;
        apya apyaVar45;
        apya apyaVar46;
        apya apyaVar47;
        krx krxVar11;
        apya apyaVar48;
        krx krxVar12;
        apya apyaVar49;
        apya apyaVar50;
        apya apyaVar51;
        apya apyaVar52;
        uac Qm;
        apya apyaVar53;
        apya apyaVar54;
        apya apyaVar55;
        apya apyaVar56;
        apya apyaVar57;
        apya apyaVar58;
        apya apyaVar59;
        apya apyaVar60;
        apya apyaVar61;
        krx krxVar13;
        apya apyaVar62;
        krx krxVar14;
        apya apyaVar63;
        apya apyaVar64;
        apya apyaVar65;
        apya apyaVar66;
        apya apyaVar67;
        apya apyaVar68;
        apya apyaVar69;
        apya apyaVar70;
        apya apyaVar71;
        apya apyaVar72;
        krx krxVar15;
        apya apyaVar73;
        apya apyaVar74;
        apya apyaVar75;
        apya apyaVar76;
        krx krxVar16;
        apya apyaVar77;
        apya apyaVar78;
        krx krxVar17;
        apya apyaVar79;
        krx krxVar18;
        apya apyaVar80;
        krx krxVar19;
        apya apyaVar81;
        krx krxVar20;
        apya apyaVar82;
        krx krxVar21;
        Map n;
        krx krxVar22;
        apya apyaVar83;
        apya apyaVar84;
        krx krxVar23;
        apya apyaVar85;
        krx krxVar24;
        apya apyaVar86;
        krx krxVar25;
        afiz bi;
        krx krxVar26;
        final apya apyaVar87;
        apya apyaVar88;
        apya apyaVar89;
        apya apyaVar90;
        krx krxVar27;
        krx krxVar28;
        apya apyaVar91;
        krx krxVar29;
        apya apyaVar92;
        apya apyaVar93;
        apya apyaVar94;
        apya apyaVar95;
        apya apyaVar96;
        apya apyaVar97;
        apya apyaVar98;
        apya apyaVar99;
        krx krxVar30;
        apya apyaVar100;
        apya apyaVar101;
        apya apyaVar102;
        apya apyaVar103;
        apya apyaVar104;
        apya apyaVar105;
        apya apyaVar106;
        apya apyaVar107;
        apya apyaVar108;
        apya apyaVar109;
        apya apyaVar110;
        apya apyaVar111;
        apya apyaVar112;
        apya apyaVar113;
        apya apyaVar114;
        final apya apyaVar115;
        final apya apyaVar116;
        final apya apyaVar117;
        final apya apyaVar118;
        final apya apyaVar119;
        apya apyaVar120;
        apya apyaVar121;
        apya apyaVar122;
        apya apyaVar123;
        apya apyaVar124;
        apya apyaVar125;
        apya apyaVar126;
        apya apyaVar127;
        apya apyaVar128;
        apya apyaVar129;
        apya apyaVar130;
        apya apyaVar131;
        apya apyaVar132;
        apya apyaVar133;
        apya apyaVar134;
        apya apyaVar135;
        apya apyaVar136;
        apya apyaVar137;
        apya apyaVar138;
        apya apyaVar139;
        apya apyaVar140;
        krx krxVar31;
        apya apyaVar141;
        apya apyaVar142;
        apya apyaVar143;
        apya apyaVar144;
        apya apyaVar145;
        krx krxVar32;
        apya apyaVar146;
        apya apyaVar147;
        krx krxVar33;
        apya apyaVar148;
        apya apyaVar149;
        apya apyaVar150;
        apya apyaVar151;
        apya apyaVar152;
        apya apyaVar153;
        krx krxVar34;
        apya apyaVar154;
        apya apyaVar155;
        final apya apyaVar156;
        apya apyaVar157;
        apya apyaVar158;
        apya apyaVar159;
        krx krxVar35;
        apya apyaVar160;
        krx krxVar36;
        apya apyaVar161;
        apya apyaVar162;
        apya apyaVar163;
        apya apyaVar164;
        apya apyaVar165;
        apya apyaVar166;
        apya apyaVar167;
        apya apyaVar168;
        apya apyaVar169;
        apya apyaVar170;
        apya apyaVar171;
        krx krxVar37;
        apya apyaVar172;
        krx krxVar38;
        apya apyaVar173;
        apya apyaVar174;
        apya apyaVar175;
        apya apyaVar176;
        apya apyaVar177;
        apya apyaVar178;
        apya apyaVar179;
        apya apyaVar180;
        apya apyaVar181;
        apya apyaVar182;
        apya apyaVar183;
        apya apyaVar184;
        apya apyaVar185;
        apya apyaVar186;
        apya apyaVar187;
        apya apyaVar188;
        apya apyaVar189;
        apya apyaVar190;
        apya apyaVar191;
        krx krxVar39;
        apya apyaVar192;
        apya apyaVar193;
        krx krxVar40;
        apya apyaVar194;
        apya apyaVar195;
        krx krxVar41;
        apya apyaVar196;
        apya apyaVar197;
        apya apyaVar198;
        apya apyaVar199;
        krx krxVar42;
        apya apyaVar200;
        apya apyaVar201;
        apya apyaVar202;
        apya apyaVar203;
        krx krxVar43;
        apya apyaVar204;
        apya apyaVar205;
        apya apyaVar206;
        apya apyaVar207;
        apya apyaVar208;
        apya apyaVar209;
        krx krxVar44;
        apya apyaVar210;
        apya apyaVar211;
        apya apyaVar212;
        krx krxVar45;
        apya apyaVar213;
        apya apyaVar214;
        apya apyaVar215;
        krx krxVar46;
        apya apyaVar216;
        apya apyaVar217;
        krx krxVar47;
        apya apyaVar218;
        apya apyaVar219;
        apya apyaVar220;
        krx krxVar48;
        apya apyaVar221;
        krx krxVar49;
        apya apyaVar222;
        krx krxVar50;
        apya apyaVar223;
        krx krxVar51;
        krx krxVar52;
        apya apyaVar224;
        apya apyaVar225;
        krx krxVar53;
        apya apyaVar226;
        apya apyaVar227;
        apya apyaVar228;
        krx krxVar54;
        apya apyaVar229;
        apya apyaVar230;
        apya apyaVar231;
        apya apyaVar232;
        apya apyaVar233;
        krx krxVar55;
        apya apyaVar234;
        apya apyaVar235;
        krx krxVar56;
        apya apyaVar236;
        krx krxVar57;
        apya apyaVar237;
        apya apyaVar238;
        krx krxVar58;
        apya apyaVar239;
        apya apyaVar240;
        apya apyaVar241;
        krx krxVar59;
        apya apyaVar242;
        krx krxVar60;
        apya apyaVar243;
        apya apyaVar244;
        krx krxVar61;
        apya apyaVar245;
        krx krxVar62;
        apya apyaVar246;
        krx krxVar63;
        apya apyaVar247;
        apya apyaVar248;
        krx krxVar64;
        apya apyaVar249;
        apya apyaVar250;
        apya apyaVar251;
        krx krxVar65;
        apya apyaVar252;
        apya apyaVar253;
        apya apyaVar254;
        krx krxVar66;
        apya apyaVar255;
        krx krxVar67;
        apya apyaVar256;
        apya apyaVar257;
        apya apyaVar258;
        krx krxVar68;
        apya apyaVar259;
        apya apyaVar260;
        apya apyaVar261;
        apya apyaVar262;
        krx krxVar69;
        apya apyaVar263;
        krx krxVar70;
        apya apyaVar264;
        apya apyaVar265;
        krx krxVar71;
        apya apyaVar266;
        krx krxVar72;
        apya apyaVar267;
        apya apyaVar268;
        krx krxVar73;
        apya apyaVar269;
        apya apyaVar270;
        apya apyaVar271;
        apya apyaVar272;
        apya apyaVar273;
        krx krxVar74;
        apya apyaVar274;
        apya apyaVar275;
        apya apyaVar276;
        krx krxVar75;
        apya apyaVar277;
        krx krxVar76;
        apya apyaVar278;
        krx krxVar77;
        apya apyaVar279;
        apya apyaVar280;
        krx krxVar78;
        apya apyaVar281;
        apya apyaVar282;
        apya apyaVar283;
        krx krxVar79;
        apya apyaVar284;
        apya apyaVar285;
        krx krxVar80;
        apya apyaVar286;
        apya apyaVar287;
        apya apyaVar288;
        apya apyaVar289;
        apya apyaVar290;
        apya apyaVar291;
        apya apyaVar292;
        apya apyaVar293;
        apya apyaVar294;
        apya apyaVar295;
        apya apyaVar296;
        apya apyaVar297;
        apya apyaVar298;
        apya apyaVar299;
        apya apyaVar300;
        apya apyaVar301;
        apya apyaVar302;
        krx krxVar81;
        apya apyaVar303;
        krx krxVar82;
        apya apyaVar304;
        apya apyaVar305;
        apya apyaVar306;
        krx krxVar83;
        apya apyaVar307;
        apya apyaVar308;
        apya apyaVar309;
        apya apyaVar310;
        krx krxVar84;
        apya apyaVar311;
        apya apyaVar312;
        apya apyaVar313;
        apya apyaVar314;
        krx krxVar85;
        apya apyaVar315;
        apya apyaVar316;
        apya apyaVar317;
        apya apyaVar318;
        apya apyaVar319;
        apya apyaVar320;
        apya apyaVar321;
        apya apyaVar322;
        apya apyaVar323;
        apya apyaVar324;
        apya apyaVar325;
        apya apyaVar326;
        apya apyaVar327;
        apya apyaVar328;
        apya apyaVar329;
        apya apyaVar330;
        final apya apyaVar331;
        apya apyaVar332;
        apya apyaVar333;
        apya apyaVar334;
        apya apyaVar335;
        apya apyaVar336;
        krx krxVar86;
        apya apyaVar337;
        krx krxVar87;
        apya apyaVar338;
        krx krxVar88;
        apya apyaVar339;
        krx krxVar89;
        afxz iq;
        krx krxVar90;
        apya apyaVar340;
        krx krxVar91;
        afxz iq2;
        krx krxVar92;
        apya apyaVar341;
        krx krxVar93;
        agcp io2;
        krx krxVar94;
        apya apyaVar342;
        apya apyaVar343;
        apya apyaVar344;
        apya apyaVar345;
        krx krxVar95;
        krx krxVar96;
        krx krxVar97;
        krx krxVar98;
        krx krxVar99;
        apya apyaVar346;
        apya apyaVar347;
        apya apyaVar348;
        krx krxVar100;
        apya apyaVar349;
        final apya apyaVar350;
        apya apyaVar351;
        apya apyaVar352;
        apya apyaVar353;
        krx krxVar101;
        apya apyaVar354;
        apya apyaVar355;
        apya apyaVar356;
        apya apyaVar357;
        apya apyaVar358;
        apya apyaVar359;
        apya apyaVar360;
        krx krxVar102;
        apya apyaVar361;
        krx krxVar103;
        final apya apyaVar362;
        aojj Tu;
        int i = this.b;
        switch (i) {
            case 600:
                TT = this.a.TT();
                return Long.valueOf(aqjv.e(TT));
            case 601:
                TT2 = this.a.TT();
                return Long.valueOf(aqjv.f(TT2));
            case 602:
                apyaVar = this.a.bN;
                return new pnw() { // from class: pnr
                    @Override // defpackage.pnw
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_debounce_in_start_chat");
                    }
                };
            case 603:
                apyaVar2 = this.a.bN;
                return new pnz() { // from class: pnu
                    @Override // defpackage.pnz
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_start_chat_destination_subtitle_fix");
                    }
                };
            case 604:
                apyaVar3 = this.a.bN;
                return new pnx() { // from class: pns
                    @Override // defpackage.pnx
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_show_group_chats_after_add_people");
                    }
                };
            case 605:
                apyaVar4 = this.a.bN;
                return new pny() { // from class: pnt
                    @Override // defpackage.pny
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_start_chat_back_behavior_fix");
                    }
                };
            case 606:
                apyaVar5 = this.a.bN;
                return new ose() { // from class: nvj
                    @Override // defpackage.ose
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.prevent_rename_to_duplicate_group_name");
                    }
                };
            case 607:
                return new kon();
            case 608:
                krxVar = this.a.a;
                apyaVar6 = krxVar.bT;
                return akdp.f((akka) apyaVar6.b());
            case 609:
                apyaVar7 = this.a.bI;
                ansy ansyVar = (ansy) apyaVar7.b();
                krxVar2 = this.a.a;
                Map hF = krx.hF(krxVar2);
                alor k = alor.k();
                alor k2 = alor.k();
                altx altxVar = new altx("pseudonymous");
                apyaVar8 = this.a.AW;
                return new aogy(ansyVar, hF, k, k2, altxVar, (ajyc) apyaVar8.b());
            case 610:
                apyaVar9 = this.a.AV;
                akag akagVar = (akag) apyaVar9.b();
                krxVar3 = this.a.a;
                return new ibb(akagVar, krx.iI(krxVar3));
            case 611:
                krxVar4 = this.a.a;
                apyaVar10 = krxVar4.b;
                return new ihm((qyo) apyaVar10.b());
            case 612:
                apyaVar11 = this.a.bI;
                return new akaj();
            case 613:
                krxVar5 = this.a.a;
                ahiy iF = krx.iF(krxVar5);
                apyaVar12 = this.a.bI;
                return new akaa(iF, (ansy) apyaVar12.b());
            case 614:
                krxVar6 = this.a.a;
                apyaVar13 = krxVar6.fK;
                Optional of = Optional.of((iba) apyaVar13.b());
                apyaVar14 = this.a.bI;
                ansy ansyVar2 = (ansy) apyaVar14.b();
                krxVar7 = this.a.a;
                krx.iF(krxVar7);
                return new ibc(of, ansyVar2);
            case 615:
                krxVar8 = this.a.a;
                return new iba(krx.iF(krxVar8));
            case 616:
                return new pim() { // from class: pih
                };
            case 617:
                apyaVar15 = this.a.bN;
                return new pgj() { // from class: pgb
                    @Override // defpackage.pgj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.cancel_inflight_home_screen_query_on_invalidation");
                    }
                };
            case 618:
                apyaVar16 = this.a.bN;
                return new pgq() { // from class: pgi
                    @Override // defpackage.pgq
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.prevent_home_screen_invalid_change_listener");
                    }
                };
            case 619:
                apyaVar17 = this.a.n;
                Context context = (Context) apyaVar17.b();
                krxVar9 = this.a.a;
                apyaVar18 = krxVar9.cM;
                yfu yfuVar = (yfu) apyaVar18.b();
                apyaVar19 = this.a.SN;
                uvq uvqVar = (uvq) apyaVar19.b();
                apyaVar20 = this.a.au;
                apyaVar21 = this.a.nV;
                agxw agxwVar = (agxw) apyaVar21.b();
                apyaVar22 = this.a.yY;
                return new kso(context, yfuVar, uvqVar, agxwVar, (orq) apyaVar22.b());
            case 620:
                return new hlc();
            case 621:
                return new lgb();
            case 622:
                apyaVar23 = this.a.bN;
                return new peu() { // from class: peq
                    @Override // defpackage.peu
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_recurring_account_metrics");
                    }
                };
            case 623:
                apyaVar24 = this.a.bN;
                return new pil() { // from class: pig
                    @Override // defpackage.pil
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_log_root_fragment_type");
                    }
                };
            case 624:
                return new pik() { // from class: pif
                };
            case 625:
                return new pij() { // from class: pie
                };
            case 626:
                apyaVar25 = this.a.bN;
                return new pin() { // from class: pii
                    @Override // defpackage.pin
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.performance_test_set_theme");
                    }
                };
            case 627:
                return new nxa() { // from class: njb
                };
            case 628:
                apyaVar26 = this.a.bN;
                return new pcx() { // from class: pbf
                    @Override // defpackage.pcx
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.revamp_chat_identity_settings_selection_screen");
                    }
                };
            case 629:
                apyaVar27 = this.a.n;
                return ahkm.l((Context) apyaVar27.b());
            case 630:
                apyaVar28 = this.a.bN;
                return Boolean.valueOf(lgb.R((ansy) apyaVar28.b()));
            case 631:
                apyaVar29 = this.a.n;
                return xrh.h((Context) apyaVar29.b());
            case 632:
                return new ojh() { // from class: nqa
                };
            case 633:
                apyaVar30 = this.a.n;
                Context context2 = (Context) apyaVar30.b();
                apyaVar31 = this.a.bB;
                return new kmt(context2, (mbl) apyaVar31.b());
            case 634:
                apyaVar32 = this.a.n;
                Context context3 = (Context) apyaVar32.b();
                apyaVar33 = this.a.bQ;
                arwe arweVar = (arwe) apyaVar33.b();
                krv krvVar = this.a;
                krxVar10 = krvVar.a;
                apyaVar34 = krxVar10.mV;
                apyaVar35 = krvVar.si;
                return new kpi(context3, arweVar, apyaVar34, apyaVar35);
            case 635:
                krv krvVar2 = this.a;
                apyaVar36 = krvVar2.dd;
                apyaVar37 = krvVar2.nk;
                apyaVar38 = krvVar2.mZ;
                return new kpl(apyaVar36, apyaVar37, apyaVar38);
            case 636:
                apyaVar39 = this.a.n;
                Context context4 = (Context) apyaVar39.b();
                apyaVar40 = this.a.bQ;
                arwe arweVar2 = (arwe) apyaVar40.b();
                krv krvVar3 = this.a;
                apyaVar41 = krvVar3.La;
                apyaVar42 = krvVar3.qV;
                apyaVar43 = krvVar3.KY;
                apyaVar44 = krvVar3.KZ;
                return new aaea(context4, arweVar2, apyaVar41, apyaVar42, apyaVar43, apyaVar44);
            case 637:
                apyaVar45 = this.a.n;
                Context context5 = (Context) apyaVar45.b();
                apyaVar46 = this.a.bQ;
                arwe arweVar3 = (arwe) apyaVar46.b();
                krv krvVar4 = this.a;
                apyaVar47 = krvVar4.qV;
                krxVar11 = krvVar4.a;
                apyaVar48 = krxVar11.gg;
                krxVar12 = krvVar4.a;
                apyaVar49 = krxVar12.gh;
                return new aafb(context5, arweVar3, apyaVar47, apyaVar48, apyaVar49);
            case 638:
                krv krvVar5 = this.a;
                apyaVar50 = krvVar5.jC;
                apyaVar51 = krvVar5.n;
                return new yft(apyaVar50);
            case 639:
                return new ofa() { // from class: nnb
                };
            case 640:
                apyaVar52 = this.a.n;
                Context context6 = (Context) apyaVar52.b();
                krv krvVar6 = this.a;
                Qm = krvVar6.Qm();
                apyaVar53 = krvVar6.ct;
                ansy ansyVar3 = (ansy) apyaVar53.b();
                apyaVar54 = this.a.aC;
                ahiy ahiyVar = (ahiy) apyaVar54.b();
                apyaVar55 = this.a.rO;
                zai zaiVar = (zai) apyaVar55.b();
                apyaVar56 = this.a.z;
                anen anenVar = (anen) apyaVar56.b();
                apyaVar57 = this.a.m;
                anen anenVar2 = (anen) apyaVar57.b();
                apyaVar58 = this.a.ol;
                qya qyaVar = (qya) apyaVar58.b();
                krv krvVar7 = this.a;
                apyaVar59 = krvVar7.tm;
                apyaVar60 = krvVar7.tl;
                apyaVar61 = krvVar7.lV;
                krxVar13 = krvVar7.a;
                apyaVar62 = krxVar13.mW;
                yhw yhwVar = (yhw) apyaVar62.b();
                krv krvVar8 = this.a;
                krxVar14 = krvVar8.a;
                apyaVar63 = krxVar14.kS;
                apyaVar64 = krvVar8.ee;
                apyaVar65 = krvVar8.dA;
                apyaVar66 = krvVar8.dq;
                apyaVar67 = krvVar8.ru;
                apyaVar68 = krvVar8.jN;
                apyaVar69 = krvVar8.dd;
                return new tby(context6, Qm, ansyVar3, ahiyVar, zaiVar, anenVar, anenVar2, qyaVar, apyaVar59, apyaVar60, apyaVar61, yhwVar, apyaVar63, apyaVar64, apyaVar65, apyaVar66, apyaVar67, apyaVar68, apyaVar69);
            case 641:
                apyaVar70 = this.a.n;
                Context context7 = (Context) apyaVar70.b();
                apyaVar71 = this.a.av;
                ykw ykwVar = (ykw) apyaVar71.b();
                apyaVar72 = this.a.ax;
                krxVar15 = this.a.a;
                krx.ia(krxVar15);
                apyaVar73 = this.a.us;
                apyaVar74 = this.a.ur;
                apyaVar75 = this.a.bV;
                apyaVar76 = this.a.m;
                return new yhw(context7, ykwVar);
            case 642:
                krxVar16 = this.a.a;
                apyaVar77 = krxVar16.eT;
                afdv afdvVar = (afdv) apyaVar77.b();
                apyaVar78 = this.a.yA;
                anca ancaVar = (anca) apyaVar78.b();
                krxVar17 = this.a.a;
                apyaVar79 = krxVar17.mn;
                apwt a = apxv.a(apyaVar79);
                krxVar18 = this.a.a;
                apyaVar80 = krxVar18.mY;
                apwt a2 = apxv.a(apyaVar80);
                krv krvVar9 = this.a;
                krxVar19 = krvVar9.a;
                apyaVar81 = krxVar19.mX;
                krxVar20 = krvVar9.a;
                apyaVar82 = krxVar20.eV;
                return new afdl(afdvVar, ancaVar, a, a2, apyaVar81, apyaVar82);
            case 643:
                krxVar21 = this.a.a;
                n = alor.n(new afdq("audio"), (afdp) krxVar21.gk.b(), new afdq("image"), (afdp) krxVar21.gk.b(), new afdq("video"), (afdp) krxVar21.gk.b());
                return acyb.i(n);
            case 644:
                krxVar22 = this.a.a;
                apyaVar83 = krxVar22.mp;
                atsg atsgVar = (atsg) apyaVar83.b();
                apyaVar84 = this.a.yA;
                anca ancaVar2 = (anca) apyaVar84.b();
                krv krvVar10 = this.a;
                krxVar23 = krvVar10.a;
                apyaVar85 = krxVar23.mX;
                krxVar24 = krvVar10.a;
                apyaVar86 = krxVar24.eV;
                return new aful(atsgVar, ancaVar2, apyaVar85, apyaVar86);
            case 645:
                krxVar25 = this.a.a;
                bi = krxVar25.bi();
                krxVar26 = this.a.a;
                return new addp(bi, krx.bg(krxVar26));
            case 646:
                apyaVar87 = this.a.bN;
                return new oug() { // from class: ouf
                    @Override // defpackage.oug
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_mini_camera_lifecycle_observer_fix");
                    }
                };
            case 647:
                krv krvVar11 = this.a;
                apyaVar88 = krvVar11.jN;
                apyaVar89 = krvVar11.jC;
                return new kkq(apyaVar88, (xca) apyaVar89.b());
            case 648:
                apyaVar90 = this.a.n;
                Context context8 = (Context) apyaVar90.b();
                krxVar27 = this.a.a;
                nei iM = krx.iM(krxVar27);
                krv krvVar12 = this.a;
                krxVar28 = krvVar12.a;
                apyaVar91 = krxVar28.nb;
                krxVar29 = krvVar12.a;
                apyaVar92 = krxVar29.mZ;
                return new kmw(context8, iM, apyaVar91, (kni) apyaVar92.b());
            case 649:
                apyaVar93 = this.a.n;
                Context context9 = (Context) apyaVar93.b();
                apyaVar94 = this.a.az;
                yep yepVar = (yep) apyaVar94.b();
                apyaVar95 = this.a.bV;
                return new kmv(context9, yepVar, (xnv) apyaVar95.b());
            case 650:
                apyaVar96 = this.a.az;
                yep yepVar2 = (yep) apyaVar96.b();
                apyaVar97 = this.a.SK;
                return new jxv(yepVar2, (armf) apyaVar97);
            case 651:
                apyaVar98 = this.a.z;
                return new ibi((Executor) apyaVar98.b());
            case 652:
                apyaVar99 = this.a.n;
                Context context10 = (Context) apyaVar99.b();
                krxVar30 = this.a.a;
                kkc ir = krx.ir(krxVar30);
                apyaVar100 = this.a.m;
                return new ksr(context10, ir, (anen) apyaVar100.b());
            case 653:
                apyaVar101 = this.a.z;
                anen anenVar3 = (anen) apyaVar101.b();
                apyaVar102 = this.a.m;
                anen anenVar4 = (anen) apyaVar102.b();
                apyaVar103 = this.a.ct;
                apyaVar104 = this.a.ee;
                trz trzVar = (trz) apyaVar104.b();
                krv krvVar13 = this.a;
                apyaVar105 = krvVar13.lO;
                apyaVar106 = krvVar13.dI;
                apyaVar107 = this.a.lM;
                uac uacVar = (uac) apyaVar107.b();
                krv krvVar14 = this.a;
                apyaVar108 = krvVar14.jN;
                apyaVar109 = krvVar14.lV;
                tsa tsaVar = (tsa) apyaVar109.b();
                apyaVar110 = this.a.cF;
                return new txg(anenVar3, anenVar4, trzVar, apyaVar105, uacVar, apyaVar108, tsaVar, apyaVar110);
            case 654:
                apyaVar111 = this.a.z;
                anen anenVar5 = (anen) apyaVar111.b();
                apyaVar112 = this.a.lV;
                tsa tsaVar2 = (tsa) apyaVar112.b();
                apyaVar113 = this.a.Ch;
                rja rjaVar = (rja) apyaVar113.b();
                apyaVar114 = this.a.qe;
                return new tyk(anenVar5, tsaVar2, rjaVar, apyaVar114);
            case 655:
                apyaVar115 = this.a.bN;
                return new ogk() { // from class: nof
                    @Override // defpackage.ogk
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.fix_base10_autodownload_size_formatting");
                    }
                };
            case 656:
                return new ojn() { // from class: nqf
                };
            case 657:
                apyaVar116 = this.a.bN;
                return new nia() { // from class: nim
                    @Override // defpackage.nia
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.allow_true_multi_device_opt_in");
                    }
                };
            case 658:
                apyaVar117 = this.a.bN;
                return new orb() { // from class: nuq
                    @Override // defpackage.orb
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_turn_off_rcs_screen");
                    }
                };
            case 659:
                apyaVar118 = this.a.bN;
                return new pmj() { // from class: plz
                    @Override // defpackage.pmj
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.disable_non_default_sms_app_from_rcs_settings");
                    }
                };
            case 660:
                apyaVar119 = this.a.bN;
                return new pdm() { // from class: pbu
                    @Override // defpackage.pdm
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.use_sim_slot_from_send_or_view_intent_to_pass_self_identity_to_conversation_creation");
                    }
                };
            case 661:
                apyaVar120 = this.a.ct;
                ansy ansyVar4 = (ansy) apyaVar120.b();
                apyaVar121 = this.a.aC;
                ahiy ahiyVar2 = (ahiy) apyaVar121.b();
                apyaVar122 = this.a.pq;
                ymh ymhVar = (ymh) apyaVar122.b();
                apyaVar123 = this.a.ol;
                qya qyaVar2 = (qya) apyaVar123.b();
                krv krvVar15 = this.a;
                znj Uu = krv.Uu(krvVar15);
                apyaVar124 = krvVar15.z;
                return new zwb(ansyVar4, ahiyVar2, ymhVar, qyaVar2, Uu, (anen) apyaVar124.b());
            case 662:
                apyaVar125 = this.a.ct;
                ansy ansyVar5 = (ansy) apyaVar125.b();
                apyaVar126 = this.a.aC;
                ahiy ahiyVar3 = (ahiy) apyaVar126.b();
                apyaVar127 = this.a.ol;
                qya qyaVar3 = (qya) apyaVar127.b();
                krv krvVar16 = this.a;
                apyaVar128 = krvVar16.tm;
                apyaVar129 = krvVar16.tl;
                apyaVar130 = this.a.oP;
                xwt xwtVar = (xwt) apyaVar130.b();
                apyaVar131 = this.a.hA;
                xbf xbfVar = (xbf) apyaVar131.b();
                apyaVar132 = this.a.z;
                return new zwt(ansyVar5, ahiyVar3, qyaVar3, apyaVar128, xwtVar, xbfVar, (anen) apyaVar132.b());
            case 663:
                apyaVar133 = this.a.ct;
                ansy ansyVar6 = (ansy) apyaVar133.b();
                apyaVar134 = this.a.aC;
                ahiy ahiyVar4 = (ahiy) apyaVar134.b();
                apyaVar135 = this.a.ol;
                qya qyaVar4 = (qya) apyaVar135.b();
                apyaVar136 = this.a.z;
                return new zwx(ansyVar6, ahiyVar4, qyaVar4, (anen) apyaVar136.b());
            case 664:
                apyaVar137 = this.a.ct;
                ansy ansyVar7 = (ansy) apyaVar137.b();
                apyaVar138 = this.a.z;
                anen anenVar6 = (anen) apyaVar138.b();
                apyaVar139 = this.a.ol;
                return new zvq(ansyVar7, anenVar6, (qya) apyaVar139.b());
            case 665:
                apyaVar140 = this.a.m;
                anen anenVar7 = (anen) apyaVar140.b();
                krxVar31 = this.a.a;
                apyaVar141 = krxVar31.nc;
                uac uacVar2 = (uac) apyaVar141.b();
                apyaVar142 = this.a.nk;
                return new zkm(anenVar7, uacVar2, (ndi) apyaVar142.b());
            case 666:
                apyaVar143 = this.a.ct;
                ansy ansyVar8 = (ansy) apyaVar143.b();
                apyaVar144 = this.a.aC;
                return new uac(ansyVar8, (ahiy) apyaVar144.b(), (byte[]) null);
            case 667:
                apyaVar145 = this.a.m;
                anen anenVar8 = (anen) apyaVar145.b();
                krxVar32 = this.a.a;
                apyaVar146 = krxVar32.nc;
                uac uacVar3 = (uac) apyaVar146.b();
                apyaVar147 = this.a.nk;
                return new zme(anenVar8, uacVar3, (ndi) apyaVar147.b());
            case 668:
                krv krvVar17 = this.a;
                krxVar33 = krvVar17.a;
                apyaVar148 = krxVar33.eK;
                apyaVar149 = krvVar17.m;
                anen anenVar9 = (anen) apyaVar149.b();
                apyaVar150 = this.a.bQ;
                arwe arweVar4 = (arwe) apyaVar150.b();
                apyaVar151 = this.a.ct;
                ansy ansyVar9 = (ansy) apyaVar151.b();
                krv krvVar18 = this.a;
                apyaVar152 = krvVar18.dB;
                apyaVar153 = krvVar18.aF;
                yjy yjyVar = (yjy) apyaVar153.b();
                krxVar34 = this.a.a;
                apyaVar154 = krxVar34.nc;
                uac uacVar4 = (uac) apyaVar154.b();
                apyaVar155 = this.a.nk;
                return new aair(apyaVar148, anenVar9, arweVar4, ansyVar9, apyaVar152, yjyVar, uacVar4, (ndi) apyaVar155.b());
            case 669:
                apyaVar156 = this.a.bN;
                return new oqp() { // from class: nug
                    @Override // defpackage.oqp
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.remove_bot_availability_check_via_bot_info");
                    }
                };
            case 670:
                return aqjv.g(krv.TV(this.a));
            case 671:
                apyaVar157 = this.a.bN;
                return Boolean.valueOf(lgb.U((ansy) apyaVar157.b()));
            case 672:
                return new ohd() { // from class: not
                };
            case 673:
                krv krvVar19 = this.a;
                apyaVar158 = krvVar19.mt;
                apyaVar159 = krvVar19.Ov;
                krxVar35 = krvVar19.a;
                apyaVar160 = krxVar35.am;
                krxVar36 = krvVar19.a;
                apyaVar161 = krxVar36.i;
                apyaVar162 = krvVar19.jy;
                apyaVar163 = krvVar19.iR;
                apyaVar164 = krvVar19.uv;
                apyaVar165 = krvVar19.bV;
                xnv xnvVar = (xnv) apyaVar165.b();
                krv krvVar20 = this.a;
                apyaVar166 = krvVar20.ko;
                apyaVar167 = krvVar20.EU;
                apyaVar168 = krvVar20.oc;
                apyaVar169 = krvVar20.dx;
                apwt a3 = apxv.a(apyaVar169);
                krv krvVar21 = this.a;
                apyaVar170 = krvVar21.av;
                apyaVar171 = krvVar21.gD;
                krxVar37 = krvVar21.a;
                apyaVar172 = krxVar37.ll;
                krxVar38 = krvVar21.a;
                apyaVar173 = krxVar38.u;
                apyaVar174 = krvVar21.yJ;
                apyaVar175 = krvVar21.si;
                apyaVar176 = krvVar21.dt;
                apyaVar177 = krvVar21.n;
                Context context11 = (Context) apyaVar177.b();
                krv krvVar22 = this.a;
                apyaVar178 = krvVar22.lY;
                apyaVar179 = krvVar22.ob;
                apyaVar180 = krvVar22.hC;
                apyaVar181 = krvVar22.es;
                apyaVar182 = krvVar22.aF;
                apyaVar183 = krvVar22.dw;
                apyaVar184 = krvVar22.et;
                apyaVar185 = krvVar22.lt;
                apyaVar186 = krvVar22.LD;
                apyaVar187 = krvVar22.DD;
                anen anenVar10 = (anen) apyaVar187.b();
                apyaVar188 = this.a.ij;
                apwt a4 = apxv.a(apyaVar188);
                krv krvVar23 = this.a;
                apyaVar189 = krvVar23.Ki;
                apyaVar190 = krvVar23.pk;
                apyaVar191 = krvVar23.pn;
                krxVar39 = krvVar23.a;
                apyaVar192 = krxVar39.lm;
                apyaVar193 = krvVar23.zd;
                krxVar40 = krvVar23.a;
                apyaVar194 = krxVar40.ln;
                apyaVar195 = krvVar23.uF;
                krxVar41 = krvVar23.a;
                apyaVar196 = krxVar41.nd;
                apyaVar197 = krvVar23.lI;
                apyaVar198 = krvVar23.Gm;
                apyaVar199 = krvVar23.dI;
                krxVar42 = krvVar23.a;
                apyaVar200 = krxVar42.bt;
                apyaVar201 = krvVar23.fa;
                apyaVar202 = krvVar23.cy;
                apyaVar203 = krvVar23.iQ;
                krxVar43 = krvVar23.a;
                apyaVar204 = krxVar43.ne;
                apyaVar205 = krvVar23.yF;
                apyaVar206 = krvVar23.GU;
                apyaVar207 = krvVar23.mr;
                apyaVar208 = krvVar23.rz;
                apyaVar209 = krvVar23.ly;
                krxVar44 = krvVar23.a;
                apyaVar210 = krxVar44.aC;
                apyaVar211 = krvVar23.ds;
                apyaVar212 = krvVar23.m;
                aneo aneoVar = (aneo) apyaVar212.b();
                krv krvVar24 = this.a;
                krxVar45 = krvVar24.a;
                apyaVar213 = krxVar45.nf;
                apyaVar214 = krvVar24.Gs;
                apyaVar215 = krvVar24.z;
                aneo aneoVar2 = (aneo) apyaVar215.b();
                krv krvVar25 = this.a;
                krxVar46 = krvVar25.a;
                apyaVar216 = krxVar46.bC;
                apyaVar217 = krvVar25.wh;
                krxVar47 = krvVar25.a;
                apyaVar218 = krxVar47.lo;
                apyaVar219 = krvVar25.sR;
                wjr wjrVar = (wjr) apyaVar219.b();
                krv krvVar26 = this.a;
                apyaVar220 = krvVar26.lq;
                krxVar48 = krvVar26.a;
                apyaVar221 = krxVar48.lp;
                krxVar49 = krvVar26.a;
                apyaVar222 = krxVar49.lq;
                krxVar50 = krvVar26.a;
                apyaVar223 = krxVar50.lr;
                krxVar51 = krvVar26.a;
                Object hw = krx.hw(krxVar51);
                krv krvVar27 = this.a;
                krxVar52 = krvVar27.a;
                apyaVar224 = krxVar52.ls;
                apyaVar225 = krvVar27.at;
                krxVar53 = krvVar27.a;
                apyaVar226 = krxVar53.lt;
                apyaVar227 = krvVar27.gJ;
                apyaVar228 = krvVar27.gC;
                krxVar54 = krvVar27.a;
                apyaVar229 = krxVar54.lu;
                apyaVar230 = krvVar27.wo;
                apyaVar231 = krvVar27.go;
                apyaVar232 = krvVar27.jW;
                apyaVar233 = krvVar27.cj;
                krxVar55 = krvVar27.a;
                apyaVar234 = krxVar55.lw;
                apyaVar235 = krvVar27.yH;
                krxVar56 = krvVar27.a;
                apyaVar236 = krxVar56.lx;
                krxVar57 = krvVar27.a;
                apyaVar237 = krxVar57.ly;
                apyaVar238 = krvVar27.SK;
                krxVar58 = krvVar27.a;
                apyaVar239 = krxVar58.lz;
                apyaVar240 = krvVar27.dd;
                apyaVar241 = krvVar27.bT;
                krxVar59 = krvVar27.a;
                apyaVar242 = krxVar59.lA;
                krxVar60 = krvVar27.a;
                apyaVar243 = krxVar60.w;
                apyaVar244 = krvVar27.ay;
                anen anenVar11 = (anen) apyaVar244.b();
                krv krvVar28 = this.a;
                krxVar61 = krvVar28.a;
                apyaVar245 = krxVar61.lB;
                krxVar62 = krvVar28.a;
                apyaVar246 = krxVar62.lC;
                krxVar63 = krvVar28.a;
                apyaVar247 = krxVar63.db;
                apyaVar248 = krvVar28.fY;
                krxVar64 = krvVar28.a;
                apyaVar249 = krxVar64.lD;
                apyaVar250 = krvVar28.sY;
                Optional empty = Optional.empty();
                apyaVar251 = krvVar28.aC;
                krxVar65 = krvVar28.a;
                apyaVar252 = krxVar65.lE;
                krv krvVar29 = this.a;
                apyaVar253 = krvVar29.cA;
                apyaVar254 = krvVar29.mY;
                krxVar66 = krvVar29.a;
                apyaVar255 = krxVar66.lF;
                krxVar67 = krvVar29.a;
                apyaVar256 = krxVar67.M;
                apyaVar257 = krvVar29.dq;
                apyaVar258 = krvVar29.gb;
                krv krvVar30 = this.a;
                krxVar68 = krvVar30.a;
                apyaVar259 = krxVar68.lG;
                apyaVar260 = krvVar30.xN;
                apyaVar261 = krvVar30.dF;
                apyaVar262 = krvVar30.gL;
                krxVar69 = krvVar30.a;
                apyaVar263 = krxVar69.bx;
                krxVar70 = krvVar30.a;
                apyaVar264 = krxVar70.ng;
                apyaVar265 = krvVar30.OZ;
                krxVar71 = krvVar30.a;
                apyaVar266 = krxVar71.lH;
                krxVar72 = krvVar30.a;
                apyaVar267 = krxVar72.lI;
                apyaVar268 = krvVar30.OC;
                krxVar73 = krvVar30.a;
                apyaVar269 = krxVar73.lJ;
                apyaVar270 = krvVar30.uf;
                apyaVar271 = krvVar30.ue;
                apyaVar272 = krvVar30.Aq;
                apyaVar273 = krvVar30.tA;
                krxVar74 = krvVar30.a;
                apyaVar274 = krxVar74.lK;
                apyaVar275 = krvVar30.xV;
                apyaVar276 = krvVar30.xO;
                krxVar75 = krvVar30.a;
                apyaVar277 = krxVar75.lL;
                krxVar76 = krvVar30.a;
                apyaVar278 = krxVar76.df;
                krxVar77 = krvVar30.a;
                apyaVar279 = krxVar77.dg;
                apyaVar280 = krvVar30.SL;
                krxVar78 = krvVar30.a;
                apyaVar281 = krxVar78.lM;
                apyaVar282 = krvVar30.jo;
                apyaVar283 = krvVar30.nk;
                krxVar79 = krvVar30.a;
                apyaVar284 = krxVar79.lN;
                apyaVar285 = krvVar30.EY;
                apxw a5 = apyd.a();
                krxVar80 = krvVar30.a;
                apyaVar286 = krxVar80.lO;
                return new aalt(apyaVar158, apyaVar159, apyaVar160, apyaVar161, apyaVar162, apyaVar163, apyaVar164, xnvVar, apyaVar166, apyaVar167, apyaVar168, a3, apyaVar170, apyaVar171, apyaVar172, apyaVar173, apyaVar174, apyaVar175, apyaVar176, context11, apyaVar178, apyaVar179, apyaVar180, apyaVar181, apyaVar182, apyaVar183, apyaVar184, apyaVar185, apyaVar186, anenVar10, a4, apyaVar189, apyaVar190, apyaVar191, apyaVar192, apyaVar193, apyaVar194, apyaVar195, apyaVar196, apyaVar197, apyaVar198, apyaVar199, apyaVar200, apyaVar201, apyaVar202, apyaVar203, apyaVar204, apyaVar205, apyaVar206, apyaVar207, apyaVar208, apyaVar209, apyaVar210, apyaVar211, aneoVar, apyaVar213, apyaVar214, aneoVar2, apyaVar216, apyaVar217, apyaVar218, wjrVar, apyaVar220, apyaVar221, apyaVar222, apyaVar223, (wyp) hw, apyaVar224, apyaVar225, apyaVar226, apyaVar227, apyaVar228, apyaVar229, apyaVar230, apyaVar231, apyaVar232, apyaVar233, apyaVar234, apyaVar235, apyaVar236, apyaVar237, apyaVar238, apyaVar239, apyaVar240, apyaVar241, apyaVar242, apyaVar243, anenVar11, apyaVar245, apyaVar246, apyaVar247, apyaVar248, apyaVar249, apyaVar250, empty, apyaVar251, apyaVar252, apyaVar253, apyaVar254, apyaVar255, apyaVar256, apyaVar257, apyaVar259, apyaVar260, apyaVar261, apyaVar262, apyaVar263, apyaVar264, apyaVar265, apyaVar266, apyaVar267, apyaVar268, apyaVar269, apyaVar270, apyaVar271, apyaVar272, apyaVar273, apyaVar274, apyaVar275, apyaVar276, apyaVar277, apyaVar278, apyaVar279, apyaVar280, apyaVar281, apyaVar282, apyaVar283, apyaVar284, apyaVar285, a5, apyaVar286);
            case 674:
                apyaVar287 = this.a.n;
                Context context12 = (Context) apyaVar287.b();
                krv krvVar31 = this.a;
                apyaVar288 = krvVar31.jN;
                apyaVar289 = krvVar31.et;
                apyaVar290 = krvVar31.jC;
                xca xcaVar = (xca) apyaVar290.b();
                apyaVar291 = this.a.z;
                return new aaly(context12, apyaVar288, apyaVar289, xcaVar, (anen) apyaVar291.b());
            case 675:
                apyaVar292 = this.a.yF;
                abbu abbuVar = (abbu) apyaVar292.b();
                apyaVar293 = this.a.iQ;
                uhc uhcVar = (uhc) apyaVar293.b();
                apyaVar294 = this.a.at;
                aksr aksrVar = (aksr) apyaVar294.b();
                apyaVar295 = this.a.dd;
                msk mskVar = (msk) apyaVar295.b();
                apyaVar296 = this.a.ay;
                return new zxy(abbuVar, uhcVar, aksrVar, mskVar, (anen) apyaVar296.b());
            case 676:
                apyaVar297 = this.a.n;
                Context context13 = (Context) apyaVar297.b();
                apyaVar298 = this.a.aF;
                yjy yjyVar2 = (yjy) apyaVar298.b();
                apyaVar299 = this.a.zy;
                yuu yuuVar = (yuu) apyaVar299.b();
                apyaVar300 = this.a.z;
                anen anenVar12 = (anen) apyaVar300.b();
                apyaVar301 = this.a.oj;
                ytk ytkVar = (ytk) apyaVar301.b();
                apyaVar302 = this.a.oi;
                yul yulVar = (yul) apyaVar302.b();
                krxVar81 = this.a.a;
                apyaVar303 = krxVar81.o;
                uki ukiVar = (uki) apyaVar303.b();
                krxVar82 = this.a.a;
                apyaVar304 = krxVar82.n;
                ukh ukhVar = (ukh) apyaVar304.b();
                apyaVar305 = this.a.rQ;
                lpg lpgVar = (lpg) apyaVar305.b();
                apyaVar306 = this.a.dd;
                return new aanj(context13, yjyVar2, yuuVar, anenVar12, ytkVar, yulVar, ukiVar, ukhVar, lpgVar, apyaVar306);
            case 677:
                krxVar83 = this.a.a;
                apyaVar307 = krxVar83.lo;
                aajv aajvVar = (aajv) apyaVar307.b();
                apyaVar308 = this.a.yr;
                abrc abrcVar = (abrc) apyaVar308.b();
                krv krvVar32 = this.a;
                wul fn = krv.fn(krvVar32);
                apyaVar309 = krvVar32.yk;
                aagg aaggVar = (aagg) apyaVar309.b();
                apyaVar310 = this.a.uJ;
                yxa yxaVar = (yxa) apyaVar310.b();
                krv krvVar33 = this.a;
                krxVar84 = krvVar33.a;
                apyaVar311 = krxVar84.l;
                apyaVar312 = krvVar33.at;
                aksr aksrVar2 = (aksr) apyaVar312.b();
                apyaVar313 = this.a.yE;
                abay abayVar = (abay) apyaVar313.b();
                apyaVar314 = this.a.dP;
                return new aaoq(aajvVar, abrcVar, fn, aaggVar, yxaVar, apyaVar311, aksrVar2, abayVar, (arwe) apyaVar314.b());
            case 678:
                Optional empty2 = Optional.empty();
                Optional.empty();
                krxVar85 = this.a.a;
                zmn ii = krx.ii(krxVar85);
                apyaVar315 = this.a.DD;
                anen anenVar13 = (anen) apyaVar315.b();
                apyaVar316 = this.a.z;
                anen anenVar14 = (anen) apyaVar316.b();
                apyaVar317 = this.a.n;
                Context context14 = (Context) apyaVar317.b();
                apyaVar318 = this.a.us;
                yyt yytVar = (yyt) apyaVar318.b();
                apyaVar319 = this.a.pH;
                return new aava(empty2, ii, anenVar13, anenVar14, context14, yytVar, apyaVar319, Optional.empty(), Optional.empty());
            case 679:
                apyaVar320 = this.a.n;
                Context context15 = (Context) apyaVar320.b();
                apyaVar321 = this.a.z;
                Executor executor = (Executor) apyaVar321.b();
                krv krvVar34 = this.a;
                apyaVar322 = krvVar34.gz;
                apyaVar323 = krvVar34.gB;
                return new zrs(context15, executor, apyaVar322, apyaVar323);
            case 680:
                apyaVar324 = this.a.dj;
                arpi arpiVar = (arpi) apyaVar324.b();
                apyaVar325 = this.a.dP;
                arwe arweVar5 = (arwe) apyaVar325.b();
                krv krvVar35 = this.a;
                apyaVar326 = krvVar35.fX;
                apyaVar327 = krvVar35.gl;
                apyaVar328 = krvVar35.n;
                Context context16 = (Context) apyaVar328.b();
                krv krvVar36 = this.a;
                apyaVar329 = krvVar36.eN;
                apyaVar330 = krvVar36.vk;
                return new wyp(arpiVar, arweVar5, apyaVar326, apyaVar327, context16, apyaVar329, apyaVar330);
            case 681:
                apyaVar331 = this.a.bN;
                return new opn() { // from class: ntp
                    @Override // defpackage.opn
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.handle_illegal_state_exception_when_checking_for_fullscreen");
                    }
                };
            case 682:
                apyaVar332 = this.a.n;
                apyaVar333 = this.a.z;
                return new aabr();
            case 683:
                apyaVar334 = this.a.n;
                return new abcb();
            case 684:
                apyaVar335 = this.a.n;
                Context context17 = (Context) apyaVar335.b();
                apyaVar336 = this.a.dO;
                arwe arweVar6 = (arwe) apyaVar336.b();
                krxVar86 = this.a.a;
                apyaVar337 = krxVar86.cg;
                afmd afmdVar = (afmd) apyaVar337.b();
                krxVar87 = this.a.a;
                apyaVar338 = krxVar87.cp;
                afmq afmqVar = (afmq) apyaVar338.b();
                krxVar88 = this.a.a;
                apyaVar339 = krxVar88.gP;
                Optional optional = (Optional) apyaVar339.b();
                krxVar89 = this.a.a;
                iq = krxVar89.iq();
                return acyb.s(context17, arweVar6, afmdVar, afmqVar, optional, iq);
            case 685:
                krxVar90 = this.a.a;
                return Optional.of(krx.bj(krxVar90));
            case 686:
                return new adwv(null, null);
            case 687:
                apyaVar340 = this.a.n;
                Context context18 = (Context) apyaVar340.b();
                krxVar91 = this.a.a;
                iq2 = krxVar91.iq();
                return new afnf(context18, iq2);
            case 688:
                return new adwv((byte[]) null);
            case 689:
                krxVar92 = this.a.a;
                apyaVar341 = krxVar92.nj;
                afji afjiVar = (afji) apyaVar341.b();
                krxVar93 = this.a.a;
                io2 = krxVar93.io();
                return acyb.r(afjiVar, io2);
            case 690:
                return new afji("magic_compose_style", afob.g, afqw.a);
            case 691:
                krxVar94 = this.a.a;
                apyaVar342 = krxVar94.ey;
                yai yaiVar = (yai) apyaVar342.b();
                apyaVar343 = this.a.oX;
                yti ytiVar = (yti) apyaVar343.b();
                apyaVar344 = this.a.at;
                return new zoj(yaiVar, ytiVar, (aksr) apyaVar344.b());
            case 692:
                apyaVar345 = this.a.n;
                krxVar95 = this.a.a;
                iew ix = krx.ix(krxVar95);
                krxVar96 = this.a.a;
                iew iG = krx.iG(krxVar96);
                krxVar97 = this.a.a;
                iew iA = krx.iA(krxVar97);
                krxVar98 = this.a.a;
                iew iB = krx.iB(krxVar98);
                krxVar99 = this.a.a;
                return new iew(ix, iG, iA, iB, krx.iE(krxVar99));
            case 693:
                krv krvVar37 = this.a;
                apyaVar346 = krvVar37.ci;
                apyaVar347 = krvVar37.um;
                apyaVar348 = krvVar37.ee;
                krxVar100 = krvVar37.a;
                apyaVar349 = krxVar100.lP;
                return new gpx(apyaVar346, apyaVar347, apyaVar348, apyaVar349, (char[]) null, (byte[]) null);
            case 694:
                apyaVar350 = this.a.bN;
                return new oal() { // from class: nkd
                    @Override // defpackage.oal
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.show_not_downloadable_media_in_conv1");
                    }
                };
            case 695:
                krv krvVar38 = this.a;
                apyaVar351 = krvVar38.et;
                apyaVar352 = krvVar38.ny;
                apyaVar353 = krvVar38.Ci;
                krxVar101 = krvVar38.a;
                apyaVar354 = krxVar101.cS;
                apyaVar355 = krvVar38.eQ;
                tqx tqxVar = (tqx) apyaVar355.b();
                apyaVar356 = this.a.xC;
                nzq nzqVar = (nzq) apyaVar356.b();
                apyaVar357 = this.a.bQ;
                arwe arweVar7 = (arwe) apyaVar357.b();
                apyaVar358 = this.a.bP;
                arpi arpiVar2 = (arpi) apyaVar358.b();
                krv krvVar39 = this.a;
                apyaVar359 = krvVar39.bV;
                apyaVar360 = krvVar39.or;
                return new ahmv(apyaVar351, apyaVar352, apyaVar353, apyaVar354, tqxVar, nzqVar, arweVar7, arpiVar2, apyaVar359, apyaVar360);
            case 696:
                krxVar102 = this.a.a;
                Map hE = krx.hE(krxVar102);
                apyaVar361 = this.a.at;
                return akmm.h(hE, (aksr) apyaVar361.b());
            case 697:
                krxVar103 = this.a.a;
                return new lxp(krx.e(krxVar103), 1);
            case 698:
                apyaVar362 = this.a.bN;
                return new ohy() { // from class: nph
                    @Override // defpackage.ohy
                    public final boolean a() {
                        return ((ansy) armf.this.b()).e("bugle.enable_improved_d2d_for_backup_and_restore");
                    }
                };
            case 699:
                Tu = this.a.Tu();
                return Long.valueOf(aqjr.t(Tu));
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v84, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [armf, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        long b;
        Object obj;
        Object wakVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            default:
                switch (i) {
                    case 700:
                        Object a = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45620682").b.a();
                        a.getClass();
                        Double d = (Double) a;
                        d.doubleValue();
                        return d;
                    case 701:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45620757").b();
                        return Long.valueOf(b);
                    case 702:
                        final apya apyaVar = this.a.bN;
                        obj = new phv() { // from class: phj
                            @Override // defpackage.phv
                            public final boolean a() {
                                return ((ansy) armf.this.b()).e("bugle.get_file_size_from_telephony_during_backup");
                            }
                        };
                        return obj;
                    case 703:
                        final apya apyaVar2 = this.a.bN;
                        obj = new pib() { // from class: pho
                            @Override // defpackage.pib
                            public final boolean a() {
                                return ((ansy) armf.this.b()).e("bugle.skip_empty_files_for_d2d_backup");
                            }
                        };
                        return obj;
                    case 704:
                        krv krvVar = this.a;
                        return new idg(krvVar.a.gY, (arwe) krvVar.dO.b(), (arpi) this.a.dj.b(), (aduw) this.a.gx.b(), (xnv) this.a.bV.b());
                    case 705:
                        krv krvVar2 = this.a;
                        obj = new ido(krvVar2.jQ, (arwe) krvVar2.bQ.b());
                        return obj;
                    case 706:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45626505").b();
                        return Long.valueOf(b);
                    case 707:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45633091").b();
                        return Long.valueOf(b);
                    case 708:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45633090").b();
                        return Long.valueOf(b);
                    case 709:
                        return Boolean.valueOf(((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45647547").e());
                    case 710:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45647766").b();
                        return Long.valueOf(b);
                    case 711:
                        krv krvVar3 = this.a;
                        obj = new ifb((armf) krvVar3.cj, (arpi) krvVar3.dj.b());
                        return obj;
                    case 712:
                        krx krxVar = this.a.a;
                        Context context = (Context) krxVar.a.n.b();
                        wzy wzyVar = (wzy) krxVar.a.dx.b();
                        jat jatVar = (jat) krxVar.a.xQ.b();
                        lva lvaVar = (lva) krxVar.a.ya.b();
                        luz luzVar = (luz) krxVar.a.xO.b();
                        arwe arweVar = (arwe) krxVar.a.dO.b();
                        arpi arpiVar = (arpi) krxVar.a.dj.b();
                        xnv xnvVar = (xnv) krxVar.a.bV.b();
                        krv krvVar4 = krxVar.a;
                        return new lxp(new lxo(context, wzyVar, jatVar, lvaVar, luzVar, arweVar, arpiVar, xnvVar, krxVar.gZ, krxVar.ha, krxVar.hb, krvVar4.xX, (arwe) krvVar4.dP.b(), (lxs) krxVar.hc.b()), 0);
                    case 713:
                        krv krvVar5 = this.a;
                        obj = new kor((armf) krvVar5.a.gY, (xnv) krvVar5.bV.b());
                        return obj;
                    case 714:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45650000").b();
                        return Long.valueOf(b);
                    case 715:
                        b = ((asqc) this.a.Tu().b.b()).y("com.google.android.apps.messaging.auto 45650002").b();
                        return Long.valueOf(b);
                    case 716:
                        return new lxs();
                    case 717:
                        arpi arpiVar2 = (arpi) this.a.dN.b();
                        krv krvVar6 = this.a;
                        obj = new wqd(arpiVar2, krvVar6.a.aN(), (xnv) krvVar6.bV.b());
                        return obj;
                    case 718:
                        krv krvVar7 = this.a;
                        krv krvVar8 = krvVar7.a.a;
                        apya apyaVar3 = krvVar7.sx;
                        apya apyaVar4 = krvVar7.sw;
                        apya apyaVar5 = krvVar7.sz;
                        apya apyaVar6 = krvVar7.sy;
                        apya apyaVar7 = krvVar7.sA;
                        apya apyaVar8 = krvVar7.sB;
                        apya apyaVar9 = krvVar7.sC;
                        apya apyaVar10 = krvVar7.lz;
                        apya apyaVar11 = krvVar7.rc;
                        vzt vztVar = new vzt(new wfh(krvVar8.cF), new wad(), (vbu) krvVar8.dI.b());
                        vzo vzoVar = new vzo(6);
                        krv krvVar9 = this.a;
                        anen anenVar = (anen) krvVar9.z.b();
                        krx krxVar2 = krvVar9.a;
                        obj = new vyu(apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, apyaVar11, vztVar, vzoVar, krxVar2.hd, krxVar2.he, krxVar2.hf, anenVar);
                        return obj;
                    case 719:
                        obj = new wal(this.a.dI);
                        return obj;
                    case 720:
                        krv krvVar10 = this.a;
                        wakVar = new wak(krvVar10.cF, krvVar10.dI);
                        return wakVar;
                    case 721:
                        return new vzo(5);
                    case 722:
                        return new aded();
                    case 723:
                        obj = new wqg((arpi) this.a.dN.b(), this.a.a.aN());
                        return obj;
                    case 724:
                        aksr aksrVar = (aksr) this.a.at.b();
                        alfd alfdVar = alfd.a;
                        alob alobVar = new alob();
                        alobVar.h((aqvt) alfdVar.c(new aomf(aksrVar, 0)));
                        alog g = alobVar.g();
                        g.getClass();
                        return g;
                    case 725:
                        Context context2 = (Context) this.a.n.b();
                        alpt alptVar = idh.a;
                        context2.getClass();
                        return aode.V(context2, idh.b);
                    case 726:
                        Context context3 = (Context) this.a.n.b();
                        krv krvVar11 = this.a;
                        apya apyaVar12 = krvVar11.ca;
                        anen anenVar2 = (anen) krvVar11.ay.b();
                        krv krvVar12 = this.a;
                        uuc uucVar = (uuc) krvVar12.aI.b();
                        krv krvVar13 = this.a;
                        return new RcsStateProvider(context3, apyaVar12, anenVar2, krvVar12.a.F, uucVar, krvVar13.aA, krvVar13.Ag, krvVar13.gz, krvVar13.gB);
                    case 727:
                        Context context4 = (Context) this.a.n.b();
                        alpt alptVar2 = idh.a;
                        context4.getClass();
                        return aode.V(context4, idh.a);
                    case 728:
                        mbl mblVar = (mbl) this.a.bB.b();
                        Optional optional = (Optional) this.a.ob.b();
                        krv krvVar14 = this.a;
                        krx krxVar3 = krvVar14.a;
                        return new weu(mblVar, optional, krxVar3.aA(), krxVar3.jb(), krvVar14.lJ, krvVar14.ww, krvVar14.sN);
                    case 729:
                        final apya apyaVar13 = this.a.bN;
                        obj = new oku() { // from class: nrk
                            @Override // defpackage.oku
                            public final boolean a() {
                                return ((ansy) armf.this.b()).e("bugle.enable_populate_rcs_available_identity_map_on_tickle");
                            }
                        };
                        return obj;
                    case 730:
                        Context context5 = (Context) this.a.n.b();
                        akbm akbmVar = (akbm) this.a.dK.b();
                        context5.getClass();
                        akbmVar.getClass();
                        wakVar = new abrc(context5, ackk.a, ackj.a, yyb.f(akbmVar).a());
                        return wakVar;
                    case 731:
                        obj = new ibi(this.a.a.at(), (byte[]) null);
                        return obj;
                    case 732:
                        return new otq() { // from class: nwc
                        };
                    case 733:
                        final apya apyaVar14 = this.a.bN;
                        obj = new pqk() { // from class: ppw
                            @Override // defpackage.pqk
                            public final boolean a() {
                                return ((ansy) armf.this.b()).e("bugle.wearable_bind_service_handle_null_bytes");
                            }
                        };
                        return obj;
                    case 734:
                        aqws aqwsVar = new aqws();
                        aqwsVar.b();
                        return aqwsVar.a();
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
