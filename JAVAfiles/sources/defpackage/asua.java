package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asua implements astx {
    final /* synthetic */ Provider a;
    final /* synthetic */ asub b;

    public asua(asub asubVar, Provider provider) {
        this.a = provider;
        this.b = asubVar;
    }

    @Override // defpackage.astx
    public final Signature a(String str) {
        Provider provider = this.a;
        if (provider != null) {
            return Signature.getInstance(this.b.b, provider);
        }
        return Signature.getInstance(this.b.b);
    }
}
