package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ive implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ive(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i;
        int i2;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                alvi alviVar = ixd.a;
                ((ila) obj).m(this.b, this.a);
                return;
            case 1:
                ((ixd) this.b).Q(null, new ivd(this.a, 2));
                return;
            case 2:
                ixd ixdVar = (ixd) this.b;
                ila ilaVar = (ila) obj;
                float f = ixdVar.M.z().getDisplayMetrics().widthPixels;
                Context y = ixdVar.M.y();
                int i3 = abbv.a;
                float round = Math.round(f / y.getResources().getDisplayMetrics().density);
                float f2 = ixdVar.M.z().getConfiguration().fontScale;
                if (((Optional) ixdVar.aK.b()).isPresent()) {
                    f2 *= ((zxq) ((Optional) ixdVar.aK.b()).get()).a();
                }
                boolean z = this.a;
                if ((!ixdVar.bb() || round / f2 > ((Float) yig.ag.e()).floatValue()) && z) {
                }
                ilaVar.e().E().c.w();
                alvw d = ixd.a.d();
                d.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.p, ixdVar.L);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateMagicComposeVisibility", 2600, "ConversationFragmentPeer.java")).q("ConversationFragment: MagicComposeVisibility: false");
                ((Optional) ((apxx) ixdVar.bv).a).ifPresent(new ivn(7));
                if (!ixdVar.cx) {
                    ixdVar.cx = true;
                    ((Optional) ((apxx) ixdVar.bw).a).ifPresent(new ivp(((lqi) ixdVar.J.get()).a, 5));
                    return;
                }
                return;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                String valueOf = String.valueOf((String) entry.getKey());
                uuh.A((StringBuilder) this.b, this.a, "@".concat(valueOf), entry.getValue());
                return;
            case 4:
                wpp wppVar = (wpp) obj;
                if (!this.a) {
                    qiu.h(aktp.ah(new wnc(wppVar, this.b, 3, bArr), wppVar.a));
                    return;
                }
                return;
            case 5:
                ahlp l = ahlp.l(((aaez) obj).b());
                ahlp ahlpVar = new ahlp(Boolean.valueOf(this.a));
                zmh zmhVar = (zmh) this.b;
                zmhVar.d.j(l, ahlpVar, zmhVar.k);
                return;
            case 6:
                ahlp l2 = ahlp.l(((aaez) obj).b());
                ahlp ahlpVar2 = new ahlp(Boolean.valueOf(this.a));
                zmj zmjVar = (zmj) this.b;
                zmjVar.c.j(l2, ahlpVar2, zmjVar.l);
                return;
            case 7:
                aabp aabpVar = (aabp) obj;
                if (aabpVar != null) {
                    boolean z2 = this.a;
                    Object obj2 = this.b;
                    aabpVar.e(z2);
                    zri zriVar = (zri) obj2;
                    zriVar.D(false);
                    zriVar.S();
                    return;
                }
                return;
            default:
                MessageAttachmentsView messageAttachmentsView = (MessageAttachmentsView) ((xvy) ((zof) this.b).b).b();
                int dimensionPixelOffset = messageAttachmentsView.getResources().getDimensionPixelOffset(R.dimen.conversation_message_attachments_padding);
                boolean z3 = this.a;
                if (true != z3) {
                    i = dimensionPixelOffset;
                } else {
                    i = 0;
                }
                if (true != z3) {
                    dimensionPixelOffset = 0;
                }
                messageAttachmentsView.setPaddingRelative(i, 0, dimensionPixelOffset, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) messageAttachmentsView.d.getLayoutParams();
                if (true != z3) {
                    i2 = 8388693;
                } else {
                    i2 = 8388691;
                }
                layoutParams.gravity = i2;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
