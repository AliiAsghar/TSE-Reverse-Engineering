package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafe extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SuggestionData a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ View c;
    final /* synthetic */ aaff d;

    public aafe(aaff aaffVar, SuggestionData suggestionData, AtomicReference atomicReference, View view) {
        this.a = suggestionData;
        this.b = atomicReference;
        this.c = view;
        this.d = aaffVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        amhh amhhVar = amhh.P2P_SUGGESTION_LONG_PRESS;
        aqax aqaxVar = aqax.CONVERSATION_VIEW;
        boolean z = this.d.h.b;
        ((Float) this.b.get()).floatValue();
        aaff.j(this.c);
        aaff.k(this.c);
        qiu.h(yyb.aA(this.a, amhhVar, aqaxVar));
        super.onLongPress(motionEvent);
    }
}
