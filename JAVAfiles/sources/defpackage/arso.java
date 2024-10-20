package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arso extends arst {
    @Override // defpackage.arst
    public final int a(int i) {
        return arrj.c(d().nextInt(), i);
    }

    @Override // defpackage.arst
    public final int b() {
        return d().nextInt();
    }

    @Override // defpackage.arst
    public final long c() {
        return d().nextLong();
    }

    public abstract Random d();

    @Override // defpackage.arst
    public final int e() {
        return d().nextInt(2147418112);
    }
}
