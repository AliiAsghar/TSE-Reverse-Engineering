package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbj {
    public static final xze a = xze.g("Bugle", "DialogUtils");
    public final apwt b;
    public final aaya c;
    public final mbl d;
    public final xbf e;
    public final armf f;
    public final abbu g;
    public final armf h;
    public final aksr i;

    public abbj(armf armfVar, apwt apwtVar, aaya aayaVar, mbl mblVar, xbf xbfVar, armf armfVar2, abbu abbuVar, aksr aksrVar) {
        this.h = armfVar;
        this.b = apwtVar;
        this.c = aayaVar;
        this.d = mblVar;
        this.e = xbfVar;
        this.f = armfVar2;
        this.g = abbuVar;
        this.i = aksrVar;
    }

    public static void a(Activity activity, String str, String str2, boolean z) {
        int i;
        ajgi ajgiVar = new ajgi(activity);
        Resources resources = activity.getResources();
        Object[] objArr = {str, str2};
        if (true != z) {
            i = R.string.message_status_download_failed_sim_has_no_data_popup;
        } else {
            i = R.string.cant_send_mms_sim_has_no_data;
        }
        ajgiVar.n(resources.getString(i, objArr));
        ajgiVar.t(R.string.settings_activity_title, new aajo(activity, 11));
        ajgiVar.create().show();
    }

    public static void b(Activity activity, DialogInterface.OnClickListener onClickListener) {
        ajgi ajgiVar = new ajgi(activity);
        ajgiVar.n(activity.getResources().getString(R.string.unsupported_file_save_alert));
        ajgiVar.t(R.string.save_attachment, onClickListener);
        ajgiVar.o(R.string.unsupported_file_save_cancel, new aala(7));
        ajgiVar.create().show();
    }

    public final void c(Context context, rry rryVar) {
        int i;
        String string;
        int i2;
        tqr z = rryVar.z();
        String R = rryVar.R();
        R.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.informational_alert_dialog_title_layout, (ViewGroup) null);
        inflate.findViewById(R.id.title_image).setVisibility(8);
        String bs = yyb.bs(context);
        TextView textView = (TextView) inflate.findViewById(R.id.title_text);
        tqr tqrVar = tqr.VERIFICATION_NA;
        int ordinal = z.ordinal();
        int i3 = 0;
        if (ordinal != 2) {
            if (ordinal != 3) {
                i = 0;
            } else {
                i = R.string.vsms_dialog_title_verifying;
            }
        } else if (!((Boolean) ytk.c.e()).booleanValue()) {
            i = R.string.vsms_dialog_title_unverified;
        } else {
            i = R.string.vsms_new_dialog_title_unverified;
        }
        textView.setText(i);
        if (!((Boolean) ytk.c.e()).booleanValue()) {
            int ordinal2 = z.ordinal();
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    i2 = 0;
                } else {
                    i2 = R.string.vsms_dialog_message_verifying;
                }
            } else {
                i2 = R.string.vsms_dialog_message_unverified;
            }
            string = context.getString(R.string.vsms_dialog_message_spam, context.getString(i2), bs);
        } else {
            int ordinal3 = z.ordinal();
            if (ordinal3 != 2) {
                if (ordinal3 == 3) {
                    string = context.getString(R.string.vsms_new_dialog_message_verifying, R, bs);
                } else {
                    throw new IllegalArgumentException("Not valid verification status: ".concat(String.valueOf(String.valueOf(z))));
                }
            } else {
                string = context.getString(R.string.vsms_dialog_message_spam, context.getString(R.string.vsms_new_dialog_message_unverified, R), bs);
            }
        }
        SpannableStringBuilder ae = aabr.ae(context, string, bs, new abbh(this, context, i3));
        if (((Boolean) ytk.c.e()).booleanValue()) {
            while (true) {
                int indexOf = string.indexOf(R, i3);
                if (indexOf == -1) {
                    break;
                }
                ae.setSpan(new StyleSpan(1), indexOf, R.length() + indexOf, 17);
                i3 = indexOf + 1;
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.content_text);
        textView2.setText(ae);
        textView2.setContentDescription(ae.toString());
        ahnz.s(textView2);
        ahnz.t(textView2);
        ajgi ajgiVar = new ajgi(context);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(inflate);
        ajgiVar.z(scrollView);
        ajgiVar.t(R.string.rbm_verification_dialog_close_button_text_m2, new aajo(rryVar, 12));
        if (z == tqr.VERIFICATION_UNVERIFIED || !((Boolean) ytk.c.e()).booleanValue()) {
            ajgiVar.o(R.string.spam_banner_positive_button, new aajo(this, 13));
        }
        ajgiVar.create().show();
    }
}
