package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebu {
    public static final ul a = new ul(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final vl d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new acra(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new vl();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((ebq) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    public static atal b(String str, Context context, List list, int i) {
        atal atalVar;
        int i2;
        int length;
        Typeface c2;
        gvf.bd("getFontSync");
        try {
            Typeface typeface = (Typeface) a.b(str);
            if (typeface != null) {
                atalVar = new atal(typeface);
            } else {
                try {
                    atal a2 = ebp.a(context, list);
                    if (a2.a != 0) {
                        i2 = -2;
                    } else {
                        ebv[] s = a2.s();
                        if (s != null && (length = s.length) != 0) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    int i4 = s[i3].e;
                                    if (i4 != 0) {
                                        if (i4 < 0) {
                                            i2 = -3;
                                        } else {
                                            i2 = i4;
                                        }
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    i2 = 0;
                                    break;
                                }
                            }
                        }
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        atalVar = new atal(i2, (char[]) null);
                    } else {
                        if (a2.b.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                            ?? r10 = a2.b;
                            gvf.bd("TypefaceCompat.createFromFontInfoWithFallback");
                            try {
                                c2 = eau.a.f(context, r10, i);
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        } else {
                            c2 = eau.c(context, a2.s(), i);
                        }
                        if (c2 != null) {
                            a.c(str, c2);
                            atalVar = new atal(c2);
                        } else {
                            atalVar = new atal(-3, (char[]) null);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    atalVar = new atal(-1, (char[]) null);
                }
            }
            return atalVar;
        } catch (Throwable th) {
            throw th;
        }
    }
}
