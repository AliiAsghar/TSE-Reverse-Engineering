package defpackage;

import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kls extends klt {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public int e = 1;

    public kls(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
    }

    public final void a(int i, int i2) {
        boolean z;
        int i3;
        en j = ((DataDonationActivity) this.a.b()).j();
        if (j != null) {
            j.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
            int i4 = 1;
            j.setDisplayHomeAsUpEnabled(true);
            j.setDisplayShowCustomEnabled(true);
            boolean z2 = false;
            j.setDisplayShowTitleEnabled(false);
            j.setCustomView(R.layout.data_donation_toolbar);
            ((TextView) j.getCustomView().findViewById(R.id.data_donation_toolbar_title)).setText(((DataDonationActivity) this.a.b()).getResources().getQuantityString(R.plurals.donation_toolbar_title, i2, Integer.valueOf(i2)));
            Button button = (Button) j.getCustomView().findViewById(R.id.data_donation_toolbar_button);
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && i2 == 0) {
                z2 = true;
            }
            button.setEnabled(z);
            if (z2) {
                i3 = R.string.donation_toolbar_select;
            } else {
                i3 = R.string.donation_toolbar_deselect;
            }
            button.setText(i3);
            if (z) {
                button.setOnClickListener(new xvm(this, z2, i4));
            }
        }
    }
}
