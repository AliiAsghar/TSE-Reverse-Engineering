package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arab extends araw {
    final /* synthetic */ String a;
    final /* synthetic */ apsd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arab(arai araiVar, apsd apsdVar, String str) {
        super(araiVar.e);
        this.b = apsdVar;
        this.a = str;
    }

    @Override // defpackage.araw
    public final void a() {
        this.b.a(Status.m.withDescription(String.format("Unable to find compressor by name %s", this.a)), new aqut());
    }
}
