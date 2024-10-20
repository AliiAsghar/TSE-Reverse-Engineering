package defpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alvo implements alvw, alwv {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private alvn d;
    private alvr e;
    private alwe f;
    private alxx g;
    private Object[] h;

    /* JADX INFO: Access modifiers changed from: protected */
    public alvo(Level level) {
        long b = alxu.b();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.b = level;
        this.c = b;
    }

    private final void aa(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof alvj) {
                objArr[i] = ((alvj) obj).a();
            }
        }
        if (str != a) {
            this.g = new alxx(b(), str);
        }
        alzk k = alxu.k();
        if (!k.b()) {
            alzk alzkVar = (alzk) i().d(alvm.h);
            if (alzkVar != null) {
                k = k.a(alzkVar);
            }
            n(alvm.h, k);
        }
        aluw a2 = a();
        try {
            alzx alzxVar = (alzx) alzx.a.get();
            int i2 = alzxVar.b + 1;
            alzxVar.b = i2;
            if (i2 != 0) {
                try {
                    if (i2 <= 100) {
                        a2.b.b(this);
                    } else {
                        aluw.k("unbounded recursion in log statement", this);
                    }
                    if (alzxVar != null) {
                        alzxVar.close();
                        return;
                    }
                    return;
                } finally {
                }
            }
            throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
        } catch (RuntimeException e) {
            try {
                a2.b.g(e, this);
            } catch (alwx e2) {
                throw e2;
            } catch (RuntimeException e3) {
                aluw.k(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean ab() {
        int i;
        boolean z = true;
        if (this.e == null) {
            this.e = alxu.g().a(alvo.class, 1);
        }
        alvs alvsVar = this.e;
        if (alvsVar != alvr.a) {
            alvn alvnVar = this.d;
            if (alvnVar != null && (i = alvnVar.b) > 0) {
                alvsVar.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (alvm.f.equals(alvnVar.c(i2))) {
                        Object e = alvnVar.e(i2);
                        if (e instanceof alvx) {
                            alvsVar = ((alvx) e).b();
                        } else {
                            alvsVar = new alwi(alvsVar, e);
                        }
                    }
                }
            }
        } else {
            alvsVar = null;
        }
        boolean c = c(alvsVar);
        alwe alweVar = this.f;
        if (alweVar != null) {
            alwd alwdVar = (alwd) alwd.a.b(alvsVar, this.d);
            int incrementAndGet = alwdVar.c.incrementAndGet();
            int i3 = -1;
            if (alweVar != alwe.c && alwdVar.b.compareAndSet(false, true)) {
                try {
                    alweVar.a();
                    alwdVar.b.set(false);
                    alwdVar.c.addAndGet(-incrementAndGet);
                    i3 = (-1) + incrementAndGet;
                } catch (Throwable th) {
                    alwdVar.b.set(false);
                    throw th;
                }
            }
            if (c && i3 > 0) {
                this.d.f(alvm.e, Integer.valueOf(i3));
            }
            if (i3 < 0) {
                z = false;
            }
            return c & z;
        }
        return c;
    }

    @Override // defpackage.alvw
    public final void A(String str, long j, Object obj) {
        if (ab()) {
            aa(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.alvw
    public final void B(String str, Object obj, int i) {
        if (ab()) {
            aa(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.alvw
    public final void C(String str, Object obj, long j) {
        if (ab()) {
            aa(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.alvw
    public final void D(String str, Object obj, Object obj2) {
        if (ab()) {
            aa(str, obj, obj2);
        }
    }

    @Override // defpackage.alvw
    public final void E(String str, Object obj, boolean z) {
        if (ab()) {
            aa(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.alvw
    public final void F(String str, boolean z, int i) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    @Override // defpackage.alvw
    public final void G(String str, boolean z, long j) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // defpackage.alvw
    public final void H(String str, boolean z, Object obj) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.alvw
    public final void I(String str, boolean z, boolean z2) {
        if (ab()) {
            aa(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.alvw
    public final void J(String str, Object obj, Object obj2, Object obj3) {
        if (ab()) {
            aa(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.alvw
    public final void K(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.alvw
    public final void L(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.alvw
    public final void M(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.alvw
    public final void N(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.alvw
    public final void O(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (ab()) {
            aa(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.alvw
    public final void P(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object... objArr) {
        if (ab()) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length + 10];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            System.arraycopy(objArr, 0, objArr2, 10, length);
            aa(str, objArr2);
        }
    }

    @Override // defpackage.alvw
    public final void Q(String str, Object[] objArr) {
        if (ab()) {
            aa(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.alvw
    public final boolean R() {
        if (!S() && !a().l(this.b)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.alwv
    public final boolean S() {
        if (this.d != null && Boolean.TRUE.equals(this.d.d(alvm.g))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alwv
    public final Object[] T() {
        if (this.g != null) {
            return this.h;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.alvw
    public final void U(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (ab()) {
            aa("Transition threw:\n   from: %s (%s)\n   from target: %s (%s)\n   to: %s (%s)\n   to target: %s (%s)\n   requestId: %s", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // defpackage.alvw
    public final void V(int i, TimeUnit timeUnit) {
        if (S()) {
            return;
        }
        n(alvm.d, new alva(i, timeUnit));
    }

    @Override // defpackage.alvw
    public final void W() {
        alvz alvzVar = alvm.b;
        if (S()) {
            return;
        }
        n(alvzVar, 100);
    }

    @Override // defpackage.alvw
    public final void X(alvz alvzVar, Object obj) {
        alvzVar.getClass();
        if (obj != null) {
            n(alvzVar, obj);
        }
    }

    @Override // defpackage.alvw
    public final void Y(alvr alvrVar) {
        if (this.e == null) {
            this.e = alvrVar;
        }
    }

    @Override // defpackage.alvw
    public final void Z(alwk alwkVar) {
        alwkVar.getClass();
        if (alwkVar != alwk.NONE) {
            n(alvm.i, alwkVar);
        }
    }

    protected abstract aluw a();

    protected abstract alzs b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [alwe] */
    /* JADX WARN: Type inference failed for: r14v10, types: [alwe] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [alwe] */
    /* JADX WARN: Type inference failed for: r14v9, types: [alwh] */
    /* JADX WARN: Type inference failed for: r3v9, types: [alwe] */
    public boolean c(alvs alvsVar) {
        int a2;
        int i;
        boolean z;
        alvb alvbVar;
        aluy aluyVar;
        ?? r14;
        int i2;
        alvn alvnVar = this.d;
        if (alvnVar != null) {
            if (alvsVar != null) {
                long j = this.c;
                alvt alvtVar = alvb.a;
                alva alvaVar = (alva) alvnVar.d(alvm.d);
                if (alvaVar == null) {
                    alvbVar = null;
                } else {
                    alvb alvbVar2 = (alvb) alvb.a.b(alvsVar, alvnVar);
                    if (j >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    alzz.c(z, "timestamp cannot be negative");
                    long j2 = alvbVar2.b.get();
                    if (j2 >= 0) {
                        long nanos = alvaVar.b.toNanos(alvaVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            alvbVar = alvb.c;
                        }
                    }
                    alvbVar2.b.compareAndSet(j2, -j);
                    alvbVar = alvbVar2;
                }
                alvn alvnVar2 = this.d;
                alvt alvtVar2 = aluy.a;
                if (((Integer) alvnVar2.d(alvm.b)) == null) {
                    aluyVar = null;
                } else {
                    aluy aluyVar2 = (aluy) aluy.a.b(alvsVar, alvnVar2);
                    AtomicLong atomicLong = aluyVar2.b;
                    aluyVar = aluyVar2;
                    if (atomicLong.incrementAndGet() < r4.intValue()) {
                        aluyVar = aluy.c;
                    }
                }
                alwe b = alwe.b(alvbVar, aluyVar);
                alvn alvnVar3 = this.d;
                alvt alvtVar3 = alwh.a;
                Integer num = (Integer) alvnVar3.d(alvm.c);
                if (num != null && num.intValue() > 0) {
                    r14 = (alwh) alwh.a.b(alvsVar, alvnVar3);
                    if (((Random) alwh.b.get()).nextInt(num.intValue()) == 0) {
                        i2 = r14.e.incrementAndGet();
                    } else {
                        i2 = r14.e.get();
                    }
                    if (i2 <= 0) {
                        r14 = alwh.c;
                    }
                } else {
                    r14 = 0;
                }
                alwe b2 = alwe.b(b, r14);
                this.f = b2;
                if (b2 == alwe.c) {
                    return false;
                }
            }
            alwk alwkVar = (alwk) this.d.d(alvm.i);
            if (alwkVar != null) {
                alvz alvzVar = alvm.i;
                alvn alvnVar4 = this.d;
                if (alvnVar4 != null && (a2 = alvnVar4.a(alvzVar)) >= 0) {
                    int i3 = a2 + a2;
                    int i4 = i3 + 2;
                    while (true) {
                        i = alvnVar4.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        Object obj = alvnVar4.a[i4];
                        if (!obj.equals(alvzVar)) {
                            Object[] objArr = alvnVar4.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    alvnVar4.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        alvnVar4.a[i3] = null;
                        i3++;
                    }
                }
                n(alvm.a, new alvu((Throwable) i().d(alvm.a), alwkVar, alzv.b(alvo.class, alwkVar.f, 1)));
            }
        }
        return true;
    }

    @Override // defpackage.alwv
    public final long d() {
        return this.c;
    }

    @Override // defpackage.alwv
    public final alvr e() {
        alvr alvrVar = this.e;
        if (alvrVar != null) {
            return alvrVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.alvw
    public final alvw f(String str) {
        X(alvm.f, str);
        return this;
    }

    @Override // defpackage.alvw
    public final alvw g(Throwable th) {
        X(alvm.a, th);
        return this;
    }

    @Override // defpackage.alvw
    public final alvw h(String str, String str2, int i, String str3) {
        Y(new alvq(str, str2, i, str3));
        return this;
    }

    @Override // defpackage.alwv
    public final alxa i() {
        alvn alvnVar = this.d;
        if (alvnVar != null) {
            return alvnVar;
        }
        return alwz.a;
    }

    @Override // defpackage.alwv
    public final alxx j() {
        return this.g;
    }

    @Override // defpackage.alwv
    public final Object k() {
        if (this.g == null) {
            return this.h[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override // defpackage.alwv
    public final String l() {
        return a().b.d();
    }

    @Override // defpackage.alwv
    public final Level m() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(alvz alvzVar, Object obj) {
        if (this.d == null) {
            this.d = new alvn();
        }
        this.d.f(alvzVar, obj);
    }

    @Override // defpackage.alvw
    public final void o() {
        if (ab()) {
            aa(a, "");
        }
    }

    @Override // defpackage.alvw
    public final void p(Object obj) {
        if (ab()) {
            aa("%s", obj);
        }
    }

    @Override // defpackage.alvw
    public final void q(String str) {
        if (ab()) {
            aa(a, str);
        }
    }

    @Override // defpackage.alvw
    public final void r(String str, int i) {
        if (ab()) {
            aa(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.alvw
    public final void s(String str, long j) {
        if (ab()) {
            aa(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.alvw
    public final void t(String str, Object obj) {
        if (ab()) {
            aa(str, obj);
        }
    }

    @Override // defpackage.alvw
    public final void u(String str, int i, int i2) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.alvw
    public final void v(String str, int i, long j) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.alvw
    public final void w(String str, int i, Object obj) {
        if (ab()) {
            aa(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.alvw
    public final void x(String str, int i, boolean z) {
        if (ab()) {
            aa(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.alvw
    public final void y(String str, long j, int i) {
        if (ab()) {
            aa(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    @Override // defpackage.alvw
    public final void z(String str, long j, long j2) {
        if (ab()) {
            aa(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
