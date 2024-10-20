package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwc extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ lwh b;
    int c;
    lwh d;
    UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwc(lwh lwhVar, arpe arpeVar) {
        super(arpeVar);
        this.b = lwhVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
