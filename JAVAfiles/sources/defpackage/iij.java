package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iij implements mdz {
    private final amfp a;

    public iij(amfp amfpVar) {
        amfpVar.getClass();
        this.a = amfpVar;
    }

    @Override // defpackage.mdz
    public final amfp a() {
        return this.a;
    }

    @Override // defpackage.mdz
    public final BiConsumer b() {
        return new ijo(iii.a, 1);
    }

    @Override // defpackage.mdz
    public final Supplier c() {
        return new ijk(1);
    }
}
