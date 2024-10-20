package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class slw extends agps {
    public slw() {
        super("conversation_suggestions");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c() {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 12000) {
            agnc.t("read", intValue2);
        }
        if (intValue >= 12000) {
            this.a.put("read", (Boolean) true);
        }
    }
}
