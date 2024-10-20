package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfp {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor");
    private int b = ((Integer) yfm.f.e()).intValue();
    private final int c = ((Integer) yfm.h.e()).intValue();
    private int d = ((Integer) yfm.g.e()).intValue();
    private final int e = ((Integer) yfm.a.e()).intValue();
    private final int f = ((Integer) yfm.b.e()).intValue();
    private final double g = ((Double) yfm.c.e()).doubleValue();
    private final double h = ((Double) yfm.d.e()).doubleValue();
    private final int i = ((Integer) yfm.e.e()).intValue();
    private final yfo j;
    private final hls k;
    private final mce l;
    private final mbl m;
    private final ygb n;
    private final xnv o;
    private final ydk p;
    private final yfr q;

    public yfp(Context context, yfo yfoVar, mce mceVar, mbl mblVar, ygb ygbVar, xnv xnvVar, ydk ydkVar, yfr yfrVar) {
        this.j = yfoVar;
        this.k = hkz.c(context);
        this.l = mceVar;
        this.m = mblVar;
        this.n = ygbVar;
        this.o = xnvVar;
        this.p = ydkVar;
        this.q = yfrVar;
    }

    private final Bitmap b(Uri uri, int i, int i2, long j) {
        long a2 = this.o.a();
        try {
            return (Bitmap) this.k.b().h(uri).p(((hxc) new hxc().O(htc.a, Integer.valueOf(this.f))).y()).s(i, i2).get();
        } catch (InterruptedException | ExecutionException e) {
            alvw i3 = a.i();
            i3.X(alwp.a, "BugleResizing");
            alvg alvgVar = (alvg) ((alvg) i3).g(e);
            alvgVar.X(ydl.R, uri);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "scaleBitmap", 348, "StaticImageCompressor.java")).q("Glide was unable to load image.");
            this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 9);
            g(13, uri, j, a2);
            return null;
        }
    }

    private static void c(Bitmap bitmap, byte[] bArr, int i) {
        if (bitmap != null && bArr != null) {
            alvw d = a.d();
            d.X(alwp.a, "BugleResizing");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "maybeLogVerboseResult", 365, "StaticImageCompressor.java")).K("Scaled image. width: %d, height: %d, size: %d, quality: %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bArr.length), Integer.valueOf(i));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|4|5|6|7|(2:9|(3:11|(1:13)(1:38)|14)(3:39|(1:41)(1:43)|42))(1:44)|15|(1:37)(2:18|(1:20)(5:36|22|23|24|(1:26)(2:28|(1:30)(2:31|32))))|21|22|23|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        r1 = defpackage.yfp.a.i();
        r1.X(defpackage.alwp.a, "BugleResizing");
        ((defpackage.alvg) ((defpackage.alvg) ((defpackage.alvg) r1).g(r0)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressInternal", 196, "StaticImageCompressor.java")).q("Got OutOfMemoryError while compress image using default config.");
        g(11, r22, r25, r14);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final byte[] d(android.net.Uri r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfp.d(android.net.Uri, int, int, long):byte[]");
    }

    private final byte[] e(Uri uri, int i, int i2, long j) {
        int i3;
        int max = Math.max(i, i2);
        int i4 = this.i;
        int i5 = i;
        if (max > i4) {
            long j2 = i4;
            long j3 = max;
            i5 = (int) ((i5 * j2) / j3);
            i3 = (int) ((j2 * i2) / j3);
        } else {
            i3 = i2;
        }
        long a2 = this.o.a();
        int i6 = i3;
        int i7 = i5;
        Bitmap bitmap = null;
        byte[] bArr = null;
        do {
            long a3 = this.o.a();
            try {
                bitmap = b(uri, i7, i6, j);
                bArr = this.j.m(bitmap, this.e);
            } catch (OutOfMemoryError e) {
                alvw i8 = a.i();
                i8.X(alwp.a, "BugleResizing");
                ((alvg) ((alvg) ((alvg) i8).g(e)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "compressToFitLimit", (char) 238, "StaticImageCompressor.java")).q("Got OutOfMemoryError while adjusting image width and height.");
                this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 7);
                g(11, uri, j, a3);
                bitmap = bitmap;
            }
            c(bitmap, bArr, this.e);
            if (bArr != null && bArr.length <= j) {
                break;
            }
            double d = this.g;
            double d2 = i6;
            i7 = (int) (i7 * d);
            if (i7 < 32) {
                break;
            }
            i6 = (int) (d2 * d);
        } while (i6 >= 32);
        if (bArr != null && bArr.length <= j) {
            return f(bitmap, bArr, j, uri);
        }
        h(3, 5, uri, j, a2);
        return null;
    }

    private final byte[] f(Bitmap bitmap, byte[] bArr, long j, Uri uri) {
        int i = this.f + 1;
        int i2 = this.e;
        byte[] bArr2 = bArr;
        for (int i3 = 1; i - i2 > i3; i3 = 1) {
            int i4 = (i2 + i) >> i3;
            long a2 = this.o.a();
            try {
                byte[] m = this.j.m(bitmap, i4);
                c(bitmap, m, i4);
                if (m != null) {
                    int length = m.length;
                    if (length <= j) {
                        int i5 = i;
                        if (length < this.h * j) {
                            i = i5;
                            i2 = i4;
                            bArr2 = m;
                        } else {
                            alvw d = a.d();
                            d.X(alwp.a, "BugleResizing");
                            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "tuneImageQuality", 301, "StaticImageCompressor.java")).q("Fast exit from the compression step.");
                            c(bitmap, m, i4);
                            this.m.c("Bugle.Media.Attachment.Resize.V2.Image.FastExit.Count");
                            return m;
                        }
                    }
                }
                i = i4;
            } catch (OutOfMemoryError e) {
                alvw i6 = a.i();
                i6.X(alwp.a, "BugleResizing");
                ((alvg) ((alvg) ((alvg) i6).g(e)).h("com/google/android/apps/messaging/shared/util/image/StaticImageCompressor", "tuneImageQuality", (char) 283, "StaticImageCompressor.java")).q("Got OutOfMemoryError while compressing the image. Return the current best result.");
                this.m.e("Bugle.Media.Attachment.Resize.Failure.Image.Error.Counts", 8);
                g(11, uri, j, a2);
                return bArr2;
            }
        }
        c(bitmap, bArr2, i2);
        return bArr2;
    }

    private final void g(int i, Uri uri, long j, long j2) {
        h(5, i, uri, j, j2);
    }

    private final void h(int i, int i2, Uri uri, long j, long j2) {
        aozy createBuilder = amnl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar = (amnl) createBuilder.b;
        amnlVar.c = a.ak(i);
        amnlVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar2 = (amnl) createBuilder.b;
        amnlVar2.r = akec.aC(i2);
        amnlVar2.b |= 32768;
        int b = (int) this.p.b(uri);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amnl amnlVar3 = (amnl) apagVar;
        amnlVar3.b |= 8;
        amnlVar3.f = b;
        int i3 = (int) j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amnl amnlVar4 = (amnl) apagVar2;
        amnlVar4.b |= 16;
        amnlVar4.g = i3;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar5 = (amnl) createBuilder.b;
        amnlVar5.p = a.ak(3);
        amnlVar5.b |= 8192;
        long a2 = this.o.a() - j2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar6 = (amnl) createBuilder.b;
        amnlVar6.b |= 2;
        amnlVar6.d = ((float) a2) / 1000.0f;
        this.n.n(new wxx(createBuilder, 12));
    }

    public final byte[] a(Uri uri, int i, int i2, long j) {
        String str;
        xnv xnvVar = this.o;
        mbm b = this.l.b("Bugle.Media.Attachment.Resize.V2.Image.Duration");
        long a2 = xnvVar.a();
        byte[] d = d(uri, i, i2, j);
        aozy createBuilder = amnl.a.createBuilder();
        int b2 = (int) this.p.b(uri);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amnl amnlVar = (amnl) apagVar;
        amnlVar.b |= 8;
        amnlVar.f = b2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar2 = (amnl) createBuilder.b;
        amnlVar2.p = a.ak(3);
        amnlVar2.b |= 8192;
        int i3 = (int) j;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar3 = (amnl) createBuilder.b;
        amnlVar3.b |= 16;
        amnlVar3.g = i3;
        float a3 = (float) (this.o.a() - a2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amnl amnlVar4 = (amnl) apagVar2;
        amnlVar4.b |= 2;
        amnlVar4.d = a3 / 1000.0f;
        if (d != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amnl amnlVar5 = (amnl) createBuilder.b;
            amnlVar5.c = a.ak(2);
            amnlVar5.b |= 1;
            int length = d.length;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amnl amnlVar6 = (amnl) createBuilder.b;
            amnlVar6.b |= 32;
            amnlVar6.h = length;
        } else {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amnl amnlVar7 = (amnl) createBuilder.b;
            amnlVar7.c = a.ak(3);
            amnlVar7.b |= 1;
        }
        this.n.n(new wxx(createBuilder, 12));
        b.c();
        mbl mblVar = this.m;
        if (d != null) {
            str = "Bugle.Media.Attachment.Resize.V2.Image.Success.Count";
        } else {
            str = "Bugle.Media.Attachment.Resize.V2.Image.Fail.Count";
        }
        mblVar.c(str);
        if (j != 0 && d != null) {
            this.m.e("Bugle.Media.Attachment.Resize.V2.Used.Space.Percentage", (int) ((d.length * 100) / j));
        }
        return d;
    }
}
