package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolj extends apsd {
    public boolean a;
    public final /* synthetic */ aoln b;
    public final apsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aolj(aoln aolnVar, apsd apsdVar) {
        super(null);
        this.b = aolnVar;
        this.a = false;
        this.c = apsdVar;
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        this.b.a.execute(new aofo(this, status, aqutVar, 10, (byte[]) null));
    }

    @Override // defpackage.apsd
    public final void c(aqut aqutVar) {
        this.b.a.execute(new aofk(this, aqutVar, 16));
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        this.b.a.execute(new aofk(this, obj, 17));
    }

    @Override // defpackage.apsd
    public final void e() {
        this.b.a.execute(new akwm(this, 20));
    }
}
