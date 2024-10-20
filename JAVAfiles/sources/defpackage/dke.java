package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dke extends dkc {
    private final CharSequence a;
    private final BreakIterator b;

    public dke(CharSequence charSequence) {
        this.a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.dkc
    public final int a(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.dkc
    public final int d(int i) {
        return this.b.preceding(i);
    }
}
