package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argp extends araw {
    final /* synthetic */ Status a;
    final /* synthetic */ argt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argp(argt argtVar, Status status) {
        super(argtVar.a);
        this.a = status;
        this.b = argtVar;
    }

    @Override // defpackage.araw
    public final void a() {
        int i = armc.a;
        this.b.c().a(this.a);
    }
}
