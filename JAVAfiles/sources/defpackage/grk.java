package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grk {
    public static final /* synthetic */ int a = 0;
    private static final String b = "grk";

    public static final gqz a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        gqs gqsVar;
        gqr gqrVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new gqz(arnv.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int aL = gvf.aL(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = aL;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(aL));
        }
        List<SidecarDisplayFeature> aM = gvf.aM(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : aM) {
            sidecarDisplayFeature.getClass();
            String str = b;
            str.getClass();
            SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new gou(sidecarDisplayFeature, str, 3).a("Type must be either TYPE_FOLD or TYPE_HINGE", rp.r).a("Feature bounds must not be 0", rp.s).a("TYPE_FOLD must have 0 area", rp.t).a("Feature be pinned to either left or top", rp.u).b();
            gqt gqtVar = null;
            if (sidecarDisplayFeature2 != null) {
                int type = sidecarDisplayFeature2.getType();
                if (type != 1) {
                    if (type == 2) {
                        gqsVar = gqs.b;
                    }
                } else {
                    gqsVar = gqs.a;
                }
                int aL2 = gvf.aL(sidecarDeviceState2);
                if (aL2 != 2) {
                    if (aL2 == 3) {
                        gqrVar = gqr.a;
                    }
                } else {
                    gqrVar = gqr.b;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                gqtVar = new gqt(new gon(rect), gqsVar, gqrVar);
            }
            if (gqtVar != null) {
                arrayList.add(gqtVar);
            }
        }
        return new gqz(arrayList);
    }
}
