package defpackage;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgr extends arsm {
    final /* synthetic */ afgs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afgr(afgs afgsVar) {
        super(null);
        this.a = afgsVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int i;
        int i2;
        View view = this.a.a;
        Size size = (Size) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (size != null) {
                i = size.getWidth();
            } else {
                i = -1;
            }
            layoutParams.width = i;
            if (size != null) {
                i2 = size.getHeight();
            } else {
                i2 = -2;
            }
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
