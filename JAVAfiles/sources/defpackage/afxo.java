package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxo extends no {
    public static final /* synthetic */ artm[] c;
    public final Context d;
    public final arwe e;
    public final afke f;
    public final boolean g;
    public int h;
    public final int k;
    public afxe l;
    private final aiim r;
    public final arsn i = new afxm(0, this);
    public final arsn j = new afxn(0, this);
    private final arml p = armd.a(new afww(this, 13));
    public final arml m = armd.a(new afww(this, 10));
    private final arml q = armd.a(new afww(this, 9));
    public final arml n = armd.a(new afww(this, 11));
    public final arml o = armd.a(new afww(this, 12));

    static {
        arrr arrrVar = new arrr(afxo.class, "cellWidthPx", "getCellWidthPx()I", 0);
        int i = arsc.a;
        c = new artm[]{arrrVar, new arrr(afxo.class, "cellHeightPx", "getCellHeightPx()I", 0)};
    }

    public afxo(Context context, arwe arweVar, aiim aiimVar, afke afkeVar, afxe afxeVar, boolean z) {
        this.d = context;
        this.e = arweVar;
        this.r = aiimVar;
        this.f = afkeVar;
        this.g = z;
        this.k = arrn.s(((aron) afxeVar.a).c, 7);
        this.l = afxeVar;
    }

    public final int F() {
        return ((Number) this.p.a()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(defpackage.afxc r5, android.view.View r6, defpackage.arpe r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.afxl
            if (r0 == 0) goto L13
            r0 = r7
            afxl r0 = (defpackage.afxl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afxl r0 = new afxl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            afxc r5 = r0.e
            defpackage.aqil.P(r7)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r7)
            aiim r7 = r4.r
            java.util.List r2 = r5.c
            r0.e = r5
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.p(r2, r0)
            if (r7 == r1) goto L56
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            arqr r5 = r5.d
            r5.a(r6)
        L53:
            arnb r5 = defpackage.arnb.a
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxo.G(afxc, android.view.View, arpe):java.lang.Object");
    }

    @Override // defpackage.no
    public final int b() {
        return ((aron) this.l.a).c;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shortcut_item, viewGroup, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.shortcut_icon);
        appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
        TextView textView = (TextView) inflate.findViewById(R.id.shortcut_title);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(R.id.shortcut_badge_icon);
        inflate.getClass();
        appCompatImageView.getClass();
        textView.getClass();
        appCompatImageView2.getClass();
        return new afxk(this, inflate, appCompatImageView, textView, appCompatImageView2);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        View.OnClickListener ivqVar;
        afxk afxkVar = (afxk) ooVar;
        afxkVar.getClass();
        afxc afxcVar = (afxc) this.l.a.get(i);
        afxcVar.getClass();
        int i2 = afxcVar.a;
        View view = afxkVar.s;
        view.setContentDescription(view.getResources().getString(i2));
        eek.n(view, new afzz(afob.j));
        List list = afxcVar.c;
        afxo afxoVar = afxkVar.w;
        if (list.isEmpty()) {
            ivqVar = new acah(afxcVar.d, 18);
        } else {
            ivqVar = new ivq(afxoVar, afxcVar, afxkVar, 16, (short[]) null);
        }
        view.setOnClickListener(afxoVar.f.a("ShortcutsAdapter.ViewHolder#onClick", ivqVar));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Number) afxoVar.j.c(c[1])).intValue();
            view.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = afxkVar.t;
            afxb afxbVar = afxcVar.b;
            appCompatImageView.setImageResource(afxbVar.a);
            Context context = appCompatImageView.getContext();
            context.getClass();
            Drawable drawable = appCompatImageView.getDrawable();
            drawable.getClass();
            afxbVar.b.b.b(context, drawable);
            appCompatImageView.setBackgroundResource(R.drawable.shortcut_icon_shape);
            Context context2 = appCompatImageView.getContext();
            context2.getClass();
            Drawable background = appCompatImageView.getBackground();
            background.getClass();
            afxbVar.b.a.b(context2, background);
            afxkVar.v.setVisibility(8);
            afxkVar.u.setText(afxcVar.a);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final int m() {
        return ((Number) this.q.a()).intValue();
    }
}
