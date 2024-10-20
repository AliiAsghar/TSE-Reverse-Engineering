package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvi implements juv {
    public final armf b;
    private final arml c;
    private final int d;
    private final afxb e;

    public jvi(@nwv armf armfVar, armf armfVar2, Map map) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.c = armd.a(new jkq(armfVar2, this, 4, null));
        this.d = R.string.selfie_gif_shortcut_title;
        this.e = new afxb(R.drawable.ic_selfie_gif, new afxa(hwr.ac(R.color.selfie_gif_shortcut_background, map), new agei(R.color.selfie_gif_shortcut_icon_tint)));
    }

    private final juh f() {
        return (juh) this.c.a();
    }

    @Override // defpackage.juv
    public final int a() {
        return this.d;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.e;
    }

    @Override // defpackage.juv
    public final List c() {
        return aqjn.y(afkj.a);
    }

    @Override // defpackage.juv
    public final void d(View view) {
        juh f = f();
        if (f != null) {
            f.a();
        }
    }

    @Override // defpackage.juv
    public final boolean e() {
        if (f() != null) {
            return true;
        }
        return false;
    }
}
