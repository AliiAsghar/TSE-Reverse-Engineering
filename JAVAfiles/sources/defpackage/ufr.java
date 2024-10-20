package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ufr implements ufw {
    protected final Context a;
    protected final ufs b;
    public final xnv c;
    public final yfo d;
    protected int e;
    public int f = 0;
    private final armf g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LQ();

        xnv fN();

        yfo gi();
    }

    public ufr(Context context, ufs ufsVar) {
        this.a = context;
        this.b = ufsVar;
        a aVar = (a) akec.w(context, a.class);
        this.c = aVar.fN();
        this.d = aVar.gi();
        this.g = aVar.LQ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ufu b(List list) {
        ufu ufhVar;
        ufu m;
        akrh e = aktp.e("ImageRequest.loadMediaInternal");
        try {
            if (!this.b.g && o()) {
                InputStream e2 = e();
                if (e2 == null) {
                    ufhVar = null;
                } else {
                    try {
                        if (this.b.j) {
                            String m2 = m();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            abvh.a(e2, byteArrayOutputStream);
                            m = new ufl(m2, byteArrayOutputStream.toByteArray(), this.c);
                        } else {
                            m = ufq.m(m(), e2, this.c);
                            if (m == null) {
                                throw new IllegalStateException("Error decoding gif");
                            }
                        }
                        e2.close();
                        ufhVar = m;
                    } finally {
                    }
                }
            } else {
                Bitmap h = h();
                if (h != null) {
                    ufhVar = new ufh(m(), h, this.e, this.c, this.d);
                } else {
                    throw new RuntimeException("failed decoding bitmap");
                }
            }
            e.close();
            return ufhVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ufw
    public final int c() {
        return this.f;
    }

    @Override // defpackage.ufw
    public final int d() {
        return 3;
    }

    protected abstract InputStream e();

    public int f() {
        return 1;
    }

    protected Bitmap g() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.graphics.Bitmap h() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufr.h():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ugf i() {
        uie uieVar = (uie) this.g.b();
        int f = f();
        ufv a2 = uieVar.a(f);
        if (a2 instanceof uge) {
            return ((uge) a2).d;
        }
        throw new IllegalArgumentException(defpackage.a.bV(f, "MediaCacheManager: cache id does not correspond to a PoolableImageCache "));
    }

    @Override // defpackage.ufw
    public final ufv j() {
        return ((uie) this.g.b()).a(f());
    }

    @Override // defpackage.ufw
    public final /* synthetic */ ufx k() {
        return this.b;
    }

    @Override // defpackage.ufw
    public final /* bridge */ /* synthetic */ ugg l(List list) {
        boolean z;
        xyl.h();
        ufu b = b(list);
        if (b != null) {
            ufs ufsVar = this.b;
            int i = ufsVar.i;
            boolean z2 = ufsVar.h;
            if ((z2 || i != 0) && (b instanceof ufh)) {
                int i2 = ufsVar.b;
                int i3 = ufsVar.c;
                Bitmap d = b.d();
                Bitmap a2 = i().a(i2, i3);
                RectF rectF = new RectF(brg.a, brg.a, i2, i3);
                RectF rectF2 = new RectF(brg.a, brg.a, d.getWidth(), d.getHeight());
                Canvas canvas = new Canvas(a2);
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                yfo.p(d, canvas, rectF2, rectF, z, i, z2);
                return new ufh(m(), a2, b.c(), this.c, this.d);
            }
            return b;
        }
        throw new IllegalStateException("Error reading from resources.");
    }

    @Override // defpackage.ufw
    public final String m() {
        return this.b.g();
    }

    protected boolean n() {
        return false;
    }

    protected boolean o() {
        return yfo.k(e());
    }
}
