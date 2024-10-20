package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.UpdateMessageVerificationStatusWork;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.akto;
import defpackage.anen;
import defpackage.gsx;
import defpackage.ukg;
import defpackage.xyo;
import defpackage.xze;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateMessageVerificationStatusWork extends gsx {
    private static final xze f = xze.g("Bugle", "UpdateMessageVerificationStatusWork");
    public final ukg e;
    private final anen g;
    private final aksr h;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        aksr a();

        ukg dP();

        anen k();
    }

    public UpdateMessageVerificationStatusWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.e = aVar.dP();
        this.g = aVar.k();
        this.h = aVar.a();
        xyo a2 = f.a();
        a2.H("UpdateMessageVerificationStatusWork created.");
        a2.q();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        akrc b = this.h.b("UpdateMessageVerificationStatusWork");
        try {
            ListenableFuture submit = this.g.submit(akto.k(new Callable() { // from class: uke
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    tqr tqrVar;
                    ukf g;
                    ukf ukfVar;
                    long j;
                    tqr tqrVar2;
                    tqr tqrVar3;
                    UpdateMessageVerificationStatusWork updateMessageVerificationStatusWork = UpdateMessageVerificationStatusWork.this;
                    gsi f2 = updateMessageVerificationStatusWork.f();
                    xyo a2 = ukg.a.a();
                    a2.H("Beginning UpdateMessageVerificationStatusWork work.");
                    a2.q();
                    ukg ukgVar = updateMessageVerificationStatusWork.e;
                    long epochMilli = ukgVar.g.f().toEpochMilli();
                    long b2 = f2.b("vsms_verification_chain_start_time_key", -1L);
                    String ag = albo.ag(f2.d("sms_verification_result_key"));
                    tqr tqrVar4 = tqr.VERIFICATION_NA;
                    try {
                        tqrVar = (tqr) Enum.valueOf(tqr.class, ag);
                    } catch (Exception unused) {
                        xyl.c("No verification status found for string value: ".concat(String.valueOf(yyb.bh(ag))));
                        tqrVar = tqr.VERIFICATION_NA;
                    }
                    int a3 = f2.a("vsms_sub_id", -1);
                    MessageIdType b3 = rvc.b(f2.d("vsms_message_id"));
                    ConversationIdType b4 = ruy.b(f2.d("vsms_conversation_id"));
                    String d = f2.d("vsms_participant_id");
                    if (b3.b()) {
                        ukgVar.b(false, epochMilli);
                        ukgVar.a(b2, false);
                        ukg.a.m("Empty message id was given to UpdateMessageVerificationStatusWork");
                    } else if (b4.b()) {
                        ukgVar.b(false, epochMilli);
                        ukgVar.a(b2, false);
                        ukg.a.m("Empty conversation id was given to UpdateMessageVerificationStatusWork");
                    } else if (TextUtils.isEmpty(d)) {
                        ukgVar.b(false, epochMilli);
                        ukgVar.a(b2, false);
                        ukg.a.m("Empty participant id was given to UpdateMessageVerificationStatusWork");
                    } else {
                        ukf g2 = ukf.a(tqrVar).g();
                        msh t = ((msk) ukgVar.l.b()).t(albo.ag(f2.d("vsms_sender_id")), a3);
                        xyo c = ukg.a.c();
                        c.H("SMS from");
                        c.M("senderIdentity", t);
                        c.c(b3);
                        c.z("verificationStatus", tqrVar.name());
                        c.q();
                        if (tqrVar == tqr.VERIFICATION_VERIFIED) {
                            try {
                                if (TextUtils.isEmpty(f2.d("sms_verification_brand_id_key"))) {
                                    msh t2 = ((msk) ukgVar.l.b()).t(albo.ag(f2.d("vsms_sender_id")), f2.a("vsms_sub_id", -1));
                                    xyo a4 = ukg.a.a();
                                    a4.H("Fetching existing brand for sender");
                                    a4.M("senderIdentity", t2);
                                    a4.q();
                                    pa a5 = ukf.a(tqr.VERIFICATION_VERIFIED);
                                    sep a6 = ukgVar.c.a(albo.ag(t2.o(((Boolean) new mst(6).get()).booleanValue())));
                                    if (a6 == null) {
                                        xyo e = ukg.a.e();
                                        e.H("Couldn't find verified sender: status has been updated to NA");
                                        e.M("senderIdentity", t2);
                                        e.q();
                                        a5.i(tqr.VERIFICATION_NA);
                                        g = a5.g();
                                    } else {
                                        String k = a6.a.k();
                                        if (TextUtils.isEmpty(k)) {
                                            xyo e2 = ukg.a.e();
                                            e2.H("Couldn't find associated brand for verified sender: status has been updated to NA");
                                            e2.M("senderIdentity", t2);
                                            e2.z("existingBrandId", k);
                                            e2.q();
                                            a5.i(tqr.VERIFICATION_NA);
                                            g = a5.g();
                                        } else {
                                            tox toxVar = a6.a;
                                            aozy createBuilder = anlw.a.createBuilder();
                                            String k2 = toxVar.k();
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            anlw anlwVar = (anlw) createBuilder.b;
                                            k2.getClass();
                                            anlwVar.b = k2;
                                            String m = toxVar.m();
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            anlw anlwVar2 = (anlw) createBuilder.b;
                                            m.getClass();
                                            anlwVar2.c = m;
                                            String l = toxVar.l();
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            anlw anlwVar3 = (anlw) createBuilder.b;
                                            l.getClass();
                                            anlwVar3.d = l;
                                            String n = toxVar.n();
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            anlw anlwVar4 = (anlw) createBuilder.b;
                                            n.getClass();
                                            anlwVar4.f = n;
                                            toxVar.ao(4, "logo_url");
                                            String str = toxVar.e;
                                            if (!createBuilder.b.isMutable()) {
                                                createBuilder.u();
                                            }
                                            anlw anlwVar5 = (anlw) createBuilder.b;
                                            str.getClass();
                                            anlwVar5.e = str;
                                            a5.h((anlw) createBuilder.s());
                                            Uri h = a6.a.h();
                                            if (h != null && h.toString().isEmpty()) {
                                                h = null;
                                            }
                                            a5.b = h;
                                            g = a5.g();
                                        }
                                    }
                                } else {
                                    msh t3 = ((msk) ukgVar.l.b()).t(albo.ag(f2.d("vsms_sender_id")), f2.a("vsms_sub_id", -1));
                                    String d2 = f2.d("sms_verification_brand_id_key");
                                    xyo a7 = ukg.a.a();
                                    a7.H("Associating new brand");
                                    a7.M("senderIdentity", t3);
                                    a7.z("brandId", d2);
                                    a7.q();
                                    pa a8 = ukf.a(tqr.VERIFICATION_VERIFIED);
                                    String ag2 = albo.ag(f2.d("sms_verification_brand_logo_key"));
                                    aozy createBuilder2 = anlw.a.createBuilder();
                                    String ag3 = albo.ag(f2.d("sms_verification_brand_id_key"));
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ((anlw) createBuilder2.b).b = ag3;
                                    String ag4 = albo.ag(f2.d("sms_verification_brand_name_key"));
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ((anlw) createBuilder2.b).c = ag4;
                                    String ag5 = albo.ag(f2.d("sms_verification_brand_description_key"));
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ((anlw) createBuilder2.b).d = ag5;
                                    String ag6 = albo.ag(f2.d("sms_verification_brand_version_key"));
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ((anlw) createBuilder2.b).f = ag6;
                                    String ag7 = albo.ag(f2.d("sms_verification_brand_logo_url_key"));
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    ((anlw) createBuilder2.b).e = ag7;
                                    final anlw anlwVar6 = (anlw) createBuilder2.s();
                                    final String ag8 = albo.ag(t3.o(((Boolean) new mst(6).get()).booleanValue()));
                                    final qyn qynVar = ukgVar.c;
                                    final Uri parse = Uri.parse(ag2);
                                    Optional optional = (Optional) qynVar.b.c("VerifiedSmsEntityManager#associateSenderWithBrand", new alhr() { // from class: qyl
                                        @Override // defpackage.alhr
                                        public final Object get() {
                                            String k3;
                                            agnw d3;
                                            agnw d4;
                                            agnw d5;
                                            Object apply;
                                            qyn qynVar2 = qyn.this;
                                            String str2 = ag8;
                                            sep a9 = qynVar2.a(str2);
                                            if (a9 == null) {
                                                k3 = "";
                                            } else {
                                                k3 = a9.a.k();
                                            }
                                            Uri uri = parse;
                                            anlw anlwVar7 = anlwVar6;
                                            if (!TextUtils.isEmpty(k3)) {
                                                if (!TextUtils.equals(anlwVar7.b, k3)) {
                                                    xyo e3 = qyn.a.e();
                                                    e3.H("Can't change brand for");
                                                    e3.L("senderId", str2);
                                                    e3.z("old brand", k3);
                                                    e3.z("new brand", anlwVar7.b);
                                                    e3.q();
                                                    return Optional.of(new qym(String.format(Locale.US, "vSms: brand %s has been unexpectedly replaced with brand %s for sender %s.", k3, anlwVar7.b, yyb.bh(str2))));
                                                }
                                                xyo a10 = qyn.a.a();
                                                a10.H("Updating brand");
                                                a10.z("brandId", anlwVar7.b);
                                                a10.q();
                                                xyo a11 = qyn.a.a();
                                                a11.H("creating brand update builder");
                                                a11.z("brand id", anlwVar7.b);
                                                a11.q();
                                                tpg tpgVar = new tpg();
                                                tpgVar.aj("createBrandUpdateQuery");
                                                xyo a12 = qyn.a.a();
                                                a12.z("brand name", anlwVar7.c);
                                                a12.q();
                                                agnc.r(tpgVar.a, "name", anlwVar7.c);
                                                xyo a13 = qyn.a.a();
                                                a13.z("brand description", anlwVar7.d);
                                                a13.q();
                                                agnc.r(tpgVar.a, "description", anlwVar7.d);
                                                xyo a14 = qyn.a.a();
                                                a14.z("brand logo", anlwVar7.g);
                                                a14.q();
                                                if (uri == null) {
                                                    tpgVar.a.putNull("logo_uri");
                                                } else {
                                                    tpgVar.a.put("logo_uri", uri.toString());
                                                }
                                                xyo a15 = qyn.a.a();
                                                a15.z("brand logo url", anlwVar7.e);
                                                a15.q();
                                                agnc.r(tpgVar.a, "logo_url", anlwVar7.e);
                                                xyo a16 = qyn.a.a();
                                                a16.z("brand version token", anlwVar7.f);
                                                a16.q();
                                                agnc.r(tpgVar.a, "version_token", anlwVar7.f);
                                                apply = new qwz(anlwVar7, 5).apply(new tph());
                                                tpgVar.Z(new agpw((tph) apply));
                                                if (tpgVar.a().e() != 1) {
                                                    xyo e4 = qyn.a.e();
                                                    e4.H("Didn't update brand (no row, or row unchanged)");
                                                    e4.z("brandId", anlwVar7.b);
                                                    e4.q();
                                                }
                                            } else {
                                                String str3 = anlwVar7.b;
                                                xyo a17 = qyn.a.a();
                                                a17.H("Associating sender");
                                                a17.L("senderId", str2);
                                                a17.H("with brand");
                                                a17.z("brandId", str3);
                                                a17.q();
                                                String[] strArr = tps.a;
                                                int i = toe.a;
                                                tpk tpkVar = new tpk();
                                                tpkVar.c(str2);
                                                tpkVar.b(str3);
                                                tpj a18 = tpkVar.a();
                                                tpr tprVar = new tpr();
                                                tprVar.b(str2);
                                                agpw agpwVar = new agpw(tprVar);
                                                d3 = agnc.d("$primary");
                                                if (!((Boolean) d3.r(new tdw((aglz) a18, agpwVar, d3, 4))).booleanValue()) {
                                                    xyo b5 = qyn.a.b();
                                                    b5.H("Can't update sender's row (missing or unchanged)");
                                                    b5.z("brandId", str3);
                                                    b5.H("with brand");
                                                    b5.L("senderId", str2);
                                                    b5.q();
                                                }
                                                xyo e5 = qyn.a.e();
                                                e5.H("Inserting new brand");
                                                e5.z("brandId", anlwVar7.b);
                                                e5.q();
                                                qyn.a.l("creating brand insert builder");
                                                toy toyVar = new toy();
                                                toyVar.b(anlwVar7.b);
                                                xyo a19 = qyn.a.a();
                                                a19.z("brand name", anlwVar7.c);
                                                a19.q();
                                                toyVar.g(anlwVar7.c);
                                                xyo a20 = qyn.a.a();
                                                a20.z("brand description", anlwVar7.d);
                                                a20.q();
                                                toyVar.c(anlwVar7.d);
                                                xyo a21 = qyn.a.a();
                                                a21.z("brand logo", anlwVar7.g);
                                                a21.q();
                                                toyVar.e(uri);
                                                xyo a22 = qyn.a.a();
                                                a22.z("brand logo url", anlwVar7.e);
                                                a22.q();
                                                toyVar.f(anlwVar7.e);
                                                xyo a23 = qyn.a.a();
                                                a23.z("brand version token", anlwVar7.f);
                                                a23.q();
                                                toyVar.h(anlwVar7.f);
                                                tox a24 = toyVar.a();
                                                d4 = agnc.d("$primary");
                                                d5 = agnc.d("$primary");
                                                agnc.a(d5, "verified_sms_brands", a24, new tkg(d4, 7), new ter(a24, 10));
                                            }
                                            return Optional.empty();
                                        }
                                    });
                                    if (optional.isPresent()) {
                                        Exception exc = (Exception) optional.get();
                                        if (exc instanceof qym) {
                                            qyn.a.m("Brand exception occurrred. ".concat(String.valueOf(exc.getMessage())));
                                            throw ((qym) exc);
                                        }
                                    }
                                    a8.h(anlwVar6);
                                    a8.b = ydk.j(ag2);
                                    g = a8.g();
                                }
                                ukfVar = g;
                                j = b2;
                            } catch (qym unused2) {
                                ukgVar.i.d(new uju(ukgVar, d, b4, albo.ag(t.o(((Boolean) new mst(6).get()).booleanValue())), 3));
                                ukgVar.b(false, epochMilli);
                                ukgVar.a(b2, false);
                                return new gsu();
                            }
                        } else {
                            j = b2;
                            ukfVar = g2;
                        }
                        tqr tqrVar5 = tqr.VERIFICATION_NA;
                        ParticipantsTable.BindData a9 = ParticipantsTable.a(d);
                        if (a9 != null) {
                            tqrVar5 = a9.A();
                            xyo c2 = ukg.a.c();
                            c2.z("latest participant status", tqrVar5);
                            c2.q();
                        }
                        tqr tqrVar6 = ukfVar.b;
                        if (tqrVar5.a()) {
                            if (tqrVar6 == tqr.VERIFICATION_NA) {
                                tqrVar2 = tqr.VERIFICATION_UNVERIFIED;
                                xyo c3 = ukg.a.c();
                                c3.H("Participant is applicable, but verification status was NA. Converting to unverified.");
                                c3.q();
                                tqrVar3 = tqrVar2;
                            }
                            tqrVar3 = tqrVar6;
                        } else {
                            if (tqrVar6 == tqr.VERIFICATION_UNVERIFIED) {
                                tqrVar2 = tqr.VERIFICATION_NA;
                                xyo c4 = ukg.a.c();
                                c4.H("Participant is not applicable, converting unverified status to NA");
                                c4.q();
                                tqrVar3 = tqrVar2;
                            }
                            tqrVar3 = tqrVar6;
                        }
                        ukgVar.d.e("Bugle.VerifiedSms.Verification.FinalAdjustedVerificationStatus", tqrVar3.ordinal());
                        long j2 = j;
                        if (((Boolean) ukgVar.i.c("UpdateMessageVerificationStatusWorkHelper#updateMessageVerificationStatus", new ubi(ukgVar, tqrVar3, b3, d, b4, ukfVar, 3))).booleanValue()) {
                            xyo a10 = ukg.a.a();
                            a10.H("notifying participant about message change");
                            a10.e(d);
                            a10.c(b3);
                            a10.b(b4);
                            a10.q();
                            ((rtz) ukgVar.e.b()).P(d);
                            alvw g3 = ukg.b.g();
                            g3.X(alwp.a, "BugleNotifications");
                            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper", "updateMessageVerificationStatus", 278, "UpdateMessageVerificationStatusWorkHelper.java")).q("Creating notification from UpdateMessageVerificationStatusWorkHelper#updateMessageVerificationStatus");
                            ((wpp) ukgVar.k.b()).J();
                        }
                        ukgVar.j.ab(albo.ag(t.o(((Boolean) new mst(6).get()).booleanValue())), a3, b3.a(), albo.ag(f2.d("vsms_message_body")), tqrVar3);
                        ukgVar.b(true, epochMilli);
                        ukgVar.a(j2, true);
                        return new gsw();
                    }
                    return new gsu();
                }
            }));
            b.close();
            return submit;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
