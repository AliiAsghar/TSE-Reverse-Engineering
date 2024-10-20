package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lum extends arps {
    public /* synthetic */ Object a;
    public int b;
    public UUID c;
    final /* synthetic */ jat d;
    public jat e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lum(jat jatVar, arpe arpeVar) {
        super(arpeVar);
        this.d = jatVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.m(null, this);
    }
}
