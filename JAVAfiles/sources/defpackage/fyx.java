package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.google.android.apps.messaging.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyx extends FrameLayout {
    public final fyw a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final SubtitleView f;
    public final fyj g;
    public final Handler h;
    public final Class i;
    public final Method j;
    public final Object k;
    public ert l;
    public boolean m;
    public boolean n;
    private final ImageView o;
    private final View p;
    private final TextView q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;

    public fyx(Context context) {
        super(context, null, 0);
        Class<?> cls;
        Object obj;
        Method method;
        int i;
        int i2;
        fya fyaVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        CaptioningManager captioningManager;
        fyw fywVar = new fyw(this);
        this.a = fywVar;
        this.h = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.o = null;
            this.f = null;
            this.p = null;
            this.q = null;
            this.g = null;
            this.i = null;
            this.j = null;
            this.k = null;
            ImageView imageView = new ImageView(context);
            int i8 = eul.a;
            Resources resources = getResources();
            imageView.setImageDrawable(eul.A(context, resources, R.drawable.exo_edit_mode_logo));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a();
        }
        this.c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (eul.a >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(fywVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.d = null;
        }
        int i9 = eul.a;
        this.e = (ImageView) findViewById(R.id.exo_image);
        try {
            cls = Class.forName("androidx.media3.exoplayer.ExoPlayer");
            Class<?> cls2 = Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            obj = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: fyv
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    if (method2.getName().equals("onImageAvailable")) {
                        fyx fyxVar = fyx.this;
                        fyxVar.h.post(new fhh((Object) fyxVar, objArr[1], 7, (byte[]) null));
                    }
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.i = cls;
        this.j = method;
        this.k = obj;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.o = imageView2;
        if (imageView2 != null) {
            i = 1;
        } else {
            i = 0;
        }
        this.r = i;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f = subtitleView;
        if (subtitleView != null) {
            if (subtitleView.isInEditMode()) {
                fyaVar = fya.a;
            } else {
                CaptioningManager captioningManager2 = (CaptioningManager) subtitleView.getContext().getSystemService("captioning");
                if (captioningManager2 != null && captioningManager2.isEnabled()) {
                    CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                    if (userStyle.hasForegroundColor()) {
                        i3 = userStyle.foregroundColor;
                    } else {
                        i3 = fya.a.b;
                    }
                    int i10 = i3;
                    if (userStyle.hasBackgroundColor()) {
                        i4 = userStyle.backgroundColor;
                    } else {
                        i4 = fya.a.c;
                    }
                    int i11 = i4;
                    if (userStyle.hasWindowColor()) {
                        i5 = userStyle.windowColor;
                    } else {
                        i5 = fya.a.d;
                    }
                    int i12 = i5;
                    if (userStyle.hasEdgeType()) {
                        i6 = userStyle.edgeType;
                    } else {
                        i6 = fya.a.e;
                    }
                    int i13 = i6;
                    if (userStyle.hasEdgeColor()) {
                        i7 = userStyle.edgeColor;
                    } else {
                        i7 = fya.a.f;
                    }
                    fyaVar = new fya(i10, i11, i12, i13, i7, userStyle.getTypeface());
                } else {
                    fyaVar = fya.a;
                }
            }
            subtitleView.a = fyaVar;
            subtitleView.b();
            float f = 1.0f;
            if (!subtitleView.isInEditMode() && (captioningManager = (CaptioningManager) subtitleView.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                f = captioningManager.getFontScale();
            }
            subtitleView.b = f * 0.0533f;
            subtitleView.b();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.p = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        fyj fyjVar = (fyj) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (fyjVar != null) {
            this.g = fyjVar;
        } else if (findViewById2 != null) {
            fyj fyjVar2 = new fyj(context);
            this.g = fyjVar2;
            fyjVar2.setId(R.id.exo_controller);
            fyjVar2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(fyjVar2, indexOfChild);
        } else {
            this.g = null;
        }
        fyj fyjVar3 = this.g;
        if (fyjVar3 != null) {
            i2 = 5000;
        } else {
            i2 = 0;
        }
        this.s = i2;
        this.u = true;
        this.t = true;
        this.n = true;
        this.m = fyjVar3 != null;
        if (fyjVar3 != null) {
            fyu fyuVar = fyjVar3.a;
            int i14 = fyuVar.s;
            if (i14 != 3 && i14 != 2) {
                fyuVar.h();
                fyuVar.e();
            }
            fyj fyjVar4 = this.g;
            fyw fywVar2 = this.a;
            dzg.g(fywVar2);
            fyjVar4.b.add(fywVar2);
        }
        setClickable(true);
        j();
    }

    protected static final void s(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.a != f) {
            aspectRatioFrameLayout.a = f;
            aspectRatioFrameLayout.requestLayout();
        }
    }

    private final void t() {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.o.setVisibility(4);
        }
    }

    private final boolean u(Drawable drawable) {
        if (this.o != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                s(this.b, intrinsicWidth / intrinsicHeight);
                this.o.setScaleType(scaleType);
                this.o.setImageDrawable(drawable);
                this.o.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void b() {
        d();
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final void c() {
        fyj fyjVar = this.g;
        if (fyjVar != null) {
            fyjVar.b();
        }
    }

    public final void d() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = eul.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        ert ertVar = this.l;
        if (ertVar != null && ertVar.l(16) && this.l.R()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z = false;
        } else {
            z = true;
        }
        if (z && r() && !this.g.p()) {
            e(true);
        } else {
            if ((!r() || !this.g.o(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !r()) {
                    return false;
                }
                e(true);
                return false;
            }
            e(true);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0055, code lost:
    
        if (r3.P() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.q()
            if (r0 == 0) goto La
            boolean r0 = r6.n
            if (r0 != 0) goto L9f
        La:
            boolean r0 = r6.r()
            if (r0 == 0) goto L9f
            fyj r0 = r6.g
            boolean r0 = r0.p()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            fyj r0 = r6.g
            int r0 = r0.H
            if (r0 > 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            ert r3 = r6.l
            if (r3 != 0) goto L29
        L27:
            r3 = r1
            goto L59
        L29:
            int r3 = r3.w()
            boolean r4 = r6.t
            if (r4 == 0) goto L58
            ert r4 = r6.l
            r5 = 17
            boolean r4 = r4.l(r5)
            if (r4 == 0) goto L47
            ert r4 = r6.l
            erz r4 = r4.H()
            boolean r4 = r4.q()
            if (r4 != 0) goto L58
        L47:
            if (r3 == r1) goto L27
            r4 = 4
            if (r3 == r4) goto L27
            ert r3 = r6.l
            defpackage.dzg.g(r3)
            boolean r3 = r3.P()
            if (r3 != 0) goto L58
            goto L27
        L58:
            r3 = r2
        L59:
            if (r7 != 0) goto L60
            if (r0 != 0) goto L60
            if (r3 == 0) goto L9f
            goto L61
        L60:
            r1 = r3
        L61:
            boolean r7 = r6.r()
            if (r7 != 0) goto L68
            goto L9f
        L68:
            fyj r7 = r6.g
            if (r1 == 0) goto L6e
            r0 = r2
            goto L70
        L6e:
            int r0 = r6.s
        L70:
            r7.H = r0
            boolean r0 = r7.p()
            if (r0 == 0) goto L7d
            fyu r7 = r7.a
            r7.i()
        L7d:
            fyj r7 = r6.g
            fyu r7 = r7.a
            fyj r0 = r7.a
            boolean r0 = r0.q()
            if (r0 != 0) goto L9c
            fyj r0 = r7.a
            r0.setVisibility(r2)
            fyj r0 = r7.a
            r0.d()
            fyj r0 = r7.a
            android.widget.ImageView r0 = r0.k
            if (r0 == 0) goto L9c
            r0.requestFocus()
        L9c:
            r7.l()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyx.e(boolean):void");
    }

    public final void f() {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setVisibility(0);
            n();
        }
    }

    public final void g() {
        if (r() && this.l != null) {
            if (!this.g.p()) {
                e(true);
            } else if (this.u) {
                this.g.b();
            }
        }
    }

    public final void h() {
        esn esnVar;
        ert ertVar = this.l;
        if (ertVar != null) {
            fad fadVar = (fad) ertVar;
            fadVar.ag();
            esnVar = fadVar.y;
        } else {
            esnVar = esn.a;
        }
        int i = esnVar.b;
        int i2 = esnVar.c;
        float f = brg.a;
        if (i2 != 0 && i != 0) {
            f = (i * esnVar.d) / i2;
        }
        s(this.b, f);
    }

    public final void i() {
        if (this.p != null) {
            ert ertVar = this.l;
            if (ertVar != null) {
                ertVar.w();
            }
            this.p.setVisibility(8);
        }
    }

    public final void j() {
        fyj fyjVar = this.g;
        String str = null;
        if (fyjVar != null && this.m) {
            if (fyjVar.p()) {
                if (this.u) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        if (q() && this.n) {
            c();
        } else {
            e(false);
        }
    }

    public final void l() {
        if (this.q != null) {
            ert ertVar = this.l;
            if (ertVar != null) {
                ((fad) ertVar).U();
            }
            this.q.setVisibility(8);
        }
    }

    public final void m(boolean z) {
        boolean z2;
        ImageView imageView;
        Drawable drawable;
        ert ertVar = this.l;
        boolean z3 = true;
        if (ertVar != null && ertVar.l(30) && !ertVar.J().a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || z) {
            t();
            a();
            b();
            if (!z2) {
                return;
            }
        }
        boolean p = p();
        boolean o = o();
        if (!p && !o) {
            a();
            b();
        }
        View view = this.c;
        if (view == null || view.getVisibility() != 4 || (imageView = this.e) == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) {
            z3 = false;
        }
        if (o && !p && z3) {
            a();
            f();
        } else if (p && !o && z3) {
            b();
        }
        if (!p && !o && this.r != 0) {
            dzg.h(this.o);
            if (ertVar != null && ertVar.l(18)) {
                fad fadVar = (fad) ertVar;
                fadVar.ag();
                byte[] bArr = fadVar.r.g;
                if (bArr != null) {
                    if (u(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)))) {
                        return;
                    }
                }
            }
            if (u(null)) {
                return;
            }
        }
        t();
    }

    public final void n() {
        Drawable drawable;
        ImageView imageView = this.e;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ImageView imageView2 = this.e;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (imageView2.getVisibility() == 0) {
                    s(this.b, intrinsicWidth / intrinsicHeight);
                }
                this.e.setScaleType(scaleType);
            }
        }
    }

    public final boolean o() {
        ert ertVar = this.l;
        if (ertVar != null && this.k != null && ertVar.l(30) && ertVar.J().b(4)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (r() && this.l != null) {
            e(true);
            return true;
        }
        return false;
    }

    public final boolean p() {
        ert ertVar = this.l;
        if (ertVar != null && ertVar.l(30) && ertVar.J().b(2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public final boolean q() {
        ert ertVar = this.l;
        if (ertVar != null && ertVar.l(16) && this.l.R() && this.l.P()) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (this.m) {
            dzg.h(this.g);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
