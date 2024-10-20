package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtg extends rf {
    public arqg a;
    public dte c;
    public final dtd d;
    private final View e;
    private final float f;

    /* compiled from: PG */
    /* renamed from: dtg$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<rg, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dtg dtgVar = dtg.this;
            boolean z = dtgVar.c.a;
            dtgVar.a.a();
            return arnb.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dtg(defpackage.arqg r5, defpackage.dte r6, android.view.View r7, defpackage.drk r8, defpackage.dqv r9, java.util.UUID r10) {
        /*
            r4 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r7.getContext()
            android.content.Context r2 = r7.getContext()
            boolean r2 = defpackage.dsq.b(r6, r2)
            r3 = 1
            if (r3 == r2) goto L15
            r2 = 2132083295(0x7f15025f, float:1.9806728E38)
            goto L18
        L15:
            r2 = 2132083227(0x7f15021b, float:1.980659E38)
        L18:
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r4.a = r5
            r4.c = r6
            r4.e = r7
            r5 = 1090519040(0x41000000, float:8.0)
            r4.f = r5
            android.view.Window r6 = r4.getWindow()
            if (r6 == 0) goto Lb0
            r6.requestFeature(r3)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r0)
            dte r0 = r4.c
            android.content.Context r1 = r4.getContext()
            boolean r0 = defpackage.dsq.b(r0, r1)
            defpackage.eea.c(r6, r0)
            dtd r0 = new dtd
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r6)
            java.util.Objects.toString(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Dialog:"
            java.lang.String r10 = r1.concat(r10)
            r1 = 2131427720(0x7f0b0188, float:1.8477064E38)
            r0.setTag(r1, r10)
            r10 = 0
            r0.setClipChildren(r10)
            float r5 = r9.em(r5)
            r0.setElevation(r5)
            dtg$1 r5 = new dtg$1
            r5.<init>()
            r0.setOutlineProvider(r5)
            r4.d = r0
            android.view.View r5 = r6.getDecorView()
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L80
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L81
        L80:
            r5 = 0
        L81:
            if (r5 == 0) goto L86
            b(r5)
        L86:
            r4.setContentView(r0)
            enm r5 = defpackage.dyx.c(r7)
            defpackage.dyx.d(r0, r5)
            eoz r5 = defpackage.dyy.n(r7)
            defpackage.dyy.o(r0, r5)
            gjz r5 = defpackage.gvf.bl(r7)
            defpackage.gvf.bm(r0, r5)
            arqg r5 = r4.a
            dte r6 = r4.c
            r4.a(r5, r6, r8)
            rm r5 = r4.b
            dtg$2 r6 = new dtg$2
            r6.<init>()
            defpackage.nq.p(r5, r4, r6)
            return
        Lb0:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Dialog has no window"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtg.<init>(arqg, dte, android.view.View, drk, dqv, java.util.UUID):void");
    }

    private static final void b(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof dtd)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    b(viewGroup2);
                }
            }
        }
    }

    public final void a(arqg arqgVar, dte dteVar, drk drkVar) {
        int i;
        int i2;
        boolean z;
        this.a = arqgVar;
        this.c = dteVar;
        boolean aM = d.aM(this.e);
        dto dtoVar = dto.a;
        int ordinal = dteVar.c.ordinal();
        int i3 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aM = false;
                } else {
                    throw new armm();
                }
            } else {
                aM = true;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (true != aM) {
            i = -8193;
        } else {
            i = 8192;
        }
        window.setFlags(i, 8192);
        dtd dtdVar = this.d;
        drk drkVar2 = drk.a;
        int ordinal2 = drkVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = 1;
            } else {
                throw new armm();
            }
        } else {
            i2 = 0;
        }
        dtdVar.setLayoutDirection(i2);
        boolean b = dsq.b(dteVar, getContext());
        dtd dtdVar2 = this.d;
        boolean z2 = dteVar.d;
        if (dtdVar2.d && dtdVar2.b && b == dtdVar2.c) {
            z = false;
        } else {
            z = true;
        }
        dtdVar2.b = true;
        dtdVar2.c = b;
        if (z && (dtdVar2.a.getAttributes().width != -2 || !dtdVar2.d)) {
            dtdVar2.a.setLayout(-2, -2);
            dtdVar2.d = true;
        }
        boolean z3 = dteVar.b;
        setCanceledOnTouchOutside(true);
        Window window2 = getWindow();
        if (window2 != null) {
            if (!b) {
                if (Build.VERSION.SDK_INT < 31) {
                    i3 = 16;
                } else {
                    i3 = 48;
                }
            }
            window2.setSoftInputMode(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = this.c.a;
        if (keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.a.a();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int g;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        boolean z = this.c.b;
        dtd dtdVar = this.d;
        View childAt = dtdVar.getChildAt(0);
        if (childAt != null) {
            int left = dtdVar.getLeft() + childAt.getLeft();
            int width = childAt.getWidth() + left;
            int top = dtdVar.getTop() + childAt.getTop();
            int height = childAt.getHeight() + top;
            int g2 = arsk.g(motionEvent.getX());
            if (left <= g2 && g2 <= width && top <= (g = arsk.g(motionEvent.getY())) && g <= height) {
                return onTouchEvent;
            }
        }
        this.a.a();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
