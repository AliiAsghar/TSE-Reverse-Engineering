package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekc implements Runnable {
    final /* synthetic */ ekd a;
    final /* synthetic */ qdq b;

    public ekc(ekd ekdVar, qdq qdqVar) {
        this.a = ekdVar;
        this.b = qdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        ekd ekdVar = this.a;
        ekdVar.d = this.b;
        if (ekdVar.d == null) {
            return;
        }
        try {
            try {
                atal l = dzn.l(ekdVar.a, ekdVar.b);
                if (l.a == 0) {
                    ebv[] s = l.s();
                    if (s != null && s.length != 0) {
                        ebv ebvVar = s[0];
                        int i = ebvVar.e;
                        if (i == 2) {
                            synchronized (ekdVar.c) {
                            }
                            i = 2;
                        }
                        if (i == 0) {
                            Typeface b = dzn.b(ekdVar.a, new ebv[]{ebvVar});
                            ByteBuffer l2 = dyy.l(ekdVar.a, ebvVar.a);
                            if (l2 != null) {
                                qdq qdqVar = ekdVar.d;
                                ByteBuffer duplicate = l2.duplicate();
                                duplicate.order(ByteOrder.BIG_ENDIAN);
                                dyl.c(4, duplicate);
                                char c = (char) duplicate.getShort();
                                if (c <= 'd') {
                                    dyl.c(6, duplicate);
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < c) {
                                            int i3 = duplicate.getInt();
                                            dyl.c(4, duplicate);
                                            j = dyl.b(duplicate);
                                            dyl.c(4, duplicate);
                                            if (i3 == 1835365473) {
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        } else {
                                            j = -1;
                                            break;
                                        }
                                    }
                                    if (j != -1) {
                                        dyl.c((int) (j - duplicate.position()), duplicate);
                                        dyl.c(12, duplicate);
                                        long b2 = dyl.b(duplicate);
                                        for (int i4 = 0; i4 < b2; i4++) {
                                            int i5 = duplicate.getInt();
                                            long b3 = dyl.b(duplicate);
                                            dyl.b(duplicate);
                                            if (i5 != 1164798569 && i5 != 1701669481) {
                                            }
                                            duplicate.position((int) (b3 + j));
                                            gku gkuVar = new gku();
                                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                            gkuVar.d(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                            euu euuVar = new euu(b, gkuVar);
                                            Object obj = qdqVar.a;
                                            ((ekq) obj).b = euuVar;
                                            Object obj2 = ((ekq) obj).b;
                                            Object obj3 = ((ekq) obj).c;
                                            ((ekq) obj).a = new ahuq((euu) obj2, ((ejx) obj3).i, ((ejx) obj3).g, ((ejx) obj3).h);
                                            Object obj4 = ((ekq) obj).c;
                                            ArrayList arrayList = new ArrayList();
                                            ((ejx) obj4).a.writeLock().lock();
                                            try {
                                                ((ejx) obj4).c = 1;
                                                arrayList.addAll(((ejx) obj4).b);
                                                ((ejx) obj4).b.clear();
                                                ((ejx) obj4).a.writeLock().unlock();
                                                ((ejx) obj4).d.post(new gwa(arrayList, ((ejx) obj4).c, (Throwable) null, 1));
                                                ekdVar.b();
                                                return;
                                            } catch (Throwable th) {
                                                ((ejx) obj4).a.writeLock().unlock();
                                                throw th;
                                            }
                                        }
                                    }
                                    throw new IOException("Cannot read metadata.");
                                }
                                throw new IOException("Cannot read metadata.");
                            }
                            throw new RuntimeException("Unable to open file.");
                        }
                        throw new RuntimeException(a.cb(i, "fetchFonts result is not OK. (", ")"));
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + l.a + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        } catch (Throwable th2) {
            ekdVar.d.K(th2);
            ekdVar.b();
        }
    }
}
