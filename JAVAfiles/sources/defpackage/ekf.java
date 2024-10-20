package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ekf extends kn {
    private boolean a;
    private fvq b;

    public ekf(Context context) {
        super(context);
        b(null, 0);
    }

    private final void b(AttributeSet attributeSet, int i) {
        if (!this.a) {
            this.a = true;
            int i2 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ejt.a, i, 0);
                i2 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            c().l(i2);
            setKeyListener(super.getKeyListener());
        }
    }

    private final fvq c() {
        if (this.b == null) {
            this.b = new fvq((EditText) this, (byte[]) null);
        }
        return this.b;
    }

    @Override // defpackage.kn, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return c().k(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // defpackage.kn, android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            c();
            keyListener = fvq.m(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public ekf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.editTextStyle);
    }

    public ekf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
    }
}
