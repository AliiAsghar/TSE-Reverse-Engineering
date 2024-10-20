package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asou implements arqg {
    final /* synthetic */ aspc a;
    private final aspf b;

    public asou(aspc aspcVar, aspf aspfVar) {
        this.a = aspcVar;
        this.b = aspfVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            if (!this.b.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
            } while (this.b.a(false, this));
            this.a.k(1, 9, null);
        } catch (IOException e) {
            this.a.k(2, 2, e);
        } catch (Throwable th) {
            this.a.k(3, 3, null);
            asmt.p(this.b);
            throw th;
        }
        asmt.p(this.b);
        return arnb.a;
    }
}
