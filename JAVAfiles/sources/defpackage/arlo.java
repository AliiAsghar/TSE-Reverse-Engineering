package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arlo extends apzj {
    final /* synthetic */ arlp d;
    private final aqvr e;
    private final arlm f;
    private boolean g;
    private boolean h;
    private Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arlo(arlp arlpVar, arlm arlmVar, aqvr aqvrVar) {
        super(null);
        this.d = arlpVar;
        this.g = true;
        this.e = aqvrVar;
        this.f = arlmVar;
    }

    @Override // defpackage.apzj
    public final void a() {
        this.f.b = true;
    }

    @Override // defpackage.apzj
    public final void c() {
        if (this.g) {
            Object obj = this.i;
            if (obj == null) {
                this.e.a(Status.m.withDescription("Half-closed without a request"), new aqut());
                return;
            }
            arlp arlpVar = this.d;
            arlpVar.a.a(obj, this.f);
            this.i = null;
            if (this.h) {
                e();
            }
        }
    }

    @Override // defpackage.apzj
    public final void d(Object obj) {
        if (this.i != null) {
            this.e.a(Status.m.withDescription("Too many requests"), new aqut());
            this.g = false;
        } else {
            this.i = obj;
        }
    }

    @Override // defpackage.apzj
    public final void e() {
        this.h = true;
    }

    @Override // defpackage.apzj
    public final void b() {
    }
}
