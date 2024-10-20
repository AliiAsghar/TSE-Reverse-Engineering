package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evt extends evb {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public evt() {
        super(false);
    }

    @Override // defpackage.eqe
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = eul.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (read > 0) {
                this.c -= read;
                g(read);
            }
            return read;
        } catch (IOException e) {
            throw new evs(e, 2000);
        }
    }

    @Override // defpackage.evg
    public final long b(evl evlVar) {
        Uri uri = evlVar.a;
        this.b = uri;
        j();
        int i = 2006;
        try {
            String path = uri.getPath();
            dzg.g(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(evlVar.e);
                long j = evlVar.f;
                long length = this.a.length() - evlVar.e;
                this.c = length;
                if (length >= 0) {
                    this.d = true;
                    i(evlVar);
                    return this.c;
                }
                throw new evs(null, null, 2008);
            } catch (IOException e) {
                throw new evs(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new evs(e2, i);
            }
            throw new evs(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new evs(e3, 2006);
        } catch (RuntimeException e4) {
            throw new evs(e4, 2000);
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
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new evs(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
