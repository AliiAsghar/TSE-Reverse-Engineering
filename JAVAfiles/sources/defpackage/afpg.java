package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpg {
    public final Context a;
    public final cg b;
    public final anen c;
    public final agva d;
    public final afph e;
    public final arqg f;
    public final arqg g;
    public final afnx h;
    public final agwg k;
    public Object l;
    public final afpa m;
    public final aiim o;
    private final arwe p;
    public final agvu n = new agvu(this, 1);
    private final arml q = armd.a(new afoo(this, 8));
    public final arml i = armd.a(new afoo(this, 7));
    public final arml j = armd.a(new afpf(this));

    public afpg(Context context, cg cgVar, arwe arweVar, anen anenVar, agva agvaVar, afph afphVar, aiim aiimVar, arqg arqgVar, arqg arqgVar2, afpa afpaVar, afnx afnxVar) {
        this.a = context;
        this.b = cgVar;
        this.p = arweVar;
        this.c = anenVar;
        this.d = agvaVar;
        this.e = afphVar;
        this.o = aiimVar;
        this.f = arqgVar;
        this.g = arqgVar2;
        this.m = afpaVar;
        this.h = afnxVar;
        armd.a(new afoo(this, 9));
        this.k = new agwg() { // from class: afpd
            @Override // defpackage.agwg
            public final void a(ImageView imageView, View view, boolean z) {
                int i;
                Drawable background;
                afzr afzrVar = ((agdq) afpg.this.g.a()).k;
                if (afzrVar != null) {
                    if (z) {
                        i = afzrVar.b;
                    } else {
                        i = afzrVar.c;
                    }
                    if (imageView != null) {
                        imageView.setColorFilter(i);
                    }
                    if (view != null && (background = view.getBackground()) != null) {
                        background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                    }
                }
            }
        };
        arrn.J(arweVar, null, null, new afbh(this, (arpe) null, 8), 3);
        arrn.J(arweVar, null, null, new afmg(this, (arpe) null, 9), 3);
    }

    public final boolean a() {
        return ((Boolean) this.q.a()).booleanValue();
    }
}
