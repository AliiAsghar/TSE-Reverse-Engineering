package defpackage;

import com.google.gson.internal.Excluder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aooz extends aoon {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aonx c;
    final /* synthetic */ aorn d;
    final /* synthetic */ Excluder e;
    private volatile aoon f;

    public aooz(Excluder excluder, boolean z, boolean z2, aonx aonxVar, aorn aornVar) {
        this.a = z;
        this.b = z2;
        this.c = aonxVar;
        this.d = aornVar;
        this.e = excluder;
    }

    private final aoon c() {
        aoon aoonVar = this.f;
        if (aoonVar != null) {
            return aoonVar;
        }
        aoon c = this.c.c(this.e, this.d);
        this.f = c;
        return c;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        if (this.a) {
            aoroVar.q();
            return null;
        }
        return c().a(aoroVar);
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        if (this.b) {
            aorpVar.j();
        } else {
            c().b(aorpVar, obj);
        }
    }
}
