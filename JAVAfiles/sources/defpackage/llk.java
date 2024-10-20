package defpackage;

import android.graphics.Point;
import android.view.Display;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llk implements yjj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public llk(ixd ixdVar, mdg mdgVar, int i) {
        this.c = i;
        this.a = mdgVar;
        this.b = ixdVar;
    }

    @Override // defpackage.yjj
    public final void c() {
        if (this.c != 0) {
            ((mdg) this.a).c(9);
            return;
        }
        mdg mdgVar = ((llj) this.b).b;
        if (mdgVar != null) {
            lgb.F(mdgVar, 9, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    @Override // defpackage.yjj
    public final void d() {
        Point point;
        if (this.c != 0) {
            Optional d = ((rrl) ((ixd) this.b).ca.a()).e.d();
            albo.T(d.isPresent());
            View findViewById = ((ixd) this.b).q().findViewById(R.id.action_call);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationOnScreen(iArr);
                point = new Point(iArr[0] + (findViewById.getWidth() / 2), iArr[1] + (findViewById.getHeight() / 2));
            } else {
                Display defaultDisplay = ((ixd) this.b).q().getWindowManager().getDefaultDisplay();
                point = new Point(defaultDisplay.getWidth() / 2, defaultDisplay.getHeight() / 2);
            }
            ((lzv) ((ixd) this.b).af.b()).M(((ixd) this.b).q(), d.get(), point, (mdg) this.a);
            return;
        }
        lzv lzvVar = (lzv) ((lll) this.a).c.b();
        llj lljVar = (llj) this.b;
        mdg mdgVar = lljVar.b;
        lzvVar.M(((lll) this.a).a, lljVar.a, null, mdgVar);
    }

    @Override // defpackage.yjj
    public final /* synthetic */ boolean e() {
        return true;
    }

    public llk(lll lllVar, llj lljVar, int i) {
        this.c = i;
        this.a = lllVar;
        this.b = lljVar;
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void b() {
    }
}
