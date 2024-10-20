package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndj {
    public final List a;
    public final Boolean b;
    public final boolean c;
    public final agmc d;
    public final tay e;
    public final tay f;
    public final agmc g;
    public final agmc h;
    public final skz i;
    public final sml j;
    private final agnq k;
    private final armf l;
    private final armf m;

    public ndj(agnq agnqVar, @oqd armf armfVar, armf armfVar2, armf armfVar3, hgi hgiVar) {
        agmc neaVar;
        agnqVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.k = agnqVar;
        this.l = armfVar;
        this.m = armfVar2;
        this.a = new ArrayList();
        Boolean bool = (Boolean) armfVar.b();
        this.b = bool;
        boolean a = ((okf) armfVar3.b()).a();
        this.c = a;
        ifp ifpVar = new ifp(this, 12, (float[][]) null);
        boolean a2 = ((oye) armfVar2.b()).a();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        ((AtomicBoolean) hgiVar.a).set(a);
        if (booleanValue) {
            neaVar = new neb(ifpVar, a, a2);
        } else {
            neaVar = new nea(ifpVar, a, a2);
        }
        this.d = neaVar;
        taz e = ParticipantsTable.e();
        e.w("ParticipantChangeObserver#query1");
        this.e = e.b();
        taz e2 = ParticipantsTable.e();
        tdi b = ProfilesTable.a().b();
        Object obj = ProfilesTable.c.b;
        tas tasVar = ParticipantsTable.c.a;
        tdm tdmVar = new tdm();
        tdmVar.U(new agmg("profiles_table.participant_id", 6));
        agog q = b.q((agmh) obj, tasVar, new tdl(tdmVar));
        q.f = "profiles_table_join_tag";
        e2.D(q.a());
        e2.w("ParticipantChangeObserver#query2");
        this.f = e2.b();
        this.g = new ndv(new ifp(this, 10, (float[][]) null));
        this.h = new ndx(new ifp(this, 11, (float[][]) null));
        sla a3 = sld.a();
        a3.w("ParticipantChangeObserver#query2");
        this.i = a3.b();
        smm smmVar = new smm(smp.a);
        smmVar.w("ParticipantChangeObserver#query2");
        this.j = smmVar.b();
    }

    public final alog a() {
        alog aZ;
        synchronized (this.a) {
            aZ = alzz.aZ(this.a);
        }
        return aZ;
    }

    public final void b(Set set, boolean z) {
        this.k.h(new mla(7), String.valueOf(set.hashCode()), new ldv(set, this, z, 3));
    }

    public final void c() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            Boolean bool = this.b;
            bool.getClass();
            if (bool.booleanValue()) {
                this.f.G(this.d);
            } else {
                this.e.G(this.d);
            }
            if (this.c) {
                this.j.G(this.h);
            } else {
                this.i.G(this.g);
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return;
            }
            Boolean bool = this.b;
            bool.getClass();
            if (bool.booleanValue()) {
                this.f.E(this.d);
            } else {
                this.e.E(this.d);
            }
            akrh e = aktp.e("ParticipantObservableSupplier#onStop_dsdrGroupsFlag");
            try {
                if (this.c) {
                    this.j.E(this.h);
                } else {
                    this.i.E(this.g);
                }
                armd.i(e, null);
                Iterator<E> it = a().iterator();
                while (it.hasNext()) {
                    ((ndk) it.next()).a();
                }
            } finally {
            }
        }
    }
}
