package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvy extends agpc {
    public qvy(String[] strArr) {
        super("my_identities LEFT JOIN subscriptions ON (subscriptions.my_identity_token=my_identities.token)", strArr, "token", null, null, "$primary");
    }

    @Override // defpackage.agpc
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qvx b() {
        l();
        return new qvx(this.a.b());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(new qvz());
        k(new agpw((qvz) apply));
    }
}
