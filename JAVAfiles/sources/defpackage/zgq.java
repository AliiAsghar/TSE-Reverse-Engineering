package defpackage;

import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zgq implements BooleanSupplier {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ zgr a;

    public /* synthetic */ zgq(zgr zgrVar) {
        this.a = zgrVar;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        zgr zgrVar = this.a;
        return zgrVar.w.g(zgrVar);
    }
}
