package defpackage;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sda extends agpc {
    public sda(String[] strArr) {
        super("messages", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.is_hidden <> 1  AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final scz b() {
        l();
        return new scz(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new sdb());
        k(new agpw((sdb) apply));
    }

    public final void d(atkn... atknVarArr) {
        z((String) DesugarArrays.stream(atknVarArr).map(new sal(17)).collect(Collectors.joining(", ")));
    }
}
