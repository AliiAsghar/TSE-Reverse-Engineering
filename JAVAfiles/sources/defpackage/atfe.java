package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.android.vcard.VCardBuilder;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfe extends ExperimentalUrlRequest {
    public static final String a = "atfe";
    public final atfc b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public atfn j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public atfl o;
    public String p;
    public HttpURLConnection q;
    public final ates r;
    public final int s;
    public final atel t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public atew y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00f0. Please report as an issue. */
    public atfe(ates atesVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        atfn atfnVar;
        this.h = z;
        this.b = new atfc(this, callback, executor2);
        final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
        this.c = new atfd(new Executor() { // from class: atex
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final int i3 = threadStatsTag;
                final boolean z4 = z3;
                final int i4 = i2;
                executor.execute(new Runnable() { // from class: atey
                    @Override // java.lang.Runnable
                    public final void run() {
                        int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i3);
                        Runnable runnable2 = runnable;
                        boolean z5 = z4;
                        if (z5) {
                            ThreadStatsUid.set(i4);
                        }
                        try {
                            runnable2.run();
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                        } catch (Throwable th) {
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                            throw th;
                        }
                    }
                });
            }
        });
        this.r = atesVar;
        this.s = atesVar.a;
        this.t = atesVar.b;
        this.m = str;
        this.d = str2;
        this.u = j;
        if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException("Invalid http method ".concat(str3));
        }
        this.i = str3;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i3);
            String str4 = (String) entry.getKey();
            int i4 = 0;
            while (true) {
                if (i4 < str4.length()) {
                    char charAt = str4.charAt(i4);
                    if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                        switch (charAt) {
                            case '\'':
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                break;
                            default:
                                switch (charAt) {
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        break;
                                    default:
                                        switch (charAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                i4 = (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) ? i4 : i4 + 1;
                                                break;
                                        }
                                }
                        }
                    }
                } else if (!((String) entry.getValue()).contains(VCardBuilder.VCARD_END_OF_LINE)) {
                    this.e.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
        }
        if (uploadDataProvider == null) {
            atfnVar = null;
        } else if (this.e.containsKey(assi.a)) {
            atfnVar = new atfn(uploadDataProvider);
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        this.j = atfnVar;
        this.k = (executor3 == null || this.h) ? executor3 : new qyk(executor3, 3);
    }

    public final void a() {
        this.c.execute(new arer(this, 20, null));
    }

    public final void b(CronetException cronetException) {
        int i;
        do {
            i = this.g.get();
            if (i != 0) {
                if (i == 6 || i == 7 || i == 8) {
                    return;
                }
            } else {
                throw new IllegalStateException("Can't enter error state before start");
            }
        } while (!this.g.compareAndSet(i, 6));
        e();
        d();
        atfc atfcVar = this.b;
        atfl atflVar = this.o;
        atfcVar.d.a();
        aofo aofoVar = new aofo(atfcVar, (UrlResponseInfo) atflVar, cronetException, 18);
        try {
            atfcVar.b.execute(aofoVar);
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = atfcVar.c;
            if (executor != null) {
                executor.execute(aofoVar);
            }
        }
    }

    public final void c(Throwable th) {
        b(new ateb("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int i = 8;
        int andSet = this.g.getAndSet(8);
        if (andSet != 1 && andSet != 2 && andSet != 3 && andSet != 4 && andSet != 5) {
            return;
        }
        e();
        d();
        atfc atfcVar = this.b;
        atfl atflVar = this.o;
        atfcVar.d.a();
        atfcVar.b.execute(new atep(atfcVar, atflVar, i, null));
    }

    public final void d() {
        if (this.j != null && this.z.compareAndSet(false, true)) {
            try {
                Executor executor = this.k;
                atfn atfnVar = this.j;
                atfnVar.getClass();
                int i = 4;
                executor.execute(new atep(this, (atff) new ateu(atfnVar, i), i));
            } catch (RejectedExecutionException e) {
                Log.e(a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public final void e() {
        this.c.execute(new arer(this, 18, null));
    }

    public final void f() {
        this.l = 13;
        int i = 3;
        this.c.execute(new atep(this, (atff) new ateu(this, i), i));
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        i(3, 1, new atfa(this, 0));
    }

    public final void g() {
        this.c.execute(new atep(this, (atff) new ateu(this, 2), 3));
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.bV(i, "Switch is exhaustive: "));
        }
        atfc atfcVar = this.b;
        atfcVar.b.execute(new ajbz(new atfp(statusListener), i2, 11));
    }

    public final void h(String str, Exception exc) {
        Log.e(a, a.bW(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    public final void i(int i, int i2, Runnable runnable) {
        if (!this.g.compareAndSet(i, i2)) {
            int i3 = this.g.get();
            if (i3 != 8 && i3 != 6) {
                throw new IllegalStateException(a.bU(i3, i, "Invalid state transition - expected ", " but was "));
            }
            return;
        }
        runnable.run();
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        if (i != 7 && i != 6 && i != 8) {
            return false;
        }
        return true;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        atow.w(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            i(4, 5, new atep(this, new atff() { // from class: atez
                @Override // defpackage.atff
                public final void a() {
                    int i;
                    atfe atfeVar = atfe.this;
                    ReadableByteChannel readableByteChannel = atfeVar.n;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    int i2 = 1;
                    if (readableByteChannel != null) {
                        atfeVar.v++;
                        i = readableByteChannel.read(byteBuffer2);
                    } else {
                        i = -1;
                    }
                    if (i != -1) {
                        atfc atfcVar = atfeVar.b;
                        atfcVar.a(new atfb(atfcVar, atfeVar.o, byteBuffer2, i2));
                        return;
                    }
                    ReadableByteChannel readableByteChannel2 = atfeVar.n;
                    if (readableByteChannel2 != null) {
                        readableByteChannel2.close();
                    }
                    if (atfeVar.g.compareAndSet(5, 7)) {
                        atfeVar.e();
                        atfc atfcVar2 = atfeVar.b;
                        atfcVar2.b.execute(new atep(atfcVar2, atfeVar.o, 7, null));
                    }
                }
            }, 6));
            return;
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        i(0, 1, new arer(this, 19, null));
    }
}
