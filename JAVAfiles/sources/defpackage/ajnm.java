package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajnm extends ecl {
    private final TextInputLayout a;

    public ajnm(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.ecl
    public void c(View view, efx efxVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        String str;
        TextView textView;
        super.c(view, efxVar);
        EditText editText = this.a.c;
        CharSequence charSequence3 = null;
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        TextInputLayout textInputLayout = this.a;
        CharSequence d = textInputLayout.d();
        CharSequence c = textInputLayout.c();
        if (textInputLayout.j) {
            charSequence2 = textInputLayout.i;
        } else {
            charSequence2 = null;
        }
        int i = textInputLayout.f;
        if (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) {
            charSequence3 = textView.getContentDescription();
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(d);
        boolean z2 = this.a.o;
        boolean isEmpty3 = TextUtils.isEmpty(c);
        boolean z3 = !isEmpty3;
        if (isEmpty3 && TextUtils.isEmpty(charSequence3)) {
            z = false;
        } else {
            z = true;
        }
        if (!isEmpty2) {
            str = d.toString();
        } else {
            str = "";
        }
        ajnk ajnkVar = this.a.a;
        if (ajnkVar.a.getVisibility() == 0) {
            efxVar.C(ajnkVar.a);
            efxVar.R(ajnkVar.a);
        } else {
            efxVar.R(ajnkVar.c);
        }
        if (!isEmpty) {
            efxVar.Q(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            efxVar.Q(str);
            if (!z2 && charSequence2 != null) {
                efxVar.Q(str + ", " + charSequence2.toString());
            }
        } else if (charSequence2 != null) {
            efxVar.Q(charSequence2);
        }
        if (!TextUtils.isEmpty(str)) {
            efxVar.B(str);
            efxVar.N(isEmpty);
        }
        if (charSequence == null || charSequence.length() != i) {
            i = -1;
        }
        efxVar.E(i);
        if (z) {
            if (true != z3) {
                c = charSequence3;
            }
            efxVar.x(c);
        }
        View view2 = this.a.d.o;
        if (view2 != null) {
            efxVar.C(view2);
        }
        this.a.b.c().v(efxVar);
    }

    @Override // defpackage.ecl
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.r;
        this.a.b.c().w(accessibilityEvent);
    }
}
