package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaff extends aafk {
    public static final xze a = xze.g("Bugle", "ChipListConversationSuggestionsController");
    public MessageIdType b;
    public final Set c;
    public final Object d;
    public final xnv e;
    public final armf f;
    public final mho g;
    public final abdc h;
    public final armf i;
    public final rgp j;
    private final aksr s;

    public aaff(Context context, ydc ydcVar, ksi ksiVar, yyb yybVar, armf armfVar, ykw ykwVar, mho mhoVar, xnv xnvVar, armf armfVar2, rgp rgpVar, znp znpVar, abdc abdcVar, apwt apwtVar, aksr aksrVar, armf armfVar3, armf armfVar4) {
        super(context, ydcVar, ksiVar, yybVar, ykwVar, mhoVar, xnvVar, armfVar2, rgpVar, znpVar, apwtVar, aksrVar, armfVar3, armfVar4);
        this.b = rvc.a;
        this.c = new HashSet();
        this.d = new Object();
        this.f = armfVar;
        this.e = xnvVar;
        this.i = armfVar2;
        this.g = mhoVar;
        this.j = rgpVar;
        this.h = abdcVar;
        this.s = aksrVar;
    }

    public static void j(View view) {
        View o = o(view);
        if (o != null && !o.canScrollHorizontally(-1)) {
            o.canScrollHorizontally(1);
        }
    }

    public static void k(View view) {
        View o = o(view);
        if (o != null) {
            o.canScrollHorizontally(-1);
        }
    }

    private static View o(View view) {
        if (view.getId() == R.id.suggestion_list_scroll_view) {
            return view;
        }
        View view2 = (View) view.getParent();
        if (view2 == null) {
            return null;
        }
        return o(view2);
    }

    @Override // defpackage.aafk
    public final int a() {
        return R.dimen.conversation_suggestion_bubble_container_horizontal_padding;
    }

    @Override // defpackage.aafk
    protected final int b() {
        return R.id.suggestion_button_icon;
    }

    @Override // defpackage.aafk
    protected final int c() {
        return R.id.suggestion_button_label;
    }

    @Override // defpackage.aafk
    protected final int d() {
        return R.layout.conversation_suggestion_button;
    }

    @Override // defpackage.aafk
    protected final void e(aahj aahjVar, aafw aafwVar) {
        super.e(aahjVar, aafwVar);
        aahjVar.e().a();
    }

    @Override // defpackage.aafk
    protected final int f(aafw aafwVar) {
        return ahnz.f(this.m, R.attr.colorPrimaryBrandIcon, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.aafk
    protected final int g(aafw aafwVar) {
        return ahnz.f(this.m, R.attr.colorOnSurfaceVariant, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.aafk
    protected final void h(SuggestionData suggestionData, aafw aafwVar, View view) {
        if (aafwVar.e()) {
            if (!((Boolean) ((utz) yig.M.get()).e()).booleanValue()) {
                super.l(suggestionData, aafwVar);
                return;
            }
            boolean z = suggestionData instanceof RbmSuggestionData;
            if (suggestionData.e()) {
                if (z) {
                    String f = ((RbmSuggestionData) suggestionData).f();
                    synchronized (this.d) {
                        if (this.c.contains(f)) {
                            return;
                        } else {
                            this.c.add(f);
                        }
                    }
                } else if (!this.b.b() && this.b.equals(suggestionData.r())) {
                    return;
                } else {
                    this.b = suggestionData.r();
                }
            } else {
                this.j.a(aafwVar.b(), this.e.f().toEpochMilli()).t();
                this.g.ah(z);
                if (z) {
                    this.g.ai();
                    this.g.aj();
                }
            }
            if (!z) {
                yyb.ar(suggestionData, aqba.CLICKED);
                abdc abdcVar = this.h;
                amhh amhhVar = amhh.P2P_SUGGESTION_CLICK;
                aqax aqaxVar = aqax.CONVERSATION_VIEW;
                boolean z2 = abdcVar.b;
                j(view);
                k(view);
                qiu.h(yyb.aA(suggestionData, amhhVar, aqaxVar));
            }
            aafwVar.c(suggestionData);
        }
    }

    @Override // defpackage.aafk
    protected final void i(View view, final SuggestionData suggestionData, final aafw aafwVar) {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(-1.0f));
        final boolean z = suggestionData instanceof RbmSuggestionData;
        if (!z) {
            AtomicReference atomicReference2 = new AtomicReference();
            atomicReference2.set(new GestureDetector(this.m, new aafe(this, suggestionData, atomicReference, view)));
            view.setOnTouchListener(new aizz(this, atomicReference2, atomicReference, 1));
        }
        view.setOnClickListener(new akwb(this.s, "ChipListConversationSuggestionsController#setOnClickListener.onClick", new View.OnClickListener() { // from class: aafd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                aafw aafwVar2 = aafwVar;
                if (aafwVar2 != null) {
                    boolean z2 = z;
                    SuggestionData suggestionData2 = suggestionData;
                    aaff aaffVar = aaff.this;
                    if (suggestionData2.e()) {
                        if (z2) {
                            String f = ((RbmSuggestionData) suggestionData2).f();
                            synchronized (aaffVar.d) {
                                if (aaffVar.c.contains(f)) {
                                    return;
                                } else {
                                    aaffVar.c.add(f);
                                }
                            }
                        } else if (!aaffVar.b.b() && aaffVar.b.equals(suggestionData2.r())) {
                            return;
                        } else {
                            aaffVar.b = suggestionData2.r();
                        }
                    } else {
                        aaffVar.j.a(aafwVar2.b(), aaffVar.e.f().toEpochMilli()).t();
                        aaffVar.g.ah(z2);
                        if (z2) {
                            aaffVar.g.ai();
                            aaffVar.g.aj();
                        }
                    }
                    if (!z2) {
                        AtomicReference atomicReference3 = atomicReference;
                        yyb.ar(suggestionData2, aqba.CLICKED);
                        abdc abdcVar = aaffVar.h;
                        amhh amhhVar = amhh.P2P_SUGGESTION_CLICK;
                        aqax aqaxVar = aqax.CONVERSATION_VIEW;
                        boolean z3 = abdcVar.b;
                        ((Float) atomicReference3.get()).floatValue();
                        aaff.j(view2);
                        aaff.k(view2);
                        qiu.h(yyb.aA(suggestionData2, amhhVar, aqaxVar));
                    }
                    aafwVar2.c(suggestionData2);
                }
            }
        }, 1));
    }
}
