package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbb extends araw {
    final Status a;
    final apsd b;

    public arbb(arbd arbdVar, apsd apsdVar, Status status) {
        super(arbdVar.a);
        this.b = apsdVar;
        this.a = status;
    }

    @Override // defpackage.araw
    public final void a() {
        this.b.a(this.a, new aqut());
    }
}
