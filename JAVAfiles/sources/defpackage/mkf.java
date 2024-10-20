package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mkf implements ancy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mkf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, ancy] */
    @Override // defpackage.ancy
    public final Object a(ahmn ahmnVar, Object obj) {
        IOException iOException;
        InputStreamReader inputStreamReader;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ?? r2 = this.a;
                            long j = akto.a;
                            ahmnVar.getClass();
                            akru b = akqj.b();
                            akry h = akqj.h(b, r2);
                            try {
                                return this.b.a(ahmnVar, obj);
                            } catch (Throwable th) {
                                try {
                                    akqd.b(th);
                                    throw th;
                                } finally {
                                    akqj.h(b, h);
                                }
                            }
                        }
                        akfa akfaVar = (akfa) obj;
                        if (ansy.l(akfaVar, (akgd) this.a, (Instant) this.b)) {
                            return akfaVar.e();
                        }
                        throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
                    }
                    return ((yin) this.a).h((InputStream) obj, (alog) this.b);
                }
                InputStream inputStream = (InputStream) obj;
                ydq ydqVar = (ydq) this.a;
                long epochMilli = ydqVar.d.f().toEpochMilli();
                Object obj2 = this.b;
                long j2 = 0;
                try {
                    inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                } catch (IOException e) {
                    iOException = e;
                }
                try {
                    char[] cArr = new char[8192];
                    while (true) {
                        int read = inputStreamReader.read(cArr, 0, 8192);
                        if (read < 0) {
                            break;
                        }
                        ((PrintWriter) obj2).write(cArr, 0, read);
                        j2 += read;
                    }
                    inputStreamReader.close();
                    ((PrintWriter) obj2).println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(ydqVar.d.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j2)));
                    return null;
                } catch (Throwable th2) {
                    long j3 = j2;
                    try {
                        try {
                            inputStreamReader.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                        j2 = j3;
                        ((alwl) ((alwl) ((alwl) ydq.a.i()).g(iOException)).h("com/google/android/apps/messaging/shared/util/flogger/FloggerUtil", "dumpFloggerLogData", 'd', "FloggerUtil.java")).q("Failed to dump flogger logs");
                        ((PrintWriter) obj2).println(String.format(Locale.ENGLISH, "Flogger Dump: %dms bytes: %d", Long.valueOf(ydqVar.d.f().minusMillis(epochMilli).toEpochMilli()), Long.valueOf(j2)));
                        return null;
                    }
                }
            }
            mkg mkgVar = (mkg) this.a;
            ahqr ahqrVar = (ahqr) mkgVar.f.b();
            ahqq ahqqVar = (ahqq) this.b;
            ahqrVar.f(ahqqVar, yci.a, null, ahqp.SUCCESS);
            alog d = mkgVar.d(((ych) obj).a);
            ((ahqr) mkgVar.f.b()).f(ahqqVar, yci.f, null, ahqp.SUCCESS);
            return d;
        }
        mkg mkgVar2 = (mkg) this.a;
        ((ahqr) mkgVar2.f.b()).f((ahqq) this.b, yci.b, null, ahqp.SUCCESS);
        return mkgVar2.d(((ych) obj).a);
    }
}
