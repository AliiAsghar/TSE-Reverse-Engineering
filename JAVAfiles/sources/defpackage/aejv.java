package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aejv extends arrm implements arqv {
    public static final aejv a = new aejv();

    public aejv() {
        super(2, aeke.class, "getAnimatedEmojiModifierForPosition", "getAnimatedEmojiModifierForPosition(Landroidx/compose/foundation/layout/BoxScope;Lcom/google/android/libraries/communications/ux/components/voicemood/Position;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ake akeVar = (ake) obj;
        afbv afbvVar = (afbv) obj2;
        akeVar.getClass();
        afbvVar.getClass();
        int ordinal = afbvVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    cga h = amv.h(cga.e, 40.0f);
                    int i = cfq.a;
                    return amd.b(akeVar.a(h, cfq.a.c), -16.0f, -10.0f);
                }
                throw new armm();
            }
            cga h2 = amv.h(cga.e, 20.0f);
            int i2 = cfq.a;
            return chu.a(amd.b(akeVar.a(h2, cfq.a.i), -72.0f, -48.0f), -30.0f);
        }
        cga h3 = amv.h(cga.e, 24.0f);
        int i3 = cfq.a;
        return amd.b(akeVar.a(h3, cfq.a.g), 64.0f, -4.0f);
    }
}
