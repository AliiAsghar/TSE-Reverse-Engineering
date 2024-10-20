package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvf implements apvh {
    public String a;
    public aovn b;
    private final apuu c;
    private String d;
    private String e;
    private String f;
    private final apus g;
    private final aput h;
    private final long i;
    private double j;
    private int k = 1;
    private long l;
    private final Random m;
    private apvh n;
    private int o;
    private int p;
    private int q;

    public apvf(String str, String str2, apuu apuuVar, apus apusVar, String str3, aput aputVar, apvl apvlVar, boolean z) {
        if (!z) {
            this.d = str;
            this.e = str2;
            this.f = str3;
        } else {
            this.a = str;
        }
        this.c = apuuVar == null ? new apuu() : apuuVar;
        this.h = aputVar;
        this.g = apusVar;
        this.i = apvlVar.a;
        this.j = 0.0d;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final apuv g(apuu apuuVar, String str, apus apusVar) {
        String str2;
        String str3;
        ListenableFuture b;
        i();
        apuu apuuVar2 = new apuu();
        apuuVar2.e("X-Goog-Upload-Protocol", "resumable");
        apuuVar2.e("X-Goog-Upload-Command", str);
        for (String str4 : apuuVar.c()) {
            Iterator it = apuuVar.b(str4).iterator();
            while (it.hasNext()) {
                apuuVar2.e(str4, (String) it.next());
            }
        }
        if (!apuuVar2.f("X-Goog-Hash")) {
            aovp.o();
        }
        if (str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
            str2 = this.d;
        } else {
            str2 = this.a;
        }
        if (str.contains(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
            str3 = this.e;
        } else {
            str3 = "PUT";
        }
        apvh a = this.h.a(str2, str3, apuuVar2, apusVar);
        if (this.b != null && !str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
            synchronized (this) {
                a.h(new apve(this, this.b), this.o, this.p);
            }
        }
        synchronized (this) {
            this.n = a;
            b = a.b();
        }
        try {
            asmb asmbVar = (asmb) b.get();
            if (asmbVar.r()) {
                if (((apvj) asmbVar.b).a != apvi.CANCELED) {
                    throw ((Throwable) asmbVar.b);
                }
                i();
                throw new apvj(apvi.CONNECTION_ERROR, "");
            }
            return (apuv) asmbVar.a;
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final synchronized void i() {
        int i;
        while (true) {
            i = this.q;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i != 3) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            albo.y(z);
        } else {
            throw new apvj(apvi.CANCELED, "");
        }
    }

    private final void j(apvj apvjVar) {
        if (this.j < this.i) {
            double nextDouble = this.m.nextDouble();
            try {
                this.j = this.j + (this.l * nextDouble);
                Thread.sleep((long) (r4 * 1000 * nextDouble));
            } catch (InterruptedException unused) {
            }
            long j = this.l;
            this.l = j + j;
            return;
        }
        throw apvjVar;
    }

    private final void k() {
        apus apusVar = this.g;
        if (apusVar.d() > apusVar.b()) {
            this.g.g();
            l();
        }
    }

    private final void l() {
        this.l = 1L;
        this.j = 0.0d;
    }

    private final boolean m() {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new apvj(apvi.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean n(apuv apuvVar) {
        if (apuvVar.a / 100 == 4) {
            return true;
        }
        return false;
    }

    private static final boolean o(apuv apuvVar) {
        String a;
        Object obj = apuvVar.b;
        if (obj == null || (a = ((apuu) obj).a("X-Goog-Upload-Status")) == null || !albo.ar("final", a)) {
            return false;
        }
        return true;
    }

    private static final boolean p(apuv apuvVar) {
        String a;
        Object obj = apuvVar.b;
        if (obj == null || (a = ((apuu) obj).a("X-Goog-Upload-Status")) == null || !albo.ar("active", a) || apuvVar.a != 200) {
            return false;
        }
        return true;
    }

    @Override // defpackage.apvh
    public final long a() {
        return this.g.d();
    }

    @Override // defpackage.apvh
    public final ListenableFuture b() {
        anel anelVar = new anel(new apva(this, 2));
        arbj arbjVar = new arbj((char[]) null, (byte[]) null);
        arbjVar.j("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(arbj.t(arbjVar));
        newSingleThreadExecutor.submit(anelVar);
        newSingleThreadExecutor.shutdown();
        return anelVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d6, code lost:
    
        if (r8.a() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d8, code lost:
    
        j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ea, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0075, code lost:
    
        r1 = "upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0078, code lost:
    
        r1 = "finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x001f, code lost:
    
        if (r7.g.c() != Long.MAX_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0021, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f6, code lost:
    
        if (p(r0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0028, code lost:
    
        r8 = new defpackage.apvd(r7.g, r7.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0031, code lost:
    
        r1 = r8.e();
        r3 = r7.g.c();
        r5 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0042, code lost:
    
        if (r1 < ((r3 / r5) * r5)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if ((r7.g.d() + r8.e()) != r7.g.e()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x005a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0060, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01eb, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f5, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.REQUEST_BODY_READ_ERROR, "Could not create chunked data stream.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01c6, code lost:
    
        if (n(r0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01cd, code lost:
    
        j(new defpackage.apvj(defpackage.apvi.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c8, code lost:
    
        if (r0 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1:0x0000, code lost:
    
        if (r8 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f8, code lost:
    
        r8 = ((defpackage.apuu) r0.b).a("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0116, code lost:
    
        r0 = java.lang.Long.parseLong(((defpackage.apuu) r0.b).a("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012c, code lost:
    
        if (r0 < r7.g.b()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0136, code lost:
    
        if (r0 < r7.g.d()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0139, code lost:
    
        r7.g.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x00db, code lost:
    
        r8 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        if (r7.g.d() >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        if (m() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        r8 = r7.g;
        r8.f(r0 - r8.d());
        r7.g.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        r8 = r7.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018d, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.REQUEST_BODY_READ_ERROR, "Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: " + r0 + " Size: " + r8.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018e, code lost:
    
        k();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        r8 = r7.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.SERVER_ERROR, "The server lost bytes that were previously committed. Our offset: " + r8.b() + ", server offset: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00dd, code lost:
    
        r0 = g(r8, com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, new defpackage.apvg(""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c1, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        r7.k = java.lang.Integer.parseInt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.SERVER_ERROR, "Server returned an invalid chunk granularity.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e2, code lost:
    
        if (r0.a() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e4, code lost:
    
        j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0009, code lost:
    
        if (m() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x000b, code lost:
    
        r8 = r7.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0066, code lost:
    
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        if (m() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0070, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0072, code lost:
    
        r1 = "upload, finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007a, code lost:
    
        r2 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007e, code lost:
    
        r2.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
    
        r2 = r7.c;
        r2.e("X-Goog-Upload-Offset", java.lang.Long.toString(r7.g.d()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0092, code lost:
    
        r8 = g(r2, r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009a, code lost:
    
        if (o(r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a1, code lost:
    
        if (p(r8) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a3, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a5, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b3, code lost:
    
        throw new defpackage.apvj(defpackage.apvi.SERVER_ERROR, "Finalize call returned active state.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ee, code lost:
    
        if (o(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b8, code lost:
    
        if (n(r8) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00be, code lost:
    
        if (r8.a != 400) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        j(new defpackage.apvj(defpackage.apvi.SERVER_ERROR, r8.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01c8 -> B:2:0x0004). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.apuv c(boolean r8) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apvf.c(boolean):apuv");
    }

    @Override // defpackage.apvh
    public final String d() {
        return this.a;
    }

    @Override // defpackage.apvh
    public final void e() {
        synchronized (this) {
            apvh apvhVar = this.n;
            if (apvhVar != null) {
                apvhVar.e();
                this.n = null;
            }
            this.q = 3;
            notifyAll();
        }
    }

    public final apuv f() {
        apuv g;
        synchronized (this) {
        }
        l();
        while (true) {
            try {
                g = g(this.c, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, new apvg(albo.ag(this.f)));
            } catch (apvj e) {
                if (e.a()) {
                    j(e);
                } else {
                    throw e;
                }
            }
            if (!o(g)) {
                if (p(g)) {
                    apuu apuuVar = (apuu) g.b;
                    String a = apuuVar.a("X-Goog-Upload-URL");
                    try {
                        new URL(a);
                        this.a = a;
                        synchronized (this) {
                            aovn aovnVar = this.b;
                            if (aovnVar != null) {
                                aovnVar.a(this);
                            }
                        }
                        String a2 = apuuVar.a("X-Goog-Upload-Chunk-Granularity");
                        if (a2 != null) {
                            try {
                                this.k = Integer.parseInt(a2);
                            } catch (NumberFormatException e2) {
                                throw new apvj(apvi.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                            }
                        }
                        return c(false);
                    } catch (MalformedURLException e3) {
                        throw new apvj(apvi.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                    }
                }
                if (n(g)) {
                    break;
                }
                j(new apvj(apvi.SERVER_ERROR, g.a()));
            } else {
                break;
            }
        }
        return g;
    }

    @Override // defpackage.apvh
    public final synchronized void h(aovn aovnVar, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z2 = false;
        }
        d.t(z2, "Progress threshold (millis) must be greater or equal to 0");
        this.b = aovnVar;
        this.o = i;
        this.p = i2;
    }
}
