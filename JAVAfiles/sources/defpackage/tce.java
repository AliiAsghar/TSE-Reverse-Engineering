package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tce extends agpx {
    @Override // defpackage.agpx
    public final /* synthetic */ agpw a() {
        return new agpw(this);
    }

    public final void b(tqn tqnVar) {
        int ordinal;
        if (tqnVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqnVar.ordinal();
        }
        U(new agoi("pending_incoming_message_rcs_table.message_status", 1, Integer.valueOf(ordinal)));
    }

    public final void c(tqn... tqnVarArr) {
        U(new agmf("pending_incoming_message_rcs_table.message_status", 3, X((Iterable) DesugarArrays.stream(tqnVarArr).map(new sho(19)).collect(Collectors.toCollection(new taq(15)))), true));
    }

    public final void d(rve rveVar) {
        U(new agmd("pending_incoming_message_rcs_table.rcs_message_id", 1, rve.d(rveVar)));
    }

    public final void e(long j) {
        U(new agoi("pending_incoming_message_rcs_table.received_timestamp", 8, Long.valueOf(j)));
    }

    public final void f(String str) {
        U(new agmd("pending_incoming_message_rcs_table.remote_user_id", 1, String.valueOf(str)));
    }
}
