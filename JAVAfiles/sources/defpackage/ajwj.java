package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwj extends no {
    public View c;
    private final no d;
    private final nq e;

    public ajwj(no noVar) {
        ajwi ajwiVar = new ajwi(this);
        this.e = ajwiVar;
        this.d = noVar;
        noVar.D(ajwiVar);
        A(noVar.a);
    }

    @Override // defpackage.no
    public final int b() {
        int b = this.d.b();
        if (this.c != null) {
            return b + 1;
        }
        return b;
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (this.c != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.d.c(i);
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new ajwk(frameLayout);
        }
        return this.d.e(viewGroup, i);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        View view = this.c;
        if (view != null) {
            i--;
        }
        if (ooVar instanceof ajwk) {
            if (view != null) {
                if (view.getParent() != null) {
                    ((ViewGroup) this.c.getParent()).removeView(this.c);
                }
                ((FrameLayout) ooVar.a).addView(this.c);
                return;
            }
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
        this.d.g(ooVar, i);
    }

    @Override // defpackage.no
    public final long gI(int i) {
        if (this.c != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.d.gI(i);
    }
}
