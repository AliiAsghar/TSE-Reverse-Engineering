package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.agpw;
import defpackage.aiut;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alog;
import defpackage.alsx;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.apwt;
import defpackage.armf;
import defpackage.atkn;
import defpackage.imi;
import defpackage.mmq;
import defpackage.mso;
import defpackage.prf;
import defpackage.qdl;
import defpackage.qjb;
import defpackage.qlf;
import defpackage.qpk;
import defpackage.qyv;
import defpackage.qyy;
import defpackage.qzl;
import defpackage.qzm;
import defpackage.rah;
import defpackage.riw;
import defpackage.srd;
import defpackage.srg;
import defpackage.srj;
import defpackage.srl;
import defpackage.srm;
import defpackage.to;
import defpackage.ukm;
import defpackage.ukn;
import defpackage.uko;
import defpackage.ukq;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GenericWorkerQueueAction extends ThrottledAction {
    public final Context i;
    public final armf j;
    public final armf k;
    public final anen l;
    public final apwt m;
    public final xnv n;
    public final alog o;
    private Collection p;
    private Collection q;
    public static final Object a = new Object();
    public static final Set b = new to();
    public static final Map c = new ArrayMap();
    public static final xze d = xze.g("BugleJobs", "GenericWorkerQueueAction");
    static final uuf e = uuh.q(144800135);
    static final uuf f = uuh.q(150235497);
    static final uuf g = uuh.o(153002503);
    static final uuf h = uuh.r(162272678, "enable_propagating_async_work_future");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new qyy(13);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzm Nl();
    }

    public GenericWorkerQueueAction(Context context, armf armfVar, armf armfVar2, uko ukoVar, anen anenVar, apwt apwtVar, xnv xnvVar) {
        super(amdy.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = anenVar;
        this.m = apwtVar;
        this.n = xnvVar;
        this.o = ukoVar.a();
        M();
    }

    private final void M() {
        this.p = new ArrayList();
        this.q = new ArrayList();
        alog alogVar = this.o;
        if (alogVar != null && !alogVar.isEmpty()) {
            alog alogVar2 = this.o;
            for (int i = 0; i < ((alsx) alogVar2).c; i++) {
                ukn uknVar = (ukn) alogVar2.get(i);
                if (uknVar instanceof ukm) {
                    this.q.add((ukm) uknVar);
                } else {
                    this.p.add(uknVar);
                }
            }
        }
    }

    public static void n(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!b.add(((srd) it.next()).o())) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("GenericWorkerQueueAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GenericWorkerQueueAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 302;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 50L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "GenericWorkerQueueAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final akul k() {
        ArrayList arrayList;
        agpw agpwVar;
        aiut.b();
        synchronized (a) {
            ((ukq) this.k.b()).b();
            ukq ukqVar = (ukq) this.k.b();
            int c2 = riw.c();
            xyl.h();
            arrayList = new ArrayList((List) ukqVar.c.c("WorkerDatabaseOperations#getNextGenericWorkerQueueBatch", new mso(ukqVar, c2, 4)));
            n(arrayList);
        }
        int i = 2;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            xyo c3 = d.c();
            c3.H("Work found");
            c3.q();
            if (((Boolean) h.e()).booleanValue()) {
                return aktp.aj(new imi(this, arrayList, 11), m()).h(new qyv(i), andi.a);
            }
            qjb.a(new rah(this, arrayList, i2), m());
        } else if (((Boolean) e.e()).booleanValue()) {
            if (((Boolean) f.e()).booleanValue()) {
                srl a2 = ((ukq) this.k.b()).a(riw.c());
                a2.e();
                agpwVar = new agpw(a2);
            } else {
                srl srlVar = new srl();
                srlVar.e();
                srlVar.d(false);
                srlVar.h(riw.c());
                agpwVar = new agpw(srlVar);
            }
            srj a3 = srm.a();
            a3.w("+scheduleFutureWorkItemsIfAny");
            a3.k(agpwVar);
            a3.d(new atkn(srm.d.h, (byte[]) null));
            a3.u(1);
            srg srgVar = (srg) a3.b().n();
            try {
                if (srgVar.moveToFirst()) {
                    srd srdVar = (srd) srgVar.cK();
                    srdVar.ao(8, "next_execute_timestamp");
                    long j = srdVar.i;
                    long epochMilli = (j - this.n.f().toEpochMilli()) + 10;
                    d.o(String.format(Locale.US, "Found next future work at timestamp %d, scheduling in %d", Long.valueOf(j), Long.valueOf(epochMilli)));
                    new GenericWorkerQueueAction(this.i, this.j, this.k, new qzl(this, 1), this.l, this.m, this.n).w(Math.max(epochMilli, 0L));
                } else {
                    xyo c4 = d.c();
                    c4.H("Bailing early, no work found, no failed work found");
                    c4.q();
                }
                srgVar.close();
            } finally {
            }
        }
        return aktp.ag(null);
    }

    public final akul l(List list) {
        aiut.b();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((srd) it.next()).o(), aktp.ag(true));
        }
        Iterator it2 = this.q.iterator();
        while (true) {
            Map map = null;
            if (!it2.hasNext()) {
                break;
            }
            ukm ukmVar = (ukm) it2.next();
            Set c2 = ukmVar.c();
            if (c2 != null && !c2.isEmpty()) {
                try {
                    map = ukmVar.d();
                } catch (Exception e2) {
                    d.r("Couldn't process batch.", e2);
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        hashMap.put(str, ((akul) hashMap.get(str)).i(new prf(entry, 14), andi.a).e(Exception.class, new qlf(str, 20), andi.a));
                    }
                } else {
                    Iterator it3 = c2.iterator();
                    while (it3.hasNext()) {
                        hashMap.put((String) it3.next(), aktp.ag(false));
                    }
                }
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            srd srdVar = (srd) it4.next();
            akul akulVar = (akul) hashMap.get(srdVar.o());
            xyo d2 = d.d();
            d2.H("Processing workitem for ");
            d2.H(srdVar.p());
            d2.H(" - ");
            d2.F(srdVar.k());
            d2.H(" in generic worker queue.");
            d2.q();
            Iterator it5 = this.p.iterator();
            while (it5.hasNext()) {
                akulVar = akulVar.i(new qdl((ukn) it5.next(), srdVar, 11, 0 == true ? 1 : 0), m());
            }
            int i = 18;
            hashMap.put(srdVar.o(), akulVar.e(Exception.class, new qlf(srdVar, i), andi.a).h(new mmq(this, srdVar, i), m()).e(Exception.class, new qlf(srdVar, 19), andi.a));
        }
        return aktp.ao(hashMap.values()).h(new qpk(this, list, 3), m());
    }

    public final Executor m() {
        if (((Boolean) g.e()).booleanValue()) {
            return (Executor) this.m.b();
        }
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public GenericWorkerQueueAction(Context context, armf armfVar, armf armfVar2, uko ukoVar, anen anenVar, apwt apwtVar, xnv xnvVar, Parcel parcel) {
        super(parcel, amdy.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = armfVar;
        this.k = armfVar2;
        this.l = anenVar;
        this.m = apwtVar;
        this.n = xnvVar;
        this.o = ukoVar.a();
        M();
    }
}
