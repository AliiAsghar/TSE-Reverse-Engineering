package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspa extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aspa(String str, aspc aspcVar, int i, int i2) {
        super(str);
        this.d = aspcVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.asmv
    public final long a() {
        try {
            this.d.m(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
