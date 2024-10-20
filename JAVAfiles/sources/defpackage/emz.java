package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emz extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(abnh abnhVar, idb idbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = abnhVar;
        this.a = idbVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((emz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        abnd abndVar;
        abnc abncVar;
        aozb w;
        boolean z = false;
        int i = 1;
        switch (this.c) {
            case 0:
                aqil.P(obj);
                ((env) this.a).i(this.b);
                return arnb.a;
            case 1:
                aqil.P(obj);
                ((env) this.a).e(this.b);
                return arnb.a;
            case 2:
                aqil.P(obj);
                hd hdVar = ((fzi) this.a).a;
                gcv gcvVar = (gcv) this.b;
                return nq.U(gcvVar.b, gcvVar.a, hdVar);
            case 3:
                aqil.P(obj);
                throw null;
            case 4:
                aqil.P(obj);
                if (((abqb) ((wfh) ((ibm) this.b).c.b()).a).h((Context) this.a, 224200000) == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                aqil.P(obj);
                long k = MessagesTable.d().b().k(MessagesTable.c.i);
                apct apctVar = ((abnh) this.b).c;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                if (apds.a(apctVar) > k) {
                    ((alwl) ((idb) this.a).i.g()).q("Message timestamp check passed");
                } else {
                    if (((abnh) this.b).d <= ((Number) ((idb) this.a).a.b()).longValue()) {
                        ((alwl) ((idb) this.a).i.g()).q("Message count check passed");
                    } else {
                        if (MessagesTable.d().b().i() == 0) {
                            ((alwl) ((idb) this.a).i.g()).q("No messages found on source device");
                            return false;
                        }
                        if (((abnh) this.b).d / r1 < ((Number) ((idb) this.a).b.b()).doubleValue()) {
                            ((alwl) ((idb) this.a).i.g()).q("Message count ratio check passed");
                        } else {
                            ((alwl) ((idb) this.a).i.g()).q("No heuristics passed");
                            return false;
                        }
                    }
                }
                return true;
            case 6:
                aqil.P(obj);
                abmp abmpVar = ((abmu) this.b).b;
                if (abmpVar == null) {
                    abmpVar = abmp.a;
                }
                if (abmpVar.c == 3) {
                    abndVar = (abnd) abmpVar.d;
                } else {
                    abndVar = abnd.a;
                }
                if (abndVar.c == 2) {
                    abncVar = (abnc) abndVar.d;
                } else {
                    abncVar = abnc.a;
                }
                return Boolean.valueOf(iql.f(new Long(abncVar.c)));
            case 7:
                aqil.P(obj);
                Object obj2 = this.b;
                aozy aozyVar = (aozy) obj2;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                abmx abmxVar = (abmx) aozyVar.b;
                abmx abmxVar2 = abmx.a;
                abmxVar.b |= 1;
                abmxVar.c = Long.MAX_VALUE;
                return obj2;
            case 8:
                aqil.P(obj);
                idg idgVar = (idg) ((idb) this.a).f.b();
                qjh.l(idgVar.b, null, new emz(idgVar, (UUID) this.b, (arpe) null, 9), 3);
                return arnb.a;
            case 9:
                aqil.P(obj);
                ido idoVar = (ido) ((idg) this.a).a.b();
                qjh.l(idoVar.c, null, new emz(idoVar, (UUID) this.b, (arpe) null, 10), 3);
                return arnb.a;
            case 10:
                aqil.P(obj);
                ((alvg) ido.a.g().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logStartEvent$1", "invokeSuspend", 48, "D2DEventLogger.kt")).q("Logging D2D start event to clearcut.");
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfqVar.getClass();
                alzz.n(amfp.D2D_BACKUP_AND_RESTORE_EVENT, amfqVar);
                aozy createBuilder = amut.a.createBuilder();
                createBuilder.getClass();
                akec.T(2, createBuilder);
                w = aozb.w(ByteBuffer.allocate(16).putLong(r3.getMostSignificantBits()).putLong(((UUID) this.b).getLeastSignificantBits()).array());
                akec.S(w, createBuilder);
                akec.R(ido.a(0, 0, 0), createBuilder);
                aozy createBuilder2 = amuw.a.createBuilder();
                createBuilder2.getClass();
                apag s = createBuilder2.s();
                s.getClass();
                amuw amuwVar = (amuw) s;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amut amutVar = (amut) createBuilder.b;
                amutVar.d = amuwVar;
                amutVar.c = 4;
                alzz.m(akec.Q(createBuilder), amfqVar);
                aozy builder = alzz.h(amfqVar).toBuilder();
                builder.getClass();
                mar a = ((mbb) ((ido) this.a).b.b()).a();
                a.e(amrs.D2D_BACKUP_AND_RESTORE_EVENT);
                a.b((amfq) builder, mbt.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
                return arnb.a;
            case 11:
                aqil.P(obj);
                szs a2 = szu.a();
                a2.w("+birthdaySuggestions");
                a2.c(new ivj(this.a, this.b, i));
                return a2.b().t();
            case 12:
                aqil.P(obj);
                Object obj3 = this.b;
                if (armq.d(obj3)) {
                    List<ParticipantsTable.BindData> list = (List) obj3;
                    ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                    for (ParticipantsTable.BindData bindData : list) {
                        Object obj4 = this.a;
                        uie uieVar = (uie) ((iji) obj4).b;
                        qya qyaVar = (qya) uieVar.a.b();
                        qyaVar.getClass();
                        msk mskVar = (msk) uieVar.b.b();
                        mskVar.getClass();
                        bindData.getClass();
                        arrayList.add(new rte(qyaVar, mskVar, bindData));
                    }
                    obj3 = arrayList;
                }
                return new armq(obj3);
            case 13:
                aqil.P(obj);
                if (((xxh) ((ifq) this.a).b).b(yyb.br(false, (String) this.b, true, false, null, 3, 2, 2)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                aqil.P(obj);
                this.b.getClass();
                return new hwr(null);
            case 15:
                aqil.P(obj);
                return ((ibs) this.a).b(((afsx) this.b).a());
            case 16:
                aqil.P(obj);
                return uhl.d(gh.c(((afsx) this.b).a()), ((ipj) this.a).a);
            case 17:
                aqil.P(obj);
                mci mciVar = ((iqa) this.a).b;
                ahlp aV = akec.aV(amoq.a.createBuilder());
                aozy createBuilder3 = amqj.a.createBuilder();
                createBuilder3.getClass();
                akec.X(amqh.CONTACT, createBuilder3);
                akec.Y(amqi.EXPANDED, createBuilder3);
                aV.F(akec.W(createBuilder3));
                aozy createBuilder4 = amos.a.createBuilder();
                createBuilder4.getClass();
                akec.V(2, createBuilder4);
                Object obj5 = this.b;
                obj5.getClass();
                aapn aapnVar = (aapn) obj5;
                int size = aapnVar.b.size();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                amos amosVar = (amos) createBuilder4.b;
                amosVar.b = 1 | amosVar.b;
                amosVar.c = size;
                int size2 = aapnVar.c.size();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                amos amosVar2 = (amos) createBuilder4.b;
                amosVar2.b = 2 | amosVar2.b;
                amosVar2.d = size2;
                aV.B(akec.U(createBuilder4));
                mciVar.f(aV.A(), -1);
                return arnb.a;
            case 18:
                aqil.P(obj);
                return ((iqa) this.a).f.a((aapn) this.b);
            case 19:
                aqil.P(obj);
                Object obj6 = this.a;
                iqd iqdVar = (iqd) this.b;
                return Boolean.valueOf(iqdVar.c.g(iqdVar.a, (Uri) obj6));
            default:
                aqil.P(obj);
                ((jgc) this.b).c.a(this.a);
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [enz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [enz, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new emz((env) this.a, (enz) this.b, arpeVar, 0);
            case 1:
                return new emz((env) this.a, (enz) this.b, arpeVar, 1, (byte[]) null);
            case 2:
                return new emz((gcv) this.b, (fzi) this.a, arpeVar, 2);
            case 3:
                return new emz((ghw) this.a, (String[]) this.b, arpeVar, 3);
            case 4:
                return new emz((ibm) this.b, (Context) this.a, arpeVar, 4);
            case 5:
                return new emz((abnh) this.b, (idb) this.a, arpeVar, 5);
            case 6:
                return new emz((idb) this.a, (abmu) this.b, arpeVar, 6);
            case 7:
                return new emz((aozy) this.b, (idb) this.a, arpeVar, 7);
            case 8:
                return new emz((idb) this.a, (UUID) this.b, arpeVar, 8);
            case 9:
                return new emz((idg) this.a, (UUID) this.b, arpeVar, 9);
            case 10:
                return new emz((ido) this.a, (UUID) this.b, arpeVar, 10);
            case 11:
                return new emz((sxx) this.a, (Instant) this.b, arpeVar, 11);
            case 12:
                return new emz(this.b, (iji) this.a, arpeVar, 12);
            case 13:
                return new emz((ifq) this.a, (String) this.b, arpeVar, 13);
            case 14:
                return new emz((iji) this.a, (alog) this.b, arpeVar, 14);
            case 15:
                return new emz((ibs) this.a, (afsx) this.b, arpeVar, 15);
            case 16:
                return new emz((afsx) this.b, (ipj) this.a, arpeVar, 16);
            case 17:
                return new emz((iqa) this.a, (aapn) this.b, arpeVar, 17);
            case 18:
                return new emz((iqa) this.a, (aapn) this.b, arpeVar, 18, (byte[]) null);
            case 19:
                return new emz((iqd) this.b, (Uri) this.a, arpeVar, 19);
            default:
                return new emz((jgc) this.b, (Context) this.a, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(afsx afsxVar, ipj ipjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = afsxVar;
        this.a = ipjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(aozy aozyVar, idb idbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = aozyVar;
        this.a = idbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(env envVar, enz enzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = envVar;
        this.b = enzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(env envVar, enz enzVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = envVar;
        this.b = enzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(gcv gcvVar, fzi fziVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = gcvVar;
        this.a = fziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(ghw ghwVar, String[] strArr, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = ghwVar;
        this.b = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(ibm ibmVar, Context context, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = ibmVar;
        this.a = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(ibs ibsVar, afsx afsxVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = ibsVar;
        this.b = afsxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(idb idbVar, abmu abmuVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = idbVar;
        this.b = abmuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(idb idbVar, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = idbVar;
        this.b = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(idg idgVar, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = idgVar;
        this.b = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(ido idoVar, UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = idoVar;
        this.b = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(ifq ifqVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = ifqVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(iji ijiVar, alog alogVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = ijiVar;
        this.b = alogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(iqa iqaVar, aapn aapnVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = iqaVar;
        this.b = aapnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(iqa iqaVar, aapn aapnVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = iqaVar;
        this.b = aapnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(iqd iqdVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = iqdVar;
        this.a = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(Object obj, iji ijiVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = obj;
        this.a = ijiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(jgc jgcVar, Context context, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = jgcVar;
        this.a = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz(sxx sxxVar, Instant instant, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = sxxVar;
        this.b = instant;
    }
}
