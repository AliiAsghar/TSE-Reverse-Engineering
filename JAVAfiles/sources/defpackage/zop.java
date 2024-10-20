package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zop implements xuo, xuv {
    public final xjo A;
    public abac B;
    private Animator C;
    private final int D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    public zwy a;
    public final LinearLayout b;
    public final LayoutTransition c;
    public final int d;
    public int e;
    public zxa f;
    public ImageView g;
    public LinearLayout h;
    public final String j;
    public final String k;
    public final String l;
    public final AttachmentsContainer q;
    public final Context r;
    public final armf s;
    public final armf t;
    public final armf u;
    public final armf v;
    public final armf w;
    public final armf x;
    public int y = 1;
    public boolean i = false;
    public final Map m = new HashMap();
    public int n = 0;
    public int o = 0;
    public List p = new ArrayList();
    public int z = 1;

    public zop(AttachmentsContainer attachmentsContainer, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        this.q = attachmentsContainer;
        Context context = (Context) armfVar12.b();
        this.r = context;
        this.E = armfVar;
        this.F = armfVar2;
        this.G = armfVar3;
        this.s = armfVar4;
        this.t = armfVar5;
        this.u = armfVar6;
        this.H = armfVar7;
        this.I = armfVar8;
        this.v = armfVar9;
        this.w = armfVar10;
        this.x = armfVar11;
        this.A = new xjo(null, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        LayoutTransition layoutTransition = new LayoutTransition();
        this.c = layoutTransition;
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.compose_attachment_container_height);
        this.D = Math.round(context.getResources().getDimension(R.dimen.compress_info_image_view_hide_threshold));
        this.j = context.getResources().getString(R.string.media_compress_info);
        this.k = context.getResources().getString(R.string.video_compress_info);
        this.l = context.getResources().getString(R.string.image_compress_info);
        attachmentsContainer.addView(linearLayout);
    }

    public static final Map n(rsr rsrVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MessagePartCoreData messagePartCoreData : rsrVar.r) {
            Uri v = messagePartCoreData.v();
            Uri t = messagePartCoreData.t();
            if (v != null) {
                linkedHashMap.put(v, messagePartCoreData);
            } else if (t != null) {
                linkedHashMap.put(t, messagePartCoreData);
            }
        }
        for (MessagePartCoreData messagePartCoreData2 : rsrVar.t) {
            Uri v2 = messagePartCoreData2.v();
            Uri t2 = messagePartCoreData2.t();
            if (v2 != null) {
                linkedHashMap.put(v2, messagePartCoreData2);
            } else if (t2 != null) {
                linkedHashMap.put(t2, messagePartCoreData2);
            }
        }
        return linkedHashMap;
    }

    public static final int o(rsr rsrVar) {
        int i = 0;
        for (MessagePartCoreData messagePartCoreData : n(rsrVar).values()) {
            if (messagePartCoreData.M() == ameb.CAMERA || messagePartCoreData.M() == ameb.MINI_CAMERA || messagePartCoreData.M() == ameb.FULLSCREEN_CAMERA) {
                if (messagePartCoreData.bk()) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final int p(rsr rsrVar) {
        int i = 0;
        for (MessagePartCoreData messagePartCoreData : n(rsrVar).values()) {
            if (messagePartCoreData.M() == ameb.CAMERA || messagePartCoreData.M() == ameb.MINI_CAMERA || messagePartCoreData.M() == ameb.FULLSCREEN_CAMERA) {
                if (messagePartCoreData.bz()) {
                    i++;
                }
            }
        }
        return i;
    }

    private final void q(int i, int i2) {
        int i3;
        Animator animator = this.C;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "animatedHeight", i, i2);
        this.C = ofInt;
        ofInt.setDuration(this.r.getResources().getInteger(R.integer.attachment_container_animation_duration));
        this.C.setInterpolator(yai.a);
        this.C.setStartDelay(this.o);
        this.C.addListener(new zoo(this, i2, i));
        this.C.start();
        if (i2 == 0) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        this.y = i3;
    }

    public final void a() {
        if (this.B != null && this.z != 3) {
            b();
            this.g.animate().alpha(brg.a).setDuration(200L).setInterpolator(new AccelerateInterpolator()).withStartAction(new ybh(this, 20)).withEndAction(new zom(this, 1));
        }
    }

    public final void b() {
        abac abacVar = this.B;
        if (abacVar != null) {
            abacVar.d();
        }
    }

    public final void c(View view) {
        view.post(new ybh(this, 19));
    }

    public final void d(View view) {
        this.p.add(view);
        view.animate().scaleX(0.7f).scaleY(0.7f).alpha(brg.a).setDuration(this.r.getResources().getInteger(R.integer.selected_media_animation_duration)).setInterpolator(new emq()).withEndAction(new yar(this, view, 16));
    }

    public final void e() {
        if (this.z != 2) {
            this.g.setVisibility(0);
            this.g.post(new ybh(this, 18));
        }
    }

    @Override // defpackage.xuo
    public final int f() {
        return 3;
    }

    public final void g() {
        int i;
        if (this.q.getVisibility() != 8 && (i = this.y) != 4 && i != 5) {
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setVisibility(8);
                b();
            }
            q(this.d, 0);
        }
    }

    @Override // defpackage.xuo
    public final boolean h(AudioAttachmentView audioAttachmentView) {
        return false;
    }

    @Override // defpackage.xuv
    public final boolean i(MessagePartCoreData messagePartCoreData, Rect rect, boolean z) {
        String U;
        Uri t = messagePartCoreData.t();
        if (t == null) {
            xzb.n("Bugle", "Cannot click attachment with null uri");
            return false;
        }
        if (!(messagePartCoreData instanceof PendingAttachmentData)) {
            if (messagePartCoreData.bk()) {
                zxa zxaVar = ((zrb) this.a).c.j;
                if (!((Boolean) aaxj.d.e()).booleanValue() && !((Boolean) aaxj.e.e()).booleanValue()) {
                    ixd ixdVar = (ixd) zxaVar;
                    ixd.bs(ixdVar.af, t, true, ixdVar.L, ixdVar.q());
                } else {
                    ixd ixdVar2 = (ixd) zxaVar;
                    ixd.bt(ixdVar2.af, t, true, ixdVar2.L, ixdVar2.M);
                }
                ((mho) this.E.b()).R(3);
                return true;
            }
            if (messagePartCoreData.bz()) {
                ((lzv) this.H.b()).D(this.r, t, messagePartCoreData.U());
                ((mho) this.E.b()).ac(3);
                return true;
            }
            if (messagePartCoreData.aZ()) {
                Uri a = uhn.a(this.r, t, messagePartCoreData.X(), messagePartCoreData.U(), messagePartCoreData.p());
                ((mho) this.E.b()).aw(rvc.a.a(), 2);
                if (messagePartCoreData.bj()) {
                    ((lzv) this.H.b()).B(this.r, a, messagePartCoreData.U());
                } else {
                    ((Optional) ((apxx) this.I).a).ifPresent(new zle(11));
                }
                return true;
            }
            if (messagePartCoreData.bv()) {
                if (messagePartCoreData.bx()) {
                    U = "text/plain";
                } else {
                    U = messagePartCoreData.U();
                }
                Uri a2 = uhn.a(this.r, t, messagePartCoreData.X(), U, messagePartCoreData.p());
                ((mho) this.E.b()).aF(messagePartCoreData.bJ(), rvc.a.a(), 2);
                ((lzv) this.H.b()).B(this.r, a2, U);
                return true;
            }
        }
        return false;
    }

    public final void j() {
        int i;
        if (this.q.getVisibility() == 0 && ((i = this.y) == 2 || i == 3)) {
            return;
        }
        this.q.setVisibility(0);
        if (this.i) {
            e();
        }
        q(0, this.d);
    }

    public final void k() {
        this.g.setTranslationY(((-this.d) - this.h.getMeasuredHeight()) + this.g.getMeasuredHeight());
    }

    public final void l(int i) {
        if (this.f.aT() && !this.f.b() && this.i) {
            int width = this.b.getWidth() - i;
            AttachmentsContainer attachmentsContainer = this.q;
            if (width > attachmentsContainer.getWidth() - this.D) {
                a();
            } else {
                e();
            }
        }
    }

    public final void m(alog alogVar) {
        aktp.aa(((anen) this.F.b()).submit(akto.k(new yxs(this, alogVar, 10, null))), new isn(this, 14), (Executor) this.G.b());
    }

    public void setAnimatedHeight(int i) {
        if (this.e != i) {
            this.e = i;
            this.q.requestLayout();
        }
    }
}
