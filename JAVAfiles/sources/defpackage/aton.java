package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aton extends atow {
    private boolean a = true;

    @Override // defpackage.atow
    public final atox a(Type type, Annotation[] annotationArr, atqq atqqVar) {
        if (type == asmp.class) {
            if (atqx.p(annotationArr, atsa.class)) {
                return atom.c;
            }
            return atom.b;
        }
        if (type == Void.class) {
            return atom.f;
        }
        if (this.a && type == arnb.class) {
            try {
                return atom.e;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.atow
    public final atox b(Type type) {
        if (asmk.class.isAssignableFrom(atqx.a(type))) {
            return atom.a;
        }
        return null;
    }
}
