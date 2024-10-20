package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyu {
    public String A;
    public Bundle B;
    public int C;
    public int D;
    public Notification E;
    public String F;
    public int G;
    public String H;
    public eaa I;
    public long J;
    public int K;
    public boolean L;
    public dyr M;
    public Notification N;
    public boolean O;
    public Object P;

    @Deprecated
    public ArrayList Q;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public CharSequence j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public dzk o;
    public CharSequence p;
    public CharSequence q;
    public int r;
    public int s;
    public boolean t;
    public String u;
    public boolean v;
    public String w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x056a A[LOOP:5: B:137:0x0568->B:138:0x056a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dyu(android.content.Context r32, android.app.Notification r33) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyu.<init>(android.content.Context, android.app.Notification):void");
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    private final void y(int i, boolean z) {
        if (z) {
            Notification notification = this.N;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.N;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final Notification a() {
        Bundle bundle;
        fqf fqfVar = new fqf(this);
        dzk dzkVar = ((dyu) fqfVar.b).o;
        if (dzkVar != null) {
            dzkVar.f(fqfVar);
        }
        Notification build = ((Notification.Builder) fqfVar.e).build();
        if (dzkVar != null) {
            ((dyu) fqfVar.b).o.j();
        }
        if (dzkVar != null && (bundle = build.extras) != null) {
            dzkVar.i(bundle);
        }
        return build;
    }

    public final Bundle b() {
        if (this.B == null) {
            this.B = new Bundle();
        }
        return this.B;
    }

    public final void d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new dyk(IconCompat.h(null, "", i), charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false));
    }

    public final void e(dyk dykVar) {
        this.b.add(dykVar);
    }

    public final void f(dzv dzvVar) {
        if (dzvVar != null) {
            this.c.add(dzvVar);
        }
    }

    public final void g(boolean z) {
        y(16, z);
    }

    public final void h(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void j(int i) {
        this.N.defaults = i;
        if ((i & 4) != 0) {
            this.N.flags |= 1;
        }
    }

    public final void k(PendingIntent pendingIntent) {
        this.N.deleteIntent = pendingIntent;
    }

    public final void l() {
        this.K = 2;
    }

    public final void m(Bitmap bitmap) {
        IconCompat f;
        if (bitmap == null) {
            f = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            f = IconCompat.f(bitmap);
        }
        this.i = f;
    }

    public final void n(int i, int i2, int i3) {
        this.N.ledARGB = i;
        this.N.ledOnMS = i2;
        this.N.ledOffMS = i3;
        int i4 = 0;
        if (this.N.ledOnMS != 0 && this.N.ledOffMS != 0) {
            i4 = 1;
        }
        Notification notification = this.N;
        notification.flags = i4 | (notification.flags & (-2));
    }

    public final void o(boolean z) {
        y(2, z);
    }

    public final void p(boolean z) {
        y(8, z);
    }

    public final void q(int i) {
        this.N.icon = i;
    }

    public final void r(IconCompat iconCompat) {
        this.P = dzd.f(iconCompat, this.a);
    }

    public final void s(Uri uri) {
        this.N.sound = uri;
        this.N.audioStreamType = -1;
        AudioAttributes.Builder d = dys.d(dys.b(dys.a(), 4), 5);
        this.N.audioAttributes = dys.e(d);
    }

    public final void t(dzk dzkVar) {
        if (this.o != dzkVar) {
            this.o = dzkVar;
            if (dzkVar != null) {
                dzkVar.h(this);
            }
        }
    }

    public final void u(CharSequence charSequence) {
        this.p = c(charSequence);
    }

    public final void v(CharSequence charSequence) {
        this.N.tickerText = c(charSequence);
    }

    public final void w(long[] jArr) {
        this.N.vibrate = jArr;
    }

    public final void x(long j) {
        this.N.when = j;
    }

    public dyu(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.m = true;
        this.x = false;
        this.C = 0;
        this.D = 0;
        this.G = 0;
        this.K = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.a = context;
        this.F = str;
        notification.when = System.currentTimeMillis();
        this.N.audioStreamType = -1;
        this.l = 0;
        this.Q = new ArrayList();
        this.L = true;
    }
}
