package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvg implements juv {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler");
    private final Optional c;
    private final afxb d;
    private final List e;
    private final jvf f;

    public jvg(Optional optional, jvf jvfVar, Map map) {
        optional.getClass();
        this.c = optional;
        this.f = jvfVar;
        ((alvg) b.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler", "<init>", 45, "LocationShortcutHandler.kt")).q("Checking to recover location picker result");
        qjh.l(jvfVar.b, null, new jvr(jvfVar, null, 1), 3);
        this.d = new afxb(R.drawable.quantum_gm_ic_place_vd_theme_24, new afxa(hwr.ac(R.color.location_shortcut_background, map), new agei(R.color.location_shortcut_icon_tint)));
        this.e = aqjn.y(afkj.b);
    }

    @Override // defpackage.juv
    public final int a() {
        return R.string.location_shortcut_title;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.d;
    }

    @Override // defpackage.juv
    public final List c() {
        return this.e;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        jvf jvfVar = this.f;
        efu an = hwr.an(view);
        if (jvfVar.h.a() && ((wpn) jvfVar.l.b.c()).a()) {
            acit acitVar = new acit((byte[]) null);
            acdd acddVar = (acdd) jvfVar.i.b();
            acdb acdbVar = new acdb();
            acdbVar.c(100);
            acdbVar.b(1000L);
            d.t(true, "maxUpdateAgeMillis must be greater than or equal to 0");
            acdbVar.a = 10000L;
            abgj.n(2);
            acdbVar.b = 2;
            acir c = acddVar.c(acdbVar.a(), (adae) acitVar.a);
            c.s(new kos(new jsv(jvfVar, 5), 1));
            c.r(new ktn(jvfVar, 1));
            return;
        }
        qjh.l(jvfVar.b, null, new rwu(jvfVar, an, null, 1), 3);
    }

    @Override // defpackage.juv
    public final boolean e() {
        return this.c.isPresent();
    }
}
