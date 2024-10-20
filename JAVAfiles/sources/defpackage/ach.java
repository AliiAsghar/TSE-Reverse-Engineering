package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ach<T, V extends zz> implements acg<T, V> {
    public final arqr a;
    public final arqr b;

    public ach(arqr arqrVar, arqr arqrVar2) {
        this.a = arqrVar;
        this.b = arqrVar2;
    }

    @Override // defpackage.acg
    public final arqr a() {
        return this.b;
    }

    @Override // defpackage.acg
    public final arqr b() {
        return this.a;
    }
}
