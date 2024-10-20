package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AspectRatioLayout;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import defpackage.aarv;
import defpackage.aauv;
import defpackage.aava;
import defpackage.aavf;
import defpackage.aavm;
import defpackage.abbu;
import defpackage.ahjj;
import defpackage.ahnz;
import defpackage.aksr;
import defpackage.akwb;
import defpackage.alwo;
import defpackage.anen;
import defpackage.armf;
import defpackage.brg;
import defpackage.dyf;
import defpackage.emr;
import defpackage.mbl;
import defpackage.mcl;
import defpackage.yhx;
import defpackage.yjf;
import defpackage.zmr;
import defpackage.zoz;
import defpackage.ztg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MiniCameraViewImpl extends aavf implements aavm {
    public static final alwo b = alwo.o("BugleCamera");
    public final boolean A;
    public mcl B;
    public zmr C;
    public ahjj D;
    private View E;
    private View F;
    private int G;
    private int H;
    private int I;
    private ValueAnimator J;
    public yjf c;
    public aava d;
    public anen e;
    public abbu f;
    public aksr g;
    public armf h;
    public armf i;
    public final WindowManager j;
    public CameraTextureView k;
    public View l;
    public View m;
    public View n;
    public View o;
    public ImageView p;
    public View q;
    public GradientDrawable r;
    public int s;
    public int t;
    public int u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public boolean z;

    public MiniCameraViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = Integer.MAX_VALUE;
        this.j = (WindowManager) context.getSystemService("window");
        this.A = true;
    }

    public static int f(int i, int i2, float f) {
        return (int) (i + ((i2 - i) * f));
    }

    private final void j(boolean z) {
        int i;
        View view;
        View view2 = this.E;
        int i2 = 0;
        if (true != z) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        View view3 = this.F;
        if (true != z) {
            i2 = 8;
        }
        view3.setVisibility(i2);
        if (z) {
            view = this.F;
        } else {
            view = this.E;
        }
        View findViewById = view.findViewById(R.id.switch_camera_button);
        this.l = findViewById;
        findViewById.setOnClickListener(new akwb(this.g, "MiniCameraView switchCameraButton onClick", new aarv(this, 15), 1));
        View findViewById2 = view.findViewById(R.id.fullscreen_camera_button);
        this.m = findViewById2;
        findViewById2.setOnClickListener(new akwb(this.g, "MiniCameraView fullscreenCameraButton onClick", new aarv(this, 16), 1));
        View findViewById3 = view.findViewById(R.id.shutter_button);
        this.n = findViewById3;
        findViewById3.setOnClickListener(new akwb(this.g, "MiniCameraView shutterButton onClick", new zoz(this, view, 17), 1));
    }

    private final void k(int i) {
        boolean z;
        ValueAnimator ofFloat;
        int i2 = this.x + this.G;
        if (i2 == i) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        float f = i2;
        this.J.setCurrentPlayTime((int) (Math.min(1.0f, (1.0f - (i / f)) / (1.0f - (this.s / f))) * ((float) this.J.getDuration())));
        int i3 = this.s;
        if (i < i3 && this.I >= i3) {
            ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
            ((mbl) this.i.b()).c("Bugle.Ui.MediaPicker.Camera.MiniCamera.View.Collapsed.Count");
        } else {
            if (i >= i3 && this.I < i3) {
                ofFloat = ValueAnimator.ofFloat(1.0f, brg.a);
                ((mbl) this.i.b()).c("Bugle.Ui.MediaPicker.Camera.MiniCamera.View.Expanded.Count");
            }
            this.I = i;
        }
        ofFloat.setInterpolator(new emr());
        ofFloat.addUpdateListener(new ztg(this, 3));
        ofFloat.setDuration(100L);
        ofFloat.start();
        this.I = i;
    }

    @Override // defpackage.aavm
    public final void b() {
        aava aavaVar = this.d;
        aavaVar.d(new aauv(aavaVar, 2));
        this.k.d();
    }

    @Override // defpackage.aavm
    public final void c(int i, int i2, int i3) {
        if (i3 == this.I) {
            return;
        }
        this.x = i;
        this.y = i2;
        k(i3);
    }

    @Override // defpackage.aavm
    public final void d(Configuration configuration) {
        boolean z;
        int i = 0;
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        j(z);
        h();
        k(this.I);
        aava aavaVar = this.d;
        if (aavaVar.n != aavaVar.b()) {
            aavaVar.d(new aauv(aavaVar, i));
        }
    }

    @Override // defpackage.aavm
    public final void e(ahjj ahjjVar) {
        this.D = ahjjVar;
    }

    public final void g(View view) {
        PopupMenu popupMenu = new PopupMenu(getContext(), view);
        popupMenu.inflate(R.menu.device_camera_menu);
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: aavn
            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu2) {
                ((mcn) MiniCameraViewImpl.this.h.b()).b(2);
            }
        });
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: aavo
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                MiniCameraViewImpl miniCameraViewImpl = MiniCameraViewImpl.this;
                if (itemId == R.id.take_photo) {
                    ((mcn) miniCameraViewImpl.h.b()).b(3);
                    ((aasy) miniCameraViewImpl.D.a).f.o();
                    return true;
                }
                if (itemId != R.id.record_video) {
                    return false;
                }
                ((mcn) miniCameraViewImpl.h.b()).b(4);
                ((aasy) miniCameraViewImpl.D.a).f.p();
                return true;
            }
        });
        Menu menu = popupMenu.getMenu();
        ColorStateList valueOf = ColorStateList.valueOf(ahnz.d(this, R.attr.colorOnActionBar));
        if (valueOf != null) {
            for (int i = 0; i < menu.size(); i++) {
                dyf.e(menu.getItem(i), valueOf);
            }
            if (yhx.c) {
                popupMenu.setForceShowIcon(true);
            }
        }
        popupMenu.show();
    }

    public final void h() {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        boolean c = this.c.c();
        this.z = c;
        int i5 = 0;
        int i6 = 4;
        if (true != c) {
            i = 0;
        } else {
            i = 4;
        }
        this.q.setVisibility(i);
        CameraTextureView cameraTextureView = this.k;
        if (true != this.z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        cameraTextureView.setVisibility(i2);
        View view = this.l;
        if (this.z && !i()) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        view.setVisibility(i3);
        View view2 = this.m;
        if (this.z && !i() && this.A) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        view2.setVisibility(i4);
        View view3 = this.n;
        if (this.z && !i()) {
            i6 = 0;
        }
        view3.setVisibility(i6);
        GradientDrawable gradientDrawable = this.r;
        if (this.z) {
            i5 = this.H;
        }
        gradientDrawable.setColor(i5);
        ImageView imageView = this.p;
        if (this.z) {
            f = getContext().getColor(R.color.google_white);
        } else {
            f = ahnz.f(getContext(), R.attr.colorOnSurfaceVariant, "MiniCameraView");
        }
        imageView.setColorFilter(f);
    }

    public final boolean i() {
        if (this.p.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ztg(this, 4));
        this.J = ofFloat;
        this.E = findViewById(R.id.buttons_portrait);
        this.F = findViewById(R.id.buttons_landscape);
        ImageView imageView = (ImageView) findViewById(R.id.collapsed_fullscreen_camera_button);
        this.p = imageView;
        boolean z = true;
        imageView.setOnClickListener(new akwb(this.g, "MiniCameraView collapsedFullscreenCameraButton onClick", this.C.a(new aarv(this, 17)), 1));
        this.o = findViewById(R.id.camera_scrim);
        View findViewById = findViewById(R.id.camera_texture_background);
        findViewById.setClipToOutline(true);
        this.r = (GradientDrawable) findViewById.getBackground().mutate();
        View findViewById2 = findViewById(R.id.camera_permission_view);
        this.q = findViewById2;
        findViewById2.setClipToOutline(true);
        this.q.setOnClickListener(new akwb(this.g, "MiniCameraView cameraPermissionView onClick", new aarv(this, 18), 1));
        CameraTextureView cameraTextureView = (CameraTextureView) findViewById(R.id.camera_texture_view);
        this.k = cameraTextureView;
        cameraTextureView.a(4, 3);
        this.k.d();
        this.s = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_collapsed_size);
        this.t = getResources().getDimensionPixelSize(R.dimen.c2o_content_item_corner_radius);
        this.G = getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin);
        this.u = getResources().getDimensionPixelSize(R.dimen.camera_gallery_camera_item_horizontal_margin);
        this.v = getResources().getDimension(R.dimen.category_toggle_elevation);
        this.H = getContext().getColor(R.color.google_black);
        if (getResources().getConfiguration().orientation != 2) {
            z = false;
        }
        j(z);
        h();
    }

    @Override // defpackage.aavm
    public final AspectRatioLayout a() {
        return this;
    }
}
