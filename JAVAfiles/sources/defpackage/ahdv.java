package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdv implements ahdu {
    public final List a;
    public final int b;
    private final int c;

    public ahdv(int i, List list, int i2) {
        this.b = i;
        this.a = DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            d.s(i2 == -1);
        } else {
            d.s(i2 != -1);
        }
    }

    @Override // defpackage.ahdu
    public final /* synthetic */ ahcw a() {
        return ahji.aF(this);
    }

    @Override // defpackage.ahdu
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        albo.T(z);
        return this.c;
    }
}
