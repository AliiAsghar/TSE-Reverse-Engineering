package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcs implements Supplier {
    public final /* synthetic */ long a;
    public final /* synthetic */ amue b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ mcs(long j, int i, amue amueVar, int i2) {
        this.d = i2;
        this.a = j;
        this.c = i;
        this.b = amueVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.d != 0) {
            amue amueVar = this.b;
            return mcu.d(3, this.a, this.c, amueVar);
        }
        amue amueVar2 = this.b;
        return mcu.d(2, this.a, this.c, amueVar2);
    }
}
