package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwu extends agps {
    public qwu() {
        super("subscriptions");
    }

    public final qwe b() {
        return riw.m(this.a.getAsString("my_identity_token"));
    }

    @Override // defpackage.agps
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        try {
            if (oes.a() && b() != null) {
                d(b());
            }
            return new agpr(this.c, this.a, this.b, this.d.g(), this.e.a());
        } catch (Throwable th) {
            throw new aglw(th);
        }
    }

    public final void d(qwe qweVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        if (valueOf2.intValue() >= 60160 && intValue >= 60160) {
            if (qweVar != null && !qweVar.equals(null)) {
                this.a.put("my_identity_token_with_foreign_key", riw.n(qweVar));
            } else {
                this.a.putNull("my_identity_token_with_foreign_key");
            }
        }
    }
}
