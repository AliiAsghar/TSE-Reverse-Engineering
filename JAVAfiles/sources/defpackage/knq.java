package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knq implements knm {
    public final ryg a;
    public String b;
    private final Context c;
    private final jxv d;

    public knq(jxv jxvVar, Context context, ryg rygVar) {
        this.d = jxvVar;
        this.c = context;
        this.a = rygVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [msh, java.lang.Object] */
    @Override // defpackage.knm
    public final boolean a() {
        this.a.j();
        alur it = ((alog) this.a.h()).iterator();
        while (it.hasNext()) {
            qwm qwmVar = (qwm) it.next();
            knl h = this.d.h();
            h.H("Active subscription:");
            h.x("subId", qwmVar.e());
            h.x("simSlotId", qwmVar.d());
            h.z("selfParticipantId", qwmVar.g());
            if (qwmVar.b().isPresent()) {
                ?? r1 = qwmVar.b().get();
                h.z("displayDestination", r1.F());
                h.z("normalizedDestination", r1.o(((Boolean) msw.d.e()).booleanValue()));
            }
            h.q();
        }
        qwm b = this.a.b();
        if (b == null) {
            this.b = "Default subscription is null.";
            return false;
        }
        knl h2 = this.d.h();
        h2.x("default subId", b.e());
        h2.q();
        if (b.b().isEmpty()) {
            this.b = this.c.getString(R.string.enter_self_phone_number_suggestion);
            return false;
        }
        return true;
    }
}
