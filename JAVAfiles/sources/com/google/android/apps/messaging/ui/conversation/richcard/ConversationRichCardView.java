package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardContent;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardLayoutInfo;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo;
import defpackage.aack;
import defpackage.aacl;
import defpackage.aaef;
import defpackage.aael;
import defpackage.aafw;
import defpackage.aahj;
import defpackage.adom;
import defpackage.ameb;
import defpackage.armf;
import defpackage.gh;
import defpackage.rry;
import defpackage.vid;
import defpackage.wpp;
import defpackage.xnv;
import defpackage.xzb;
import defpackage.zfh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationRichCardView extends aaef implements aacl<ConversationRichCardView> {
    public rry g;
    public GeneralPurposeRichCard h;
    public int i;
    public boolean j;
    public RichCardMediaAttachmentView k;
    public RichCardContentContainer l;
    public aack m;
    public xnv n;
    public armf o;
    public zfh p;
    public vid q;
    public wpp r;
    private RichCardMediaAttachmentView u;
    private RichCardMediaAttachmentView v;
    private RichCardMediaAttachmentView w;

    public ConversationRichCardView(Context context) {
        super(context, null, 0);
        this.i = 0;
    }

    private static void r(RichCardMediaAttachmentView... richCardMediaAttachmentViewArr) {
        for (RichCardMediaAttachmentView richCardMediaAttachmentView : richCardMediaAttachmentViewArr) {
            richCardMediaAttachmentView.h();
            richCardMediaAttachmentView.setVisibility(8);
        }
    }

    private final void s(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    RichCardMediaAttachmentView richCardMediaAttachmentView = this.w;
                    this.k = richCardMediaAttachmentView;
                    richCardMediaAttachmentView.setVisibility(0);
                    r(this.u, this.v);
                    return;
                }
                RichCardMediaAttachmentView richCardMediaAttachmentView2 = this.v;
                this.k = richCardMediaAttachmentView2;
                richCardMediaAttachmentView2.setVisibility(0);
                r(this.u, this.w);
                return;
            }
            RichCardMediaAttachmentView richCardMediaAttachmentView3 = this.u;
            this.k = richCardMediaAttachmentView3;
            richCardMediaAttachmentView3.setVisibility(0);
            r(this.v, this.w);
            return;
        }
        this.k = null;
        r(this.u, this.w, this.v);
    }

    @Override // defpackage.aacv
    public final void b() {
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.k;
        if (richCardMediaAttachmentView != null) {
            richCardMediaAttachmentView.h();
        }
    }

    @Override // defpackage.aacl
    public final rry c() {
        return this.g;
    }

    @Override // defpackage.aacl
    public final void d(Object obj) {
        throw new UnsupportedOperationException("ConversationRichCardView does not support bindPayload().");
    }

    @Override // defpackage.aacl
    public final void e(aack aackVar) {
        this.m = aackVar;
    }

    public final Uri f() {
        MessagePartCoreData x = this.g.x(this.i);
        if (x != null) {
            String U = x.U();
            String[] strArr = gh.a;
            if (GeneralPurposeRichCardMediaInfo.supportedRichCardMediaTypes.contains(U)) {
                return x.t();
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.aacl
    public final void g(rry rryVar, boolean z, boolean z2) {
        GeneralPurposeRichCard generalPurposeRichCard;
        MessageIdType u = this.g.u();
        this.g = rryVar;
        if (rryVar.u().equals(u)) {
            k(rryVar);
            return;
        }
        long epochMilli = this.n.f().toEpochMilli();
        List Y = rryVar.Y();
        if (adom.o(Y)) {
            generalPurposeRichCard = null;
        } else {
            generalPurposeRichCard = (GeneralPurposeRichCard) Y.get(0);
        }
        this.h = generalPurposeRichCard;
        xzb.c("BugleRbmRichCard", "Time to parse/retrieve Rich Card model object from Json: " + (this.n.f().toEpochMilli() - epochMilli));
        l();
    }

    public final Uri h() {
        MessagePartCoreData w = this.g.w(ameb.RICH_CARD_THUMBNAIL, this.i);
        if (w != null && gh.m(w.U())) {
            return w.t();
        }
        return null;
    }

    public final MessagePartCoreData i() {
        return this.g.x(this.i);
    }

    public final String j() {
        GeneralPurposeRichCard generalPurposeRichCard = this.h;
        generalPurposeRichCard.getClass();
        GeneralPurposeRichCardContent generalPurposeRichCardContent = generalPurposeRichCard.content;
        generalPurposeRichCardContent.getClass();
        GeneralPurposeRichCardMediaInfo generalPurposeRichCardMediaInfo = generalPurposeRichCardContent.media;
        if (generalPurposeRichCardMediaInfo == null) {
            return null;
        }
        return generalPurposeRichCardMediaInfo.mediaUrl;
    }

    public final void k(rry rryVar) {
        aack aackVar;
        RichCardContentContainer richCardContentContainer;
        LinearLayout linearLayout;
        aael aaelVar;
        this.g = rryVar;
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.k;
        if (richCardMediaAttachmentView != null) {
            richCardMediaAttachmentView.m = this;
            richCardMediaAttachmentView.l(false);
        }
        RichCardContentContainer richCardContentContainer2 = this.l;
        if (richCardContentContainer2 != null && richCardContentContainer2.getVisibility() == 0 && (aackVar = this.m) != null && (linearLayout = (richCardContentContainer = this.l).c) != null && linearLayout.getVisibility() == 0 && (aaelVar = richCardContentContainer.e) != null) {
            aafw f = RichCardContentContainer.f(aackVar);
            Iterator it = new ArrayList(aaelVar.o).iterator();
            while (it.hasNext()) {
                aaelVar.e((aahj) it.next(), f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView.l():void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = this.q.a();
        this.u = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_top_media);
        this.v = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_left_media);
        this.w = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_right_media);
        this.l = (RichCardContentContainer) findViewById(R.id.rich_card_content_container);
        this.u.m = this;
        this.v.m = this;
        this.w.m = this;
        this.l.h = this;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        if (this.j) {
            GeneralPurposeRichCard generalPurposeRichCard = this.h;
            generalPurposeRichCard.getClass();
            String str = generalPurposeRichCard.layout.cardWidth;
            if (str.hashCode() == -1747407794 && str.equals(GeneralPurposeRichCardLayoutInfo.WIDTH_SMALL)) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.rich_card_carousel_small_width);
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.rich_card_carousel_medium_width);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
            int i3 = generalPurposeRichCard.layout.desiredHeight;
            if (i3 == -1) {
                i3 = getResources().getDimensionPixelSize(R.dimen.rich_card_min_height);
            }
            setMinimumHeight(i3);
            i = makeMeasureSpec;
        } else {
            int size = View.MeasureSpec.getSize(i);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_max_width);
            if (dimensionPixelOffset > 0 && dimensionPixelOffset < size) {
                i = View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, View.MeasureSpec.getMode(i));
            }
        }
        super.onMeasure(i, i2);
    }

    public ConversationRichCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }
}
