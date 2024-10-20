package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahh {
    public static final arqw a = new AnonymousClass1(null);
    public static final arqw b = new AnonymousClass2(null);

    /* compiled from: PG */
    /* renamed from: ahh$1 */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqw<arwe, cjn, arpe<? super arnb>, Object> {
        public AnonymousClass1(arpe arpeVar) {
            super(3, arpeVar);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            long j = ((cjn) obj2).a;
            new AnonymousClass1((arpe) obj3);
            return a.I(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            return a.I(obj);
        }
    }

    /* compiled from: PG */
    /* renamed from: ahh$2 */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqw<arwe, Float, arpe<? super arnb>, Object> {
        public AnonymousClass2(arpe arpeVar) {
            super(3, arpeVar);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj2).floatValue();
            new AnonymousClass2((arpe) obj3);
            return a.I(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            return a.I(obj);
        }
    }

    public static /* synthetic */ cga a(cga cgaVar, ahk ahkVar, ahp ahpVar, boolean z, ajr ajrVar, boolean z2, arqw arqwVar, boolean z3, int i) {
        arqw arqwVar2;
        arqw arqwVar3;
        boolean z4;
        boolean z5;
        ajr ajrVar2;
        if ((i & 32) != 0) {
            arqwVar2 = a;
        } else {
            arqwVar2 = null;
        }
        if ((i & 64) != 0) {
            arqwVar3 = b;
        } else {
            arqwVar3 = arqwVar;
        }
        int i2 = i & 16;
        int i3 = i & 8;
        boolean z6 = false;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i2 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z7 = !z4;
        boolean z8 = z5 & z2;
        if (i3 != 0) {
            ajrVar2 = null;
        } else {
            ajrVar2 = ajrVar;
        }
        boolean z9 = z7 | z;
        if ((i & 128) == 0) {
            z6 = true;
        }
        return cgaVar.a(new DraggableElement(ahkVar, ahpVar, z9, ajrVar2, z8, arqwVar2, arqwVar3, z6 & z3));
    }
}
