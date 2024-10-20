package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfb implements hfe {
    private final heu a;
    private final heu b;

    public hfb(heu heuVar, heu heuVar2) {
        this.a = heuVar;
        this.b = heuVar2;
    }

    @Override // defpackage.hfe
    public final hcw a() {
        return new hdj(this.a.a(), this.b.a());
    }

    @Override // defpackage.hfe
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.hfe
    public final boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }
}
