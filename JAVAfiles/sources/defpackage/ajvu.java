package defpackage;

import android.content.ContextWrapper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.setupdesign.view.RichTextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajvu extends ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ajvt ajvtVar;
        if (view instanceof RichTextView) {
        }
        Object context = view.getContext();
        while (true) {
            if (context instanceof ajvt) {
                ajvtVar = (ajvt) context;
                break;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                ajvtVar = null;
                break;
            }
        }
        if (ajvtVar != null) {
            ajvtVar.a();
            view.cancelPendingInputEvents();
        } else {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
