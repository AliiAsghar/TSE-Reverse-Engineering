package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ilr implements akgh<Optional<ime>> {
    final /* synthetic */ ilw a;

    public ilr(ilw ilwVar) {
        this.a = ilwVar;
    }

    private final void d(ime imeVar, rre rreVar) {
        cg cgVar = this.a.k;
        String b = rreVar.b();
        Context x = cgVar.x();
        x.getClass();
        this.a.G.L(b, imeVar.a, imeVar.b, x);
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        ((alwl) ((alwl) ((alwl) ilw.a.i()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$6", "onError", (char) 1123, "DraftEditorFragmentPeer.java")).q("Failed to read draft from storage.");
        ilw ilwVar = this.a;
        ilwVar.y.E().s().b();
        ilwVar.G.ai();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r4 != 3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    @Override // defpackage.akgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(java.lang.Object r8) {
        /*
            r7 = this;
            ilw r0 = r7.a
            cg r1 = r0.k
            j$.util.Optional r8 = (j$.util.Optional) r8
            hwo r2 = r0.aa
            ajwt r0 = r0.b
            cj r1 = r1.fe()
            r2.e(r0, r1)
            ilw r0 = r7.a
            boolean r1 = r0.D
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1f
            boolean r1 = r0.E
            if (r1 != 0) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r2
        L20:
            r0.F = r3
            boolean r0 = r8.isPresent()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r8.get()
            ime r0 = (defpackage.ime) r0
            int r4 = r0.d
            r5 = 0
            if (r4 == 0) goto L94
            int r4 = r4 + (-1)
            if (r4 == 0) goto L52
            if (r4 == r3) goto L40
            r6 = 2
            if (r4 == r6) goto L52
            r1 = 3
            if (r4 == r1) goto L40
            goto L63
        L40:
            ilw r1 = r7.a
            r1.E = r3
            com.google.android.apps.messaging.ui.conversation.ComposeMessageView r1 = r1.y
            zrb r1 = r1.E()
            rre r1 = r1.s()
            r7.d(r0, r1)
            goto L63
        L52:
            if (r1 == 0) goto L63
            ilw r1 = r7.a
            com.google.android.apps.messaging.ui.conversation.ComposeMessageView r1 = r1.y
            zrb r1 = r1.E()
            rre r1 = r1.s()
            r7.d(r0, r1)
        L63:
            com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter r1 = r0.c
            if (r1 == 0) goto L77
            ilw r1 = r7.a
            com.google.android.apps.messaging.ui.conversation.ComposeMessageView r1 = r1.y
            zrb r1 = r1.E()
            com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter r0 = r0.c
            r0.getClass()
            r1.ab()
        L77:
            uuf r0 = defpackage.ipe.g
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9e
            ilw r0 = r7.a
            ilb r0 = r0.K
            ibo r1 = new ibo
            r3 = 14
            r1.<init>(r8, r3)
            r0.R(r1, r5)
            goto L9e
        L94:
            throw r5
        L95:
            if (r1 == 0) goto L9e
            ilw r8 = r7.a
            rsr r8 = r8.G
            r8.F()
        L9e:
            ilw r8 = r7.a
            r8.F = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilr.c(java.lang.Object):void");
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
