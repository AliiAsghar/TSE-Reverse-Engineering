package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpw {
    public static final float a(long j, float f, dqv dqvVar) {
        long c = drm.c(j);
        if (a.bB(c, 4294967296L)) {
            if (dqvVar.ed() > 1.05d) {
                return (drm.a(j) / drm.a(dqvVar.es(f))) * f;
            }
            return dqvVar.el(j);
        }
        if (!a.bB(c, 8589934592L)) {
            return Float.NaN;
        }
        return drm.a(j) * f;
    }

    public static final dip b(dip dipVar, dip dipVar2) {
        if (dipVar == null) {
            return dipVar2;
        }
        return dipVar.d(dipVar2);
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new BackgroundColorSpan(ckw.b(j)), i, i2);
        }
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            g(spannable, new ForegroundColorSpan(ckw.b(j)), i, i2);
        }
    }

    public static final void e(Spannable spannable, long j, dqv dqvVar, int i, int i2) {
        long c = drm.c(j);
        if (!a.bB(c, 4294967296L)) {
            if (a.bB(c, 8589934592L)) {
                g(spannable, new RelativeSizeSpan(drm.a(j)), i, i2);
                return;
            }
            return;
        }
        g(spannable, new AbsoluteSizeSpan(arsk.g(dqvVar.el(j)), false), i, i2);
    }

    public static final void f(Spannable spannable, dpc dpcVar, int i, int i2) {
        if (dpcVar != null) {
            ArrayList arrayList = new ArrayList(aqjn.J(dpcVar, 10));
            Iterator<dpb> it = dpcVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            g(spannable, new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2);
        }
    }

    public static final void g(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }
}
