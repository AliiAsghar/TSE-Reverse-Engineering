package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import defpackage.aacr;
import defpackage.aacy;
import defpackage.abcp;
import defpackage.aksr;
import defpackage.armf;
import defpackage.rry;
import defpackage.vid;
import defpackage.xog;
import defpackage.xyp;
import defpackage.zpt;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationMessageTransferView extends aacy {
    public rry a;
    public aacr b;
    public abcp c;
    public zpt d;
    public aksr e;
    public armf f;
    public armf g;
    public vid h;
    private ViewGroup i;
    private ImageView j;
    private ProgressBar k;
    private final int l;

    public ConversationMessageTransferView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.conversation_message_transfer_view, this);
        this.l = getResources().getDimensionPixelSize(R.dimen.message_transfer_attachment_padding);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int e() {
        /*
            r4 = this;
            rry r0 = r4.a
            int r0 = r0.f()
            r1 = 210(0xd2, float:2.94E-43)
            r2 = 0
            if (r0 == r1) goto L62
            r1 = 243(0xf3, float:3.4E-43)
            if (r0 == r1) goto L62
            switch(r0) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L31;
                case 9: goto L31;
                case 10: goto L35;
                case 11: goto L62;
                case 12: goto L31;
                case 13: goto L31;
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L62;
                case 17: goto L62;
                case 18: goto L62;
                case 19: goto L62;
                case 20: goto L35;
                case 21: goto L62;
                case 22: goto L62;
                default: goto L12;
            }
        L12:
            switch(r0) {
                case 100: goto L62;
                case 101: goto L2d;
                case 102: goto L35;
                case 103: goto L35;
                case 104: goto L35;
                case 105: goto L35;
                case 106: goto L2d;
                case 107: goto L31;
                case 108: goto L62;
                case 109: goto L62;
                case 110: goto L2d;
                case 111: goto L31;
                case 112: goto L31;
                case 113: goto L2c;
                case 114: goto L2c;
                case 115: goto L2d;
                default: goto L15;
            }
        L15:
            rry r0 = r4.a
            int r0 = r0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unknown status "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.xyl.c(r0)
        L2c:
            return r2
        L2d:
            r0 = 2131231934(0x7f0804be, float:1.8079963E38)
            return r0
        L31:
            r0 = 2131231910(0x7f0804a6, float:1.8079914E38)
            return r0
        L35:
            rry r0 = r4.a
            boolean r0 = r0.aE()
            if (r0 == 0) goto L52
            rry r0 = r4.a
            boolean r0 = r0.aF()
            if (r0 != 0) goto L4e
            rry r0 = r4.a
            boolean r0 = r0.aQ()
            if (r0 != 0) goto L4e
            goto L52
        L4e:
            r0 = 2131231585(0x7f080361, float:1.8079255E38)
            return r0
        L52:
            rry r0 = r4.a
            boolean r0 = r0.aP()
            if (r0 == 0) goto L5e
            r0 = 2131231982(0x7f0804ee, float:1.808006E38)
            return r0
        L5e:
            r0 = 2131231942(0x7f0804c6, float:1.807998E38)
            return r0
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.e():int");
    }

    private final int f() {
        if (this.a.aE() && this.a.aF()) {
            return R.string.stop_send_description;
        }
        if (this.b != null) {
            if (this.c.d(this.a.c(), this.a.s())) {
                if (this.a.ai()) {
                    return R.string.waiting_to_connect_tap_for_options;
                }
                return R.string.message_status_waiting_for_connection;
            }
            if (this.a.af()) {
                return R.string.message_status_rcs_stuck_in_sending_hint;
            }
            return R.string.message_status_sending;
        }
        return R.string.message_status_sending;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (r5.a.aP() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015f, code lost:
    
        r0 = com.google.android.apps.messaging.R.string.video_thumbnail_view_play_button_content_description;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015d, code lost:
    
        if (r5.a.aP() != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.rry r6) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView.a(rry):void");
    }

    public final void b(Optional optional) {
        if (!this.a.ao() && !this.a.aM()) {
            this.k.setVisibility(4);
            return;
        }
        if (optional.isEmpty()) {
            this.k.setIndeterminate(!xyp.j());
        } else {
            this.k.setIndeterminate(false);
            this.k.setMax((int) ((xog) optional.get()).b);
            this.k.setProgress((int) ((xog) optional.get()).a, true);
        }
        this.k.setVisibility(0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.h.a();
        this.i = (ViewGroup) findViewById(R.id.icon_container);
        this.j = (ImageView) findViewById(R.id.icon);
        this.k = (ProgressBar) findViewById(R.id.progress);
    }
}
