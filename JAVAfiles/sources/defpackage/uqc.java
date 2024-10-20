package defpackage;

import androidx.work.WorkerParameters;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqc extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ uqd c;
    int d;
    WorkerParameters e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqc(uqd uqdVar, arpe arpeVar) {
        super(arpeVar);
        this.c = uqdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
