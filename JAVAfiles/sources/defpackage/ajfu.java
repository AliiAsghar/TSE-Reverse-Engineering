package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfu extends ehi {
    final /* synthetic */ Chip e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfu(Chip chip, Chip chip2) {
        super(chip2);
        this.e = chip;
    }

    @Override // defpackage.ehi
    protected final void k(List list) {
        list.add(0);
        this.e.i();
    }

    @Override // defpackage.ehi
    protected final void m(efx efxVar) {
        efxVar.o(this.e.g());
        efxVar.r(this.e.isClickable());
        efxVar.q(this.e.getAccessibilityClassName());
        efxVar.Q(this.e.getText());
    }

    @Override // defpackage.ehi
    protected final void n(int i, efx efxVar) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.e;
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (true != TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            efxVar.u(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            Chip chip2 = this.e;
            RectF c = chip2.c();
            chip2.e.set((int) c.left, (int) c.top, (int) c.right, (int) c.bottom);
            efxVar.m(chip2.e);
            efxVar.h(efw.a);
            efxVar.w(this.e.isEnabled());
            return;
        }
        efxVar.u("");
        efxVar.m(Chip.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ehi
    public final void o(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.e;
            chip.d = z;
            chip.refreshDrawableState();
        }
    }

    @Override // defpackage.ehi
    public final boolean r(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.e.performClick();
            }
            if (i == 1) {
                this.e.j();
            }
        }
        return false;
    }
}
