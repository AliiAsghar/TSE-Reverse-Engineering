package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdm implements xye {
    private final ngu a;

    public mdm(ngu nguVar) {
        nguVar.getClass();
        this.a = nguVar;
    }

    @Override // defpackage.xye
    public final void e() {
        ngu nguVar = this.a;
        ((alwl) ((aluw) nguVar.a).d()).q("Generating new sequence ID");
        nguVar.b = UUID.randomUUID().toString();
    }

    @Override // defpackage.xye
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.xye
    public final /* synthetic */ void h() {
    }
}
