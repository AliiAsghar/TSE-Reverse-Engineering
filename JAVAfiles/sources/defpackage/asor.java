package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asor extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ aspj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asor(String str, aspc aspcVar, aspj aspjVar) {
        super(str);
        this.d = aspcVar;
        this.e = aspjVar;
    }

    @Override // defpackage.asmv
    public final long a() {
        try {
            this.d.b.f(this.e);
            return -1L;
        } catch (IOException e) {
            aspx.b.k("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.d)), 4, e);
            try {
                this.e.k(2, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
