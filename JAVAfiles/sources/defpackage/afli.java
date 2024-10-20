package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afli implements afkr {
    public static final afiu a = new afiu(0);
    private static final alvi e = alvi.m("com/google/android/libraries/compose/draft/text/EmojiUsageListener");
    public final anca b;
    public final afmq c;
    public final afjy d;
    private final arwe f;

    public afli(arwe arweVar, anca ancaVar, afmq afmqVar, afjy afjyVar) {
        this.f = arweVar;
        this.b = ancaVar;
        this.c = afmqVar;
        this.d = afjyVar;
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        arrn.J(this.f, null, null, new afju(this, (afnr) obj, (arpe) null, 3), 3);
    }

    @Override // defpackage.afkr
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afnr afnrVar = (afnr) it.next();
            afnrVar.getClass();
            ((alvg) e.e().h("com/google/android/libraries/compose/draft/text/EmojiUsageListener", "addUsage", 48, "EmojiUsageListener.kt")).q("Adding emoji usage");
            arrn.J(this.f, null, null, new afju(afnrVar, this, (arpe) null, 2), 3);
        }
    }

    @Override // defpackage.afkr
    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }
}
