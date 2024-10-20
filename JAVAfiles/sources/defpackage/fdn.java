package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdn implements fdu {
    public final long a;
    public final List b;
    public final Set c;
    public final Set d;
    public int e;
    public fdj f;
    public fdj g;
    public Looper h;
    public Handler i;
    public byte[] j;
    volatile fdk k;
    public final fez l;
    private final UUID n;
    private final HashMap o;
    private final int[] p;
    private fdy q;
    private fbz r;
    private final fvq s;
    private final qdq t;

    public fdn(UUID uuid, fvq fvqVar, HashMap hashMap, int[] iArr) {
        d.t(!eqc.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.s = fvqVar;
        this.o = hashMap;
        this.p = iArr;
        this.l = new fez(null);
        this.t = new qdq(this, null);
        this.b = new ArrayList();
        this.c = alzz.O();
        this.d = alzz.O();
        this.a = 300000L;
    }

    private static List i(eqj eqjVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(eqjVar.b);
        for (int i = 0; i < eqjVar.b; i++) {
            eqi a = eqjVar.a(i);
            if ((a.a(uuid) || (eqc.c.equals(uuid) && a.a(eqc.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final synchronized void j(Looper looper) {
        boolean z;
        Looper looper2 = this.h;
        if (looper2 == null) {
            this.h = looper;
            this.i = new Handler(looper);
            return;
        }
        if (looper2 == looper) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        dzg.g(this.i);
    }

    private final void k() {
        aluq listIterator = alpt.o(this.d).listIterator();
        while (listIterator.hasNext()) {
            ((fdp) listIterator.next()).o(null);
        }
    }

    private final void l() {
        aluq listIterator = alpt.o(this.c).listIterator();
        while (listIterator.hasNext()) {
            ((fdm) listIterator.next()).a();
        }
    }

    private final void m(boolean z) {
        if (z && this.h == null) {
            eub.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.h;
        dzg.g(looper);
        if (currentThread != looper.getThread()) {
            eub.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.h.getThread().getName(), new IllegalStateException());
        }
    }

    private static boolean n(fdp fdpVar) {
        if (fdpVar.a() != 1) {
            return false;
        }
        fdo c = fdpVar.c();
        dzg.g(c);
        Throwable cause = c.getCause();
        if (!(cause instanceof ResourceBusyException) && !edz.w(cause)) {
            return false;
        }
        return true;
    }

    private final fdj o(List list, boolean z, apuv apuvVar) {
        dzg.g(this.q);
        fdy fdyVar = this.q;
        byte[] bArr = this.j;
        Looper looper = this.h;
        dzg.g(looper);
        fbz fbzVar = this.r;
        dzg.g(fbzVar);
        HashMap hashMap = this.o;
        fvq fvqVar = this.s;
        fdj fdjVar = new fdj(this.n, fdyVar, this.l, this.t, list, true, z, bArr, hashMap, fvqVar, looper, fbzVar);
        fdjVar.n(apuvVar);
        fdjVar.n(null);
        return fdjVar;
    }

    private final fdj p(List list, boolean z, apuv apuvVar, boolean z2) {
        fdj o = o(list, z, apuvVar);
        if (n(o) && !this.d.isEmpty()) {
            k();
            q(o, apuvVar);
            o = o(list, z, apuvVar);
        }
        if (n(o) && z2 && !this.c.isEmpty()) {
            l();
            if (!this.d.isEmpty()) {
                k();
            }
            q(o, apuvVar);
            return o(list, z, apuvVar);
        }
        return o;
    }

    private static final void q(fdp fdpVar, apuv apuvVar) {
        fdpVar.o(apuvVar);
        fdpVar.o(null);
    }

    @Override // defpackage.fdu
    public final int a(eqn eqnVar) {
        m(false);
        fdy fdyVar = this.q;
        dzg.g(fdyVar);
        int a = fdyVar.a();
        eqj eqjVar = eqnVar.s;
        if (eqjVar == null) {
            if (eul.p(this.p, erl.b(eqnVar.o)) == -1) {
                return 0;
            }
            return a;
        }
        if (this.j == null) {
            if (i(eqjVar, this.n, true).isEmpty()) {
                if (eqjVar.b == 1 && eqjVar.a(0).a(eqc.b)) {
                    eub.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(this.n.toString()));
                }
                return 1;
            }
            String str = eqjVar.a;
            if (str != null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    int i = eul.a;
                } else if ("cbc1".equals(str) || "cens".equals(str)) {
                    return 1;
                }
            }
        }
        return a;
    }

    public final void b() {
        if (this.q != null && this.e == 0 && this.b.isEmpty() && this.c.isEmpty()) {
            fdy fdyVar = this.q;
            dzg.g(fdyVar);
            fdyVar.g();
            this.q = null;
        }
    }

    @Override // defpackage.fdu
    public final void c() {
        fdy fdvVar;
        m(true);
        int i = this.e;
        this.e = i + 1;
        if (i == 0) {
            if (this.q == null) {
                UUID uuid = this.n;
                try {
                    fdvVar = feb.o(uuid);
                } catch (fee unused) {
                    eub.c("FrameworkMediaDrm", a.bX(uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: ", "."));
                    fdvVar = new fdv();
                }
                this.q = fdvVar;
                fdvVar.n(new qdq(this, null));
                return;
            }
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                ((fdj) this.b.get(i2)).n(null);
            }
        }
    }

    @Override // defpackage.fdu
    public final void d() {
        m(true);
        int i = this.e - 1;
        this.e = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((fdj) arrayList.get(i2)).o(null);
        }
        l();
        b();
    }

    @Override // defpackage.fdu
    public final void e(Looper looper, fbz fbzVar) {
        j(looper);
        this.r = fbzVar;
    }

    @Override // defpackage.fdu
    public final fdp f(apuv apuvVar, eqn eqnVar) {
        boolean z = false;
        m(false);
        if (this.e > 0) {
            z = true;
        }
        dzg.d(z);
        dzg.h(this.h);
        return g(this.h, apuvVar, eqnVar, true);
    }

    public final fdp g(Looper looper, apuv apuvVar, eqn eqnVar, boolean z) {
        if (this.k == null) {
            this.k = new fdk(this, looper);
        }
        eqj eqjVar = eqnVar.s;
        List list = null;
        if (eqjVar == null) {
            int b = erl.b(eqnVar.o);
            fdy fdyVar = this.q;
            dzg.g(fdyVar);
            if ((fdyVar.a() == 2 && fdz.a) || eul.p(this.p, b) == -1 || fdyVar.a() == 1) {
                return null;
            }
            fdj fdjVar = this.f;
            if (fdjVar == null) {
                int i = alog.d;
                fdj p = p(alsx.a, true, null, z);
                this.b.add(p);
                this.f = p;
            } else {
                fdjVar.n(null);
            }
            return this.f;
        }
        if (this.j == null) {
            list = i(eqjVar, this.n, false);
            if (list.isEmpty()) {
                fdl fdlVar = new fdl(this.n);
                eub.d("DefaultDrmSessionMgr", "DRM error", fdlVar);
                apuvVar.A(fdlVar);
                return new fdw(new fdo(fdlVar, 6003));
            }
        }
        fdj fdjVar2 = this.g;
        if (fdjVar2 == null) {
            fdj p2 = p(list, false, apuvVar, z);
            this.g = p2;
            this.b.add(p2);
            return p2;
        }
        fdjVar2.n(apuvVar);
        return fdjVar2;
    }

    @Override // defpackage.fdu
    public final fdt h(apuv apuvVar, eqn eqnVar) {
        boolean z;
        if (this.e > 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        dzg.h(this.h);
        fdm fdmVar = new fdm(this, apuvVar);
        Handler handler = fdmVar.c.i;
        dzg.g(handler);
        handler.post(new ewq(fdmVar, eqnVar, 17, null));
        return fdmVar;
    }
}
