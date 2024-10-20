package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((qv) this.a).p = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ((mk) this.a).b.setAlpha(floatValue);
                ((mk) this.a).c.setAlpha(floatValue);
                ((mk) this.a).f();
                return;
            case 2:
                ((View) ((gb) ((qdq) this.a).a).c.getParent()).invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fyb fybVar = (fyb) this.a;
                fybVar.f = floatValue2;
                fybVar.invalidate(fybVar.a);
                return;
            case 4:
                fyu.n((fyu) this.a, valueAnimator);
                return;
            case 5:
                fyu.n((fyu) this.a, valueAnimator);
                return;
            case 6:
                ((fyu) this.a).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                ((fyu) this.a).c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                hbl hblVar = (hbl) this.a;
                hfx hfxVar = hblVar.j;
                if (hfxVar != null) {
                    hfxVar.m(hblVar.b.c());
                    return;
                }
                return;
            case 9:
                itb itbVar = (itb) this.a;
                MessageListRecyclerView messageListRecyclerView = itbVar.ao;
                if (messageListRecyclerView == null) {
                    return;
                }
                int paddingTop = messageListRecyclerView.getPaddingTop();
                itbVar.ao.setPadding(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, itbVar.f.z().getDimensionPixelOffset(R.dimen.message_list_padding_bottom));
                MessageListRecyclerView messageListRecyclerView2 = itbVar.ao;
                messageListRecyclerView2.scrollBy(0, paddingTop - messageListRecyclerView2.getPaddingTop());
                return;
            case 10:
                valueAnimator.getClass();
                ((iyc) this.a).b.setAlpha(valueAnimator.getAnimatedFraction());
                return;
            case 11:
                valueAnimator.getClass();
                ((iyc) this.a).b.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                return;
            case 12:
                valueAnimator.getClass();
                View view = (View) this.a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
                return;
            case 13:
                Interpolator interpolator = yai.a;
                ((View) this.a).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 14:
                ((zqd) this.a).g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 15:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqd zqdVar = (zqd) this.a;
                zqdVar.d = floatValue3;
                zqdVar.invalidateSelf();
                return;
            case 16:
                ((zqd) this.a).i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                return;
            case 17:
                ((zqd) this.a).e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                ((zqd) this.a).f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 19:
                ((zqd) this.a).g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                ((zqu) this.a).e.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }

    public /* synthetic */ qu(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
