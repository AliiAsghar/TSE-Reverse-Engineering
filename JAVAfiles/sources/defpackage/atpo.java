package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpo implements atoo {
    public final atox a;
    private final atqn b;
    private final Object[] c;
    private final aslf d;
    private volatile boolean e;
    private Throwable f;
    private boolean g;
    private asnh h;

    public atpo(atqn atqnVar, Object[] objArr, aslf aslfVar, atox atoxVar) {
        this.b = atqnVar;
        this.c = objArr;
        this.d = aslfVar;
        this.a = atoxVar;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List, java.lang.Object] */
    private final asnh g() {
        aslx i;
        asmk asmcVar;
        atqn atqnVar = this.b;
        atqh[] atqhVarArr = atqnVar.j;
        Object[] objArr = this.c;
        int length = objArr.length;
        int length2 = atqhVarArr.length;
        if (length == length2) {
            atql atqlVar = new atql(atqnVar.c, atqnVar.b, atqnVar.d, atqnVar.e, atqnVar.f, atqnVar.g, atqnVar.h, atqnVar.i);
            if (atqnVar.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                atqhVarArr[i2].a(atqlVar, objArr[i2]);
            }
            aslw aslwVar = atqlVar.f;
            if (aslwVar != null) {
                i = aslwVar.a();
            } else {
                i = atqlVar.d.i(atqlVar.e);
                if (i == null) {
                    aslx aslxVar = atqlVar.d;
                    throw new IllegalArgumentException("Malformed URL. Base: " + aslxVar.g + ", Relative: " + atqlVar.e);
                }
            }
            asmk asmkVar = atqlVar.k;
            if (asmkVar == null) {
                asmb asmbVar = atqlVar.l;
                if (asmbVar != null) {
                    asmcVar = new asls(asmbVar.a, asmbVar.b);
                } else {
                    asma asmaVar = atqlVar.j;
                    if (asmaVar != null) {
                        if (!asmaVar.c.isEmpty()) {
                            asmcVar = new asmc((asqx) asmaVar.a, (aslz) asmaVar.b, asmt.n(asmaVar.c));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (atqlVar.i) {
                        asmkVar = aotl.am(new byte[0]);
                    }
                }
                asmkVar = asmcVar;
            }
            aslz aslzVar = atqlVar.h;
            if (aslzVar != null) {
                if (asmkVar != null) {
                    asmkVar = new atqk(asmkVar, aslzVar);
                } else {
                    atqlVar.m.i(assi.a, aslzVar.c);
                }
            }
            aslf aslfVar = this.d;
            asmg asmgVar = atqlVar.g;
            asmgVar.f(i);
            asmgVar.c = atqlVar.m.h().e();
            asmgVar.d(atqlVar.c, asmkVar);
            asmgVar.e(atpg.class, new atpg(atqnVar.a, arrayList));
            return new asnh((asme) aslfVar, asmgVar.a());
        }
        throw new IllegalArgumentException(a.cl(length2, length, "Argument count (", ") doesn't match expected count (", ")"));
    }

    private final asnh h() {
        asnh asnhVar = this.h;
        if (asnhVar != null) {
            return asnhVar;
        }
        Throwable th = this.f;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            asnh g = g();
            this.h = g;
            return g;
        } catch (IOException | Error | RuntimeException e) {
            atqx.m(e);
            this.f = e;
            throw e;
        }
    }

    @Override // defpackage.atoo
    public final synchronized asmh a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return h().b;
    }

    @Override // defpackage.atoo
    public final void c() {
        asnh asnhVar;
        this.e = true;
        synchronized (this) {
            asnhVar = this.h;
        }
        if (asnhVar != null) {
            asnhVar.f();
        }
    }

    @Override // defpackage.atoo
    public final void d(ator atorVar) {
        asnh asnhVar;
        Throwable th;
        asne asneVar;
        synchronized (this) {
            if (!this.g) {
                this.g = true;
                asnhVar = this.h;
                th = this.f;
                if (asnhVar == null && th == null) {
                    try {
                        asnh g = g();
                        this.h = g;
                        asnhVar = g;
                    } catch (Throwable th2) {
                        th = th2;
                        atqx.m(th);
                        this.f = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            atorVar.b(th);
            return;
        }
        if (this.e) {
            asnhVar.f();
        }
        atpk atpkVar = new atpk(this, atorVar);
        if (asnhVar.f.compareAndSet(false, true)) {
            asnhVar.g = aspx.b.g();
            aslo asloVar = asnhVar.a.c;
            asne asneVar2 = new asne(asnhVar, atpkVar);
            synchronized (asloVar) {
                asloVar.a.add(asneVar2);
                String a = asneVar2.a();
                Iterator it = asloVar.b.iterator();
                it.getClass();
                while (true) {
                    if (it.hasNext()) {
                        asneVar = (asne) it.next();
                        if (d.F(asneVar.a(), a)) {
                            break;
                        }
                    } else {
                        Iterator it2 = asloVar.a.iterator();
                        it2.getClass();
                        while (true) {
                            if (it2.hasNext()) {
                                asneVar = (asne) it2.next();
                                if (d.F(asneVar.a(), a)) {
                                    break;
                                }
                            } else {
                                asneVar = null;
                                break;
                            }
                        }
                    }
                }
                if (asneVar != null) {
                    asneVar2.a = asneVar.a;
                }
            }
            asloVar.c();
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // defpackage.atoo
    public final boolean e() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            asnh asnhVar = this.h;
            if (asnhVar == null || !asnhVar.n) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.atoo
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final atpo clone() {
        return new atpo(this.b, this.c, this.d, this.a);
    }
}
