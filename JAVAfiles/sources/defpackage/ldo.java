package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.label.ui.StillSortingNoticeView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldo {
    public final LottieAnimationView a;

    static {
        alor.p(SuperSortLabel.PERSONAL, Integer.valueOf(R.string.supersort_still_sorting_conversation_list_personal), SuperSortLabel.BUSINESS_UPDATE, Integer.valueOf(R.string.supersort_still_sorting_conversation_list_business_update), SuperSortLabel.TRANSACTION, Integer.valueOf(R.string.supersort_still_sorting_conversation_list_transaction), SuperSortLabel.PROMOTION, Integer.valueOf(R.string.supersort_still_sorting_conversation_list_promotion), SuperSortLabel.OTP, Integer.valueOf(R.string.supersort_still_sorting_conversation_list_otp));
    }

    public ldo(StillSortingNoticeView stillSortingNoticeView) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) stillSortingNoticeView.findViewById(R.id.still_sorting_lottie_animation);
        this.a = lottieAnimationView;
        ahnz.B(ajcn.a, lottieAnimationView, ahnz.x(stillSortingNoticeView.getContext()));
        stillSortingNoticeView.addOnAttachStateChangeListener(new ib(this, 5));
    }
}
