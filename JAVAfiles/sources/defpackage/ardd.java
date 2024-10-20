package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ardd extends araw {
    final /* synthetic */ Status a;
    final /* synthetic */ apsd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ardd(arde ardeVar, apsd apsdVar, Status status) {
        super(ardeVar.a);
        this.b = apsdVar;
        this.a = status;
    }

    @Override // defpackage.araw
    public final void a() {
        this.b.a(this.a, new aqut());
    }
}
