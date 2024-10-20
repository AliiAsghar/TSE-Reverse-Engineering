package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgf extends arrp implements arqr {
    final /* synthetic */ int a;
    final /* synthetic */ mgg b;
    final /* synthetic */ long c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgf(int i, mgg mggVar, long j, int i2) {
        super(1);
        this.d = i2;
        this.a = i;
        this.b = mggVar;
        this.c = j;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        aozy aozyVar = (aozy) obj;
                        aozy builder = this.b.toBuilder();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        long j = this.c;
                        int i2 = this.a;
                        mgg mggVar = (mgg) builder.b;
                        mggVar.b |= 8;
                        mggVar.e = j;
                        aozyVar.y(i2, (mgg) builder.s());
                        return arnb.a;
                    }
                    aozy aozyVar2 = (aozy) obj;
                    aozy builder2 = this.b.toBuilder();
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    long j2 = this.c;
                    int i3 = this.a;
                    mgg mggVar2 = (mgg) builder2.b;
                    mggVar2.b |= 64;
                    mggVar2.g = j2;
                    aozyVar2.y(i3, (mgg) builder2.s());
                    return arnb.a;
                }
                aozy aozyVar3 = (aozy) obj;
                aozy builder3 = this.b.toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                long j3 = this.c;
                int i4 = this.a;
                mgg mggVar3 = (mgg) builder3.b;
                mggVar3.b |= 32;
                mggVar3.f = j3;
                aozyVar3.y(i4, (mgg) builder3.s());
                return arnb.a;
            }
            aozy aozyVar4 = (aozy) obj;
            aozy builder4 = this.b.toBuilder();
            if (!builder4.b.isMutable()) {
                builder4.u();
            }
            long j4 = this.c;
            int i5 = this.a;
            mgg mggVar4 = (mgg) builder4.b;
            mggVar4.b = 2 | mggVar4.b;
            mggVar4.c = j4;
            aozyVar4.y(i5, (mgg) builder4.s());
            return arnb.a;
        }
        aozy aozyVar5 = (aozy) obj;
        aozy builder5 = this.b.toBuilder();
        if (!builder5.b.isMutable()) {
            builder5.u();
        }
        long j5 = this.c;
        int i6 = this.a;
        mgg mggVar5 = (mgg) builder5.b;
        mggVar5.b |= 4;
        mggVar5.d = j5;
        aozyVar5.y(i6, (mgg) builder5.s());
        return arnb.a;
    }
}
