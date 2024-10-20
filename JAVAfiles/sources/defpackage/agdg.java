package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdg extends arrp implements arqr {
    final /* synthetic */ ert a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdg(ert ertVar) {
        super(1);
        this.a = ertVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z;
        boolean z2;
        SurfaceHolder holder;
        SurfaceHolder holder2;
        fyx fyxVar = (fyx) obj;
        fyxVar.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        ert ertVar = this.a;
        if (ertVar != null && ((fad) ertVar).i != Looper.getMainLooper()) {
            z2 = false;
        } else {
            z2 = true;
        }
        d.s(z2);
        ert ertVar2 = fyxVar.l;
        if (ertVar2 != ertVar) {
            if (ertVar2 != null) {
                ertVar2.M(fyxVar.a);
                if (ertVar2.l(27)) {
                    View view = fyxVar.d;
                    if (view instanceof SurfaceView) {
                        fad fadVar = (fad) ertVar2;
                        fadVar.ag();
                        if (view == null) {
                            holder2 = null;
                        } else {
                            holder2 = ((SurfaceView) view).getHolder();
                        }
                        fadVar.ag();
                        if (holder2 != null && holder2 == fadVar.u) {
                            fadVar.X();
                        }
                    }
                }
                Class cls = fyxVar.i;
                if (cls != null && cls.isAssignableFrom(ertVar2.getClass())) {
                    try {
                        Method method = fyxVar.j;
                        dzg.g(method);
                        method.invoke(ertVar2, null);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            SubtitleView subtitleView = fyxVar.f;
            if (subtitleView != null) {
                subtitleView.a(null);
            }
            fyxVar.l = ertVar;
            if (fyxVar.r()) {
                fyxVar.g.c(ertVar);
            }
            fyxVar.i();
            fyxVar.l();
            fyxVar.m(true);
            if (ertVar != null) {
                if (ertVar.l(27)) {
                    View view2 = fyxVar.d;
                    if (view2 instanceof SurfaceView) {
                        fad fadVar2 = (fad) ertVar;
                        fadVar2.ag();
                        if (view2 == null) {
                            holder = null;
                        } else {
                            holder = ((SurfaceView) view2).getHolder();
                        }
                        fadVar2.ag();
                        if (holder == null) {
                            fadVar2.X();
                        } else {
                            fadVar2.Z();
                            fadVar2.v = true;
                            fadVar2.u = holder;
                            holder.addCallback(fadVar2.j);
                            Surface surface = holder.getSurface();
                            if (surface != null && surface.isValid()) {
                                fadVar2.ac(surface);
                                Rect surfaceFrame = holder.getSurfaceFrame();
                                fadVar2.Y(surfaceFrame.width(), surfaceFrame.height());
                            } else {
                                fadVar2.ac(null);
                                fadVar2.Y(0, 0);
                            }
                        }
                    }
                    if (ertVar.l(30)) {
                        esg J = ertVar.J();
                        loop0: for (int i = 0; i < J.b.size(); i++) {
                            if (((esf) J.b.get(i)).a() == 2) {
                                esf esfVar = (esf) J.b.get(i);
                                for (int i2 = 0; i2 < esfVar.c.length; i2++) {
                                    if (!esfVar.d(i2)) {
                                    }
                                }
                            }
                        }
                    }
                    fyxVar.h();
                    break loop0;
                }
                if (fyxVar.f != null && ertVar.l(28)) {
                    SubtitleView subtitleView2 = fyxVar.f;
                    fad fadVar3 = (fad) ertVar;
                    fadVar3.ag();
                    subtitleView2.a(fadVar3.x.b);
                }
                ertVar.K(fyxVar.a);
                Class cls2 = fyxVar.i;
                if (cls2 != null && cls2.isAssignableFrom(ertVar.getClass())) {
                    try {
                        Method method2 = fyxVar.j;
                        dzg.g(method2);
                        Object obj2 = fyxVar.k;
                        dzg.g(obj2);
                        method2.invoke(ertVar, obj2);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                fyxVar.e(false);
            } else {
                fyxVar.c();
            }
        }
        return arnb.a;
    }
}
