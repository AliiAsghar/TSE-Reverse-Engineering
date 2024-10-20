package defpackage;

import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjo {
    public Object a;

    public xjo() {
    }

    public final xpr a() {
        Object obj = this.a;
        if (obj != null) {
            return new xpr((String) obj);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null downloadId");
    }

    public final void c(boolean z) {
        int i;
        Object obj = this.a;
        if (obj != null) {
            ztc ztcVar = (ztc) obj;
            if (z != ztcVar.l && ztcVar.j != null) {
                ztcVar.l = z;
                Slide slide = new Slide();
                slide.setDuration(333L);
                slide.setSlideEdge(48);
                slide.addTarget(ztcVar.j);
                TransitionManager.beginDelayedTransition(ztcVar.j, slide);
                ViewGroup viewGroup = ztcVar.j;
                if (true != z) {
                    i = 0;
                } else {
                    i = 8;
                }
                viewGroup.setVisibility(i);
            }
        }
    }

    public final void d() {
        zsq zsqVar;
        Object obj = this.a;
        if (obj != null && (zsqVar = ((ztc) obj).n) != null) {
            zsqVar.e();
        }
    }

    public xjo(byte[] bArr, byte[] bArr2) {
        alor alorVar = altc.a;
        int i = alog.d;
        this.a = new zos(alorVar, alsx.a, -1, 0);
    }
}
