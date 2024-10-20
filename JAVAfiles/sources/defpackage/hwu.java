package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwu implements Cloneable {
    private int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public int o;
    public Resources.Theme s;
    public boolean t;
    public boolean v;
    private Drawable w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float b = 1.0f;
    public hpb c = hpb.c;
    public hlh d = hlh.NORMAL;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public hne l = hyd.b;
    public boolean n = true;
    public hnj p = new hnj();
    public Map q = new hyj();
    public Class r = Object.class;
    public boolean u = true;

    private final hwu a(hts htsVar, hnn hnnVar) {
        return c(htsVar, hnnVar, false);
    }

    private final hwu b(hts htsVar, hnn hnnVar) {
        return c(htsVar, hnnVar, true);
    }

    private final hwu c(hts htsVar, hnn hnnVar, boolean z) {
        hwu K;
        if (z) {
            K = T(htsVar, hnnVar);
        } else {
            K = K(htsVar, hnnVar);
        }
        K.u = true;
        return K;
    }

    private static boolean d(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public hwu A(Class cls) {
        if (this.t) {
            return clone().A(cls);
        }
        hwr.i(cls);
        this.r = cls;
        this.a |= 4096;
        ab();
        return this;
    }

    public hwu B(hpb hpbVar) {
        if (this.t) {
            return clone().B(hpbVar);
        }
        hwr.i(hpbVar);
        this.c = hpbVar;
        this.a |= 4;
        ab();
        return this;
    }

    public hwu C() {
        if (this.t) {
            return clone().C();
        }
        this.q.clear();
        int i = this.a;
        this.m = false;
        this.n = false;
        this.a = (i & (-133121)) | 65536;
        this.u = true;
        ab();
        return this;
    }

    public hwu D(hts htsVar) {
        hni hniVar = hts.g;
        hwr.i(htsVar);
        return O(hniVar, htsVar);
    }

    public hwu E(Drawable drawable) {
        if (this.t) {
            return clone().E(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.f = 0;
        this.a = i & (-33);
        ab();
        return this;
    }

    public hwu F() {
        return b(hts.b, new hua());
    }

    public hwu G(long j) {
        return O(hut.a, Long.valueOf(j));
    }

    public hwu H() {
        return K(hts.d, new htg());
    }

    public hwu I() {
        return a(hts.c, new hth());
    }

    public hwu J() {
        return a(hts.b, new hua());
    }

    final hwu K(hts htsVar, hnn hnnVar) {
        if (this.t) {
            return clone().K(htsVar, hnnVar);
        }
        D(htsVar);
        return S(hnnVar, false);
    }

    public hwu L(int i, int i2) {
        if (this.t) {
            return clone().L(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        ab();
        return this;
    }

    public hwu M(hlh hlhVar) {
        if (this.t) {
            return clone().M(hlhVar);
        }
        hwr.i(hlhVar);
        this.d = hlhVar;
        this.a |= 8;
        ab();
        return this;
    }

    final hwu N(hni hniVar) {
        if (this.t) {
            return clone().N(hniVar);
        }
        this.p.b.remove(hniVar);
        ab();
        return this;
    }

    public hwu O(hni hniVar, Object obj) {
        if (this.t) {
            return clone().O(hniVar, obj);
        }
        hwr.i(hniVar);
        hwr.i(obj);
        this.p.d(hniVar, obj);
        ab();
        return this;
    }

    public hwu P(hne hneVar) {
        if (this.t) {
            return clone().P(hneVar);
        }
        hwr.i(hneVar);
        this.l = hneVar;
        this.a |= 1024;
        ab();
        return this;
    }

    public hwu Q(Resources.Theme theme) {
        if (this.t) {
            return clone().Q(theme);
        }
        this.s = theme;
        if (theme != null) {
            this.a |= 32768;
            return O(hvb.a, theme);
        }
        this.a &= -32769;
        return N(hvb.a);
    }

    public hwu R(hnn hnnVar) {
        return S(hnnVar, true);
    }

    final hwu S(hnn hnnVar, boolean z) {
        if (this.t) {
            return clone().S(hnnVar, z);
        }
        hty htyVar = new hty(hnnVar, z);
        U(Bitmap.class, hnnVar, z);
        U(Drawable.class, htyVar, z);
        U(BitmapDrawable.class, htyVar, z);
        U(hvf.class, new hvi(hnnVar), z);
        ab();
        return this;
    }

    final hwu T(hts htsVar, hnn hnnVar) {
        if (this.t) {
            return clone().T(htsVar, hnnVar);
        }
        D(htsVar);
        return R(hnnVar);
    }

    final hwu U(Class cls, hnn hnnVar, boolean z) {
        if (this.t) {
            return clone().U(cls, hnnVar, z);
        }
        hwr.i(cls);
        hwr.i(hnnVar);
        this.q.put(cls, hnnVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.u = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        ab();
        return this;
    }

    public final boolean V(int i) {
        return d(this.a, i);
    }

    public final boolean W() {
        return hyv.n(this.k, this.j);
    }

    public hwu X() {
        if (this.t) {
            return clone().X();
        }
        this.o = R.drawable.gaia_auto_sign_in_profile_bubble;
        int i = this.a | 16384;
        this.w = null;
        this.a = i & (-8193);
        ab();
        return this;
    }

    public hwu Y() {
        if (this.t) {
            return clone().Y();
        }
        this.z = false;
        this.a |= 524288;
        ab();
        return this;
    }

    public hwu Z() {
        if (this.t) {
            return clone().Z();
        }
        this.v = true;
        this.a |= 1048576;
        ab();
        return this;
    }

    public hwu aa() {
        if (this.t) {
            return clone().aa();
        }
        this.h = R.drawable.compose2o_tile_background;
        int i = this.a | 128;
        this.g = null;
        this.a = i & (-65);
        ab();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab() {
        if (!this.x) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public hwu ac() {
        if (this.t) {
            return clone().ac();
        }
        this.i = false;
        this.a |= 256;
        ab();
        return this;
    }

    public void ad() {
        this.x = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof hwu) {
            hwu hwuVar = (hwu) obj;
            if (Float.compare(hwuVar.b, this.b) == 0) {
                int i = hwuVar.f;
                if (d.F(this.e, hwuVar.e) && this.h == hwuVar.h) {
                    Drawable drawable = hwuVar.g;
                    if (d.F(null, null) && this.o == hwuVar.o) {
                        Drawable drawable2 = hwuVar.w;
                        if (d.F(null, null) && this.i == hwuVar.i && this.j == hwuVar.j && this.k == hwuVar.k && this.m == hwuVar.m && this.n == hwuVar.n) {
                            boolean z = hwuVar.y;
                            boolean z2 = hwuVar.z;
                            if (this.c.equals(hwuVar.c) && this.d == hwuVar.d && this.p.equals(hwuVar.p) && this.q.equals(hwuVar.q) && this.r.equals(hwuVar.r) && d.F(this.l, hwuVar.l) && d.F(this.s, hwuVar.s)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return hyv.e(this.s, hyv.e(this.l, hyv.e(this.r, hyv.e(this.q, hyv.e(this.p, hyv.e(this.d, hyv.e(this.c, hyv.d(0, hyv.d(0, hyv.d(this.n ? 1 : 0, hyv.d(this.m ? 1 : 0, hyv.d(this.k, hyv.d(this.j, hyv.d(this.i ? 1 : 0, hyv.e(null, hyv.d(this.o, hyv.e(null, hyv.d(this.h, hyv.e(this.e, hyv.d(0, hyv.d(Float.floatToIntBits(this.b), 17)))))))))))))))))))));
    }

    public hwu p(hwu hwuVar) {
        if (this.t) {
            return clone().p(hwuVar);
        }
        int i = hwuVar.a;
        if (d(i, 2)) {
            this.b = hwuVar.b;
        }
        if (d(i, 262144)) {
            boolean z = hwuVar.y;
            this.y = false;
        }
        if (d(i, 1048576)) {
            this.v = hwuVar.v;
        }
        if (d(i, 4)) {
            this.c = hwuVar.c;
        }
        if (d(i, 8)) {
            this.d = hwuVar.d;
        }
        if (d(i, 16)) {
            this.e = hwuVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (d(hwuVar.a, 32)) {
            int i2 = hwuVar.f;
            this.f = 0;
            this.e = null;
            this.a &= -17;
        }
        if (d(hwuVar.a, 64)) {
            Drawable drawable = hwuVar.g;
            this.g = null;
            this.h = 0;
            this.a &= -129;
        }
        if (d(hwuVar.a, 128)) {
            this.h = hwuVar.h;
            this.g = null;
            this.a &= -65;
        }
        int i3 = hwuVar.a;
        if (d(i3, 256)) {
            this.i = hwuVar.i;
        }
        if (d(i3, 512)) {
            this.k = hwuVar.k;
            this.j = hwuVar.j;
        }
        if (d(i3, 1024)) {
            this.l = hwuVar.l;
        }
        if (d(i3, 4096)) {
            this.r = hwuVar.r;
        }
        if (d(i3, 8192)) {
            Drawable drawable2 = hwuVar.w;
            this.w = null;
            this.o = 0;
            this.a &= -16385;
        }
        if (d(hwuVar.a, 16384)) {
            this.o = hwuVar.o;
            this.w = null;
            this.a &= -8193;
        }
        int i4 = hwuVar.a;
        if (d(i4, 32768)) {
            this.s = hwuVar.s;
        }
        if (d(i4, 65536)) {
            this.n = hwuVar.n;
        }
        if (d(i4, 131072)) {
            this.m = hwuVar.m;
        }
        if (d(i4, 2048)) {
            this.q.putAll(hwuVar.q);
            this.u = hwuVar.u;
        }
        if (d(hwuVar.a, 524288)) {
            boolean z2 = hwuVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.q.clear();
            int i5 = this.a;
            this.m = false;
            this.a = i5 & (-133121);
            this.u = true;
        }
        this.a |= hwuVar.a;
        this.p.c(hwuVar.p);
        ab();
        return this;
    }

    @Override // 
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public hwu clone() {
        try {
            hwu hwuVar = (hwu) super.clone();
            hnj hnjVar = new hnj();
            hwuVar.p = hnjVar;
            hnjVar.c(this.p);
            hyj hyjVar = new hyj();
            hwuVar.q = hyjVar;
            hyjVar.putAll(this.q);
            hwuVar.x = false;
            hwuVar.t = false;
            return hwuVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public hwu w() {
        if (this.x && !this.t) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.t = true;
        ad();
        return this;
    }

    public final hwu x() {
        return T(hts.d, new htg());
    }

    public hwu y() {
        return b(hts.c, new hth());
    }

    public hwu z() {
        return T(hts.c, new hti());
    }
}
