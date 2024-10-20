package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acto {
    static final acyz a = acyy.b("enable_gba_authentication_logging");
    private final Context b;
    private final acoc c;

    public acto(Context context, acoc acocVar) {
        this.b = context;
        this.c = acocVar;
    }

    public final void a(int i, apgh apghVar) {
        if (((Boolean) a.a()).booleanValue()) {
            aozy createBuilder = apgv.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apgv apgvVar = (apgv) apagVar;
            apgvVar.f = 8;
            apgvVar.b |= 2;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apgv apgvVar2 = (apgv) apagVar2;
            apgvVar2.g = i - 1;
            apgvVar2.b |= 4;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apgv apgvVar3 = (apgv) createBuilder.b;
            apghVar.getClass();
            apgvVar3.d = apghVar;
            apgvVar3.c = 11;
            this.c.h(this.b, (apgv) createBuilder.s());
        }
    }
}
