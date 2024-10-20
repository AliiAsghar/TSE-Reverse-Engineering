package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hkt extends hkd {
    private static final Object m = new Object();
    private final Object n;
    private hki o;
    private final Bitmap.Config p;

    public hkt(String str, hki hkiVar, Bitmap.Config config, hkh hkhVar) {
        super(str, hkhVar);
        this.n = new Object();
        this.k = new hjv(1000, 2, 2.0f);
        this.o = hkiVar;
        this.p = config;
    }

    @Override // defpackage.hkd
    public final void d() {
        super.d();
        synchronized (this.n) {
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkd
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        hki hkiVar;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.n) {
            hkiVar = this.o;
        }
        if (hkiVar != null) {
            hkiVar.a(bitmap);
        }
    }

    @Override // defpackage.hkd
    public final int j() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hkd
    public final akju l(hka hkaVar) {
        akju akjuVar;
        synchronized (m) {
            try {
                try {
                    Object obj = hkaVar.c;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = this.p;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray((byte[]) obj, 0, ((byte[]) obj).length, options);
                    if (decodeByteArray == null) {
                        akjuVar = new akju(new hkc(hkaVar));
                    } else {
                        akjuVar = new akju(decodeByteArray, hlc.c(hkaVar));
                    }
                } catch (OutOfMemoryError e) {
                    hkn.b("Caught OOM for %d byte image, url=%s", Integer.valueOf(((byte[]) hkaVar.c).length), this.b);
                    return new akju(new hkc(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return akjuVar;
    }
}
