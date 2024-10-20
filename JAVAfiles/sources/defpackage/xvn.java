package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvn {
    public static final xze a = xze.g("Bugle", "MessageFailureOptionsBottomModalFragment");
    public final MessageIdType b;
    public final String c;
    public final apne d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final xvl h;
    public final rja i;
    public final mbl j;
    public final armf k;
    public final armf l;
    public final nzq m;
    public final armf n;
    public View o;
    public final uac p;
    public final wpp q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final SelfIdentityId u;
    private final Context v;
    private final aksr w;
    private final xyt x;
    private final armf y;
    private final armf z;

    public xvn(apnf apnfVar, Context context, xvl xvlVar, wpp wppVar, rja rjaVar, aksr aksrVar, mbl mblVar, uac uacVar, xyt xytVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, nzq nzqVar, armf armfVar5) {
        this.b = rvc.b(apnfVar.c);
        this.c = apnfVar.d;
        apne b = apne.b(apnfVar.e);
        this.d = b == null ? apne.UNKNOWN : b;
        this.r = apnfVar.j;
        this.e = apnfVar.f;
        this.s = apnfVar.g;
        this.t = apnfVar.h;
        this.u = lga.V(apnfVar.i);
        this.g = apnfVar.l;
        this.v = context;
        this.h = xvlVar;
        this.q = wppVar;
        this.i = rjaVar;
        this.w = aksrVar;
        this.j = mblVar;
        this.p = uacVar;
        this.x = xytVar;
        this.y = armfVar;
        this.z = armfVar2;
        this.k = armfVar3;
        this.f = apnfVar.k;
        this.l = armfVar4;
        this.m = nzqVar;
        this.n = armfVar5;
    }

    public static void f(View view, String str) {
        view.findViewById(R.id.message_send_in_progress_row).setVisibility(0);
        ((TextView) view.findViewById(R.id.message_send_in_progress_text_view)).setText(str);
    }

    private final void n(TextView textView, boolean z) {
        int color = this.v.getColor(R.color.bottom_sheet_icon);
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setTint(color);
                if (!z) {
                    drawable.setAlpha(138);
                } else {
                    drawable.setAlpha(255);
                }
            }
        }
    }

    public final int a() {
        int ordinal = this.d.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return 2;
                }
                return 3;
            }
            return 0;
        }
        return 1;
    }

    public final void b(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.delete_message_option_row);
        textView.setVisibility(0);
        textView.setText(str);
        textView.setOnClickListener(new akwb(this.w, "messageFailureOptionsBottomModalFragment:Delete message click", new uai(this, 5), 1));
        n(textView, true);
    }

    public final void c(View view) {
        g(view);
        d(view, view.getResources().getString(R.string.fail_to_send_fallback_description));
        b(view, view.getResources().getString(R.string.fail_to_send_delete_description));
    }

    public final void d(View view, String str) {
        int e;
        if (k() && this.t && !this.s) {
            xyo a2 = a.a();
            a2.H("Enable fallback option in bottom sheet");
            a2.q();
            View findViewById = view.findViewById(R.id.fallback_message_option_row);
            findViewById.setVisibility(0);
            qwm c = ((ryg) this.z.b()).c(this.u);
            if (c == null) {
                e = -1;
            } else {
                e = c.e();
            }
            if (yay.AVAILABLE == ((yaq) this.x.a()).a(0, e)) {
                if (str != null) {
                    ((TextView) view.findViewById(R.id.fallback_message_option_text_view)).setText(str);
                }
                findViewById.setOnClickListener(new akwb(this.w, "messageFailureOptionsBottomModalFragment:Initiate xMS fallback click", new uai(this, 4), 1));
                TextView textView = (TextView) view.findViewById(R.id.fallback_message_icon_text_view);
                Drawable drawable = this.v.getDrawable(R.drawable.ic_compose_send);
                if (drawable != null) {
                    drawable.setTint(this.v.getColor(R.color.bottom_sheet_icon));
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                return;
            }
            Context x = this.h.x();
            findViewById.setEnabled(false);
            findViewById.setOnClickListener(null);
            String string = x.getString(R.string.device_xms_connection_unavailable);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.fallback_message_option_text_view);
            textView2.setEnabled(false);
            textView2.setText(string);
            textView2.setAlpha(0.54f);
            TextView textView3 = (TextView) findViewById.findViewById(R.id.fallback_message_icon_text_view);
            textView3.setEnabled(false);
            textView3.setAlpha(0.54f);
            n(textView3, false);
        }
    }

    public final void e(View view) {
        if (l()) {
            f(view, view.getResources().getString(R.string.device_waiting_for_connection));
        } else {
            j(view);
        }
    }

    public final void g(View view) {
        if (m()) {
            h(view);
        } else {
            e(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.View r8) {
        /*
            r7 = this;
            r0 = 2131429098(0x7f0b06ea, float:1.847986E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setVisibility(r1)
            boolean r2 = r7.e
            r3 = 1
            if (r2 == 0) goto L18
            boolean r2 = r7.r
            if (r2 == 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = r1
        L19:
            armf r4 = r7.l
            java.lang.Object r4 = r4.b()
            trz r4 = (defpackage.trz) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L33
            apne r4 = r7.d
            apne r5 = defpackage.apne.ERROR_GROUP_FTD_OPTIONS
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L33
            r4 = r3
            goto L34
        L33:
            r4 = r1
        L34:
            if (r2 == 0) goto L3a
            if (r4 != 0) goto L3a
            r2 = r3
            goto L3b
        L3a:
            r2 = r1
        L3b:
            if (r2 == 0) goto L49
            uac r5 = r7.p
            r6 = 40
            android.graphics.drawable.Drawable r5 = r5.c(r6)
            r6 = 0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r6, r6, r6)
        L49:
            if (r4 != 0) goto L77
            boolean r4 = r7.e
            if (r4 == 0) goto L54
            boolean r4 = r7.r
            if (r4 != 0) goto L54
            goto L77
        L54:
            uac r4 = r7.p
            android.content.res.Resources r8 = r8.getResources()
            r5 = 2132018700(0x7f14060c, float:1.9675714E38)
            java.lang.String r8 = r8.getString(r5)
            boolean r5 = r7.e
            if (r5 == 0) goto L82
            boolean r5 = defpackage.ttd.f()
            if (r5 == 0) goto L82
            java.lang.Object r8 = r4.a
            android.content.Context r8 = (android.content.Context) r8
            r4 = 2132018401(0x7f1404e1, float:1.9675108E38)
            java.lang.String r8 = r8.getString(r4)
            goto L82
        L77:
            android.content.res.Resources r8 = r8.getResources()
            r4 = 2132021323(0x7f14104b, float:1.9681034E38)
            java.lang.String r8 = r8.getString(r4)
        L82:
            r0.setText(r8)
            aksr r8 = r7.w
            xvm r4 = new xvm
            r4.<init>(r7, r2, r1)
            akwb r1 = new akwb
            java.lang.String r2 = "messageFailureOptionsBottomModalFragment:Resend message click"
            r1.<init>(r8, r2, r4, r3)
            r0.setOnClickListener(r1)
            r7.n(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvn.h(android.view.View):void");
    }

    public final void i(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.resend_xms_message_option_row);
        textView.setText(str);
        textView.setVisibility(0);
        textView.setOnClickListener(new akwb(this.w, "messageFailureOptionsBottomModalFragment:Resend xms message click", new uai(this, 7), 1));
        n(textView, true);
    }

    public final void j(View view) {
        TextView textView = (TextView) view.findViewById(R.id.turn_on_data_setting_row);
        textView.setVisibility(0);
        textView.setOnClickListener(new uai(this, 6));
        n(textView, true);
    }

    public final boolean k() {
        return tvu.d(this.g);
    }

    public final boolean l() {
        return adom.t(this.v);
    }

    public final boolean m() {
        qwm c = ((ryg) this.z.b()).c(this.u);
        if (c != null) {
            return ((vqu) this.y.b()).P(c.e());
        }
        return ((vqu) this.y.b()).O();
    }
}
