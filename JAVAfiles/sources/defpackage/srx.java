package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srx extends agps {
    public srx() {
        super("lighter_conversations_table");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58810) {
            agnc.t("is_last_message_outgoing", intValue2);
        }
        if (intValue >= 58810) {
            this.a.put("is_last_message_outgoing", Boolean.valueOf(z));
        }
    }

    public final void d(String str) {
        agnc.r(this.a, "lighter_conversation_id_json", str);
    }

    public final void e(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 58700) {
            agnc.t("read", intValue2);
        }
        if (intValue >= 58700) {
            this.a.put("read", Boolean.valueOf(z));
        }
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(new sry());
        Z(new agpw((sry) apply));
    }
}
