package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijb {
    public final String a;
    public final aiik b;
    public final String c;
    public final List d;
    public final apfs e;
    public final advp f;
    public final HashMap g = new HashMap();
    public Optional h = Optional.empty();
    public final Set i = alzz.N();
    private final String j;
    private final String k;
    private final SecureRandom l;
    private final atal m;

    public aijb(String str, aiik aiikVar, String str2, String str3, String str4, atal atalVar, List list, SecureRandom secureRandom, Optional optional) {
        this.f = new advp("MsrpSessionImpl[%s]", str);
        this.a = str;
        this.b = aiikVar;
        this.j = str2;
        this.k = str3;
        this.c = str4;
        this.d = list;
        this.l = secureRandom;
        this.m = atalVar;
        apfs apfsVar = null;
        anbi anbiVar = (anbi) optional.orElse(null);
        if (anbiVar != null) {
            aozy createBuilder = apfs.a.createBuilder();
            String str5 = anbiVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apfs apfsVar2 = (apfs) createBuilder.b;
            str5.getClass();
            apfsVar2.b |= 1;
            apfsVar2.c = str5;
            albo.T(anbiVar.c());
            int i = anbiVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apfs apfsVar3 = (apfs) createBuilder.b;
            apfsVar3.b |= 2;
            apfsVar3.d = i;
            apfsVar = (apfs) createBuilder.s();
        }
        this.e = apfsVar;
    }

    private final String g() {
        byte[] bArr = new byte[8];
        this.l.nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    private final void h(aiiu aiiuVar) {
        if (this.h.isPresent() && aiiuVar.c().equals(((aiiy) this.h.get()).a())) {
            this.h = Optional.empty();
        }
    }

    private final void i(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        synchronized (this.b) {
            aiik aiikVar = this.b;
            int arrayOffset = byteBuffer.arrayOffset();
            int position = byteBuffer.position();
            if (((Boolean) acpy.g.a()).booleanValue() && aczl.o()) {
                aigj aigjVar = new aigj(aiikVar.a());
                aigjVar.write(array, arrayOffset, position);
                aigjVar.flush();
                advr.d(aiik.a, "Msrp message: %s", new String(aigjVar.a.array(), StandardCharsets.UTF_8));
            } else {
                aiikVar.a().write(array, arrayOffset, position);
                aiikVar.a().flush();
            }
        }
    }

    public final aiix a(aiiu aiiuVar, boolean z) {
        boolean z2;
        aiix aiixVar;
        aiiz aiizVar = new aiiz(this.m, aiiuVar);
        while (true) {
            aiix aiixVar2 = null;
            while (aiizVar.f) {
                if (aiiuVar.k && (aiixVar = aiiuVar.l) != null) {
                    return aiixVar;
                }
                ByteBuffer next = aiizVar.next();
                advr.d(this.f, "Sending chunk for message ID: %s. Transaction ID: %s.", aiiuVar.b(), aiiuVar.c());
                if (z) {
                    this.h = Optional.of(new aiiy(aiiuVar));
                    z2 = true;
                } else {
                    z2 = false;
                }
                i(next);
                aiiuVar.o = agkx.W().longValue();
                if (z2) {
                    String c = aiiuVar.c();
                    advr.d(this.f, "Wait transaction (id=%s) response for: %d seconds", c, Integer.valueOf(aczl.a()));
                    if (this.h.isEmpty()) {
                        advr.h(this.f, "Wait for response but there is no countdown latch for transaction ID: %s", c);
                    } else {
                        try {
                            ((aiiy) this.h.get()).await(aczl.a(), TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            advr.j(e, this.f, "Wait for response has been interrupted for transaction ID: %s, the session has been stopped.", c);
                        }
                        aiix aiixVar3 = ((aiiy) this.h.get()).b;
                        if (aiixVar3 == null) {
                            advr.h(this.f, "No response for transaction id=%s", c);
                        } else {
                            if (aiixVar3.a == 413) {
                                advr.r(this.f, "Received 413 STOP_SEND response for transaction ID: %s", c);
                                aiiuVar.l = aiixVar3;
                                aiiuVar.k = true;
                            }
                            aiixVar2 = aiixVar3;
                        }
                    }
                }
            }
            advr.d(this.f, "Timestamp for %s SENT_CONTENT_OVER_MSRP: %d", aiiuVar.g, Long.valueOf(aiiuVar.o));
            if (z) {
                return aiixVar2;
            }
            return new aiix(aiiuVar.c(), BasePaymentResult.ERROR_REQUEST_FAILED, "OK");
        }
    }

    public final void b(aiiu aiiuVar) {
        alur it = ((alog) this.d).iterator();
        while (it.hasNext()) {
            ((aiio) it.next()).bg(this, aiiuVar);
        }
    }

    public final void c(aiix aiixVar, aiiw aiiwVar) {
        advr.w(20, 3, "Sending MSRP response: %d", Integer.valueOf(aiixVar.a));
        advr.c("Sending MSRP response: %d, id: %s", Integer.valueOf(aiixVar.a), aiixVar.d);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[4000]);
        atal.g(wrap, aiixVar.d, String.valueOf(aiixVar.a) + " " + aiixVar.b);
        String f = aiixVar.f();
        if (f != null) {
            atal.f(wrap, aiin.i, f.getBytes());
            String d = aiixVar.d();
            if (d != null) {
                atal.f(wrap, aiin.j, d.getBytes());
                atal.e(wrap, aiixVar.d, 36);
                i(wrap);
                alur it = ((alog) this.d).iterator();
                while (it.hasNext()) {
                    ((aiio) it.next()).bj(this, aiixVar, aiiwVar);
                }
                return;
            }
            throw new IllegalStateException("expected non-null `from`");
        }
        throw new IllegalStateException("expected non-null `to`");
    }

    public final void d() {
        advr.d(this.f, "Starting MSRP media session", new Object[0]);
        aiik aiikVar = this.b;
        aiikVar.g = this;
        synchronized (aiikVar.c) {
            if (aiikVar.b == null) {
                advr.c("Waiting for connection to be established", new Object[0]);
                long intValue = ((Integer) aczl.c().a.c.a()).intValue() * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                while (aiikVar.b == null) {
                    long currentTimeMillis2 = intValue - (System.currentTimeMillis() - currentTimeMillis);
                    if (currentTimeMillis2 <= 0) {
                        break;
                    } else {
                        try {
                            aiikVar.c.wait(currentTimeMillis2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            InputStream inputStream = aiikVar.b;
            if (inputStream != null) {
                aiikVar.d = new aiiv(aiikVar.e, aiikVar.g, inputStream);
                aiikVar.d.start();
            }
        }
        if (this.b.c()) {
            advr.d(this.f, "Sending initial empty request", new Object[0]);
            aiiu aiiuVar = new aiiu();
            aiiuVar.e("yes");
            aiiuVar.g();
            aiiuVar.j = true;
            f(aiiuVar);
        }
        advr.d(this.f, "MSRP media session started", new Object[0]);
    }

    public final void e(aiiu aiiuVar, int i) {
        alur it = ((alog) this.d).iterator();
        while (it.hasNext()) {
            ((aiio) it.next()).bk(this, aiiuVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x011f, IOException -> 0x0121, TryCatch #0 {IOException -> 0x0121, blocks: (B:16:0x0059, B:18:0x005d, B:22:0x0069, B:24:0x0072, B:29:0x0082, B:30:0x0096, B:32:0x009c, B:33:0x00b4, B:35:0x00ba, B:39:0x00c8, B:40:0x00db, B:41:0x00f4, B:43:0x00fa, B:45:0x0104, B:47:0x010a, B:49:0x0110), top: B:15:0x0059, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.aiiu r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijb.f(aiiu):void");
    }

    public final String toString() {
        return "MsrpSession for session ID " + this.a + "\r\n To: " + advq.PHONE_NUMBER.c(this.j) + "\r\n From: " + advq.PHONE_NUMBER.c(this.k) + "\r\n Connection: " + this.b.toString();
    }
}
