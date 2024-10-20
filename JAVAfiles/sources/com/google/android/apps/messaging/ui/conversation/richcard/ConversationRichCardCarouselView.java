package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import defpackage.aack;
import defpackage.aacl;
import defpackage.aaee;
import defpackage.aaek;
import defpackage.akhx;
import defpackage.no;
import defpackage.nw;
import defpackage.rry;
import defpackage.tn;
import defpackage.to;
import defpackage.vid;
import defpackage.yai;
import defpackage.zfh;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationRichCardCarouselView extends aaee implements aacl<ConversationRichCardCarouselView> {
    public rry ab;
    public List ac;
    public zfh ad;
    public vid ae;
    private aack af;
    private boolean ag;

    public ConversationRichCardCarouselView(Context context) {
        super(context);
    }

    private final aaek aP() {
        no noVar = this.l;
        if (noVar == null) {
            noVar = new aaek(this, this.af);
            ag(noVar);
        }
        return (aaek) noVar;
    }

    @Override // defpackage.aacv
    public final void b() {
        no noVar = this.l;
        if (noVar != null) {
            tn tnVar = new tn((to) ((aaek) noVar).c);
            while (tnVar.hasNext()) {
                ((ConversationRichCardView) ((akhx) tnVar.next()).s).b();
            }
        }
    }

    @Override // defpackage.aacl
    public final rry c() {
        return this.ab;
    }

    @Override // defpackage.aacl
    public final void d(Object obj) {
        throw new UnsupportedOperationException("ConversationRichCardCarouselView does not support bindPayload().");
    }

    @Override // defpackage.aacl
    public final void e(aack aackVar) {
        this.af = aackVar;
    }

    @Override // defpackage.aacl
    public final void g(rry rryVar, boolean z, boolean z2) {
        aP();
        if (this.ab.u().equals(rryVar.u())) {
            this.ab = rryVar;
            tn tnVar = new tn((to) aP().c);
            while (tnVar.hasNext()) {
                ((ConversationRichCardView) ((akhx) tnVar.next()).s).k(rryVar);
            }
            return;
        }
        this.ab = rryVar;
        this.ag = true;
        this.ac = rryVar.Y();
        ae(0);
        no noVar = this.l;
        noVar.getClass();
        noVar.p();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        aj(new LinearLayoutManager(0));
        this.ab = this.ae.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_margin);
        int i3 = dimensionPixelOffset + dimensionPixelOffset;
        if (this.ab.m > 0) {
            if (this.ag) {
                Iterator it = this.ac.iterator();
                while (it.hasNext()) {
                    ((GeneralPurposeRichCard) it.next()).layout.desiredHeight = this.ab.m - i3;
                }
                this.ag = false;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.ab.m, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() - i3;
        Iterator it2 = this.ac.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i4 = Math.max(i4, this.ad.h(((GeneralPurposeRichCard) it2.next()).content.media));
        }
        int max = Math.max(measuredHeight, i4);
        int i5 = i3 + max;
        this.ab.m = i5;
        Iterator it3 = this.ac.iterator();
        while (it3.hasNext()) {
            ((GeneralPurposeRichCard) it3.next()).layout.desiredHeight = max;
        }
        this.ag = false;
        if (max > measuredHeight) {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
        nw nwVar = this.m;
        nwVar.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nwVar;
        int L = linearLayoutManager.L();
        int N = linearLayoutManager.N();
        if (L != -1 && N != -1) {
            while (L <= N) {
                View U = linearLayoutManager.U(L);
                if (U.getMeasuredHeight() != max) {
                    U.measure(yai.d(U), yai.b(U));
                }
                L++;
            }
        }
    }

    public ConversationRichCardCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
