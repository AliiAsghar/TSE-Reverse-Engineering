package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cru {
    public static final cqq a = new cqq(arnv.a);

    /* compiled from: PG */
    /* renamed from: cru$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 implements PointerInputEventHandler, arrk {
        private final /* synthetic */ arqv a;

        public AnonymousClass1(arqv arqvVar) {
            this.a = arqvVar;
        }

        @Override // defpackage.arrk
        public final armh b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof arrk)) {
                return d.F(this.a, ((arrk) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(crk crkVar, arpe arpeVar) {
            return this.a.a(crkVar, arpeVar);
        }
    }

    public static final cga a(cga cgaVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return cgaVar.a(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }

    @armg
    public static final /* synthetic */ cga b(cga cgaVar, Object obj, arqv arqvVar) {
        return cgaVar.a(new SuspendPointerInputElement(obj, null, null, new AnonymousClass1(arqvVar), 6));
    }

    public static final cga c(cga cgaVar, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return cgaVar.a(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4));
    }
}
