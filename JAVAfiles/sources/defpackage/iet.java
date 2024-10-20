package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iet extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Instant c;
    public Instant d;
    final /* synthetic */ iql e;
    public iql f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iet(iql iqlVar, arpe arpeVar) {
        super(arpeVar);
        this.e = iqlVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
