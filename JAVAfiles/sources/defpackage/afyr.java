package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyr extends arsm {
    final /* synthetic */ afys a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyr(afys afysVar) {
        super(null);
        this.a = afysVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afll afllVar = (afll) obj2;
        if (afllVar != null) {
            ((alvg) afys.b.g().h("com/google/android/libraries/compose/ui/composable/text/DelegatingEmojiDraftTextController$special$$inlined$distinctObservable$1", "afterChange", 22, "DelegatingEmojiDraftTextController.kt")).B("Delegating text control to %s (%d pending operations)", afllVar, this.a.c.c);
            Iterator a = arrn.d(new afww(this.a, 20)).a();
            while (a.hasNext()) {
                ((arqr) a.next()).a(afllVar);
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
