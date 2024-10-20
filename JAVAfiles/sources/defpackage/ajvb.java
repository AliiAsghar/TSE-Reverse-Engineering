package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvb implements View.OnClickListener {
    public final int a;
    public final CharSequence b;
    public final boolean c = true;
    public int d;

    public ajvb(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajuf.b);
        this.b = obtainStyledAttributes.getString(1);
        int i = obtainStyledAttributes.getInt(2, 0);
        if (i >= 0 && i <= 8) {
            this.a = i;
            this.d = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Not a ButtonType");
    }

    public final PersistableBundle a(String str) {
        String str2;
        PersistableBundle persistableBundle = new PersistableBundle();
        String charSequence = this.b.toString();
        if (charSequence.length() > 50) {
            charSequence = String.format("%s…", charSequence.substring(0, 49));
        }
        persistableBundle.putString(str.concat("_text"), charSequence);
        String concat = str.concat("_type");
        switch (this.a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case 4:
                str2 = "DONE";
                break;
            case 5:
                str2 = "NEXT";
                break;
            case 6:
                str2 = "OPT_IN";
                break;
            case 7:
                str2 = "SKIP";
                break;
            case 8:
                str2 = "STOP";
                break;
            default:
                str2 = VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER;
                break;
        }
        persistableBundle.putString(concat, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), 0);
        return persistableBundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
