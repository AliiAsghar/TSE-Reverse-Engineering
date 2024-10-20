package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabm extends aabo {
    public static final amqj a;
    public final mci b;
    public int c;
    private final mcm d;
    private final xnv e;

    static {
        aozy createBuilder = amqj.a.createBuilder();
        amqh amqhVar = amqh.EMOJI;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
        amqi amqiVar = amqi.EXPANDED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        a = (amqj) createBuilder.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aabm(defpackage.aabp r9, defpackage.aabz r10, defpackage.aacb r11, defpackage.da r12, defpackage.mcm r13, defpackage.mci r14, defpackage.xnv r15, android.content.Context r16) {
        /*
            r8 = this;
            r7 = r8
            defpackage.aabr.u()
            aaal r0 = defpackage.aabr.t(r12)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.aB()
            if (r0 == 0) goto L14
            r0 = 1
            r6 = r0
            goto L15
        L14:
            r6 = r1
        L15:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r13
            r7.d = r0
            r0 = r14
            r7.b = r0
            r0 = r15
            r7.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabm.<init>(aabp, aabz, aacb, da, mcm, mci, xnv, android.content.Context):void");
    }

    @Override // defpackage.aaca
    public final boolean s(boolean z) {
        xnv xnvVar = this.e;
        amqd amqdVar = amqd.BACK_BUTTON;
        amqj amqjVar = a;
        xnvVar.f().toEpochMilli();
        this.d.c(amqjVar, amqdVar);
        this.c = 0;
        aabr.u();
        da daVar = this.p;
        xyl.l(daVar);
        aaal t = aabr.t(daVar);
        if (t != null) {
            bd bdVar = new bd(daVar);
            if (z) {
                bdVar.A(R.animator.emoji_slide_in_up, R.animator.emoji_slide_out_down);
                bdVar.z(R.id.emoji_gallery_container_for_c2o, new aabq());
            } else {
                bdVar.k(t);
                t.d();
            }
            try {
                bdVar.i();
                return true;
            } catch (IllegalStateException e) {
                xzb.i("Bugle", e, "hideEmojiGallery cannot commit fragment");
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.aaca
    public final void v(boolean z) {
        this.e.f().toEpochMilli();
        ahjj ahjjVar = new ahjj(this);
        aabr.u();
        int i = zhh.a;
        xyl.l(this.m);
        da daVar = this.p;
        xyl.l(daVar);
        xyl.l(ahjjVar);
        bd bdVar = new bd(daVar);
        if (z) {
            bdVar.A(R.animator.emoji_slide_in_up, R.animator.emoji_slide_out_down);
        }
        aaal t = aabr.t(daVar);
        if (t == null) {
            t = new aaar();
            bdVar.v(R.id.emoji_gallery_container_for_c2o, t, "emojiGallery");
        } else {
            bdVar.l(t);
        }
        t.o(ahjjVar);
        try {
            bdVar.i();
        } catch (IllegalStateException e) {
            xzb.i("Bugle", e, "showEmojiGallery cannot commit fragment");
        }
    }
}
