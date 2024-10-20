package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmv implements dnd {
    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        if (dnhVar.k()) {
            dnhVar.g(dnhVar.c, dnhVar.d);
            return;
        }
        if (dnhVar.b() == -1) {
            int i = dnhVar.a;
            int i2 = dnhVar.b;
            dnhVar.j(i, i);
            dnhVar.g(i, i2);
            return;
        }
        if (dnhVar.b() == 0) {
            return;
        }
        String dnhVar2 = dnhVar.toString();
        int b = dnhVar.b();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(dnhVar2);
        dnhVar.g(characterInstance.preceding(b), dnhVar.b());
    }

    public final boolean equals(Object obj) {
        return obj instanceof dmv;
    }

    public final int hashCode() {
        int i = arsc.a;
        return new arrh(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
