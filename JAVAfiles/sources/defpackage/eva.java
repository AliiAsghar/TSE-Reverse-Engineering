package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eva extends evb {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public eva(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new euz(e, 2000);
            }
        }
        InputStream inputStream = this.c;
        int i3 = eul.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - read;
        }
        g(read);
        return read;
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        int i;
        try {
            Uri uri = evlVar.a;
            this.b = uri;
            String path = uri.getPath();
            dzg.g(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j();
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(evlVar.e) >= evlVar.e) {
                long j = evlVar.f;
                long available = this.c.available();
                this.d = available;
                if (available == 2147483647L) {
                    this.d = -1L;
                }
                this.e = true;
                i(evlVar);
                return this.d;
            }
            throw new euz(null, 2008);
        } catch (euz e) {
            throw e;
        } catch (IOException e2) {
            if (true != (e2 instanceof FileNotFoundException)) {
                i = 2000;
            } else {
                i = 2005;
            }
            throw new euz(e2, i);
        }
    }

    @Override // defpackage.evg
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.evg
    public final void d() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    h();
                }
            } catch (IOException e) {
                throw new euz(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                h();
            }
            throw th;
        }
    }
}
