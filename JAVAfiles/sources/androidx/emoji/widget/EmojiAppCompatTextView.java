package androidx.emoji.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.efu;
import defpackage.eki;
import defpackage.fvq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiAppCompatTextView extends AppCompatTextView {
    private boolean a;
    private efu b;

    public EmojiAppCompatTextView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (!this.a) {
            this.a = true;
            ((fvq) b().a).j();
        }
    }

    private final efu b() {
        if (this.b == null) {
            this.b = new efu((TextView) this, (byte[]) null);
        }
        return this.b;
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        Object obj = b().a;
        if (z) {
            ((fvq) obj).j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        Object obj = b().a;
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (inputFilterArr[i] instanceof eki) {
                    break;
                } else {
                    i++;
                }
            } else {
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = ((fvq) obj).a;
                inputFilterArr = inputFilterArr2;
                break;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
