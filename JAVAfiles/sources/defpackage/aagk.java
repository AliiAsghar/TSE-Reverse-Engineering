package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.ArrayMap;
import android.util.Property;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagk {
    public final armf a;
    public final armf b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    private final Object h;

    public aagk(xnv xnvVar, armf armfVar, armf armfVar2, anen anenVar, aneo aneoVar) {
        this.g = new ReentrantLock();
        this.d = new ArrayMap();
        this.c = false;
        this.f = xnvVar;
        this.b = armfVar;
        this.a = armfVar2;
        this.e = anenVar;
        this.h = aneoVar;
    }

    public static final aoee e(xyw xywVar) {
        if (xywVar.c == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Object obj = xywVar.c;
        abhg.m(obj);
        aoed aoedVar = new aoed();
        d.aC(obj, "setObject is required before calling build().");
        return new aoee("ViewAction", "Viewed SMS/MMS Message", (String) obj, null, aoedVar, null, bundle);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    public final void a(List list, aack aackVar, MessageIdType messageIdType) {
        aackVar.getClass();
        messageIdType.getClass();
        if (list != null) {
            int i = 2;
            List J = aackVar.J(aqjn.az(list), 2);
            SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) this.a.b();
            if (J.isEmpty()) {
                if (suggestionShortcutView.getVisibility() == 0) {
                    yai.f(suggestionShortcutView, 8, yai.a(suggestionShortcutView.getContext()), new aafg(this, i)).start();
                    return;
                }
                return;
            }
            this.c = true;
            Object obj = J.get(0);
            obj.getClass();
            SmartSuggestionData smartSuggestionData = (SmartSuggestionData) obj;
            aahj b = ((znp) this.h.b()).b(suggestionShortcutView, smartSuggestionData);
            Optional a = b.a(ahnz.f(suggestionShortcutView.getContext(), R.attr.colorPrimaryBrandIcon, "SuggestionShortcutViewPeer"));
            AppCompatImageView appCompatImageView = (AppCompatImageView) suggestionShortcutView.findViewById(R.id.suggestion_shortcut_icon);
            a.ifPresent(new aagi(new ynn(appCompatImageView, 18), 0));
            LottieAnimationView lottieAnimationView = (LottieAnimationView) suggestionShortcutView.findViewById(R.id.animated_background);
            suggestionShortcutView.setContentDescription(b.b());
            if (suggestionShortcutView.getVisibility() != 0) {
                lottieAnimationView.h(1.0f, true);
                suggestionShortcutView.setVisibility(0);
                appCompatImageView.getClass();
                lottieAnimationView.getClass();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) zsc.a, 1.0f, 0.9754f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(new xyr(1.0f, brg.a, 0.87f, 0.99f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) zsc.a, 0.9754f, 1.0377f);
                ofFloat2.setDuration(183L);
                ofFloat2.setInterpolator(new xyr(0.95f, -0.07f, 0.67f, 1.0f));
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) zsc.a, 1.0377f, 1.0f);
                ofFloat3.setDuration(167L);
                ofFloat3.setInterpolator(new xyr(0.33f, brg.a, 0.67f, 1.0f));
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) zsc.a, 1.0f, 0.9754f);
                ofFloat4.setDuration(100L);
                ofFloat4.setInterpolator(new xyr(1.0f, brg.a, 0.87f, 0.99f));
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) zsc.a, 0.9754f, 1.0377f);
                ofFloat5.setDuration(183L);
                ofFloat5.setInterpolator(new xyr(0.95f, -0.07f, 0.67f, 1.0f));
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) zsc.a, 1.0377f, 1.0f);
                ofFloat6.setDuration(167L);
                ofFloat6.setInterpolator(new xyr(0.33f, brg.a, 0.67f, 1.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet.playSequentially(ofFloat4, ofFloat5, ofFloat6);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet, animatorSet2);
                animatorSet3.start();
            }
            ((Optional) ((apxx) this.g).a).ifPresent(new aagi(new ynn(smartSuggestionData, 19), i));
            suggestionShortcutView.setOnClickListener(new akwb((aksr) this.b.b(), "SuggestionShortcutViewPeer#onClick", new ivq(aackVar, smartSuggestionData, this, 11), 1));
        }
    }

    public final void b() {
        ((SuggestionShortcutView) this.a.b()).setVisibility(8);
        this.c = false;
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aoee e = e((xyw) it.next());
            if (e != null) {
                this.b.b();
                aodz aodzVar = (aodz) this.a.b();
                if (aodzVar != null) {
                    aodzVar.b(2, e);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void d() {
        albo.bR(albo.bK(new vyj(1), 150L, TimeUnit.MILLISECONDS, this.h), qjc.a(new ydv(new qdm(this, 10), 0)), this.e);
    }

    public aagk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.a = armfVar;
        this.h = armfVar2;
        this.b = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
        this.g = armfVar7;
    }
}
