package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtc extends agpc<wta, wtb, wtc, ScheduledSendTable.BindData, wsz> {
    public wtc(String[] strArr) {
        super("scheduled_send", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wtb b() {
        l();
        return new wtb(this.a.b());
    }

    public final void c(wsz... wszVarArr) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (((Integer) ScheduledSendTable.b.getOrDefault(wszVarArr[0].toString(), -1)).intValue() > intValue) {
            agnc.t("columnReference.toString()", intValue);
        }
        m(wszVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(new wte());
        k(new agpw((wte) apply));
    }
}
