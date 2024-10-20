package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alhk extends alfe {
    final /* synthetic */ ahlp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alhk(anna annaVar, CharSequence charSequence, ahlp ahlpVar) {
        super(annaVar, charSequence);
        this.g = ahlpVar;
    }

    @Override // defpackage.alfe
    public final int a(int i) {
        return ((Matcher) this.g.a).end();
    }

    @Override // defpackage.alfe
    public final int b(int i) {
        if (((Matcher) this.g.a).find(i)) {
            return ((Matcher) this.g.a).start();
        }
        return -1;
    }
}
