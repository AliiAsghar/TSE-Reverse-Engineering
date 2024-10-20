package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class isk extends nq {
    final /* synthetic */ itb a;
    private boolean e;
    private int b = 0;
    private int c = 0;
    private boolean d = false;
    private boolean f = true;
    private int g = 0;

    public isk(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
        this.a.aB = false;
        int b = this.a.aq.f.b() - ((Integer) itb.a.e()).intValue();
        int M = this.a.ap.M();
        isz iszVar = this.a.an;
        int i3 = recyclerView.D;
        if (i2 < 0 && b >= M && i3 == 1) {
            ((ixd) iszVar).cI.d();
        }
        if (this.g == 1) {
            int abs = Math.abs(this.b);
            itb itbVar = this.a;
            if (abs >= itbVar.az) {
                int N = (itbVar.ap.N() + this.a.ap.L()) / 2;
                xzb.d("Bugle", "RecyclerView onScrolled: loadedMore with middleIndexOnScreen %d", Integer.valueOf(N));
                qiu.h(this.a.aq.c(N));
            }
        }
        if (i2 != 0) {
            this.a.aC = true;
        }
        if (this.g == 1 && !this.e) {
            int i4 = this.b + i2;
            this.b = i4;
            if (i4 < (-this.a.az)) {
                aktp.L(new itj(), recyclerView);
                this.e = true;
            }
        }
        if (this.f != this.a.D()) {
            this.c = 0;
            this.d = false;
            this.f = this.a.D();
            if (this.a.D()) {
                xzb.c("Bugle", "hideScrollToBottomButton");
                ixd ixdVar = (ixd) this.a.an;
                ConversationScrollToBottomButton conversationScrollToBottomButton = ixdVar.cs;
                if (conversationScrollToBottomButton != null) {
                    ixdVar.ct = 0;
                    iyc E = conversationScrollToBottomButton.E();
                    if (E.b.isShown()) {
                        E.b().start();
                    }
                    aahp aahpVar = (aahp) ixdVar.bd.b();
                    if (!aahpVar.f) {
                        aahpVar.e.h(true);
                    }
                }
            }
        }
        this.a.aR.a(recyclerView);
        if (Math.abs(this.c) > ((Integer) this.a.aU.c()).intValue() && this.g == 2 && !this.d) {
            this.d = true;
            xzb.c("Bugle", "showScrollToBottomButton");
            this.a.an.o();
        }
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        int fV;
        int i2;
        int intValue;
        if (i == 0) {
            itu ituVar = this.a.h;
            ituVar.g += ((xnv) ituVar.e.b()).a() - ituVar.f;
            this.b = 0;
            this.e = false;
            int N = (this.a.ap.N() + this.a.ap.L()) / 2;
            xzb.d("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_IDLE, call loadedMore with middelIndexOnScreen %d", Integer.valueOf(N));
            qiu.h(this.a.aq.c(N));
        } else if (i == 1) {
            if (this.g == 0) {
                boolean c = ((rrl) this.a.ay.a()).b.c();
                itb itbVar = this.a;
                if (c) {
                    itu ituVar2 = itbVar.h;
                    ituVar2.f = ((xnv) ituVar2.e.b()).a();
                }
            }
            xzb.c("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_DRAGGING");
            Optional.ofNullable(this.a.ao.C).ifPresent(new isb(9));
        }
        if (this.a.aI != null && (i == 2 || i == 0)) {
            xzb.c("Bugle", "RecyclerView onScrollStateChanged to SCROLL_STATE_SETTLING or SCROLL_STATE_IDLE");
            itb itbVar2 = this.a;
            Uri uri = itbVar2.aI;
            itbVar2.aI = null;
            if (recyclerView.getChildCount() > 0 && (fV = itbVar2.aH - recyclerView.fV(recyclerView.getChildAt(0))) < recyclerView.getChildCount()) {
                View childAt = recyclerView.getChildAt(fV);
                if (childAt instanceof ConversationMessageView) {
                    zof zofVar = ((ConversationMessageView) childAt).ab;
                    if (((xvy) zofVar.b).i()) {
                        MessageAttachmentContainer messageAttachmentContainer = ((MessageAttachmentsView) ((xvy) zofVar.b).b()).c;
                        if (messageAttachmentContainer.c.containsKey(uri) && (intValue = ((Integer) messageAttachmentContainer.c.get(uri)).intValue()) < messageAttachmentContainer.getChildCount()) {
                            i2 = messageAttachmentContainer.getMeasuredHeight() - messageAttachmentContainer.getChildAt(intValue).getBottom();
                            recyclerView.scrollBy(0, -i2);
                        }
                    }
                    i2 = 0;
                    recyclerView.scrollBy(0, -i2);
                }
            }
        }
        xzb.d("Bugle", "RecyclerView onScrollStateChanged to %s", Integer.valueOf(i));
        this.g = i;
    }
}
