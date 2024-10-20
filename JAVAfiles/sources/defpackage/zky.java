package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zky {
    private boolean C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    public final Context a;
    public adiv b;
    public final RcsMultiSimStatusCheckboxView c;
    public final TextView d;
    public final MaterialButton e;
    public String f;
    public int h;
    public final ImageView j;
    public TextView k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final armf u;
    public abac w;
    private final TextView x;
    private final TextView y;
    private adjl z;
    private int A = 8;
    private boolean B = true;
    public Optional g = Optional.empty();
    public int v = 1;
    public boolean i = false;

    public zky(RcsSimStatusView rcsSimStatusView, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13) {
        this.a = rcsSimStatusView.getContext();
        this.q = armfVar;
        this.D = armfVar2;
        this.o = armfVar4;
        this.E = armfVar5;
        this.p = armfVar3;
        this.F = armfVar6;
        this.r = armfVar7;
        this.s = armfVar8;
        this.G = armfVar9;
        this.t = armfVar10;
        this.H = armfVar11;
        this.I = armfVar12;
        this.u = armfVar13;
        this.d = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_title);
        this.x = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_status_text);
        this.y = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_summary);
        this.c = (RcsMultiSimStatusCheckboxView) rcsSimStatusView.findViewById(R.id.rcs_multi_sim_checkbox);
        this.j = (ImageView) rcsSimStatusView.findViewById(R.id.tos_tooltip_info_view);
        this.e = (MaterialButton) rcsSimStatusView.findViewById(R.id.verify_number_button);
        i(this.A);
        h(this.B);
    }

    private final void h(boolean z) {
        boolean z2 = false;
        if (!aczf.H() && z) {
            z2 = true;
        }
        this.e.setEnabled(z2);
    }

    private final void i(int i) {
        if (true == aczf.H()) {
            i = 8;
        }
        this.e.setVisibility(i);
    }

    private final void j(int i, int i2) {
        Context context = this.a;
        String string = context.getString(i2);
        String string2 = context.getString(R.string.rcs_status_label);
        SpannableString spannableString = new SpannableString(String.valueOf(string2).concat(String.valueOf(string)));
        spannableString.setSpan(new ForegroundColorSpan(this.a.getColor(R.color.settings_rcs_status_label)), 0, string2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(this.a.getColor(i)), string2.length(), string2.length() + string.length(), 33);
        this.x.setText(spannableString);
        if (((okr) this.F.b()).a()) {
            this.x.setContentDescription(this.a.getString(R.string.rcs_status_multi_sim_text_context_description, Integer.valueOf(this.h), string));
        }
    }

    private final boolean k() {
        if (!this.g.isEmpty() && ((wgi) this.g.get()).d.size() != 0) {
            wgg wggVar = ((wgh) alzz.aO(((wgi) this.g.get()).d)).d;
            if (wggVar == null) {
                wggVar = wgg.a;
            }
            wgf b = wgf.b(wggVar.e);
            if (b == null) {
                b = wgf.UNRECOGNIZED;
            }
            if (b == wgf.OTP_FORCE_VERIFICATION_THROTTLED && (wggVar.b & 2) != 0) {
                apct b2 = apds.b(((xnv) this.D.b()).f().toEpochMilli());
                apct apctVar = wggVar.d;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                if (apdr.a(b2, apctVar) < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final SpannableStringBuilder a(int i, int i2) {
        Context context = this.a;
        String string = context.getString(i);
        String string2 = context.getString(R.string.carrier_tos_pref_link_text);
        return aabr.ae(this.a, this.a.getString(R.string.carrier_tos_pref_template_v2, string, string2), string2, new iix(this, context.getString(i2), 17));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RcsMultiSimStatusCheckboxView b() {
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = this.c;
        if (rcsMultiSimStatusCheckboxView != null) {
            return rcsMultiSimStatusCheckboxView;
        }
        return null;
    }

    final void c(String str) {
        if (this.y != null) {
            d(0);
            this.y.setText(str);
        }
    }

    final void d(int i) {
        this.y.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, adjl adjlVar) {
        this.C = ((vqu) this.E.b()).P(i);
        this.z = adjlVar;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zky.f():void");
    }
}
