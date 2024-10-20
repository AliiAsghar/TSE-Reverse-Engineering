package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zel implements asaj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public zel(cit citVar, agak agakVar, View view, int i) {
        this.d = i;
        this.a = citVar;
        this.b = agakVar;
        this.c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, agak] */
    @Override // defpackage.asaj
    public final /* synthetic */ Object fv(Object obj, arpe arpeVar) {
        if (this.d != 0) {
            jyb jybVar = new jyb(this.b, 7);
            Object obj2 = this.c;
            ?? r1 = this.a;
            r1.b(((jzf) obj2).a((alog) obj, r1, jybVar));
            return arnb.a;
        }
        if (((Boolean) obj).booleanValue()) {
            ((cit) this.a).b();
            ?? r3 = this.b;
            if (r3 != 0) {
                r3.f((View) this.c, false);
            }
        }
        return arnb.a;
    }

    public zel(lrc lrcVar, jzf jzfVar, arsb arsbVar, int i) {
        this.d = i;
        this.a = lrcVar;
        this.c = jzfVar;
        this.b = arsbVar;
    }
}
