package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alok;
import defpackage.alor;
import defpackage.alqa;
import defpackage.alqc;
import defpackage.also;
import defpackage.altc;
import defpackage.aluq;
import defpackage.amdy;
import defpackage.amfp;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.amvm;
import defpackage.amyh;
import defpackage.amyi;
import defpackage.aozy;
import defpackage.apag;
import defpackage.armf;
import defpackage.maq;
import defpackage.msh;
import defpackage.msn;
import defpackage.qpf;
import defpackage.rbs;
import defpackage.rfw;
import defpackage.rgd;
import defpackage.rgl;
import defpackage.rji;
import defpackage.rus;
import defpackage.sna;
import defpackage.snf;
import defpackage.sni;
import defpackage.tm;
import defpackage.utz;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.uzo;
import defpackage.vxm;
import defpackage.vxr;
import defpackage.wyt;
import defpackage.wzp;
import defpackage.xhl;
import defpackage.xhv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;
import defpackage.znj;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SyncTelephonyThreadsAction extends SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    public static final xze a = xze.g("BugleDataModel", "SyncTelephonyThreadsAction");
    static final uuf b = uuh.q(182829887);
    static final alhr c = uuh.x(179796087, "query_rcs_group_telephony_data_on_demand");
    private static final alqc e;
    public final armf d;
    private final armf f;
    private final armf g;
    private final wyt h;
    private final armf i;
    private final armf j;
    private final vxr k;
    private final armf l;
    private final armf m;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface SyncTelephonyThreadsActionInjector {
        rgl NZ();
    }

    static {
        alqa alqaVar = new alqa(also.a);
        alqaVar.h(1, amyh.BUCKET_ZERO);
        alqaVar.h(2, amyh.BUCKET_1_TO_2);
        alqaVar.h(4, amyh.BUCKET_2_TO_4);
        alqaVar.h(8, amyh.BUCKET_4_TO_8);
        alqaVar.h(16, amyh.BUCKET_8_TO_16);
        alqaVar.h(32, amyh.BUCKET_16_TO_32);
        alqaVar.h(64, amyh.BUCKET_32_TO_64);
        alqaVar.h(128, amyh.BUCKET_64_TO_128);
        alqaVar.h(256, amyh.BUCKET_128_TO_256);
        alqaVar.h(512, amyh.BUCKET_256_TO_512);
        alqaVar.h(1024, amyh.BUCKET_512_TO_1024);
        alqaVar.h(Integer.MAX_VALUE, amyh.BUCKET_1024_OR_MORE);
        e = alqaVar.b();
        CREATOR = new rfw(8);
    }

    public SyncTelephonyThreadsAction(armf<wzp> armfVar, armf<rus> armfVar2, armf<uzo> armfVar3, wyt wytVar, armf<xhl> armfVar4, armf<rji> armfVar5, vxr vxrVar, armf<maq> armfVar6, armf<znj> armfVar7) {
        super(amdy.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = vxrVar;
        this.l = armfVar6;
        this.m = armfVar7;
    }

    private static amyh l(int i) {
        aluq listIterator = e.c.listIterator();
        while (listIterator.hasNext()) {
            Integer num = (Integer) listIterator.next();
            if (i < num.intValue()) {
                return (amyh) e.get(num);
            }
        }
        return amyh.UNKNOWN;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SyncTelephonyThreadsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncTelephonyThreads.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        alor b2;
        boolean equals;
        Optional ofNullable;
        if (((xhl) this.i.b()).b()) {
            a.o("Not starting SyncTelephonyThreadsAction because reverse telephony sync is running.");
            return null;
        }
        if (((Boolean) qpf.a.e()).booleanValue()) {
            a.o("Not starting SyncTelephonyThreadsAction because BCM is used.");
            return null;
        }
        int i = 0;
        boolean z = this.u.z("force_full_sync", false);
        a.l("check and delete obsolete threads");
        aozy createBuilder = amyi.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyi amyiVar = (amyi) createBuilder.b;
        amyiVar.b |= 1;
        amyiVar.c = false;
        try {
            tm tmVar = new tm();
            snf e2 = sni.e();
            e2.w("getObsoleteThreads");
            e2.h(new rbs(19));
            e2.e(new rbs(20));
            sna snaVar = (sna) e2.b().n();
            try {
                if (((Boolean) ((utz) c.get()).e()).booleanValue()) {
                    b2 = altc.a;
                } else {
                    vxr vxrVar = this.k;
                    alok alokVar = new alok();
                    for (Map.Entry entry : vxrVar.b.K().entrySet()) {
                        vxm a2 = vxrVar.d.a(albo.ag(((msh) entry.getValue()).j(((Boolean) new msn(18).get()).booleanValue())));
                        if (a2 != null) {
                            alokVar.h((Long) entry.getKey(), a2);
                        }
                    }
                    b2 = alokVar.b();
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (snaVar.moveToNext()) {
                    if (snaVar.ao()) {
                        xyo c2 = a.c();
                        c2.H("Skipping conversation because it's awaiting reverse sync");
                        c2.b(snaVar.C());
                        c2.q();
                        apag apagVar = createBuilder.b;
                        int i5 = ((amyi) apagVar).g + 1;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        amyi amyiVar2 = (amyi) createBuilder.b;
                        amyiVar2.b |= 16;
                        amyiVar2.g = i5;
                    } else {
                        int c3 = snaVar.c();
                        if (c3 != 0) {
                            if (c3 != 1) {
                                if (c3 == 2) {
                                    i4++;
                                }
                            } else {
                                i3++;
                            }
                        } else {
                            i2++;
                        }
                        if (snaVar.c() == 2) {
                            if (snaVar.L().d()) {
                                xyo e3 = a.e();
                                e3.H("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found because thread was empty");
                                e3.b(snaVar.C());
                                e3.m(snaVar.L());
                                e3.q();
                            } else {
                                Optional.empty();
                                if (((Boolean) ((utz) c.get()).e()).booleanValue()) {
                                    ofNullable = this.k.a(snaVar.L()).a;
                                } else {
                                    ofNullable = Optional.ofNullable((vxm) b2.get(Long.valueOf(yyb.cE(snaVar.L()))));
                                }
                                if (ofNullable.isEmpty()) {
                                    xyo e4 = a.e();
                                    e4.H("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found");
                                    e4.b(snaVar.C());
                                    e4.m(snaVar.L());
                                    e4.q();
                                } else if (albo.ah(snaVar.ai())) {
                                    xyo e5 = a.e();
                                    e5.H("telephonyThreadMatchesForRcsGroups: local conversation data does not have a valid RCS group ID.");
                                    e5.b(snaVar.C());
                                    e5.m(snaVar.L());
                                    e5.z("remote rcs group id", ((vxm) ofNullable.get()).c);
                                    e5.q();
                                    equals = true;
                                } else {
                                    xyo a3 = a.a();
                                    a3.H("telephonyThreadMatchesForRcsGroups");
                                    a3.b(snaVar.C());
                                    a3.m(snaVar.L());
                                    a3.z("local rcs group id", snaVar.ai());
                                    a3.z("remote rcs group id", ((vxm) ofNullable.get()).c);
                                    a3.q();
                                    equals = ((vxm) ofNullable.get()).c.equals(snaVar.ai());
                                }
                            }
                            equals = false;
                        } else {
                            long g = this.h.g(((rus) this.f.b()).b(snaVar.C(), false));
                            xyo a4 = a.a();
                            a4.H("telephonyThreadMatches");
                            a4.b(snaVar.C());
                            a4.z("local thread id", snaVar.L());
                            a4.y("remote thread id", g);
                            a4.q();
                            equals = xhv.b(g).equals(snaVar.L());
                        }
                        if (!equals) {
                            xze xzeVar = a;
                            xyo e6 = xzeVar.e();
                            e6.H("Found a threadId mismatch");
                            e6.x("convType", snaVar.c());
                            e6.b(snaVar.C());
                            e6.m(snaVar.L());
                            e6.q();
                            int c4 = snaVar.c();
                            if (c4 != 0) {
                                if (c4 != 1) {
                                    if (c4 != 2) {
                                        xyo e7 = xzeVar.e();
                                        e7.H("Found unexpected conversation type.");
                                        e7.x("conversationType", snaVar.c());
                                        e7.q();
                                    } else {
                                        apag apagVar2 = createBuilder.b;
                                        int i6 = ((amyi) apagVar2).f + 1;
                                        if (!apagVar2.isMutable()) {
                                            createBuilder.u();
                                        }
                                        amyi amyiVar3 = (amyi) createBuilder.b;
                                        amyiVar3.b |= 8;
                                        amyiVar3.f = i6;
                                    }
                                } else {
                                    apag apagVar3 = createBuilder.b;
                                    int i7 = ((amyi) apagVar3).e + 1;
                                    if (!apagVar3.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amyi amyiVar4 = (amyi) createBuilder.b;
                                    amyiVar4.b |= 4;
                                    amyiVar4.e = i7;
                                }
                            } else {
                                apag apagVar4 = createBuilder.b;
                                int i8 = ((amyi) apagVar4).d + 1;
                                if (!apagVar4.isMutable()) {
                                    createBuilder.u();
                                }
                                amyi amyiVar5 = (amyi) createBuilder.b;
                                amyiVar5.b |= 2;
                                amyiVar5.d = i8;
                            }
                            tmVar.put(Long.valueOf(yyb.cE(snaVar.L())), snaVar.C());
                        }
                    }
                }
                if (((Boolean) b.e()).booleanValue()) {
                    if (((amyi) createBuilder.b).d > 0) {
                        amyh l = l(i2);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amyi amyiVar6 = (amyi) createBuilder.b;
                        amyiVar6.i = l.n;
                        amyiVar6.b |= 64;
                    }
                    if (((amyi) createBuilder.b).e > 0) {
                        amyh l2 = l(i3);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amyi amyiVar7 = (amyi) createBuilder.b;
                        amyiVar7.j = l2.n;
                        amyiVar7.b |= 128;
                    }
                    if (((amyi) createBuilder.b).f > 0) {
                        amyh l3 = l(i4);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amyi amyiVar8 = (amyi) createBuilder.b;
                        amyiVar8.k = l3.n;
                        amyiVar8.b |= 256;
                    }
                }
                snaVar.close();
                for (Long l4 : tmVar.keySet()) {
                    ConversationIdType conversationIdType = (ConversationIdType) tmVar.get(l4);
                    long longValue = l4.longValue();
                    if (((uzo) this.g.b()).c(conversationIdType, Long.MAX_VALUE).b) {
                        xyo c5 = a.c();
                        c5.H("Deleted local");
                        c5.b(conversationIdType);
                        c5.y("threadId", longValue);
                        c5.q();
                    } else {
                        xyo b3 = a.b();
                        b3.H("failed to delete local");
                        b3.b(conversationIdType);
                        b3.y("threadId", longValue);
                        b3.q();
                        i++;
                    }
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar5 = createBuilder.b;
                amyi amyiVar9 = (amyi) apagVar5;
                amyiVar9.b |= 32;
                amyiVar9.h = i;
                if (!apagVar5.isMutable()) {
                    createBuilder.u();
                }
                amyi amyiVar10 = (amyi) createBuilder.b;
                amyiVar10.b |= 1;
                amyiVar10.c = true;
                boolean isEmpty = tmVar.isEmpty();
                if (!isEmpty) {
                    ((rji) this.j.b()).g();
                }
                Optional empty = Optional.empty();
                if (!isEmpty) {
                    empty = Optional.of(amvm.SYNC_TELEPHONY_THREADS_FOUND_OBSOLETE_THREADS);
                } else if (z) {
                    empty = Optional.of(amvm.SYNC_TELEPHONY_THREADS_FORCE_FULL_SYNC);
                } else if (((znj) this.m.b()).S().isPresent()) {
                    empty = Optional.of(amvm.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
                }
                empty.ifPresent(new rgd(this, 6));
                return null;
            } finally {
            }
        } finally {
            h((amyi) createBuilder.s());
        }
    }

    public final void h(amyi amyiVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.SYNC_TELEPHONY_THREADS;
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
        amyiVar.getClass();
        amfrVar2.aB = amyiVar;
        amfrVar2.e |= 16384;
        ((maq) this.l.b()).j(amfqVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SyncTelephonyThreadsAction(armf<wzp> armfVar, armf<rus> armfVar2, armf<uzo> armfVar3, wyt wytVar, armf<xhl> armfVar4, armf<rji> armfVar5, vxr vxrVar, armf<maq> armfVar6, armf<znj> armfVar7, Parcel parcel) {
        super(parcel, amdy.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = vxrVar;
        this.l = armfVar6;
        this.m = armfVar7;
    }

    public SyncTelephonyThreadsAction(armf<wzp> armfVar, armf<rus> armfVar2, armf<uzo> armfVar3, wyt wytVar, armf<xhl> armfVar4, armf<rji> armfVar5, vxr vxrVar, armf<maq> armfVar6, armf<znj> armfVar7, boolean z) {
        super(amdy.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = wytVar;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = vxrVar;
        this.l = armfVar6;
        this.m = armfVar7;
        this.u.p("force_full_sync", z);
    }
}
