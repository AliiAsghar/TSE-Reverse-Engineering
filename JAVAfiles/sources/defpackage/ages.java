package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ages extends hb {
    final /* synthetic */ ageu a;
    final /* synthetic */ List b;

    public ages(ageu ageuVar, List list) {
        this.a = ageuVar;
        this.b = list;
    }

    @Override // defpackage.hb
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.hb
    public final int b() {
        return this.a.d.size();
    }

    @Override // defpackage.hb
    public final boolean d(int i, int i2) {
        return aeke.cj((afcs) this.a.d.get(i), (afcs) this.b.get(i2));
    }

    @Override // defpackage.hb
    public final boolean e(int i, int i2) {
        return aeke.cj((afcs) this.a.d.get(i), (afcs) this.b.get(i2));
    }
}
