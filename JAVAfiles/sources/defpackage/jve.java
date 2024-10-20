package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jve implements juv {
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final afxb f;
    private final qdq g;

    public jve(armf armfVar, armf armfVar2, qdq qdqVar, armf armfVar3, armf armfVar4, Map map) {
        armfVar.getClass();
        armfVar2.getClass();
        qdqVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.g = qdqVar;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = new afxb(R.drawable.ic_compose_camera_gallery_unselected_v2, new afxa(hwr.ac(R.color.camera_gallery_shortcut_background, map), new agei(R.color.camera_gallery_shortcut_icon_tint)));
    }

    @Override // defpackage.juv
    public final int a() {
        return R.string.camera_gallery_shortcut_title;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.f;
    }

    @Override // defpackage.juv
    public final /* synthetic */ List c() {
        return arnv.a;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        if (((ovh) this.d.b()).a() && ((ovj) this.e.b()).a()) {
            jkg i = this.g.i(amqe.PLUS_BUTTON);
            if (i.c()) {
                ((agcp) this.c.b()).b(i);
                return;
            } else {
                i.b();
                return;
            }
        }
        ((jhj) this.b.b()).b(jhf.c);
    }

    @Override // defpackage.juv
    public final boolean e() {
        return true;
    }
}
