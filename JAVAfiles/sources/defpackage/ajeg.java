package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajeg implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ajeg(ajek ajekVar, int i) {
        this.b = i;
        this.a = ajekVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [akvv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [alhr, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ajek ajekVar = (ajek) this.a;
                if (ajekVar.d && ajekVar.isShowing()) {
                    ajek ajekVar2 = (ajek) this.a;
                    if (!ajekVar2.f) {
                        TypedArray obtainStyledAttributes = ajekVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        ajekVar2.e = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        ajekVar2.f = true;
                    }
                    if (ajekVar2.e) {
                        ((ajek) this.a).cancel();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ev) this.a).cancel();
                return;
            case 2:
                Object obj = this.a;
                EditText editText = ((ajmq) obj).a;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                ((ajnc) obj).x();
                return;
            case 3:
                ((ajmy) this.a).m();
                return;
            case 4:
                Object obj2 = this.a;
                ajni ajniVar = (ajni) obj2;
                EditText editText2 = ajniVar.a;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                if (ajniVar.k()) {
                    ajniVar.a.setTransformationMethod(null);
                } else {
                    ajniVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    ajniVar.a.setSelection(selectionEnd);
                }
                ((ajnc) obj2).x();
                return;
            case 5:
                int i = GlifLayout.f;
                ((Activity) this.a).onBackPressed();
                return;
            case 6:
                aktp.L(this.a, view);
                return;
            default:
                aktp.L((akvv) this.a.get(), view);
                return;
        }
    }

    public /* synthetic */ ajeg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
