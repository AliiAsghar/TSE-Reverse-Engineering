package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atpl extends asqz {
    final /* synthetic */ atpm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atpl(atpm atpmVar, asrq asrqVar) {
        super(asrqVar);
        this.a = atpmVar;
    }

    @Override // defpackage.asqz, defpackage.asrq
    public final long b(asqu asquVar, long j) {
        try {
            return this.b.b(asquVar, 8192L);
        } catch (IOException e) {
            this.a.a = e;
            throw e;
        }
    }
}
