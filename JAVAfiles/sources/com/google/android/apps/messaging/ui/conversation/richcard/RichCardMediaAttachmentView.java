package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.aaeh;
import defpackage.aaen;
import defpackage.aaeo;
import defpackage.aaep;
import defpackage.akms;
import defpackage.aktp;
import defpackage.armf;
import defpackage.huz;
import defpackage.hxk;
import defpackage.uja;
import defpackage.uji;
import defpackage.xyl;
import defpackage.xyo;
import defpackage.xze;
import defpackage.xzg;
import defpackage.ydk;
import defpackage.zqq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RichCardMediaAttachmentView extends aaeh implements uji {
    public static final xze a = xze.g("BugleRbmRichCard", "RichCardMediaAttachmentView");
    public ImageView b;
    public RichCardMediaDownloadOverlayView c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public int h;
    protected boolean i;
    public Uri j;
    public int k;
    public int l;
    public ConversationRichCardView m;
    private int n;
    private RichCardVideoOverlayView o;
    private ImageView p;
    private int q;
    private akms r;

    public RichCardMediaAttachmentView(Context context) {
        super(context);
        this.q = 3622735;
        this.k = 1;
        this.l = 1;
        this.h = -1;
        this.i = true;
        o();
    }

    private final void o() {
        inflate(getContext(), R.layout.rich_card_media_attachment_view, this);
        this.b = (ImageView) findViewById(R.id.rich_card_thumbnail_image);
        this.o = (RichCardVideoOverlayView) findViewById(R.id.rich_card_video_overlay);
        this.c = (RichCardMediaDownloadOverlayView) findViewById(R.id.rich_card_media_download_overlay);
        this.p = (ImageView) findViewById(R.id.rich_card_media_placeholder_icon);
        setBackgroundColor(this.q);
        RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = this.c;
        richCardMediaDownloadOverlayView.b = this;
        richCardMediaDownloadOverlayView.c();
        this.p.setTag(R.id.rich_card_media_icon_tag, aaep.NONE);
        this.b.setOnClickListener(new zqq(this, 19));
        this.n = getResources().getInteger(R.integer.rich_card_media_cross_fade_duration);
        this.r = aktp.y(this).c().ag();
    }

    @Override // defpackage.uji
    public final void a(String str) {
        if (!n(str)) {
            return;
        }
        this.h = 0;
        this.k = 2;
        this.c.c();
    }

    @Override // defpackage.uji
    public final void b(String str) {
        if (!n(str)) {
            return;
        }
        this.k = 4;
        this.c.c();
    }

    @Override // defpackage.uji
    public final void c(String str, long j, long j2) {
        if (!n(str)) {
            return;
        }
        if (j2 <= 0) {
            this.h = -1;
        } else {
            this.h = (int) ((j / j2) * 100.0d);
        }
        this.c.c();
    }

    @Override // defpackage.uji
    public final void e(String str, Uri uri) {
        if (!n(str)) {
            return;
        }
        xyo a2 = a.a();
        a2.H("Rich Card media at uri ");
        a2.H(str);
        a2.H(" was successfully downloaded to ");
        a2.H(uri);
        a2.q();
    }

    public final void h() {
        this.q = 3622735;
        i();
        j();
    }

    public final void i() {
        this.b.setImageURI(null);
        this.b.setVisibility(8);
        setBackgroundColor(this.q);
        this.j = null;
    }

    public final void j() {
        this.o.f(null);
        this.o.setVisibility(8);
    }

    public final void k(Uri uri) {
        if (!ydk.w(uri)) {
            xyl.c("Expected URI to be a local URI. Received URI: ".concat(uri.toString()));
            return;
        }
        if (uri.equals(this.j)) {
            return;
        }
        this.b.setVisibility(0);
        if (this.j != null && this.b.isLaidOut()) {
            this.r.h(uri).v(new aaen(this, this.b.getWidth(), this.b.getHeight(), uri));
            return;
        }
        aaeo aaeoVar = new aaeo(this, uri);
        if (this.i) {
            this.r.h(uri).f(aaeoVar).v(new hxk(this.b, null));
            return;
        }
        akms h = this.r.h(uri);
        int i = this.n;
        huz huzVar = new huz();
        huzVar.c(new xzg(i, null));
        h.o(huzVar).f(aaeoVar).v(new hxk(this.b, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(boolean r14) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView.l(boolean):void");
    }

    protected final void m() {
        int i;
        String j = this.m.j();
        MessagePartCoreData i2 = this.m.i();
        if (!TextUtils.isEmpty(j) && ((uja) this.d.b()).b(j) && i2 != null) {
            ((uja) this.d.b()).a(i2, this);
            i = 3;
        } else {
            i = 2;
        }
        this.k = i;
    }

    protected final boolean n(String str) {
        if (!TextUtils.isEmpty(str)) {
            ConversationRichCardView conversationRichCardView = this.m;
            if (conversationRichCardView == null) {
                xyl.c("The current media uri string was requested from the rich card but the RichCardMediaAttachmentHost was null.");
                return false;
            }
            String j = conversationRichCardView.j();
            if (!TextUtils.isEmpty(j)) {
                return j.equals(str);
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.round(Math.max(getResources().getDimension(R.dimen.rich_card_min_height), View.MeasureSpec.getSize(i2))), 1073741824));
    }

    public RichCardMediaAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 3622735;
        this.k = 1;
        this.l = 1;
        this.h = -1;
        this.i = true;
        o();
    }

    @Override // defpackage.uji
    public final void d(String str) {
    }
}
