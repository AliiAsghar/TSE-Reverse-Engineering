package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspb extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aspb(String str, aspc aspcVar, int i, long j) {
        super(str);
        this.d = aspcVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.asmv
    public final long a() {
        try {
            this.d.u.i(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
