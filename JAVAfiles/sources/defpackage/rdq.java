package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdq {
    public final /* synthetic */ Object a;
    public final Object b;
    public final Object c;

    public rdq(reb rebVar, Optional optional, alog alogVar) {
        this.a = rebVar;
        this.b = optional;
        this.c = alogVar;
    }

    public final Object a(rut rutVar, amra amraVar, arpe arpeVar) {
        xze xzeVar = reb.a;
        reb rebVar = (reb) this.a;
        return arro.q(rebVar.H, new hak(rebVar, rutVar, this, amraVar, (arpe) null, 19), arpeVar);
    }

    public final Object b(rbu rbuVar, amra amraVar, arpe arpeVar) {
        xze xzeVar = rcr.a;
        rcr rcrVar = (rcr) this.a;
        return arro.q(rcrVar.m, new hak(rcrVar, rbuVar, this, amraVar, (arpe) null, 18), arpeVar);
    }

    public rdq(fcx fcxVar) {
        this.a = fcxVar;
        this.b = new Handler(Looper.myLooper());
        this.c = new fcw(this);
    }

    public rdq(rcr rcrVar, Optional optional, alog alogVar) {
        optional.getClass();
        this.a = rcrVar;
        this.b = optional;
        this.c = alogVar;
    }
}
