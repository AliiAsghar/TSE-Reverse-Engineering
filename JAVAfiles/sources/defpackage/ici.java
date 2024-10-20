package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.backup.BugleBackupAgent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ici implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ici(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r3v40, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v36, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        akrh e;
        akul ag;
        akul h;
        int i = 17;
        int i2 = 16;
        int i3 = 7;
        int i4 = 5;
        int i5 = 11;
        int i6 = 2;
        int i7 = 3;
        int i8 = 0;
        int i9 = 1;
        switch (this.b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Object obj2 = this.a;
                    BugleBackupAgent bugleBackupAgent = (BugleBackupAgent) obj2;
                    return bugleBackupAgent.d.a().i(new ici(obj2, i7), bugleBackupAgent.g).f(aqwb.class, new jab(i9), bugleBackupAgent.g).i(new ici(obj2, 4), bugleBackupAgent.g).h(new icj(obj2, i8), bugleBackupAgent.g);
                }
                return aktp.ag(false);
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    Object obj3 = this.a;
                    BugleBackupAgent bugleBackupAgent2 = (BugleBackupAgent) obj3;
                    return bugleBackupAgent2.e.b.get().h().h(new qda(i3), andi.a).h(new icj(obj3, i6), bugleBackupAgent2.f);
                }
                return aktp.ag(false);
            case 2:
                ajwt ajwtVar = (ajwt) obj;
                if (ajwtVar == null) {
                    alvw i10 = BugleBackupAgent.a.i();
                    i10.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) i10).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "writeAccountNameToPreferences", 309, "BugleBackupAgent.java")).q("Failed to get linked account. Skipping backing up BnR Account and setting the D2D");
                    return aktp.ag(ajzb.a);
                }
                BugleBackupAgent bugleBackupAgent3 = (BugleBackupAgent) this.a;
                return akul.g(bugleBackupAgent3.j.k(bugleBackupAgent3.i.A(ajwtVar), akgd.DONT_CARE));
            case 3:
                Optional a = ((BugleBackupAgent.a) akec.x((Context) this.a, BugleBackupAgent.a.class, (ajwt) obj)).a();
                if (a.isEmpty()) {
                    alvw i11 = BugleBackupAgent.a.i();
                    i11.X(alwp.a, "BugleBackup");
                    ((alvg) ((alvg) i11).h("com/google/android/apps/messaging/backup/BugleBackupAgent", "setCmsD2dTimestamp", 418, "BugleBackupAgent.java")).q("CloudMessageStoreClient is not present. Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                    return aktp.ag(apds.b);
                }
                return ((xxp) a.get()).a();
            case 4:
                BugleBackupAgent bugleBackupAgent4 = (BugleBackupAgent) this.a;
                return bugleBackupAgent4.e.b.get().h().h(new qda(i5), andi.a).h(new icj((apct) obj, i7), bugleBackupAgent4.g);
            case 5:
                ihv ihvVar = (ihv) this.a;
                xmh xmhVar = (xmh) ihvVar.f.b();
                c = qjh.c(xmhVar.d, arpj.a, arwf.a, new xjs(xmhVar, (arpe) null, 5));
                return c.h(new icj((alor) obj, i3), ihvVar.a);
            case 6:
                ihv ihvVar2 = (ihv) this.a;
                return ihvVar2.a(true).h(new icj((List) obj, 10), ihvVar2.a);
            case 7:
                ihv ihvVar3 = (ihv) this.a;
                return ihvVar3.a(false).h(new icj((List) obj, i5), ihvVar3.a);
            case 8:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return aktp.ag(Optional.empty());
                }
                Object obj4 = this.a;
                String str = (String) optional.get();
                ijr ijrVar = (ijr) obj4;
                return ijrVar.c.a(str).h(new ijq(obj4, str, i8), ijrVar.a);
            case 9:
                Optional optional2 = (Optional) obj;
                boolean isEmpty = optional2.isEmpty();
                Object obj5 = this.a;
                if (isEmpty) {
                    ((ikf) obj5).g(Optional.empty());
                    return aktp.ag(null);
                }
                if (((msh) optional2.get()).e().isEmpty()) {
                    xyo e2 = ikf.a.e();
                    ikf ikfVar = (ikf) obj5;
                    e2.b(ikfVar.j);
                    e2.H("RCS identifier not present");
                    e2.q();
                    ikfVar.g(Optional.empty());
                    return aktp.ag(null);
                }
                ikf ikfVar2 = (ikf) obj5;
                int d = ikfVar2.d();
                if (!((adjc) ikfVar2.n.b()).w(d)) {
                    ikfVar2.g(Optional.of(ikfVar2.f.c(d, optional2)));
                    return aktp.ag(null);
                }
                msh mshVar = (msh) optional2.get();
                akul i12 = aktp.ai(new haw(obj5, mshVar, i4), ikfVar2.d).i(new ikd(obj5, mshVar, i7), ikfVar2.d);
                i12.i(new ikd(obj5, mshVar, i8), ikfVar2.c).e(psx.class, new icj(obj5, i2), ikfVar2.c).k(qiu.b(), ikfVar2.b);
                return i12.h(new ikg(obj5, d, i9), ikfVar2.d).h(new icj(obj5, i), ikfVar2.c).e(psx.class, new mtq(obj5, d, optional2, i9), ikfVar2.c);
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    ikf ikfVar3 = (ikf) this.a;
                    return ikfVar3.i.d(ikfVar3.j).h(new ezr(i2), andi.a);
                }
                return aktp.ag(null);
            case 11:
                ((ikf) this.a).r.q(aktp.ag(null), "rcs_capabilities");
                return aktp.ag(null);
            case 12:
                return this.a.a().l();
            case 13:
                imj imjVar = (imj) obj;
                e = aktp.e("DraftDataService#populateGooglePhotosUploadStateIntoParts");
                try {
                    if (imjVar.a.isEmpty()) {
                        h = aktp.ag(imjVar);
                    } else {
                        List aD = imjVar.a.get().aD();
                        boolean isEmpty2 = aD.isEmpty();
                        Object obj6 = this.a;
                        if (!isEmpty2 && !((imk) obj6).o.c().isEmpty()) {
                            Stream map = Collection.EL.stream(aD).map(new idc(i));
                            int i13 = alog.d;
                            ag = ((vnz) ((imk) obj6).o.c().get()).a().h(new icj(aD, 20), ((imk) obj6).f);
                            h = ag.h(new itk(imjVar, i9), ((imk) obj6).f);
                            e.b(h);
                        }
                        ag = aktp.ag(null);
                        h = ag.h(new itk(imjVar, i9), ((imk) obj6).f);
                        e.b(h);
                    }
                    e.close();
                    return h;
                } finally {
                }
            case 14:
                Object obj7 = this.a;
                ixr ixrVar = (ixr) obj7;
                return ixrVar.c.l((Optional) obj, ixrVar.f, null).h(new itk(obj7, i7), ixrVar.b);
            case 15:
                tby tbyVar = (tby) this.a;
                return ((tsa) tbyVar.i.b()).b(((smr) obj).S()).h(new its(6), tbyVar.d);
            case 16:
                Object obj8 = this.a;
                return aktp.ai(akto.k(new haw(obj8, (smr) obj, i5)), ((tby) obj8).l);
            case 17:
                smr smrVar = (smr) obj;
                tby tbyVar2 = (tby) this.a;
                if (!((trz) tbyVar2.k.b()).j()) {
                    return aktp.ag(Optional.empty());
                }
                ParticipantsTable.BindData a2 = ((rxq) tbyVar2.s.b()).a(smrVar.K());
                if (a2 != null) {
                    qei qeiVar = (qei) ((msk) tbyVar2.j.b()).q(a2).e().orElseThrow();
                    ConversationIdType x = smrVar.x();
                    aozy createBuilder = uav.a.createBuilder();
                    String a3 = x.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    uav uavVar = (uav) apagVar;
                    a3.getClass();
                    uavVar.c = 2;
                    uavVar.d = a3;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    uav uavVar2 = (uav) createBuilder.b;
                    qeiVar.getClass();
                    uavVar2.f = qeiVar;
                    uavVar2.b |= 2;
                    return ((uaq) tbyVar2.b.b()).b((uav) createBuilder.s()).h(new its(i3), tbyVar2.d);
                }
                throw new IllegalStateException("The current self id must exist and it must reflect a participant.");
            case 18:
                alog alogVar = (alog) obj;
                alogVar.getClass();
                Object obj9 = this.a;
                klj kljVar = (klj) obj9;
                albo.T(kljVar.d.isPresent());
                return ((vhi) kljVar.d.get()).d().i(new ikd(obj9, alogVar, 9), kljVar.e);
            case 19:
                Object obj10 = this.a;
                ndk ndkVar = new ndk(obj10, (apku) obj, (char[]) null);
                e = aktp.e("Donator#donate");
                try {
                    akul i14 = aktp.ai(new gvk(ndkVar, 14), ((klj) obj10).f).i(new ici(obj10, 18), ((klj) obj10).e);
                    e.b(i14);
                    e.close();
                    return i14;
                } finally {
                }
            default:
                Object obj11 = this.a;
                kpa kpaVar = (kpa) obj11;
                Set f = ((xtj) kpaVar.j.b()).f(xtg.c);
                if (f.isEmpty()) {
                    alvw g = kpa.b.g();
                    g.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "bindAllIdentitiesForTachygramIfNeeded", 234, "TachyonBindApplicationStateManager.java")).q("No TG identities in CTC, skipping channel binding.");
                    return aktp.ag(null);
                }
                Stream map2 = Collection.EL.stream(f).filter(new ilu(i4)).map(new kza(obj11, i9));
                int i15 = alog.d;
                return aktp.am((alog) map2.collect(alls.a)).h(akto.k(new kli(i6)), kpaVar.h);
        }
    }
}
