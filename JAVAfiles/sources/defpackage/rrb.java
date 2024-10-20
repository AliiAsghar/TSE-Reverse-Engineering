package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class rrb extends rrc {
    private static final AtomicLong a = new AtomicLong(System.currentTimeMillis() * 1000);
    private String b;
    private rqz c;
    private boolean d;

    @Override // defpackage.rrc
    public final rqz a() {
        boolean z;
        rqz rqzVar;
        if (g() && (rqzVar = this.c) != null) {
            return rqzVar;
        }
        Boolean valueOf = Boolean.valueOf(g());
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        throw new IllegalStateException(String.format("isBound=%s data==null=%s when getData()", valueOf, Boolean.valueOf(z)));
    }

    @Override // defpackage.rrc
    public final String b() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("not bound when getBindingId");
    }

    public void c(rqz rqzVar) {
        if (this.c == null && !rqzVar.h()) {
            String hexString = Long.toHexString(a.getAndIncrement());
            this.b = hexString;
            this.c = rqzVar;
            rqzVar.e(hexString);
            this.d = true;
            return;
        }
        throw new IllegalStateException("already bound when binding to ".concat(rqzVar.toString()));
    }

    @Override // defpackage.rrc
    public final void d() {
        if (g()) {
            return;
        }
        throw new IllegalStateException("not bound; wasBound = " + this.d);
    }

    @Override // defpackage.rrc
    public final void e(rqz rqzVar) {
        if (g()) {
            if (rqzVar == this.c) {
                return;
            }
            throw new IllegalStateException("not bound to correct data " + rqzVar.toString() + " vs " + String.valueOf(this.c));
        }
        throw new IllegalStateException("not bound; wasBound = " + this.d);
    }

    public final void f() {
        String str;
        rqz rqzVar = this.c;
        if (rqzVar != null && (str = this.b) != null && rqzVar.i(str)) {
            this.c.f(this.b);
            this.c = null;
            this.b = null;
            return;
        }
        throw new IllegalStateException("not bound when unbind");
    }

    @Override // defpackage.rrc
    public final boolean g() {
        String str;
        rqz rqzVar = this.c;
        if (rqzVar != null && (str = this.b) != null && rqzVar.i(str)) {
            return true;
        }
        return false;
    }
}
