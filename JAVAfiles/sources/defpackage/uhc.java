package defpackage;

import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhc {
    private static final xze b = xze.g("BugleDataModel", "ParticipantFullRefresh");
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl");
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final armf d;
    private final armf e;
    private final uhf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final Optional k;
    private final Optional l;
    private final osz m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;

    public uhc(armf armfVar, armf armfVar2, uhf uhfVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Optional optional, Optional optional2, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, osz oszVar, armf armfVar11, armf armfVar12, armf armfVar13) {
        this.d = armfVar;
        this.e = armfVar2;
        this.f = uhfVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = optional;
        this.l = optional2;
        this.n = armfVar7;
        this.o = armfVar8;
        this.p = armfVar9;
        this.q = armfVar10;
        this.m = oszVar;
        this.s = armfVar11;
        this.r = armfVar12;
        this.t = armfVar13;
    }

    private final void d() {
        ((uhg) this.d.b()).a();
        uhf uhfVar = this.f;
        uhfVar.b.set(false);
        uhfVar.d = null;
    }

    public final void a() {
        if (((Boolean) this.s.b()).booleanValue()) {
            alvw g = c.g();
            g.X(alwp.a, "BugleRecipientSync");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 157, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh because ContactRecipientIncrementalSync is enabled");
            if (((uhg) this.d.b()).d()) {
                d();
                return;
            }
            return;
        }
        if (((uhg) this.d.b()).d()) {
            ((uhg) this.d.b()).a();
            if (this.f.b.get() && this.a.compareAndSet(false, true)) {
                alvw g2 = c.g();
                g2.X(alwp.a, "BugleRecipientSync");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 165, "ParticipantFullRefreshImpl.java")).q("Started full participant refresh");
                ((rbf) this.h.b()).a().x(301, 0L);
                return;
            }
        }
        alvw g3 = c.g();
        g3.X(alwp.a, "BugleRecipientSync");
        ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 170, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh");
    }

    public final void b() {
        c(2);
        qiu.h(((qvv) this.p.b()).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [armf, java.lang.Object] */
    public final void c(int i) {
        String str;
        ahqq ahqqVar;
        Set set;
        uhb uhbVar;
        tap tapVar;
        boolean e;
        ParticipantsTable.BindData a;
        int i2;
        try {
            akrh e2 = aktp.e("ParticipantFullRefresh.refreshParticipants");
            try {
                ((qyb) this.n.b()).h();
                int i3 = 1;
                Collection.EL.forEach((Set) this.q.b(), new uhb(1));
                try {
                    xze xzeVar = b;
                    xyo c2 = xzeVar.c();
                    c2.H("Start participant refresh. refreshMode:");
                    if (i != 1) {
                        str = "SELF_ONLY";
                    } else {
                        str = "FULL";
                    }
                    c2.H(str);
                    c2.q();
                    if (!((uhg) this.d.b()).d()) {
                        xzeVar.o("Skipping participant refresh because of permissions");
                        set = (Set) this.q.b();
                        uhbVar = new uhb(0);
                    } else {
                        qnu qnuVar = (qnu) this.o.b();
                        if (i == 1) {
                            ahqq ahqqVar2 = this.f.d;
                            if (ahqqVar2 != null) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            ((mbl) qnuVar.a.b()).e("Bugle.Contacts.Sync.ParticipantsRefresh.Start.Count", i2);
                            d();
                            ahqqVar = ahqqVar2;
                        } else {
                            ahqqVar = null;
                        }
                        uhg uhgVar = (uhg) this.d.b();
                        ((ryg) uhgVar.e.b()).j();
                        if (!uhgVar.o.a()) {
                            int i4 = alog.d;
                            uhgVar.b(alsx.a);
                        } else {
                            qiu.h(((nfx) uhgVar.l.b()).a().b().h(new uht(uhgVar, i3), uhgVar.n));
                        }
                        if (((olj) uhgVar.m.b()).a()) {
                            uhgVar.f.e("ParticipantRefresh#refreshDefaultCurrentSelfIds", new eyg(10));
                        }
                        ArrayList arrayList = new ArrayList();
                        taz e3 = ParticipantsTable.e();
                        e3.w("refreshParticipantsInternal");
                        if (i == 2) {
                            e3.g(new ugo(15));
                        } else {
                            e3.q();
                        }
                        alog t = e3.b().t();
                        alur it = t.iterator();
                        int i5 = 0;
                        boolean z = false;
                        while (it.hasNext()) {
                            try {
                                tapVar = ((ParticipantsTable.BindData) it.next()).z();
                                try {
                                    e = ((uhg) this.d.b()).e(tapVar);
                                    a = tapVar.a();
                                    if (ContactsContract.Contacts.isEnterpriseContactId(a.s())) {
                                        i5++;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    if (tapVar == null) {
                                        b.r("Failed to update participant=null", e);
                                    } else {
                                        xyo e5 = b.e();
                                        e5.H("Failed to update");
                                        e5.e(tapVar.a);
                                        e5.l(tapVar.d);
                                        e5.j(tapVar.f);
                                        e5.r(e);
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                tapVar = null;
                            }
                            if (e) {
                                z |= ryg.l(a);
                                ((uhg) this.d.b()).c(a);
                                String str2 = tapVar.a;
                                ((qyg) this.j.b()).b(str2, a);
                                arrayList.add(str2);
                            }
                        }
                        if (i != 2) {
                            if (this.m.a()) {
                                this.l.ifPresent(new ter(t, 16));
                            } else {
                                this.k.ifPresent(new ter(t, 17));
                            }
                        }
                        xyo c3 = b.c();
                        c3.H("Number of participants refreshed:");
                        c3.F(arrayList.size());
                        c3.q();
                        ((mbl) this.r.b()).e("Bugle.Datamodel.ParticipantRefresh.WorkProfileSynced.Count", i5);
                        if (!arrayList.isEmpty()) {
                            ((rtz) this.e.b()).Q(arrayList);
                        }
                        if (z) {
                            ((uhj) this.g.b()).b();
                            ((uhj) this.g.b()).a();
                        }
                        ((mgv) this.i.b()).c(new ahka("Participants refreshed"));
                        if (i == 1) {
                            int i6 = ((alsx) t).c;
                            int size = arrayList.size();
                            if (ahqqVar != null) {
                                ((mgv) qnuVar.b.b()).h(ahqqVar, qld.a);
                            }
                            mbl mblVar = (mbl) qnuVar.a.b();
                            if (i6 > 0) {
                                mblVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.UpdateRatio.Count", (int) Math.ceil((size * 100.0d) / i6));
                            }
                            if (size <= 0) {
                                i3 = 0;
                            }
                            mblVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.End.Count", i3);
                        }
                        set = (Set) this.q.b();
                        uhbVar = new uhb(0);
                    }
                    Collection.EL.forEach(set, uhbVar);
                    e2.close();
                } catch (Throwable th) {
                    Collection.EL.forEach((Set) this.q.b(), new uhb(0));
                    throw th;
                }
            } finally {
            }
        } finally {
            ((qyb) this.n.b()).g();
        }
    }
}
