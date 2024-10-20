package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.ViewOutlineProvider;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class las extends qw {
    public final apwt c;
    public final apwt d;
    public final akgu e;
    public kxn f;
    public lat g;
    public zmq h;
    private final armf i;
    private lay j;

    public las(armf armfVar, apwt apwtVar, apwt apwtVar2, akgu akguVar) {
        super(0, 48);
        this.i = armfVar;
        this.c = apwtVar2;
        this.d = apwtVar;
        this.e = akguVar;
    }

    private final lay r(int i) {
        if (this.h != null) {
            if (i == 4) {
                Map map = (Map) this.c.b();
                zmp b = zmp.b(this.h.c);
                if (b == null) {
                    b = zmp.ARCHIVE;
                }
                return (lay) map.get(b);
            }
            if (i == 8) {
                Map map2 = (Map) this.c.b();
                zmp b2 = zmp.b(this.h.d);
                if (b2 == null) {
                    b2 = zmp.ARCHIVE;
                }
                return (lay) map2.get(b2);
            }
            return null;
        }
        return null;
    }

    private final lbb s(int i) {
        lay r = r(i);
        if (r == null) {
            return null;
        }
        return r.a();
    }

    private final void t(oo ooVar, lba lbaVar) {
        Object apply;
        SelectedConversation J = this.f.J(ooVar);
        if (J != null) {
            apply = lbaVar.a.apply(J);
            lbaVar.c((atal) apply);
        }
    }

    private final boolean u(oo ooVar, zmp zmpVar) {
        if (zmpVar == zmp.NONE) {
            return false;
        }
        if (zmpVar != zmp.MARK_AS_READ_OR_UNREAD) {
            return true;
        }
        SelectedConversation J = this.f.J(ooVar);
        if (J == null || J.o == 4) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qs
    public final float a(float f) {
        return f * 5.0f;
    }

    @Override // defpackage.qs
    public final void g(Canvas canvas, RecyclerView recyclerView, oo ooVar, float f, float f2, int i, boolean z) {
        lay layVar;
        lay layVar2 = null;
        if (this.h != null) {
            if (f < brg.a) {
                Map map = (Map) this.c.b();
                zmp b = zmp.b(this.h.c);
                if (b == null) {
                    b = zmp.ARCHIVE;
                }
                layVar2 = (lay) map.get(b);
            } else if (f > brg.a) {
                Map map2 = (Map) this.c.b();
                zmp b2 = zmp.b(this.h.d);
                if (b2 == null) {
                    b2 = zmp.ARCHIVE;
                }
                layVar2 = (lay) map2.get(b2);
            }
        }
        if (layVar2 != null) {
            this.j = layVar2;
        }
        if (this.g.a && (layVar = this.j) != null) {
            layVar.a().b(canvas, recyclerView, ooVar, f, z);
            super.g(canvas, recyclerView, ooVar, f, f2, i, z);
        }
    }

    @Override // defpackage.qs
    public final void h(oo ooVar, int i) {
        lay r = r(i);
        r.getClass();
        if (this.g.a) {
            SelectedConversation J = this.f.J(ooVar);
            if (J != null) {
                r.b(ooVar, J);
            }
            ooVar.a.setClipToOutline(false);
            ooVar.a.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
    }

    @Override // defpackage.qs
    public final boolean j() {
        lat latVar = this.g;
        if (latVar != null && latVar.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qs
    public final boolean n(oo ooVar, oo ooVar2) {
        return false;
    }

    @Override // defpackage.qs
    public final void o(oo ooVar) {
        if (ooVar != null) {
            lbb s = s(16);
            if (s instanceof lba) {
                t(ooVar, (lba) s);
            }
            lbb s2 = s(32);
            if (s2 instanceof lba) {
                t(ooVar, (lba) s2);
            }
        }
    }

    @Override // defpackage.qw, defpackage.qs
    public final int p(oo ooVar) {
        int f;
        akrc b = ((aksr) this.i.b()).b("GetSwipeActionFlag");
        try {
            int i = this.b;
            int q = q(ooVar);
            zmq zmqVar = this.h;
            int i2 = 0;
            if (zmqVar != null && q != 0) {
                zmp b2 = zmp.b(zmqVar.c);
                if (b2 == null) {
                    b2 = zmp.ARCHIVE;
                }
                if (true == u(ooVar, b2)) {
                    i2 = 4;
                }
                zmp b3 = zmp.b(this.h.d);
                if (b3 == null) {
                    b3 = zmp.ARCHIVE;
                }
                if (u(ooVar, b3)) {
                    i2 |= 8;
                }
                f = f(i, i2);
                b.close();
                return f;
            }
            f = f(i, 0);
            b.close();
            return f;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qw
    public final int q(oo ooVar) {
        int i = ooVar.f;
        if (i != 2 && i != 0 && i != 3) {
            return this.a;
        }
        return 0;
    }
}
