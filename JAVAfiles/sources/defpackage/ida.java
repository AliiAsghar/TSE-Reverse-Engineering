package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ida extends arps {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ idb d;
    int e;
    idb f;
    UUID g;
    aozy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ida(idb idbVar, arpe arpeVar) {
        super(arpeVar);
        this.d = idbVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
