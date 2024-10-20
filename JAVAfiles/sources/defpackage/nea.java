package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;

/* compiled from: PG */
@armg
/* loaded from: classes3.dex */
public final class nea extends agmc {
    public static final /* synthetic */ int a = 0;
    private final arqv b;
    private final boolean c;
    private final boolean f;

    public nea(arqv arqvVar, boolean z, boolean z2) {
        this.b = arqvVar;
        this.c = z;
        this.f = z2;
    }

    @Override // defpackage.agmc
    public final /* bridge */ /* synthetic */ Object d(agoz agozVar, aglo agloVar) {
        ndy ndyVar = new ndy(null);
        agpr r = agloVar.r();
        int i = 1;
        if (r != null) {
            if (this.f) {
                boolean z = this.c;
                taz e = ParticipantsTable.e();
                e.w("StatelessParticipantChangeQueryListener#preChangeInTransaction#1");
                e.q();
                e.d(new ncy(17));
                lga.aj(e, (tba) r);
                lga.al(e, this.c);
                e.t(ParticipantsTable.c.a);
                e.u(10);
                lga.ai(ndyVar, z, e);
            } else {
                boolean z2 = this.c;
                taz e2 = ParticipantsTable.e();
                e2.w("StatelessParticipantChangeQueryListener#preChangeInTransaction#1");
                e2.d(new ncy(19));
                lga.aj(e2, (tba) r);
                lga.al(e2, this.c);
                e2.u(10);
                lga.ah(ndyVar, z2, e2);
            }
        }
        agpw s = agloVar.s();
        if (s != null) {
            if (this.f) {
                boolean z3 = this.c;
                taz e3 = ParticipantsTable.e();
                e3.w("StatelessParticipantChangeQueryListener#preChangeInTransaction#2");
                e3.q();
                e3.d(new ncy(20));
                e3.k((tbc) s);
                lga.al(e3, this.c);
                e3.t(ParticipantsTable.c.a);
                e3.u(10);
                lga.ai(ndyVar, z3, e3);
            } else {
                boolean z4 = this.c;
                taz e4 = ParticipantsTable.e();
                e4.w("StatelessParticipantChangeQueryListener#preChangeInTransaction#2");
                e4.d(new ndz(i));
                e4.k((tbc) s);
                lga.al(e4, this.c);
                e4.u(10);
                lga.ah(ndyVar, z4, e4);
            }
        }
        return ndyVar;
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void e(agoz agozVar, aglo agloVar, Object obj) {
        akrh e;
        obj.getClass();
        ndy ndyVar = (ndy) obj;
        aglz p = agloVar.p();
        int i = 0;
        if (p != null) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) p;
            if (bindData.p() > -2) {
                ndyVar.b.set(true);
            } else if (bindData.M() != null) {
                e = aktp.e("StatelessParticipantChangeQueryListener::onChangeInTransactionWithObject_insertTrigger_dsdrGroupsFlag");
                try {
                    if (this.c) {
                        smm smmVar = new smm(smp.a);
                        smmVar.w("StatelessParticipantChangeQueryListener#onChangeInTransaction");
                        smmVar.d(new ndz(i));
                        smmVar.e(new ndf(bindData, 13));
                        smmVar.u(10);
                        lga.ac(ndyVar, smmVar.b(), this.f);
                    } else {
                        sla a2 = sld.a();
                        a2.w("StatelessParticipantChangeQueryListener#onChangeInTransaction");
                        a2.d(new ndz(2));
                        a2.f(new ndf(bindData, 14));
                        a2.u(10);
                        lga.ab(ndyVar, a2.b(), this.f);
                    }
                    armd.i(e, null);
                } finally {
                }
            }
        }
        aglz[] t = agloVar.t();
        if (t != null) {
            ArrayList<aglz> arrayList = new ArrayList();
            while (i < t.length) {
                aglz aglzVar = t[i];
                aglzVar.getClass();
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) aglzVar;
                if (bindData2.p() <= -2 && bindData2.M() != null) {
                    arrayList.add(aglzVar);
                }
                i++;
            }
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            for (aglz aglzVar2 : arrayList) {
                aglzVar2.getClass();
                String M = ((ParticipantsTable.BindData) aglzVar2).M();
                M.getClass();
                arrayList2.add(Long.valueOf(Long.parseLong(M)));
            }
            if (!arrayList2.isEmpty()) {
                e = aktp.e("StatelessParticipantChangeQueryListener::onChangeInTransactionWithObject_bulkInsertTrigger_dsdrGroupsFlag");
                try {
                    if (this.c) {
                        smm smmVar2 = new smm(smp.a);
                        smmVar2.w("StatelessParticipantChangeQueryListener#onChangeInTransaction");
                        smmVar2.d(new ndz(3));
                        smmVar2.e(new ndf(arrayList2, 15));
                        smmVar2.u(10);
                        lga.ac(ndyVar, smmVar2.b(), this.f);
                    } else {
                        sla a3 = sld.a();
                        a3.w("StatelessParticipantChangeQueryListener#onChangeInTransaction");
                        a3.d(new ncy(18));
                        a3.f(new ndf(arrayList2, 12));
                        a3.u(10);
                        lga.ab(ndyVar, a3.b(), this.f);
                    }
                    armd.i(e, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (arrayList2.size() != t.length) {
                ndyVar.b.set(true);
            }
        }
        if (ndyVar.a.isEmpty() && !ndyVar.b.get()) {
            return;
        }
        this.b.a(alzz.bd(ndyVar.a), Boolean.valueOf(ndyVar.b.get()));
    }
}
