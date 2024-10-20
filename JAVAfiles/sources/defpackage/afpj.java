package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpj extends no {
    public Integer c;
    final /* synthetic */ afpn d;
    final /* synthetic */ afps e;
    final /* synthetic */ arqv f;
    final /* synthetic */ arqr g;
    private int h;
    private int i;

    public afpj(afps afpsVar, arqv arqvVar, arqr arqrVar) {
        this.e = afpsVar;
        this.f = arqvVar;
        this.g = arqrVar;
        this.d = afpsVar;
        this.h = afpsVar.b;
        this.i = afpsVar.a();
    }

    private final int G() {
        return arrn.s(((afps) this.d).g.b, b());
    }

    public final aflw F(int i) {
        afnb b = this.e.b();
        if (b != null) {
            return (aflw) this.f.a(Integer.valueOf(i), b);
        }
        throw new IllegalStateException("emojiSet is null. Cannot retrieve emoji");
    }

    @Override // defpackage.no
    public final int b() {
        afnb b = this.e.b();
        if (b != null) {
            return ((Number) this.g.a(b)).intValue();
        }
        return 0;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = this.d.e.inflate(R.layout.emoji_item, viewGroup, false);
        inflate.getClass();
        return new ajbx(inflate, (byte[]) null);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        CharSequence charSequence;
        ajbx ajbxVar = (ajbx) ooVar;
        ajbxVar.getClass();
        aflw F = F(i);
        byte[] bArr = null;
        if (F != null) {
            charSequence = F.a();
        } else {
            charSequence = null;
        }
        afpn afpnVar = this.d;
        afpnVar.e();
        Object obj = ajbxVar.t;
        if (d.F(charSequence, null)) {
            afpnVar.e();
            this.c = Integer.valueOf(i);
        } else {
            TypedValue typedValue = new TypedValue();
            View view = (View) obj;
            if (view.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true)) {
                view.setBackgroundResource(typedValue.resourceId);
            }
        }
        SingleEmojiView singleEmojiView = (SingleEmojiView) obj;
        ViewGroup.LayoutParams layoutParams = singleEmojiView.getLayoutParams();
        int i2 = this.h;
        layoutParams.width = i2;
        layoutParams.height = i2;
        int i3 = this.i;
        singleEmojiView.setPadding(i3, i3, i3, i3);
        if (F != null) {
            ((afpx) obj).f(F);
        }
        singleEmojiView.setOnClickListener(new abbh(F, afpnVar, 7, bArr));
    }

    public final void m() {
        Context context = this.d.getContext();
        context.getClass();
        int i = afzv.c(context).x;
        int a = this.d.a();
        int i2 = i - (a + a);
        int r = arrn.r(G(), 1);
        afpn afpnVar = this.d;
        float q = arrn.q(i2 / (r * (afpnVar.b + afpnVar.a())), 0.5f, 2.0f);
        int intValue = ((Number) this.d.f.c(afpn.a[2])).intValue() - this.d.a();
        float ceil = (float) Math.ceil(b() / G());
        afpn afpnVar2 = this.d;
        float min = Math.min(q, arrn.q(intValue / (ceil * (afpnVar2.b + afpnVar2.a())), 0.5f, 2.0f));
        afpn afpnVar3 = this.d;
        this.h = (int) (afpnVar3.b * min);
        this.i = (int) (afpnVar3.a() * min);
        p();
    }
}
