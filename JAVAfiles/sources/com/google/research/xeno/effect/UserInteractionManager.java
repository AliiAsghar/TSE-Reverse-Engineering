package com.google.research.xeno.effect;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.aove;
import defpackage.aozy;
import defpackage.appm;
import defpackage.appp;
import defpackage.apps;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class UserInteractionManager {
    public static final String a = "UserInteractionManager";
    public View b;

    protected UserInteractionManager() {
        Looper mainLooper;
        new apps(this);
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new Handler(mainLooper);
    }

    public static final appm c(PointF pointF) {
        aozy createBuilder = appm.a.createBuilder();
        double d = pointF.x;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appm) createBuilder.b).b = d;
        double d2 = pointF.y;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appm) createBuilder.b).c = d2;
        return (appm) createBuilder.s();
    }

    public static final void d() {
        aove.h(new appp(0));
    }

    public final appm a(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        b(pointF);
        return c(pointF);
    }

    public final void b(PointF pointF) {
        pointF.x /= this.b.getWidth();
        pointF.y /= this.b.getHeight();
    }
}
