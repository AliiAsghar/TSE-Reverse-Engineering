package com.google.android.apps.messaging.ui.conversation.message;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aacj;
import defpackage.aacw;
import defpackage.ahnz;
import defpackage.akms;
import defpackage.aktp;
import defpackage.alhr;
import defpackage.alor;
import defpackage.alwo;
import defpackage.armf;
import defpackage.huz;
import defpackage.ish;
import defpackage.ivq;
import defpackage.iyh;
import defpackage.iyi;
import defpackage.lzv;
import defpackage.rry;
import defpackage.ryx;
import defpackage.rzc;
import defpackage.utz;
import defpackage.uuh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationMessageLinkPreviewView extends aacw implements iyi {
    public static final /* synthetic */ int v = 0;
    private TextView A;
    private ImageView B;
    private float[] C;
    private final int D;
    public rzc b;
    public ryx c;
    public Optional d;
    public lzv e;
    public armf f;
    public armf g;
    public ImageView h;
    ImageView i;
    public View j;
    public View k;
    public View l;
    public View m;
    public boolean n;
    public ConversationMessageView o;
    public ConversationMessageBubbleView p;
    public View.OnClickListener q;
    public View.OnLongClickListener r;
    public View.OnClickListener s;
    protected akms t;
    public iyh u;
    private TextView y;
    private TextView z;
    static final alhr a = uuh.y("enable_link_preview_view_customization");
    private static final alor w = alor.l("photos.google.com", new aacj());
    private static final alwo x = alwo.o("BugleLinkPreviews");

    public ConversationMessageLinkPreviewView(Context context) {
        this(context, null, 0);
    }

    private final void f() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.C, null, null));
        shapeDrawable.setAlpha(0);
        setForeground(shapeDrawable);
    }

    private final void g() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.C, null, null));
        shapeDrawable.getPaint().setAntiAlias(false);
        setForeground(new RippleDrawable(ColorStateList.valueOf(ahnz.d(this, R.attr.colorControlHighlight)), null, shapeDrawable));
    }

    private final void h(MessageIdType messageIdType, String str) {
        this.l.setVisibility(0);
        this.m.setVisibility(8);
        this.k.setVisibility(8);
        setOnClickListener(new ivq(this, messageIdType, str, 9));
        this.p.c(true, true);
    }

    @Override // defpackage.iyi
    public final void I(Iterable iterable) {
        g();
        this.r = null;
    }

    @Override // defpackage.iyi
    public final void K(rry rryVar) {
        f();
        setOnLongClickListener(new ish(this, 6));
    }

    public final void a() {
        setOnClickListener(null);
        setClickable(false);
        b(null, null);
    }

    public final void b(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.q = onClickListener;
        this.r = onLongClickListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0303 A[LOOP:2: B:100:0x023b->B:123:0x0303, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0300 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.rry r21, float[] r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView.c(rry, float[], boolean, boolean):void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (ImageView) findViewById(com.google.android.apps.messaging.R.id.thumbnail_image);
        this.i = (ImageView) findViewById(com.google.android.apps.messaging.R.id.thumbnail_image_overlay);
        this.j = findViewById(com.google.android.apps.messaging.R.id.thumbnail_image_container);
        this.y = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_title);
        this.z = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_description);
        this.A = (TextView) findViewById(com.google.android.apps.messaging.R.id.link_preview_domain);
        this.k = findViewById(com.google.android.apps.messaging.R.id.link_preview_content_container);
        this.l = findViewById(com.google.android.apps.messaging.R.id.link_preview_tap_to_load_container);
        this.m = findViewById(com.google.android.apps.messaging.R.id.link_preview_progress);
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            this.B = (ImageView) findViewById(com.google.android.apps.messaging.R.id.link_preview_icon);
        }
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = aktp.y(this).c().o(huz.b());
        if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
            inflate(context, com.google.android.apps.messaging.R.layout.conversation_message_link_preview_view_v2, this);
        } else {
            inflate(context, com.google.android.apps.messaging.R.layout.conversation_message_link_preview_view, this);
        }
        this.D = ahnz.d(this, R.attr.colorBackground);
    }

    @Override // defpackage.iyi
    public final void J(rry rryVar) {
    }
}
