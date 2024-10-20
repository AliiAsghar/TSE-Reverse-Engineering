package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmo implements ncq {
    public final osb a;
    public final lxe b;
    public final lfl c;
    private final arwe d;
    private final int e;
    private final boolean f;
    private final rzz g;

    public mmo(arwe arweVar, lfl lflVar, iew iewVar, lxe lxeVar, osb osbVar, int i, boolean z) {
        this.d = arweVar;
        this.c = lflVar;
        this.b = lxeVar;
        this.a = osbVar;
        this.e = i;
        this.f = z;
        this.g = iewVar.m(g().b(), "getTopConversations");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object d(defpackage.mmo r4, defpackage.arpe r5) {
        /*
            boolean r0 = r5 instanceof defpackage.mmn
            if (r0 == 0) goto L13
            r0 = r5
            mmn r0 = (defpackage.mmn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mmn r0 = new mmn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.aqil.P(r5)
            snf r4 = r4.g()
            sne r4 = r4.b()
            akul r4 = r4.s()
            r4.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.arro.F(r4, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmo.d(mmo, arpe):java.lang.Object");
    }

    private static final snf f(snf snfVar) {
        Object apply;
        if (!uzz.g()) {
            return snfVar;
        }
        taa taaVar = new taa(tac.a);
        apply = new mlm(9).apply(tac.d);
        taaVar.c((szw[]) apply);
        snh snhVar = new snh();
        snhVar.W(new agpk("$V{J:parent_disallowed_join_tag} ISNULL", new Object[]{tac.d.a}));
        snfVar.g(snhVar);
        agog b = agoh.b(taaVar.b(), (agmh) tac.d.a, sni.c.a);
        b.f = "parent_disallowed_join_tag";
        snfVar.C(b);
        return snfVar;
    }

    private final snf g() {
        if (this.a.a()) {
            return lxe.l(e());
        }
        arsb arsbVar = new arsb();
        snf e = sni.e();
        e.w("topConversationsInner");
        e.f(new mlm(8));
        e.x(0);
        e.u(this.e);
        e.h(new mlm(11));
        smu smuVar = sni.c;
        e.i(new atkn((Object) smuVar.r, false), new atkn((Object) smuVar.a, false));
        arsbVar.a = e;
        if (this.f) {
            Object obj = arsbVar.a;
            obj.getClass();
            arsbVar.a = f((snf) obj);
        }
        snf e2 = sni.e();
        e2.w("topConversations");
        e2.q();
        int i = 15;
        e2.h(new mjz(arsbVar, i));
        smu smuVar2 = sni.c;
        e2.i(new atkn((Object) smuVar2.r, false), new atkn((Object) smuVar2.a, false));
        e2.t(sni.c.a);
        e2.e(new mlm(12));
        sxy d = MessagesTable.d();
        d.d(new mlm(10));
        taz e3 = ParticipantsTable.e();
        e3.d(new mlm(17));
        d.C(agoh.b(e3.b(), ParticipantsTable.c.a, MessagesTable.c.c));
        tpy tpyVar = new tpy(VmtTable.a);
        tpyVar.c(new mlm(i));
        tbs d2 = PartsTable.d();
        d2.d(new mlm(16));
        d2.C(agoh.b(tpyVar.b(), (agmh) VmtTable.d.c, PartsTable.d.a));
        d.C(agoh.b(d2.b(), PartsTable.d.b, MessagesTable.c.a));
        e2.C(agoh.b(d.b(), MessagesTable.c.a, sni.c.f));
        return e2;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.g.f(new kzq(ncpVar, 4), "TopConversationsSupplier::register", "TopConversationsSupplier::callback", "TopConversationsSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        akrh e = aktp.e("TopConversationsSupplier#getTopConversations");
        try {
            c = qjh.c(this.d, arpj.a, arwf.a, new lgp(this, (arpe) null, 14));
            e.b(c);
            armd.i(e, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final snh e() {
        snf e = sni.e();
        e.w("topConversationsInner");
        e.f(new mlm(13));
        e.x(0);
        e.u(this.e);
        e.h(new mlm(14));
        smu smuVar = sni.c;
        e.i(new atkn((Object) smuVar.r, false), new atkn((Object) smuVar.a, false));
        if (this.f) {
            e = f(e);
        }
        snh snhVar = new snh();
        snhVar.k(e.b());
        return snhVar;
    }
}
