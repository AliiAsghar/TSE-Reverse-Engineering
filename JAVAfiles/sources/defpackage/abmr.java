package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abmr {
    private static volatile aqux a;
    private static volatile aqux b;
    public static volatile aqvw c;
    private static volatile aqux d;

    private abmr() {
    }

    private static int c(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static aqux d() {
        aqux aquxVar = d;
        if (aquxVar == null) {
            synchronized (abmr.class) {
                aquxVar = d;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetCustomD2DItem");
                    a2.b();
                    abmu abmuVar = abmu.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abmuVar);
                    a2.d = new arkw(abmv.a);
                    aquxVar = a2.a();
                    d = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux e() {
        aqux aquxVar = b;
        if (aquxVar == null) {
            synchronized (abmr.class) {
                aquxVar = b;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetMetadata");
                    a2.b();
                    abmw abmwVar = abmw.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abmwVar);
                    a2.d = new arkw(abmx.a);
                    aquxVar = a2.a();
                    b = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static aqux f() {
        aqux aquxVar = a;
        if (aquxVar == null) {
            synchronized (abmr.class) {
                aquxVar = a;
                if (aquxVar == null) {
                    aquu a2 = aqux.a();
                    a2.e = aquw.UNARY;
                    a2.a = aqux.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "Handshake");
                    a2.b();
                    abmy abmyVar = abmy.a;
                    aozs aozsVar = arkx.a;
                    a2.c = new arkw(abmyVar);
                    a2.d = new arkw(abmz.a);
                    aquxVar = a2.a();
                    a = aquxVar;
                }
            }
        }
        return aquxVar;
    }

    public static /* synthetic */ abmp g(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (abmp) s;
    }

    public static void h(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        abmp abmpVar = (abmp) aozyVar.b;
        abmp abmpVar2 = abmp.a;
        abmpVar.b |= 1;
        abmpVar.e = str;
    }

    public static void i(abnd abndVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        abmp abmpVar = (abmp) aozyVar.b;
        abmp abmpVar2 = abmp.a;
        abmpVar.d = abndVar;
        abmpVar.c = 3;
    }

    public static void j(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        abmp abmpVar = (abmp) aozyVar.b;
        abmp abmpVar2 = abmp.a;
        abmpVar.b |= 2;
        abmpVar.f = i;
    }

    public static int k(int i) {
        int[] ac = a.ac();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = ac[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static long l(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c2 = 0;
        if (length <= 32) {
            if (length <= 16) {
                if (length >= 8) {
                    long j = (length + length) - 7286425919675154353L;
                    long v = v(bArr, 0) - 7286425919675154353L;
                    long v2 = v(bArr, length - 8);
                    return u((Long.rotateRight(v2, 37) * j) + v, (Long.rotateRight(v, 25) + v2) * j, j);
                }
                if (length >= 4) {
                    return u(length + ((c(bArr, 0) & 4294967295L) << 3), c(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
                }
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                return (-7286425919675154353L) * w((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
            long v3 = v(bArr, 0) * (-5435081209227447693L);
            long v4 = v(bArr, 8);
            long j2 = (length + length) - 7286425919675154353L;
            long v5 = v(bArr, length - 8) * j2;
            return u(Long.rotateRight(v3 + v4, 43) + Long.rotateRight(v5, 30) + (v(bArr, length - 16) * (-7286425919675154353L)), v3 + Long.rotateRight(v4 - 7286425919675154353L, 18) + v5, j2);
        }
        int i2 = 64;
        if (length <= 64) {
            long v6 = v(bArr, 0) * (-7286425919675154353L);
            long v7 = v(bArr, 8);
            long j3 = (length + length) - 7286425919675154353L;
            long v8 = v(bArr, length - 8) * j3;
            long v9 = v(bArr, length - 16) * (-7286425919675154353L);
            long rotateRight = Long.rotateRight(v6 + v7, 43) + Long.rotateRight(v8, 30);
            long rotateRight2 = Long.rotateRight(v7 - 7286425919675154353L, 18) + v6;
            long v10 = v(bArr, 16) * j3;
            long v11 = v(bArr, 24);
            long j4 = rotateRight + v9;
            long v12 = j4 + v(bArr, length - 32);
            long j5 = v12 * j3;
            return u(Long.rotateRight(v10 + v11, 43) + Long.rotateRight(j5, 30) + ((u(j4, rotateRight2 + v8, j3) + v(bArr, length - 24)) * j3), v10 + Long.rotateRight(v11 + v6, 18) + j5, j3);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long v13 = v(bArr, 0) + 95310865018149119L;
        long w = w(-7956866745689871395L) * (-7286425919675154353L);
        long j6 = 2480279821605975764L;
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            int i5 = (i4 >> 6) * i2;
            long rotateRight3 = Long.rotateRight(v13 + j6 + jArr[c2] + v(bArr, i3 + 8), i) * (-5435081209227447693L);
            long rotateRight4 = Long.rotateRight(j6 + jArr[1] + v(bArr, i3 + 48), 42) * (-5435081209227447693L);
            long j7 = rotateRight3 ^ jArr2[1];
            long v14 = jArr[c2] + v(bArr, i3 + 40);
            long rotateRight5 = Long.rotateRight(w + jArr2[c2], 33) * (-5435081209227447693L);
            char c3 = c2;
            x(bArr, i3, jArr[1] * (-5435081209227447693L), j7 + jArr2[c2], jArr);
            long j8 = rotateRight4 + v14;
            x(bArr, i3 + 32, rotateRight5 + jArr2[1], v(bArr, i3 + 16) + j8, jArr2);
            int i6 = i3 + 64;
            if (i6 == i5) {
                int i7 = i4 & 63;
                int i8 = i5 + i7;
                long j9 = j7 & 255;
                long j10 = (j9 + j9) - 5435081209227447693L;
                long j11 = jArr2[c3] + i7;
                long j12 = jArr[c3] + j11;
                jArr[c3] = j12;
                jArr2[c3] = j11 + j12;
                long rotateRight6 = Long.rotateRight(rotateRight5 + j8 + j12 + v(bArr, i8 - 55), 37) * j10;
                long rotateRight7 = Long.rotateRight(j8 + jArr[1] + v(bArr, i8 - 15), 42) * j10;
                long j13 = jArr2[1] * 9;
                long v15 = (jArr[c3] * 9) + v(bArr, i8 - 23);
                long rotateRight8 = Long.rotateRight(j7 + jArr2[c3], 33) * j10;
                long j14 = rotateRight6 ^ j13;
                x(bArr, i8 - 63, jArr[1] * j10, j14 + jArr2[c3], jArr);
                long j15 = rotateRight7 + v15;
                x(bArr, i8 - 31, jArr2[1] + rotateRight8, j15 + v(bArr, i8 - 47), jArr2);
                return u(u(jArr[c3], jArr2[c3], j10) + (w(j15) * (-4348849565147123417L)) + j14, u(jArr[1], jArr2[1], j10) + rotateRight8, j10);
            }
            i3 = i6;
            w = j7;
            i2 = 64;
            c2 = c3;
            v13 = rotateRight5;
            i = 37;
            j6 = j8;
        }
    }

    public static void m(acao acaoVar, GoogleHelp googleHelp) {
        acaoVar.a(googleHelp);
    }

    public static String n(Activity activity) {
        ViewGroup viewGroup;
        String charSequence = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    return ((TextView) childAt).getText().toString();
                }
            }
        }
        return charSequence;
    }

    public static Bundle o(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    @Deprecated
    public static String p() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static void q(Bundle bundle) {
        if (((Boolean) abyu.c.a()).booleanValue() && bundle != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) abyu.b.a()).intValue()) {
                throw new IllegalStateException("Max allowed bundle size of " + abyu.b.a().toString() + " exceeded, you are passing in a bundle of " + dataSize + " size.");
            }
        }
    }

    public static void r(FeedbackOptions feedbackOptions) {
        if (((Boolean) abyu.c.a()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            abyo.a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) abyu.b.a()).intValue()) {
                throw new IllegalStateException("Max allowed feedback options size of " + abyu.b.a().toString() + " exceeded, you are passing in feedback options of " + dataSize + " size.");
            }
        }
    }

    public static void s(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static void t(Context context, abmr abmrVar, long j, GoogleHelp googleHelp) {
        if (abmrVar != null) {
            googleHelp.B = true;
            y(new acan(context, googleHelp, abmrVar, j, 1));
            y(new acan(context, googleHelp, abmrVar, j, 0));
        }
    }

    private static long u(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long v(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long w(long j) {
        return j ^ (j >>> 47);
    }

    private static void x(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long v = j + v(bArr, i);
        long v2 = v(bArr, i + 8);
        long v3 = v(bArr, i + 16);
        long v4 = v(bArr, i + 24);
        long j3 = v2 + v + v3;
        long rotateRight = Long.rotateRight(j2 + v + v4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + v4;
        jArr[1] = rotateRight + v;
    }

    private static void y(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public List a() {
        return null;
    }

    public List b() {
        return null;
    }

    public abmr(byte[] bArr) {
    }
}
