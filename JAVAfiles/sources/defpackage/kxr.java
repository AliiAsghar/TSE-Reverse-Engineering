package defpackage;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kxr implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kxr(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        List g;
        Object obj2;
        List g2;
        mhn mhnVar;
        NetworkStats networkStats;
        NetworkStats querySummary;
        Optional empty;
        amwx amwxVar;
        qey qeyVar;
        qez qezVar;
        int i = 16;
        int i2 = 4;
        int i3 = 3;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                yiy yiyVar = (yiy) obj;
                Object obj3 = this.a;
                kxu kxuVar = (kxu) obj3;
                kxuVar.f.m();
                try {
                    boolean a = ((pcj) ((kxu) obj3).f.o.b()).a();
                    Object obj4 = this.b;
                    if (a) {
                        kxx kxxVar = ((kxu) obj3).f;
                        lbt lbtVar = kxxVar.m;
                        uye uyeVar = kxxVar.k;
                        SuperSortLabel superSortLabel = (SuperSortLabel) kxxVar.l.get();
                        lcp a2 = lcq.a();
                        a2.g(kxx.j((kxk) ((atal) obj4).b));
                        a2.b(((kxk) ((atal) obj4).b).a);
                        a2.c(((kxk) ((atal) obj4).b).c);
                        a2.e(((atal) obj4).a);
                        a2.f(yiyVar);
                        lcq a3 = a2.a();
                        agmc agmcVar = ((kxu) obj3).e;
                        Map map = ((kxu) obj3).f.y;
                        CancellationSignal cancellationSignal = ((kxu) obj3).c;
                        lbt.e("queryNextPage", uyeVar, superSortLabel, false);
                        g = lbtVar.f(lbtVar.a(lbtVar.b(uyeVar, superSortLabel).b(a3, lbtVar.b), agmcVar, cancellationSignal), map, superSortLabel, cancellationSignal);
                    } else {
                        kxx kxxVar2 = ((kxu) obj3).f;
                        lbt lbtVar2 = kxxVar2.m;
                        uye uyeVar2 = kxxVar2.k;
                        SuperSortLabel superSortLabel2 = (SuperSortLabel) kxxVar2.l.get();
                        lcp a4 = lcq.a();
                        a4.g(kxx.j((kxk) ((atal) obj4).b));
                        a4.b(((kxk) ((atal) obj4).b).a);
                        a4.c(((kxk) ((atal) obj4).b).c);
                        a4.e(((atal) obj4).a);
                        a4.f(yiyVar);
                        lcq a5 = a4.a();
                        agmc agmcVar2 = ((kxu) obj3).d;
                        Map map2 = ((kxu) obj3).f.y;
                        CancellationSignal cancellationSignal2 = ((kxu) obj3).c;
                        lbt.e("queryNextPage", uyeVar2, superSortLabel2, false);
                        g = lbtVar2.g(lbtVar2.c(lbtVar2.d(uyeVar2, superSortLabel2).i(a5, lbtVar2.b), agmcVar2), map2, superSortLabel2, cancellationSignal2);
                    }
                    Object obj5 = this.c;
                    xyo d = kxx.a.d();
                    d.H("loadAfter");
                    atal atalVar = (atal) obj4;
                    d.z("key", ((kxk) atalVar.b).a);
                    d.x("load size", atalVar.a);
                    d.x("returned list size", g.size());
                    d.q();
                    kxuVar.f.u = kxw.FINISHED;
                    ((gam) obj5).a(g);
                    return null;
                } catch (agpd unused) {
                    xyo d2 = kxx.a.d();
                    d2.H("Inflight query was cancelled, due to invalidation.");
                    d2.q();
                    return null;
                }
            case 1:
                yiy yiyVar2 = (yiy) obj;
                Object obj6 = this.a;
                kxu kxuVar2 = (kxu) obj6;
                kxuVar2.f.m();
                try {
                    boolean a6 = ((pcj) ((kxu) obj6).f.o.b()).a();
                    Object obj7 = this.b;
                    if (a6) {
                        kxx kxxVar3 = ((kxu) obj6).f;
                        lbt lbtVar3 = kxxVar3.m;
                        uye uyeVar3 = kxxVar3.k;
                        SuperSortLabel superSortLabel3 = (SuperSortLabel) kxxVar3.l.get();
                        lcp a7 = lcq.a();
                        obj2 = obj7;
                        a7.g(kxx.j((kxk) ((atal) obj7).b));
                        a7.b(((kxk) ((atal) obj2).b).a);
                        a7.c(((kxk) ((atal) obj2).b).c);
                        a7.e(((atal) obj2).a);
                        a7.f(yiyVar2);
                        lcq a8 = a7.a();
                        agmc agmcVar3 = ((kxu) obj6).e;
                        Map map3 = ((kxu) obj6).f.y;
                        CancellationSignal cancellationSignal3 = ((kxu) obj6).c;
                        lbt.e("queryPrevPage", uyeVar3, superSortLabel3, false);
                        g2 = lbtVar3.f(lbtVar3.a(lbtVar3.b(uyeVar3, superSortLabel3).d(a8, lbtVar3.b), agmcVar3, cancellationSignal3), map3, superSortLabel3, cancellationSignal3);
                    } else {
                        obj2 = obj7;
                        kxx kxxVar4 = ((kxu) obj6).f;
                        lbt lbtVar4 = kxxVar4.m;
                        uye uyeVar4 = kxxVar4.k;
                        SuperSortLabel superSortLabel4 = (SuperSortLabel) kxxVar4.l.get();
                        lcp a9 = lcq.a();
                        a9.g(kxx.j((kxk) ((atal) obj2).b));
                        a9.b(((kxk) ((atal) obj2).b).a);
                        a9.c(((kxk) ((atal) obj2).b).c);
                        a9.e(((atal) obj2).a);
                        a9.f(yiyVar2);
                        lcq a10 = a9.a();
                        agmc agmcVar4 = ((kxu) obj6).d;
                        Map map4 = ((kxu) obj6).f.y;
                        CancellationSignal cancellationSignal4 = ((kxu) obj6).c;
                        lbt.e("queryPrevPage", uyeVar4, superSortLabel4, false);
                        g2 = lbtVar4.g(lbtVar4.c(lbtVar4.d(uyeVar4, superSortLabel4).k(a10, lbtVar4.b), agmcVar4), map4, superSortLabel4, cancellationSignal4);
                    }
                    Object obj8 = this.c;
                    xyo d3 = kxx.a.d();
                    d3.H("loadBefore");
                    atal atalVar2 = (atal) obj2;
                    d3.z("key", ((kxk) atalVar2.b).a);
                    d3.x("load size", atalVar2.a);
                    d3.x("returned list size", g2.size());
                    d3.q();
                    kxuVar2.f.u = kxw.FINISHED;
                    ((gam) obj8).a(g2);
                    return null;
                } catch (agpd unused2) {
                    xyo d4 = kxx.a.d();
                    d4.H("Inflight query was cancelled, due to invalidation.");
                    d4.q();
                    return null;
                }
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                ?? r0 = this.a;
                if (((Boolean) utw.C.e()).booleanValue()) {
                    r0.run();
                    return null;
                }
                qjb.a(new irs(r0, this.b, i), ((mat) this.c).d);
                return null;
            case 3:
                Object obj9 = this.b;
                final mfo mfoVar = (mfo) obj9;
                final long epochMilli = mfoVar.s.f().toEpochMilli();
                final long j = epochMilli - mho.a;
                Object obj10 = this.c;
                Object obj11 = this.a;
                if (obj10 != null) {
                    final mhn mhnVar2 = (mhn) obj11;
                    mhnVar2.d = 0L;
                    mhnVar2.c = 0L;
                    final NetworkStatsManager networkStatsManager = (NetworkStatsManager) obj10;
                    try {
                        ((mfo) obj9).k.n(new yjx() { // from class: mfm
                            @Override // defpackage.yjx
                            public final boolean a(int i4) {
                                Throwable e;
                                mfo mfoVar2 = mfo.this;
                                String A = mfoVar2.k.h(i4).A(mfoVar2.i);
                                long j2 = j;
                                NetworkStatsManager networkStatsManager2 = networkStatsManager;
                                long j3 = epochMilli;
                                mhn mhnVar3 = mhnVar2;
                                NetworkStats networkStats2 = null;
                                try {
                                    try {
                                        NetworkStats querySummary2 = networkStatsManager2.querySummary(0, A, j2, j3);
                                        if (querySummary2 != null) {
                                            try {
                                                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                                                while (querySummary2.getNextBucket(bucket)) {
                                                    mhnVar3.d += bucket.getRxBytes();
                                                    mhnVar3.c += bucket.getTxBytes();
                                                }
                                                xzv.b(querySummary2);
                                                return true;
                                            } catch (RemoteException e2) {
                                                e = e2;
                                                networkStats2 = querySummary2;
                                                xyo e3 = mfo.a.e();
                                                e3.H("failed to query network stats for");
                                                e3.H(A);
                                                e3.r(e);
                                                xzv.b(networkStats2);
                                                mhnVar3.d = -1L;
                                                mhnVar3.c = -1L;
                                                xyo e4 = mfo.a.e();
                                                e4.H("failed to query network stats for");
                                                e4.H(A);
                                                e4.q();
                                                return false;
                                            } catch (SecurityException e5) {
                                                e = e5;
                                                networkStats2 = querySummary2;
                                                xyo e32 = mfo.a.e();
                                                e32.H("failed to query network stats for");
                                                e32.H(A);
                                                e32.r(e);
                                                xzv.b(networkStats2);
                                                mhnVar3.d = -1L;
                                                mhnVar3.c = -1L;
                                                xyo e42 = mfo.a.e();
                                                e42.H("failed to query network stats for");
                                                e42.H(A);
                                                e42.q();
                                                return false;
                                            } catch (Throwable th) {
                                                th = th;
                                                networkStats2 = querySummary2;
                                                xzv.b(networkStats2);
                                                throw th;
                                            }
                                        }
                                    } catch (RemoteException | SecurityException e6) {
                                        e = e6;
                                    }
                                    xzv.b(networkStats2);
                                    mhnVar3.d = -1L;
                                    mhnVar3.c = -1L;
                                    xyo e422 = mfo.a.e();
                                    e422.H("failed to query network stats for");
                                    e422.H(A);
                                    e422.q();
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                    } catch (SecurityException e) {
                        mhnVar2.d = -1L;
                        mhnVar2.c = -1L;
                        mfo.a.n("fillTransferredMobileData: READ_PHONE_STATE required", e);
                    }
                    mhnVar2.f = 0L;
                    mhnVar2.e = 0L;
                    try {
                        try {
                            mhnVar = mhnVar2;
                        } catch (RemoteException | SecurityException e2) {
                            e = e2;
                            mhnVar = mhnVar2;
                        }
                        try {
                            querySummary = ((NetworkStatsManager) obj10).querySummary(1, null, j, epochMilli);
                            try {
                            } catch (RemoteException e3) {
                                e = e3;
                                networkStats = querySummary;
                                try {
                                    mfo.a.q("failed to query network stats: " + e.getLocalizedMessage());
                                    xzv.b(networkStats);
                                    mhnVar.f = -1L;
                                    mhnVar.e = -1L;
                                    return obj11;
                                } catch (Throwable th) {
                                    th = th;
                                    xzv.b(networkStats);
                                    throw th;
                                }
                            } catch (SecurityException e4) {
                                e = e4;
                                networkStats = querySummary;
                                mfo.a.q("failed to query network stats: " + e.getLocalizedMessage());
                                xzv.b(networkStats);
                                mhnVar.f = -1L;
                                mhnVar.e = -1L;
                                return obj11;
                            } catch (Throwable th2) {
                                th = th2;
                                networkStats = querySummary;
                                xzv.b(networkStats);
                                throw th;
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                            networkStats = null;
                            mfo.a.q("failed to query network stats: " + e.getLocalizedMessage());
                            xzv.b(networkStats);
                            mhnVar.f = -1L;
                            mhnVar.e = -1L;
                            return obj11;
                        } catch (SecurityException e6) {
                            e = e6;
                            networkStats = null;
                            mfo.a.q("failed to query network stats: " + e.getLocalizedMessage());
                            xzv.b(networkStats);
                            mhnVar.f = -1L;
                            mhnVar.e = -1L;
                            return obj11;
                        }
                        if (querySummary != null) {
                            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                            while (querySummary.getNextBucket(bucket)) {
                                ((mhn) obj11).f += bucket.getRxBytes();
                                ((mhn) obj11).e += bucket.getTxBytes();
                            }
                            xzv.b(querySummary);
                        } else {
                            mfo.a.q("failed to query network stats for wifi");
                            xzv.b(null);
                            mhnVar.f = -1L;
                            mhnVar.e = -1L;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        networkStats = null;
                    }
                }
                return obj11;
            case 4:
                Object obj12 = this.c;
                ahqp ahqpVar = ahqp.SUCCESS;
                ((ahqr) ((lqn) obj12).a).f((ahqq) this.a, (ahka) this.b, null, ahqpVar);
                return obj;
            case 5:
                amfr bi = mic.bi((amfh) ((aozy) this.a).s());
                xyo c = mic.k.c();
                c.z("ConversationDeleted Conversation Origin", this.b);
                c.q();
                ((mic) this.c).x.j((amfq) bi.toBuilder());
                return null;
            case 6:
                amfr bi2 = mic.bi((amfh) ((aozy) this.a).s());
                xyo c2 = mic.k.c();
                c2.z("ConversationArchived Conversation Origin", this.b);
                c2.q();
                ((mic) this.c).x.j((amfq) bi2.toBuilder());
                return null;
            case 7:
                amfr bi3 = mic.bi((amfh) ((aozy) this.a).s());
                xyo c3 = mic.k.c();
                c3.z("ConversationClicked Conversation Origin", this.b);
                c3.q();
                ((mic) this.c).x.j((amfq) bi3.toBuilder());
                return null;
            case 8:
                aozy aozyVar = (aozy) obj;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj13 = this.b;
                Object obj14 = this.a;
                amiq amiqVar = (amiq) aozyVar.b;
                amiq amiqVar2 = amiq.a;
                obj13.getClass();
                amiqVar.p = (ameq) obj13;
                amiqVar.b |= 32768;
                amiq amiqVar3 = (amiq) aozyVar.s();
                aozy aozyVar2 = (aozy) obj14;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                Object obj15 = this.c;
                amfq amfqVar = (amfq) obj14;
                amfr amfrVar = (amfr) amfqVar.b;
                amfr amfrVar2 = amfr.a;
                amiqVar3.getClass();
                amfrVar.p = amiqVar3;
                amfrVar.b |= 256;
                ((mic) obj15).x.j(amfqVar);
                return null;
            case 9:
                aozy aozyVar3 = (aozy) obj;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                Object obj16 = this.a;
                Object obj17 = this.b;
                amiq amiqVar4 = (amiq) aozyVar3.b;
                amiq amiqVar5 = amiq.a;
                obj16.getClass();
                amiqVar4.z = (amje) obj16;
                amiqVar4.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                amiq amiqVar6 = (amiq) aozyVar3.s();
                aozy aozyVar4 = (aozy) obj17;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                Object obj18 = this.c;
                amfq amfqVar2 = (amfq) obj17;
                amfr amfrVar3 = (amfr) amfqVar2.b;
                amfr amfrVar4 = amfr.a;
                amiqVar6.getClass();
                amfrVar3.p = amiqVar6;
                amfrVar3.b |= 256;
                ((mic) obj18).x.j(amfqVar2);
                return null;
            case 10:
                Object obj19 = this.c;
                mic micVar = (mic) obj19;
                amie amieVar = (amie) obj;
                long a11 = ((lzz) micVar.q.b()).a((ConversationIdType) this.b);
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amfh amfhVar = (amfh) aozyVar5.b;
                amfh amfhVar2 = amfh.a;
                amfhVar.b |= 65536;
                amfhVar.r = a11;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                amfh amfhVar3 = (amfh) aozyVar5.b;
                amieVar.getClass();
                amfhVar3.y = amieVar;
                amfhVar3.b |= 16777216;
                amfh amfhVar4 = (amfh) aozyVar5.s();
                amfq amfqVar3 = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_CONVERSATION_LATCH_STATUS_CHANGE;
                if (!amfqVar3.b.isMutable()) {
                    amfqVar3.u();
                }
                amfr amfrVar5 = (amfr) amfqVar3.b;
                amfrVar5.i = amfpVar.dg;
                amfrVar5.b |= 1;
                if (!amfqVar3.b.isMutable()) {
                    amfqVar3.u();
                }
                amfr amfrVar6 = (amfr) amfqVar3.b;
                amfhVar4.getClass();
                amfrVar6.l = amfhVar4;
                amfrVar6.b |= 8;
                aozy createBuilder = amje.a.createBuilder();
                int e7 = micVar.e();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amje amjeVar = (amje) createBuilder.b;
                amjeVar.b |= 1;
                amjeVar.c = e7;
                String d5 = ((mie) micVar.F.b()).d();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amje amjeVar2 = (amje) createBuilder.b;
                d5.getClass();
                amjeVar2.b |= 4;
                amjeVar2.e = d5;
                qiu.h(micVar.bf().h(new kxr(obj19, amfqVar3, (amje) createBuilder.s(), 9, (byte[]) null), andi.a));
                return null;
            case 11:
                Optional optional = (Optional) obj;
                boolean isEmpty = optional.isEmpty();
                ?? r3 = this.b;
                if (isEmpty) {
                    return new ncw(r3.B(), 6);
                }
                Object obj20 = this.c;
                int b = ((nfw) optional.get()).b();
                ncz nczVar = (ncz) obj20;
                int j2 = nczVar.k.j(r3, b);
                if (Objects.equals(((yaq) nczVar.c.a()).a(j2, b), yay.AVAILABLE)) {
                    empty = Optional.of(Integer.valueOf(j2));
                } else {
                    empty = Optional.empty();
                }
                if (empty.isEmpty()) {
                    return new ncw(r3.B(), 6);
                }
                Object obj21 = this.a;
                int b2 = ((nfw) optional.get()).b();
                qzz qzzVar = nczVar.i;
                MessageIdType B = r3.B();
                xnv xnvVar = (xnv) qzzVar.b.b();
                xnvVar.getClass();
                mho mhoVar = (mho) qzzVar.c.b();
                mhoVar.getClass();
                mbl mblVar = (mbl) qzzVar.d.b();
                mblVar.getClass();
                yxx yxxVar = (yxx) qzzVar.e.b();
                yxxVar.getClass();
                vqu vquVar = (vqu) qzzVar.f.b();
                vquVar.getClass();
                agnq agnqVar = (agnq) qzzVar.g.b();
                agnqVar.getClass();
                uie uieVar = (uie) qzzVar.h.b();
                uieVar.getClass();
                B.getClass();
                obj21.getClass();
                amfd amfdVar = (amfd) obj21;
                new InitiateClientSideFallbackAction(qzzVar.a, xnvVar, mhoVar, mblVar, yxxVar, vquVar, agnqVar, uieVar, B, b2, amfdVar).w(0L);
                if (true == lga.ar(amfdVar)) {
                    i3 = 2;
                }
                ((mho) nczVar.f.b()).aO(r3, ((Integer) empty.get()).intValue(), amxo.UNKNOWN_RCS_TYPE, b2, i3);
                return new ncw(r3.B(), i3);
            case 12:
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                Object obj22 = this.c;
                Object obj23 = this.a;
                Object obj24 = this.b;
                if (contactsServiceResult == null) {
                    ((pur) obj24).g((String) obj23, (dtq) obj22, new psx("[Dual Registration] ContactServiceResult is null"));
                } else if (!contactsServiceResult.succeeded()) {
                    ((pur) obj24).g((String) obj23, (dtq) obj22, new psx("[Dual Registration] ContactServiceResult failed: " + ahby.codeToString(contactsServiceResult.getCode()) + "," + contactsServiceResult.getDescription()));
                }
                return null;
            case 13:
                Object obj25 = this.c;
                Object obj26 = this.a;
                pyg pygVar = (pyg) obj;
                try {
                    ((FileOutputStream) this.b).close();
                    ((pye) obj25).c.remove(obj26);
                    alwl alwlVar = (alwl) pye.a.g();
                    alwlVar.X(xod.a, obj26);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "cleanup", 312, "CronetFileDownloader.java")).q("HTTP request cleaned up");
                    return pygVar;
                } catch (IOException e8) {
                    pwq a12 = pwr.a();
                    a12.f(xoc.FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED);
                    a12.c(e8);
                    return new pxy(a12.a());
                }
            case 14:
                qeo qeoVar = (qeo) obj;
                qeg qegVar = qeoVar.c;
                if (qegVar == null) {
                    qegVar = qeg.a;
                }
                qef b3 = qef.b(qegVar.c);
                if (b3 == null) {
                    b3 = qef.UNKNOWN_STATUS;
                }
                if (!b3.equals(qef.OK) && !b3.equals(qef.PENDING)) {
                    Object obj27 = this.b;
                    qxr qxrVar = (qxr) ((qbq) this.c).h.b();
                    qeg qegVar2 = qeoVar.c;
                    if (qegVar2 == null) {
                        qegVar2 = qeg.a;
                    }
                    qxrVar.f(((qbs) obj27).f, qegVar2, (qgr) this.a);
                }
                int ordinal = b3.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                ((alwl) ((alwl) qbq.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 222, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed permanently.");
                                return upm.d();
                            }
                            throw new IllegalStateException("Unrecognized ChatApiResult.Status");
                        }
                        ((alwl) ((alwl) qbq.a.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 219, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group failed transiently.");
                        return upm.e();
                    }
                    return upm.b();
                }
                ((alwl) ((alwl) qbq.a.h()).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/ErrorStateGroupMetadataProcessor", "handleCreateGroupChatResponse", 225, "ErrorStateGroupMetadataProcessor.java")).q("Re-create RCS group operation returned UNKNOWN_STATUS.");
                return upm.d();
            case 15:
                if (((IllegalArgumentException) obj) instanceof psr) {
                    amwxVar = amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT;
                } else {
                    amwxVar = amwx.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS;
                }
                ((qxr) ((qbq) this.c).h.b()).g(((qbs) this.b).f, amwxVar, (qgr) this.a);
                return upm.d();
            case 16:
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                Object obj28 = this.c;
                if (conversationIdType == null) {
                    return null;
                }
                alor alorVar = (alor) Collection.EL.stream(this.a).collect(alls.a(new qbb(i), new qbb(17)));
                akrh e9 = aktp.e("IncomingRcsGroupNotificationConversationGetter#updateParticipantRcsGroupJoinStateForConversation_dsdrGroupsFlag");
                try {
                    if (((okf) ((qcb) obj28).k.b()).a()) {
                        alur it = ((rtz) ((qcb) obj28).h.b()).x(conversationIdType).iterator();
                        while (it.hasNext()) {
                            sbo sboVar = (sbo) it.next();
                            qfe qfeVar = (qfe) alorVar.get(sboVar.g());
                            if (qfeVar != null && !qfeVar.equals(sboVar.f())) {
                                rtz rtzVar = (rtz) ((qcb) obj28).h.b();
                                sboVar.ao(1, "participant_id");
                                rtzVar.aj(conversationIdType, Long.toString(sboVar.a), new rux(qfeVar));
                            }
                        }
                    } else {
                        alur it2 = ((rtz) ((qcb) obj28).h.b()).w(conversationIdType).iterator();
                        while (it2.hasNext()) {
                            sbj sbjVar = (sbj) it2.next();
                            sbjVar.ao(i2, "normalized_destination");
                            qfe qfeVar2 = (qfe) alorVar.get(sbjVar.c);
                            if (qfeVar2 != null) {
                                sbjVar.ao(2, "rcs_group_join_status");
                                if (!qfeVar2.equals(sbjVar.b)) {
                                    rtz rtzVar2 = (rtz) ((qcb) obj28).h.b();
                                    sbjVar.ao(1, "participant_id");
                                    rtzVar2.aj(conversationIdType, Long.toString(sbjVar.a), new rux(qfeVar2));
                                    i2 = 4;
                                }
                            }
                        }
                    }
                    e9.close();
                    return (qbs) sni.h(conversationIdType, new mut(obj28, this.b, 14, bArr));
                } finally {
                }
            case 17:
                qeg qegVar3 = (qeg) obj;
                if (((Boolean) ((utz) vzh.c.get()).e()).booleanValue()) {
                    Object obj29 = this.b;
                    Object obj30 = this.c;
                    amgu amguVar = ((qgg) obj29).h;
                    if (amguVar == null) {
                        amguVar = amgu.a;
                    }
                    ((qco) obj30).c.e((qgr) this.a, rve.a(amguVar.H));
                }
                return qegVar3;
            case 18:
                upm upmVar = (upm) obj;
                qfq qfqVar = (qfq) this.a;
                int i4 = qfqVar.b;
                int k = qkq.k(i4);
                Object obj31 = this.b;
                Object obj32 = this.c;
                if (k == 2) {
                    vth vthVar = (vth) ((qcu) obj31).m.b();
                    if (qfqVar.b == 2) {
                        qezVar = (qez) qfqVar.c;
                    } else {
                        qezVar = qez.b;
                    }
                    vthVar.b(qezVar, (qbs) obj32, aplo.GROUP_FULL_STATE_UPDATE_NOTIFICATION);
                } else if (qkq.k(i4) == 1) {
                    vth vthVar2 = (vth) ((qcu) obj31).m.b();
                    if (qfqVar.b == 1) {
                        qeyVar = (qey) qfqVar.c;
                    } else {
                        qeyVar = qey.c;
                    }
                    qeyVar.getClass();
                    ConversationIdType conversationIdType2 = ((qbs) obj32).a;
                    if (conversationIdType2.b()) {
                        ((alwl) vth.a.i()).q("Propagating invalid groupConversationId. Impossible to log participant count.");
                    } else {
                        qjh.l(vthVar2.g, null, new vtf(vthVar2, qeyVar, conversationIdType2, null), 3);
                    }
                }
                return upmVar;
            case 19:
                pwh pwhVar = (pwh) obj;
                nej nejVar = (nej) ((qdc) this.c).f.b();
                qgr qgrVar = ((qfo) this.b).m;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                nejVar.d(qgrVar, (rve) this.a, 22, 9, 6);
                return pwhVar;
            default:
                qgr qgrVar2 = ((qgj) this.b).g;
                if (qgrVar2 == null) {
                    qgrVar2 = qgr.a;
                }
                ((nej) ((qdi) this.c).f.b()).c(qgrVar2, (rve) this.a);
                return pwh.SUCCESS;
        }
    }

    public /* synthetic */ kxr(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ kxr(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ kxr(kxu kxuVar, atal atalVar, gam gamVar, int i) {
        this.d = i;
        this.a = kxuVar;
        this.b = atalVar;
        this.c = gamVar;
    }

    public /* synthetic */ kxr(mfo mfoVar, NetworkStatsManager networkStatsManager, mhn mhnVar, int i) {
        this.d = i;
        this.b = mfoVar;
        this.c = networkStatsManager;
        this.a = mhnVar;
    }
}
