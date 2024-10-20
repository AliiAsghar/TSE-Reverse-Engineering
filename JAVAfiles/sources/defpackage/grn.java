package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.view.View;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public grn(Context context, aksr aksrVar, anen anenVar) {
        this.c = new Object();
        this.b = context;
        this.a = aksrVar;
        this.d = anenVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    public final gqz a(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder aJ = gvf.aJ(activity);
        if (aJ == null) {
            return new gqz(arnv.a);
        }
        ?? r0 = this.a;
        if (r0 != 0) {
            sidecarWindowLayoutInfo = r0.getWindowLayoutInfo(aJ);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        ?? r02 = this.a;
        if (r02 == 0 || (sidecarDeviceState = r02.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return grk.a(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, androidx.window.sidecar.SidecarInterface] */
    public final void b(IBinder iBinder, Activity activity) {
        ?? r3;
        this.c.put(iBinder, activity);
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.onWindowLayoutChangeListenerAdded(iBinder);
        }
        int i = 1;
        if (this.c.size() == 1 && (r3 = this.a) != 0) {
            r3.onDeviceStateListenersChanged(false);
        }
        Object obj = this.e;
        if (obj != null) {
            ((grl) obj).a(activity, a(activity));
        }
        if (this.d.get(activity) == null && (activity instanceof eab)) {
            isf isfVar = new isf(this, activity, i);
            this.d.put(activity, isfVar);
            ((eab) activity).gS(isfVar);
        }
    }

    public grn(Uri uri, String str, Uri uri2, String str2) {
        this.a = uri;
        this.d = str;
        this.c = uri2;
        this.b = str2;
    }

    public grn(krv krvVar, kqp kqpVar, kqh kqhVar, kql kqlVar) {
        this.c = krvVar;
        this.b = kqpVar;
        this.d = kqhVar;
        this.a = kqlVar;
    }

    public grn(krv krvVar, kqp kqpVar, kqi kqiVar, kqh kqhVar) {
        this.c = krvVar;
        this.b = kqpVar;
        this.a = kqiVar;
        this.d = kqhVar;
    }

    public grn(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        grk grkVar = new grk();
        this.a = sidecarImpl;
        this.b = grkVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public grn(Drawable.Callback callback) {
        this.a = new hes();
        this.b = new HashMap();
        this.d = new HashMap();
        this.e = ".ttf";
        if (!(callback instanceof View)) {
            hhw.a("LottieDrawable must be inside of a view for images to work.");
            this.c = null;
        } else {
            this.c = ((View) callback).getContext().getAssets();
        }
    }
}
