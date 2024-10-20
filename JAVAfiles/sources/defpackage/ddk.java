package defpackage;

import android.graphics.Outline;
import android.os.Build;
import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddk {
    public boolean a;
    private boolean b = true;
    private final Outline c;
    private cln d;
    private clr e;
    private clr f;
    private boolean g;
    private clr h;
    private cjr i;
    private float j;
    private long k;
    private long l;
    private boolean m;

    public ddk() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        this.k = 0L;
        this.l = 0L;
    }

    private final void g() {
        if (this.a) {
            this.k = 0L;
            this.j = brg.a;
            this.f = null;
            this.a = false;
            this.g = false;
            cln clnVar = this.d;
            if (clnVar != null && this.m && Float.intBitsToFloat((int) (this.l >> 32)) > brg.a && Float.intBitsToFloat((int) (this.l & 4294967295L)) > brg.a) {
                this.b = true;
                if (clnVar instanceof cln.b) {
                    cjp cjpVar = ((cln.b) clnVar).a;
                    this.k = (Float.floatToRawIntBits(cjpVar.b) << 32) | (Float.floatToRawIntBits(cjpVar.c) & 4294967295L);
                    this.l = (Float.floatToRawIntBits(cjpVar.d - cjpVar.b) << 32) | (Float.floatToRawIntBits(cjpVar.e - cjpVar.c) & 4294967295L);
                    this.c.setRect(Math.round(cjpVar.b), Math.round(cjpVar.c), Math.round(cjpVar.d), Math.round(cjpVar.e));
                    return;
                }
                if (clnVar instanceof cln.c) {
                    cjr cjrVar = ((cln.c) clnVar).a;
                    long j = cjrVar.e >> 32;
                    float f = cjrVar.a;
                    float intBitsToFloat = Float.intBitsToFloat((int) j);
                    this.k = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(cjrVar.b) & 4294967295L);
                    float b = cjrVar.b();
                    this.l = (Float.floatToRawIntBits(cjrVar.a()) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
                    if (cjs.c(cjrVar)) {
                        this.c.setRoundRect(Math.round(cjrVar.a), Math.round(cjrVar.b), Math.round(cjrVar.c), Math.round(cjrVar.d), intBitsToFloat);
                        this.j = intBitsToFloat;
                        return;
                    }
                    clr clrVar = this.e;
                    if (clrVar == null) {
                        clrVar = new cke((byte[]) null);
                        this.e = clrVar;
                    }
                    clrVar.k();
                    clq.c(clrVar, cjrVar);
                    h(clrVar);
                    return;
                }
                if (clnVar instanceof cln.a) {
                    h(((cln.a) clnVar).a);
                    return;
                }
                return;
            }
            this.c.setEmpty();
        }
    }

    private final void h(clr clrVar) {
        if (Build.VERSION.SDK_INT <= 28 && !clrVar.o()) {
            this.b = false;
            this.c.setEmpty();
            this.g = true;
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                ddl.a.a(this.c, clrVar);
            } else {
                this.c.setConvexPath(((cke) clrVar).a);
            }
            this.g = !this.c.canClip();
        }
        this.f = clrVar;
    }

    public final Outline a() {
        g();
        if (this.m && this.b) {
            return this.c;
        }
        return null;
    }

    public final clr b() {
        g();
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r5.e >> 32)) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ckr r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddk.c(ckr):void");
    }

    public final boolean d() {
        if (!this.g) {
            return true;
        }
        return false;
    }

    public final boolean e(long j) {
        cln clnVar;
        if (this.m && (clnVar = this.d) != null) {
            return ddy.a(clnVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean f(cln clnVar, float f, boolean z, float f2, long j) {
        this.c.setAlpha(f);
        boolean F = d.F(this.d, clnVar);
        boolean z2 = !F;
        if (!F) {
            this.d = clnVar;
            this.a = true;
        }
        this.l = j;
        boolean z3 = false;
        if (clnVar != null && (z || f2 > brg.a)) {
            z3 = true;
        }
        if (this.m != z3) {
            this.m = z3;
            this.a = true;
        }
        return z2;
    }
}
