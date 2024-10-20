package defpackage;

import android.app.ActivityOptions;
import android.content.ClipDescription;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efu {
    public final Object a;

    protected efu() {
        throw null;
    }

    public static efu G(euf eufVar) {
        String str;
        eufVar.K(2);
        int j = eufVar.j();
        int i = j >> 1;
        int i2 = j & 1;
        int j2 = eufVar.j() >> 3;
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        int i3 = j2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (i3 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(i3);
        return new efu(sb.toString());
    }

    public static efu i(int i, int i2, int i3, int i4, boolean z) {
        return new efu(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static efu j(int i, int i2, int i3) {
        return new efu(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static efu k(Context context) {
        return new efu(d$$ExternalSyntheticApiModelOutline0.m(context, 1002));
    }

    public static efu l(View view, int i, int i2) {
        return new efu(ActivityOptions.makeScaleUpAnimation(view, 0, 0, i, i2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final eiz A() {
        return (eiz) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r6.b > r2.b) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.eiz r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.lang.Object r0 = r5.a
            java.lang.Object r1 = r0.c()
            r2 = r1
            eiz r2 = (defpackage.eiz) r2
            boolean r3 = r2 instanceof defpackage.eit
            if (r3 == 0) goto L11
            goto L24
        L11:
            ejc r3 = defpackage.ejc.a
            boolean r3 = defpackage.d.F(r2, r3)
            if (r3 == 0) goto L1a
            goto L24
        L1a:
            boolean r3 = r2 instanceof defpackage.ehn
            if (r3 == 0) goto L26
            int r3 = r6.b
            int r4 = r2.b
            if (r3 <= r4) goto L2a
        L24:
            r2 = r6
            goto L2a
        L26:
            boolean r3 = r2 instanceof defpackage.eis
            if (r3 == 0) goto L31
        L2a:
            boolean r0 = r0.g(r1, r2)
            if (r0 == 0) goto L3
            return
        L31:
            armm r6 = new armm
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efu.B(eiz):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void C() {
        for (int z = aqjn.z(this.a); z >= 0; z--) {
            ((deg) ((ArrayList) this.a).get(z)).a.f();
        }
    }

    public final ClipDescription D() {
        ClipDescription description;
        description = ead$$ExternalSyntheticApiModelOutline0.m347m(((efu) this.a).a).getDescription();
        return description;
    }

    public final Uri E() {
        Uri contentUri;
        contentUri = ead$$ExternalSyntheticApiModelOutline0.m347m(((efu) this.a).a).getContentUri();
        return contentUri;
    }

    public final void F() {
        ead$$ExternalSyntheticApiModelOutline0.m347m(((efu) this.a).a).requestPermission();
    }

    public final void H(qdq qdqVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            qu quVar = null;
            byte b = 0;
            if (qdqVar != null) {
                quVar = new qu(qdqVar, 2, b == true ? 1 : 0);
            }
            view.animate().setUpdateListener(quVar);
        }
    }

    public final void a(boolean z) {
        ((eec) this.a).c(z);
    }

    public final void b(boolean z) {
        ((eec) this.a).d(z);
    }

    public final boolean c() {
        return ((eec) this.a).f();
    }

    public final void d() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void e(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void f(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void g(eer eerVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (eerVar != null) {
                view.animate().setListener(new eeq(eerVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void h(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final Object m(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final Set n() {
        Set entrySet = ((LinkedHashMap) this.a).entrySet();
        entrySet.getClass();
        return entrySet;
    }

    public final boolean o() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final Bundle p() {
        Bundle bundle = new Bundle();
        Object obj = this.a;
        if (obj != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj).intValue());
        }
        return bundle;
    }

    public final da q() {
        return ((cn) this.a).e;
    }

    public final void r() {
        ((cn) this.a).e.noteStateNotSaved();
    }

    public final void s() {
        ((cn) this.a).e.am(true);
    }

    public final int t() {
        return ((fkt[]) this.a).length;
    }

    public final void u(fbt fbtVar) {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            hwo hwoVar = (hwo) it.next();
            if (hwoVar.b == fbtVar) {
                hwoVar.a = true;
                ((CopyOnWriteArrayList) this.a).remove(hwoVar);
            }
        }
    }

    public final fkt v() {
        return ((fkt[]) this.a)[0];
    }

    public final erk w(flv flvVar, dyd dydVar) {
        erk erkVar = null;
        int i = 0;
        while (true) {
            try {
                flvVar.j(((euf) this.a).a, 0, 10);
                ((euf) this.a).J(0);
                if (((euf) this.a).l() != 4801587) {
                    break;
                }
                ((euf) this.a).K(3);
                int i2 = ((euf) this.a).i();
                int i3 = i2 + 10;
                if (erkVar == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(((euf) this.a).a, 0, bArr, 0, 10);
                    flvVar.j(bArr, 10, i2);
                    erkVar = new fol(dydVar).c(bArr, i3);
                } else {
                    flvVar.g(i2);
                }
                i += i3;
            } catch (EOFException unused) {
            }
        }
        flvVar.l();
        flvVar.g(i);
        return erkVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final eor x(String str) {
        str.getClass();
        return (eor) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Set y() {
        return new HashSet(this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final void z() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((eor) it.next()).m();
        }
        this.a.clear();
    }

    public efu(View view, byte[] bArr) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new edn(view) : new edl(view);
    }

    public efu(TextView textView) {
        this.a = new elp(textView);
    }

    public efu(TextView textView, byte[] bArr) {
        this.a = new fvq(textView);
    }

    public efu(Object obj) {
        this.a = obj;
    }

    public efu(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public efu(byte[] bArr, byte[] bArr2) {
        this.a = new nq(null);
    }

    public efu(int i) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public efu(View view) {
        this.a = new WeakReference(view);
    }

    public efu(char[] cArr) {
        this.a = new HashMap();
    }

    public efu(char[] cArr, byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public efu(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new eft(window);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.a = new efs(window);
        } else {
            this.a = new efr(window);
        }
    }

    public efu(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (eul.a >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (eul.a >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.a = usage.build();
    }

    @Deprecated
    public efu(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new eft(windowInsetsController);
        } else {
            this.a = new efs(windowInsetsController);
        }
    }

    public efu(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new ArrayList();
    }

    public efu(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger(0);
    }

    public efu(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = ascy.a(ejc.a);
    }

    public efu(byte[] bArr, char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public efu(short[] sArr) {
        this.a = new euf(10);
    }
}
