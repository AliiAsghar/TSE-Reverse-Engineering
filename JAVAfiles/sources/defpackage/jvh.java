package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvh implements juv {
    private final Context b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final afxb h;

    public jvh(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, Map map) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = new afxb(R.drawable.gs_pen_spark_vd_theme_24, new afxa(hwr.ac(R.color.rewrite_shortcut_background, map), new agei(R.color.rewrite_shortcut_icon_tint)));
    }

    @Override // defpackage.juv
    public final int a() {
        return R.string.rewrite_shortcut_title;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.h;
    }

    @Override // defpackage.juv
    public final /* synthetic */ List c() {
        return arnv.a;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        if (((aflb) this.f.b()).a().length() == 0) {
            lre lreVar = (lre) this.g.b();
            String string = this.b.getString(R.string.magic_compose_magic_rewrite_without_draft_error_message);
            string.getClass();
            String string2 = this.b.getString(R.string.rewrite_shortcut_no_message_text_confirm);
            string2.getClass();
            lreVar.d(new aepx(string, null, null, null, false, false, new aewr(string2, jlc.q), null, null, 446), true);
            return;
        }
        ((jbt) this.d.b()).a();
        ((jhj) this.c.b()).b(jhf.b);
    }

    @Override // defpackage.juv
    public final boolean e() {
        if (((pli) this.e.b()).a() && ((Boolean) yig.ad.e()).booleanValue()) {
            return true;
        }
        return false;
    }
}
