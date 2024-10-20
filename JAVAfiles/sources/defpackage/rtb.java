package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtb {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public rtb() {
        throw null;
    }

    public final MessagePartData a(String str, Uri uri, int i, Long l, ameb amebVar, tqq tqqVar) {
        long j;
        rtc a = rtd.a();
        a.c = str;
        a.e = uri;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        a.l(j);
        a.b(i);
        a.k(amebVar);
        a.i(tqqVar);
        return e(a.a());
    }

    public final MessagePartData b(String str, ameb amebVar) {
        rtc a = rtd.a();
        a.b = str;
        a.c = RbmSpecificMessage.CONTENT_TYPE;
        a.k(amebVar);
        return e(a.a());
    }

    public final MessagePartData c(String str) {
        rtc a = rtd.a();
        a.b = str;
        a.c = "text/plain";
        a.k(ameb.TEXT_PART);
        return e(a.a());
    }

    public final MessagePartData d(tbn tbnVar) {
        return g((PartsTable.BindData) tbnVar.cK());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final MessagePartData e(rtd rtdVar) {
        uff uffVar = (uff) this.a.b();
        uffVar.getClass();
        xav xavVar = (xav) this.c.b();
        xavVar.getClass();
        rtb rtbVar = (rtb) this.d.b();
        rtbVar.getClass();
        yfo yfoVar = (yfo) this.e.b();
        yfoVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        zxy zxyVar = (zxy) this.g.b();
        zxyVar.getClass();
        Context context = (Context) this.h.b();
        context.getClass();
        ydk ydkVar = (ydk) this.i.b();
        ydkVar.getClass();
        ydy ydyVar = (ydy) this.j.b();
        ydyVar.getClass();
        Optional optional = (Optional) ((apxx) this.k).a;
        wfh wfhVar = (wfh) this.l.b();
        wfhVar.getClass();
        anen anenVar = (anen) this.m.b();
        anenVar.getClass();
        return new MessagePartData(uffVar, (armf) this.b, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar, anenVar, rtdVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final MessagePartData f(sbz sbzVar) {
        uff uffVar = (uff) this.a.b();
        uffVar.getClass();
        xav xavVar = (xav) this.c.b();
        xavVar.getClass();
        rtb rtbVar = (rtb) this.d.b();
        rtbVar.getClass();
        yfo yfoVar = (yfo) this.e.b();
        yfoVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        zxy zxyVar = (zxy) this.g.b();
        zxyVar.getClass();
        Context context = (Context) this.h.b();
        context.getClass();
        ydk ydkVar = (ydk) this.i.b();
        ydkVar.getClass();
        ydy ydyVar = (ydy) this.j.b();
        ydyVar.getClass();
        Optional optional = (Optional) ((apxx) this.k).a;
        wfh wfhVar = (wfh) this.l.b();
        wfhVar.getClass();
        anen anenVar = (anen) this.m.b();
        anenVar.getClass();
        sbzVar.getClass();
        return new MessagePartData(uffVar, (armf) this.b, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar, anenVar, sbzVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final MessagePartData g(PartsTable.BindData bindData) {
        uff uffVar = (uff) this.a.b();
        uffVar.getClass();
        xav xavVar = (xav) this.c.b();
        xavVar.getClass();
        rtb rtbVar = (rtb) this.d.b();
        rtbVar.getClass();
        yfo yfoVar = (yfo) this.e.b();
        yfoVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        zxy zxyVar = (zxy) this.g.b();
        zxyVar.getClass();
        Context context = (Context) this.h.b();
        context.getClass();
        ydk ydkVar = (ydk) this.i.b();
        ydkVar.getClass();
        ydy ydyVar = (ydy) this.j.b();
        ydyVar.getClass();
        Optional optional = (Optional) ((apxx) this.k).a;
        wfh wfhVar = (wfh) this.l.b();
        wfhVar.getClass();
        anen anenVar = (anen) this.m.b();
        anenVar.getClass();
        bindData.getClass();
        return new MessagePartData(uffVar, (armf) this.b, xavVar, rtbVar, yfoVar, xnvVar, zxyVar, context, ydkVar, ydyVar, optional, wfhVar, anenVar, bindData);
    }

    public rtb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.m = armfVar13;
    }

    public rtb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, byte[] bArr) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.h = armfVar2;
        armfVar3.getClass();
        this.l = armfVar3;
        armfVar4.getClass();
        this.m = armfVar4;
        armfVar5.getClass();
        this.i = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
        armfVar7.getClass();
        this.k = armfVar7;
        armfVar8.getClass();
        this.b = armfVar8;
        armfVar9.getClass();
        this.a = armfVar9;
        armfVar10.getClass();
        this.g = armfVar10;
        armfVar11.getClass();
        this.j = armfVar11;
        armfVar12.getClass();
        this.f = armfVar12;
        armfVar13.getClass();
        this.c = armfVar13;
    }

    public rtb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.k = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.m = armfVar6;
        armfVar7.getClass();
        this.i = armfVar7;
        armfVar8.getClass();
        armfVar9.getClass();
        this.g = armfVar9;
        armfVar10.getClass();
        this.f = armfVar10;
        armfVar11.getClass();
        this.b = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.j = armfVar13;
        armfVar14.getClass();
        this.h = armfVar14;
    }

    public rtb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_labels._id";
        a.c = new wsy();
        skf skfVar = new skf(a.a());
        this.i = skfVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new ske(2);
        a2.a = "conversation_labels.conversation_id";
        a2.e(true);
        a2.c = new wsy();
        skf skfVar2 = new skf(a2.a());
        this.m = skfVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new ske(3);
        a3.a = "conversation_labels.label";
        a3.e(true);
        a3.c = new wsy();
        skf skfVar3 = new skf(a3.a());
        this.g = skfVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.c(true);
        a4.d(true);
        a4.b = new ske(0);
        a4.a = "conversation_labels.message_id";
        a4.c = new wsy();
        skf skfVar4 = new skf(a4.a());
        this.f = skfVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "conversation_labels.snippet_text";
        a5.c = new wsy();
        skf skfVar5 = new skf(a5.a());
        this.b = skfVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "conversation_labels.preview_uri";
        a6.c = new wsy();
        skf skfVar6 = new skf(a6.a());
        this.j = skfVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversation_labels.preview_content_type";
        a7.c = new wsy();
        skf skfVar7 = new skf(a7.a());
        this.h = skfVar7;
        agmi a8 = agmk.a();
        a8.d = 2;
        a8.a = "conversation_labels.message_status";
        a8.c = new wsy();
        skf skfVar8 = new skf(a8.a());
        this.k = skfVar8;
        agmi a9 = agmk.a();
        a9.d = 2;
        a9.a = "conversation_labels.read";
        a9.c = new wsy();
        skf skfVar9 = new skf(a9.a());
        this.a = skfVar9;
        agmi a10 = agmk.a();
        a10.d = 2;
        a10.a = "conversation_labels.received_timestamp";
        a10.c = new wsy();
        skf skfVar10 = new skf(a10.a());
        this.c = skfVar10;
        agmi a11 = agmk.a();
        a11.d = 2;
        a11.a = "conversation_labels.message_protocol";
        a11.c = new wsy();
        skf skfVar11 = new skf(a11.a());
        this.e = skfVar11;
        agmi a12 = agmk.a();
        a12.d = 2;
        a12.a = "conversation_labels.raw_telephony_status";
        a12.c = new wsy();
        skf skfVar12 = new skf(a12.a());
        this.d = skfVar12;
        this.l = new skf[]{skfVar, skfVar2, skfVar3, skfVar4, skfVar5, skfVar6, skfVar7, skfVar8, skfVar9, skfVar10, skfVar11, skfVar12};
    }

    public rtb(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "p2p_conversation_suggestion_event.id";
        a.c = new wsy();
        szg szgVar = new szg(a.a());
        this.h = szgVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new sym(5);
        a2.a = "p2p_conversation_suggestion_event.message_id";
        a2.c = new wsy();
        szg szgVar2 = new szg(a2.a());
        this.e = szgVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "p2p_conversation_suggestion_event.timestamp";
        a3.c = new wsy();
        szg szgVar3 = new szg(a3.a());
        this.i = szgVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "p2p_conversation_suggestion_event.event_type";
        a4.c = new wsy();
        szg szgVar4 = new szg(a4.a());
        this.f = szgVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "p2p_conversation_suggestion_event.reply_mode";
        a5.c = new wsy();
        szg szgVar5 = new szg(a5.a());
        this.b = szgVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "p2p_conversation_suggestion_event.rejection_reason";
        a6.c = new wsy();
        szg szgVar6 = new szg(a6.a());
        this.c = szgVar6;
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.a = "p2p_conversation_suggestion_event.action_source";
        a7.c = new wsy();
        szg szgVar7 = new szg(a7.a());
        this.m = szgVar7;
        agmi a8 = agmk.a();
        a8.d = 2;
        a8.a = "p2p_conversation_suggestion_event.num_of_items";
        a8.c = new wsy();
        szg szgVar8 = new szg(a8.a());
        this.a = szgVar8;
        agmi a9 = agmk.a();
        a9.d = 2;
        a9.a = "p2p_conversation_suggestion_event.click_index";
        a9.c = new wsy();
        szg szgVar9 = new szg(a9.a());
        this.g = szgVar9;
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "p2p_conversation_suggestion_event.impression_id";
        a10.c = new wsy();
        szg szgVar10 = new szg(a10.a());
        this.j = szgVar10;
        agmi a11 = agmk.a();
        a11.d = 4;
        a11.a = "p2p_conversation_suggestion_event.suggestion_types";
        a11.c = new wsy();
        szg szgVar11 = new szg(a11.a());
        this.k = szgVar11;
        agmi a12 = agmk.a();
        a12.d = 4;
        a12.a = "p2p_conversation_suggestion_event.model_output_label";
        a12.c = new wsy();
        szg szgVar12 = new szg(a12.a());
        this.d = szgVar12;
        this.l = new szg[]{szgVar, szgVar2, szgVar3, szgVar4, szgVar5, szgVar6, szgVar7, szgVar8, szgVar9, szgVar10, szgVar11, szgVar12};
    }

    public rtb(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "rbm_business_info.rbm_bot_id";
        a.c = new wsy();
        tdz tdzVar = new tdz(a.a());
        this.b = tdzVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "rbm_business_info.display_name";
        a2.c = new wsy();
        tdz tdzVar2 = new tdz(a2.a());
        this.h = tdzVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.i(true);
        a3.a = "rbm_business_info.logo_image_remote_url";
        a3.c = new wsy();
        tdz tdzVar3 = new tdz(a3.a());
        this.c = tdzVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.i(true);
        a4.a = "rbm_business_info.logo_image_local_uri";
        a4.c = new wsy();
        tdz tdzVar4 = new tdz(a4.a());
        this.a = tdzVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.i(true);
        a5.a = "rbm_business_info.description";
        a5.c = new wsy();
        tdz tdzVar5 = new tdz(a5.a());
        this.f = tdzVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.i(true);
        a6.a = "rbm_business_info.color";
        a6.c = new wsy();
        tdz tdzVar6 = new tdz(a6.a());
        this.g = tdzVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.i(true);
        a7.a = "rbm_business_info.hero_image_remote_url";
        a7.c = new wsy();
        tdz tdzVar7 = new tdz(a7.a());
        this.d = tdzVar7;
        agmi a8 = agmk.a();
        a8.d = 4;
        a8.i(true);
        a8.a = "rbm_business_info.hero_image_local_uri";
        a8.c = new wsy();
        tdz tdzVar8 = new tdz(a8.a());
        this.e = tdzVar8;
        agmi a9 = agmk.a();
        a9.d = 4;
        a9.a = "rbm_business_info.verifier_id";
        a9.c = new wsy();
        tdz tdzVar9 = new tdz(a9.a());
        this.k = tdzVar9;
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "rbm_business_info.version";
        a10.c = new wsy();
        tdz tdzVar10 = new tdz(a10.a());
        this.i = tdzVar10;
        agmi a11 = agmk.a();
        a11.d = 2;
        a11.i(true);
        a11.a = "rbm_business_info.expiry_milliseconds";
        a11.c = new wsy();
        tdz tdzVar11 = new tdz(a11.a());
        this.j = tdzVar11;
        agmi a12 = agmk.a();
        a12.d = 1;
        a12.a = "rbm_business_info.agent_use_case_category";
        a12.c = new wsy();
        tdz tdzVar12 = new tdz(a12.a());
        this.m = tdzVar12;
        this.l = new tdz[]{tdzVar, tdzVar2, tdzVar3, tdzVar4, tdzVar5, tdzVar6, tdzVar7, tdzVar8, tdzVar9, tdzVar10, tdzVar11, tdzVar12};
    }

    public rtb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, char[] cArr) {
        armfVar.getClass();
        this.k = armfVar;
        armfVar2.getClass();
        this.h = armfVar2;
        armfVar3.getClass();
        this.g = armfVar3;
        armfVar4.getClass();
        this.m = armfVar4;
        armfVar5.getClass();
        this.i = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.f = armfVar8;
        armfVar9.getClass();
        this.j = armfVar9;
        armfVar10.getClass();
        this.b = armfVar10;
        armfVar11.getClass();
        this.e = armfVar11;
        this.l = armfVar12;
        armfVar13.getClass();
        this.a = armfVar13;
    }
}
