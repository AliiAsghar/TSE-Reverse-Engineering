package com.google.android.apps.messaging.ui.conversation.compose;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.ahnz;
import defpackage.aoij;
import defpackage.egl;
import defpackage.xzb;
import defpackage.zwz;
import defpackage.zxb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PlainTextEditText extends zwz {
    private String[] a;
    private aoij b;

    public PlainTextEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public final void d(aoij aoijVar, String[] strArr) {
        this.b = aoijVar;
        this.a = strArr;
    }

    @Override // defpackage.kn, android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        Editable text = super.getText();
        text.getClass();
        return text;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ahnz.t(this);
    }

    @Override // defpackage.ekf, defpackage.kn, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = this.a;
        if (strArr == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        return egl.b(onCreateInputConnection, editorInfo, new zxb(this.b, 0));
    }

    @Override // defpackage.kn, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            int selectionStart = getSelectionStart();
            try {
                boolean onTextContextMenuItem = super.onTextContextMenuItem(R.id.paste);
                CharSequence text = getText();
                int selectionStart2 = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int i2 = selectionStart2 - 1;
                if (selectionStart2 - selectionStart == 1 && text.charAt(i2) == 65532 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null) {
                    ClipData.Item itemAt = primaryClip.getItemAt(0);
                    StringBuilder sb = new StringBuilder(text);
                    String charSequence = itemAt.getText().toString();
                    sb.replace(selectionStart, selectionStart2, charSequence);
                    text = sb.toString();
                    selectionStart2 = selectionStart + charSequence.length();
                    selectionEnd = selectionStart2;
                }
                setText(text.toString(), TextView.BufferType.EDITABLE);
                int length = text.length();
                setSelection(Math.min(selectionStart2, length), Math.min(selectionEnd, length));
                return onTextContextMenuItem;
            } catch (RuntimeException e) {
                String message = e.getMessage();
                if (message != null && message.startsWith("PARAGRAPH span must start at paragraph boundary")) {
                    xzb.i("Bugle", e, "Known error pasting text");
                    return true;
                }
                throw e;
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        int length = getText().length();
        if (i <= length && i2 <= length && i >= 0 && i2 >= 0) {
            super.setSelection(i, i2);
        }
    }

    @Override // defpackage.kn, android.widget.EditText, android.widget.TextView
    public final /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }
}
