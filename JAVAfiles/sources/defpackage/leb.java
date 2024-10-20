package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.time.MonthDay;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leb extends arpw implements arqv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(MonthDay monthDay, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = monthDay;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 2:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 17:
                ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 18:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((leb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v137, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v141, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = 1;
        int i2 = 17;
        switch (this.b) {
            case 0:
                aqil.P(obj);
                return Boolean.valueOf(((kkc) this.a).a());
            case 1:
                aqil.P(obj);
                ((nen) this.a).g.y(new ijk(16), "HomeScreenActiveComposersSupplier::Notify");
                return null;
            case 2:
                aqil.P(obj);
                Object obj2 = this.a;
                akrh e = aktp.e("fetchConversationList");
                try {
                    kyf kyfVar = (kyf) ((lex) obj2).n.b();
                    uye uyeVar = uye.HOME;
                    xyo d = kyf.a.d();
                    d.u("Fetching conversation list");
                    d.z("ConversationListDataSource", kyfVar.f);
                    d.x("instance", kyfVar.hashCode());
                    d.q();
                    synchronized (kyfVar.c) {
                        if (kyfVar.f == null) {
                            kyfVar.f = kyfVar.q.b(uyeVar, kyfVar.e);
                        }
                    }
                    kxx kxxVar = kyfVar.f;
                    kxxVar.getClass();
                    akrh e2 = aktp.e("ConversationListDataSources#getFirstLoadList");
                    try {
                        ((ahqr) kxxVar.n.b()).e(kyb.b);
                        kxxVar.t = true;
                        kxxVar.u = kxw.NOT_STARTED;
                        akrh e3 = aktp.e("ConversationListDataSources#getNudgeSettings");
                        try {
                            kxxVar.x = aktp.ag(yiy.a);
                            e3.close();
                            akul h = kxxVar.x.h(new itk(kxxVar, 11), kxxVar.g);
                            e2.b(h);
                            kxxVar.w = h;
                            e2.close();
                            armd.i(e, null);
                            return arnb.a;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(e, th);
                        throw th2;
                    }
                }
            case 3:
                aqil.P(obj);
                ((ksm) ((lll) this.a).b.b()).i(aabr.al(((lll) this.a).a));
                return arnb.a;
            case 4:
                aqil.P(obj);
                sjs a = sjv.a();
                a.w("getBirthdaysByDateQuery");
                a.c(new ldg(this.a, i2));
                return a.b();
            case 5:
                aqil.P(obj);
                tim a2 = tip.a();
                a2.w("RestoreWorkflowSettingsService#getAllActiveRestoreExecutions");
                a2.q();
                a2.c(new lcw(i2));
                alog t = a2.b().t();
                t.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
                alur it = t.iterator();
                while (it.hasNext()) {
                    tie tieVar = (tie) it.next();
                    tieVar.getClass();
                    arrayList.add(luz.o(tieVar));
                }
                return aqjn.ax(arrayList);
            case 6:
                aqil.P(obj);
                tim a3 = tip.a();
                a3.w("RestoreWorkflowSettingsService#getAllActiveRestoreExecutions");
                a3.q();
                a3.c(new lcw(18));
                alog t2 = a3.b().t();
                t2.getClass();
                ArrayList arrayList2 = new ArrayList(aqjn.J(t2, 10));
                alur it2 = t2.iterator();
                while (it2.hasNext()) {
                    tie tieVar2 = (tie) it2.next();
                    tieVar2.getClass();
                    arrayList2.add(luz.o(tieVar2));
                }
                return aqjn.ax(arrayList2);
            case 7:
                aqil.P(obj);
                tiv tivVar = new tiv(tiy.a);
                tivVar.c(new lcw(19));
                Object obj3 = this.a;
                tim a4 = tip.a();
                a4.c(new lut(obj3, 7));
                alog t3 = ((tiv) tivVar.j(agoh.b(a4.b(), (agmh) tip.d.i, (agmh) tiy.c.e))).b().t();
                t3.getClass();
                ArrayList arrayList3 = new ArrayList();
                alur it3 = t3.iterator();
                while (it3.hasNext()) {
                    lwq k = ((tiq) it3.next()).k();
                    if (k != null) {
                        arrayList3.add(k);
                    }
                }
                return aqjn.ax(arrayList3);
            case 8:
                aqil.P(obj);
                tiv tivVar2 = new tiv(tiy.a);
                tivVar2.c(new lcw(20));
                tim a5 = tip.a();
                a5.c(new lut(this.a, 8));
                return ((tiv) tivVar2.j(agoh.b(a5.b(), (agmh) tip.d.i, (agmh) tiy.c.e))).b().t();
            case 9:
                aqil.P(obj);
                tiv tivVar3 = new tiv(tiy.a);
                tivVar3.c(new lvo(i));
                tim a6 = tip.a();
                a6.c(new lut(this.a, 9));
                tiq tiqVar = (tiq) ((tis) ((tiv) tivVar3.j(agoh.b(a6.b(), (agmh) tip.d.i, (agmh) tiy.c.e))).b().n()).cO();
                if (tiqVar == null) {
                    return null;
                }
                return tiqVar.k();
            case 10:
                aqil.P(obj);
                return new Long(MessagesTable.d().b().i());
            case 11:
                aqil.P(obj);
                Instant ofEpochMilli = Instant.ofEpochMilli(MessagesTable.d().b().l(MessagesTable.c.i));
                ofEpochMilli.getClass();
                return aoue.k(ofEpochMilli);
            case 12:
                aqil.P(obj);
                return new Integer(((lxo) this.a).a.al());
            case 13:
                aqil.P(obj);
                if (((lxx) this.a).d() && ((yjy) ((lxx) this.a).e.b()).a() <= 0) {
                    ((alvg) lxx.a.g().h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl$addFakeSimIfNeeded$1", "invokeSuspend", 78, "RetailModeEntryPointImpl.kt")).q("Adding fake SIM for Retail Demo mode");
                    ((yjy) ((lxx) this.a).e.b()).s(2, "123456789123456789", 2, "Demo SIM", "Demo Carrier", ((msk) ((lxx) this.a).f.b()).c("555-35-35", new ezq(i2)), 132, lxx.b);
                    ((uhc) ((lxx) this.a).g.b()).b();
                    return arnb.a;
                }
                return arnb.a;
            case 14:
                aqil.P(obj);
                taz e4 = ParticipantsTable.e();
                e4.w("SelfParticipantsMetricsLogger#log");
                e4.q();
                e4.g(new mfk(3));
                alog t4 = e4.b().t();
                t4.getClass();
                return t4;
            case 15:
                aqil.P(obj);
                if (((Boolean) ((utz) mik.b.get()).e()).booleanValue()) {
                    mim mimVar = (mim) this.a;
                    if (!((Optional) mimVar.a.b()).isEmpty()) {
                        ((alwl) mimVar.c.g()).q("logging the cobalt app install metric");
                        mij mijVar = mimVar.b;
                        if (((Boolean) ((utz) mik.b.get()).e()).booleanValue()) {
                            if (mijVar.b.isPresent()) {
                                ((lpg) mijVar.b.get()).q(2L, mijVar.a());
                            }
                            if (mijVar.d.a()) {
                                mijVar.c.a(4, albo.cy(mijVar.a())).r(new mih(2));
                            }
                        }
                    }
                }
                return arnb.a;
            case 16:
                aqil.P(obj);
                ((moc) this.a).f.y(new mcw(13), "PenpalObservableSupplier::Notify");
                return null;
            case 17:
                aqil.P(obj);
                ((mpx) this.a).d.y(new mcw(14), "RbmConversationPropertiesObservableSupplier::Notify");
                return null;
            case 18:
                aqil.P(obj);
                return ((mvq) this.a).c();
            case 19:
                aqil.P(obj);
                nal nalVar = ((nad) this.a).e;
                synchronized (nalVar.b) {
                    mzj mzjVar = nalVar.d;
                    if (mzjVar == null) {
                        alvw g = nal.a.g();
                        g.X(alwp.a, "BugleMapi");
                        ((alvg) g.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 242, "OptimisticMessagePager.kt")).q("dropping optimistic mutation for in flight messages, cache was null.");
                    } else {
                        List list = nalVar.e;
                        Instant aB = lga.aB(mzjVar.c.a);
                        Iterator it4 = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                if (((miz) it4.next()).h().compareTo(aB) > 0) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 >= 0) {
                            list = alzz.aZ(list.subList(0, i3));
                        }
                        if (list.isEmpty()) {
                            alvw g2 = nal.a.g();
                            g2.X(alwp.a, "BugleMapi");
                            ((alvg) g2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 247, "OptimisticMessagePager.kt")).q("cache already includes all in flight messages.");
                        } else {
                            AtomicLong atomicLong = nalVar.c;
                            long j = mzjVar.b;
                            if (!atomicLong.compareAndSet(j, j + 1)) {
                                alvw g3 = nal.a.g();
                                g3.X(alwp.a, "BugleMapi");
                                ((alvg) g3.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 253, "OptimisticMessagePager.kt")).A("cache version is obsolete: cache: %d, current version: %d.", mzjVar.b, nalVar.c);
                            } else {
                                nae d2 = nalVar.d(mzjVar.c, list, mzjVar.a);
                                alvw g4 = nal.a.g();
                                g4.X(alwp.a, "BugleMapi");
                                ((alvg) g4.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 262, "OptimisticMessagePager.kt")).s("cache updated with in flight messages at version %d", mzjVar.b + 1);
                                nalVar.d = new mzj(mzjVar.a, mzjVar.b + 1, d2);
                                ((nad) this.a).f.c(false);
                            }
                        }
                    }
                }
                return arnb.a;
            default:
                aqil.P(obj);
                if (!((nen) this.a).f.A()) {
                    return Optional.empty();
                }
                alog t5 = nen.d(((nen) this.a).f.n()).t();
                t5.getClass();
                sdt sdtVar = (sdt) aqjn.Z(t5);
                if (sdtVar == null) {
                    return Optional.empty();
                }
                return Optional.of(new nel(sdtVar));
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.b) {
            case 0:
                return new leb((kkc) this.a, arpeVar, 0);
            case 1:
                return new leb((nen) this.a, arpeVar, 1, (byte[]) null);
            case 2:
                return new leb((lex) this.a, arpeVar, 2);
            case 3:
                return new leb((lll) this.a, arpeVar, 3);
            case 4:
                return new leb((MonthDay) this.a, arpeVar, 4);
            case 5:
                return new leb((luz) this.a, arpeVar, 5);
            case 6:
                return new leb((luz) this.a, arpeVar, 6, (byte[]) null);
            case 7:
                return new leb((UUID) this.a, arpeVar, 7);
            case 8:
                return new leb((UUID) this.a, arpeVar, 8, (byte[]) null);
            case 9:
                return new leb((UUID) this.a, arpeVar, 9, (char[]) null);
            case 10:
                return new leb((lxo) this.a, arpeVar, 10);
            case 11:
                return new leb((lxo) this.a, arpeVar, 11, (byte[]) null);
            case 12:
                return new leb((lxo) this.a, arpeVar, 12, (char[]) null);
            case 13:
                return new leb((lxx) this.a, arpeVar, 13);
            case 14:
                return new leb((mfq) this.a, arpeVar, 14);
            case 15:
                return new leb((mim) this.a, arpeVar, 15);
            case 16:
                return new leb((moc) this.a, arpeVar, 16);
            case 17:
                return new leb((mpx) this.a, arpeVar, 17);
            case 18:
                return new leb((mvq) this.a, arpeVar, 18);
            case 19:
                return new leb((nad) this.a, arpeVar, 19);
            default:
                return new leb((nen) this.a, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(UUID uuid, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(UUID uuid, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(UUID uuid, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(kkc kkcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = kkcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lex lexVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = lexVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lll lllVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = lllVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(luz luzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = luzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(luz luzVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = luzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lxo lxoVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = lxoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lxo lxoVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = lxoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lxo lxoVar, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = lxoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(lxx lxxVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = lxxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(mfq mfqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = mfqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(mim mimVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = mimVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(moc mocVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = mocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(mpx mpxVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = mpxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(mvq mvqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = mvqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(nad nadVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = nadVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(nen nenVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.b = i;
        this.a = nenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(nen nenVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.b = i;
        this.a = nenVar;
    }
}
