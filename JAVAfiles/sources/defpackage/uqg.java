package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public uqg(armf armfVar, armf armfVar2, xnv xnvVar, anen anenVar) {
        this.c = armfVar;
        this.a = armfVar2;
        this.b = xnvVar;
        this.d = anenVar;
    }

    public static final aomj g(String str) {
        aomi aomiVar = aomi.NO_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new aomj(aomiVar, str);
    }

    public static final aomj h(String str) {
        aomi aomiVar = aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new aomj(aomiVar, str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    public static /* synthetic */ void i(uqg uqgVar, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i) {
        alwk alwkVar;
        boolean z3;
        boolean z4;
        boolean k = k(str, str3);
        boolean k2 = k(str2, str4);
        String str6 = null;
        boolean k3 = k(str3, null);
        boolean k4 = k(str4, null);
        if (!k && !k2 && !k3 && !k4) {
            return;
        }
        List l = ((yjy) uqgVar.b.b()).l();
        ArrayList arrayList = new ArrayList(aqjn.J(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(uqgVar.j(((ykb) it.next()).r()));
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(l, 10));
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            arrayList2.add(uqgVar.j(((ykb) it2.next()).u()));
        }
        int i2 = i & 64;
        yjt j = uqgVar.j(((yjy) uqgVar.b.b()).g().n());
        yjt j2 = uqgVar.j(((yjy) uqgVar.b.b()).g().m());
        Object obj = uqgVar.d;
        List list = ryb.a;
        ryb g = vcp.g(str, str2, str3, str4, null, null, j, j2, arrayList2, arrayList, (arst) obj, 2752);
        boolean O = aczf.O();
        Boolean bool = (Boolean) ((utz) rxr.b.get()).e();
        alwl alwlVar = (alwl) ((aluw) uqgVar.a).i();
        if (i2 != 0) {
            alwkVar = alwk.FULL;
        } else {
            alwkVar = alwk.NONE;
        }
        int i3 = i & 512;
        int i4 = i & 128;
        if ((i & 256) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i3 == 0) {
            str6 = str5;
        }
        boolean z5 = z3 & z2;
        boolean z6 = z4 & z;
        alwlVar.Z(alwkVar);
        alwlVar.P("Destination mutation found during participant update: originalNormalizedDestination = [%s], originalSendDestination = [%s], updatedNormalizedDestination = [%s], updatedSendDestination = [%s], expectedNormalizedDestination = [%s], expectedSendDestination = [%s], localeCountryCode = [%s], deviceCountryCodeDeprecated = [%s], simCountryCodes = [%s], networkCountryCodes = [%s]roamingFixFlag = [%s], deviceCountryCode = [%s], settingsCountryCode = [%s], stopUpdatesFlag = [%s], blockedSendDestinationUpdate = [%s], blockedNormalizedDestinationUpdate = [%s], updateSource = [%s], ", h(g.c), h(g.d), h(g.e), h(g.f), h(g.g), h(g.h), h(g.k), h(g.m), h(g.o.toString()), h(g.p.toString()), g(String.valueOf(O)), h(String.valueOf(g.l)), h(String.valueOf(g.n)), g(bool.toString()), g(String.valueOf(z6)), g(String.valueOf(z5)), g(str6));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    private final yjt j(String str) {
        if (str != null) {
            yjt yjtVar = null;
            if (true == arsd.M(str)) {
                str = null;
            }
            if (str != null) {
                yjr g = ((yjy) this.b.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                yjt a = g.a(upperCase);
                if (true != a.a()) {
                    yjtVar = a;
                }
                if (yjtVar != null) {
                    return yjtVar;
                }
            }
        }
        return new yjt(0);
    }

    private static final boolean k(String str, String str2) {
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && !d.F(str, str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascc] */
    public final void a(long j) {
        dtq c;
        ?? r0 = this.c;
        Long valueOf = Long.valueOf(j);
        r0.h(valueOf);
        uqf uqfVar = (uqf) ((ConcurrentHashMap) this.b).remove(valueOf);
        if (uqfVar != null && (c = uqfVar.c()) != null) {
            c.c();
        }
    }

    public final void b(long j, upm upmVar) {
        dtq c;
        upmVar.getClass();
        uqf uqfVar = (uqf) ((ConcurrentHashMap) this.b).remove(Long.valueOf(j));
        if (uqfVar != null && (c = uqfVar.c()) != null) {
            c.b(upmVar);
        }
    }

    public final Integer c(MessageIdType messageIdType) {
        if (messageIdType.b()) {
            return null;
        }
        return (Integer) ((ConcurrentHashMap) this.a).get(messageIdType);
    }

    public final Integer d(rve rveVar) {
        if (rveVar.i()) {
            return null;
        }
        return (Integer) ((ConcurrentHashMap) this.b).get(rveVar);
    }

    public final boolean e(rve rveVar, int i) {
        if (rveVar.i()) {
            return false;
        }
        return f(rveVar, (ConcurrentHashMap) this.b, i);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [agnq, java.lang.Object] */
    public final boolean f(Object obj, ConcurrentHashMap concurrentHashMap, int i) {
        AtomicInteger atomicInteger = new AtomicInteger(-999);
        Integer num = (Integer) ConcurrentMap.EL.merge(concurrentHashMap, obj, Integer.valueOf(i), new jgl(atomicInteger, 4));
        if (num.intValue() == i) {
            this.d.h(new rxa(10), null, new mib(this, concurrentHashMap, obj, i, 4));
        }
        if (atomicInteger.get() != -999 && atomicInteger.get() == num.intValue()) {
            return false;
        }
        return true;
    }

    public uqg() {
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.a = new HashMap();
        this.c = new HashMap();
    }

    public uqg(armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xnvVar.getClass();
        this.b = armfVar;
        this.c = armfVar3;
        this.a = alwo.o("BugleParticipantData");
        this.d = arrj.e(xnvVar.f().toEpochMilli());
    }

    public uqg(char[] cArr, byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "add_contact_banner._id";
        a.c = new wsy();
        sfh sfhVar = new sfh(a.a());
        this.c = sfhVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new seo(12);
        a2.a = "add_contact_banner.conversation_id";
        a2.c = new wsy();
        sfh sfhVar2 = new sfh(a2.a());
        this.b = sfhVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "add_contact_banner.banner_status";
        a3.c = new wsy();
        sfh sfhVar3 = new sfh(a3.a());
        this.a = sfhVar3;
        this.d = new sfh[]{sfhVar, sfhVar2, sfhVar3};
    }

    public uqg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        this.b = armfVar4;
    }

    public uqg(agnq agnqVar, aneo aneoVar) {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.d = agnqVar;
        this.c = aneoVar;
    }

    public uqg(uqg uqgVar, MessageIdType messageIdType, rve rveVar) {
        this.d = rveVar;
        this.a = messageIdType;
        byte[] bArr = null;
        this.c = albo.D(new ubu(uqgVar, rveVar, 6, bArr));
        this.b = albo.D(new ubu(uqgVar, messageIdType, 7, bArr));
    }

    public uqg(xnv xnvVar, umx umxVar, Context context, yep yepVar, arwe arweVar, arwe arweVar2, arpi arpiVar) {
        xnvVar.getClass();
        umxVar.getClass();
        context.getClass();
        yepVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        arpiVar.getClass();
        this.a = context;
        this.d = yepVar;
        this.c = arweVar2;
        this.b = arpiVar;
    }

    public uqg(xnv xnvVar, umx umxVar, Context context, yep yepVar, qhz qhzVar, arwe arweVar, arwe arweVar2, arpi arpiVar) {
        xnvVar.getClass();
        umxVar.getClass();
        context.getClass();
        yepVar.getClass();
        qhzVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        arpiVar.getClass();
        this.b = context;
        this.a = yepVar;
        this.d = arweVar2;
        this.c = arpiVar;
    }

    public uqg(arwe arweVar) {
        arweVar.getClass();
        this.a = arweVar;
        this.b = new ConcurrentHashMap();
        ascc d = asck.d(0, Integer.MAX_VALUE, 2);
        this.c = d;
        this.d = new asce(d);
    }

    public uqg(byte[] bArr, char[] cArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_blobs_pending_delete._id";
        a.c = new wsy();
        sgr sgrVar = new sgr(a.a());
        this.b = sgrVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "cms_blobs_pending_delete.message_id";
        a2.c = new wsy();
        sgr sgrVar2 = new sgr(a2.a());
        this.a = sgrVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "cms_blobs_pending_delete.blob_id";
        a3.c = new wsy();
        sgr sgrVar3 = new sgr(a3.a());
        this.d = sgrVar3;
        this.c = new sgr[]{sgrVar, sgrVar2, sgrVar3};
    }

    public uqg(short[] sArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_pin._id";
        a.c = new wsy();
        slg slgVar = new slg(a.a());
        this.b = slgVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new ske(10);
        a2.a = "conversation_pin.conversation_id";
        a2.e(true);
        a2.c = new wsy();
        slg slgVar2 = new slg(a2.a());
        this.d = slgVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "conversation_pin.pin_status";
        a3.c = new wsy();
        slg slgVar3 = new slg(a3.a());
        this.a = slgVar3;
        this.c = new slg[]{slgVar, slgVar2, slgVar3};
    }

    public uqg(byte[] bArr, byte[] bArr2, char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "data_usage._id";
        a.c = new wsy();
        sob sobVar = new sob(a.a());
        this.a = sobVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "data_usage.phone_number";
        a2.c = new wsy();
        sob sobVar2 = new sob(a2.a());
        this.d = sobVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "data_usage.data_size";
        a3.c = new wsy();
        sob sobVar3 = new sob(a3.a());
        this.c = sobVar3;
        this.b = new sob[]{sobVar, sobVar2, sobVar3};
    }

    public uqg(char[] cArr, char[] cArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new spk(14);
        a.a = "gemini_conversation_id_mappings.conversation_id";
        a.c = new wsy();
        sqr sqrVar = new sqr(a.a());
        this.c = sqrVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.i(true);
        a2.f(true);
        a2.c(true);
        a2.d(true);
        a2.b = new spk(15);
        a2.a = "gemini_conversation_id_mappings.my_identity_token";
        a2.c = new wsy();
        sqr sqrVar2 = new sqr(a2.a());
        this.a = sqrVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.j(true);
        a3.i(true);
        a3.c(true);
        a3.a = "gemini_conversation_id_mappings.gemini_conversation_id";
        a3.e(true);
        a3.c = new wsy();
        sqr sqrVar3 = new sqr(a3.a());
        this.d = sqrVar3;
        this.b = new sqr[]{sqrVar, sqrVar2, sqrVar3};
    }

    public uqg(byte[] bArr, short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "link_preview_participants_table._id";
        a.c = new wsy();
        ssb ssbVar = new ssb(a.a());
        this.a = ssbVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.a = "link_preview_participants_table.participant_id";
        a2.c = new wsy();
        ssb ssbVar2 = new ssb(a2.a());
        this.d = ssbVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "link_preview_participants_table.manual_link_preview_count";
        a3.c = new wsy();
        ssb ssbVar3 = new ssb(a3.a());
        this.c = ssbVar3;
        this.b = new ssb[]{ssbVar, ssbVar2, ssbVar3};
    }

    public uqg(int[] iArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new sym(0);
        a.a = "smarts_personalization_decayed_feature_values.feature_id";
        a.c = new wsy();
        syn synVar = new syn(a.a());
        this.d = synVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.a = "smarts_personalization_decayed_feature_values.date";
        a2.c = new wsy();
        syn synVar2 = new syn(a2.a());
        this.c = synVar2;
        agmi a3 = agmk.a();
        a3.d = 3;
        a3.a = "smarts_personalization_decayed_feature_values.feature_value";
        a3.c = new wsy();
        syn synVar3 = new syn(a3.a());
        this.a = synVar3;
        this.b = new syn[]{synVar, synVar2, synVar3};
    }

    public uqg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "smarts_personalization_features.feature_id";
        a.c = new wsy();
        syt sytVar = new syt(a.a());
        this.c = sytVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.c(true);
        a2.a = "smarts_personalization_features.feature";
        a2.e(true);
        a2.c = new wsy();
        syt sytVar2 = new syt(a2.a());
        this.b = sytVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "smarts_personalization_features.start_date";
        a3.c = new wsy();
        syt sytVar3 = new syt(a3.a());
        this.d = sytVar3;
        this.a = new syt[]{sytVar, sytVar2, sytVar3};
    }

    public uqg(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "recent_stickers._id";
        a.c = new wsy();
        tge tgeVar = new tge(a.a());
        this.d = tgeVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "recent_stickers.sticker_id";
        a2.e(true);
        a2.c = new wsy();
        tge tgeVar2 = new tge(a2.a());
        this.c = tgeVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "recent_stickers.last_used_timestamp";
        a3.c = new wsy();
        tge tgeVar3 = new tge(a3.a());
        this.b = tgeVar3;
        this.a = new tge[]{tgeVar, tgeVar2, tgeVar3};
    }

    public uqg(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "remote_user_id_info_table.remote_user_id";
        a.c = new wsy();
        thn thnVar = new thn(a.a());
        this.d = thnVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.a = "remote_user_id_info_table.last_modified_timestamp";
        a2.c = new wsy();
        thn thnVar2 = new thn(a2.a());
        this.c = thnVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp";
        a3.c = new wsy();
        thn thnVar3 = new thn(a3.a());
        this.b = thnVar3;
        this.a = new thn[]{thnVar, thnVar2, thnVar3};
    }

    public uqg(short[] sArr) {
        agmi a = agmk.a();
        a.d = 1;
        a.c(true);
        a.a = "restore_workflow_scratch_duplicates.key";
        a.c = new wsy();
        tjc tjcVar = new tjc(a.a());
        this.d = tjcVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "restore_workflow_scratch_duplicates.backup_id";
        a2.c = new wsy();
        tjc tjcVar2 = new tjc(a2.a());
        this.b = tjcVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.c(true);
        a3.a = "restore_workflow_scratch_duplicates.bugle_id";
        a3.c = new wsy();
        tjc tjcVar3 = new tjc(a3.a());
        this.c = tjcVar3;
        this.a = new tjc[]{tjcVar, tjcVar2, tjcVar3};
    }

    public uqg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 1;
        a.c(true);
        a.a = "restore_workflow_scratch_suffix.which_database";
        a.e(true);
        a.c = new wsy();
        tjl tjlVar = new tjl(a.a());
        this.d = tjlVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "restore_workflow_scratch_suffix.participant_id";
        a2.e(true);
        a2.c = new wsy();
        tjl tjlVar2 = new tjl(a2.a());
        this.c = tjlVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.c(true);
        a3.a = "restore_workflow_scratch_suffix.destination_suffix";
        a3.c = new wsy();
        tjl tjlVar3 = new tjl(a3.a());
        this.b = tjlVar3;
        this.a = new tjl[]{tjlVar, tjlVar2, tjlVar3};
    }

    public uqg(char[] cArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.a = "sqlite_stat1.tbl";
        a.c = new wsy();
        tlu tluVar = new tlu(a.a());
        this.d = tluVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "sqlite_stat1.idx";
        a2.c = new wsy();
        tlu tluVar2 = new tlu(a2.a());
        this.b = tluVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "sqlite_stat1.stat";
        a3.c = new wsy();
        tlu tluVar3 = new tlu(a3.a());
        this.c = tluVar3;
        this.a = new tlu[]{tluVar, tluVar2, tluVar3};
    }

    public uqg(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.a = "sticker_sets_localization.sticker_set_id";
        a.c = new wsy();
        tmd tmdVar = new tmd(a.a());
        this.d = tmdVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.a = "sticker_sets_localization.locale";
        a2.c = new wsy();
        tmd tmdVar2 = new tmd(a2.a());
        this.c = tmdVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "sticker_sets_localization.display_name";
        a3.c = new wsy();
        tmd tmdVar3 = new tmd(a3.a());
        this.b = tmdVar3;
        this.a = new tmd[]{tmdVar, tmdVar2, tmdVar3};
    }

    public uqg(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "supersort_labels._id";
        a.c = new wsy();
        tnf tnfVar = new tnf(a.a());
        this.d = tnfVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "supersort_labels.name";
        a2.c = new wsy();
        tnf tnfVar2 = new tnf(a2.a());
        this.b = tnfVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.a = "supersort_labels.status";
        a3.c = new wsy();
        tnf tnfVar3 = new tnf(a3.a());
        this.c = tnfVar3;
        this.a = new tnf[]{tnfVar, tnfVar2, tnfVar3};
    }
}
