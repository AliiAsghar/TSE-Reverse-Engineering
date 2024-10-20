package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcy extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        lcy[] lcyVarArr = new lcy[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            apply = functionArr[i].apply(new lcy());
            lcyVarArr[i] = (lcy) apply;
        }
        V(lcyVarArr);
    }

    public final void c(tqc tqcVar) {
        int i;
        if (tqcVar == null) {
            i = 0;
        } else {
            i = tqcVar.h;
        }
        U(new agoi("conversations.archive_status", 1, Integer.valueOf(i)));
    }

    public final void d(Iterable iterable) {
        U(new agmf("conversations.archive_status", 3, X((Iterable) alzz.C(iterable).map(new lcw(2)).collect(Collectors.toCollection(new lct(2)))), true));
    }

    public final void e(tqc... tqcVarArr) {
        U(new agmf("conversations.archive_status", 3, X((Iterable) DesugarArrays.stream(tqcVarArr).map(new lcw(3)).collect(Collectors.toCollection(new lct(2)))), true));
    }

    public final void f() {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        int intValue = valueOf.intValue();
        if (intValue < 29020) {
            agnc.t("delete_timestamp", intValue);
        }
        U(new agoi("conversations.delete_timestamp", 1, 0L));
    }

    public final void g() {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        int intValue = valueOf.intValue();
        if (intValue < 12001) {
            agnc.t("has_ea2p_bot_recipient", intValue);
        }
        U(new agoi("conversations.has_ea2p_bot_recipient", 2, 1));
    }

    public final void h(long j) {
        U(new agoi("conversations._id", 7, Long.valueOf(j)));
    }

    public final void i(long j) {
        U(new agoi("conversations._id", 8, Long.valueOf(j)));
    }

    public final void j(long j) {
        U(new agoi("conversations._id", 10, Long.valueOf(j)));
    }

    public final void k(String... strArr) {
        U(new agmf("conversations.participant_normalized_destination", 4, Z(strArr), false));
    }

    public final void l() {
        U(new agmg("conversations.participant_normalized_destination", 5));
    }

    public final void m() {
        U(new agmd("conversations.participant_normalized_destination", 2, "+18339913448"));
    }

    public final void n(long j) {
        U(new agoi("conversations.sort_timestamp", 1, Long.valueOf(j)));
    }

    public final void o(long j) {
        U(new agoi("conversations.sort_timestamp", 7, Long.valueOf(j)));
    }

    public final void p(long j) {
        U(new agoi("conversations.sort_timestamp", 8, Long.valueOf(j)));
    }

    public final void q(long j) {
        U(new agoi("conversations.sort_timestamp", 10, Long.valueOf(j)));
    }
}
