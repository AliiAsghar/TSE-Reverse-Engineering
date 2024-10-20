package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rju extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ rjx b;
    int c;
    rjx d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rju(rjx rjxVar, arpe arpeVar) {
        super(arpeVar);
        this.b = rjxVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
