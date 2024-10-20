package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nej {
    public final Object a;
    public final Object b;
    public final Object c;

    public nej(armf armfVar, xnv xnvVar, pvw pvwVar) {
        this.c = armfVar;
        this.b = xnvVar;
        this.a = pvwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final nei a(ParticipantsTable.BindData bindData, sjd sjdVar, ProfilesTable.BindData bindData2) {
        bindData.getClass();
        return new nei((armf) this.a, (armf) this.b, (armf) this.c, bindData, sjdVar, bindData2);
    }

    public final void b(qgr qgrVar, rve rveVar) {
        d(qgrVar, rveVar, 21, 8, 5);
    }

    public final void c(qgr qgrVar, rve rveVar) {
        d(qgrVar, rveVar, 21, 8, 6);
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [armf, java.lang.Object] */
    public final void d(qgr qgrVar, rve rveVar, int i, int i2, int i3) {
        atok atokVar = (atok) ((algf) this.a).m().fu(qgrVar);
        if (!yad.a(atokVar)) {
            return;
        }
        aozy createBuilder = asgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar = (asgx) createBuilder.b;
        atokVar.getClass();
        asgxVar.c = atokVar;
        asgxVar.b |= 1;
        if (rve.l(rveVar)) {
            aozy createBuilder2 = asgv.a.createBuilder();
            createBuilder2.bP(rveVar.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar2 = (asgx) createBuilder.b;
            asgv asgvVar = (asgv) createBuilder2.s();
            asgvVar.getClass();
            asgxVar2.d = asgvVar;
            asgxVar2.b |= 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(i2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i3);
        apct b = apds.b(((xnv) this.b).f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar3 = (asgx) createBuilder.b;
        b.getClass();
        asgxVar3.h = b;
        asgxVar3.b |= 4;
        maq maqVar = (maq) this.c.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.XSL_REQUEST_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        asgx asgxVar4 = (asgx) createBuilder.s();
        asgxVar4.getClass();
        amfrVar2.aI = asgxVar4;
        amfrVar2.e |= 16777216;
        maqVar.j(amfqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul e(qei qeiVar, pto ptoVar) {
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(((ptg) it.next()).d(qeiVar, ptoVar));
        }
        return aktp.am(arrayList).h(new hbd(this, qeiVar, ptoVar, 14, (byte[]) null), this.b);
    }

    public nej(Set set, lgg lggVar, anen anenVar) {
        this.c = set;
        this.a = lggVar;
        this.b = anenVar;
    }

    public nej(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public nej(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public nej(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public nej(armf armfVar, armf armfVar2, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.a = arweVar;
    }

    public nej(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public nej(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public nej(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new sms(9);
        a.a = "custodian_rcs_group_ids.conversation_id";
        a.c = new wsy();
        snl snlVar = new snl(a.a());
        this.a = snlVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "custodian_rcs_group_ids.rcs_group_id";
        a2.c = new wsy();
        snl snlVar2 = new snl(a2.a());
        this.b = snlVar2;
        this.c = new snl[]{snlVar, snlVar2};
    }

    public nej(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "data_upgrade_workers._id";
        a.c = new wsy();
        snr snrVar = new snr(a.a());
        this.b = snrVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "data_upgrade_workers.last_update_version";
        a2.c = new wsy();
        snr snrVar2 = new snr(a2.a());
        this.a = snrVar2;
        this.c = new snr[]{snrVar, snrVar2};
    }

    public nej(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.c(true);
        a.a = "disambiguations.lookup_key";
        a.c = new wsy();
        sot sotVar = new sot(a.a());
        this.a = sotVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "disambiguations.normalized_destination";
        a2.c = new wsy();
        sot sotVar2 = new sot(a2.a());
        this.b = sotVar2;
        this.c = new sot[]{sotVar, sotVar2};
    }

    public nej(short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new spk(17);
        a.a = "gemini.conversation_id";
        a.e(true);
        a.c = new wsy();
        sqx sqxVar = new sqx(a.a());
        this.a = sqxVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "gemini.desired_gemini_state";
        a2.c = new wsy();
        sqx sqxVar2 = new sqx(a2.a());
        this.b = sqxVar2;
        this.c = new sqx[]{sqxVar, sqxVar2};
    }

    public nej(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new ssv(9);
        a.a = "message_captions.message_id";
        a.e(true);
        a.c = new wsy();
        stn stnVar = new stn(a.a());
        this.b = stnVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "message_captions.caption";
        a2.c = new wsy();
        stn stnVar2 = new stn(a2.a());
        this.a = stnVar2;
        this.c = new stn[]{stnVar, stnVar2};
    }

    public nej(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.c(true);
        a.d(true);
        a.b = new svc(2);
        a.a = "message_photos_sharing.message_id";
        a.e(true);
        a.c = new wsy();
        sve sveVar = new sve(a.a());
        this.a = sveVar;
        agmi a2 = agmk.a();
        a2.d = 5;
        a2.i(true);
        a2.a = "message_photos_sharing.sharing_state";
        a2.c = new wsy();
        sve sveVar2 = new sve(a2.a());
        this.b = sveVar2;
        this.c = new sve[]{sveVar, sveVar2};
    }

    public nej(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_star._id";
        a.c = new wsy();
        swy swyVar = new swy(a.a());
        this.b = swyVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.c(true);
        a2.d(true);
        a2.b = new swm(6);
        a2.a = "message_star.message_id";
        a2.e(true);
        a2.c = new wsy();
        swy swyVar2 = new swy(a2.a());
        this.a = swyVar2;
        this.c = new swy[]{swyVar, swyVar2};
    }

    public nej() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "smarts_personalization_normalized_feature_values.date";
        a.c = new wsy();
        syz syzVar = new syz(a.a());
        this.a = syzVar;
        agmi a2 = agmk.a();
        a2.d = 5;
        a2.a = "smarts_personalization_normalized_feature_values.features";
        a2.c = new wsy();
        syz syzVar2 = new syz(a2.a());
        this.b = syzVar2;
        this.c = new syz[]{syzVar, syzVar2};
    }
}
