package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.adji;
import defpackage.agnq;
import defpackage.ahqr;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.apxx;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arpi;
import defpackage.arwe;
import defpackage.hgj;
import defpackage.lzz;
import defpackage.mce;
import defpackage.mfc;
import defpackage.mho;
import defpackage.odn;
import defpackage.oia;
import defpackage.pmz;
import defpackage.qdm;
import defpackage.qjh;
import defpackage.qrr;
import defpackage.qya;
import defpackage.qyn;
import defpackage.qzi;
import defpackage.ray;
import defpackage.rbs;
import defpackage.rbt;
import defpackage.rbv;
import defpackage.rcr;
import defpackage.rcs;
import defpackage.rhl;
import defpackage.rji;
import defpackage.rtb;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.ryg;
import defpackage.rys;
import defpackage.rzc;
import defpackage.tzn;
import defpackage.uhj;
import defpackage.ujv;
import defpackage.wyp;
import defpackage.wyq;
import defpackage.wys;
import defpackage.wzp;
import defpackage.wzs;
import defpackage.xca;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.yck;
import defpackage.ydl;
import defpackage.zai;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessDownloadedMmsAction extends Action<MessageCoreData> {
    private final armf b;
    private final oia c;
    private final armf d;
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new ray(9);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbv Nx();
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, int i, Bundle bundle) {
        super(amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = armfVar;
        this.c = oiaVar;
        this.d = armfVar2;
        MessageIdType b = rvc.b(bundle.getString("message_id"));
        Uri uri = (Uri) bundle.getParcelable("content_uri");
        Uri uri2 = (Uri) bundle.getParcelable("notification_uri");
        ConversationIdType b2 = ruy.b(bundle.getString("conversation_id"));
        String string = bundle.getString("participant_id");
        xyl.l(b);
        xyl.l(uri);
        xyl.l(uri2);
        xyl.l(b2);
        xyl.l(string);
        this.u.p("downloaded_by_mms_api_or_lib", true);
        this.u.v("message_id", b.a());
        this.u.r("result_code", i);
        this.u.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        this.u.t("content_uri", uri);
        this.u.t("notification_uri", uri2);
        this.u.r("sub_id", bundle.getInt("sub_id", -1));
        this.u.v("sub_phone_number", bundle.getString("sub_phone_number"));
        this.u.v("transaction_id", bundle.getString("transaction_id"));
        this.u.v("content_location", bundle.getString("content_location"));
        this.u.p("auto_download", bundle.getBoolean("auto_download"));
        this.u.s("received_timestamp", bundle.getLong("received_timestamp"));
        this.u.v("conversation_id", b2.a());
        this.u.v("participant_id", string);
        this.u.r("status_if_failed", bundle.getInt("status_if_failed"));
        this.u.s("message_logging_id", bundle.getLong("message_logging_id"));
        this.u.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.EXTRA_HANDLED_BY_CARRIER_APP")) {
            this.u.r("mms_api", 3);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessDownloadedMmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDownloadedMms.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        rhl rhlVar = this.u;
        rbt h = h();
        rhlVar.getClass();
        Object e = rcr.b().e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            rcr rcrVar = (rcr) h;
            return qjh.i(rcrVar.k, new qrr(rcrVar, (arpe) null, 11));
        }
        rcr rcrVar2 = (rcr) h;
        return qjh.i(rcrVar2.l, new qrr(rcrVar2, (arpe) null, 12, (byte[]) null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fy() {
        rbt h = h();
        Object e = rcr.b().e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            rcr rcrVar = (rcr) h;
            return qjh.i(rcrVar.k, new qrr(rcrVar, (arpe) null, 13, (char[]) null));
        }
        rcr rcrVar2 = (rcr) h;
        return qjh.i(rcrVar2.l, new qrr(rcrVar2, (arpe) null, 14, (short[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v85, types: [apwt, java.lang.Object] */
    final rbt h() {
        if (this.c.a() && TextUtils.isEmpty(this.u.l("sub_phone_number"))) {
            int b = this.u.b("sub_id", -1);
            if (b == -1) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 381, "ProcessDownloadedMmsAction.java")).q("Missing subId when downloading MMS");
            } else {
                Optional map = ((adji) this.d.b()).e(b).map(new rbs(0));
                alvw i2 = a.i();
                i2.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) i2;
                alvgVar.X(ydl.t, Integer.valueOf(b));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 393, "ProcessDownloadedMmsAction.java")).t("Missing self number when downloading MMS, fallback to RCS number on the sub: %s", Boolean.valueOf(map.isPresent()));
                map.ifPresent(new qdm(this, 15));
            }
        }
        rcs rcsVar = (rcs) this.b.b();
        Context context = (Context) rcsVar.a.b();
        context.getClass();
        xnv xnvVar = (xnv) rcsVar.b.b();
        xnvVar.getClass();
        wys wysVar = (wys) rcsVar.c.b();
        wysVar.getClass();
        xca xcaVar = (xca) rcsVar.d.b();
        xcaVar.getClass();
        armf armfVar = rcsVar.e;
        rzc rzcVar = (rzc) rcsVar.f.b();
        rzcVar.getClass();
        Optional optional = (Optional) rcsVar.g.b();
        optional.getClass();
        ujv ujvVar = (ujv) rcsVar.h.b();
        ujvVar.getClass();
        mho mhoVar = (mho) rcsVar.i.b();
        mhoVar.getClass();
        ((lzz) rcsVar.j.b()).getClass();
        armf armfVar2 = rcsVar.k;
        armf armfVar3 = rcsVar.l;
        armf armfVar4 = rcsVar.m;
        armf armfVar5 = rcsVar.n;
        armf armfVar6 = rcsVar.o;
        armf armfVar7 = rcsVar.p;
        mce mceVar = (mce) rcsVar.q.b();
        mceVar.getClass();
        zai zaiVar = (zai) rcsVar.r.b();
        zaiVar.getClass();
        armf armfVar8 = rcsVar.s;
        wzs wzsVar = (wzs) rcsVar.t.b();
        wzsVar.getClass();
        armf armfVar9 = rcsVar.u;
        ryg rygVar = (ryg) rcsVar.v.b();
        rygVar.getClass();
        wyp wypVar = (wyp) rcsVar.w.b();
        wypVar.getClass();
        qyn qynVar = (qyn) rcsVar.x.b();
        qynVar.getClass();
        wyq wyqVar = (wyq) rcsVar.y.b();
        wyqVar.getClass();
        rji rjiVar = (rji) rcsVar.z.b();
        rjiVar.getClass();
        uhj uhjVar = (uhj) rcsVar.A.b();
        uhjVar.getClass();
        rys rysVar = (rys) rcsVar.B.b();
        rysVar.getClass();
        agnq agnqVar = (agnq) rcsVar.C.b();
        agnqVar.getClass();
        ((qzi) rcsVar.D.b()).getClass();
        qya qyaVar = (qya) rcsVar.E.b();
        qyaVar.getClass();
        rtb rtbVar = (rtb) rcsVar.F.b();
        rtbVar.getClass();
        yck yckVar = (yck) rcsVar.G.b();
        yckVar.getClass();
        wzp wzpVar = (wzp) rcsVar.H.b();
        wzpVar.getClass();
        tzn tznVar = (tzn) rcsVar.I.b();
        tznVar.getClass();
        hgj hgjVar = (hgj) rcsVar.J.b();
        hgjVar.getClass();
        mfc mfcVar = (mfc) rcsVar.K.b();
        mfcVar.getClass();
        armf armfVar10 = rcsVar.L;
        Optional optional2 = (Optional) ((apxx) rcsVar.M).a;
        armf armfVar11 = rcsVar.N;
        armf armfVar12 = rcsVar.O;
        arwe arweVar = (arwe) rcsVar.P.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) rcsVar.Q.b();
        arweVar2.getClass();
        arpi arpiVar = (arpi) rcsVar.R.b();
        arpiVar.getClass();
        arpi arpiVar2 = (arpi) rcsVar.S.b();
        arpiVar2.getClass();
        armf armfVar13 = rcsVar.T;
        armf armfVar14 = rcsVar.U;
        armf armfVar15 = rcsVar.V;
        armf armfVar16 = rcsVar.W;
        ?? b2 = rcsVar.X.b();
        b2.getClass();
        armf armfVar17 = rcsVar.Y;
        ahqr ahqrVar = (ahqr) rcsVar.Z.b();
        ahqrVar.getClass();
        armf armfVar18 = rcsVar.aa;
        armf armfVar19 = rcsVar.ab;
        armf armfVar20 = rcsVar.ac;
        armf armfVar21 = rcsVar.ad;
        armf armfVar22 = rcsVar.ae;
        armf armfVar23 = rcsVar.af;
        armf armfVar24 = rcsVar.ag;
        armf armfVar25 = rcsVar.ah;
        armf armfVar26 = rcsVar.ai;
        odn odnVar = (odn) rcsVar.aj.b();
        odnVar.getClass();
        armf armfVar27 = rcsVar.ak;
        armf armfVar28 = rcsVar.al;
        armf armfVar29 = rcsVar.am;
        armf armfVar30 = rcsVar.an;
        armf armfVar31 = rcsVar.ao;
        armf armfVar32 = rcsVar.ap;
        armf armfVar33 = rcsVar.aq;
        pmz pmzVar = (pmz) rcsVar.ar.b();
        pmzVar.getClass();
        armf armfVar34 = rcsVar.as;
        armf armfVar35 = rcsVar.at;
        armf armfVar36 = rcsVar.au;
        armf armfVar37 = rcsVar.av;
        oia oiaVar = (oia) rcsVar.aw.b();
        oiaVar.getClass();
        return new rcr(context, xnvVar, wysVar, xcaVar, armfVar, rzcVar, optional, ujvVar, mhoVar, armfVar2, armfVar3, armfVar4, armfVar5, armfVar6, armfVar7, mceVar, zaiVar, armfVar8, wzsVar, armfVar9, rygVar, wypVar, qynVar, wyqVar, rjiVar, uhjVar, rysVar, agnqVar, qyaVar, rtbVar, yckVar, wzpVar, tznVar, hgjVar, mfcVar, armfVar10, optional2, armfVar11, armfVar12, arweVar, arweVar2, arpiVar, arpiVar2, armfVar13, armfVar14, armfVar15, armfVar16, b2, armfVar17, ahqrVar, armfVar18, armfVar19, armfVar20, armfVar21, armfVar22, armfVar23, armfVar24, armfVar25, armfVar26, odnVar, armfVar27, armfVar28, armfVar29, armfVar30, armfVar31, armfVar32, armfVar33, pmzVar, armfVar34, armfVar35, armfVar36, armfVar37, oiaVar, rcsVar.ax, rcsVar.ay, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, int i, String str, String[] strArr, String[] strArr2, Bundle bundle) {
        super(amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = armfVar;
        this.c = oiaVar;
        this.d = armfVar2;
        this.u.p("downloaded_by_mms_api_or_lib", false);
        if (str != null) {
            this.u.v("cloud_sync_id", str);
        }
        this.u.w("attachments_types", strArr);
        this.u.w("attachments_values", strArr2);
        this.u.r("status", i);
        this.u.p("auto_download", bundle.getBoolean("auto_download"));
        this.u.r("status_if_failed", bundle.getInt("status_if_failed"));
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, Parcel parcel) {
        super(parcel, amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = armfVar;
        this.c = oiaVar;
        this.d = armfVar2;
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, MessageIdType messageIdType, ConversationIdType conversationIdType, String str, int i, int i2, String str2) {
        super(amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        xyl.l(messageIdType);
        xyl.l(conversationIdType);
        xyl.l(str);
        this.b = armfVar;
        this.c = oiaVar;
        this.d = armfVar2;
        this.u.p("downloaded_by_mms_api_or_lib", false);
        this.u.v("message_id", messageIdType.a());
        this.u.r("status", 2);
        this.u.r("raw_status", 0);
        this.u.v("conversation_id", conversationIdType.a());
        this.u.v("participant_id", str);
        this.u.r("status_if_failed", i);
        this.u.r("sub_id", i2);
        this.u.v("transaction_id", str2);
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, MessageIdType messageIdType, Uri uri, ConversationIdType conversationIdType, String str, Uri uri2, int i, String str2, int i2, boolean z, String str3, int i3) {
        super(amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        xyl.l(messageIdType);
        xyl.l(uri);
        xyl.l(conversationIdType);
        xyl.l(str);
        this.b = armfVar;
        this.c = oiaVar;
        this.d = armfVar2;
        this.u.p("downloaded_by_mms_api_or_lib", true);
        this.u.v("message_id", messageIdType.a());
        this.u.r("result_code", i3);
        this.u.t("notification_uri", uri);
        this.u.r("sub_id", i);
        this.u.v("sub_phone_number", str2);
        this.u.v("content_location", uri2.toString());
        this.u.p("auto_download", z);
        this.u.v("conversation_id", conversationIdType.a());
        this.u.v("participant_id", str);
        this.u.r("status_if_failed", i2);
        this.u.v("transaction_id", str3);
    }

    public ProcessDownloadedMmsAction(armf armfVar, oia oiaVar, armf armfVar2, MessageIdType messageIdType, String str, String str2, int i) {
        super(amdy.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = armfVar;
        this.d = armfVar2;
        this.u.v("message_id", messageIdType.a());
        this.u.v("transaction_id", str);
        this.u.v("content_location", str2);
        this.u.p("send_deferred_resp_status", true);
        this.u.r("sub_id", i);
        this.c = oiaVar;
    }
}
