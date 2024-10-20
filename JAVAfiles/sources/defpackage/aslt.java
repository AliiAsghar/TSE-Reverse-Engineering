package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslt extends arrp implements arqg {
    final /* synthetic */ arqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aslt(arqg arqgVar) {
        super(0);
        this.a = arqgVar;
    }

    @Override // defpackage.arqg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        try {
            return (List) this.a.a();
        } catch (SSLPeerUnverifiedException unused) {
            return arnv.a;
        }
    }
}
