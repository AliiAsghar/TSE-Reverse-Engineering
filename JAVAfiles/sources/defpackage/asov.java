package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asov extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ int e;
    final /* synthetic */ asqu f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asov(String str, aspc aspcVar, int i, asqu asquVar, int i2) {
        super(str);
        this.d = aspcVar;
        this.e = i;
        this.f = asquVar;
        this.g = i2;
    }

    @Override // defpackage.asmv
    public final long a() {
        try {
            this.f.B(this.g);
            this.d.u.j(this.e, 9);
            synchronized (this.d) {
                this.d.w.remove(Integer.valueOf(this.e));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
