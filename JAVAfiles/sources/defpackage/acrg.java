package defpackage;

import android.content.Context;
import com.android.vcard.VCardConstants;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import j$.util.Optional;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrg implements apya {
    public final acrh a;
    private final int b;

    public acrg(acrh acrhVar, int i) {
        this.a = acrhVar;
        this.b = i;
    }

    private final Object a() {
        wwn fr;
        int i = this.b;
        switch (i) {
            case 0:
                return new acyx();
            case 1:
                acrh acrhVar = this.a;
                Context context = (Context) ((apxx) acrhVar.a).a;
                yju yjuVar = (yju) acrhVar.k.b();
                acrh acrhVar2 = this.a;
                apwt a = apxv.a(acrhVar2.t);
                aczc.m();
                return new yjr(context, acrhVar.c, acrhVar2.W, acrhVar.f, yjuVar, a);
            case 2:
                return new advw((aduu) this.a.b.b());
            case 3:
                return new aduu((Context) ((apxx) this.a.a).a);
            case 4:
                acrh acrhVar3 = this.a;
                Object obj = ((apxx) acrhVar3.a).a;
                acrhVar3.V.getClass();
                return yyb.ao((Context) obj, acrhVar3.c, acrhVar3.d, acrhVar3.U, acrhVar3.k, acrhVar3.g, acrhVar3.I);
            case 5:
                return new advx(0);
            case 6:
                return new yjg((Context) ((apxx) this.a.a).a);
            case 7:
                acrh acrhVar4 = this.a;
                yyt yytVar = new yyt((armf) acrhVar4.f, (armf) acrhVar4.I, (armf) acrhVar4.k, (armf) acrhVar4.t, (byte[]) null);
                acrh acrhVar5 = this.a;
                apya apyaVar = acrhVar5.S;
                return xrh.s(yytVar, acrhVar5.O.b(), acrhVar5.R.b(), apyaVar.b(), new znj((armf) acrhVar5.T, (armf) acrhVar5.a, (short[]) null));
            case 8:
                acrh acrhVar6 = this.a;
                return mbf.j(acrhVar6.E, acrhVar6.F, acrhVar6.G, acrhVar6.H, (msd) acrhVar6.r.b());
            case 9:
                acrh acrhVar7 = this.a;
                apya apyaVar2 = acrhVar7.D;
                apya apyaVar3 = acrhVar7.l;
                apya apyaVar4 = acrhVar7.g;
                return new mrk(apxv.a(acrhVar7.i), apxv.a(acrhVar7.j), apxv.a(apyaVar4), apxv.a(apyaVar3), apxv.a(apyaVar2));
            case 10:
                acrh acrhVar8 = this.a;
                return new msx(apxv.a(acrhVar8.g), apxv.a(acrhVar8.h));
            case 11:
                return new psq((yjr) this.a.g.b());
            case 12:
                return new yjs((yju) this.a.k.b());
            case 13:
                return new yju(this.a.f);
            case 14:
                acrh acrhVar9 = this.a;
                return new lxe(apyb.a(acrhVar9.C), acrhVar9.g, (char[]) null);
            case 15:
                acrh acrhVar10 = this.a;
                Object obj2 = ((apxx) acrhVar10.a).a;
                apya apyaVar5 = acrhVar10.g;
                apya apyaVar6 = acrhVar10.l;
                apya apyaVar7 = acrhVar10.t;
                return new msj((Context) obj2, apxv.a(acrhVar10.B), apxv.a(acrhVar10.f), apxv.a(apyaVar7), apxv.a(apyaVar6), apxv.a(apyaVar5));
            case 16:
                acrh acrhVar11 = this.a;
                return new qxr(acrhVar11.l, acrhVar11.n, acrhVar11.o, acrhVar11.q, acrhVar11.t, acrhVar11.y, acrhVar11.z, acrhVar11.A, (byte[]) null);
            case 17:
                return new vxq((yst) this.a.m.b());
            case 18:
                return new yst();
            case 19:
                return new vqr(this.a.m);
            case 20:
                return new qcr((uac) this.a.p.b(), 15);
            case 21:
                return new uac((byte[]) null, (byte[]) null);
            case 22:
                return xrh.g(this.a.s);
            case 23:
                acrh acrhVar12 = this.a;
                return new ansy((Context) ((apxx) acrhVar12.a).a, (anhp) acrhVar12.r.b(), (byte[]) null);
            case 24:
                return mbf.l(altg.a);
            case 25:
                return new acwa(this.a.x);
            case 26:
                acrh acrhVar13 = this.a;
                return new ansy(acrhVar13.w(), (atsg) acrhVar13.w.b(), (byte[]) null);
            case 27:
                return Boolean.valueOf(albo.aL());
            case 28:
                return Boolean.valueOf(albo.aM());
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return Boolean.valueOf(albo.aN());
            case 30:
                return Boolean.valueOf(albo.aO());
            case 31:
                return Boolean.valueOf(albo.aP());
            case 32:
                return Boolean.valueOf(albo.aQ());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                return Boolean.valueOf(albo.aR());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                return Boolean.valueOf(albo.aS());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                return Boolean.valueOf(albo.aT());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                return Boolean.valueOf(albo.aU());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                return Boolean.valueOf(albo.aV());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                return Boolean.valueOf(albo.aW());
            case 39:
                return Boolean.valueOf(albo.aX());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                return Boolean.valueOf(albo.aY());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                return Boolean.valueOf(albo.aZ());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                return Boolean.valueOf(albo.ba());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                return Boolean.valueOf(albo.bb());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                return Boolean.valueOf(albo.bc());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                return Boolean.valueOf(albo.bd());
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                return Boolean.valueOf(albo.be());
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                return Boolean.valueOf(albo.bf());
            case 48:
                return Boolean.valueOf(albo.bg());
            case 49:
                return Boolean.valueOf(albo.bh());
            case 50:
                return Boolean.valueOf(albo.bi());
            case 51:
                return Boolean.valueOf(albo.bj());
            case 52:
                return Boolean.valueOf(albo.bk());
            case 53:
                return Boolean.valueOf(albo.bl());
            case 54:
                return Boolean.valueOf(albo.bm());
            case 55:
                return Boolean.valueOf(albo.bn());
            case 56:
                return Boolean.valueOf(albo.bo());
            case 57:
                return Boolean.valueOf(albo.bp());
            case 58:
                return Boolean.valueOf(albo.bq());
            case 59:
                return Boolean.valueOf(albo.br());
            case 60:
                return Boolean.valueOf(albo.bs());
            case 61:
                return Boolean.valueOf(albo.bt());
            case 62:
                return Boolean.valueOf(albo.bu());
            case 63:
                return Boolean.valueOf(albo.bv());
            case 64:
                return Boolean.valueOf(albo.bw());
            case 65:
                return Boolean.valueOf(albo.bx());
            case 66:
                return Boolean.valueOf(albo.by());
            case 67:
                acrh acrhVar14 = this.a;
                return new atsg(Optional.of(acrhVar14.v), Optional.empty(), acrhVar14.w());
            case 68:
                return new albo();
            case 69:
                return true;
            case 70:
                alok h = alor.h(48);
                h.h(acuo.class, "cslib.always_set_initial_state");
                h.h(acxs.class, "cslib.anonymize_non_latin_digits");
                h.h(acwp.class, "cslib.check_phone_number_validity_in_configuration_utils");
                h.h(acwn.class, "");
                h.h(acwq.class, "cslib.delete_sim_preferences_reset_private_jibe_data");
                h.h(acwr.class, "cslib.deprecate_sim_state_tracker");
                h.h(acya.class, "cslib.disable_incoming_messages_listener_for_chat_session_service");
                h.h(acws.class, "cslib.disable_null_sim_subscription_infos_as_defaults");
                h.h(acwt.class, "cslib.disable_pesm_for_non_default_call_sim");
                h.h(acwu.class, "");
                h.h(acxy.class, "");
                h.h(acwv.class, "cslib.enable_all_subscriptions_as_verified");
                h.h(acxw.class, "");
                h.h(acww.class, "cslib.enable_compute_availability_from_availability_util");
                h.h(acwj.class, "cslib.enable_fi_multi_sync_help_article_in_rcs_settings");
                h.h(acwx.class, "cslib.enable_full_stacktrace_logging_in_rcs_mapping_accessor");
                h.h(acwk.class, "cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                h.h(acwo.class, "cslib.enable_handle_missing_verification_statuses");
                h.h(acwy.class, "cslib.enable_identity_mapping_info_logging");
                h.h(acwz.class, "");
                h.h(acxa.class, "cslib.enable_is_sim_loaded_comparison_event");
                h.h(acxb.class, "cslib.enable_log_missing_identity_mapping_event_in_cs");
                h.h(acxc.class, "cslib.enable_lookup_by_sim_subscription_info_retriever");
                h.h(acxx.class, "");
                h.h(acxd.class, "cslib.enable_phone_number_backfill_in_identity_mapping_in_cs");
                h.h(acxe.class, "cslib.enable_phone_number_length_logging_in_cs");
                h.h(acxt.class, "cslib.enable_provisioning_apis_comparison_logging");
                h.h(acxf.class, "cslib.enable_rcs_not_enabled_if_no_sim_subscription_info");
                h.h(acxg.class, "cslib.enable_rcs_provisioning_manager_logging");
                h.h(acxh.class, "cslib.enable_recurring_metrics_availability_update_for_eligible_sims");
                h.h(acxi.class, "cslib.enable_schedule_provisioning_using_sim_id");
                h.h(acxu.class, "cslib.enable_set_consent_error_handling_fix");
                h.h(acxv.class, "cslib.enable_use_injection_for_provisioning_engine_state_cache");
                h.h(acxj.class, "cslib.enable_verbose_logging_in_rcs_mapping_accessor");
                h.h(acwl.class, "cslib.enable_wear_consent_changes");
                h.h(acwm.class, "");
                h.h(acxk.class, "cslib.handle_sim_loaded_in_phone_sims_state_updater");
                h.h(acxl.class, "cslib.log_event_sim_subscription_provisioning_metadata");
                h.h(acxz.class, "cslib.remove_is_gsm_check_in_query_builder");
                h.h(acxm.class, "cslib.suppress_removing_existent_row_id_exception");
                h.h(acyc.class, "");
                h.h(acyd.class, "cslib.test_ramp_down");
                h.h(acwi.class, "cslib.use_character_anonymizer");
                h.h(acxn.class, "cslib.use_new_apis_notify_rcs_unavailable_worker");
                h.h(acxo.class, "cslib.use_phone_sims_state_cache_for_sim_loaded");
                h.h(acxp.class, "cslib.use_phone_sims_state_cache_for_sims_state_update");
                h.h(acxq.class, "cslib.use_sim_subscription_info_for_iccid_binding");
                h.h(acxr.class, "cslib.use_sim_subscription_info_retriever_bugle_comparison_logging");
                return h.b();
            case 71:
                return new acuq(this.a.x);
            case 72:
                acrh acrhVar15 = this.a;
                return new uac(acrhVar15.q, acrhVar15.y, (char[]) null, (byte[]) null);
            case 73:
                acrh acrhVar16 = this.a;
                apya apyaVar8 = acrhVar16.r;
                apya apyaVar9 = acrhVar16.D;
                apya apyaVar10 = acrhVar16.l;
                apya apyaVar11 = acrhVar16.j;
                apya apyaVar12 = acrhVar16.t;
                return new mrw(apxv.a(acrhVar16.i), apxv.a(acrhVar16.g), apxv.a(apyaVar12), apxv.a(apyaVar11), apxv.a(apyaVar10), apxv.a(apyaVar9), apxv.a(apyaVar8));
            case 74:
                acrh acrhVar17 = this.a;
                apya apyaVar13 = acrhVar17.D;
                apya apyaVar14 = acrhVar17.l;
                apya apyaVar15 = acrhVar17.g;
                return new mrq(apxv.a(acrhVar17.i), apxv.a(acrhVar17.j), apxv.a(apyaVar15), apxv.a(apyaVar14), apxv.a(apyaVar13));
            case 75:
                acrh acrhVar18 = this.a;
                Object obj3 = ((apxx) acrhVar18.a).a;
                apya apyaVar16 = acrhVar18.r;
                apya apyaVar17 = acrhVar18.D;
                apya apyaVar18 = acrhVar18.g;
                apya apyaVar19 = acrhVar18.l;
                apya apyaVar20 = acrhVar18.t;
                apya apyaVar21 = acrhVar18.f;
                apya apyaVar22 = acrhVar18.B;
                apya apyaVar23 = acrhVar18.F;
                apwt a2 = apxv.a(acrhVar18.E);
                apwt a3 = apxv.a(apyaVar23);
                apwt a4 = apxv.a(apyaVar22);
                apwt a5 = apxv.a(apyaVar21);
                apwt a6 = apxv.a(apyaVar20);
                apwt a7 = apxv.a(apyaVar19);
                apwt a8 = apxv.a(apyaVar18);
                apwt a9 = apxv.a(apyaVar17);
                apxv.a(apyaVar16);
                return lgc.E((Context) obj3, a2, a3, a4, a5, a6, a7, a8, a9);
            case 76:
                acrh acrhVar19 = this.a;
                return new wpp((armf) acrhVar19.N, (armf) acrhVar19.K, (armf) acrhVar19.a, (byte[]) null);
            case 77:
                acrh acrhVar20 = this.a;
                return new wyp(acrhVar20.L, acrhVar20.M, acrhVar20.f, acrhVar20.K, acrhVar20.I, acrhVar20.a, acrhVar20.t, (char[]) null, (byte[]) null);
            case 78:
                acrh acrhVar21 = this.a;
                return new zxy(acrhVar21.a, acrhVar21.J, acrhVar21.K, acrhVar21.I, acrhVar21.t);
            case 79:
                return new yyb();
            case 80:
                return new ykp((Context) ((apxx) this.a.a).a);
            case 81:
                acrh acrhVar22 = this.a;
                return new yka((Context) ((apxx) acrhVar22.a).a, (yjf) acrhVar22.e.b());
            case 82:
                acrh acrhVar23 = this.a;
                return new yyt(acrhVar23.P, acrhVar23.K, acrhVar23.a, acrhVar23.Q, (byte[]) null, (byte[]) null);
            case 83:
                acrh acrhVar24 = this.a;
                return new znj(acrhVar24.O, acrhVar24.K, (char[]) null, (byte[]) null);
            case 84:
                return false;
            case 85:
                acrh acrhVar25 = this.a;
                return new znj(acrhVar25.R, acrhVar25.f, (byte[]) null, (char[]) null);
            case 86:
                acrh acrhVar26 = this.a;
                return new wpp((armf) acrhVar26.S, (armf) acrhVar26.f, (armf) acrhVar26.K);
            case 87:
                return new acrf(this, 0);
            case 88:
                return new yjv((Context) ((apxx) this.a.a).a);
            case 89:
                anen bB = albo.bB(Executors.newCachedThreadPool());
                bB.getClass();
                return bB;
            case 90:
                return new aiij((Context) ((apxx) this.a.a).a);
            case 91:
                acrh acrhVar27 = this.a;
                return new adep((Context) ((apxx) acrhVar27.a).a, (adnv) acrhVar27.ai.b());
            case 92:
                acrh acrhVar28 = this.a;
                return new adnv(acrhVar28.b, acrhVar28.aa, (vau) acrhVar28.ae.b(), (wwn) this.a.ag.b(), this.a.ah);
            case 93:
                return new adtn(this.a.Z);
            case 94:
                return uvl.j((Context) ((apxx) this.a.a).a);
            case 95:
                acrh acrhVar29 = this.a;
                Object obj4 = ((apxx) acrhVar29.a).a;
                apya apyaVar24 = acrhVar29.ad;
                Context context2 = (Context) obj4;
                if (xyp.j()) {
                    return new var(apyaVar24, new andj());
                }
                return new var(apyaVar24, ((vas) akec.w(context2, vas.class)).hS());
            case 96:
                return Optional.of((aegz) this.a.ac.b());
            case 97:
                acrh acrhVar30 = this.a;
                Object obj5 = ((apxx) acrhVar30.a).a;
                anen anenVar = (anen) acrhVar30.ab.b();
                anen anenVar2 = (anen) this.a.ab.b();
                aehm aehmVar = new aehm((Context) ((apxx) this.a.a).a, acyb.h(), acyb.g());
                acyb.g();
                return new aeha((Context) obj5, anenVar, anenVar2, aehmVar);
            case 98:
                acrh acrhVar31 = this.a;
                return acyb.d((Context) ((apxx) acrhVar31.a).a, (anen) acrhVar31.X.b());
            case 99:
                acrh acrhVar32 = this.a;
                Context context3 = (Context) ((apxx) acrhVar32.a).a;
                if (xyp.j()) {
                    fr = (wwn) acrhVar32.af.b();
                } else {
                    fr = ((wwl) akec.w(context3, wwl.class)).fr();
                }
                fr.getClass();
                return fr;
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        Object acvmVar;
        Object acnuVar;
        Object bB;
        Object aduwVar;
        Object acobVar;
        Object adntVar;
        Object newFixedThreadPool;
        Object acoeVar;
        aneo bC;
        Object newSingleThreadExecutor;
        int i = this.b;
        if (i / 100 != 0) {
            final int i2 = 2;
            final int i3 = 0;
            int i4 = 4;
            final int i5 = 1;
            switch (i) {
                case VCardConstants.DEFAULT_PREF /* 100 */:
                    return new wxe();
                case 101:
                    acvmVar = new acvm(this.a.x);
                    return acvmVar;
                case 102:
                    acnuVar = new acnu((wwn) this.a.ag.b(), (anen) this.a.ak.b(), this.a.al);
                    return acnuVar;
                case 103:
                    Context context = (Context) ((apxx) this.a.a).a;
                    if (adom.e()) {
                        bB = adom.c(context);
                    } else {
                        bB = albo.bB(new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new adnj(0)));
                    }
                    bB.getClass();
                    return bB;
                case 104:
                    return acjh.a((Context) ((apxx) this.a.a).a);
                case 105:
                    acrh acrhVar = this.a;
                    akmm.g();
                    acnuVar = new acpt(acrhVar.ac, acrhVar.av, acrhVar.v());
                    return acnuVar;
                case 106:
                    acrh acrhVar2 = this.a;
                    Object obj = ((apxx) acrhVar2.a).a;
                    adtm adtmVar = (adtm) acrhVar2.au.b();
                    adtg adtgVar = (adtg) this.a.ap.b();
                    adtn adtnVar = (adtn) this.a.aa.b();
                    ahtp.f((Context) obj);
                    aczc.m();
                    acvmVar = new adtl(adtmVar, adtgVar, adtnVar);
                    return acvmVar;
                case 107:
                    acrh acrhVar3 = this.a;
                    afxz afxzVar = new afxz(acrhVar3.ao, acrhVar3.ap, acrhVar3.aa, acrhVar3.aq, acrhVar3.t, acrhVar3.ar, (short[]) null);
                    acrh acrhVar4 = this.a;
                    return afxzVar.d((Context) ((apxx) acrhVar4.a).a, (adts) acrhVar4.as.b(), new acss(this.a.at, i4), (anen) this.a.X.b());
                case 108:
                    acrh acrhVar5 = this.a;
                    aduwVar = new aduw((Context) ((apxx) acrhVar5.a).a, (acob) acrhVar5.an.b());
                    return aduwVar;
                case 109:
                    acrh acrhVar6 = this.a;
                    acobVar = new acob((Context) ((apxx) acrhVar6.a).a, (anen) acrhVar6.X.b(), (adtn) this.a.aa.b(), (acnu) this.a.am.b());
                    return acobVar;
                case 110:
                    return new adtg(null);
                case 111:
                    acrh acrhVar7 = this.a;
                    acnuVar = new acod((Context) ((apxx) acrhVar7.a).a, (adtn) acrhVar7.aa.b(), (acnu) this.a.am.b());
                    return acnuVar;
                case 112:
                    acvmVar = new acva(this.a.x);
                    return acvmVar;
                case 113:
                    acvmVar = new adts((adtj) this.a.aq.b());
                    return acvmVar;
                case 114:
                    acvmVar = new acvs(this.a.x);
                    return acvmVar;
                case 115:
                    acvmVar = new acuz(this.a.x);
                    return acvmVar;
                case 116:
                    acvmVar = new acwd(this.a.x);
                    return acvmVar;
                case 117:
                    return new acuu();
                case 118:
                    acvmVar = new acvt(this.a.x);
                    return acvmVar;
                case 119:
                    acvmVar = new acwg(this.a.x);
                    return acvmVar;
                case 120:
                    acvmVar = new acvy(this.a.x);
                    return acvmVar;
                case 121:
                    acvmVar = new anfi((ansy) this.a.x.b());
                    return acvmVar;
                case 122:
                    acvmVar = new adaw((aduw) this.a.ao.b());
                    return acvmVar;
                case 123:
                    acrh acrhVar8 = this.a;
                    Object obj2 = ((apxx) acrhVar8.a).a;
                    atsg atsgVar = (atsg) acrhVar8.aG.b();
                    acoe acoeVar2 = (acoe) this.a.aI.b();
                    acrh acrhVar9 = this.a;
                    adntVar = new adnt((Context) obj2, atsgVar, acoeVar2, acrhVar9.az, acrhVar9.v(), acrhVar9.ax, acrhVar9.aK, acrhVar9.am);
                    return adntVar;
                case 124:
                    return ahkm.p((Executor) this.a.aD.b(), (agcp) this.a.aE.b(), new altx((aiwv) this.a.aF.b()));
                case 125:
                    Context context2 = (Context) ((apxx) this.a.a).a;
                    if (adom.e()) {
                        newFixedThreadPool = adom.c(context2);
                    } else {
                        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
                        arbjVar.j("ProtoDataStore-%d");
                        newFixedThreadPool = Executors.newFixedThreadPool(4, arbj.t(arbjVar));
                    }
                    newFixedThreadPool.getClass();
                    return newFixedThreadPool;
                case 126:
                    acvmVar = new agcp(Collections.singletonList(new aiuy(new aohs((Context) ((apxx) this.a.a).a, (byte[]) null))));
                    return acvmVar;
                case 127:
                    return aiwr.a;
                case 128:
                    adeo adeoVar = (adeo) this.a.aj.b();
                    adtn adtnVar2 = (adtn) this.a.aa.b();
                    amnn amnnVar = (amnn) this.a.aH.b();
                    acrh acrhVar10 = this.a;
                    acoeVar = new acoe(adeoVar, adtnVar2, amnnVar, acrhVar10.v(), (acnu) acrhVar10.am.b());
                    return acoeVar;
                case 129:
                    amnn amnnVar2 = amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS;
                    amnnVar2.getClass();
                    return amnnVar2;
                case 130:
                    acrh acrhVar11 = this.a;
                    aduwVar = new aday((Context) ((apxx) acrhVar11.a).a, (aonx) acrhVar11.aJ.b(), (byte[]) null);
                    return aduwVar;
                case 131:
                    return xrh.e(altg.a);
                case 132:
                    acrh acrhVar12 = this.a;
                    Context context3 = (Context) ((apxx) acrhVar12.a).a;
                    aduw aduwVar2 = (aduw) acrhVar12.ao.b();
                    adtn adtnVar3 = (adtn) this.a.aa.b();
                    acrh acrhVar13 = this.a;
                    apya apyaVar = acrhVar13.aM;
                    anen v = acrhVar13.v();
                    acoe acoeVar3 = (acoe) apyaVar.b();
                    vau vauVar = (vau) this.a.ae.b();
                    acrh acrhVar14 = this.a;
                    adntVar = new adnk(context3, aduwVar2, adtnVar3, v, acoeVar3, vauVar, acrhVar14.ax, acrhVar14.aK);
                    return adntVar;
                case 133:
                    adeo adeoVar2 = (adeo) this.a.aj.b();
                    adtn adtnVar4 = (adtn) this.a.aa.b();
                    amnn amnnVar3 = (amnn) this.a.aH.b();
                    acrh acrhVar15 = this.a;
                    acoeVar = new acoe(adeoVar2, adtnVar4, amnnVar3, acrhVar15.v(), (acnu) acrhVar15.am.b());
                    return acoeVar;
                case 134:
                    acrh acrhVar16 = this.a;
                    Object obj3 = ((apxx) acrhVar16.a).a;
                    adtn adtnVar5 = (adtn) acrhVar16.aa.b();
                    acob acobVar2 = (acob) this.a.aO.b();
                    adnt adntVar2 = (adnt) this.a.aL.b();
                    acrh acrhVar17 = this.a;
                    return new adny((Context) obj3, adtnVar5, acobVar2, adntVar2, acrhVar17.ax, acrhVar17.aK, acrhVar17.aP);
                case 135:
                    acrh acrhVar18 = this.a;
                    return new acob((Context) ((apxx) acrhVar18.a).a, (adeo) acrhVar18.aj.b(), (adtn) this.a.aa.b(), (anen) this.a.X.b(), (acnu) this.a.am.b());
                case 136:
                    return new aday();
                case 137:
                    adeo adeoVar3 = (adeo) this.a.aj.b();
                    adtn adtnVar6 = (adtn) this.a.aa.b();
                    amnn amnnVar4 = (amnn) this.a.aH.b();
                    acrh acrhVar19 = this.a;
                    acoeVar = new acnz(adeoVar3, adtnVar6, amnnVar4, acrhVar19.v(), (acnu) acrhVar19.am.b());
                    return acoeVar;
                case 138:
                    acrh acrhVar20 = this.a;
                    return new acnx((Context) ((apxx) acrhVar20.a).a, (adeo) acrhVar20.aj.b(), (adtn) this.a.aa.b(), (amnn) this.a.aH.b(), (anen) this.a.X.b(), (acnu) this.a.am.b());
                case 139:
                    adeo adeoVar4 = (adeo) this.a.aj.b();
                    adtn adtnVar7 = (adtn) this.a.aa.b();
                    amnn amnnVar5 = (amnn) this.a.aH.b();
                    acrh acrhVar21 = this.a;
                    acoeVar = new acoe(adeoVar4, adtnVar7, amnnVar5, acrhVar21.v(), (acnu) acrhVar21.am.b());
                    return acoeVar;
                case 140:
                    acoeVar = new acoe((adeo) this.a.aj.b(), (adtn) this.a.aa.b(), (amnn) this.a.aH.b(), (anen) this.a.X.b(), (acnu) this.a.am.b());
                    return acoeVar;
                case 141:
                    acrh acrhVar22 = this.a;
                    aduwVar = new aday((Context) ((apxx) acrhVar22.a).a, acrhVar22.aA, (byte[]) null);
                    return aduwVar;
                case 142:
                    abqa abqaVar = abqa.a;
                    abqaVar.getClass();
                    return abqaVar;
                case 143:
                    acrh acrhVar23 = this.a;
                    Object obj4 = ((apxx) acrhVar23.a).a;
                    acoe acoeVar4 = (acoe) acrhVar23.aS.b();
                    aduu aduuVar = (aduu) this.a.b.b();
                    adnt adntVar3 = (adnt) this.a.aL.b();
                    yjr yjrVar = (yjr) this.a.g.b();
                    adnk adnkVar = (adnk) this.a.aN.b();
                    adtn adtnVar8 = (adtn) this.a.aa.b();
                    adaw adawVar = (adaw) this.a.aC.b();
                    adtl adtlVar = (adtl) this.a.av.b();
                    acrh acrhVar24 = this.a;
                    return new adko((Context) obj4, acoeVar4, aduuVar, adntVar3, yjrVar, adnkVar, adtnVar8, adawVar, adtlVar, acrhVar24.ax, acrhVar24.aK, acrhVar24.ag, acrhVar24.aU, acrhVar24.aw, acrhVar24.ay);
                case 144:
                    return Boolean.valueOf(((acxq) this.a.aB.b()).a());
                case 145:
                    acrh acrhVar25 = this.a;
                    aduwVar = new adtl((Context) ((apxx) acrhVar25.a).a, acrhVar25.o(), (yjy) acrhVar25.f.b());
                    return aduwVar;
                case 146:
                    acrh acrhVar26 = this.a;
                    acnuVar = new acrm((Context) ((apxx) acrhVar26.a).a, acrhVar26.k(), albo.bB(Executors.newSingleThreadExecutor()));
                    return acnuVar;
                case 147:
                    Context context4 = (Context) ((apxx) this.a.a).a;
                    if (adom.e()) {
                        bC = adom.d(context4);
                    } else {
                        arbj arbjVar2 = new arbj((char[]) null, (byte[]) null);
                        arbjVar2.i();
                        arbjVar2.j("BlockingListeningScheduledExecutorService-%d");
                        arbjVar2.b = new acra(2);
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, arbj.t(arbjVar2));
                        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                        bC = albo.bC(scheduledThreadPoolExecutor);
                    }
                    bC.getClass();
                    return bC;
                case 148:
                    acrh acrhVar27 = this.a;
                    aduwVar = new acyt((Context) ((apxx) acrhVar27.a).a, (acoe) acrhVar27.aT.b());
                    return aduwVar;
                case 149:
                    Context context5 = (Context) ((apxx) this.a.a).a;
                    if (adom.e()) {
                        newSingleThreadExecutor = adom.d(context5);
                    } else {
                        newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    }
                    newSingleThreadExecutor.getClass();
                    return newSingleThreadExecutor;
                case 150:
                    acrh acrhVar28 = this.a;
                    aduwVar = new acqy((Context) ((apxx) acrhVar28.a).a, (aegu) acrhVar28.ba.b());
                    return aduwVar;
                case 151:
                    return new aegx();
                case 152:
                    acvmVar = new acre((Context) ((apxx) this.a.a).a);
                    return acvmVar;
                case 153:
                    BusinessInfoDatabase businessInfoDatabase = BusinessInfoDatabase.getInstance((Context) ((apxx) this.a.a).a);
                    businessInfoDatabase.getClass();
                    return businessInfoDatabase;
                case 154:
                    acvmVar = new adpu((acqy) this.a.bb.b());
                    return acvmVar;
                case 155:
                    acrh acrhVar29 = this.a;
                    acobVar = new acnb((Context) ((apxx) acrhVar29.a).a, (BusinessInfoDatabase) acrhVar29.bd.b(), (yjr) this.a.g.b(), (adih) this.a.bf.b());
                    return acobVar;
                case 156:
                    aduwVar = new adih((Context) ((apxx) this.a.a).a, r1.e.b());
                    return aduwVar;
                case 157:
                    acrh acrhVar30 = this.a;
                    acvmVar = new agxw(alor.o(aigz.SIP, acrhVar30.bh, aigz.MSRP_SERVER, acrhVar30.bi, aigz.MSRP_CLIENT, acrhVar30.bj, aigz.HTTP, acrhVar30.bk), null);
                    return acvmVar;
                case 158:
                    acrh acrhVar31 = this.a;
                    acnx acnxVar = (acnx) acrhVar31.aR.b();
                    int[] iArr = adfm.a;
                    aihm aihmVar = new aihm() { // from class: aihk
                        @Override // defpackage.aihm
                        public final SSLContext a() {
                            int i6 = i5;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, null, null);
                                    return sSLContext;
                                }
                                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                                sSLContext2.init(null, null, null);
                                return sSLContext2;
                            }
                            return SSLContext.getDefault();
                        }
                    };
                    acnxVar.getClass();
                    acvmVar = new aigy(aihmVar, new aihg(Optional.of(new aihi(Optional.of(new aifk(new aifx(4, new ahjj(acnxVar)))))), acnxVar));
                    return acvmVar;
                case 159:
                    acrh acrhVar32 = this.a;
                    acnx acnxVar2 = (acnx) acrhVar32.aR.b();
                    int[] iArr2 = adfm.a;
                    aihm aihmVar2 = new aihm() { // from class: aihk
                        @Override // defpackage.aihm
                        public final SSLContext a() {
                            int i6 = i3;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, null, null);
                                    return sSLContext;
                                }
                                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                                sSLContext2.init(null, null, null);
                                return sSLContext2;
                            }
                            return SSLContext.getDefault();
                        }
                    };
                    acnxVar2.getClass();
                    aduwVar = new aigy(aihmVar2, new aihg(Optional.of(new aihi(Optional.of(new aifk(new aifx(3, new ahjj(acnxVar2)))))), acnxVar2));
                    return aduwVar;
                case 160:
                    acrh acrhVar33 = this.a;
                    acnx acnxVar3 = (acnx) acrhVar33.aR.b();
                    aiij aiijVar = (aiij) this.a.Y.b();
                    int[] iArr3 = adfm.a;
                    aihl aihlVar = new aihl(aiijVar.b(), aiijVar.a());
                    acnxVar3.getClass();
                    acnuVar = new aigy(aihlVar, new aihg(Optional.of(new aihi(Optional.of(new aifk(new aifx(3, new ahjj(acnxVar3)))))), acnxVar3));
                    return acnuVar;
                case 161:
                    acrh acrhVar34 = this.a;
                    acnx acnxVar4 = (acnx) acrhVar34.aR.b();
                    int[] iArr4 = adfm.a;
                    aihm aihmVar3 = new aihm() { // from class: aihk
                        @Override // defpackage.aihm
                        public final SSLContext a() {
                            int i6 = i2;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, null, null);
                                    return sSLContext;
                                }
                                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                                sSLContext2.init(null, null, null);
                                return sSLContext2;
                            }
                            return SSLContext.getDefault();
                        }
                    };
                    acnxVar4.getClass();
                    acvmVar = new aigy(aihmVar3, new aihg(Optional.of(new aihi(Optional.of(new aifk(new aifx(2, new ahjj(acnxVar4)))))), acnxVar4));
                    return acvmVar;
                case 162:
                    acrh acrhVar35 = this.a;
                    acobVar = new aiim((Context) ((apxx) acrhVar35.a).a, (aiij) acrhVar35.Y.b(), (agxw) this.a.bl.b(), (aigs) this.a.bm.b());
                    return acobVar;
                case 163:
                    acrh acrhVar36 = this.a;
                    Context context6 = (Context) ((apxx) acrhVar36.a).a;
                    anen anenVar = (anen) acrhVar36.X.b();
                    acrh acrhVar37 = this.a;
                    return new aigs(anenVar, adwp.f(context6), adwt.g(context6), new agrk((Context) ((apxx) acrhVar37.a).a, acrhVar37.k()), (adeo) this.a.aj.b());
                case 164:
                    armf armfVar = (armf) ((alor) ((agxw) this.a.bl.b()).b).get(aigz.HTTP);
                    armfVar.getClass();
                    acvmVar = new ahlp((aigy) armfVar.b());
                    return acvmVar;
                case 165:
                    return new aiii();
                case 166:
                    acvmVar = new adsj((aduu) this.a.b.b());
                    return acvmVar;
                case 167:
                    acvmVar = new aduo((adsj) this.a.bq.b(), (yjr) this.a.g.b(), (adih) this.a.bf.b());
                    return acvmVar;
                case 168:
                    return new adaw();
                case 169:
                    acrh acrhVar38 = this.a;
                    acobVar = new acmt((Context) ((apxx) acrhVar38.a).a, (aneo) acrhVar38.aX.b(), (aegu) this.a.ba.b(), (acnz) this.a.aQ.b());
                    return acobVar;
                case 170:
                    acrh acrhVar39 = this.a;
                    acvmVar = new aday(alpt.v(new adxd(), new adxj(), new adxg(), new adxl(acrhVar39.bt), new adyf(acrhVar39.bw), new adyr(acrhVar39.bx), new adwz[0]));
                    return acvmVar;
                case 171:
                    acvmVar = new adxm(this.a.bs);
                    return acvmVar;
                case 172:
                    acrh acrhVar40 = this.a;
                    acvmVar = new adyb(acrhVar40.bu, acrhVar40.bv);
                    return acvmVar;
                case 173:
                    acvmVar = new adyd(this.a.bs);
                    return acvmVar;
                case 174:
                    acvmVar = new adyh(this.a.bs);
                    return acvmVar;
                case 175:
                    acvmVar = new adyq(this.a.bs);
                    return acvmVar;
                case 176:
                    acvmVar = new xyu(new adfh(), 1);
                    return acvmVar;
                case 177:
                    aduwVar = new adki((adnk) this.a.aN.b(), (vau) this.a.ae.b());
                    return aduwVar;
                case 178:
                    aduwVar = new adkn((adnk) this.a.aN.b(), (aegu) this.a.ba.b());
                    return aduwVar;
                case 179:
                    acrh acrhVar41 = this.a;
                    Context context7 = (Context) ((apxx) acrhVar41.a).a;
                    adtg adtgVar2 = (adtg) acrhVar41.ap.b();
                    adtn adtnVar9 = (adtn) this.a.aa.b();
                    acrh acrhVar42 = this.a;
                    return new adeq(context7, adtgVar2, adtnVar9, acrhVar42.k(), (adnk) acrhVar42.aN.b());
                case 180:
                    return (wcf) wcf.g(new wci(1), (aqrs) this.a.by.b());
                case 181:
                    acrh acrhVar43 = this.a;
                    Context context8 = (Context) ((apxx) acrhVar43.a).a;
                    aneo aneoVar = (aneo) acrhVar43.aX.b();
                    aqwq q = aqwq.q(aqwn.c("com.google.android.apps.messaging", "com.google.android.apps.messaging.shared.rcs.messaging.MessagingEngineNotificationServer"), context8);
                    q.s(aneoVar);
                    q.e(aneoVar);
                    q.h(aneoVar);
                    q.t(new aokm(abqq.c(context8)));
                    q.f(60L, TimeUnit.SECONDS);
                    return q.a();
                case 182:
                    acvmVar = new zfm((Context) ((apxx) this.a.a).a, (byte[]) null);
                    return acvmVar;
                case 183:
                    acrh acrhVar44 = this.a;
                    Context context9 = (Context) ((apxx) acrhVar44.a).a;
                    adeo adeoVar5 = (adeo) acrhVar44.aj.b();
                    adtn adtnVar10 = (adtn) this.a.aa.b();
                    acrh acrhVar45 = this.a;
                    return new adke(context9, adeoVar5, adtnVar10, acrhVar45.v(), (acnu) acrhVar45.am.b());
                case 184:
                    acvmVar = new wjg();
                    return acvmVar;
                case 185:
                    return new vrv();
                default:
                    throw new AssertionError(i);
            }
        }
        return a();
    }
}
