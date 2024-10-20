package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiu extends esd {
    public final SparseArray A;
    public final SparseBooleanArray B;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Deprecated
    public fiu() {
        this.A = new SparseArray();
        this.B = new SparseBooleanArray();
        f();
    }

    private final void f() {
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
    }

    @Override // defpackage.esd
    public final /* bridge */ /* synthetic */ void c(int i) {
        this.s.remove(Integer.valueOf(i));
    }

    public final void d(int i) {
        super.b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(ese eseVar) {
        super.a(eseVar);
    }

    public fiu(Context context) {
        Point point;
        String K;
        String[] ae;
        int i = eul.a;
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            this.o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.n = alog.r(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            dzg.g(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && eul.aa(context)) {
            if (eul.a < 28) {
                K = eul.K("sys.display-size");
            } else {
                K = eul.K("vendor.display-size");
            }
            if (!TextUtils.isEmpty(K)) {
                try {
                    ae = eul.ae(K.trim(), "x");
                } catch (NumberFormatException unused) {
                }
                if (ae.length == 2) {
                    int parseInt = Integer.parseInt(ae[0]);
                    int parseInt2 = Integer.parseInt(ae[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        int i2 = point.x;
                        int i3 = point.y;
                        this.e = i2;
                        this.f = i3;
                        this.g = true;
                        this.A = new SparseArray();
                        this.B = new SparseBooleanArray();
                        f();
                    }
                }
                eub.c("Util", "Invalid display size: ".concat(String.valueOf(K)));
            }
            if ("Sony".equals(eul.c) && eul.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                int i22 = point.x;
                int i32 = point.y;
                this.e = i22;
                this.f = i32;
                this.g = true;
                this.A = new SparseArray();
                this.B = new SparseBooleanArray();
                f();
            }
        }
        point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        int i222 = point.x;
        int i322 = point.y;
        this.e = i222;
        this.f = i322;
        this.g = true;
        this.A = new SparseArray();
        this.B = new SparseBooleanArray();
        f();
    }

    public fiu(fiv fivVar) {
        super(fivVar);
        this.t = fivVar.C;
        boolean z = fivVar.D;
        this.u = fivVar.E;
        boolean z2 = fivVar.F;
        this.v = fivVar.G;
        boolean z3 = fivVar.H;
        boolean z4 = fivVar.I;
        boolean z5 = fivVar.J;
        boolean z6 = fivVar.K;
        this.w = fivVar.L;
        this.x = fivVar.M;
        this.y = fivVar.N;
        boolean z7 = fivVar.O;
        this.z = fivVar.P;
        boolean z8 = fivVar.Q;
        SparseArray sparseArray = fivVar.R;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.A = sparseArray2;
        this.B = fivVar.S.clone();
    }
}
