package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktk {
    static Integer d;
    public final Object a;
    public final Object b;
    public Object c;

    public ktk() {
        throw null;
    }

    public static ktk A(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ktk(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private final int B(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (!((View) this.a).isLayoutRequested() && i2 == -2) {
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = ((View) this.a).getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                hwr.i(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
        return 0;
    }

    private static final boolean C(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static final boolean e(int i, int i2) {
        if (C(i) && C(i2)) {
            return true;
        }
        return false;
    }

    public static ktk y(Context context, int i, int[] iArr) {
        return new ktk(context, context.obtainStyledAttributes(i, iArr));
    }

    public static ktk z(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ktk(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final void a() {
        ViewParent viewParent;
        aiut.c();
        Object obj = this.c;
        if (obj != null) {
            viewParent = ((TextView) obj).getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != null) {
            Object obj2 = this.c;
            obj2.getClass();
            ViewParent parent = ((TextView) obj2).getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView((View) this.c);
        }
    }

    public final int b() {
        int i;
        View view = (View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return B(((View) this.a).getHeight(), i, paddingTop);
    }

    public final int c() {
        int i;
        View view = (View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return B(((View) this.a).getWidth(), i, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void d() {
        ViewTreeObserver viewTreeObserver = ((View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    public final void f(gqz gqzVar) {
        this.c = gqzVar;
        new fhh((Object) this, (Object) gqzVar, 9, (byte[]) null).run();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gkg, java.lang.Object] */
    public final gkg g() {
        Object obj = this.b;
        if (true != (obj instanceof gjc)) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return ((gjc) obj).b.a;
    }

    public final void h(enf enfVar) {
        Object obj = this.c;
        if (obj != null) {
            ((eoq) obj).run();
        }
        eoq eoqVar = new eoq((eno) this.b, enfVar);
        this.c = eoqVar;
        ((Handler) this.a).postAtFrontOfQueue(eoqVar);
    }

    public final int i(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelOffset(i, i2);
    }

    public final int j(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelSize(i, i2);
    }

    public final int k(int i, int i2) {
        return ((TypedArray) this.b).getInt(i, i2);
    }

    public final int l(int i, int i2) {
        return ((TypedArray) this.b).getInteger(i, i2);
    }

    public final int m(int i, int i2) {
        return ((TypedArray) this.b).getLayoutDimension(i, i2);
    }

    public final int n(int i, int i2) {
        return ((TypedArray) this.b).getResourceId(i, i2);
    }

    public final ColorStateList o(int i) {
        int resourceId;
        ColorStateList f;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0 && (f = egl.f((Context) this.a, resourceId)) != null) {
            return f;
        }
        return ((TypedArray) this.b).getColorStateList(i);
    }

    public final Drawable p(int i) {
        int resourceId;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0) {
            return d.f((Context) this.a, resourceId);
        }
        return ((TypedArray) this.b).getDrawable(i);
    }

    public final Drawable q(int i) {
        int resourceId;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0) {
            return km.d().g((Context) this.a, resourceId);
        }
        return null;
    }

    public final CharSequence r(int i) {
        return ((TypedArray) this.b).getText(i);
    }

    public final String s(int i) {
        return ((TypedArray) this.b).getString(i);
    }

    public final void t() {
        ((TypedArray) this.b).recycle();
    }

    public final boolean u(int i, boolean z) {
        return ((TypedArray) this.b).getBoolean(i, z);
    }

    public final boolean v(int i) {
        return ((TypedArray) this.b).hasValue(i);
    }

    public final int w(int i) {
        return ((TypedArray) this.b).getColor(i, 0);
    }

    public final float x(int i) {
        return ((TypedArray) this.b).getDimension(i, -1.0f);
    }

    public ktk(Activity activity, ecd ecdVar) {
        this.a = activity;
        this.b = ecdVar;
    }

    public ktk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ktk(krv krvVar, Object obj) {
        this.b = krvVar;
        this.a = obj;
    }

    public ktk(byte[] bArr) {
        this.a = new aspp(null, null, null);
        this.b = new aspp(null, null, null);
        this.c = new duq[32];
    }

    public ktk(byte[] bArr, byte[] bArr2) {
        this.a = new asnn(null, null);
        this.b = new asnn(null, null);
        this.c = new al[32];
    }

    public ktk(Activity activity) {
        this.a = activity;
        this.b = new FrameLayout.LayoutParams(-2, -2, 3);
    }

    public ktk(View view) {
        this.b = new ArrayList();
        this.a = view;
    }

    public ktk(enm enmVar) {
        this.b = new eno(enmVar);
        this.a = new Handler();
    }

    public ktk(ghm ghmVar, arqr arqrVar) {
        this.a = ghmVar;
        this.b = new gjc(new ghw(arqrVar.a(new ghm(ghmVar.a, ghmVar.b, ghmVar.c, ghmVar.n, aqjn.ar(ghmVar.d, new gib(new rh(this, 18))), ghmVar.e, ghmVar.m, ghmVar.f, ghmVar.g, ghmVar.h, ghmVar.i, ghmVar.j, ghmVar.k, ghmVar.l))));
        int i = ghmVar.m;
        gkg g = g();
        if (g != null) {
            g.c(i == 3);
        }
    }

    public ktk(ahqr ahqrVar, ahpf ahpfVar) {
        ahqrVar.getClass();
        ahpfVar.getClass();
        this.b = ahqrVar;
        this.a = ahpfVar;
    }

    public ktk(Activity activity, byte[] bArr) {
        activity.getClass();
        this.a = activity;
        this.b = armd.a(new kjm(this, 6));
    }

    public ktk(Context context) {
        this.a = context;
        this.b = new eyl();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, android.media.AudioRouting$OnRoutingChangedListener] */
    public ktk(AudioTrack audioTrack, fcf fcfVar) {
        this.a = audioTrack;
        this.b = fcfVar;
        this.c = new AudioRouting$OnRoutingChangedListener() { // from class: fct
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                AudioDeviceInfo routedDevice2;
                ktk ktkVar = ktk.this;
                if (ktkVar.c != null) {
                    routedDevice = audioRouting.getRoutedDevice();
                    if (routedDevice != null) {
                        Object obj = ktkVar.b;
                        routedDevice2 = audioRouting.getRoutedDevice();
                        ((fcf) obj).b(routedDevice2);
                    }
                }
            }
        };
        fo$$ExternalSyntheticApiModelOutline0.m(audioTrack, (AudioRouting$OnRoutingChangedListener) this.c, new Handler(Looper.myLooper()));
    }

    public ktk(Context context, byte[] bArr) {
        this.a = context.getApplicationContext();
        this.b = fwe.a;
        this.c = fxt.a;
    }
}
