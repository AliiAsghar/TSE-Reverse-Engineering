package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqh implements rpi {
    public final armf a;
    public final Map b;
    private final arwe c;
    private final rpl d;
    private final armf e;
    private final rpm f;
    private final rpm g;

    public rqh(arwe arweVar, armf armfVar, rpj rpjVar, rpl rplVar, armf armfVar2) {
        this.c = arweVar;
        this.a = armfVar;
        this.d = rplVar;
        this.e = armfVar2;
        new asgm();
        this.b = new LinkedHashMap();
        final boolean z = rplVar.a;
        Map map = rqs.a;
        final int i = 1;
        int i2 = 0;
        this.f = new rpm(rpp.i, rpjVar, new armf() { // from class: rqu
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                if (i != 0) {
                    Map map2 = rqs.a;
                    aron aronVar = new aron((byte[]) null);
                    rnk a = rnm.a();
                    a.s();
                    a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    sxy d = MessagesTable.d();
                    d.s();
                    agog b = agoh.b(d.b(), MessagesTable.c.ao, rnm.c.b);
                    b.f = "bugle_messages";
                    aronVar.add((rnk) a.j(b));
                    rnk a2 = rnm.a();
                    a2.s();
                    a2.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a2.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    aronVar.add(umx.j(a2, MessagesTable.c.M, rnm.c.A));
                    rnk a3 = rnm.a();
                    a3.s();
                    a3.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a3.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    aronVar.add(umx.j(a3, MessagesTable.c.C, rnm.c.y));
                    rnk a4 = rnm.a();
                    a4.s();
                    boolean z2 = z;
                    a4.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a4.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    rnk i3 = umx.i(a4, new arqr[0]);
                    rnl rnlVar = new rnl();
                    rnf rnfVar = rnm.c.d;
                    rnlVar.W(new agpk("($V >= 200) AND ($V = $V{J:bugle_messages})", new Object[]{rnfVar, rnfVar, MessagesTable.c.k}));
                    i3.d(rnlVar);
                    aronVar.add(i3);
                    if (z2) {
                        aronVar.add(umx.h(false));
                        aronVar.add(umx.g(false));
                        aronVar.add(umx.h(true));
                        aronVar.add(umx.g(true));
                    }
                    return aqjn.x(aronVar);
                }
                Map map3 = rqv.a;
                aron aronVar2 = new aron((byte[]) null);
                if (z) {
                    agpj agpjVar = rqt.a;
                    rnv a5 = rnx.a();
                    a5.s();
                    a5.n(new agpk("$V", new Object[]{rnx.e.n}), "backup_id");
                    a5.n(new agpk("$V{J:bugle_parts}", new Object[]{PartsTable.d.a}), "bugle_id");
                    sfw sfwVar = new sfw(sfz.a);
                    sfwVar.s();
                    sfwVar.d(new rqr(13));
                    tbs d2 = PartsTable.d();
                    d2.s();
                    d2.g(new rqr(14));
                    tbr b2 = d2.b();
                    tbi tbiVar = PartsTable.d.b;
                    Object obj = sfz.d.f;
                    tbu tbuVar = new tbu();
                    tbuVar.W(new agpk("$V = $V{J:bugle_parts}", new Object[]{rnx.e.h, PartsTable.d.e}));
                    agog q = b2.q(tbiVar, (agmh) obj, new agpw(tbuVar));
                    q.f = "bugle_parts";
                    agog b3 = agoh.b(((sfw) sfwVar.j(q)).b(), (agmh) sfz.d.e, (agmh) rnx.e.e);
                    b3.f = "message_id_map";
                    aronVar2.add((rnv) a5.j(b3));
                }
                agpj agpjVar2 = rqt.a;
                rnv a6 = rnx.a();
                a6.s();
                a6.n(new agpk("$V", new Object[]{rnx.e.n}), "backup_id");
                a6.n(new agpk("$V", new Object[]{-1}), "bugle_id");
                sfw sfwVar2 = new sfw(sfz.a);
                sfwVar2.s();
                sfwVar2.d(new rqr(15));
                aronVar2.add((rnv) a6.j(agoh.b(sfwVar2.b(), (agmh) sfz.d.e, (agmh) rnx.e.e)));
                return aqjn.x(aronVar2);
            }
        }, rqs.a, null, rqs.b, i2, 80);
        final boolean z2 = rplVar.b;
        Map map2 = rqv.a;
        final int i3 = 0;
        this.g = new rpm(rpp.j, rpr.i, new armf() { // from class: rqu
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                if (i3 != 0) {
                    Map map22 = rqs.a;
                    aron aronVar = new aron((byte[]) null);
                    rnk a = rnm.a();
                    a.s();
                    a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    sxy d = MessagesTable.d();
                    d.s();
                    agog b = agoh.b(d.b(), MessagesTable.c.ao, rnm.c.b);
                    b.f = "bugle_messages";
                    aronVar.add((rnk) a.j(b));
                    rnk a2 = rnm.a();
                    a2.s();
                    a2.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a2.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    aronVar.add(umx.j(a2, MessagesTable.c.M, rnm.c.A));
                    rnk a3 = rnm.a();
                    a3.s();
                    a3.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a3.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    aronVar.add(umx.j(a3, MessagesTable.c.C, rnm.c.y));
                    rnk a4 = rnm.a();
                    a4.s();
                    boolean z22 = z2;
                    a4.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
                    a4.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
                    rnk i32 = umx.i(a4, new arqr[0]);
                    rnl rnlVar = new rnl();
                    rnf rnfVar = rnm.c.d;
                    rnlVar.W(new agpk("($V >= 200) AND ($V = $V{J:bugle_messages})", new Object[]{rnfVar, rnfVar, MessagesTable.c.k}));
                    i32.d(rnlVar);
                    aronVar.add(i32);
                    if (z22) {
                        aronVar.add(umx.h(false));
                        aronVar.add(umx.g(false));
                        aronVar.add(umx.h(true));
                        aronVar.add(umx.g(true));
                    }
                    return aqjn.x(aronVar);
                }
                Map map3 = rqv.a;
                aron aronVar2 = new aron((byte[]) null);
                if (z2) {
                    agpj agpjVar = rqt.a;
                    rnv a5 = rnx.a();
                    a5.s();
                    a5.n(new agpk("$V", new Object[]{rnx.e.n}), "backup_id");
                    a5.n(new agpk("$V{J:bugle_parts}", new Object[]{PartsTable.d.a}), "bugle_id");
                    sfw sfwVar = new sfw(sfz.a);
                    sfwVar.s();
                    sfwVar.d(new rqr(13));
                    tbs d2 = PartsTable.d();
                    d2.s();
                    d2.g(new rqr(14));
                    tbr b2 = d2.b();
                    tbi tbiVar = PartsTable.d.b;
                    Object obj = sfz.d.f;
                    tbu tbuVar = new tbu();
                    tbuVar.W(new agpk("$V = $V{J:bugle_parts}", new Object[]{rnx.e.h, PartsTable.d.e}));
                    agog q = b2.q(tbiVar, (agmh) obj, new agpw(tbuVar));
                    q.f = "bugle_parts";
                    agog b3 = agoh.b(((sfw) sfwVar.j(q)).b(), (agmh) sfz.d.e, (agmh) rnx.e.e);
                    b3.f = "message_id_map";
                    aronVar2.add((rnv) a5.j(b3));
                }
                agpj agpjVar2 = rqt.a;
                rnv a6 = rnx.a();
                a6.s();
                a6.n(new agpk("$V", new Object[]{rnx.e.n}), "backup_id");
                a6.n(new agpk("$V", new Object[]{-1}), "bugle_id");
                sfw sfwVar2 = new sfw(sfz.a);
                sfwVar2.s();
                sfwVar2.d(new rqr(15));
                aronVar2.add((rnv) a6.j(agoh.b(sfwVar2.b(), (agmh) sfz.d.e, (agmh) rnx.e.e)));
                return aqjn.x(aronVar2);
            }
        }, rqv.a, rqv.c, rqv.b, i2, 64);
    }

    @Override // defpackage.rpi
    public final int a() {
        return this.f.a();
    }

    @Override // defpackage.rpi
    public final void b(agpc agpcVar) {
        rnk a = rnm.a();
        a.s();
        a.z((String) DesugarArrays.stream(new atkn[]{new atkn((Object) rnm.c.m, false)}).map(new rhr(16)).collect(Collectors.joining(", ")));
        a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
        this.f.b(a);
        this.g.b(null);
        rqq.a.b(null);
        rql.a.b(null);
        rqo.c.b(null);
        if (((oyu) this.e.b()).a()) {
            rqj.a.b(null);
        }
    }

    @Override // defpackage.rpi
    public final void c() {
        this.f.c();
        this.g.c();
        rqq.a.c();
        rql.a.c();
        rqo.c.c();
        if (((oyu) this.e.b()).a()) {
            rqj.a.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rpi
    public final void d() {
        this.f.d();
        this.g.d();
        rqq.a.d();
        rql.a.d();
        rqo.c.d();
        if (((oyu) this.e.b()).a()) {
            rqj.a.d();
        }
        sxy d = MessagesTable.d();
        d.c(MessagesTable.c.b);
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.s();
        sfwVar.d(new rqa(4));
        agog b = agoh.b(sfwVar.b(), (agmh) sfz.d.f, MessagesTable.c.a);
        b.b(true);
        alog t = ((sxy) d.j(b)).b().t();
        t.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
        alur it = t.iterator();
        while (it.hasNext()) {
            arrayList.add(((MessagesTable.BindData) it.next()).z());
        }
        List ak = aqjn.ak(arrayList);
        ArrayList<ConversationIdType> arrayList2 = new ArrayList();
        for (Object obj : ak) {
            if (!this.b.keySet().contains((ConversationIdType) obj)) {
                arrayList2.add(obj);
            }
        }
        for (ConversationIdType conversationIdType : arrayList2) {
            Map map = this.b;
            conversationIdType.getClass();
            map.put(conversationIdType, false);
        }
    }

    @Override // defpackage.rpi
    public final void e() {
        qjh.l(this.c, null, new qrr(this, (arpe) null, 18), 3);
    }

    @Override // defpackage.rpi
    public final void f() {
        this.f.f();
        this.g.f();
        rqq.a.f();
        rql.a.f();
        rqo.c.f();
        if (((oyu) this.e.b()).a()) {
            rqj.a.f();
        }
    }

    @Override // defpackage.rpi
    public final void g(int i, agpj agpjVar) {
        this.f.g(i, null);
        rnv a = rnx.a();
        yzk yzkVar = rnx.e;
        this.g.g(i, rpk.a(a, (agmh) yzkVar.e, (agmh) yzkVar.n, rpk.b, rpk.d));
        rmx rmxVar = new rmx(rmz.a);
        lrf lrfVar = rmz.e;
        rqq.a.g(i, rpk.a(rmxVar, (agmh) lrfVar.a, (agmh) lrfVar.b, rpk.b, rpk.g));
        sfw sfwVar = new sfw(sfz.a);
        usk uskVar = sfz.d;
        sfwVar.c((sfs) uskVar.e, (sfs) uskVar.b);
        sfwVar.d(new rqa(5));
        rmf rmfVar = new rmf(rmh.a);
        rmfVar.s();
        sfw sfwVar2 = new sfw(sfz.a);
        sfwVar2.s();
        sfwVar2.d(new rqa(6));
        sfv b = sfwVar2.b();
        Object obj = sfz.d.e;
        Object obj2 = rmh.e.g;
        sfy sfyVar = new sfy();
        sfyVar.f(rpk.b.a);
        agog q = b.q((agmh) obj, (agmh) obj2, new agpw(sfyVar));
        q.f = "reacted_message_id_map";
        rmfVar.C(q);
        sfw sfwVar3 = new sfw(sfz.a);
        sfwVar3.s();
        sfwVar3.d(new rqa(7));
        agog b2 = agoh.b(sfwVar3.b(), (agmh) sfz.d.e, (agmh) rmh.e.b);
        b2.f = "message_id_map";
        agog b3 = agoh.b(((rmf) rmfVar.j(b2)).b(), (agmh) rmh.e.c, (agmh) sfz.d.e);
        b3.f = "reactions_id_map";
        rql.a.g(i, ((sfw) sfwVar.j(b3)).b());
        rqo.c.g(i, null);
        if (((oyu) this.e.b()).a()) {
            rqj.a.g(i, null);
        }
    }
}
