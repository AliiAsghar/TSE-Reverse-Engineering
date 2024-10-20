package defpackage;

import android.view.inputmethod.ExtractedText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dns {
    public static final ExtractedText a(doj dojVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = dojVar.a();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = dojVar.a().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = djc.d(dojVar.b);
        extractedText.selectionEnd = djc.c(dojVar.b);
        extractedText.flags = !arsd.N(dojVar.a(), '\n') ? 1 : 0;
        return extractedText;
    }
}
