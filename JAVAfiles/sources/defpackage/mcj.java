package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcj implements Supplier {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mcj(int i, long j, int i2) {
        this.c = i2;
        this.b = i;
        this.a = j;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return mck.e(3, this.b, this.a);
            }
            return mck.e(2, this.b, this.a);
        }
        return mck.e(4, this.b, this.a);
    }
}
