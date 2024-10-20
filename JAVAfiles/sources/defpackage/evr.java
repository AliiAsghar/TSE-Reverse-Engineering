package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evr extends evb implements evg {
    private evl a;
    private HttpURLConnection b;
    private InputStream c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private final fcp h;
    private final fcp i;

    public evr(fcp fcpVar) {
        super(true);
        this.h = fcpVar;
        this.i = new fcp((byte[]) null);
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                eub.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.b = null;
        }
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f;
            if (j != -1) {
                long j2 = j - this.g;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.c;
            int i3 = eul.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.g += read;
            g(read);
            return read;
        } catch (IOException e) {
            int i4 = eul.a;
            throw evv.a(e, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    @Override // defpackage.evg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.evl r23) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evr.b(evl):long");
    }

    @Override // defpackage.evg
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.evg
    public final void d() {
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = eul.a;
                    throw new evv(e, 2000, 3);
                }
            }
        } finally {
            this.c = null;
            k();
            if (this.d) {
                this.d = false;
                h();
            }
        }
    }

    @Override // defpackage.evb, defpackage.evg
    public final Map e() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return altc.a;
        }
        return new evq(httpURLConnection.getHeaderFields());
    }
}
