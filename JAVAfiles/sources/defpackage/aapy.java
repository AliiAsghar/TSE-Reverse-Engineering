package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aapy extends zpm {
    public final aapz d;
    private final int e;
    private final int f;

    public aapy(aapz aapzVar, int i, int i2) {
        this.d = aapzVar;
        this.e = i;
        this.f = i2;
    }

    protected abstract oo F(ViewGroup viewGroup, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public void G(View view, int i) {
        view.setAccessibilityDelegate(new aapx(this, i));
    }

    protected boolean H() {
        throw null;
    }

    @Override // defpackage.no
    public int b() {
        return this.d.a() + 1 + (H() ? 1 : 0);
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        if (H() && i == b() - 1) {
            return 9;
        }
        return this.d.b(i - 1);
    }

    @Override // defpackage.no
    public oo e(ViewGroup viewGroup, int i) {
        int i2;
        if (i != 0) {
            if (i != 9) {
                return F(viewGroup, i);
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_overflow_item_m2, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (this.e != -2) {
                i2 = viewGroup.getResources().getDimensionPixelSize(this.e);
            } else {
                i2 = -1;
            }
            layoutParams.height = i2;
            inflate.setOnClickListener(new aafl(this, 15));
            inflate.setContentDescription(viewGroup.getContext().getString(m()));
            inflate.setClipToOutline(true);
            return new oo(inflate);
        }
        return new oo(LayoutInflater.from(viewGroup.getContext()).inflate(this.f, viewGroup, false));
    }

    @Override // defpackage.zpm, defpackage.no
    public void g(oo ooVar, int i) {
        this.c.add(ooVar);
        G(ooVar.a, i);
        int i2 = ooVar.f;
        if (i2 != 0 && i2 != 9) {
            KeyEvent.Callback callback = ooVar.a;
            if (callback instanceof aaqi) {
                this.d.d((aaqi) callback, i - 1);
            }
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        int c = c(i);
        int c2 = c(i);
        if (c2 != 0) {
            if (c2 != 9) {
                return this.d.c(i - 1, c);
            }
            return -3L;
        }
        return -2L;
    }

    protected int m() {
        throw null;
    }
}
