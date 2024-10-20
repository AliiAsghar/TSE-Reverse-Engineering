package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxk extends arps {
    int a;
    int b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ lxo e;
    int f;
    lxo g;
    apct h;
    UUID i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxk(lxo lxoVar, arpe arpeVar) {
        super(arpeVar);
        this.e = lxoVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
