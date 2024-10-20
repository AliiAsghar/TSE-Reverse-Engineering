package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajgo implements ajhq {
    public final ExtendedFloatingActionButton a;
    public ajdh b;
    private final Context c;
    private final ArrayList d = new ArrayList();
    private ajdh e;
    private final aodz f;

    public ajgo(ExtendedFloatingActionButton extendedFloatingActionButton, aodz aodzVar) {
        this.a = extendedFloatingActionButton;
        this.c = extendedFloatingActionButton.getContext();
        this.f = aodzVar;
    }

    @Override // defpackage.ajhq
    public AnimatorSet a() {
        return b(c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AnimatorSet b(ajdh ajdhVar) {
        ArrayList arrayList = new ArrayList();
        if (ajdhVar.f("opacity")) {
            arrayList.add(ajdhVar.a("opacity", this.a, View.ALPHA));
        }
        if (ajdhVar.f("scale")) {
            arrayList.add(ajdhVar.a("scale", this.a, View.SCALE_Y));
            arrayList.add(ajdhVar.a("scale", this.a, View.SCALE_X));
        }
        if (ajdhVar.f("width")) {
            arrayList.add(ajdhVar.a("width", this.a, ExtendedFloatingActionButton.k));
        }
        if (ajdhVar.f("height")) {
            arrayList.add(ajdhVar.a("height", this.a, ExtendedFloatingActionButton.l));
        }
        if (ajdhVar.f("paddingStart")) {
            arrayList.add(ajdhVar.a("paddingStart", this.a, ExtendedFloatingActionButton.m));
        }
        if (ajdhVar.f("paddingEnd")) {
            arrayList.add(ajdhVar.a("paddingEnd", this.a, ExtendedFloatingActionButton.n));
        }
        if (ajdhVar.f("labelOpacity")) {
            arrayList.add(ajdhVar.a("labelOpacity", this.a, new ajgn(this, Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ahnz.q(animatorSet, arrayList);
        return animatorSet;
    }

    public final ajdh c() {
        ajdh ajdhVar = this.b;
        if (ajdhVar != null) {
            return ajdhVar;
        }
        if (this.e == null) {
            this.e = ajdh.c(this.c, h());
        }
        ajdh ajdhVar2 = this.e;
        dye.i(ajdhVar2);
        return ajdhVar2;
    }

    @Override // defpackage.ajhq
    public final List d() {
        return this.d;
    }

    @Override // defpackage.ajhq
    public void e() {
        this.f.D();
    }

    @Override // defpackage.ajhq
    public void f() {
        this.f.D();
    }

    @Override // defpackage.ajhq
    public void g(Animator animator) {
        aodz aodzVar = this.f;
        Object obj = aodzVar.a;
        if (obj != null) {
            ((Animator) obj).cancel();
        }
        aodzVar.a = animator;
    }
}
