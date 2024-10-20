package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import j$.time.Duration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acuh implements Runnable {
    private final acug a;
    private final armf b;
    public final long c;
    public final InstantMessageConfiguration d;
    public final String e;
    protected final acrm f;
    protected final Context g;
    protected final acnv h;
    public int i = 0;
    public volatile boolean j;

    /* JADX INFO: Access modifiers changed from: protected */
    public acuh(Context context, long j, String str, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, acrm acrmVar, acnv acnvVar, armf armfVar) {
        this.g = context;
        this.c = j;
        this.d = instantMessageConfiguration;
        this.e = str;
        this.a = acugVar;
        this.f = acrmVar;
        this.h = acnvVar;
        this.b = armfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final long h(acrt acrtVar) {
        int i = acrtVar.e;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    advr.g("Invalid type %d", Integer.valueOf(i));
                    return 8L;
                }
                return 203L;
            }
            return 202L;
        }
        return 201L;
    }

    public void a() {
        this.j = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(acrt acrtVar) {
        this.i++;
        this.a.c(acrtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(byte[] bArr, Uri uri) {
        this.a.b(bArr, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i, long j) {
        this.f.c(new FileTransferEvent(i, this.c, j, this.e), advy.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        if (!this.j) {
        } else {
            throw new IOException("Cancelled");
        }
    }

    public final byte[] f(InputStream inputStream) {
        return g(inputStream, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] g(InputStream inputStream, long j) {
        e();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                j2 += read;
                if (j == -1 || j2 <= j) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE);
                    throw new IOException("Data corrupted, expected " + j + " bytes but received " + j2 + " bytes");
                }
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(long j, Duration duration) {
        this.f.c(new FileTransferEvent(20013, this.c, j, this.e, duration), advy.HTTP_FILE_TRANSFER_RUNNABLE);
    }

    public String toString() {
        return "File ID " + this.e + ", session ID " + this.c + ", failure count " + this.i + ", cancelled " + this.j;
    }
}
