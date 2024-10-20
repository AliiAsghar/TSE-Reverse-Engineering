package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtx extends unp {
    public static final alwo a;
    public static final alor b;
    public final vsh c;
    public final agnq d;
    private final aneo e;
    private final anen f;

    static {
        uuh.f(uuh.b, "rcs_service_connection_wait_timeout_for_pwq", 3000L);
        a = alwo.o("BugleGroupManagement");
        b = alor.l(new vmc(10), vtl.NAME_CHANGE);
    }

    public vtx(aneo aneoVar, anen anenVar, vsh vshVar, agnq agnqVar) {
        this.e = aneoVar;
        this.f = anenVar;
        this.c = vshVar;
        this.d = agnqVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("GroupSessionStartedHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        vty vtyVar = (vty) apbtVar;
        return aktp.aj(new vbo(vtyVar, 5), this.f).h(new wzv(this, vtyVar.c, vtyVar, 1), this.e).f(TimeoutException.class, new uva(15), this.f).f(ajny.class, new uva(16), this.f);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vty.a.getParserForType();
    }
}
