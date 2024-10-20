package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class neb extends agmc {
    public static final /* synthetic */ int a = 0;
    private final arqv b;
    private final boolean c;
    private final boolean f;

    public neb(arqv arqvVar, boolean z, boolean z2) {
        this.b = arqvVar;
        this.c = z;
        this.f = z2;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ Object d(agoz agozVar, aglo agloVar) {
        ndy ndyVar = new ndy(null);
        agpr r = agloVar.r();
        int i = 10;
        if (r != null) {
            if (r instanceof tba) {
                if (this.f) {
                    boolean z = this.c;
                    taz e = ParticipantsTable.e();
                    e.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                    e.q();
                    e.d(new ndz(14));
                    lga.aj(e, (tba) r);
                    lga.al(e, this.c);
                    e.t(ParticipantsTable.c.a);
                    e.u(10);
                    lga.ae(ndyVar, z, e);
                } else {
                    boolean z2 = this.c;
                    taz e2 = ParticipantsTable.e();
                    e2.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                    e2.d(new ndz(15));
                    lga.aj(e2, (tba) r);
                    lga.al(e2, this.c);
                    e2.u(10);
                    lga.ad(ndyVar, z2, e2);
                }
            }
            if (r instanceof tdk) {
                if (this.f) {
                    boolean z3 = this.c;
                    tdj a2 = ProfilesTable.a();
                    a2.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                    a2.c(new ndz(5));
                    lga.ak(a2, (tdk) r);
                    lga.am(a2, this.c);
                    a2.t((agmh) ProfilesTable.c.b);
                    a2.u(10);
                    lga.ag(ndyVar, z3, a2);
                } else {
                    boolean z4 = this.c;
                    tdj a3 = ProfilesTable.a();
                    a3.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                    a3.c(new ndz(6));
                    lga.ak(a3, (tdk) r);
                    lga.am(a3, this.c);
                    a3.u(10);
                    lga.af(ndyVar, z4, a3);
                }
            }
        }
        agpw s = agloVar.s();
        if (s != null) {
            if (s instanceof tbc) {
                if (this.f) {
                    boolean z5 = this.c;
                    taz e3 = ParticipantsTable.e();
                    e3.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                    e3.q();
                    e3.d(new ndz(7));
                    e3.k((tbc) s);
                    lga.al(e3, this.c);
                    e3.t(ParticipantsTable.c.a);
                    e3.u(10);
                    lga.ae(ndyVar, z5, e3);
                } else {
                    boolean z6 = this.c;
                    taz e4 = ParticipantsTable.e();
                    e4.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                    e4.d(new ndz(8));
                    e4.k((tbc) s);
                    lga.al(e4, this.c);
                    e4.u(10);
                    lga.ad(ndyVar, z6, e4);
                }
            }
            if (s instanceof tdl) {
                if (this.f) {
                    boolean z7 = this.c;
                    tdj a4 = ProfilesTable.a();
                    a4.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                    a4.c(new ndz(9));
                    a4.k((tdl) s);
                    lga.am(a4, this.c);
                    a4.t((agmh) ProfilesTable.c.b);
                    a4.u(10);
                    lga.ag(ndyVar, z7, a4);
                } else {
                    boolean z8 = this.c;
                    tdj a5 = ProfilesTable.a();
                    a5.w("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                    a5.c(new ndz(i));
                    a5.k((tdl) s);
                    lga.am(a5, this.c);
                    a5.u(10);
                    lga.af(ndyVar, z8, a5);
                }
            }
        }
        return ndyVar;
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void e(agoz agozVar, aglo agloVar, Object obj) {
        akrh e;
        ParticipantsTable.BindData a2;
        obj.getClass();
        ndy ndyVar = (ndy) obj;
        aglz p = agloVar.p();
        if (p != null) {
            if (p instanceof ParticipantsTable.BindData) {
                a2 = (ParticipantsTable.BindData) p;
            } else {
                a2 = ParticipantsTable.a(String.valueOf(((ProfilesTable.BindData) p).h()));
                a2.getClass();
            }
            if (a2.p() > -2) {
                ndyVar.b.set(true);
            } else if (a2.M() != null) {
                e = aktp.e("StatelessParticipantChangeQueryListenerV2::onChangeInTransactionWithObject_insertTrigger_dsdrGroupsFlag");
                try {
                    if (this.c) {
                        smm smmVar = new smm(smp.a);
                        smmVar.w("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                        smmVar.q();
                        smmVar.d(new ndz(4));
                        smmVar.e(new ndf(a2, 16));
                        smmVar.u(10);
                        lga.ac(ndyVar, smmVar.b(), this.f);
                    } else {
                        sla a3 = sld.a();
                        a3.w("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                        a3.d(new ndz(11));
                        a3.f(new ndf(a2, 17));
                        a3.u(10);
                        lga.ab(ndyVar, a3.b(), this.f);
                    }
                    armd.i(e, null);
                } finally {
                }
            }
        }
        aglz[] t = agloVar.t();
        if (t != null) {
            aqil.p(t);
            aron aronVar = new aron((byte[]) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : aronVar) {
                if (obj2 instanceof ParticipantsTable.BindData) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                if (bindData.p() <= -2 && bindData.M() != null) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(aqjn.J(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String M = ((ParticipantsTable.BindData) it.next()).M();
                M.getClass();
                arrayList3.add(Long.valueOf(Long.parseLong(M)));
            }
            aronVar.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : aronVar) {
                if (obj4 instanceof ProfilesTable.BindData) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(aqjn.J(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Long.valueOf(((ProfilesTable.BindData) it2.next()).h()));
            }
            aronVar.addAll(arrayList5);
            List x = aqjn.x(aronVar);
            if (!x.isEmpty()) {
                e = aktp.e("StatelessParticipantChangeQueryListenerV2::onChangeInTransactionWithObject_bulkInsertTrigger_dsdrGroupsFlag");
                try {
                    if (this.c) {
                        smm smmVar2 = new smm(smp.a);
                        smmVar2.w("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                        smmVar2.q();
                        smmVar2.d(new ndz(12));
                        smmVar2.e(new ndf(x, 18));
                        smmVar2.u(10);
                        lga.ac(ndyVar, smmVar2.b(), this.f);
                    } else {
                        sla a4 = sld.a();
                        a4.w("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                        a4.d(new ndz(13));
                        a4.f(new ndf(x, 19));
                        a4.u(10);
                        lga.ab(ndyVar, a4.b(), this.f);
                    }
                    armd.i(e, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (((aron) x).c != t.length) {
                ndyVar.b.set(true);
            }
        }
        if (ndyVar.a.isEmpty() && !ndyVar.b.get()) {
            return;
        }
        this.b.a(alzz.bd(ndyVar.a), Boolean.valueOf(ndyVar.b.get()));
    }
}
