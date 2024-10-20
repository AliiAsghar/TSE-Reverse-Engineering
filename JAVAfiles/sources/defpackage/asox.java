package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asox extends asmv {
    final /* synthetic */ aspc d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asox(String str, aspc aspcVar, int i) {
        super(str);
        this.d = aspcVar;
        this.e = i;
    }

    @Override // defpackage.asmv
    public final long a() {
        try {
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
