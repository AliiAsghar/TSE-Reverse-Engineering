package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsp extends acuh {
    static final acyz a = aczd.a(177199430);
    private static final byte[] b = new byte[0];
    private final acth k;
    private final adih l;
    private final String m;
    private final Optional n;
    private final int o;
    private final String p;
    private final String q;
    private final armf r;
    private long s;

    public acsp(Context context, acrm acrmVar, adih adihVar, armf armfVar, acth acthVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, String str2, Optional optional, int i, acnv acnvVar, String str3) {
        super(context, j, str, instantMessageConfiguration, acugVar, acrmVar, acnvVar, armfVar);
        this.l = adihVar;
        this.m = str2;
        this.n = optional;
        this.o = i;
        this.k = acthVar;
        this.p = str3;
        this.q = actt.e(str2);
        this.r = armfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final actg j(Optional optional) {
        advr.k("Using HttpDownloadStrategy to download the file.", new Object[0]);
        if (optional.isPresent()) {
            this.k.c(this.p, this.m, ((Long) optional.get()).longValue());
        } else {
            this.k.b(this.p, this.m);
        }
        try {
            return (actg) this.k.a().get(aczs.a(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e.getCause() instanceof GenericFileTransferException) {
                throw ((GenericFileTransferException) e.getCause());
            }
            throw new IllegalStateException("Download response future not present", e);
        }
    }

    private final void k(File file) {
        if (file.delete()) {
            return;
        }
        this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE);
        throw new IOException("Unable to delete file " + file.getName() + ". Aborting.");
    }

    private final void l() {
        if (!Objects.isNull(this.k)) {
            advr.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            this.k.close();
        } else {
            Objects.isNull(null);
        }
    }

    private final void m(Exception exc) {
        int i;
        b(acrt.c);
        if (this.j) {
            advr.o("Download canceled", new Object[0]);
            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED);
            i = 5;
        } else {
            advr.s(exc, "Unable to download file", new Object[0]);
            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
            i = 8;
        }
        d(20013, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        acrt acrtVar;
        Optional of;
        int i;
        FileTransferEvent fileTransferEvent;
        advr.c("FileDownloadRunnable starting: %s", toString());
        try {
            try {
                try {
                    d(20001, this.o);
                    d(20002, this.o);
                    d(20010, this.o);
                    this.h.c(2);
                    this.h.c(3);
                    TrafficStats.setThreadStatsTag(Process.myPid());
                } catch (acui e) {
                    advr.k("HttpResponseException thrown %s", e);
                    int i2 = e.a;
                    Duration duration = e.b;
                    if (i2 != 401) {
                        if (i2 != 410) {
                            if (i2 != 422) {
                                if (i2 != 403) {
                                    if (i2 != 404) {
                                        akia a2 = acrt.a();
                                        a2.k(3);
                                        a2.j(duration);
                                        acrtVar = a2.i();
                                    }
                                } else if (aczs.o()) {
                                    acrtVar = acrt.d;
                                } else {
                                    acrtVar = acrt.b;
                                }
                                b(acrtVar);
                                i(h(acrtVar), acrtVar.f);
                            }
                        }
                        acrtVar = acrt.b;
                        b(acrtVar);
                        i(h(acrtVar), acrtVar.f);
                    }
                    acrtVar = acrt.d;
                    b(acrtVar);
                    i(h(acrtVar), acrtVar.f);
                } catch (IllegalStateException e2) {
                    e = e2;
                    m(e);
                }
            } catch (GenericFileTransferException e3) {
                advr.k("GenericFileTransferException thrown %s", e3);
                this.h.a(e3.a());
                m(e3);
            } catch (IOException e4) {
                e = e4;
                m(e);
            }
            try {
                this.h.d(this.q, 2, altc.a);
                this.s = agkx.W().longValue();
                long j = this.o;
                String str = this.e;
                String str2 = str + j;
                String d = this.l.d();
                if (!TextUtils.isEmpty(d)) {
                    if (actt.h(d)) {
                        File file = new File(new File(d), str2);
                        if (!file.exists()) {
                            of = Optional.empty();
                        } else {
                            long length = file.length();
                            if (length >= this.o) {
                                advr.q("Size of the temporary file is bigger than the expected size. Re-downloading from start to avoid corruption.", new Object[0]);
                                k(file);
                                of = Optional.empty();
                            } else {
                                of = Optional.of(Long.valueOf(length));
                            }
                        }
                        if (!Objects.isNull(this.k)) {
                            actg j2 = j(of);
                            int i3 = j2.a;
                            String str3 = (String) j2.c.get("Retry-After");
                            boolean isPresent = of.isPresent();
                            this.h.b(this.q, i3, agkx.W().longValue() - this.s);
                            if (i3 != 200) {
                                if (isPresent) {
                                    if (i3 != 206) {
                                    }
                                }
                                try {
                                    if (TextUtils.isEmpty(str3)) {
                                        if (i3 != 503) {
                                            i = 0;
                                        } else {
                                            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                                            throw new IOException("No retry after value in 503 response");
                                        }
                                    } else {
                                        try {
                                            i = Integer.parseInt(str3);
                                        } catch (NumberFormatException unused) {
                                            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                                            throw new IOException("Invalid retry after value: ".concat(String.valueOf(str3)));
                                        }
                                    }
                                    if (i > 0) {
                                        try {
                                            this.h.c(4);
                                        } catch (IOException e5) {
                                            e = e5;
                                            advr.i(e, "Exception while extracting retry-after", new Object[0]);
                                            throw new acui(i3, Duration.ofSeconds(i));
                                        }
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                    i = 0;
                                }
                                throw new acui(i3, Duration.ofSeconds(i));
                            }
                            if (of.isPresent() && "none".equals((String) j2.c.get("Accept-Ranges"))) {
                                advr.q("This web server does not support resuming downloads. Re-downloading from start.", new Object[0]);
                                k(file);
                            }
                            Optional optional = j2.b;
                            if (!Objects.isNull(this.k) && optional.isEmpty()) {
                                throw new IllegalStateException("Input stream not present in the HTTP response obtained from the HttpDownloadStrategy.");
                            }
                            Object obj = optional.get();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
                            byte[] bArr = new byte[20480];
                            int length2 = (int) file.length();
                            while (true) {
                                try {
                                    int i4 = this.o;
                                    if (length2 < i4) {
                                        e();
                                        int read = ((InputStream) obj).read(bArr);
                                        if (read >= 0) {
                                            bufferedOutputStream.write(bArr, 0, read);
                                            length2 += read;
                                            long i5 = FileTransferEvent.i(length2, this.o);
                                            if (((Boolean) a.a()).booleanValue()) {
                                                fileTransferEvent = new FileTransferEvent(20012, this.c, i5, this.e);
                                            } else {
                                                fileTransferEvent = new FileTransferEvent(20012, this.c, i5);
                                            }
                                            this.f.b(fileTransferEvent, advy.FILE_DOWNLOAD_RUNNABLE);
                                        } else {
                                            this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
                                            throw new IOException("Socket closed prematurely");
                                        }
                                    } else if (length2 <= i4) {
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        ((InputStream) obj).close();
                                        Uri b2 = actt.b(this.g, (String) this.n.orElse(null), file, this.l);
                                        l();
                                        c(b, b2);
                                        this.h.c(6);
                                        d(20011, 0L);
                                    } else {
                                        this.h.a(aphy.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
                                        throw new IOException("Got more bytes than expected! File is corrupt");
                                    }
                                } catch (Throwable th) {
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream.close();
                                    ((InputStream) obj).close();
                                    throw th;
                                }
                            }
                            return;
                        }
                        if (of.isPresent()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw new IOException(String.format("Unable to create default target directory: %s", d));
                }
                throw new IOException(String.format("Unable to obtain default target directory for: %s", d));
            } catch (Throwable th2) {
                l();
                throw th2;
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
