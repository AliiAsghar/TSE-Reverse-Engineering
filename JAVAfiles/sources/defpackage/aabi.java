package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabi extends aabw {
    public xbi ag;
    public xnv ah;
    public ksm ai;
    public armf aj;

    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        final int i;
        boolean z;
        Bundle bundle2 = this.m;
        xyl.l(bundle2);
        if (bundle2 != null) {
            i = bundle2.getInt("subId", -9999);
        } else {
            i = -9999;
        }
        if (i == -9999) {
            z = true;
        } else {
            z = false;
        }
        xyl.f(z);
        cj fe = fe();
        View inflate = LayoutInflater.from(fe).inflate(R.layout.confirm_sms_7bit_encoding_dialog_view, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.confirm_text);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) S(R.string.confirm_sms_7bit_encoding_dialog_text));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) yyb.bs(x()));
        spannableStringBuilder.setSpan(new aabg(this), length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        ahnz.s(textView);
        ahnz.t(textView);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.remember_check);
        ajgi ajgiVar = new ajgi(fe);
        ajgiVar.x(R.string.confirm_sms_7bit_encoding_dialog_title);
        ajgiVar.z(inflate);
        ajgiVar.o(android.R.string.cancel, new ivs(this, 19));
        ajgiVar.t(R.string.confirm_sms_7bit_encoding_dialog_positive, new aabt((aksr) this.aj.b(), "ConfirmSms7bitEncodingDialog#onCreateDialog", new DialogInterface.OnClickListener() { // from class: aabf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                aabh aabhVar;
                aabi aabiVar = aabi.this;
                if (checkBox.isChecked()) {
                    int i3 = i;
                    xbi xbiVar = aabiVar.ag;
                    xbiVar.f.x(i3).h(xbiVar.c.getResources().getString(R.string.sms_7bit_confirmed_pref_key), true);
                }
                aabiVar.d();
                long epochMilli = aabiVar.ah.f().toEpochMilli();
                long a = aabiVar.ah.a();
                Object[] objArr = {aabiVar.fd(), aabiVar.fe()};
                for (int i4 = 0; i4 < 2; i4++) {
                    Object obj = objArr[i4];
                    if (obj instanceof aabh) {
                        aabhVar = (aabh) obj;
                    } else {
                        if (obj instanceof akkh) {
                            akkh akkhVar = (akkh) obj;
                            if (akkhVar.E() instanceof aabh) {
                                aabhVar = (aabh) akkhVar.E();
                            }
                        }
                    }
                    aabhVar.au(epochMilli, a);
                    return;
                }
                throw new RuntimeException("Host activity or fragment does not implement ConfirmSms7bitEncodingDialogHost");
            }
        }, 8));
        return ajgiVar.create();
    }
}
