package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvp extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ lvu b;
    int c;
    lvu d;
    UUID e;
    lwz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvp(lvu lvuVar, arpe arpeVar) {
        super(arpeVar);
        this.b = lvuVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
