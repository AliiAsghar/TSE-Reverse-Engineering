package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arxc extends arwx implements arwm {
    private final arvb a;
    public final arve c = new arve(null, arvf.a);
    public final arve d;

    public arxc() {
        arvf arvfVar = arvf.a;
        this.d = new arve(null, arvfVar);
        this.a = new arvb(false, arvfVar);
    }

    private final boolean A(Runnable runnable) {
        while (true) {
            Object obj = this.c.a;
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (this.c.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof asfg) {
                asfg asfgVar = (asfg) obj;
                int a = asfgVar.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    return false;
                }
                this.c.d(obj, asfgVar.c());
            } else {
                if (obj == arxd.b) {
                    return false;
                }
                asfg asfgVar2 = new asfg(8, true);
                asfgVar2.a((Runnable) obj);
                asfgVar2.a(runnable);
                if (this.c.d(obj, asfgVar2)) {
                    return true;
                }
            }
        }
    }

    private final void z() {
        asfs asfsVar;
        arxb arxbVar = (arxb) this.d.a;
        if (arxbVar != null && !arxbVar.g()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (arxbVar) {
                    asfs b = arxbVar.b();
                    asfsVar = null;
                    if (b != null) {
                        arxa arxaVar = (arxa) b;
                        if (nanoTime - arxaVar.b >= 0 && A(arxaVar)) {
                            asfsVar = arxbVar.d(0);
                        }
                    }
                }
            } while (((arxa) asfsVar) != null);
        }
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        i(runnable);
    }

    public arwu c(long j, Runnable runnable, arpi arpiVar) {
        return arwk.a.c(j, runnable, arpiVar);
    }

    @Override // defpackage.arwm
    public final void d(long j, arvo arvoVar) {
        long a = arxd.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            arwy arwyVar = new arwy(this, a + nanoTime, arvoVar);
            w(nanoTime, arwyVar);
            arrn.F(arvoVar, arwyVar);
        }
    }

    public void i(Runnable runnable) {
        z();
        if (A(runnable)) {
            s();
        } else {
            arwj.a.i(runnable);
        }
    }

    @Override // defpackage.arwx
    public void k() {
        asfs asfsVar;
        ThreadLocal threadLocal = aryl.a;
        aryl.a.set(null);
        this.a.b = 1;
        boolean z = arwh.a;
        while (true) {
            Object obj = this.c.a;
            if (obj == null) {
                if (this.c.d(null, arxd.b)) {
                    break;
                }
            } else if (obj instanceof asfg) {
                ((asfg) obj).d();
                break;
            } else {
                if (obj == arxd.b) {
                    break;
                }
                asfg asfgVar = new asfg(8, true);
                asfgVar.a((Runnable) obj);
                if (this.c.d(obj, asfgVar)) {
                    break;
                }
            }
        }
        do {
        } while (l() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            arxb arxbVar = (arxb) this.d.a;
            if (arxbVar != null) {
                synchronized (arxbVar) {
                    if (arxbVar.a() > 0) {
                        asfsVar = arxbVar.d(0);
                    } else {
                        asfsVar = null;
                    }
                }
                arxa arxaVar = (arxa) asfsVar;
                if (arxaVar != null) {
                    j(nanoTime, arxaVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.arwx
    public final long l() {
        Runnable runnable;
        long j;
        arxa arxaVar;
        if (r()) {
            return 0L;
        }
        z();
        arve arveVar = this.c;
        while (true) {
            Object obj = arveVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof asfg) {
                asfg asfgVar = (asfg) obj;
                Object b = asfgVar.b();
                if (b != asfg.a) {
                    runnable = (Runnable) b;
                    break;
                }
                this.c.d(obj, asfgVar.c());
            } else {
                if (obj == arxd.b) {
                    break;
                }
                if (this.c.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable == null) {
            arnr arnrVar = this.b;
            if (arnrVar == null || arnrVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j == 0) {
                return 0L;
            }
            Object obj2 = this.c.a;
            if (obj2 != null) {
                if (obj2 instanceof asfg) {
                    if (!((asfg) obj2).e()) {
                        return 0L;
                    }
                } else {
                    if (obj2 != arxd.b) {
                        return 0L;
                    }
                    return Long.MAX_VALUE;
                }
            }
            arxb arxbVar = (arxb) this.d.a;
            if (arxbVar != null && (arxaVar = (arxa) arxbVar.c()) != null) {
                return arrn.v(arxaVar.b - System.nanoTime(), 0L);
            }
            return Long.MAX_VALUE;
        }
        runnable.run();
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final arwu v(long j, Runnable runnable) {
        long a = arxd.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            arwz arwzVar = new arwz(a + nanoTime, runnable);
            w(nanoTime, arwzVar);
            return arwzVar;
        }
        return aryd.a;
    }

    public final void w(long j, arxa arxaVar) {
        if (!x()) {
            arxb arxbVar = (arxb) this.d.a;
            arxa arxaVar2 = null;
            if (arxbVar == null) {
                this.d.d(null, new arxb(j));
                Object obj = this.d.a;
                obj.getClass();
                arxbVar = (arxb) obj;
            }
            synchronized (arxaVar) {
                if (arxaVar._heap != arxd.a) {
                    synchronized (arxbVar) {
                        arxa arxaVar3 = (arxa) arxbVar.b();
                        if (!x()) {
                            if (arxaVar3 == null) {
                                arxbVar.a = j;
                            } else {
                                long j2 = arxaVar3.b;
                                if (j2 - j < 0) {
                                    j = j2;
                                }
                                long j3 = arxbVar.a;
                                if (j - j3 > 0) {
                                    arxbVar.a = j;
                                } else {
                                    j = j3;
                                }
                            }
                            if (arxaVar.b - j < 0) {
                                arxaVar.b = j;
                            }
                            boolean z = arwh.a;
                            arxaVar.d(arxbVar);
                            asfs[] asfsVarArr = arxbVar.b;
                            if (asfsVarArr == null) {
                                asfsVarArr = new asfs[4];
                                arxbVar.b = asfsVarArr;
                            } else if (arxbVar.a() >= asfsVarArr.length) {
                                int a = arxbVar.a();
                                Object[] copyOf = Arrays.copyOf(asfsVarArr, a + a);
                                copyOf.getClass();
                                asfsVarArr = (asfs[]) copyOf;
                                arxbVar.b = asfsVarArr;
                            }
                            int a2 = arxbVar.a();
                            arxbVar.e(a2 + 1);
                            asfsVarArr[a2] = arxaVar;
                            arxaVar.e(a2);
                            arxbVar.f(a2);
                            arxb arxbVar2 = (arxb) this.d.a;
                            if (arxbVar2 != null) {
                                arxaVar2 = (arxa) arxbVar2.c();
                            }
                            if (arxaVar2 == arxaVar) {
                                s();
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        j(j, arxaVar);
    }

    public final boolean x() {
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean y() {
        if (!q()) {
            return false;
        }
        arxb arxbVar = (arxb) this.d.a;
        if (arxbVar != null && !arxbVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        if (obj == null) {
            return true;
        }
        if (obj instanceof asfg) {
            return ((asfg) obj).e();
        }
        if (obj != arxd.b) {
            return false;
        }
        return true;
    }
}
