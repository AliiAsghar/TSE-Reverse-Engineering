package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvj extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ lvu c;
    int d;
    lvu e;
    UUID f;
    Duration g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvj(lvu lvuVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lvuVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
