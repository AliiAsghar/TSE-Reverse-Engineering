package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acum extends acuh {
    private final String a;
    private final int b;
    private final String k;
    private final String l;
    private final acth m;

    public acum(Context context, acth acthVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, acrm acrmVar, String str2, int i, acnv acnvVar, String str3, armf armfVar) {
        super(context, j, str, instantMessageConfiguration, acugVar, acrmVar, acnvVar, armfVar);
        this.a = str2;
        this.b = i;
        this.k = str3;
        this.m = acthVar;
        this.l = k(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final actg j() {
        if (!Objects.isNull(this.m)) {
            advr.k("Using HttpDownloadStrategy to download the thumbnail.", new Object[0]);
            this.m.b(this.k, this.a);
            try {
                return (actg) this.m.a().get(aczs.a(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new IllegalStateException("Download response future not present", e);
            }
        }
        throw null;
    }

    private static String k(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    private final void l() {
        if (!Objects.isNull(this.m)) {
            advr.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            this.m.close();
        } else {
            Objects.isNull(null);
        }
    }

    private final void m(Exception exc, aphy aphyVar) {
        advr.i(exc, "Unable to download thumbnail for HTTP download", new Object[0]);
        this.h.a(aphyVar);
        b(acrt.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.c(2);
        this.h.c(3);
        try {
            try {
                TrafficStats.setThreadStatsTag(Process.myPid());
                this.h.d(this.l, 2, altc.a);
                long longValue = agkx.W().longValue();
                actg j = j();
                this.h.b(this.l, j.a, agkx.W().longValue() - longValue);
                Optional optional = j.b;
                if (!Objects.isNull(this.m) && optional.isEmpty()) {
                    throw new IllegalStateException("Input stream not present in the HTTP response obtained from the HttpDownloadStrategy.");
                }
                c(g((InputStream) optional.get(), this.b), Uri.EMPTY);
                this.h.c(6);
            } catch (GenericFileTransferException e) {
                m(e, e.a());
            } catch (IOException e2) {
                this.h.e(this.l);
                m(e2, aphy.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            } catch (IllegalStateException e3) {
                m(e3, aphy.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            }
        } finally {
            l();
            TrafficStats.clearThreadStatsTag();
        }
    }
}
