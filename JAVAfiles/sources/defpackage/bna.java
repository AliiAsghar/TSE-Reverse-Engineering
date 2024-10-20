package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import com.google.android.apps.messaging.R;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bna extends rf {
    public arqg a;
    public final bmz c;
    private bno d;
    private final View e;
    private final float f;

    /* compiled from: PG */
    /* renamed from: bna$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<rg, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bna.this.a.a();
            return arnb.a;
        }
    }

    public bna(arqg arqgVar, bno bnoVar, View view, drk drkVar, dqv dqvVar, UUID uuid, zj zjVar, arwe arweVar, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.a = arqgVar;
        this.d = bnoVar;
        this.e = view;
        this.f = 8.0f;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            eea.c(window, false);
            bmz bmzVar = new bmz(getContext(), window, this.a, zjVar, arweVar);
            Objects.toString(uuid);
            bmzVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:".concat(String.valueOf(uuid)));
            bmzVar.setClipChildren(false);
            bmzVar.setElevation(dqvVar.em(8.0f));
            bmzVar.setOutlineProvider(new ViewOutlineProvider() { // from class: bna.1
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                    outline.setAlpha(brg.a);
                }
            });
            this.c = bmzVar;
            setContentView(bmzVar);
            dyx.d(bmzVar, dyx.c(view));
            dyy.o(bmzVar, dyy.n(view));
            gvf.bm(bmzVar, gvf.bl(view));
            a(this.a, this.d, drkVar);
            efu efuVar = new efu(window, window.getDecorView());
            boolean z2 = !z;
            efuVar.b(z2);
            efuVar.a(z2);
            nq.o(this.b, this, true, new AnonymousClass2());
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    public final void a(arqg arqgVar, bno bnoVar, drk drkVar) {
        int i;
        int i2;
        this.a = arqgVar;
        this.d = bnoVar;
        boolean aM = d.aM(this.e);
        dto dtoVar = dto.a;
        int ordinal = bnoVar.a.ordinal();
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
        bmz bmzVar = this.c;
        drk drkVar2 = drk.a;
        int ordinal2 = drkVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i3 = 1;
            } else {
                throw new armm();
            }
        }
        bmzVar.setLayoutDirection(i3);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                i2 = 48;
            } else {
                i2 = 16;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.a.a();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
