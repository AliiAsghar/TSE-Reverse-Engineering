package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umx {
    public umx() {
        new AtomicLong(-1L);
    }

    public static int a(int i) {
        return i - 1;
    }

    public static int b(int i) {
        return i - 1;
    }

    public static String c(int i) {
        int i2 = i - 1;
        if (i2 == b(5)) {
            return "r";
        }
        if (i2 == b(3)) {
            return "f";
        }
        if (i2 == b(9)) {
            return "d";
        }
        if (i2 == b(17)) {
            return "i";
        }
        if (i2 == b(33)) {
            return "u";
        }
        if (i2 != b(65)) {
            return "";
        }
        return "a";
    }

    public static int d(int i) {
        return i - 1;
    }

    public static String e(int i) {
        int i2 = i - 1;
        if (i2 == d(5)) {
            return "r";
        }
        if (i2 == d(3)) {
            return "f";
        }
        if (i2 == d(4)) {
            return "_uri_update";
        }
        if (i2 != d(6)) {
            return "";
        }
        return "a";
    }

    public static final void f() {
        tjn tjnVar = new tjn();
        tjnVar.e();
        tjnVar.a().V();
        tjv tjvVar = new tjv();
        tjvVar.e();
        tjvVar.a().V();
        tje tjeVar = new tje();
        tjeVar.e();
        tjeVar.a().V();
    }

    public static final rnk g(boolean z) {
        Object apply;
        Object apply2;
        if (z) {
            return m(tjj.c);
        }
        rnk a = rnm.a();
        a.s();
        int i = 1;
        a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
        a.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        rnk i2 = i(a, qnc.i, qnc.j);
        roz a2 = rpb.a();
        a2.s();
        agog b = agoh.b(a2.b(), (agmh) rpb.e.j, rnm.c.h);
        b.f = "backup_participant";
        rnk rnkVar = (rnk) i2.j(b);
        tjp tjpVar = new tjp(tjr.a);
        tjpVar.c(new rqa(13));
        agog b2 = agoh.b(tjpVar.b(), (agmh) tjr.c.c, rnm.c.h);
        b2.f = "backup_suffix_scratch";
        rnk rnkVar2 = (rnk) rnkVar.j(b2);
        rnl rnlVar = new rnl();
        Function[] functionArr = {new rqa(17), new rqa(18)};
        rnl[] rnlVarArr = new rnl[2];
        for (int i3 = 0; i3 < 2; i3++) {
            apply2 = functionArr[i3].apply(new rnl());
            rnlVarArr[i3] = (rnl) apply2;
        }
        rnlVar.V(rnlVarArr);
        rnkVar2.d(rnlVar);
        apply = new rqr(i).apply(new rnl());
        rnkVar2.k(new agpw((rnl) apply));
        return rnkVar2;
    }

    public static final rnk h(boolean z) {
        if (z) {
            return m(tjj.b);
        }
        rnk a = rnm.a();
        a.s();
        a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
        a.n(new agpk("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        rnk i = i(a, qnc.k);
        rnv a2 = rnx.a();
        a2.s();
        a2.c(new rqa(20));
        agog b = agoh.b(a2.b(), (agmh) rnx.e.e, rnm.c.a);
        b.f = "backup_parts";
        rnk rnkVar = (rnk) i.j(b);
        rnl rnlVar = new rnl();
        rnlVar.W(new agpk("$V{J:backup_parts} = $V{J:bugle_parts}", new Object[]{rnx.e.a, PartsTable.d.c}));
        rnkVar.d(rnlVar);
        return rnkVar;
    }

    public static final rnk i(rnk rnkVar, arqr... arqrVarArr) {
        sxy k = k();
        for (arqr arqrVar : arqrVarArr) {
            arqrVar.a(k);
        }
        agog b = agoh.b(k.b(), MessagesTable.c.i, rnm.c.m);
        b.f = "bugle_messages";
        return (rnk) rnkVar.j(b);
    }

    public static final rnk j(rnk rnkVar, sxp sxpVar, rnf rnfVar) {
        agog b = agoh.b(k().b(), sxpVar, rnfVar);
        b.f = "bugle_messages";
        return (rnk) rnkVar.j(b);
    }

    public static final sxy k() {
        sxy d = MessagesTable.d();
        d.s();
        sfw sfwVar = new sfw(sfz.a);
        sfwVar.s();
        sfwVar.d(new rqa(16));
        sfv b = sfwVar.b();
        Object obj = sfz.d.f;
        sxp sxpVar = MessagesTable.c.a;
        sfy sfyVar = new sfy();
        sfyVar.f(rpk.b.a);
        d.C(b.q((agmh) obj, sxpVar, new agpw(sfyVar)));
        return d;
    }

    public static agmh[] l() {
        return (agmh[]) rmh.e.a;
    }

    private static final rnk m(tjj tjjVar) {
        rnk a = rnm.a();
        a.s();
        a.n(new agpk("$V", new Object[]{rnm.c.a}), "backup_id");
        a.n(new agpk("$V{J:scratch_duplicates}", new Object[]{tji.c.c}), "bugle_id");
        tjg tjgVar = new tjg(tji.a);
        tjgVar.s();
        tjgVar.c(new rpf(tjjVar, 8));
        agog b = agoh.b(tjgVar.b(), (agmh) tji.c.b, rnm.c.a);
        b.f = "scratch_duplicates";
        return (rnk) a.j(b);
    }
}
