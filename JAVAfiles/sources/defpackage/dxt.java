package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxt<V extends View> {
    public dxt() {
    }

    public static erk A(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] af = eul.af(str, "=");
            if (af.length != 2) {
                eub.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (af[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(foa.d(new euf(Base64.decode(af[1], 0))));
                } catch (RuntimeException e) {
                    eub.g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new fph(af[0], af[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new erk(arrayList);
    }

    public static boolean B(int i, euf eufVar, boolean z) {
        if (eufVar.b() < 7) {
            if (z) {
                return false;
            }
            throw new erm("too short header: " + eufVar.b(), null, true, 1);
        }
        if (eufVar.j() != i) {
            if (z) {
                return false;
            }
            throw new erm("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null, true, 1);
        }
        if (eufVar.j() == 118 && eufVar.j() == 111 && eufVar.j() == 114 && eufVar.j() == 98 && eufVar.j() == 105 && eufVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new erm("expected characters 'vorbis'", null, true, 1);
    }

    public static int C(fmq fmqVar, eqe eqeVar, int i, boolean z) {
        return fmqVar.u(eqeVar, i, z);
    }

    public static void D(fmq fmqVar, euf eufVar, int i) {
        fmqVar.m(eufVar, i, 0);
    }

    public static int E(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static long F(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    public static List G(byte[] bArr) {
        long E = E(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(M(L(E)));
        arrayList.add(M(L(3840L)));
        return arrayList;
    }

    public static boolean H(long j, long j2) {
        if (j - j2 <= L(3840L) / 1000) {
            return true;
        }
        return false;
    }

    public static erk I(flv flvVar, boolean z) {
        dyd dydVar;
        if (z) {
            dydVar = null;
        } else {
            dydVar = fol.a;
        }
        erk w = new efu((short[]) null).w(flvVar, dydVar);
        if (w == null || w.a() == 0) {
            return null;
        }
        return w;
    }

    public static fvq J(euf eufVar) {
        eufVar.K(1);
        int l = eufVar.l();
        long j = eufVar.b;
        long j2 = l;
        int i = l / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long q = eufVar.q();
            if (q == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = q;
            jArr2[i2] = eufVar.q();
            eufVar.K(2);
            i2++;
        }
        eufVar.K((int) ((j + j2) - eufVar.b));
        return new fvq(jArr, jArr2);
    }

    public static efu K(euf eufVar, boolean z, boolean z2) {
        if (z) {
            B(3, eufVar, false);
        }
        eufVar.y((int) eufVar.p());
        long p = eufVar.p();
        String[] strArr = new String[(int) p];
        for (int i = 0; i < p; i++) {
            strArr[i] = eufVar.y((int) eufVar.p());
        }
        if (z2 && (eufVar.j() & 1) == 0) {
            throw new erm("framing bit expected to be set", null, true, 1);
        }
        return new efu(strArr);
    }

    private static long L(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] M(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static int t(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static Intent u(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String w = w(activity);
        if (w == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, w);
        try {
            if (x(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", a.bW(w, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent v(Context context, ComponentName componentName) {
        String x = x(context, componentName);
        if (x == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), x);
        if (x(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String w(Activity activity) {
        try {
            return x(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String x(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return String.valueOf(context.getPackageName()).concat(string);
        }
        return string;
    }

    public static int y(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static int z(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(View view, View view2) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
        m(view, i);
    }

    public Parcelable q(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean s(View view, Rect rect) {
        return false;
    }

    public dxt(Context context, AttributeSet attributeSet) {
    }

    public void b() {
    }

    public void a(dxv dxvVar) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view) {
    }

    @Deprecated
    public void m(View view, int i) {
    }

    public void p(View view, Parcelable parcelable) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }
}
