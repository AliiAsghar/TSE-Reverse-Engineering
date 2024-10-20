package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvy extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ lwh c;
    int d;
    lwh e;
    UUID f;
    Duration g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvy(lwh lwhVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lwhVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
