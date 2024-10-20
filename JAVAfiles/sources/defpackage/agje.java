package defpackage;

import android.app.Activity;
import j$.time.Duration;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agje {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter");
    public final aggi b;
    public final Activity c;
    public final ascd d;
    public boolean e;
    public final ascd f;
    public final ascv g;
    public final agjd h;
    private final Optional i;

    public agje(aggi aggiVar, Activity activity, Optional optional) {
        activity.getClass();
        this.b = aggiVar;
        this.c = activity;
        this.i = optional;
        this.d = ascy.a(null);
        aozy createBuilder = aggp.a.createBuilder();
        createBuilder.getClass();
        ascd a2 = ascy.a(agiz.H(createBuilder));
        this.f = a2;
        this.g = new ascf(a2);
        this.h = new agjd(this);
    }

    public final asai a(agip agipVar) {
        enj enjVar = new enj(this, (arpe) null, 8);
        aggk aggkVar = (aggk) this.b;
        List B = aqjn.B(new akee(agipVar.a, enjVar, 10), agipVar.d, agipVar.g, this.d, aggkVar.g, aggkVar.e, this.g);
        agipVar.j.isPresent();
        return new jdn((asai[]) aqjn.ax(B).toArray(new asai[0]), this, agipVar, 15, null);
    }

    public final void b() {
        Duration duration = agiq.a;
        c();
    }

    public final void c() {
        this.i.ifPresent(new adoj(new agdl(7), 17));
    }
}
