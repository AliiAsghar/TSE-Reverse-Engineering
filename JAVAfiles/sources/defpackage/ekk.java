package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekk extends dyl implements Runnable {
    private final Reference a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekk(TextView textView, int i) {
        super(null);
        this.b = i;
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.dyl
    public final void e() {
        Handler handler;
        Handler handler2;
        if (this.b != 0) {
            TextView textView = (TextView) this.a.get();
            if (textView != null && (handler2 = textView.getHandler()) != null) {
                handler2.post(this);
                return;
            }
            return;
        }
        EditText editText = (EditText) this.a.get();
        if (editText != null && (handler = editText.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            TextView textView = (TextView) this.a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence c = ejx.b().c(textView.getText());
                int selectionStart = Selection.getSelectionStart(c);
                int selectionEnd = Selection.getSelectionEnd(c);
                textView.setText(c);
                if (c instanceof Spannable) {
                    d.w((Spannable) c, selectionStart, selectionEnd);
                    return;
                }
                return;
            }
            return;
        }
        EditText editText = (EditText) this.a.get();
        if (editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart2 = Selection.getSelectionStart(editableText);
            int selectionEnd2 = Selection.getSelectionEnd(editableText);
            ejx.b().c(editableText);
            d.w(editableText, selectionStart2, selectionEnd2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekk(EditText editText, int i) {
        super(null);
        this.b = i;
        this.a = new WeakReference(editText);
    }
}
