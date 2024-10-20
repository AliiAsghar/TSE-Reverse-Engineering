package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbd extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new tbc(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        tbd[] tbdVarArr = new tbd[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            apply = functionArr[i].apply(new tbd());
            tbdVarArr[i] = (tbd) apply;
        }
        V(tbdVarArr);
    }

    public final void c() {
        U(new agoi("participants.blocked", 1, 1));
    }

    public final void d(String str) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 54040) {
            agnc.t("comparable_destination", intValue);
        }
        U(new agmd("participants.comparable_destination", 1, String.valueOf(str)));
    }

    public final void e() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 54040) {
            agnc.t("comparable_destination", intValue);
        }
        U(new agmg("participants.comparable_destination", 6));
    }

    public final void f() {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 54040) {
            agnc.t("comparable_destination", intValue);
        }
        U(new agmg("participants.comparable_destination", 5));
    }

    public final void g(long j) {
        U(new agoi("participants.contact_id", 1, Long.valueOf(j)));
    }

    public final void h(String str) {
        U(new agmd("participants._id", 1, String.valueOf(str)));
    }

    public final void i(agpj agpjVar) {
        U(new agme("participants._id", 3, agpjVar));
    }

    public final void j(Iterable iterable) {
        U(new agmf("participants._id", 3, X(iterable), false));
    }

    public final void k(tqr tqrVar) {
        Integer valueOf;
        int ordinal;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 31030) {
            agnc.t("latest_verification_status", intValue);
        }
        if (tqrVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqrVar.ordinal();
        }
        U(new agoi("participants.latest_verification_status", 2, Integer.valueOf(ordinal)));
    }

    public final void l(String str) {
        U(new agmd("participants.normalized_destination", 1, String.valueOf(str)));
    }

    public final void m(Iterable iterable) {
        U(new agmf("participants.normalized_destination", 3, X(iterable), false));
    }

    public final void n(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 12001) {
            agnc.t("participant_type", intValue);
        }
        U(new agoi("participants.participant_type", 1, Integer.valueOf(i)));
    }

    public final void o(Iterable iterable) {
        U(new agmf("participants.send_destination", 3, X(iterable), false));
    }

    public final void p(int i) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 2000) {
            agnc.t("sim_slot_id", intValue);
        }
        U(new agoi("participants.sim_slot_id", 1, Integer.valueOf(i)));
    }

    public final void q(int i) {
        U(new agoi("participants.sub_id", 1, Integer.valueOf(i)));
    }

    public final void r(int i) {
        U(new agoi("participants.sub_id", 7, Integer.valueOf(i)));
    }

    public final void s() {
        U(new agoi("participants.sub_id", 2, -2));
    }
}
