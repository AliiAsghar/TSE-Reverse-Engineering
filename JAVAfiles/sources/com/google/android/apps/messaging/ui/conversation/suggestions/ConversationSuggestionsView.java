package com.google.android.apps.messaging.ui.conversation.suggestions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.tooltip.ConversationSuggestionsBugleTooltipView;
import defpackage.aabj;
import defpackage.aacv;
import defpackage.aaff;
import defpackage.aafl;
import defpackage.aafm;
import defpackage.aafw;
import defpackage.abbu;
import defpackage.adom;
import defpackage.alog;
import defpackage.alsx;
import defpackage.armf;
import defpackage.kor;
import defpackage.ksm;
import defpackage.lzv;
import defpackage.mho;
import defpackage.qu;
import defpackage.rvc;
import defpackage.utz;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.xvy;
import defpackage.xzb;
import defpackage.yaf;
import defpackage.yai;
import defpackage.yif;
import defpackage.yig;
import defpackage.yyb;
import defpackage.zoz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSuggestionsView extends aafm implements aacv<ConversationSuggestionsView> {
    public static final uuf a = uuh.i(uuh.b, "suggestion_feedback_enabled", false);
    public lzv b;
    public ksm c;
    public mho d;
    public armf e;
    public aaff f;
    public Optional g;
    public kor h;
    private LinearLayout i;
    private HorizontalScrollView j;
    private xvy k;
    private xvy l;
    private MessageIdType m;

    public ConversationSuggestionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void h(yif yifVar) {
        ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView = (ConversationSuggestionsBugleTooltipView) this.k.b();
        zoz zozVar = new zoz(this, yifVar, 5);
        View view = conversationSuggestionsBugleTooltipView.a;
        if (view != null) {
            view.setOnClickListener(zozVar);
        }
    }

    public final void c(List list, aafw aafwVar) {
        yif yifVar;
        int i = 0;
        if (!adom.o(list)) {
            MessageIdType r = ((SuggestionData) list.get(0)).r();
            if (!Objects.equals(this.m, r)) {
                this.m = r;
                this.j.fullScroll(17);
            }
        }
        if (this.f.n(this.i, list, aafwVar)) {
            if (aafwVar.g() && !this.l.i()) {
                TextView textView = (TextView) this.l.b();
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                textView.setOnClickListener(new aafl(this, i));
            }
            if (aafwVar.f()) {
                aaff aaffVar = this.f;
                aaffVar.n = yif.a;
                if (list != null && !list.isEmpty() && (list.get(0) instanceof SmartSuggestionData) && !((Boolean) ((utz) yig.ak.get()).e()).booleanValue()) {
                    yyb yybVar = aaffVar.r;
                    yif as = yyb.as((SuggestionData) list.get(0));
                    yyb yybVar2 = aaffVar.r;
                    as.getClass();
                    aaffVar.n = as;
                    if (yif.c.equals(aaffVar.n)) {
                        aaffVar.p.h("has_shown_assistant_tooltip", true);
                    }
                    yifVar = aaffVar.n;
                } else {
                    yifVar = aaffVar.n;
                }
                int ordinal = yifVar.ordinal();
                int i2 = 2;
                if (ordinal != 1) {
                    int i3 = 5;
                    int i4 = 4;
                    if (ordinal != 2) {
                        int i5 = 3;
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    this.k.g(8);
                                    return;
                                }
                                this.k.g(0);
                                ((ConversationSuggestionsBugleTooltipView) this.k.b()).b(getResources().getString(R.string.calendar_suggestions_tooltip_title_text));
                                ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView = (ConversationSuggestionsBugleTooltipView) this.k.b();
                                CharSequence text = getResources().getText(R.string.calendar_suggestions_tooltip_text);
                                int i6 = alog.d;
                                conversationSuggestionsBugleTooltipView.a(text, alsx.a);
                                h(yif.f);
                                return;
                            }
                            this.k.g(0);
                            ((ConversationSuggestionsBugleTooltipView) this.k.b()).b(getResources().getString(R.string.emotion_suggestions_tooltip_title_text));
                            ((ConversationSuggestionsBugleTooltipView) this.k.b()).a(getResources().getText(R.string.emotion_suggestions_tooltip_text), alog.r(new aafl(this, i5)));
                            h(yif.e);
                            return;
                        }
                        this.k.g(0);
                        ((ConversationSuggestionsBugleTooltipView) this.k.b()).b(getResources().getString(R.string.reminder_suggestions_tooltip_title_text));
                        ((ConversationSuggestionsBugleTooltipView) this.k.b()).a(getResources().getText(R.string.reminder_suggestions_tooltip_text), alog.r(new aafl(this, 6)));
                        this.g.ifPresent(new aabj(11));
                        h(yif.d);
                        return;
                    }
                    this.k.g(0);
                    ((ConversationSuggestionsBugleTooltipView) this.k.b()).b(getResources().getString(R.string.assistant_suggestions_tooltip_title_text));
                    ((ConversationSuggestionsBugleTooltipView) this.k.b()).a(getResources().getText(R.string.assistant_suggestions_tooltip_text), alog.s(new aafl(this, i4), new aafl(this, i3)));
                    this.d.az(4);
                    h(yif.c);
                    return;
                }
                this.k.g(0);
                ((ConversationSuggestionsBugleTooltipView) this.k.b()).b(getResources().getString(R.string.p2p_conversation_suggestions_tooltip_title_text));
                ((ConversationSuggestionsBugleTooltipView) this.k.b()).a(getResources().getText(R.string.p2p_conversation_suggestions_tooltip_text), alog.r(new aafl(this, i2)));
                h(yif.b);
                return;
            }
            return;
        }
        setVisibility(8);
        xzb.n("Bugle", "ConversationSuggestionsView (Chip List) rendering was unsuccessful.");
    }

    public final void d() {
        View b = this.k.b();
        long a2 = yai.a(b.getContext());
        Animator e = yai.e(b, 8, a2);
        b.getClass();
        ValueAnimator duration = ValueAnimator.ofInt(b.getMeasuredHeight(), 0).setDuration(a2);
        duration.addUpdateListener(new qu(b, 12, null));
        duration.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(e, duration);
        animatorSet.setInterpolator(yai.b);
        animatorSet.addListener(new yaf(b));
        b.clearAnimation();
        animatorSet.start();
    }

    public final void e() {
        this.b.h(getContext());
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((Boolean) ((utz) yig.M.get()).e()).booleanValue()) {
            abbu.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f.b = rvc.a;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (LinearLayout) findViewById(R.id.suggestion_list_container);
        xvy xvyVar = new xvy(this, R.id.p2p_conversation_suggestions_tooltip_view_stub, R.id.p2p_conversation_suggestions_tooltip);
        this.k = xvyVar;
        xvyVar.f(R.layout.bugle_tooltip_view_gm3);
        this.l = new xvy(this, R.id.p2p_conversation_suggestions_feedback_view_stub, R.id.p2p_conversation_suggestions_feedback_view);
        this.j = (HorizontalScrollView) findViewById(R.id.suggestion_list_scroll_view);
    }

    @Override // defpackage.aacv
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.aacv
    public final void b() {
    }
}
