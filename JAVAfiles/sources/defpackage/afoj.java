package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afoj extends afom {
    public static final /* synthetic */ int y = 0;
    public final View s;
    public final SingleEmojiViewWithVariantIndicator t;
    public arxm u;
    public afnb v;
    public aflw w;
    final /* synthetic */ afoq x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoj(afoq afoqVar, View view) {
        super(view);
        this.x = afoqVar;
        this.s = view;
        View b = eek.b(view, R.id.emoji);
        b.getClass();
        this.t = (SingleEmojiViewWithVariantIndicator) b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r8.t.getHeight() != r8.x.h) goto L9;
     */
    @Override // defpackage.afom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(defpackage.afot r9) {
        /*
            r8 = this;
            r9.getClass()
            arxm r0 = r8.u
            if (r0 == 0) goto La
            defpackage.arsd.am(r0)
        La:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r8.t
            afoq r1 = r8.x
            int r0 = r0.getWidth()
            int r1 = r1.h
            if (r0 != r1) goto L22
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r8.t
            afoq r1 = r8.x
            int r0 = r0.getHeight()
            int r1 = r1.h
            if (r0 == r1) goto L39
        L22:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r8.t
            afoq r1 = r8.x
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r1 = r1.h
            r2.<init>(r1, r1)
            r0.setLayoutParams(r2)
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r0 = r8.t
            afoq r1 = r8.x
            int r1 = r1.i
            r0.setPadding(r1, r1, r1, r1)
        L39:
            r5 = r9
            afor r5 = (defpackage.afor) r5
            afnb r9 = r5.a
            r8.v = r9
            r0 = 0
            if (r9 != 0) goto L49
            java.lang.String r9 = "emojiSet"
            defpackage.arro.b(r9)
            r9 = r0
        L49:
            afoq r1 = r8.x
            aflp r2 = r9.a()
            afnx r1 = r1.m()
            aflw r1 = r1.c
            boolean r1 = defpackage.d.F(r2, r0)
            if (r1 != 0) goto Lac
            java.util.Set r9 = r9.i()
            afoq r1 = r8.x
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L6c
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L6c
            goto L8d
        L6c:
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r9.next()
            aflp r2 = (defpackage.aflp) r2
            java.lang.CharSequence r2 = r2.a()
            afnx r3 = r1.m()
            aflw r3 = r3.c
            boolean r2 = defpackage.d.F(r2, r0)
            if (r2 == 0) goto L70
            goto Lac
        L8d:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r9 = r8.t
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.Context r2 = r9.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r3 = 16843868(0x101045c, float:2.3696686E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto Lb4
            int r1 = r1.resourceId
            r9.setBackgroundResource(r1)
            goto Lb4
        Lac:
            afoq r9 = r8.x
            afnx r9 = r9.m()
            java.lang.Integer r9 = r9.d
        Lb4:
            com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator r9 = r8.t
            afpt r1 = com.google.android.libraries.compose.emoji.ui.views.SingleEmojiViewWithVariantIndicator.j
            r9.f(r1)
            afoq r9 = r8.x
            wfj r1 = new wfj
            r6 = 0
            r7 = 7
            r2 = r1
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            arwe r9 = r9.d
            r2 = 3
            arxm r9 = defpackage.arrn.J(r9, r0, r0, r1, r2)
            r8.u = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afoj.D(afot):void");
    }

    public final void E() {
        aflw aflwVar = this.w;
        afnb afnbVar = null;
        if (aflwVar == null) {
            arro.b("emoji");
            aflwVar = null;
        }
        afnb afnbVar2 = this.v;
        if (afnbVar2 == null) {
            arro.b("emojiSet");
        } else {
            afnbVar = afnbVar2;
        }
        this.t.f(new afpt(aflwVar, afnbVar));
        SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator = this.t;
        afoq afoqVar = this.x;
        singleEmojiViewWithVariantIndicator.setOnClickListener(afoqVar.c.a("EmojiAdapter.EmojiViewHolder#onClick", new abbh(afoqVar, this, 6)));
        SingleEmojiViewWithVariantIndicator singleEmojiViewWithVariantIndicator2 = this.t;
        afoq afoqVar2 = this.x;
        singleEmojiViewWithVariantIndicator2.setOnLongClickListener(afoqVar2.c.b("EmojiAdapter.EmojiViewHolder#onLongClick", new afoi(afoqVar2, this, 0)));
    }
}
