package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tdw implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ tdw(aglz aglzVar, agpw agpwVar, agnw agnwVar, int i) {
        this.d = i;
        this.a = aglzVar;
        this.c = agpwVar;
        this.b = agnwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [vba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [ufw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.alhr
    public final Object get() {
        Integer valueOf;
        Integer valueOf2;
        agnw d;
        boolean z;
        agnw d2;
        agnw d3;
        Integer valueOf3;
        Integer valueOf4;
        agnw d4;
        agnw d5;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Integer valueOf8;
        agnw d6;
        byte[] bArr = null;
        int i = 8;
        int i2 = 2;
        int i3 = 6;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 1;
        switch (this.d) {
            case 0:
                tef tefVar = new tef();
                ContentValues contentValues = tefVar.a;
                Object obj = this.a;
                tdx tdxVar = (tdx) obj;
                agnc.r(contentValues, "rbm_bot_id", tdxVar.k());
                aglz aglzVar = (aglz) obj;
                aglzVar.ao(1, "display_name");
                agnc.r(tefVar.a, "display_name", tdxVar.b);
                aglzVar.ao(2, "logo_image_remote_url");
                agnc.r(tefVar.a, "logo_image_remote_url", tdxVar.c);
                aglzVar.ao(3, "logo_image_local_uri");
                agnc.r(tefVar.a, "logo_image_local_uri", tdxVar.d);
                aglzVar.ao(4, "description");
                agnc.r(tefVar.a, "description", tdxVar.e);
                int i5 = 5;
                aglzVar.ao(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
                agnc.r(tefVar.a, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, tdxVar.f);
                aglzVar.ao(6, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
                agnc.r(tefVar.a, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, tdxVar.g);
                aglzVar.ao(7, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
                agnc.r(tefVar.a, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, tdxVar.h);
                aglzVar.ao(8, "verifier_id");
                agnc.r(tefVar.a, "verifier_id", tdxVar.i);
                tefVar.d(tdxVar.l());
                tefVar.c(tdxVar.h());
                aglzVar.ao(11, "agent_use_case_category");
                AgentUseCase agentUseCase = tdxVar.l;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 59140) {
                    agnc.t("agent_use_case_category", intValue2);
                }
                if (intValue >= 59140) {
                    if (agentUseCase == null) {
                        tefVar.a.putNull("agent_use_case_category");
                    } else {
                        tefVar.a.put("agent_use_case_category", Integer.valueOf(agentUseCase.ordinal()));
                    }
                }
                Object obj2 = this.c;
                tefVar.ag();
                tefVar.Z((agpw) obj2);
                tefVar.ai(new agni("rbm_business_info", "-updateOrInsert-update"));
                if (tefVar.a().e() != 0) {
                    return true;
                }
                ?? r1 = this.b;
                d = agnc.d("$primary");
                if (agnc.a(d, "rbm_business_info", aglzVar, new tbe(r1, 8), new swb(i5)) != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                tcx tcxVar = new tcx();
                Object obj3 = this.a;
                aglz aglzVar2 = (aglz) obj3;
                aglzVar2.ao(1, "timestamp");
                tcr tcrVar = (tcr) obj3;
                Instant instant = tcrVar.b;
                if (instant == null) {
                    tcxVar.a.putNull("timestamp");
                } else {
                    tcxVar.a.put("timestamp", Long.valueOf(uzz.k(instant)));
                }
                Object obj4 = this.c;
                aglzVar2.ao(2, "hash_value");
                agnc.r(tcxVar.a, "hash_value", tcrVar.c);
                aglzVar2.ao(3, "hash_key");
                agnc.r(tcxVar.a, "hash_key", tcrVar.d);
                tcxVar.ag();
                tcxVar.Z((agpw) obj4);
                tcxVar.ai(new agni("pii_hash", "-updateOrInsert-update"));
                if (tcxVar.a().e() != 0) {
                    return true;
                }
                ?? r12 = this.b;
                d2 = agnc.d("$primary");
                if (agnc.a(d2, "pii_hash", aglzVar2, new tbe(r12, 6), new smq(aglzVar2, 20)) != -1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                teo teoVar = new teo();
                Object obj5 = this.a;
                aglz aglzVar3 = (aglz) obj5;
                aglzVar3.ao(0, "verifier_id");
                tei teiVar = (tei) obj5;
                agnc.r(teoVar.a, "verifier_id", teiVar.a);
                aglzVar3.ao(1, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
                agnc.r(teoVar.a, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME, teiVar.b);
                aglzVar3.ao(2, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
                agnc.r(teoVar.a, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, teiVar.c);
                aglzVar3.ao(3, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
                agnc.r(teoVar.a, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI, teiVar.d);
                teoVar.ag();
                teoVar.Z((agpw) this.c);
                teoVar.ai(new agni("rbm_business_verifier_info", "-updateOrInsert-update"));
                if (teoVar.a().e() != 0) {
                    return true;
                }
                ?? r13 = this.b;
                d3 = agnc.d("$primary");
                if (agnc.a(d3, "rbm_business_verifier_info", aglzVar3, new tbe(r13, 9), new swb(i3)) != -1) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 3:
                tey teyVar = new tey();
                Object obj6 = this.a;
                Optional n = ((tes) obj6).n();
                valueOf3 = Integer.valueOf(a.bp().c());
                int intValue3 = valueOf3.intValue();
                valueOf4 = Integer.valueOf(a.bp().c());
                int intValue4 = valueOf4.intValue();
                if (intValue4 < 58880) {
                    agnc.t("ftd_time", intValue4);
                }
                if (intValue3 >= 58880) {
                    if (n == null) {
                        teyVar.a.putNull("ftd_time");
                    } else {
                        teyVar.a.put("ftd_time", Long.valueOf(uxi.f(n)));
                    }
                }
                Object obj7 = this.c;
                teyVar.ag();
                teyVar.Z((agpw) obj7);
                teyVar.ai(new agni("read_reports", "-updateOrInsert-update"));
                if (teyVar.a().e() != 0) {
                    return true;
                }
                ?? r14 = this.b;
                d4 = agnc.d("$primary");
                if (agnc.a(d4, "read_reports", (aglz) obj6, new tbe(r14, 10), new ter(obj6, i2)) != -1) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 4:
                tpq tpqVar = new tpq();
                Object obj8 = this.a;
                aglz aglzVar4 = (aglz) obj8;
                aglzVar4.ao(0, "sender_id");
                tpj tpjVar = (tpj) obj8;
                agnc.r(tpqVar.a, "sender_id", tpjVar.a);
                aglzVar4.ao(1, "brand_id");
                agnc.r(tpqVar.a, "brand_id", tpjVar.b);
                tpqVar.ag();
                tpqVar.Z((agpw) this.c);
                tpqVar.ai(new agni("verified_sms_senders", "-updateOrInsert-update"));
                if (tpqVar.a().e() != 0) {
                    return true;
                }
                Object obj9 = this.b;
                d5 = agnc.d("$primary");
                if (agnc.a(d5, "verified_sms_senders", aglzVar4, new tkg(obj9, i), new swb(16)) != -1) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 5:
                return ucn.a("DELETE FROM " + ((String) this.a) + " WHERE " + ((String) this.b), (String[]) this.c);
            case 6:
                return ((uga) this.c).e((rra) this.a, this.b);
            case 7:
                Object obj10 = this.c;
                Object obj11 = this.b;
                kjs kjsVar = new kjs(obj11, obj10, 13);
                uoh uohVar = (uoh) this.a;
                List c = uohVar.c(kjsVar);
                xyo c2 = uoh.a.c();
                c2.H("Cancelled rows with handler and tag");
                c2.z("handlerKey", obj11);
                c2.z("cancellationTag", obj10);
                c2.x("itemCount", c.size());
                c2.q();
                ArrayList arrayList = new ArrayList(aqjn.J(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((upr) it.next()).o());
                }
                uohVar.e(aqjn.aE(arrayList));
                uohVar.d(c);
                return c;
            case 8:
                Object obj12 = this.a;
                upm upmVar = (upm) obj12;
                if (!upmVar.a && upmVar.b) {
                    return Optional.of(upm.f());
                }
                if (upmVar.d) {
                    return Optional.of(upm.f());
                }
                Object obj13 = this.c;
                alog alogVar = (alog) obj13;
                urr urrVar = (urr) this.b;
                if (urrVar.n.a((upr) alogVar.get(0)).d(unh.CANCELLED)) {
                    return Optional.of(obj12);
                }
                xyo d7 = urr.a.d();
                d7.H("executing tranche");
                d7.x("trancheId", urr.c(alogVar));
                d7.z("queue", ((upr) alogVar.get(0)).o());
                d7.y("delay", urrVar.i.f().toEpochMilli() - ((upr) alogVar.get(0)).l());
                d7.q();
                urrVar.e(alogVar, unh.EXECUTING);
                return Optional.empty();
            case 9:
                sxu sxuVar = new sxu();
                sxuVar.f("deleteMessagesInConversation");
                ?? r2 = this.a;
                Object obj14 = this.b;
                sxuVar.b(new uzn(obj14, r2, false ? 1 : 0));
                int d8 = sxuVar.d();
                ((uhj) ((uzo) this.c).b.b()).k((ConversationIdType) obj14, alog.r(r2.B()), new String[0]);
                return Integer.valueOf(d8);
            case 10:
                sxu sxuVar2 = new sxu();
                sxuVar2.f("deleteMessagesInConversation");
                ?? r3 = this.c;
                Object obj15 = this.a;
                sxuVar2.b(new uzn(obj15, r3, i4, bArr));
                int d9 = sxuVar2.d();
                uzo uzoVar = (uzo) this.b;
                ConversationIdType conversationIdType = (ConversationIdType) obj15;
                ((uhj) uzoVar.b.b()).k(conversationIdType, r3, new String[0]);
                if (!uzoVar.f(conversationIdType)) {
                    tqc r = ((rtz) uzoVar.e.b()).r(conversationIdType);
                    if (r == null) {
                        r = tqc.UNARCHIVED;
                    }
                    ((ruq) uzoVar.f.b()).a(conversationIdType, false, r);
                    ((uhj) uzoVar.b.b()).c();
                }
                return Integer.valueOf(d9);
            case 11:
                vcy vcyVar = (vcy) this.c.b();
                xgj xgjVar = (xgj) this.b;
                Map map = (Map) xgjVar.h.b();
                map.getClass();
                Map map2 = (Map) xgjVar.g.b();
                map2.getClass();
                wpp wppVar = (wpp) xgjVar.b.b();
                wppVar.getClass();
                aneo aneoVar = (aneo) xgjVar.c.b();
                aneoVar.getClass();
                arwe arweVar = (arwe) xgjVar.a.b();
                arweVar.getClass();
                xnv xnvVar = (xnv) xgjVar.e.b();
                xnvVar.getClass();
                mbl mblVar = (mbl) xgjVar.f.b();
                mblVar.getClass();
                vcyVar.getClass();
                ?? r122 = this.a;
                r122.getClass();
                return new vgt(map, map2, wppVar, aneoVar, arweVar, xnvVar, mblVar, xgjVar.d, vcyVar, r122);
            case 12:
                ((wet) this.b).f.a(this.a).a((String) this.c, wet.f(((Long) wet.e.e()).longValue()));
                return null;
            case 13:
                xpd xpdVar = new xpd();
                Object obj16 = this.a;
                xow xowVar = (xow) obj16;
                MessageIdType m = xowVar.m();
                if (m != null && !m.equals(rvc.a)) {
                    xpdVar.a.put("message_id", Long.valueOf(rvc.a(m)));
                } else {
                    xpdVar.a.putNull("message_id");
                }
                agnc.r(xpdVar.a, "transfer_id", xowVar.p());
                xpg n2 = xowVar.n();
                if (n2 == null) {
                    xpdVar.a.putNull("transfer_type");
                } else {
                    xpdVar.a.put("transfer_type", Integer.valueOf(n2.ordinal()));
                }
                xpdVar.c(xowVar.l());
                qep h = xowVar.h();
                valueOf5 = Integer.valueOf(a.bp().c());
                int intValue5 = valueOf5.intValue();
                valueOf6 = Integer.valueOf(a.bp().c());
                int intValue6 = valueOf6.intValue();
                if (intValue6 < 55030) {
                    agnc.t("file_information", intValue6);
                }
                if (intValue5 >= 55030) {
                    if (h == null) {
                        xpdVar.a.putNull("file_information");
                    } else {
                        xpdVar.a.put("file_information", h.toByteArray());
                    }
                }
                xpdVar.d(xowVar.k());
                xpdVar.e(xowVar.o());
                byte[] q = xowVar.q();
                valueOf7 = Integer.valueOf(a.bp().c());
                int intValue7 = valueOf7.intValue();
                valueOf8 = Integer.valueOf(a.bp().c());
                int intValue8 = valueOf8.intValue();
                if (intValue8 < 56040) {
                    agnc.t("opaque_data", intValue8);
                }
                if (intValue7 >= 56040) {
                    xpdVar.a.put("opaque_data", q);
                }
                Object obj17 = this.c;
                xpdVar.ag();
                xpdVar.Z((agpw) obj17);
                xpdVar.ai(new agni("file_transfer", "-updateOrInsert-update"));
                if (xpdVar.a().e() != 0) {
                    return true;
                }
                Object obj18 = this.b;
                d6 = agnc.d("$primary");
                if (agnc.a(d6, "file_transfer", (aglz) obj16, new xol(obj18, i3), new xet(i3)) != -1) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 14:
                xrf xrfVar = (xrf) this.b;
                String g = ((rxq) xrfVar.e.b()).g((ParticipantsTable.BindData) this.a);
                Object obj19 = this.c;
                if (obj19 != null) {
                    String logoImageLocalUri = ((BusinessInfoData) obj19).getLogoImageLocalUri();
                    if (!albo.ah(logoImageLocalUri)) {
                        ((alwl) ((alwl) xrf.a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "updateBotProfile", 1650, "IncomingFileTransferProcessor.java")).q("Updating RBM bot");
                        if (((rxq) xrfVar.e.b()).p(g, Uri.parse(logoImageLocalUri))) {
                            ((rtz) xrfVar.f.b()).P(g);
                        }
                    }
                }
                ParticipantsTable.BindData a = ((rxq) xrfVar.e.b()).a(g);
                a.getClass();
                return a;
            case 15:
                return ynr.c((ConversationIdType) this.a, (MessageIdType) this.b, (ynr) this.c);
            case 16:
                return new abog((aboj) this.b, (String) this.c, (abob) this.a);
            case 17:
                return new aboi((aboj) this.b, (String) this.c, (abob) this.a);
            case 18:
                ContentValues contentValues2 = acqy.a;
                return Integer.valueOf(((SQLiteDatabase) this.b).update("Subscribers", (ContentValues) this.a, "number=?", (String[]) this.c));
            case 19:
                ContentValues contentValues3 = acqy.a;
                return Integer.valueOf(((SQLiteDatabase) this.a).delete((String) this.b, (String) this.c, null));
            default:
                Object obj20 = agnc.a;
                Object obj21 = ((agnm) this.c).get();
                if (((agnk) this.a).apply(obj21).booleanValue()) {
                    return ((agnl) this.b).apply(obj21);
                }
                return obj21;
        }
    }

    public /* synthetic */ tdw(SQLiteDatabase sQLiteDatabase, int i) {
        this.d = i;
        this.a = sQLiteDatabase;
        this.b = "Subscribers";
        this.c = "phoneId > 0 AND contactId > 0 AND deleted = 0";
    }

    public /* synthetic */ tdw(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ tdw(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ tdw(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ tdw(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ tdw(uzo uzoVar, ConversationIdType conversationIdType, MessageCoreData messageCoreData, int i) {
        this.d = i;
        this.c = uzoVar;
        this.b = conversationIdType;
        this.a = messageCoreData;
    }
}
